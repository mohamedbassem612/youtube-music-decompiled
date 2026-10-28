package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class affd implements Parcelable {
    public static final Parcelable.Creator CREATOR = new kwo(19);
    public final int a;

    public affd(int i) {
        this.a = i;
    }

    public static affd a(int i) {
        ahno.P(i >= -1, "Invalid AccountId");
        return new affd(i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof affd) && this.a == ((affd) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "AccountId{id=" + this.a + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public affd() {
        throw null;
    }
}
