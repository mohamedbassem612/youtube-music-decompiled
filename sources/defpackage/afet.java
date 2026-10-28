package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afet extends bdh {
    public static final Parcelable.Creator CREATOR = new aewc(4);
    public CharSequence a;
    public boolean b;

    public afet(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + String.valueOf(this.a) + '}';
    }

    @Override // defpackage.bdh, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.a, parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public afet(Parcelable parcelable) {
        super(parcelable);
    }
}
