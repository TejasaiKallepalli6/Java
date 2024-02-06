package tryCatch;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class convertStringToIntTest {


        @Test
        public void testConvertToIntValidInput() {
            assertEquals(23, convertStringToInt.convertToInt("23"));
        }

        @Test(expected = NumberFormatException.class)
        public void testConvertToIntInvalidInput() {
            convertStringToInt.convertToInt("45.67");
        }

        @Test(expected = NumberFormatException.class)
        public void testConvertToIntNonNumericInput() {
            convertStringToInt.convertToInt("test");
        }

        @Test(expected = NumberFormatException.class)
        public void testConvertToIntAlphaNumericInput() {
            convertStringToInt.convertToInt("123f");
        }
    }

