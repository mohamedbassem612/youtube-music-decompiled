package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wjd implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new uwz(12);
    public final aigj a;
    public final int b;

    public wjd(aora aoraVar) {
        this.a = aoraVar.c;
        this.b = aoraVar.d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = ((wjd) obj).b;
        int i2 = this.b;
        if (i2 != i) {
            return i2 >= i ? 1 : -1;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeInt(this.b);
    }
}
