package TestNGDemo.Demo3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTwo {
    @BeforeTest
    public void beforeMyTest()
    {
        System.out.println("beforeMyTest");
    }
    @AfterTest
    public void afterMyTest()
    {
        System.out.println("afterMyTest");
    }

    @Test
    public void classTwoTest1()
    {
        System.out.println("classTwoTest1");
    }

    @Test
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }

    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }
}
