package stub;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class GradeServiceTest {

    @Mock
    GradeSystem gradeSystem;
    @InjectMocks
    GradeService gradeService;

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        Mockito.when(gradeSystem.gradesFor(1)).thenReturn(Arrays.asList(80.0, 90.0, 100.0));
        assertEquals(90,gradeService.calculateAverageGrades(1));
    }
}
