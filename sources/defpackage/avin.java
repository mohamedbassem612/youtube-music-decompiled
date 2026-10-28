package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.InvalidMarkException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avin extends avda {
    int a;
    final int b;
    final byte[] c;
    int d = -1;

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public avin(byte[] bArr, int i, int i2) {
        ahno.G((i ^ (-1)) >>> 31, "offset must be >= 0");
        ahno.G((i2 ^ (-1)) >>> 31, "length must be >= 0");
        int i3 = i2 + i;
        ahno.G(i3 <= bArr.length, "offset + length exceeds array boundary");
        this.c = bArr;
        this.a = i;
        this.b = i3;
    }

    @Override // defpackage.avda, defpackage.avil
    public final void b() {
        this.d = this.a;
    }

    @Override // defpackage.avda, defpackage.avil
    public final void c() {
        int i = this.d;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.a = i;
    }

    @Override // defpackage.avda, defpackage.avil
    public final boolean d() {
        return true;
    }

    @Override // defpackage.avil
    public final int e() {
        a(1);
        int i = this.a;
        this.a = i + 1;
        return this.c[i] & 255;
    }

    @Override // defpackage.avil
    public final int f() {
        return this.b - this.a;
    }

    @Override // defpackage.avil
    public final /* bridge */ /* synthetic */ avil g(int i) {
        a(i);
        int i2 = this.a;
        this.a = i2 + i;
        return new avin(this.c, i2, i);
    }

    @Override // defpackage.avil
    public final void i(OutputStream outputStream, int i) throws IOException {
        a(i);
        outputStream.write(this.c, this.a, i);
        this.a += i;
    }

    @Override // defpackage.avil
    public final void j(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    @Override // defpackage.avil
    public final void k(int i) {
        a(i);
        this.a += i;
    }
}
