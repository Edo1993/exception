package algTest;

import alg.sort;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

public class algTST {
    @Test
    public void test1() {
        int[] t1 = {70, 35, 45, 23, 25, 7, 4};
        int[] t2 = {4, 7, 23, 25, 35, 45, 70};
        int[] t12 = sort.sorting(t1);
        MatcherAssert.assertThat("Ето так не работаит1",validateMass(t2,t12));
    }

    @Test
    public void test2() {
        int[] t3 = {45, 26, 37, 18, 3, 6, 98};
        int[] t4 = {3, 6, 18, 26, 37, 45, 98};
        int[] t34 = sort.sorting(t3);
        MatcherAssert.assertThat("Ето так не работаит2",validateMass(t4,t34));
    }

    @Test
    public void test3() {
        int[] t5 = {250, 470, 950, 360, 1235, 0, 9500};
        int[] t6 = {0, 250, 360, 470, 950, 1235, 9500};
        int[] t7 = sort.sorting(t5);
        MatcherAssert.assertThat("Ето так не работаит3",validateMass(t6,t7));
    }


    public boolean validateMass(int[] trueMas, int[] checkMas) {
        for (int n = 0; n < trueMas.length; n++) {
            if (trueMas[n] != checkMas[n]) {
                return false;
            }
        }
        return true;
    }
}
