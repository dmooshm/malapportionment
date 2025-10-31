public class dataAnalysis {

public static final data[] state = data.getData();

    public static String findWastedVotes() { //under asssumption that votes not cast for winner AND those in excess are 

        int wvD = 0;
        int wvR = 0;

        for (int i = 0; i < data.stateNumber; i++) {

            int dv = state[i].getdv();
            int rv = state[i].getrv();
            int deltav = Math.abs(dv-rv);

            if (state[i].getWinner() == 0) { //democrat victory

                wvD += deltav - 1;
                wvR += rv;

            }

            if (state[i].getWinner() == 1) { //republican victory

                wvR += deltav - 1;
                wvD += dv;

            }
            
        }

        String wastedVotes = "Wasted Democrat Votes:" + wvD + ", Wasted Republican Votes:" + wvR;

        return wastedVotes;

    }

    public static String findMalapportionment() {

        int sumvotes;
        int whichStateBig = 0;
        int whichStateSmall = 0;
        int biggest = 0;
        int smallest = 1000000000;

        for (int i = 0; i < data.stateNumber; i++) {

            sumvotes = state[i].dv + state[i].rv;

            if (sumvotes > biggest) {

                biggest = sumvotes;
                whichStateBig = i;

            } else if (sumvotes < smallest) {

                smallest = sumvotes;
                whichStateSmall = i;

            }

        }

        int ratio = biggest/smallest;

        String malapportionment = "Ratio of votes per seat smallest:largest = " + ratio + "; smallest state/largest state " + whichStateSmall + " | " + whichStateBig;

        return malapportionment;

    }
    
    public static String findStateDisproportionality() { //average percentage of votes in state to win seat

        int popPctWD = 0;
        int storeD = 0;
        int stateDisproportionalityD = 0;
        int a = 0;

        int popPctWR = 0;
        int storeR = 0;
        int stateDisproportionalityR = 0;
        int b = 0;

        int AvgStateDisproportionality = 0;

        int sumvotes;

        for (int i = 0; i < data.stateNumber; i++) {

            sumvotes = state[i].dv + state[i].rv;

            if (state[i].getWinner() == 0) {

                popPctWD = 100 * state[i].dv / sumvotes;
                a++;
                storeD += popPctWD;

            } else {

                popPctWR = 100 * state[i].rv / sumvotes;
                b++;
                storeR += popPctWR;

            }

        }

        stateDisproportionalityD = storeD / a;
        stateDisproportionalityR = storeR / b;
        AvgStateDisproportionality = (storeD + storeR) / (a+b);

        String stateDisproportionality = "Democrat average percentage of vote to win seat: " + stateDisproportionalityD + "% Republican average: " + stateDisproportionalityR + "% National average: " + AvgStateDisproportionality + "%";

        return stateDisproportionality;

    }

    public static String findNationalDisproportionality() { //% seats taken to % popular vote

        int seatsD = 0;
        int pctSeatsD = 0;

        int seatsR = 0;
        int pctSeatsR = 0;

        double votesD = 0;
        double pctVotesD = 0;
        
        double votesR = 0;
        double pctVotesR = 0;

        for (int i = 0; i < data.stateNumber; i++) {

            if (state[i].getWinner() == 0) {

                seatsD++;

                votesD += state[i].dv;

            } else {

                seatsR++;

                votesR += state[i].rv;

            }

        }

        pctSeatsD = 100 * seatsD / data.stateNumber;
        pctSeatsR = 100 * seatsR / data.stateNumber;

        pctVotesD = (100.0 * votesD) / (votesD + votesR);
        pctVotesR = (100.0 * votesR) / (votesD + votesR);

        String nationalDisproportionality = "Democrat seat occupation percentage to popular vote percentage: " + pctSeatsD + "%:" + pctVotesD + "% Republican: " + pctSeatsR + "%:" + pctVotesR + "%";

        return nationalDisproportionality; 

    }

    public static int findVoteTotal() {

        int voteTotal = 0;

        for (int i = 0; i < data.stateNumber; i++) {

            voteTotal += state[i].dv + state[i].rv;

        }

        return voteTotal;

    }

}
