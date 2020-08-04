package stub;

import java.util.Arrays;
import java.util.List;

public class StubGradeSystem extends GradeSystem{
    public List<Double> gradesFor(long studentId) {
        return Arrays.asList(60.0, 70.0, 80.0);
    }
}
