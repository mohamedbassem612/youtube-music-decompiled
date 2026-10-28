package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lmh extends kry {
    public static final Parcelable.Creator CREATOR = new kvu(11);
    public final byte[] a;

    public lmh(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lmh) {
            return Arrays.equals(this.a, ((lmh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.q(parcel, 1, bArr);
        ksy.h(parcel, iG);
    }
}
