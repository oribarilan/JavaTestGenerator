import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        Calculator calculator0 = new Calculator();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.subtract(1820.0d, 101.0d);
        double d12 = maths0.divide(1719.0d, (double) '#');
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1719.0d);
        org.junit.Assert.assertTrue(d12 == 49.114285714285714d);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((-101.0d), 49.114285714285714d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == (-1.6283483384592895E98d));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.multiply((-101.0d), (double) (-1L));
        double d15 = maths0.subtract((double) 0, (-100.0d));
        double d18 = maths0.divide((double) 0, (double) ' ');
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 101.0d);
        org.junit.Assert.assertTrue(d15 == 100.0d);
        org.junit.Assert.assertTrue(d18 == 0.0d);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.subtract((-1.0d), (double) 0);
        double d9 = maths0.power((-1.0d), (double) 100.0f);
        double d12 = maths0.multiply((double) 100L, 3.6028797018963968E16d);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == (-1.0d));
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d12 == 3.6028797018963968E18d);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.subtract((-1.0d), (double) 0);
        double d9 = maths0.power((-1.0d), (double) 100.0f);
        double d12 = maths0.subtract((-1921.0d), (-1.6283483384592895E98d));
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == (-1.0d));
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d12 == 1.6283483384592895E98d);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.subtract((-1.0d), (double) 0);
        double d9 = maths0.power((-1.0d), (double) 100.0f);
        double d12 = maths0.power((double) ' ', 11.0d);
        double d15 = maths0.add((double) (byte) 100, 1719.0d);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == (-1.0d));
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d12 == 3.6028797018963968E16d);
        org.junit.Assert.assertTrue(d15 == 1819.0d);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.subtract((-1.0d), (double) 0);
        double d9 = maths0.power((-1.0d), (double) 100.0f);
        double d12 = maths0.multiply((double) (short) 100, 1819.0d);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == (-1.0d));
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d12 == 181900.0d);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.add((-1.03125d), 10.0d);
        double d15 = maths0.power((double) 0, (double) 10.0f);
        double d18 = maths0.multiply(1.0d, (double) (short) 1);
        double d21 = maths0.power(1.0463951242053392E298d, (double) 100L);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 8.96875d);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertTrue(d21 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Maths maths0 = new Maths();
        double d3 = maths0.multiply(0.0d, (double) (byte) 1);
        double d6 = maths0.add((-0.03125d), (double) (-1L));
        double d9 = maths0.divide((-0.0103125d), (double) 100);
        double d12 = maths0.add(181900.0d, 0.0d);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(d6 == (-1.03125d));
        org.junit.Assert.assertTrue(d9 == (-1.03125E-4d));
        org.junit.Assert.assertTrue(d12 == 181900.0d);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Maths maths0 = new Maths();
        double d3 = maths0.add((double) (byte) 1, (double) 100L);
        double d6 = maths0.power(1729.0d, (double) (short) 10);
        org.junit.Assert.assertTrue(d3 == 101.0d);
        org.junit.Assert.assertTrue(d6 == 2.3875360220377774E32d);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.multiply((double) (byte) 10, (-2.0d));
        double d12 = maths0.divide((double) 1.0f, (double) (-1L));
        double d15 = maths0.divide((-2.0d), (double) (short) 100);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-20.0d));
        org.junit.Assert.assertTrue(d12 == (-1.0d));
        org.junit.Assert.assertTrue(d15 == (-0.02d));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.multiply((double) (byte) 10, (-2.0d));
        double d12 = maths0.divide((double) (short) 1, (double) ' ');
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-20.0d));
        org.junit.Assert.assertTrue(d12 == 0.03125d);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.subtract(1820.0d, 101.0d);
        double d12 = maths0.multiply((-2.0d), (double) (byte) 0);
        double d15 = maths0.add(3.6028797018963968E16d, (double) 10);
        double d18 = maths0.divide((-0.03125d), 2.7755575615628914E-17d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1719.0d);
        org.junit.Assert.assertTrue(d12 == (-0.0d));
        org.junit.Assert.assertTrue(d15 == 3.6028797018963976E16d);
        org.junit.Assert.assertTrue(d18 == (-1.125899906842624E15d));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.add((-1.03125d), 10.0d);
        double d15 = maths0.power((double) 0, (double) 10.0f);
        double d18 = maths0.multiply(1.0d, (double) (short) 1);
        double d21 = maths0.add((-1.0d), 1729.0d);
        double d24 = maths0.multiply((double) 0.0f, 8.96875d);
        double d27 = maths0.power(101.0d, (double) (-1L));
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 8.96875d);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertTrue(d21 == 1728.0d);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(d27 == 101.0d);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.add((-1.03125d), 10.0d);
        double d15 = maths0.power((double) 0, (double) 10.0f);
        double d18 = maths0.power((double) (-1), (double) 0.0f);
        double d21 = maths0.power(101.0d, (-1921.0d));
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 8.96875d);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue(d18 == (-1.0d));
        org.junit.Assert.assertTrue(d21 == 101.0d);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.subtract((-1.0d), (double) 0);
        double d9 = maths0.power((-1.0d), (double) 100.0f);
        double d12 = maths0.multiply(1.0463951242053392E298d, 1.0d);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == (-1.0d));
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d12 == 1.0463951242053392E298d);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.subtract((double) (short) 100, 3.6028797018963976E16d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == (-3.6028797018963876E16d));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.subtract(1820.0d, 101.0d);
        double d12 = maths0.multiply((-2.0d), (double) (byte) 0);
        double d15 = maths0.divide(3.6028797018963976E16d, (double) '4');
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1719.0d);
        org.junit.Assert.assertTrue(d12 == (-0.0d));
        org.junit.Assert.assertTrue(d15 == 6.928614811339226E14d);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.subtract((double) (byte) 10, 0.0d);
        double d12 = maths0.multiply((-1.03125E-4d), (-1.0463951242053392E298d));
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 10.0d);
        org.junit.Assert.assertTrue(d12 == 1.079094971836756E294d);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.subtract(1820.0d, 101.0d);
        double d12 = maths0.multiply((-2.0d), (double) (byte) 0);
        double d15 = maths0.power((-1.03125E-5d), Double.NaN);
        double d18 = maths0.divide(1.6283483384592895E98d, (-1.0463951242053392E298d));
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1719.0d);
        org.junit.Assert.assertTrue(d12 == (-0.0d));
        org.junit.Assert.assertTrue(d15 == (-1.03125E-5d));
        org.junit.Assert.assertTrue(d18 == (-1.556150540835042E-200d));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Maths maths0 = new Maths();
        double d3 = maths0.multiply(0.0d, (double) (byte) 1);
        double d6 = maths0.add((-0.03125d), (double) (-1L));
        double d9 = maths0.multiply((double) (byte) 100, (double) (-1L));
        double d12 = maths0.subtract((double) (byte) 0, (double) 100);
        double d15 = maths0.divide(1820.0d, (double) 100L);
        double d18 = maths0.power((-0.03125d), 152.0d);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(d6 == (-1.03125d));
        org.junit.Assert.assertTrue(d9 == (-100.0d));
        org.junit.Assert.assertTrue(d12 == (-100.0d));
        org.junit.Assert.assertTrue(d15 == 18.2d);
        org.junit.Assert.assertTrue(d18 == 1.6489340850168661E-229d);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.subtract((-1.0d), (double) 0);
        double d9 = maths0.power((-1.0d), (double) 100.0f);
        double d12 = maths0.power((double) ' ', 11.0d);
        double d15 = maths0.power((double) ' ', (double) 100);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == (-1.0d));
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d12 == 3.6028797018963968E16d);
        org.junit.Assert.assertTrue(d15 == 3.273390607896142E150d);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.multiply((double) (byte) 100, (double) 0);
        double d9 = maths0.add(1820.0d, (double) 100);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1920.0d);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.subtract(1820.0d, 101.0d);
        double d12 = maths0.multiply((-2.0d), (double) (byte) 0);
        double d15 = maths0.divide(18.2d, (double) (byte) 1);
        double d18 = maths0.subtract(8.96875d, 152.0d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1719.0d);
        org.junit.Assert.assertTrue(d12 == (-0.0d));
        org.junit.Assert.assertTrue(d15 == 18.2d);
        org.junit.Assert.assertTrue(d18 == (-143.03125d));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.add((-1.03125d), 10.0d);
        double d15 = maths0.power((double) 0, (double) 10.0f);
        double d18 = maths0.multiply(1.0d, (double) (short) 1);
        double d21 = maths0.multiply(1729.0d, 1728.0d);
        double d24 = maths0.subtract(1.0E16d, 2.3875360220377774E32d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 8.96875d);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertTrue(d21 == 2987712.0d);
        org.junit.Assert.assertTrue(d24 == (-2.3875360220377774E32d));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.multiply((-101.0d), (double) (-1L));
        double d15 = maths0.subtract((double) 0, (-100.0d));
        double d18 = maths0.divide((double) (short) 100, 3.6028797018963968E18d);
        double d21 = maths0.add((double) (-1), 1854.0d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 101.0d);
        org.junit.Assert.assertTrue(d15 == 100.0d);
        org.junit.Assert.assertTrue(d18 == 2.7755575615628914E-17d);
        org.junit.Assert.assertTrue(d21 == 1853.0d);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Maths maths0 = new Maths();
        double d3 = maths0.multiply(0.0d, (double) (byte) 1);
        double d6 = maths0.add((-0.03125d), (double) (-1L));
        double d9 = maths0.multiply((double) (byte) 100, (double) (-1L));
        double d12 = maths0.subtract((double) (byte) 0, (double) 100);
        double d15 = maths0.multiply((-2.0d), (-3.6028797018963968E18d));
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(d6 == (-1.03125d));
        org.junit.Assert.assertTrue(d9 == (-100.0d));
        org.junit.Assert.assertTrue(d12 == (-100.0d));
        org.junit.Assert.assertTrue(d15 == 7.2057594037927936E18d);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Maths maths0 = new Maths();
        double d3 = maths0.multiply(0.0d, (double) (byte) 1);
        double d6 = maths0.add((-0.03125d), (double) (-1L));
        double d9 = maths0.subtract((double) (-1), (double) 1.0f);
        double d12 = maths0.power(6.928614811339226E14d, 10.0d);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(d6 == (-1.03125d));
        org.junit.Assert.assertTrue(d9 == (-2.0d));
        org.junit.Assert.assertTrue(d12 == 2.549553788704367E148d);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.add((-1.03125d), 10.0d);
        double d15 = maths0.power((double) 0, (double) 10.0f);
        double d18 = maths0.multiply(1.0d, (double) (short) 1);
        double d21 = maths0.add((-1.0d), 1729.0d);
        double d24 = maths0.multiply((double) 0.0f, 8.96875d);
        double d27 = maths0.subtract((double) (short) -1, (double) (byte) 0);
        double d30 = maths0.power(3.6028797018963968E16d, 18.2d);
        double d33 = maths0.multiply((-20.0d), 3.6028797018963968E16d);
        double d36 = maths0.add((-1.0463951242053392E298d), (double) (short) -1);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 8.96875d);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertTrue(d21 == 1728.0d);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(d27 == (-1.0d));
        org.junit.Assert.assertTrue(d30 == 1.0463951242053392E298d);
        org.junit.Assert.assertTrue(d33 == (-7.2057594037927936E17d));
        org.junit.Assert.assertTrue(d36 == (-1.0463951242053392E298d));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.subtract((-1.0d), (double) 0);
        double d9 = maths0.subtract((double) (byte) 10, (double) (-1L));
        double d12 = maths0.subtract((double) (-1), (double) (short) 100);
        double d15 = maths0.subtract(101.0d, (double) '#');
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == (-1.0d));
        org.junit.Assert.assertTrue(d9 == 11.0d);
        org.junit.Assert.assertTrue(d12 == (-101.0d));
        org.junit.Assert.assertTrue(d15 == 66.0d);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.subtract((-1.0d), (double) 0);
        double d9 = maths0.power((-1.0d), (double) 100.0f);
        double d12 = maths0.power((double) 0, 0.0d);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == (-1.0d));
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d12 == 0.0d);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((double) 100L, Double.NaN);
        double d12 = maths0.add(1719.0d, (double) '#');
        double d15 = maths0.subtract((-101.0d), 1820.0d);
        double d18 = maths0.multiply((double) (byte) 100, 0.054945054945054944d);
        double d21 = maths0.multiply(2.7755575615628914E-17d, 1754.0d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertEquals((double) d9, Double.NaN, 0);
        org.junit.Assert.assertTrue(d12 == 1754.0d);
        org.junit.Assert.assertTrue(d15 == (-1921.0d));
        org.junit.Assert.assertTrue(d18 == 5.4945054945054945d);
        org.junit.Assert.assertTrue(d21 == 4.8683279629813114E-14d);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.add((-1.03125d), 10.0d);
        double d15 = maths0.power((double) 0, (double) 10.0f);
        double d18 = maths0.multiply(1.0d, (double) (short) 1);
        double d21 = maths0.power((-3.6028797018963968E18d), Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 8.96875d);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertTrue(d21 == (-3.6028797018963968E18d));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.subtract((-1.0d), (double) 0);
        double d9 = maths0.power(0.03125d, (double) (short) 100);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == (-1.0d));
        org.junit.Assert.assertTrue(d9 == 3.0549363634996047E-151d);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.divide(3015126.0d, (double) (short) 1);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 3015126.0d);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.subtract((-1.0d), (double) 0);
        double d9 = maths0.subtract((double) (byte) 10, (double) (-1L));
        double d12 = maths0.divide((-1.0d), (-3.6028797018963968E18d));
        double d15 = maths0.subtract((double) 10.0f, 1728.0d);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == (-1.0d));
        org.junit.Assert.assertTrue(d9 == 11.0d);
        org.junit.Assert.assertTrue(d12 == 2.7755575615628914E-19d);
        org.junit.Assert.assertTrue(d15 == (-1718.0d));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.add(1728.0d, (double) 100L);
        double d12 = maths0.power((double) 100L, 18.2d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1828.0d);
        org.junit.Assert.assertTrue(d12 == 1.0E36d);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.subtract(1820.0d, 101.0d);
        double d12 = maths0.multiply((-2.0d), (double) (byte) 0);
        double d15 = maths0.multiply(1754.0d, 1719.0d);
        double d18 = maths0.add(1754.0d, 1719.0d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1719.0d);
        org.junit.Assert.assertTrue(d12 == (-0.0d));
        org.junit.Assert.assertTrue(d15 == 3015126.0d);
        org.junit.Assert.assertTrue(d18 == 3473.0d);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        Maths maths0 = new Maths();
        double d3 = maths0.multiply(0.0d, (double) (byte) 1);
        double d6 = maths0.add((-0.03125d), (double) (-1L));
        double d9 = maths0.divide((-0.0103125d), (double) 100);
        double d12 = maths0.multiply(2987712.0d, 1719.0d);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(d6 == (-1.03125d));
        org.junit.Assert.assertTrue(d9 == (-1.03125E-4d));
        org.junit.Assert.assertTrue(d12 == 5.135876928E9d);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.power((double) 10L, (double) (byte) -1);
        double d9 = maths0.divide((-20.0d), Double.POSITIVE_INFINITY);
        double d12 = maths0.divide((-2.0d), 1819.0d);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == 10.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0d));
        org.junit.Assert.assertTrue(d12 == (-0.0010995052226498076d));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.multiply((-101.0d), (double) (-1L));
        double d15 = maths0.subtract((double) 0, (-100.0d));
        double d18 = maths0.divide((double) (short) 100, 3.6028797018963968E18d);
        double d21 = maths0.subtract(3473.0d, (double) (byte) 0);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 101.0d);
        org.junit.Assert.assertTrue(d15 == 100.0d);
        org.junit.Assert.assertTrue(d18 == 2.7755575615628914E-17d);
        org.junit.Assert.assertTrue(d21 == 3473.0d);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.power(1719.0d, (-1.03125d));
        double d12 = maths0.add((-1.0d), (double) 100.0f);
        double d15 = maths0.subtract(1.0E16d, (double) (byte) 0);
        double d18 = maths0.multiply((-0.02d), (double) (byte) -1);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1719.0d);
        org.junit.Assert.assertTrue(d12 == 99.0d);
        org.junit.Assert.assertTrue(d15 == 1.0E16d);
        org.junit.Assert.assertTrue(d18 == 0.02d);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.subtract((-1.0d), (double) 0);
        double d9 = maths0.power((-1.0d), (double) 100.0f);
        double d12 = maths0.power((double) ' ', 11.0d);
        double d15 = maths0.multiply(99.0d, (double) (byte) 100);
        double d18 = maths0.subtract((double) '4', (double) (byte) 0);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == (-1.0d));
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d12 == 3.6028797018963968E16d);
        org.junit.Assert.assertTrue(d15 == 9900.0d);
        org.junit.Assert.assertTrue(d18 == 52.0d);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.power(1719.0d, (-1.03125d));
        double d12 = maths0.multiply((-2.0d), (double) (byte) 1);
        double d15 = maths0.subtract(1754.0d, (-100.0d));
        double d18 = maths0.subtract(1.6283483384592895E98d, (double) (short) 10);
        double d21 = maths0.power((double) (byte) 10, (double) (byte) -1);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1719.0d);
        org.junit.Assert.assertTrue(d12 == (-2.0d));
        org.junit.Assert.assertTrue(d15 == 1854.0d);
        org.junit.Assert.assertTrue(d18 == 1.6283483384592895E98d);
        org.junit.Assert.assertTrue(d21 == 10.0d);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((double) 0L, (double) 0);
        double d12 = maths0.power(8.96875d, 0.0d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertEquals((double) d9, Double.NaN, 0);
        org.junit.Assert.assertTrue(d12 == 8.96875d);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.multiply(9900.0d, (double) 100.0f);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 990000.0d);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.power((-0.0103125d), (double) (-1));
        double d12 = maths0.multiply((double) 'a', 0.03125d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 3.03125d);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.subtract(1820.0d, 101.0d);
        double d12 = maths0.multiply((-2.0d), (double) (byte) 0);
        double d15 = maths0.power((-1.03125E-5d), Double.NaN);
        double d18 = maths0.add(Double.NEGATIVE_INFINITY, 1.0E36d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1719.0d);
        org.junit.Assert.assertTrue(d12 == (-0.0d));
        org.junit.Assert.assertTrue(d15 == (-1.03125E-5d));
        org.junit.Assert.assertTrue(d18 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        Maths maths0 = new Maths();
        double d3 = maths0.multiply(0.0d, (double) (byte) 1);
        double d6 = maths0.add((-0.03125d), (double) (-1L));
        double d9 = maths0.add((double) (byte) 100, (double) '4');
        double d12 = maths0.add(99.0d, 9.0d);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(d6 == (-1.03125d));
        org.junit.Assert.assertTrue(d9 == 152.0d);
        org.junit.Assert.assertTrue(d12 == 108.0d);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.power(1719.0d, (-1.03125d));
        double d12 = maths0.add((-1.0d), (double) 100.0f);
        double d15 = maths0.add((-2.3875360220377774E32d), (double) 100);
        double d18 = maths0.add(6.928614811339226E14d, 1719.0d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1719.0d);
        org.junit.Assert.assertTrue(d12 == 99.0d);
        org.junit.Assert.assertTrue(d15 == (-2.3875360220377774E32d));
        org.junit.Assert.assertTrue(d18 == 6.928614811356416E14d);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.subtract((-1.0d), (double) 0);
        double d9 = maths0.subtract(181900.0d, 1.0463951242053392E298d);
        double d12 = maths0.add((-1.0d), 101.0d);
        double d15 = maths0.divide(0.03125d, (-0.0d));
        double d18 = maths0.add(0.02d, (double) (byte) 100);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == (-1.0d));
        org.junit.Assert.assertTrue(d9 == (-1.0463951242053392E298d));
        org.junit.Assert.assertTrue(d12 == 100.0d);
        org.junit.Assert.assertTrue(d15 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(d18 == 100.02d);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((double) 100L, Double.NaN);
        double d12 = maths0.add(1719.0d, (double) '#');
        double d15 = maths0.divide((-1.03125E-4d), 10.0d);
        double d18 = maths0.multiply(1729.0d, (double) 10.0f);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertEquals((double) d9, Double.NaN, 0);
        org.junit.Assert.assertTrue(d12 == 1754.0d);
        org.junit.Assert.assertTrue(d15 == (-1.03125E-5d));
        org.junit.Assert.assertTrue(d18 == 17290.0d);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((double) 10.0f, 10.0d);
        double d12 = maths0.power(99.0d, 1754.0d);
        double d15 = maths0.subtract(0.0d, (double) 100);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(d15 == (-100.0d));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.divide((double) 100, 1.0d);
        double d9 = maths0.power(1.0E16d, (-1.03125E-5d));
        double d12 = maths0.power((-101.0d), 8.96875d);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == 100.0d);
        org.junit.Assert.assertTrue(d9 == 1.0E16d);
        org.junit.Assert.assertTrue(d12 == 1.08285670562808E16d);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.multiply((-101.0d), (double) (-1L));
        double d15 = maths0.subtract((double) 0, (-100.0d));
        double d18 = maths0.divide((double) (short) 100, 3.6028797018963968E18d);
        double d21 = maths0.multiply(Double.POSITIVE_INFINITY, (double) (short) 10);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 101.0d);
        org.junit.Assert.assertTrue(d15 == 100.0d);
        org.junit.Assert.assertTrue(d18 == 2.7755575615628914E-17d);
        org.junit.Assert.assertTrue(d21 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.power(1719.0d, (-1.03125d));
        double d12 = maths0.subtract(99.0d, (-1.556150540835042E-200d));
        double d15 = maths0.multiply((double) (-1.0f), 6.928614811356416E14d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1719.0d);
        org.junit.Assert.assertTrue(d12 == 99.0d);
        org.junit.Assert.assertTrue(d15 == (-6.928614811356416E14d));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.subtract((-1.0d), (double) 0);
        double d9 = maths0.power((-1.0d), (double) 100.0f);
        double d12 = maths0.power((double) ' ', 11.0d);
        double d15 = maths0.divide((-1.03125d), (double) (short) 100);
        double d18 = maths0.power((-100.0d), 8.96875d);
        double d21 = maths0.divide(7.2057594037927936E18d, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == (-1.0d));
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d12 == 3.6028797018963968E16d);
        org.junit.Assert.assertTrue(d15 == (-0.0103125d));
        org.junit.Assert.assertTrue(d18 == 1.0E16d);
        org.junit.Assert.assertTrue(d21 == (-0.0d));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.multiply((-101.0d), (double) (-1L));
        double d15 = maths0.subtract((double) 0, (-100.0d));
        double d18 = maths0.divide((double) (short) 100, 3.6028797018963968E18d);
        double d21 = maths0.power((-1.03125E-5d), (double) (-1.0f));
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 101.0d);
        org.junit.Assert.assertTrue(d15 == 100.0d);
        org.junit.Assert.assertTrue(d18 == 2.7755575615628914E-17d);
        org.junit.Assert.assertTrue(d21 == (-1.03125E-5d));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.power((double) 10L, (double) (byte) -1);
        double d9 = maths0.divide((double) (short) 100, 100.0d);
        double d12 = maths0.divide((double) 10, (double) (byte) 1);
        double d15 = maths0.multiply((double) (short) 100, (-2.0d));
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == 10.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d12 == 10.0d);
        org.junit.Assert.assertTrue(d15 == (-200.0d));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.add((-1.03125d), 10.0d);
        double d15 = maths0.power((double) 0, (double) 10.0f);
        double d18 = maths0.multiply(1.0d, (double) (short) 1);
        double d21 = maths0.add((-1.0d), 1729.0d);
        double d24 = maths0.multiply((double) 0.0f, 8.96875d);
        double d27 = maths0.subtract((double) (short) -1, (double) (byte) 0);
        double d30 = maths0.power(3.6028797018963968E16d, 18.2d);
        double d33 = maths0.multiply((-20.0d), 3.6028797018963968E16d);
        double d36 = maths0.add((double) 10L, (-0.0010995052226498076d));
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 8.96875d);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertTrue(d21 == 1728.0d);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(d27 == (-1.0d));
        org.junit.Assert.assertTrue(d30 == 1.0463951242053392E298d);
        org.junit.Assert.assertTrue(d33 == (-7.2057594037927936E17d));
        org.junit.Assert.assertTrue(d36 == 9.99890049477735d);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.power((double) 10L, (double) (byte) -1);
        double d9 = maths0.multiply((double) '#', (double) '4');
        double d12 = maths0.multiply((double) (short) 10, 17290.0d);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == 10.0d);
        org.junit.Assert.assertTrue(d9 == 1820.0d);
        org.junit.Assert.assertTrue(d12 == 172900.0d);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.add(1728.0d, (double) 100L);
        double d12 = maths0.divide(3.6028797018963968E18d, (double) (-1L));
        double d15 = maths0.subtract(1820.0d, (double) 10);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1828.0d);
        org.junit.Assert.assertTrue(d12 == (-3.6028797018963968E18d));
        org.junit.Assert.assertTrue(d15 == 1810.0d);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.power(1719.0d, (-1.03125d));
        double d12 = maths0.add((-1.0d), (double) 100.0f);
        double d15 = maths0.subtract(1.0E16d, (double) (byte) 0);
        double d18 = maths0.multiply((-0.0103125d), 49.114285714285714d);
        double d21 = maths0.power((-1.03125d), 2.7755575615628914E-19d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1719.0d);
        org.junit.Assert.assertTrue(d12 == 99.0d);
        org.junit.Assert.assertTrue(d15 == 1.0E16d);
        org.junit.Assert.assertTrue(d18 == (-0.5064910714285714d));
        org.junit.Assert.assertTrue(d21 == (-1.03125d));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.multiply((double) (byte) 100, (double) 0);
        double d9 = maths0.subtract(Double.NEGATIVE_INFINITY, 0.0d);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((double) 10.0f, 10.0d);
        double d12 = maths0.subtract((double) (short) 100, (-0.5d));
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d12 == 100.5d);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((double) 10.0f, 10.0d);
        double d12 = maths0.add((double) 100.0f, 3.03125d);
        double d15 = maths0.subtract(2.7755575615628914E-17d, (-0.0010995052226498076d));
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d12 == 103.03125d);
        org.junit.Assert.assertTrue(d15 == 0.0010995052226498354d);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.add((-1.03125d), 10.0d);
        double d15 = maths0.power((double) 0, (double) 10.0f);
        double d18 = maths0.multiply(1.0d, (double) (short) 1);
        double d21 = maths0.multiply(1729.0d, 1728.0d);
        double d24 = maths0.multiply(66.0d, 1.0463951242053392E298d);
        double d27 = maths0.multiply(1828.0d, 0.0d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 8.96875d);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertTrue(d21 == 2987712.0d);
        org.junit.Assert.assertTrue(d24 == 6.906207819755239E299d);
        org.junit.Assert.assertTrue(d27 == 0.0d);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.power(1719.0d, (-1.03125d));
        double d12 = maths0.multiply((-2.0d), (double) (byte) 1);
        double d15 = maths0.power(11.0d, 101.0d);
        double d18 = maths0.divide(5.135876928E9d, 0.0d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1719.0d);
        org.junit.Assert.assertTrue(d12 == (-2.0d));
        org.junit.Assert.assertTrue(d15 == 1.515867357380451E105d);
        org.junit.Assert.assertTrue(d18 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        Maths maths0 = new Maths();
        double d3 = maths0.multiply(0.0d, (double) (byte) 1);
        double d6 = maths0.add(10.0d, 1719.0d);
        double d9 = maths0.divide(10.0d, (-20.0d));
        double d12 = maths0.divide((double) (short) -1, (double) (-1.0f));
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(d6 == 1729.0d);
        org.junit.Assert.assertTrue(d9 == (-0.5d));
        org.junit.Assert.assertTrue(d12 == 1.0d);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.add((-1.03125d), 10.0d);
        double d15 = maths0.power((double) 0, (double) 10.0f);
        double d18 = maths0.multiply(1.0d, (double) (short) 1);
        double d21 = maths0.add((-1.0d), 1729.0d);
        double d24 = maths0.multiply((double) 0.0f, 8.96875d);
        double d27 = maths0.add((-1.6283483384592895E98d), 8.96875d);
        double d30 = maths0.add((double) (byte) 1, 0.0d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 8.96875d);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertTrue(d21 == 1728.0d);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(d27 == (-1.6283483384592895E98d));
        org.junit.Assert.assertTrue(d30 == 1.0d);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.power((double) 10, (double) 100);
        double d12 = maths0.add(1.0d, 7.2057594037927936E18d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1.0000000000000006E100d);
        org.junit.Assert.assertTrue(d12 == 7.2057594037927936E18d);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.power(1719.0d, (-1.03125d));
        double d12 = maths0.multiply((-2.0d), (double) (byte) 1);
        double d15 = maths0.multiply((double) '4', (double) 100L);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1719.0d);
        org.junit.Assert.assertTrue(d12 == (-2.0d));
        org.junit.Assert.assertTrue(d15 == 5200.0d);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        Maths maths0 = new Maths();
        double d3 = maths0.multiply(0.0d, (double) (byte) 1);
        double d6 = maths0.add((-0.03125d), (double) (-1L));
        double d9 = maths0.divide((-0.0103125d), (double) 100);
        double d12 = maths0.power(108.0d, 3015126.0d);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(d6 == (-1.03125d));
        org.junit.Assert.assertTrue(d9 == (-1.03125E-4d));
        org.junit.Assert.assertTrue(d12 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.multiply((-101.0d), (double) (-1L));
        double d15 = maths0.divide((double) 100, 1820.0d);
        double d18 = maths0.multiply((double) 0, 2.9950902087260035E277d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 101.0d);
        org.junit.Assert.assertTrue(d15 == 0.054945054945054944d);
        org.junit.Assert.assertTrue(d18 == 0.0d);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.multiply((double) (byte) 10, (-2.0d));
        double d12 = maths0.divide((double) 1.0f, (double) (-1L));
        double d15 = maths0.power((double) 0L, 101.0d);
        double d18 = maths0.power((double) 0, (-0.0103125d));
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-20.0d));
        org.junit.Assert.assertTrue(d12 == (-1.0d));
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue(d18 == 0.0d);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.power(1719.0d, (-1.03125d));
        double d12 = maths0.multiply((-2.0d), (double) (byte) 1);
        double d15 = maths0.power(11.0d, 101.0d);
        double d18 = maths0.power(0.054945054945054944d, 49.114285714285714d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1719.0d);
        org.junit.Assert.assertTrue(d12 == (-2.0d));
        org.junit.Assert.assertTrue(d15 == 1.515867357380451E105d);
        org.junit.Assert.assertTrue(d18 == 1.8051030030820586E-62d);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.multiply((-101.0d), (double) (-1L));
        double d15 = maths0.subtract((double) 0, (-100.0d));
        double d18 = maths0.power((-0.0010995052226498076d), 0.0d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 101.0d);
        org.junit.Assert.assertTrue(d15 == 100.0d);
        org.junit.Assert.assertTrue(d18 == (-0.0010995052226498076d));
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.power((double) 10L, (double) (byte) -1);
        double d9 = maths0.add(172900.0d, (-2.3875360220377774E32d));
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == 10.0d);
        org.junit.Assert.assertTrue(d9 == (-2.3875360220377774E32d));
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.multiply((double) (byte) 100, (double) 0);
        double d9 = maths0.multiply((double) (byte) 100, (double) 0);
        double d12 = maths0.add((-101.0d), 1.0463951242053392E298d);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertTrue(d12 == 1.0463951242053392E298d);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide(1.079094971836756E294d, 3.6028797018963968E16d);
        double d12 = maths0.subtract((-0.0103125d), 6.928614811356416E14d);
        double d15 = maths0.add(1828.0d, 1828.0d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 2.9950902087260035E277d);
        org.junit.Assert.assertTrue(d12 == (-6.928614811356416E14d));
        org.junit.Assert.assertTrue(d15 == 3656.0d);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.power((double) 10L, (double) (byte) -1);
        double d9 = maths0.divide((double) (short) 100, 100.0d);
        double d12 = maths0.subtract((double) (short) 0, (double) (byte) 1);
        double d15 = maths0.divide((-143.03125d), (-20.0d));
        double d18 = maths0.subtract((double) (short) -1, 0.0d);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == 10.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d12 == (-1.0d));
        org.junit.Assert.assertTrue(d15 == 7.1515625d);
        org.junit.Assert.assertTrue(d18 == (-1.0d));
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        Maths maths0 = new Maths();
        double d3 = maths0.multiply(0.0d, (double) (byte) 1);
        double d6 = maths0.add((-0.03125d), (double) (-1L));
        double d9 = maths0.subtract((double) (-1), (double) 1.0f);
        double d12 = maths0.divide((double) (short) 0, (double) (-1L));
        double d15 = maths0.add(1.079094971836756E294d, (double) (byte) 0);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(d6 == (-1.03125d));
        org.junit.Assert.assertTrue(d9 == (-2.0d));
        org.junit.Assert.assertTrue(d12 == (-0.0d));
        org.junit.Assert.assertTrue(d15 == 1.079094971836756E294d);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((double) 100L, Double.NaN);
        double d12 = maths0.add(1719.0d, (double) '#');
        double d15 = maths0.divide((-1.03125E-4d), 10.0d);
        double d18 = maths0.power((-1.03125E-4d), (double) 'a');
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertEquals((double) d9, Double.NaN, 0);
        org.junit.Assert.assertTrue(d12 == 1754.0d);
        org.junit.Assert.assertTrue(d15 == (-1.03125E-5d));
        org.junit.Assert.assertTrue(d18 == (-0.0d));
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((-0.0103125d), (double) (short) 1);
        double d12 = maths0.add((-1.03125d), 10.0d);
        double d15 = maths0.power((double) 0, (double) 10.0f);
        double d18 = maths0.multiply(1.0d, (double) (short) 1);
        double d21 = maths0.add((-1.0d), 1729.0d);
        double d24 = maths0.multiply((double) 0.0f, 8.96875d);
        double d27 = maths0.add((-1.6283483384592895E98d), 8.96875d);
        double d30 = maths0.multiply(10.0d, Double.NaN);
        double d33 = maths0.subtract(9.99890049477735d, 9.99890049477735d);
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == (-0.0103125d));
        org.junit.Assert.assertTrue(d12 == 8.96875d);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue(d18 == 1.0d);
        org.junit.Assert.assertTrue(d21 == 1728.0d);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue(d27 == (-1.6283483384592895E98d));
        org.junit.Assert.assertEquals((double) d30, Double.NaN, 0);
        org.junit.Assert.assertTrue(d33 == 0.0d);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.divide((double) 10.0f, 10.0d);
        double d12 = maths0.power(99.0d, 1754.0d);
        double d15 = maths0.power(3.273390607896142E150d, (double) (-1));
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(d15 == 3.273390607896142E150d);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.subtract((-1.0d), (double) 0);
        double d9 = maths0.power((-1.0d), (double) 100.0f);
        double d12 = maths0.power((double) ' ', 11.0d);
        double d15 = maths0.divide((-1.03125d), (double) (short) 100);
        double d18 = maths0.multiply((double) 100.0f, (double) (short) 0);
        double d21 = maths0.subtract(0.0d, 0.0d);
        double d24 = maths0.multiply((double) (short) 0, 2.549553788704367E148d);
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == (-1.0d));
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertTrue(d12 == 3.6028797018963968E16d);
        org.junit.Assert.assertTrue(d15 == (-0.0103125d));
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertTrue(d21 == 0.0d);
        org.junit.Assert.assertTrue(d24 == 0.0d);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.add(0.0d, (double) 0L);
        double d9 = maths0.power(1719.0d, (-1.03125d));
        double d12 = maths0.subtract(99.0d, (-1.556150540835042E-200d));
        double d15 = maths0.divide(1854.0d, (double) (-1L));
        double d18 = maths0.divide(1820.0d, (double) '4');
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 1719.0d);
        org.junit.Assert.assertTrue(d12 == 99.0d);
        org.junit.Assert.assertTrue(d15 == (-1854.0d));
        org.junit.Assert.assertTrue(d18 == 35.0d);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) 0, (double) 0);
        double d6 = maths0.power((double) (byte) -1, (double) ' ');
        double d9 = maths0.subtract(1920.0d, 1728.0d);
        double d12 = maths0.divide(1728.0d, 192.0d);
        double d15 = maths0.divide((-0.03125d), (-0.5d));
        org.junit.Assert.assertEquals((double) d3, Double.NaN, 0);
        org.junit.Assert.assertTrue(d6 == 1.0d);
        org.junit.Assert.assertTrue(d9 == 192.0d);
        org.junit.Assert.assertTrue(d12 == 9.0d);
        org.junit.Assert.assertTrue(d15 == 0.0625d);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        Maths maths0 = new Maths();
        double d3 = maths0.divide((double) (byte) -1, (double) ' ');
        double d6 = maths0.add((double) ' ', 100.0d);
        double d9 = maths0.multiply(1719.0d, (-20.0d));
        org.junit.Assert.assertTrue(d3 == (-0.03125d));
        org.junit.Assert.assertTrue(d6 == 132.0d);
        org.junit.Assert.assertTrue(d9 == (-34380.0d));
    }
}

