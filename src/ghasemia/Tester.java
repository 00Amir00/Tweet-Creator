package ghasemia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Program: Developing a class that models tweet program
 *
 * This class name is Tester. It consists of the main.
 *
 * @author Amirmahdi Ghasemi, November 2020
 */
public class Tester {

    public static void main(String[] args) {
        //creating object
        TwitterDB db = new TwitterDB("My Twitter DB");
        // declaring the scanner
        Scanner sc = new Scanner(System.in);
        // importing the Tweet class
        Tweet t;
        //asking user to enter tweets
        for (int i = 0; i < 3; i++) {
            // The program will print the following statement
            System.out.print("Enter User name : ");
            // Storing the userId
            String userId = sc.nextLine();
            // The program will print the following statement
            System.out.print("Enter Date in format (dd/MM/yyyy) : ");
            // Storing the date
            String date = sc.nextLine();
            // The program will print the following statement
            System.out.print("Enter Tweet : ");
            // Storing the tweet
            String tweet = sc.nextLine();
            t = new Tweet(userId, date, tweet);
            // Adding the tweet to the database
            db.addTweet(t);

        }
        // Finding number of tweets
        System.out.println("Size of DB : " + db.getNumberOfTweets());
        // The following statement is a sorted ArrayList 
        ArrayList<Tweet> sorted = db.getSortedTweet();
        // The following statement is going to print all the tweets
        for (Tweet tb : sorted) {
            System.out.println(tb);
        }
        //printing all info
        Tweet ind = db.getTweet(2);
        // The program will print the following statement
        System.out.println("Tweet at Index 2 : " + ind);
        // The program will print the following statement
        System.out.println("All Tweets in Db");
        // The program will print the following statement
        System.out.println("=====================");
        // The program will print the following statement
        System.out.println(db);
        // The program will print the following statement
        Tweet ts = new Tweet("John", "10/12/2016", "Election Day!");
        // The program will print the following statement
        System.out.println("Tweet Ts in Database : " + db.isAlreadyStored(ts));
    }

}// END OF THE PROGRAM
