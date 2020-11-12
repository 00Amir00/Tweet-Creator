package ghasemia;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * Program: Developing a class that models tweet program
 *
 * This class name is Tweet. It consists of 3 fields, 1 constructor, and
 * getter-setter of the fields.
 *
 * @author Amirmahdi Ghasemi, November 2020
 */
public class Tweet implements Comparable<Tweet> {

    /*
      This is a private String, and its name is userID.
      It does not have a default value.
     */
    private String userID;
    /*
      This is a private Date, and its name is date.
      It does not have a default value.
     */
    private Date date;
    /*
      This is a private String, and its name is tweet.
      It does not have a default value.
     */
    private String tweet;

    /*
      This is a default constructor of Tweet class, and it contains 3
      parameters that you can find them here.
     
     @param userID
     @param dateTime
     @param tweet
     */
    public Tweet(String userID, String dateTime, String tweet) {
        setUserID(userID);
        setDate(dateTime);
        setTweet(tweet);

    }

    /*
      This method gets the getUserID that was entered by the user, and it does
      not have a value.
     
      @return String
     */
    public String getUserID() {
        return userID;
    }

    /*
     Creates a new userID with an userID, and the only condition is
     the userID cannot be null or empty. If the userID is empty or null, it will
     throw an exception.
    
     @param userID 
     */
    public void setUserID(String userID) {
        if (userID.trim().isEmpty()) {
            throw new IllegalArgumentException("The user ID cannot be empty");
        } else {
            this.userID = userID;
        }
    }

    /*
      This method gets the getDate that was entered by the user, and it does
      not have a value.
     
      @return Date
     */
    public Date getDate() {
        return date;
    }

    /*
     Creates a new date with a date, and the only condition is
     the date cannot be null or empty. If the date is empty or null, it will
     throw an exception. It is gonna be parse the string to the date type.
    
     @param date
     */
    public void setDate(String date) {
        try {
            this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /*
      This method gets the tweet that was entered by the user, and it does
      not have a value.
     
      @return String
     */
    public String getTweet() {
        return tweet;
    }

    /*
     Creates a new tweet with a tweet, and the only condition is
     the tweet cannot be null or empty. If the text is empty or null, it will
     throw an exception.
    
     @param tweet
     */
    public void setTweet(String tweet) {
        if (tweet.trim().isEmpty()) {
            throw new IllegalArgumentException("The tweet cannot be empty");
        } else {
            this.tweet = tweet;
        }
    }

    /*
      This method gets the String that was entered by the user, and it does
      not have a value.
     
      @return String
     */
    @Override
    public String toString() {
        return "User ID : " + userID + "\nDate : " + date + "\nTweet : " + tweet;
    }

    /*
      This method gets the equals that was entered by the user, and it does
      not have a value.
     
      @return boolean
     */
    public boolean equals(Tweet t) {
        return t.tweet.equalsIgnoreCase(this.tweet);
    }

    /*
      This method gets the int that was entered by the user, and it does
      not have a value.
     
      @return int
     */
    @Override
    public int compareTo(Tweet o) {
        return o.date.compareTo(date);
    }
}
