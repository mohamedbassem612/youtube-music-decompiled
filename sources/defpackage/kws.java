package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kws extends kry {
    public static final Parcelable.Creator CREATOR = new kpm(19);
    public final int a;
    public final byte[] b;
    public final int c;

    public kws(int i, byte[] bArr, int i2) {
        this.a = i;
        this.b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.q(parcel, 2, this.b);
        ksy.l(parcel, 3, this.c);
        ksy.h(parcel, iG);
    }
}
