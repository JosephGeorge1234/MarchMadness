
import java.util.*; 
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException{
    // user imput of teams, in order of seeding and East, South, Midwest, west
    // all things data input related
    Scanner input = new Scanner(System.in);
    String[] teamName = new String[64];
    String[] teamID = new String[1000];
    ArrayList teamList = new ArrayList();
    System.out.println("Input the team names, 1 through 16 divided by commas, for the East division (Bottom right), South (Top right), West (bottom left), Midwest (top left)");
    teamName = input.nextLine().split(",");

    // end of data input

    // loads team file
    File fileTeams = new File("../data/MTeams.csv");
    
    // Scanner to scan the file
    String lineValue = "";
    Scanner readScanner = new Scanner(fileTeams);
    lineValue = readScanner.nextLine();
    String teams[] = new String[1000];
    // read the file's contents line by line
    while (readScanner.hasNextLine()) {
      lineValue = readScanner.nextLine();
      teams = lineValue.split(",");
      for(int x = 0; x < teamName.length; x++){
        if(teamName[x].equalsIgnoreCase(teams[1])) {
          teamID[x] = teams[0];
        }
      }
      
    }
   
   for(int j = teamName.length; j > -1; --j){
     Teams team = new Teams(teamName[j], teamID[j], j);
      teamList.add(team);
   }
   //difference between seeds
   //PPG - PAPG q1
   //win%
   //previous placement
  //while(teamList.size()!= 1){
  //for(int k = 0; k < teamList.size()/2; k++){
   //match(teamList.get(k), teamList.get(k+1));
    
  //}
  //}


  //compare
 
  

  } // end of psvm method

} // end of class