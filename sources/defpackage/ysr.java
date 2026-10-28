package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ysr {
    public static final ysq a = new ysq(null);
    public final byte[] b;
    public final String c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final ysq k;

    public ysr(byte[] bArr) {
        ysq ysqVar = a;
        zkf.d(bArr);
        this.b = bArr;
        zkf.d("");
        this.c = "";
        this.d = 0;
        this.e = 0L;
        this.f = -1L;
        this.g = -1L;
        this.h = false;
        this.i = false;
        zkf.d(ysqVar);
        this.k = ysqVar;
        this.j = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ysr) {
            ysr ysrVar = (ysr) obj;
            if (this.c.equals(ysrVar.c)) {
                int i = ysrVar.d;
                long j = ysrVar.e;
                long j2 = ysrVar.f;
                long j3 = ysrVar.g;
                boolean z = ysrVar.h;
                boolean z2 = ysrVar.i;
                ysq ysqVar = this.k;
                ysq ysqVar2 = ysrVar.k;
                if (ysqVar.a == ysqVar2.a && ysqVar.b == ysqVar2.b && Arrays.equals(this.b, ysrVar.b)) {
                    int i2 = ysrVar.j;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }
}
