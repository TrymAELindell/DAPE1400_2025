package module8arrays2collections.songs;

public class Main {
    public static void main(String[] args) {
        // Creating an object holding all votes given
        VoteResults voteResults = new VoteResults();
        // Creating a couple of votes. Must use constructor (String,String,double) as it is the only constructor in the class.
        Vote vote1 = new Vote("I'd rather dance with you", "Kings of Convenience", 8.2);
        Vote vote2 = new Vote("Elastic heart", "Sia", 8.6);
        //VoteResults offer a method adding a vote to the colletion of votes.
        voteResults.addVote(vote1);
        // It also offers a method telling the caller (of the method) how many votes are in.
        int currentNrOfVotes = voteResults.nrOfVotes();
        // Testing number of votes. Expecting 1 as I have only added 1 vote.
        System.out.println("Current number of votes:"+currentNrOfVotes);
        // Adding another vote
        voteResults.addVote(vote2);
        // Calling nrOfVotes again
        currentNrOfVotes = voteResults.nrOfVotes();
        // Testing number of votes again. Expecting 2 as I have added another vote.
        System.out.println("Current number of votes:"+currentNrOfVotes);
        // Testing the printAllVotes method. Expecting info regarding my two added votes to appear.
        voteResults.printAllVotes();
        // Testing the method providing the vote with the highest score
        Vote vote = voteResults.highestScore();
        System.out.println("Highest score:");
        vote.printInfo();
    }

}
