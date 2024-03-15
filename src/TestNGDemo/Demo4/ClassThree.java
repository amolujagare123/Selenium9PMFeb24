package TestNGDemo.Demo4;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {

    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public  void classThreeTest1(String var1,String var2,String var3)
    {
        String url = var1;
        String username = var2;
        String password = var3;

        System.out.println("url:"+url);
        System.out.println("username:"+username);
        System.out.println("password:"+password);
    }

    @Test (groups = "email")
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }

    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }
}
