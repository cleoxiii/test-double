package mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GradeServiceTest {

    @Test
    void should_return_average_grade() {
        GradeSystem gradeSystem = mock(GradeSystem.class);
        when(gradeSystem.gradesFor(1)).thenReturn(Arrays.asList(60.0, 70.0, 80.0));
        GradeService gradeService = new GradeService(gradeSystem);
        double result = gradeService.calculateAverageGrades(1);
        Assertions.assertEquals(70.0, result);
    }
}
