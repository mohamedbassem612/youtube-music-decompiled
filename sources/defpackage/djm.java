package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class djm {
    public final djo b;
    public final List c;
    public final List d;
    public boolean e;
    public djl f;

    public djm(djo djoVar, boolean z) {
        this.b = djoVar;
        awno awnoVar = awno.a;
        this.c = awnoVar;
        this.d = awnoVar;
        this.e = z;
    }

    protected void b() {
        throw null;
    }

    protected void c(djk djkVar) {
        throw null;
    }

    protected void e() {
        throw null;
    }

    public final void f() {
        long j;
        int iNumberOfTrailingZeros;
        djl djlVar = this.f;
        if (djlVar != null) {
            int iHashCode = hashCode();
            ags agsVar = (ags) djlVar.b;
            int i = agsVar.f;
            int i2 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
            int i3 = i2 ^ (i2 >>> 16);
            int i4 = (i3 >>> 7) & i;
            int i5 = 0;
            loop0: while (true) {
                long[] jArr = agsVar.a;
                int i6 = i4 >> 3;
                int i7 = (i4 & 7) << 3;
                int i8 = i5;
                long j2 = (jArr[i6] >>> i7) | ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63));
                long j3 = (((long) (i3 & 127)) * 72340172838076673L) ^ j2;
                long j4 = ((-72340172838076673L) + j3) & (~j3);
                long j5 = -9187201950435737472L;
                long j6 = j4 & (-9187201950435737472L);
                while (true) {
                    j = j5;
                    if (j6 != 0) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i4) & i;
                        if (awrc.c(agsVar.b[iNumberOfTrailingZeros], this)) {
                            break loop0;
                        }
                        j6 &= (-1) + j6;
                        j5 = j;
                    }
                }
                if ((j2 & ((~j2) << 6) & j) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                } else {
                    i5 = i8 + 8;
                    i4 = (i4 + i5) & i;
                }
            }
            if (iNumberOfTrailingZeros >= 0) {
                agsVar.g--;
                long[] jArr2 = agsVar.a;
                int i9 = agsVar.f;
                int i10 = iNumberOfTrailingZeros >> 3;
                int i11 = (iNumberOfTrailingZeros & 7) << 3;
                long j7 = (jArr2[i10] & (~(255 << i11))) | (254 << i11);
                jArr2[i10] = j7;
                jArr2[(((iNumberOfTrailingZeros - 7) & i9) + (i9 & 7)) >> 3] = j7;
                agsVar.b[iNumberOfTrailingZeros] = null;
                long[] jArr3 = agsVar.c;
                long j8 = jArr3[iNumberOfTrailingZeros];
                long j9 = j8 >> 31;
                int i12 = (int) (j8 & 2147483647L);
                int i13 = (int) (j9 & 2147483647L);
                if (i13 != Integer.MAX_VALUE) {
                    jArr3[i13] = (jArr3[i13] & (-2147483648L)) | ((long) i12);
                } else {
                    agsVar.d = i12;
                }
                if (i12 != Integer.MAX_VALUE) {
                    jArr3[i12] = (jArr3[i12] & (-4611686016279904257L)) | (((long) i13) << 31);
                } else {
                    agsVar.e = i13;
                }
                jArr3[iNumberOfTrailingZeros] = 4611686018427387903L;
                djq djqVar = (djq) djlVar.a;
                if (awrc.c(this, djqVar.d)) {
                    if (djqVar.e == -1) {
                        a();
                    }
                    djqVar.d = null;
                    djqVar.e = 0;
                    djqVar.f = null;
                }
                djqVar.b.remove(this);
                djqVar.c.remove(this);
                this.f = null;
                djqVar.c();
            }
        }
    }

    public final void g(boolean z) {
        if (this.e != z) {
            this.e = z;
            djl djlVar = this.f;
            if (djlVar != null) {
                ((djq) djlVar.a).c();
            }
        }
    }

    protected void a() {
    }
}
