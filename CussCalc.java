///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// CussCalc.Java
///
/// Author: Ian Michael Terry
///
/// Date: 10-4-2013
///
/// Description: This program requires two inputs: an artist and a song name. Both must be in lowercase with no spaces. Given those two inputs, the program will read in song 
/// lyrics from a website, azlyrics. It will seperate the strings of lyrics into words, and take count of them. If the word is a curse word, it will additionally take count 
/// to a seperate counter. It then calculates the percentage  of curse words in the song by dividing the two counters. The program has built in counters for each individual 
/// curse word so that if the user wanted to, they could retrieve more specific and customized information about the words in the song by adding very few lines of code towards 
/// the end of the program.
///
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////







import java.io.*;    //imports the input/output package
import java.net.*;   //imports the net package
public class CussCalc{  
	public static void main(String args[]){
		
		if(args.length != 2){    //checks for any error in user input and 
				System.out.println("\n"+"\n"+"\n"+"This program requires two inputs: an artist name and a song name. Both must be entered in lowercase with no spaces."+"\n"+"\n");
				return;
			}
		
		try{		          //starts a try catch
			int wordCount=-5; //counter for the number of words, this one is set to -5
			int cussCount=0;  //counter for the number of curses
			
			int assCount=0;    //counters for all of the individual curse words
			int assholeCount=0;
			int bastardCount=0;
			int bitchCount=0;
			int clitCount=0;
			int cockCount=0;
			int cocksuckerCount=0;
			int crapCount=0;
			int cumCount=0;
			int cuntCount=0;
			int damnCount=0;
			int dickCount=0;
			int doucheCount=0;
			int fagCount=0;
			int fuckCount=0;
			int fuckerCount=0;
			int hellCount=0;
			int hoCount=0;
			int homoCount=0;
			int jackassCount=0;
			int motherfuckerCount=0;
			int niggaCount=0;
			int niggerCount=0;
			int pissCount=0;
			int pussyCount=0;
			int retardCount=0;
			int shitCount=0;
			int slutCount=0;
			int titCount=0;
			int twatCount=0;
			int whoreCount=0;
			
			boolean inSong=false; //boolean to determine whether or not the reader is in the lyrics when it is reading the html page
			
			String artist = args[0];  //gets input from the user, the first being the artist and the second being the song name. Both need to be lowercase with no spaces
			String song = args[1];
			
			String computerPoop="<br />";  //Strings to get unnecessary parts of the lyrics removed
			String computerComma=",";
			String computerPeriod=".";
			String computerQuestion="?";
			String computerExclamation="!";
			String computerColon=":";
			String computerSemicolon=";";
			String nothing="";
			
			String[] slice;  //string for the words of the song once they get seperated by spaces
			
			URL lyrics = new URL("http://www.azlyrics.com/lyrics/"+artist+"/"+song+".html");   //defines the url that the program will connect to
			URLConnection uz = lyrics.openConnection();    //connects to the website
			
			 			
			BufferedReader br = new BufferedReader(new InputStreamReader(uz.getInputStream()));   //buffered reader reads the html code from the URLconnection
			String line = br.readLine();   //String that is read in from the buffered reader
			
			
			while (line!=null){  //while loop to trim off the unnecessary characters from the lyrics
				
				
					line=line.replace(computerPoop,nothing);
					line=line.replace(computerComma,nothing);
					line=line.replace(computerPeriod,nothing);
					line=line.replace(computerQuestion,nothing);
					line=line.replace(computerExclamation,nothing);
					line=line.replace(computerColon,nothing);
					line=line.replace(computerSemicolon,nothing);
				
				if(line.equals("<-- start of lyrics -->")){  //turns on a boolean when the reader gets to the lyrics
					inSong=true;
				}
				if(line.equals("<-- end of lyrics -->")){   //turns off a boolean when the reader finishes the lyrics
					inSong=false;
					break;
				}
				if(inSong==true){    //when the reader is in the lyrics
					
					slice=line.split(" ");   //seperates the strings based around spaces
					for(int i=0;i<slice.length; i++){ //for loop to move through the words
						
						wordCount++;  //adds to the word counter whenever a word is encountered
						
						 //the fallowing if statements test to see if a word is equal to a curse or any of its variations
						if(slice[i].equals("ass")||slice[i].equals("asses")||slice[i].equals("Ass")||slice[i].equals("Asses")){ 
							cussCount++;
							assCount++;
							
						}
						if(slice[i].equals("asshole")||slice[i].equals("asseholes")||slice[i].equals("Asshole")||slice[i].equals("Assholes")){
							cussCount++;
							assholeCount++;
							
						}
						if(slice[i].equals("bastard")||slice[i].equals("bastards")||slice[i].equals("Bastard")||slice[i].equals("Bastards")){
							cussCount++;
							bastardCount++;
							
						}
						if(slice[i].equals("bitch")||slice[i].equals("bitches")||slice[i].equals("Bitch")||slice[i].equals("Bitches")||slice[i].equals("bitching")||slice[i].equals("Bitching")||slice[i].equals("bitched")||slice[i].equals("Bitched")){
							cussCount++;
							assholeCount++;
							
						}
						if(slice[i].equals("clit")||slice[i].equals("clits")||slice[i].equals("Clit")||slice[i].equals("Clits")){
							cussCount++;
							clitCount++;
							
						}
						if(slice[i].equals("cock")||slice[i].equals("cocks")||slice[i].equals("Cock")||slice[i].equals("Cocks")){
							cussCount++;
							cockCount++;
							
						}
						if(slice[i].equals("cocksucker")||slice[i].equals("cocksuckers")||slice[i].equals("Cocksucker")||slice[i].equals("Cocksuckers")||slice[i].equals("cocksucking")||slice[i].equals("Cocksucking")){
							cussCount++;
							cocksuckerCount++;
							
						}
						if(slice[i].equals("crap")||slice[i].equals("craps")||slice[i].equals("Crap")||slice[i].equals("Craps")||slice[i].equals("crapping")||slice[i].equals("Crapping")||slice[i].equals("crapped")||slice[i].equals("Crapped")){
							cussCount++;
							crapCount++;
							
						}
						if(slice[i].equals("cunt")||slice[i].equals("cunts")||slice[i].equals("Cunt")||slice[i].equals("Cunts")){
							cussCount++;
							cuntCount++;
							
						}
						if(slice[i].equals("cum")||slice[i].equals("cums")||slice[i].equals("Cum")||slice[i].equals("Cums")||slice[i].equals("cumming")||slice[i].equals("Cumming")){
							cussCount++;
							cumCount++;
							
						}
						if(slice[i].equals("damn")||slice[i].equals("damns")||slice[i].equals("Damn")||slice[i].equals("Damns")||slice[i].equals("dammit")||slice[i].equals("Dammit")){
							cussCount++;
							damnCount++;
							
						}
						if(slice[i].equals("dick")||slice[i].equals("dicks")||slice[i].equals("Dick")||slice[i].equals("Dicks")||slice[i].equals("dicking")||slice[i].equals("Dicking")){
							cussCount++;
							dickCount++;
							
						}
						if(slice[i].equals("douche")||slice[i].equals("douches")||slice[i].equals("Douche")||slice[i].equals("Douches")||slice[i].equals("douchebag")||slice[i].equals("douchebags")||slice[i].equals("Douchebag")||slice[i].equals("Douchebags")){
							cussCount++;
							doucheCount++;
							
						}
						if(slice[i].equals("fag")||slice[i].equals("fags")||slice[i].equals("Fag")||slice[i].equals("Fags")||slice[i].equals("faggot")||slice[i].equals("faggots")||slice[i].equals("Faggot")||slice[i].equals("Faggots")){
							cussCount++;
							fagCount++;
							
						}
						if(slice[i].equals("fuck")||slice[i].equals("fucks")||slice[i].equals("Fuck")||slice[i].equals("Fucks")||slice[i].equals("fucking")||slice[i].equals("Fucking")||slice[i].equals("fucked")||slice[i].equals("Fucked")){
							cussCount++;
							fuckCount++;
							
						}
						if(slice[i].equals("fucker")||slice[i].equals("fuckers")||slice[i].equals("Fucker")||slice[i].equals("Fuckers")){
							cussCount++;
							fuckerCount++;
							
						}
						if(slice[i].equals("hell")||slice[i].equals("hells")||slice[i].equals("Hell")||slice[i].equals("Hells")){
							cussCount++;
							hellCount++;
							
						}
						if(slice[i].equals("ho")||slice[i].equals("hos")||slice[i].equals("Ho")||slice[i].equals("Hos")||slice[i].equals("hoes")||slice[i].equals("Hoes")){
							cussCount++;
							hoCount++;
							
						}
						if(slice[i].equals("homo")||slice[i].equals("homos")||slice[i].equals("Homo")||slice[i].equals("Homos")){
							cussCount++;
							homoCount++;
							
						}
						if(slice[i].equals("jackass")||slice[i].equals("jackasses")||slice[i].equals("Jackass")||slice[i].equals("Jackasses")){
							cussCount++;
							jackassCount++;
							
						}
						if(slice[i].equals("piss")||slice[i].equals("pisses")||slice[i].equals("Piss")||slice[i].equals("Pisses")||slice[i].equals("pissed")||slice[i].equals("Pissed")||slice[i].equals("pissing")||slice[i].equals("Pissing")){
							cussCount++;
							pissCount++;
							
						}
						if(slice[i].equals("pussy")||slice[i].equals("pussies")||slice[i].equals("Pussy")||slice[i].equals("Pussies")){
							cussCount++;
							pussyCount++;
							
						}
						if(slice[i].equals("motherfucker")||slice[i].equals("motherfuckers")||slice[i].equals("Motherfucker")||slice[i].equals("Motherfuckers")||slice[i].equals("mothafucka")||slice[i].equals("muthafukas")|
slice[i].equals("Mothafuka")||slice[i].equals("mothafucka")||slice[i].equals("Mothafucka")||slice[i].equals("Mothafuckas")||slice[i].equals("Mothafucka")){
							cussCount++;
							motherfuckerCount++;
							
						}
						if(slice[i].equals("nigga")||slice[i].equals("niggas")||slice[i].equals("Nigga")||slice[i].equals("Niggas")||slice[i].equals("Niggaz")||slice[i].equals("niggaz")){
							cussCount++;
							niggaCount++;
							
						}
						if(slice[i].equals("nigger")||slice[i].equals("niggers")||slice[i].equals("Nigger")||slice[i].equals("Niggers")){
							cussCount++;
							niggerCount++;
							
						}
						if(slice[i].equals("retard")||slice[i].equals("retards")||slice[i].equals("Retards")||slice[i].equals("Retard")||slice[i].equals("Retarded")||slice[i].equals("retarded")){
							cussCount++;
							retardCount++;
						}
						if(slice[i].equals("shit")||slice[i].equals("shits")||slice[i].equals("Shit")||slice[i].equals("Shits")||slice[i].equals("shitting")||slice[i].equals("Shitting")||slice[i].equals("shitted")||slice[i].equals("Shitted")||slice[i].equals("Shitter")||slice[i].equals("shitter")){
							cussCount++;
							shitCount++;
							
						}
						if(slice[i].equals("slut")||slice[i].equals("sluts")||slice[i].equals("Slut")||slice[i].equals("Sluts")){
							cussCount++;
							slutCount++;
							
						}
						if(slice[i].equals("tit")||slice[i].equals("tits")||slice[i].equals("Tit")||slice[i].equals("Tits")||slice[i].equals("titties")||slice[i].equals("Titties")||slice[i].equals("titty")||slice[i].equals("Titty")){
							cussCount++;
							titCount++;
							
						}
						if(slice[i].equals("twat")||slice[i].equals("twats")||slice[i].equals("Twat")||slice[i].equals("Twats")){
							cussCount++;
							twatCount++;
							
						}
						if(slice[i].equals("whore")||slice[i].equals("whores")||slice[i].equals("Whore")||slice[i].equals("Whores")||slice[i].equals("whored")||slice[i].equals("Whored")||slice[i].equals("whoring")){
							cussCount++;
							whoreCount++;
							
						}
					
					}
				}
						
					
				line = br.readLine();	//moves the buffered reader to the next line	
			}
			double cursePercent=((double)cussCount / (double)wordCount) ; //calculates the number of curse words
			System.out.println("\n"+"\n"+"\n"+"This song has "+wordCount +" words"); //Prints out the word count, curse count, and percentage of curses
			System.out.println("\n"+"This song has "+cussCount +" curses");
			System.out.println("\n"+"This song is "+ cursePercent*100 +"% curses."+"\n"+"\n");
			br.close();
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
	}

}




