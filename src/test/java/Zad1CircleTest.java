import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zad1CircleTest {

    @Test
    public void shouldCalculateCircleArea() {
        // given
        Zad1Circle zad1Circle = new Zad1Circle();
        zad1Circle.setRadius(5);
        // when
        double expectedCircleArea = 78.53981633974483;
        double result = zad1Circle.circleArea();
        // then
        Assertions.assertEquals(expectedCircleArea, result);

    }

}
