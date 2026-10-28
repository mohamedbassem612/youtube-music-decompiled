package defpackage;

import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cvn {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final eol k;
    private final bsx l;

    public cvn(byte[] bArr, int i) {
        dqp dqpVar = new dqp(bArr, (byte[]) null);
        dqpVar.q(i << 3);
        this.a = dqpVar.i(16);
        this.b = dqpVar.i(16);
        this.c = dqpVar.i(24);
        this.d = dqpVar.i(24);
        int i2 = dqpVar.i(20);
        this.e = i2;
        this.f = g(i2);
        this.g = dqpVar.i(3) + 1;
        int i3 = dqpVar.i(5) + 1;
        this.h = i3;
        this.i = f(i3);
        this.j = dqpVar.j(36);
        this.k = null;
        this.l = null;
    }

    private static int f(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int g(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public final long b(long j) {
        return bwp.t((j * ((long) this.e)) / 1000000, 0L, this.j - 1);
    }

    public final bse c(byte[] bArr, bsx bsxVar) {
        bArr[4] = -128;
        bsx bsxVarD = d(bsxVar);
        bsd bsdVar = new bsd();
        bsdVar.e("audio/flac");
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        bsdVar.p = i;
        bsdVar.G = this.g;
        bsdVar.I = this.e;
        bsdVar.J = bwp.p(this.h);
        bsdVar.r = Collections.singletonList(bArr);
        bsdVar.l = bsxVarD;
        return new bse(bsdVar);
    }

    public final bsx d(bsx bsxVar) {
        bsx bsxVar2 = this.l;
        return bsxVar2 != null ? bsxVar2.e(bsxVar) : bsxVar;
    }

    public final cvn e(eol eolVar) {
        return new cvn(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, eolVar, this.l);
    }

    public cvn(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, eol eolVar, bsx bsxVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = g(i5);
        this.g = i6;
        this.h = i7;
        this.i = f(i7);
        this.j = j;
        this.k = eolVar;
        this.l = bsxVar;
    }
}
