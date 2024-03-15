package TestNGDemo.Demo4;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {

    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public  void classTwoTest1(String var1,String var2,String var3)
    {
        String url = var1;
        String username = var2;
        String password = var3;

        System.out.println("url:"+url);
        System.out.println("username:"+username);
        System.out.println("password:"+password);
    }

    @Test  (groups = "email")
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
