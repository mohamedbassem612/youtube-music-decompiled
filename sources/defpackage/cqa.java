package defpackage;

import android.os.SystemClock;
import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cqa extends cqb {
    private final crd e;
    private final agke f;
    private float g;
    private int h;
    private int i;
    private long j;
    private cpo k;
    private final int[] l;

    protected cqa(bto btoVar, int[] iArr, crd crdVar, List list, Comparator comparator) {
        super(btoVar, iArr, comparator);
        this.e = crdVar;
        this.f = agke.n(list);
        this.g = 1.0f;
        this.i = 0;
        this.j = -9223372036854775807L;
        int[] iArr2 = new int[this.c];
        this.l = iArr2;
        Arrays.fill(iArr2, Alert.DURATION_SHOW_INDEFINITELY);
    }

    public static void i(List list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            agjz agjzVar = (agjz) list.get(i);
            if (agjzVar != null) {
                agjzVar.h(new cpz(j, jArr[i]));
            }
        }
    }

    private final int u(long j, long j2) {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.c; i4++) {
            if (j == Long.MIN_VALUE || !s(i4, j)) {
                if (b(i4).k <= j2) {
                    int i5 = this.l[i4];
                    if (i2 == -1 || i5 < i) {
                        i2 = i4;
                        i = i5;
                    }
                } else {
                    i3 = i4;
                }
            }
        }
        return i2 != -1 ? i2 : i3;
    }

    private final long v() {
        long jE = (long) (((long) (this.e.e() * 0.7f)) / this.g);
        agke agkeVar = this.f;
        if (agkeVar.isEmpty()) {
            return jE;
        }
        int i = 1;
        while (i < agkeVar.size() - 1 && ((cpz) agkeVar.get(i)).a < jE) {
            i++;
        }
        cpz cpzVar = (cpz) agkeVar.get(i - 1);
        cpz cpzVar2 = (cpz) agkeVar.get(i);
        long j = cpzVar.a;
        long j2 = jE - j;
        long j3 = cpzVar2.a - j;
        long j4 = cpzVar.b;
        return ((long) ((j2 / j3) * (cpzVar2.b - j4))) + j4;
    }

    private static final long w(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        cpo cpoVar = (cpo) aguu.K(list);
        long j = cpoVar.k;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = cpoVar.l;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.cqb, defpackage.cqs
    public final int e(long j, List list) {
        int i;
        int i2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.j;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((cpo) aguu.K(list)).equals(this.k))) {
            return list.size();
        }
        this.j = jElapsedRealtime;
        this.k = list.isEmpty() ? null : (cpo) aguu.K(list);
        int i3 = 0;
        if (!list.isEmpty()) {
            int size = list.size();
            if (bwp.x(((cpo) list.get(size - 1)).k - j, this.g) >= 25000000) {
                w(list);
                bse bseVarB = b(u(jElapsedRealtime, v()));
                while (i3 < size) {
                    cpo cpoVar = (cpo) list.get(i3);
                    bse bseVar = cpoVar.h;
                    if (bwp.x(cpoVar.k - j, this.g) < 25000000 || bseVar.k >= bseVarB.k || (i = bseVar.x) == -1 || i > 719 || (i2 = bseVar.w) == -1 || i2 > 1279 || i >= bseVarB.x) {
                        i3++;
                    }
                }
            }
            return size;
        }
        return i3;
    }

    @Override // defpackage.cqs
    public final int f() {
        return this.h;
    }

    @Override // defpackage.cqs
    public final int g() {
        return this.i;
    }

    @Override // defpackage.cqs
    public final Object h() {
        return null;
    }

    @Override // defpackage.cqb, defpackage.cqs
    public final void j() {
        this.k = null;
    }

    @Override // defpackage.cqb, defpackage.cqs
    public final void k() {
        this.j = -9223372036854775807L;
        this.k = null;
    }

    @Override // defpackage.cqb, defpackage.cqs
    public final void l(float f) {
        this.g = f;
    }

    @Override // defpackage.cqs
    public final void m(long j, long j2, long j3, List list, cpq[] cpqVarArr) {
        long jW;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.h;
        int length = cpqVarArr.length;
        int i2 = 0;
        if (i >= length || !cpqVarArr[i].e()) {
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    jW = w(list);
                    break;
                }
                cpq cpqVar = cpqVarArr[i3];
                if (cpqVar.e()) {
                    jW = cpqVar.b() - cpqVar.c();
                    break;
                }
                i3++;
            }
        } else {
            cpq cpqVar2 = cpqVarArr[this.h];
            jW = cpqVar2.b() - cpqVar2.c();
        }
        long jV = v();
        while (i2 < this.c) {
            this.l[i2] = i2 < cpqVarArr.length ? cpqVarArr[i2].a() : Alert.DURATION_SHOW_INDEFINITELY;
            i2++;
        }
        int i4 = this.i;
        if (i4 == 0) {
            this.i = 1;
            this.h = u(jElapsedRealtime, jV);
            return;
        }
        int i5 = this.h;
        int iA = list.isEmpty() ? -1 : a(((cpo) aguu.K(list)).h);
        if (iA != -1) {
            i4 = ((cpo) aguu.K(list)).i;
            i5 = iA;
        }
        int iU = u(jElapsedRealtime, jV);
        if (iU != i5 && !s(i5, jElapsedRealtime)) {
            long jMin = 10000000;
            if (j3 != -9223372036854775807L) {
                if (jW != -9223372036854775807L) {
                    j3 -= jW;
                }
                jMin = Math.min((long) (j3 * 0.75f), 10000000L);
            }
            int[] iArr = this.l;
            int i6 = iArr[i5];
            int i7 = iArr[iU];
            if ((iU < i5 && j2 < jMin) || (iU > i5 && j2 >= 25000000 && i7 >= i6)) {
                iU = i5;
            }
        }
        if (iU != i5) {
            i4 = 3;
        }
        this.i = i4;
        this.h = iU;
    }
}
