import diaryApp.Diary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiaryTest {
    @Test
    public void testDiary_isEmpty() {
        Diary diary = new Diary("username", "password");
        assertTrue(diary.isEmpty());
    }
    @Test
    public void testDiary_CanReceive_NewEntry() {
        Diary diary = new Diary("username", "password");
        String title = "title";
        String body = "body";
        diary.createEntry(title, body);
        assertFalse(diary.isEmpty());

    }
}