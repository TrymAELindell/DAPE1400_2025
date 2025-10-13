package module8arrays2collections.songs;

import java.util.ArrayList;

public class VoteResults {
    // Let's keep all Votes in an ArrayList
    private ArrayList<Vote> allVotes;

    // Let's make sure the arraylist is created, using the constructor.
    public VoteResults() {
        allVotes = new ArrayList<>();
    }

    /**
     * Method for adding a Vote to allVotes
     */
    public void addVote(Vote vote){
        allVotes.add(vote);
    }

    /**
     * Method for returning how many votes are in allVotes
     */
    public int nrOfVotes(){
        return allVotes.size();
    }

    /**
     * Printing information regarding all votes.
     * We traverse (go through) all Votes in the arraylist using a loop.
     * We delegate the printing to the vote objects themselves.
     */
    public void printAllVotes(){
        for (Vote vote : allVotes) {
            vote.printInfo();
        }
    }

    /**
     * Traversing (going through) all Votes to find (and return) the vote with the highest score.
     */
    public Vote highestScore(){
        // Let's start by setting the highest score to 0
        double highestScore = 0;
        // and the vote to return to null (no object)
        Vote highestVote = null;
        // Going through all votes with a for-each-loop
        for (Vote vote : allVotes) {
            // Checking to see if the current vote has a higher score than the current highest score.
            if(vote.getScore()>highestScore){
                // Found one!
                // I update the object to return as this vote currently has the highest score
                highestVote = vote;
                // I also update the score. This will be the new score to beat.
                highestScore = vote.getScore();
            }
        }
        // I have gone through all votes. I return the one found with the highest score.
        return highestVote;
    }

}
