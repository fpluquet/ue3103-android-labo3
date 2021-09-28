package be.fpluquet.labo3.models;

import java.util.Date;
import java.util.UUID;

public class Crime {
    protected java.util.UUID mId;
    protected String mTitle;
    protected java.util.Date mDate;
    protected boolean mSolved;

    public Crime() {
        this.mTitle = "Titre par défaut";
        this.mId = UUID.randomUUID();
        this.mDate = new Date();
        this.mSolved = false;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }

    public void setSolved(boolean solved) {
        this.mSolved = solved;
    }
}
