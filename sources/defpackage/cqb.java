package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cqb implements cqs {
    public static final Comparator a = new awv(6);
    protected final bto b;
    protected final int c;
    protected final int[] d;
    private final bse[] e;
    private final long[] f;
    private int g;

    protected cqb(bto btoVar, int[] iArr, Comparator comparator) {
        bse[] bseVarArr;
        int length = iArr.length;
        int i = 0;
        ahno.O(length > 0);
        btoVar.getClass();
        this.b = btoVar;
        this.c = length;
        this.e = new bse[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            bseVarArr = this.e;
            if (i2 >= length2) {
                break;
            }
            bseVarArr[i2] = btoVar.b(iArr[i2]);
            i2++;
        }
        Arrays.sort(bseVarArr, comparator);
        this.d = new int[this.c];
        while (true) {
            int i3 = this.c;
            if (i >= i3) {
                this.f = new long[i3];
                return;
            } else {
                this.d[i] = btoVar.a(this.e[i]);
                i++;
            }
        }
    }

    @Override // defpackage.cqx
    public final int a(bse bseVar) {
        for (int i = 0; i < this.c; i++) {
            if (this.e[i] == bseVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.cqx
    public final bse b(int i) {
        return this.e[i];
    }

    @Override // defpackage.cqs
    public final bse c() {
        return this.e[f()];
    }

    @Override // defpackage.cqx
    public final bto d() {
        return this.b;
    }

    @Override // defpackage.cqs
    public int e(long j, List list) {
        return list.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cqb cqbVar = (cqb) obj;
            if (this.b.equals(cqbVar.b) && Arrays.equals(this.d, cqbVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        int iIdentityHashCode = (System.identityHashCode(this.b) * 31) + Arrays.hashCode(this.d);
        this.g = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // defpackage.cqx
    public final int n(int i) {
        return this.d[i];
    }

    @Override // defpackage.cqs
    public final int o() {
        return this.d[f()];
    }

    @Override // defpackage.cqx
    public final int p(int i) {
        for (int i2 = 0; i2 < this.c; i2++) {
            if (this.d[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.cqx
    public final int q() {
        return this.d.length;
    }

    @Override // defpackage.cqs
    public boolean r(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zS = s(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.c) {
            if (zS) {
                long[] jArr = this.f;
                jArr[i] = Math.max(jArr[i], bwp.ak(jElapsedRealtime, j));
                return true;
            }
            zS = (i2 == i || s(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zS) {
            return false;
        }
        long[] jArr2 = this.f;
        jArr2[i] = Math.max(jArr2[i], bwp.ak(jElapsedRealtime, j));
        return true;
    }

    @Override // defpackage.cqs
    public boolean s(int i, long j) {
        return this.f[i] > j;
    }

    @Override // defpackage.cqs
    public void j() {
    }

    @Override // defpackage.cqs
    public void k() {
    }

    @Override // defpackage.cqs
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.cqs
    public void l(float f) {
    }

    public cqb(bto btoVar, int[] iArr) {
        this(btoVar, iArr, a);
    }
}
