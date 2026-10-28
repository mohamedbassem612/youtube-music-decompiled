package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwn extends kry {
    public static final Parcelable.Creator CREATOR = new kwo(0);
    public final int a;
    public fxl b = null;
    public byte[] c;

    public kwn(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        a();
    }

    public final void a() {
        fxl fxlVar = this.b;
        byte[] bArr = this.c;
        if (fxlVar == null) {
            if (bArr != null) {
                return;
            }
            if (bArr == null) {
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        } else {
            if (bArr == null) {
                return;
            }
            if (bArr != null) {
                throw new IllegalStateException("Invalid internal representation - full");
            }
        }
        throw new IllegalStateException("Impossible");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        byte[] byteArray = this.c;
        if (byteArray == null) {
            byteArray = this.b.toByteArray();
        }
        ksy.q(parcel, 2, byteArray);
        ksy.h(parcel, iG);
    }
}
