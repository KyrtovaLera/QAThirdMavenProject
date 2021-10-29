import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork8Test {

    @Test
    public void getSumTest() {
        Assert.assertEquals(HomeWork8.getSum(1, 2), 3);
        Assert.assertEquals(HomeWork8.getSum(-5, 2), -3);
        Assert.assertEquals(HomeWork8.getSum(0, 0), 0);
    }
    @Test
    public void getMin() {
        Assert.assertEquals(HomeWork8.getMin(3, 2), 1);
        Assert.assertEquals(HomeWork8.getMin(2, 2), 0);
        Assert.assertEquals(HomeWork8.getMin(-3, -2), -1);
    }
    @Test
    public void getMult() {
        Assert.assertEquals(HomeWork8.getMult(2, 3), 6);
        Assert.assertEquals(HomeWork8.getMult(-1, 2), -2);
        Assert.assertEquals(HomeWork8.getMult(0, 5), 0);
    }
    @Test
    public void getDivTest() {
        Assert.assertEquals(HomeWork8.getDiv(2, 2), 1);
        Assert.assertEquals(HomeWork8.getDiv(8, 4), 2);
    }
}
