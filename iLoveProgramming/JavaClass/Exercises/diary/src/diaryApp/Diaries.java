package diaryApp;

import java.io.Serializable;
import java.util.ArrayList;

public class Diaries implements Serializable {
    private ArrayList<Diary> diaries = new ArrayList<>();

    public void createDiary(String UserName, String Password) {
        boolean isBlank = (UserName.trim().isEmpty() || Password.trim().isEmpty());
        if (isBlank) {
            throw new IllegalArgumentException("Username or Password cannot be empty");
        }
        diaries.add(new Diary(UserName, Password));
    }
    public Diary findDiaryByUserName(String UserName,String password) {
        for (Diary diary : diaries)
            if (diary.getUsername().equals(UserName)&& diary.validatePassword(password)) return diary;
        throw new IllegalArgumentException("Wrong Username or Password");
    }
    public void removeDiary(String userName ,String password) {
        diaries.remove(findDiaryByUserName(userName,password));
    }



}
