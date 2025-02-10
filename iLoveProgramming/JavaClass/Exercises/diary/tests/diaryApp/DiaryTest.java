import diaryApp.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    Diary diary;

    @BeforeEach
    void setUp() {
        diary = new Diary("username", "password");
    }
    @Test
    public void testDiary_isEmpty() {

        assertTrue(diary.isEmpty());
    }
    @Test
    public void testDiary_CanReceive_NewEntry() {
        String title = "title";
        String body = "body";
        assertTrue(diary.isEmpty());
        diary.createEntry(title, body);
        assertFalse(diary.isEmpty());
    }
    @Test
    public void testDiary_EmptyFields_ThrowsException() {
        String title = "";
        String body = "";
        assertThrows(IllegalArgumentException.class, () -> diary.createEntry(title, body));
    }
    @Test
    public void testThat_EntrycanBeFound_ById(){
        String title = "title";
        String body = "body";
        diary.createEntry(title, body);
        diary.createEntry("another title", "another body");
        diary.createEntry(title, "another body");
        diary.findEntryById(1);

    }
    @Test
    public void testThat_WrongId_ThrowsException_WhenFindingEntryById() {
        String title = "title";
        String body = "body";
        diary.createEntry(title, body);
        diary.createEntry("another title", "another body");
        assertThrows(IllegalArgumentException.class, () -> diary.findEntryById(-1));
    }

    @Test
    public void testThat_EntrycanBeDeleted() {
        String title = "title";
        String body = "body";
        assertTrue(diary.isEmpty());
        diary.createEntry(title, body);
        diary.createEntry("another title", "another body");
        diary.createEntry(title, "another body");
        assertEquals(diary.countEntries(),3);
        diary.deleteEntry(2);
        assertEquals(diary.countEntries(), 2);

    }

    @Test
    public void testLock_DiaryLocks_Diary() {
        diary.lockDiary();
        assertTrue(diary.getisLocked());
    }
    @Test
    public void testUnlock_DiaryUnlocks_Diary() {
        diary.lockDiary();
        assertTrue(diary.getisLocked());
        diary.unlockDiary();
        assertFalse(diary.getisLocked());
    }
    @Test
    public void testThat_EntryCanBeUpdated() {
        String title = "title";
        String body = "body";
        diary.createEntry(title, body);
        diary.updateEntry(1,"another title", "another body");

    }
    @Test
    public void testThat_WrongId_WhenUpdatingEntry_ThrowsException() {
        String title = "title";
        String body = "body";
        diary.createEntry(title, body);
        String newTitle = "another title";
        String newBody = "another body";
        assertThrows(IllegalArgumentException.class, () -> diary.updateEntry(12,newTitle,newBody));
    }



    }


