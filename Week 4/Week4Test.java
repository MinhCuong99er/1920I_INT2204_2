/**
 * Created by CCNE on 30/09/2019.
 */

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Week4Test {
    @Test
    public void testMax2Int1(){ Assert.assertEquals(6, Week4Test.max2Int(6, 5));}

    @Test
    public void testMax2Int2(){ Assert.assertEquals(34, Week4Test.max2Int(9, 34));}

    @Test
    public void testMax2Int3(){ Assert.assertEquals(10, Week4Test.max2Int(9, 10));}

    @Test
    public void testMax2Int4(){ Assert.assertEquals(12, Week4Test.max2Int(12, -7));}

    @Test
    public void testMax2Int5(){ Assert.assertEquals(5, Week4Test.max2Int(0, 5));}

    @Test
    public void testMinArray1(){
        int [] arr = {3,4,5,6,7,8,9,10};
        Assert.assertEquals(3, Week4Test.minArray(arr));
    }

    @Test
    public void testMinArray2(){
        int [] arr = {9,9,9,9,9,9,9,9};
        Assert.assertEquals(9, Week4Test.minArray(arr));
    }

    @Test
    public void testMinArray3(){
        int [] arr = {9,8,7,6,5,4,3,2};
        Assert.assertEquals(2, Week4Test.minArray(arr));
    }

    @Test
    public void testMinArray4(){
        int [] arr = {3,6,9,12,15,18,21,24};
        Assert.assertEquals(3, Week4Test.minArray(arr));
    }
    @Test
    public void testMinArray5(){
        int [] arr = {3,2,1,0,-1,-2,-3,-4};
        Assert.assertEquals(-4, Week4Test.minArray(arr));
    }

    @Test
    public void testCalculateBMI1(){ Assert.assertEquals("Thiếu cân", Week4Test.calculateBMI(48.5, 1.6)); }

    @Test
    public void testCalculateBMI2(){ Assert.assertEquals("Bình thường", Week4Test.calculateBMI(40, 1.6));}

    @Test
    public void testCalculateBMI3(){ Assert.assertEquals("Bình thường", Week4Test.calculateBMI(59, 1.6));}

    @Test
    public void testCalculateBMI4(){ Assert.assertEquals("Bình thường", Week4Test.calculateBMI(60, 1.6));}

    @Test
    public void testCalculateBMI5(){ Assert.assertEquals("Bình thường", Week4Test.calculateBMI(56, 1.6));}
}
