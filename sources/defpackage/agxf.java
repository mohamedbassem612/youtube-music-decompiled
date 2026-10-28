package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agxf extends agxi implements Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;

    public agxf(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.agxi
    public final int a() {
        byte[] bArr = this.a;
        int length = bArr.length;
        ahno.Q(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        return (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
    }

    @Override // defpackage.agxi
    public final int b() {
        return this.a.length << 3;
    }

    @Override // defpackage.agxi
    public final long c() {
        byte[] bArr = this.a;
        int length = bArr.length;
        ahno.Q(length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length);
        long j = bArr[0] & 255;
        for (int i = 1; i < Math.min(bArr.length, 8); i++) {
            j |= (((long) bArr[i]) & 255) << (i << 3);
        }
        return j;
    }

    @Override // defpackage.agxi
    public final boolean d(agxi agxiVar) {
        int length = agxiVar.f().length;
        byte[] bArr = this.a;
        if (bArr.length != length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            z &= bArr[i] == agxiVar.f()[i];
        }
        return z;
    }

    @Override // defpackage.agxi
    public final byte[] e() {
        return (byte[]) this.a.clone();
    }

    @Override // defpackage.agxi
    public final byte[] f() {
        return this.a;
    }
}
