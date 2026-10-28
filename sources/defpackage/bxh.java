package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bxh {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final byte l;
    public final byte m;

    /* JADX WARN: Code duplicated, block: B:68:0x0124  */
    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    public bxh(aami aamiVar) {
        boolean zU;
        boolean zU2;
        byte bI;
        byte bI2;
        byte bI3;
        boolean zU3;
        boolean zU4 = false;
        ahno.F(aamiVar.a == 1);
        byte[] bArr = new byte[((ByteBuffer) aamiVar.b).remaining()];
        ((ByteBuffer) aamiVar.b).asReadOnlyBuffer().get(bArr);
        dqp dqpVar = new dqp(bArr, (byte[]) null);
        this.g = dqpVar.i(3);
        dqpVar.r();
        boolean zU5 = dqpVar.u();
        this.a = zU5;
        if (zU5) {
            dqpVar.i(5);
            this.b = false;
            this.h = false;
        } else {
            if (dqpVar.u()) {
                dqpVar.s(64);
                if (dqpVar.u()) {
                    int i = 0;
                    while (!dqpVar.u()) {
                        i++;
                    }
                    if (i < 32) {
                        dqpVar.s(i);
                    }
                }
                boolean zU6 = dqpVar.u();
                this.b = zU6;
                if (zU6) {
                    dqpVar.s(47);
                }
            } else {
                this.b = false;
            }
            this.h = dqpVar.u();
            int i2 = dqpVar.i(5);
            for (int i3 = 0; i3 <= i2; i3++) {
                dqpVar.s(12);
                if (i3 == 0) {
                    if (dqpVar.i(5) > 7) {
                        dqpVar.u();
                    }
                } else if (dqpVar.i(5) > 7) {
                    dqpVar.r();
                }
                if (this.b) {
                    dqpVar.r();
                }
                if (this.h && dqpVar.u()) {
                    if (i3 == 0) {
                        dqpVar.i(4);
                    } else {
                        dqpVar.s(4);
                    }
                }
            }
        }
        int i4 = dqpVar.i(4);
        int i5 = dqpVar.i(4);
        dqpVar.s(i4 + 1);
        dqpVar.s(i5 + 1);
        if (this.a) {
            this.c = false;
        } else {
            boolean zU7 = dqpVar.u();
            this.c = zU7;
            if (zU7) {
                dqpVar.s(4);
                dqpVar.s(3);
            }
        }
        dqpVar.s(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            dqpVar.s(4);
            boolean zU8 = dqpVar.u();
            if (zU8) {
                dqpVar.s(2);
            }
            if (dqpVar.u()) {
                this.d = true;
            } else {
                boolean zU9 = dqpVar.u();
                this.d = zU9;
                if (!zU9) {
                    this.e = true;
                }
                if (zU8) {
                    this.f = dqpVar.i(3) + 1;
                } else {
                    this.f = 0;
                }
            }
            if (dqpVar.u()) {
                this.e = true;
            } else {
                this.e = dqpVar.u();
            }
            if (zU8) {
                this.f = dqpVar.i(3) + 1;
            } else {
                this.f = 0;
            }
        }
        dqpVar.s(3);
        boolean zU10 = dqpVar.u();
        if (this.g == 2 && zU10) {
            zU = dqpVar.u();
            this.i = zU;
        } else {
            this.i = false;
            zU = false;
        }
        if (this.g != 1) {
            zU2 = dqpVar.u();
            this.j = zU2;
        } else {
            this.j = false;
            zU2 = false;
        }
        if (dqpVar.u()) {
            bI2 = (byte) dqpVar.i(8);
            this.l = bI2;
            bI3 = (byte) dqpVar.i(8);
            this.m = bI3;
            bI = (byte) dqpVar.i(8);
        } else {
            this.l = (byte) 0;
            this.m = (byte) 0;
            bI = 0;
            bI2 = 0;
            bI3 = 0;
        }
        if (zU2) {
            dqpVar.r();
            this.k = false;
        } else if (bI2 == 1 && bI3 == 13 && bI == 0) {
            this.k = false;
        } else {
            dqpVar.r();
            int i6 = this.g;
            if (i6 == 0) {
                this.k = true;
                zU3 = true;
                zU4 = true;
            } else if (i6 == 1) {
                this.k = false;
                zU3 = false;
            } else if (zU) {
                zU3 = dqpVar.u();
                this.k = zU3;
                if (zU3) {
                    zU4 = dqpVar.u();
                }
            } else {
                this.k = true;
                zU3 = true;
            }
            if (zU3 && zU4) {
                dqpVar.i(2);
            }
        }
        dqpVar.r();
    }
}
