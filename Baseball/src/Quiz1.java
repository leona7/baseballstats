public class Quiz1 {
// Prompt user for player name, AB, H, 2B, 3B, HR, R and BB
//AB - At bats
//H - Hits
//2B - doubles
//3B - triples
//HR - Home Runs
//R - Runs
//BB - Walks
	private String Player_Name;
	private int AB;
	private int H;
	private int Two_B;
	private int Three_B;
	private int HR;
	private int R;
	private int BB;

	public Quiz1( int ab, int hits, int two_b, int three_b, int hr, int r, int bb) {
		super();

		AB = ab;
		H = hits;
		Two_B = two_b;
		Three_B = three_b;
		HR = hr;
		R = r;
		BB = bb;
	}
	
// Setters and getters for variables 
	public String getPlayer_Name () {
		return Player_Name;
	}
	public void setPlayer_Name(String player_name) {
		Player_Name=player_name;
	}
	public int getAB() {
		return AB;
	}

	public void setAB(int ab) {
		AB=ab;
	}
	public int getH() {
		return H;
	}
	public void setH(int hits) {
		H = hits;
	}
	public int getTwo_B() {
		return Two_B;
	}
	public void setTwo_B(int two_b) {
		Two_B=two_b;
	}

	public int getThree_B() {
		return Three_B;
	}

	public void setThree_B(int three_b) {
		Three_B = three_b;
	}
	public int getHR() {
		return HR;
	}	
	public void setHR (int hr) {
		HR=hr;
	}
	public int getR() {
		return R;
	}
	public void setR (int r) {
		R=r;
	}
	public int getBB() {
		return BB;
	}
	public void set(int bb) {
		BB=bb;
	}
// Calculations
//BA-Batting Average
//OBP- On base percentage
//SLG- Slugging percentage
//OPS-On base + slugging percentage  
//TB- Total bases
	double BA = H/AB;
	//calculate batting average by hits divided by at bats
	double OBP = (H+BB)/(AB+BB);
	//calculate on base percentage by (hits+walks)/(at bats+walks)
	double SLG = ((H-Two_B-Three_B-HR)+(Two_B*2)+(Three_B*3)+(HR*4))/AB;
	//calculate slugging percentage by ((single hits)+ (double hits*2) + (triple hits*3) + (home runs*4))/ (at bats)
	double OPS = (OBP+SLG);
	//calculate On base slugging percentage by  (On base percentage) + (Slugging percentage)
	double TB = ((H-Two_B-Three_B-HR)+(Two_B*2)+(Three_B*3)+(HR*4));
	//Calculate total bases by (single hits) + (Double hits*2)+ (triple hits*4) + (home runs * 4)
//Method to print Stats:
public void print_MyStats () {
	System.out.println( Player_Name +" Stats: ");
	System.out.println("Batting Average: "+BA);
	System.out.println("On Base Percentage: "+OBP);
	System.out.println("Slugging Percentage: "+SLG);
	System.out.println("On Base Percentage + Slugging Percentage :"+OPS);
	System.out.println("Total Bases:"+TB);	
}
}