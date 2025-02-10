import diaryApp.Diaries;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiariesTest {

    @Test
    public void testThat_DiaryCanBeCreated() {
        Diaries diaries = new Diaries();
        diaries.createDiary("UserName",  "Password");
       assertNotNull( diaries.findDiaryByUserName("UserName",  "Password"));
    }
    @Test
    public void testThat_DiaryCanBeFound() {
        Diaries diaries = new Diaries();
        diaries.createDiary("UserName",  "Password");
        assertNotNull( diaries.findDiaryByUserName("UserName",  "Password"));
    }



}