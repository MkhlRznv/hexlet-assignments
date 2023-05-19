package exercise;

import org.assertj.core.internal.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
//class AppTest {
//
//    @Test
//     void enlargeArrayImage() {
//         String[][] testArr = {
//                 {"*", "*", "*", "*"},
//                 {"*", " ", " ", "*"},
//                 {"*", " ", " ", "*"},
//                 {"*", "*", "*", "*"},
//         };
//
//         String[][] actual = App.enlargeArrayImage(testArr);
//         String[][] expected = {
//                 {"*", "*", "*", "*", "*", "*", "*", "*"},
//                 {"*", "*", "*", "*", "*", "*", "*", "*"},
//                 {"*", "*", " ", " ", " ", " ", "*", "*"},
//                 {"*", "*", " ", " ", " ", " ", "*", "*"},
//                 {"*", "*", " ", " ", " ", " ", "*", "*"},
//                 {"*", "*", " ", " ", " ", " ", "*", "*"},
//                 {"*", "*", "*", "*", "*", "*", "*", "*"},
//                 {"*", "*", "*", "*", "*", "*", "*", "*"},
//         };
//         assertThat(actual).isEqualTo(expected);
//    }
//}
// END
