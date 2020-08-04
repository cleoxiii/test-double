package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    StubGradeSystem stubGradeSystem;
    GradeService gradeService;
    @BeforeEach
    void setUp() {
        stubGradeSystem = new StubGradeSystem();
        gradeService = new GradeService(stubGradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        long id = 1;
        double result = gradeService.calculateAverageGrades(id);
        Assertions.assertEquals(70.0, result);
    }
}
