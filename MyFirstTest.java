import com.google.common.collect.Lists;
import org.assertj.core.api.Assertions;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2016-10-17.
 */
public class MyFirstTest {



    @Before
    public void setUp (){
        System.out.println("setUP");

    }
    @Test
    public void beforeOne(){
        System.out.println("beforeOne");

    }

    @Test(timeout = 10)
    public void timeouter(){

        System.out.println("timer");

    }

    @Test(timeout = 1)
    public void timeoutTest() {
            System.out.println("Timeout test");
        }

    @Ignore
    @Test
    public void firstTest(){
        //given
        int a = 1;
        int b = 1;
        //when
        int result = a+b;

        //then
        Assert.assertEquals(2,result);
        Assertions.assertThat(result)
                .isGreaterThan(1)
                .isLessThan(3)
                .isEqualTo(2);

    }

}
