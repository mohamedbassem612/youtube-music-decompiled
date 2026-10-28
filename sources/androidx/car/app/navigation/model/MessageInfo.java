package androidx.car.app.navigation.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.adw;
import defpackage.ady;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class MessageInfo implements ady {
    private final CarIcon mImage;
    private final CarText mText;
    private final CarText mTitle;

    MessageInfo(adw adwVar) {
        CarText carText = adwVar.a;
        this.mTitle = null;
        CarText carText2 = adwVar.b;
        this.mText = null;
        CarIcon carIcon = adwVar.c;
        this.mImage = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageInfo) {
            MessageInfo messageInfo = (MessageInfo) obj;
            if (Objects.equals(this.mTitle, messageInfo.mTitle) && Objects.equals(this.mText, messageInfo.mText) && Objects.equals(this.mImage, messageInfo.mImage)) {
                return true;
            }
        }
        return false;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public CarText getText() {
        return this.mText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mText, this.mImage);
    }

    public String toString() {
        return "MessageInfo";
    }

    private MessageInfo() {
        this.mTitle = null;
        this.mText = null;
        this.mImage = null;
    }
}
