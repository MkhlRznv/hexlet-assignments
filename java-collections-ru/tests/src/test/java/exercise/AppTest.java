package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    List<Integer> lists;

    @BeforeEach
    void initList() {
        this.lists = new ArrayList<>();
        this.lists.add(3);
        this.lists.add(56);
        this.lists.add(11);
        this.lists.add(7);
        this.lists.add(56);
        this.lists.add(8);
    }

    @Test
    void testTake() {
        // BEGIN
        int n = 3;

        List<Integer> actual = new ArrayList<>();
        actual.add(3);
        actual.add(56);
        actual.add(11);

        List<Integer> list = App.take(lists, n);
        assertThat(actual).isEqualTo(list);
        assertThat(list.size()).isEqualTo(n);
        // END
    }
}
