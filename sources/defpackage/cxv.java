package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cxv implements bsw {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public cxv(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static cxv d(bwb bwbVar) {
        int i = bwbVar.i();
        String strG = bsy.g(bwbVar.D(bwbVar.i(), StandardCharsets.US_ASCII));
        String strC = bwbVar.C(bwbVar.i());
        int i2 = bwbVar.i();
        int i3 = bwbVar.i();
        int i4 = bwbVar.i();
        int i5 = bwbVar.i();
        int i6 = bwbVar.i();
        byte[] bArr = new byte[i6];
        bwbVar.K(bArr, 0, i6);
        return new cxv(i, strG, strC, i2, i3, i4, i5, bArr);
    }

    @Override // defpackage.bsw
    public final /* synthetic */ bse a() {
        return null;
    }

    @Override // defpackage.bsw
    public final void b(bsu bsuVar) {
        bsuVar.a(this.h, this.a);
    }

    @Override // defpackage.bsw
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cxv cxvVar = (cxv) obj;
            if (this.a == cxvVar.a && this.b.equals(cxvVar.b) && this.c.equals(cxvVar.c) && this.d == cxvVar.d && this.e == cxvVar.e && this.f == cxvVar.f && this.g == cxvVar.g && Arrays.equals(this.h, cxvVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + Arrays.hashCode(this.h);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
