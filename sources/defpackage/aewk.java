package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aewk extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new aapl(20);
    int a;

    public aewk(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    public final String toString() {
        String str;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int i = this.a;
        if (i != 1) {
            str = i != 2 ? "unchecked" : "indeterminate";
        } else {
            str = "checked";
        }
        return a.ch((byte) 125, str, hexString, "MaterialCheckBox.SavedState{", " CheckedState=");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }
}
