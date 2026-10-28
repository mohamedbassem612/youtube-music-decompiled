package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jxk extends kry implements Iterable {
    public static final Parcelable.Creator CREATOR = new jwx(8);
    final String a;
    final String[] b;
    final String[] c;

    public jxk(String str, String[] strArr, String[] strArr2) {
        this.a = str;
        this.b = strArr;
        this.c = strArr2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.a != null) {
            return null;
        }
        return new jxj(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.C(parcel, 2, this.b);
        ksy.C(parcel, 3, this.c);
        ksy.h(parcel, iG);
    }
}
