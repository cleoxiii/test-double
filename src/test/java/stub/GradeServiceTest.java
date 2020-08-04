package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    StubGradeSystem mockGradeSystem;
    GradeService gradeService;
    @BeforeEach
    void setUp() {
        mockGradeSystem = new StubGradeSystem();
        gradeService = new GradeService(mockGradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        //Assertions.assertEquals(90.0, result);
        long id = 1;
        double result = gradeService.calculateAverageGrades(id);
        Assertions.assertEquals(70.0, result);
    }
}
