import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * this class is used to do the test for the Computus
 */
class ComputusTest {
    /**
     * this is the contructor of the test, in this part, I create to int array, that used for the test
     */
    @Test
    public void Test(){
        int [] date = {330,412,404,423,415,331,420,411,327,416,408,323,412,404,424,408,331,420,405,327,416};
        int [] year = {1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017};
        for(int i = 0; i < year.length; i++){
            assertEquals(date[i], new Date(year[i]).getMonth2()*100 + new Date(year[i]).getDay());
        }
    }

}