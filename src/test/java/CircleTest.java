import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void shouldCalculateCircleArea() {
        // given
        Circle circle = new Circle();
        circle.setRadius(5);
        // when
        double expectedCircleArea = 78.53981633974483;
        double result = circle.circleArea();
        // then
        Assertions.assertEquals(expectedCircleArea, result);

    }

}
