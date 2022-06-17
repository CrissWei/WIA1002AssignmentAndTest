package Annotation;

/**
 * @Name Cris
 * @ID S2004131
 * @Date 2020/6/17
 *
 */



import org.junit.Test;

@SuppressWarnings("all") //压制所有警告
public class test1 {

    @Deprecated // 代表方法已过时，不建议使用（但也可以用）
    @Test
    public void method(){
        System.out.println(11);
    }


    @Test
    public void method2(){
        method();

        System.out.println(22);
    }

    @myAnno //自定义的注解，没啥用
    public void method3(){
        method();

        System.out.println(22);
    }
}
