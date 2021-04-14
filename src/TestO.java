import java.util.Date;

/**
 * @Author:灵魂码仔
 * @Description:
 * @Time: created on 2021/4/13 23:49
 * @Email: 873227070@qq.com
 */
public class TestO extends Date {
    public static void main(String[] args) {
        new TestO().test();
    }
    public void test(){
        System.out.println(this.getClass().getName());
    }

}
