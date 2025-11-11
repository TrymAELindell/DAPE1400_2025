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
        double highestScore = 0;
        Vote highestVote = null;
        for (Vote vote : allVotes) {
            if(vote.getScore()>highestScore){
                highestVote = vote;
                highestScore = vote.getScore();
            }
        }
        return highestVote;
    }

}
