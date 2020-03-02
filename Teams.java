public class Teams{
public int seed; // MNCAATourneySeeds.csv
public double winPercentage; 
public int previousPlacement;
public int PPG;
public int PAPG;
public String teamName;
public String teamID;
public int wins;
public int losses;
public Teams(String teamName, String teamID, int seed){
  this.teamName = teamName;
  this.teamID = teamID;
  this.seed = seed;
  this.wins = wins;
  this.losses = wins;
  //this.previousWins = previousWins;
}

// Get a team's Win/Loss Ratio                                          MRegularSeasonCompactResults.csv
  //public void double calcWinRate(int a /* teamID */)
  //{

    // pseudocode to get the win % of a team
    /*
      Condition(s): Use data from 17-19

      for loop:
        search for a = LTeamID, l++
        search for a = WTeamID, w++

        return w/l
    */

      // loads team file
        // user imput of teams, in order of seeding and East, South, Midwest, west
    // all things data input related
    
    
    /*String[] teamName = new String[64];
    ArrayList teamList = new ArrayList();
    gameNum = input.nextLine().split(",");

    File fileGames = new File("../data/MRegularSeasonCompactResults.csv");
    
    // Scanner to scan the file
    String lineValue = "";
    Scanner readScanner = new Scanner(fileGames);
    lineValue = readScanner.nextLine();
    String games[] = new String[16264];
    // read the file's contents line by line
    while (readScanner.hasNextLine()) {
      lineValue = readScanner.nextLine();
      games = lineValue.split(",");
      for(int x = 0; x < gameNum.length; x++){
        if(gameNum[x].equalsIgnoreCase(teams[1])) {
          teamID[x] = teams[0];
        */
        //}
      
      //return 0;
      //}
    //return .5;//random so code works
  //}

  // Find teams pts/game
  //public int avgPtsCalc(int a /* teamID */)
  //{
    /*

    //  Search for teamID throughout file
     // If WTeamID -> add WScore to PtsTotal
      //  ->  games++
     // If LTeamID -> add LScore to PtsTotal 
      //  ->  games++

     // return Ptstotal/games
   // */
  //}

  // Find previous championships won

 // public int previousWon(int a /* teamID */)
  //{
    
 // }


//}
}