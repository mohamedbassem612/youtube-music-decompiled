package androidx.car.app.suggestion.model;

import android.app.PendingIntent;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.aeu;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Suggestion {
    private final PendingIntent mAction;
    private final CarIcon mIcon;
    private final String mIdentifier;
    private final CarText mSubtitle;
    private final CarText mTitle;

    private Suggestion() {
        this.mIdentifier = "";
        this.mTitle = CarText.create("");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mAction = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Suggestion) {
            Suggestion suggestion = (Suggestion) obj;
            if (Objects.equals(this.mIdentifier, suggestion.mIdentifier) && Objects.equals(this.mTitle, suggestion.mTitle) && Objects.equals(this.mSubtitle, suggestion.mSubtitle) && Objects.equals(this.mAction, suggestion.mAction) && Objects.equals(this.mIcon, suggestion.mIcon)) {
                return true;
            }
        }
        return false;
    }

    public PendingIntent getAction() {
        return this.mAction;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public String getIdentifier() {
        return this.mIdentifier;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mIdentifier, this.mTitle, this.mSubtitle, this.mIcon, this.mAction);
    }

    public String toString() {
        return "[id: " + this.mIdentifier + ", title: " + CarText.toShortString(this.mTitle) + ", subtitle: " + CarText.toShortString(this.mSubtitle) + ", pendingIntent: " + this.mAction + ", icon: " + this.mIcon + ']';
    }

    Suggestion(aeu aeuVar) {
        Object obj = aeuVar.a;
        throw null;
    }
}
