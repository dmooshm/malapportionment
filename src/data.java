public class data {

    int winner;
    int dv;
    int rv;
    int iv;

    public data(int winner, int dv, int rv)  {

        this.winner = winner;
        this.dv = dv;
        this.rv = rv;

    }

    public static final int stateNumber = 32;

    public static data[] getData() {

        data[] stateInfo = new data[stateNumber]; //excludes special elections; independent votes do not count toward sum

        stateInfo[0] = new data(0, 2252577, 1549187); //washington
        stateInfo[1] = new data(0, 9036252, 6312594); //california
        stateInfo[2] = new data(0, 701105, 677046); //nevada
        stateInfo[3] = new data(1, 276305, 319682); //montana
        stateInfo[4] = new data(1, 63727, 198418); //wyoming
        stateInfo[5] = new data(1, 464515, 914700); //utah
        stateInfo[6] = new data(0, 1676335, 1595761); //arizona
        stateInfo[7] = new data(0, 497333, 405978); //new mexico
        stateInfo[8] = new data(1, 121602, 241569); //north dakota
        stateInfo[9] = new data(1, 436493, 499124); //nebraska; independent counted as democrat
        stateInfo[10] = new data(1, 5031249, 5990741); //texas
        stateInfo[11] = new data(0, 1792441, 1291712); //minnesota
        stateInfo[12] = new data(1, 1243728, 1651907); //missouri
        stateInfo[13] = new data(1, 1027461, 1918743); //tennessee
        stateInfo[14] = new data(1, 451981, 763420); //mississippi
        stateInfo[15] = new data(0, 1672777, 1643996); //wisconsin
        stateInfo[16] = new data(0, 2712686, 2693680); //michigan
        stateInfo[17] = new data(1, 1097061, 1659416); //indiana
        stateInfo[18] = new data(1, 2650949, 2857383); //ohio
        stateInfo[19] = new data(1, 4603077, 5977706); //florida
        stateInfo[20] = new data(1, 207548, 514079); //west virginia
        stateInfo[21] = new data(0, 2415429, 2018992); //virginia
        stateInfo[22] = new data(0, 283298, 197753); //delaware
        stateInfo[23] = new data(0, 1650912, 1294344); //maryland
        stateInfo[24] = new data(1, 3384180, 3399295); //pennsylvania
        stateInfo[25] = new data(0, 2161491, 1773589); //new jersey
        stateInfo[26] = new data(0, 4711298, 3246114); //new york
        stateInfo[27] = new data(0, 1000695, 678256); //connecticuit
        stateInfo[28] = new data(0, 294665, 196039); //rhode island
        stateInfo[29] = new data(0, 2041668, 1365440); //massachusetts
        stateInfo[30] = new data(0, 229429, 116512); //vermont; independent counted as democrat due to affiliattion
        stateInfo[31] = new data(0, 427570, 284434); //maine; independent counted as democrat due to affiliattion

        return stateInfo;

    }

    int getWinner() {

        return winner;

    }

    int getdv() {

        return dv;

    }

    int getrv() {

        return rv;

    }

    int getiv() {

        return this.iv;

    }

}