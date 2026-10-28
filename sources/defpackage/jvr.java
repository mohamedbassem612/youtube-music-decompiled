package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jvr implements Parcelable {
    public static final Parcelable.Creator CREATOR = new jwx(1);
    public int a;
    public int b;

    public jvr(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
    }

    public final void a() {
        this.a = -1;
    }

    public final boolean b(int i) {
        int i2 = this.a;
        return i2 >= 0 && i2 < i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SavedState{mAnchorPosition=" + this.a + ", mAnchorOffset=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }

    public jvr(jvr jvrVar) {
        this.a = jvrVar.a;
        this.b = jvrVar.b;
    }

    public jvr() {
    }
}
