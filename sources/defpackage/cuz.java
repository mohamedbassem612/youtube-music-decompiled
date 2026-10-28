package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cuz implements cvz {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public cuz(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.cvz
    public final long a() {
        return this.f;
    }

    @Override // defpackage.cvz
    public final cvx b(long j) {
        long[] jArr = this.e;
        int iE = e(j);
        long j2 = jArr[iE];
        long[] jArr2 = this.c;
        cwa cwaVar = new cwa(j2, jArr2[iE]);
        if (cwaVar.b >= j || iE == this.a - 1) {
            return new cvx(cwaVar, cwaVar);
        }
        int i = iE + 1;
        return new cvx(cwaVar, new cwa(jArr[i], jArr2[i]));
    }

    @Override // defpackage.cvz
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.cvz
    public final boolean d() {
        return true;
    }

    public final int e(long j) {
        return bwp.an(this.e, j, true);
    }

    public final String toString() {
        long[] jArr = this.d;
        long[] jArr2 = this.e;
        long[] jArr3 = this.c;
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(jArr3) + ", timeUs=" + Arrays.toString(jArr2) + ", durationsUs=" + Arrays.toString(jArr) + ')';
    }
}
