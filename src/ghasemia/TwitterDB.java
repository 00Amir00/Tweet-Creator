package ghasemia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * Program: Developing a class that models tweet program
 *
 * This class name is TwitterDB. It consists of 2 fields, 1 constructor, and
 * getter-setter of the fields.
 *
 * @author Amirmahdi Ghasemi, November 2020
 */
public class TwitterDB {

    /*
      This is a private String, and its name is comment.
      It does not have a default value.
     */
    private String comment;
    /*
      This is a private ArrayList, and its name is tweets.
      It does not have a default value.
     */
    private ArrayList<Tweet> tweets;

    /*
      This is a default constructor of TwitterDB class, and it contains 1
      parameter that you can find them here. It is gonna make an ArrayList.
     
     @param comment
     */
    public TwitterDB(String comment) {
        setComment(comment);
        tweets = new ArrayList<Tweet>();
    }

    /*
      This method gets the getComment that was entered by the user, and it does
      not have a value.
     
      @return String
     */
    public String getComment() {
        return comment;
    }

    /*
     Creates a new comment with a given comment, and the only condition is
     the given comment cannot be null or empty. If the userID is empty or null, it will
     throw an exception.
    
     @param comment
     */
    public void setComment(String comment) {
        if (comment.trim().isEmpty()) {
            throw new IllegalArgumentException("The comment cannot be empty");
        } else {
            this.comment = comment;
        }
    }

    /*
      This method gets the getTweets that was entered by the user, and it does
      not have a value.
     
      @return ArrayList
     */
    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    /*
     Creates a new tweets with a given tweets
    
     @param tweets
     */
    public void setTweets(ArrayList<Tweet> tweets) {
        this.tweets = tweets;
    }

    /*
     Add a new tweet with a given tweet to the ArrayList
    
     @param tweets
     */
    public void addTweet(Tweet tweet) {
        tweets.add(tweet);
    }

    /*
      This method gets the getNumberOfTweets that was entered by the user
     
      @return int
     */
    public int getNumberOfTweets() {
        return tweets.size();
    }

    /*
      This method gets the getTweet that was entered by the user
     
      @param i
      @return Tweet
     */
    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    /*
      This method gets the getSortedTweet that was entered by the user
     
      @return Tweet
     */
    public ArrayList<Tweet> getSortedTweet() {
        ArrayList<Tweet> t = new ArrayList<Tweet>(tweets);
        Collections.sort(t, Comparator.comparing(Tweet::getDate));
        return t;
    }

    /*
      This method checks the ArrayList has been entered by the user, is already sorted or not.
     
      @return boolean
     */
    public boolean isAlreadyStored(Tweet t) {
        return t.equals(tweets);
    }

    /*
      This method gets the String that was entered by the user, and it does
      not have a value.
     
      @return String
     */
    @Override
    public String toString() {
        String data = "";
        for (Tweet t : tweets) {
            data = data + t.toString() + "\n\n";
        }
        return data;

    }

}
