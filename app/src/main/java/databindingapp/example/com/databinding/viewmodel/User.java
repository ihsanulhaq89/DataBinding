package databindingapp.example.com.databinding.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import databindingapp.example.com.databinding.BR;

public class User extends BaseObservable {
    private String title;
    private String dailyTip;


    public User(String title, String dailyTip) {
        this.title = title;
        this.dailyTip = dailyTip;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDailyTip() {
        return dailyTip;
    }

    public void setDailyTip(String dailyTip) {
        this.dailyTip = dailyTip;
    }
}
