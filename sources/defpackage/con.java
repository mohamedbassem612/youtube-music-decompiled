package defpackage;

import android.util.SparseArray;
import androidx.media3.decoder.DecoderInputBuffer;
import j$.util.Objects;
import java.io.EOFException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class con implements cwj {
    private boolean D;
    private bse F;
    private bse G;
    private boolean I;
    private boolean J;
    private final aae M;
    public final col a;
    public com b;
    public int d;
    public int e;
    public boolean h;
    public long i;
    public long j;
    public boolean k;
    public long l;
    public int m;
    private final cjz n;
    private bse o;
    private cju p;
    private int w;
    private int x;
    private final aeov K = new aeov();
    private int q = 1000;
    private long[] r = new long[1000];
    private long[] s = new long[1000];
    public long[] c = new long[1000];
    private int[] u = new int[1000];
    private int[] t = new int[1000];
    private cwi[] v = new cwi[1000];
    private final yre L = new yre(new cjj(2));
    public long f = Long.MIN_VALUE;
    private long z = Long.MIN_VALUE;
    private long A = Long.MIN_VALUE;
    private boolean E = true;
    public boolean g = true;
    private boolean H = true;
    private long y = Long.MIN_VALUE;
    private int B = -1;
    private int C = -1;

    public con(cra craVar, cjz cjzVar, aae aaeVar) {
        this.n = cjzVar;
        this.M = aaeVar;
        this.a = new col(craVar);
    }

    public static boolean D(bse bseVar) {
        return X(bseVar.q, bseVar.l);
    }

    public static con J(cra craVar, cjz cjzVar, aae aaeVar) {
        cjzVar.getClass();
        return new con(craVar, cjzVar, aaeVar);
    }

    private final int K(long j) {
        int i = this.d;
        int i2 = i(i - 1);
        while (i > this.x && this.c[i2] >= j) {
            i--;
            i2--;
            if (i2 == -1) {
                i2 = this.q - 1;
            }
        }
        return i;
    }

    private final int L(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.c[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.u[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.q) {
                i = 0;
            }
        }
        return i3;
    }

    private final synchronized long M() {
        int i = this.d;
        if (i == 0) {
            return -1L;
        }
        return N(i);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [bvh, java.lang.Object] */
    private final long N(int i) {
        this.z = Math.max(this.z, P(i));
        this.d -= i;
        int i2 = this.e + i;
        this.e = i2;
        int i3 = this.w + i;
        this.w = i3;
        int i4 = this.q;
        if (i3 >= i4) {
            this.w = i3 - i4;
        }
        int i5 = this.x - i;
        this.x = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.x = 0;
        }
        yre yreVar = this.L;
        while (true) {
            SparseArray sparseArray = (SparseArray) yreVar.b;
            if (i6 >= sparseArray.size() - 1) {
                break;
            }
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            yreVar.c.a(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = yreVar.a;
            if (i8 > 0) {
                yreVar.a = i8 - 1;
            }
            i6 = i7;
        }
        if (this.d != 0) {
            return this.s[this.w];
        }
        int i9 = this.w;
        if (i9 == 0) {
            i9 = this.q;
        }
        int i10 = i9 - 1;
        return this.s[i10] + ((long) this.t[i10]);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [bvh, java.lang.Object] */
    private final long O(int i) {
        int iK = k() - i;
        ahno.F(iK >= 0 && iK <= this.d - this.x);
        int i2 = this.d - iK;
        this.d = i2;
        this.A = Math.max(this.z, P(i2));
        this.D = iK == 0 && this.D;
        int i3 = this.B;
        if (i3 != -1 && i < i3) {
            this.B = -1;
        }
        int i4 = this.C;
        if (i4 != -1 && i < i4) {
            this.C = -1;
        }
        yre yreVar = this.L;
        SparseArray sparseArray = (SparseArray) yreVar.b;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            yreVar.c.a(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        yreVar.a = sparseArray.size() > 0 ? Math.min(yreVar.a, sparseArray.size() - 1) : -1;
        int i5 = this.d;
        if (i5 == 0) {
            return 0L;
        }
        int i6 = i(i5 - 1);
        return this.s[i6] + ((long) this.t[i6]);
    }

    private final long P(int i) {
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int i2 = i(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                jMax = Math.max(jMax, this.c[i2]);
                if ((this.u[i2] & 1) != 0) {
                    break;
                }
                i2--;
                if (i2 == -1) {
                    i2 = this.q - 1;
                }
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0074 A[Catch: all -> 0x0158, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x001e, B:10:0x0021, B:14:0x0029, B:16:0x0062, B:39:0x00e2, B:41:0x00eb, B:18:0x0074, B:20:0x007d, B:22:0x0086, B:24:0x0093, B:28:0x00a0, B:29:0x00a5, B:31:0x00b0, B:35:0x00c4, B:37:0x00c9, B:38:0x00dd, B:21:0x0084), top: B:48:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x007d A[Catch: all -> 0x0158, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x001e, B:10:0x0021, B:14:0x0029, B:16:0x0062, B:39:0x00e2, B:41:0x00eb, B:18:0x0074, B:20:0x007d, B:22:0x0086, B:24:0x0093, B:28:0x00a0, B:29:0x00a5, B:31:0x00b0, B:35:0x00c4, B:37:0x00c9, B:38:0x00dd, B:21:0x0084), top: B:48:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0084 A[Catch: all -> 0x0158, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x001e, B:10:0x0021, B:14:0x0029, B:16:0x0062, B:39:0x00e2, B:41:0x00eb, B:18:0x0074, B:20:0x007d, B:22:0x0086, B:24:0x0093, B:28:0x00a0, B:29:0x00a5, B:31:0x00b0, B:35:0x00c4, B:37:0x00c9, B:38:0x00dd, B:21:0x0084), top: B:48:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0093 A[Catch: all -> 0x0158, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x001e, B:10:0x0021, B:14:0x0029, B:16:0x0062, B:39:0x00e2, B:41:0x00eb, B:18:0x0074, B:20:0x007d, B:22:0x0086, B:24:0x0093, B:28:0x00a0, B:29:0x00a5, B:31:0x00b0, B:35:0x00c4, B:37:0x00c9, B:38:0x00dd, B:21:0x0084), top: B:48:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x009d  */
    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0 A[Catch: all -> 0x0158, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x001e, B:10:0x0021, B:14:0x0029, B:16:0x0062, B:39:0x00e2, B:41:0x00eb, B:18:0x0074, B:20:0x007d, B:22:0x0086, B:24:0x0093, B:28:0x00a0, B:29:0x00a5, B:31:0x00b0, B:35:0x00c4, B:37:0x00c9, B:38:0x00dd, B:21:0x0084), top: B:48:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9 A[Catch: all -> 0x0158, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x001e, B:10:0x0021, B:14:0x0029, B:16:0x0062, B:39:0x00e2, B:41:0x00eb, B:18:0x0074, B:20:0x007d, B:22:0x0086, B:24:0x0093, B:28:0x00a0, B:29:0x00a5, B:31:0x00b0, B:35:0x00c4, B:37:0x00c9, B:38:0x00dd, B:21:0x0084), top: B:48:0x0001 }] */
    /* JADX WARN: Type inference failed for: r10v8, types: [bvh, java.lang.Object] */
    private final synchronized void Q(long j, int i, long j2, int i2, cwi cwiVar) {
        bse bseVar;
        cjz cjzVar;
        cjy cjyVarH;
        int iK;
        Object obj;
        int iKeyAt;
        boolean z;
        boolean z2;
        int i3 = this.d;
        if (i3 > 0) {
            int i4 = i(i3 - 1);
            ahno.F(this.s[i4] + ((long) this.t[i4]) <= j2);
        }
        this.D = (536870912 & i) != 0;
        this.A = Math.max(this.A, j);
        V(k(), j, i);
        int i5 = i(this.d);
        this.c[i5] = j;
        this.s[i5] = j2;
        this.t[i5] = i2;
        this.u[i5] = i;
        this.v[i5] = cwiVar;
        this.r[i5] = this.i;
        yre yreVar = this.L;
        if (yreVar.g()) {
            bseVar = this.G;
            bseVar.getClass();
            cjzVar = this.n;
            if (cjzVar != null) {
                cjyVarH = cjzVar.h(this.M, bseVar);
            } else {
                cjyVarH = cjy.e;
            }
            iK = k();
            eol eolVar = new eol(bseVar, cjyVarH);
            if (yreVar.a == -1) {
                if (((SparseArray) yreVar.b).size() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ahno.O(z2);
                yreVar.a = 0;
            }
            obj = yreVar.b;
            if (((SparseArray) obj).size() > 0) {
                iKeyAt = ((SparseArray) obj).keyAt(((SparseArray) obj).size() - 1);
                if (iK >= iKeyAt) {
                    z = true;
                } else {
                    z = false;
                }
                ahno.F(z);
                if (iKeyAt == iK) {
                    yreVar.c.a(((SparseArray) obj).valueAt(((SparseArray) obj).size() - 1));
                }
            }
            ((SparseArray) obj).append(iK, eolVar);
        } else {
            if (!((bse) ((eol) yreVar.f()).a).equals(this.G)) {
                bseVar = this.G;
                bseVar.getClass();
                cjzVar = this.n;
                if (cjzVar != null) {
                    cjyVarH = cjzVar.h(this.M, bseVar);
                } else {
                    cjyVarH = cjy.e;
                }
                iK = k();
                eol eolVar2 = new eol(bseVar, cjyVarH);
                if (yreVar.a == -1) {
                    if (((SparseArray) yreVar.b).size() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ahno.O(z2);
                    yreVar.a = 0;
                }
                obj = yreVar.b;
                if (((SparseArray) obj).size() > 0) {
                    iKeyAt = ((SparseArray) obj).keyAt(((SparseArray) obj).size() - 1);
                    if (iK >= iKeyAt) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ahno.F(z);
                    if (iKeyAt == iK) {
                        yreVar.c.a(((SparseArray) obj).valueAt(((SparseArray) obj).size() - 1));
                    }
                }
                ((SparseArray) obj).append(iK, eolVar2);
            }
        }
        int i6 = this.d + 1;
        this.d = i6;
        int i7 = this.q;
        if (i6 == i7) {
            int i8 = i7 + 1000;
            long[] jArr = new long[i8];
            long[] jArr2 = new long[i8];
            long[] jArr3 = new long[i8];
            int[] iArr = new int[i8];
            int[] iArr2 = new int[i8];
            cwi[] cwiVarArr = new cwi[i8];
            int i9 = this.w;
            int i10 = i7 - i9;
            System.arraycopy(this.s, i9, jArr2, 0, i10);
            System.arraycopy(this.c, this.w, jArr3, 0, i10);
            System.arraycopy(this.u, this.w, iArr, 0, i10);
            System.arraycopy(this.t, this.w, iArr2, 0, i10);
            System.arraycopy(this.v, this.w, cwiVarArr, 0, i10);
            System.arraycopy(this.r, this.w, jArr, 0, i10);
            int i11 = this.w;
            System.arraycopy(this.s, 0, jArr2, i10, i11);
            System.arraycopy(this.c, 0, jArr3, i10, i11);
            System.arraycopy(this.u, 0, iArr, i10, i11);
            System.arraycopy(this.t, 0, iArr2, i10, i11);
            System.arraycopy(this.v, 0, cwiVarArr, i10, i11);
            System.arraycopy(this.r, 0, jArr, i10, i11);
            this.s = jArr2;
            this.c = jArr3;
            this.u = iArr;
            this.t = iArr2;
            this.v = cwiVarArr;
            this.r = jArr;
            this.w = 0;
            this.q = i8;
        }
    }

    private final void R(int i, int i2) {
        if (i2 == 0) {
            col colVar = this.a;
            colVar.d(colVar.g - ((long) i));
        }
    }

    private final void S(bse bseVar, ccu ccuVar) {
        bse bseVar2 = this.o;
        bsa bsaVar = bseVar2 == null ? null : bseVar2.u;
        this.o = bseVar;
        bsa bsaVar2 = bseVar.u;
        cjz cjzVar = this.n;
        ccuVar.b = cjzVar != null ? bseVar.b(cjzVar.a(bseVar)) : bseVar;
        ccuVar.a = this.p;
        if (cjzVar != null) {
            if (bseVar2 == null || !Objects.equals(bsaVar, bsaVar2)) {
                cju cjuVar = this.p;
                aae aaeVar = this.M;
                cju cjuVarF = cjzVar.f(aaeVar, bseVar);
                this.p = cjuVarF;
                ccuVar.a = cjuVarF;
                if (cjuVar != null) {
                    cjuVar.p(aaeVar);
                }
            }
        }
    }

    private final void T() {
        cju cjuVar = this.p;
        if (cjuVar != null) {
            cjuVar.p(this.M);
            this.p = null;
            this.o = null;
        }
    }

    private final synchronized void U() {
        this.x = 0;
        col colVar = this.a;
        colVar.e = colVar.d;
    }

    private final void V(int i, long j, int i2) {
        int i3;
        long j2 = this.y;
        if (j2 == Long.MIN_VALUE || this.B != -1) {
            return;
        }
        if (j >= j2) {
            int i4 = this.C;
            if (i4 == -1) {
                this.C = i;
                i4 = i;
            }
            int i5 = i - i4;
            int i6 = i2 & 1;
            int i7 = i2 & 536870912;
            bse bseVar = this.G;
            int i8 = 16;
            if (bseVar != null && (i3 = bseVar.s) != -1) {
                i8 = i3;
            }
            if (i5 + 1 < i8 + 1 && i6 == 0 && i7 == 0) {
                return;
            } else {
                this.B = i4;
            }
        }
        this.C = -1;
    }

    private final synchronized boolean W(long j) {
        if (this.d == 0) {
            if (j > this.z) {
                return true;
            }
        } else if (p() < j) {
            O(this.e + K(j));
            return true;
        }
        return false;
    }

    private static boolean X(String str, String str2) {
        return bsy.b(str) == 1 && bsy.h(str, str2);
    }

    private final boolean Y() {
        return this.x != this.d;
    }

    private final boolean Z() {
        int i;
        return this.B == -1 && (i = this.C) != -1 && h() >= i;
    }

    private final boolean aa(int i) {
        cju cjuVar = this.p;
        if (cjuVar == null || cjuVar.a() == 4) {
            return true;
        }
        return (this.u[i] & 1073741824) == 0 && this.p.m();
    }

    private final synchronized boolean ab(bse bseVar) {
        this.E = false;
        if (Objects.equals(bseVar, this.G)) {
            return false;
        }
        yre yreVar = this.L;
        if (yreVar.g() || !((bse) ((eol) yreVar.f()).a).equals(bseVar)) {
            this.G = bseVar;
        } else {
            bseVar = (bse) ((eol) yreVar.f()).a;
            this.G = bseVar;
        }
        this.H &= X(bseVar.q, bseVar.l);
        this.I = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    private final synchronized long ac(long j, boolean z) throws Throwable {
        Throwable th;
        con conVar;
        try {
            try {
                int i = this.d;
                if (i != 0) {
                    long[] jArr = this.c;
                    int i2 = this.w;
                    if (j >= jArr[i2]) {
                        if (z) {
                            try {
                                int i3 = this.x;
                                if (i3 != i) {
                                    i = i3 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        conVar = this;
                        int iL = conVar.L(i2, i, j, false);
                        if (iL != -1) {
                            long jN = conVar.N(iL);
                            return jN;
                        }
                    } else {
                        conVar = this;
                    }
                } else {
                    conVar = this;
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    private final synchronized int ad(ccu ccuVar, DecoderInputBuffer decoderInputBuffer, boolean z, boolean z2, aeov aeovVar) {
        boolean z3 = false;
        decoderInputBuffer.waitingForKeys = false;
        int iH = h();
        int i = this.B;
        if (i != -1 && iH >= i) {
            z3 = true;
        }
        if (!Y() || Z() || z3) {
            if (z2 || this.D || z3) {
                decoderInputBuffer.setFlags(4);
                decoderInputBuffer.timeUs = Long.MIN_VALUE;
                return -4;
            }
            bse bseVar = this.G;
            if (bseVar == null || (!z && bseVar == this.o)) {
                return -3;
            }
            S(bseVar, ccuVar);
            return -5;
        }
        Object obj = ((eol) this.L.e(iH)).a;
        if (z || obj != this.o) {
            S((bse) obj, ccuVar);
            return -5;
        }
        int i2 = i(this.x);
        if (!aa(i2)) {
            decoderInputBuffer.waitingForKeys = true;
            return -3;
        }
        decoderInputBuffer.setFlags(this.u[i2]);
        if (this.x == this.d - 1 && (z2 || this.D)) {
            decoderInputBuffer.addFlag(536870912);
        }
        decoderInputBuffer.timeUs = this.c[i2];
        aeovVar.c = this.t[i2];
        aeovVar.b = this.s[i2];
        aeovVar.a = this.v[i2];
        return -4;
    }

    public final synchronized void A(int i) {
        boolean z = false;
        if (i >= 0) {
            if (this.x + i <= this.d) {
                z = true;
            }
        }
        ahno.F(z);
        this.x += i;
    }

    public final void B() {
        this.J = true;
    }

    public final synchronized boolean C() {
        return this.B != -1;
    }

    public final synchronized boolean E() {
        return this.D;
    }

    public final synchronized boolean F(boolean z) {
        int iH = h();
        int i = this.B;
        boolean zAa = true;
        if (i == -1 || iH < i) {
            if (Y() && !Z()) {
                zAa = ((eol) this.L.e(iH)).a == this.o ? aa(i(this.x)) : true;
            } else if (!z && !this.D) {
                bse bseVar = this.G;
                if (bseVar == null) {
                    zAa = false;
                } else if (bseVar == this.o) {
                    return false;
                }
            }
            return zAa;
        }
        return zAa;
    }

    public final synchronized boolean G(int i) {
        int i2;
        int i3;
        U();
        int i4 = this.e;
        if (i < i4 || i > this.d + i4 || (((i2 = this.B) != -1 && i >= i2) || ((i3 = this.C) != -1 && i >= i3))) {
            return false;
        }
        this.f = Long.MIN_VALUE;
        this.x = i - i4;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    public final synchronized boolean H(long j, boolean z) throws Throwable {
        Throwable th;
        con conVar;
        long j2;
        int iL;
        try {
            try {
                U();
                int i = i(this.x);
                long j3 = this.y;
                long jMin = this.A;
                if (j3 != Long.MIN_VALUE) {
                    try {
                        jMin = Math.min(jMin, j3);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (!Y() || j < this.c[i]) {
                    conVar = this;
                } else {
                    if (j > jMin) {
                        if (z) {
                            z = true;
                        } else {
                            conVar = this;
                        }
                    }
                    boolean z2 = this.H;
                    int i2 = this.d;
                    if (z2) {
                        int i3 = i2 - this.x;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= i3) {
                                if (!z) {
                                    conVar = this;
                                    j2 = j;
                                    iL = -1;
                                    break;
                                }
                                conVar = this;
                                iL = i3;
                                j2 = j;
                                break;
                            }
                            if (this.c[i] >= j) {
                                conVar = this;
                                j2 = j;
                                iL = i4;
                                break;
                            }
                            i++;
                            if (i == this.q) {
                                i = 0;
                            }
                            i4++;
                        }
                    } else {
                        int i5 = i2 - this.x;
                        conVar = this;
                        j2 = j;
                        iL = conVar.L(i, i5, j2, true);
                    }
                    if (iL != -1) {
                        conVar.f = j2;
                        conVar.x += iL;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
        throw th;
    }

    public final void I(long j, boolean z) {
        this.a.c(ac(j, z));
    }

    @Override // defpackage.cwj
    public final /* synthetic */ int a(brv brvVar, int i, boolean z) {
        return g(brvVar, i, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    @Override // defpackage.cwj
    public final void b(bse bseVar) {
        bse bseVar2;
        long j = this.j;
        if (j != 0) {
            long j2 = bseVar.v;
            if (j2 != Long.MAX_VALUE) {
                bsd bsdVar = new bsd(bseVar);
                bsdVar.t = j2 + j;
                bseVar2 = new bse(bsdVar);
            } else {
                bseVar2 = bseVar;
            }
        } else {
            bseVar2 = bseVar;
        }
        this.h = false;
        this.F = bseVar;
        boolean zAb = ab(bseVar2);
        com comVar = this.b;
        if (comVar == null || !zAb) {
            return;
        }
        cog cogVar = (cog) comVar;
        cogVar.g.post(cogVar.e);
    }

    @Override // defpackage.cwj
    public final /* synthetic */ void c(bwb bwbVar, int i) {
        d(bwbVar, i, 0);
    }

    @Override // defpackage.cwj
    public final void d(bwb bwbVar, int i, int i2) {
        while (i > 0) {
            col colVar = this.a;
            int iA = colVar.a(i);
            cok cokVar = colVar.f;
            bwbVar.K((byte[]) cokVar.d.b, cokVar.a(colVar.g), iA);
            i -= iA;
            colVar.e(iA);
        }
    }

    @Override // defpackage.cwj
    public final void e(long j, int i, int i2, int i3, cwi cwiVar) {
        int i4;
        if (this.h) {
            bse bseVar = this.F;
            bseVar.getClass();
            b(bseVar);
        }
        long j2 = j + this.j;
        if (this.k) {
            if (Math.abs(j2 - this.l) <= 1000) {
                int i5 = this.m;
                if (i5 > 1) {
                    this.m = i5 - 1;
                } else {
                    this.k = false;
                }
                R(i2, i3);
                return;
            }
            if ((i & 1) == 0 || j2 <= this.A + 1000) {
                R(i2, i3);
                return;
            }
            this.k = false;
        }
        int i6 = i & 1;
        if (!this.g) {
            i4 = i6;
        } else if (i6 == 0) {
            R(i2, i3);
            return;
        } else {
            this.g = false;
            i4 = 1;
        }
        if (this.H) {
            if (j2 < this.f) {
                R(i2, i3);
                return;
            } else if (i6 == 0) {
                if (!this.I) {
                    bvx.e("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(String.valueOf(this.G))));
                    this.I = true;
                }
                i |= 1;
            }
        }
        if (this.J) {
            if (i4 == 0 || !W(j2)) {
                R(i2, i3);
                return;
            }
            this.J = false;
        }
        Q(j2, i, (this.a.g - ((long) i2)) - ((long) i3), i2, cwiVar);
    }

    @Override // defpackage.cwj
    public final int g(brv brvVar, int i, boolean z) throws EOFException {
        col colVar = this.a;
        int iA = colVar.a(i);
        cok cokVar = colVar.f;
        int iA2 = brvVar.a((byte[]) cokVar.d.b, cokVar.a(colVar.g), iA);
        if (iA2 != -1) {
            colVar.e(iA2);
            return iA2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final int h() {
        return this.e + this.x;
    }

    public final int i(int i) {
        int i2 = this.w + i;
        int i3 = this.q;
        return i2 >= i3 ? i2 - i3 : i2;
    }

    public final synchronized int j(long j, boolean z) throws Throwable {
        Throwable th;
        try {
            try {
                int i = this.x;
                int i2 = i(i);
                if (!Y() || j < this.c[i2]) {
                    return 0;
                }
                if (j <= this.A || !z) {
                    int iL = L(i2, this.d - i, j, true);
                    if (iL != -1) {
                        return iL;
                    }
                    return 0;
                }
                try {
                    return this.d - i;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    public final int k() {
        return this.e + this.d;
    }

    public final int l(ccu ccuVar, DecoderInputBuffer decoderInputBuffer, int i, boolean z) {
        boolean z2 = (i & 2) != 0;
        aeov aeovVar = this.K;
        int iAd = ad(ccuVar, decoderInputBuffer, z2, z, aeovVar);
        if (iAd != -4) {
            return iAd;
        }
        if (!decoderInputBuffer.isEndOfStream()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                col colVar = this.a;
                if (i2 != 0) {
                    col.f(colVar.e, decoderInputBuffer, aeovVar, colVar.c);
                } else {
                    colVar.e = col.f(colVar.e, decoderInputBuffer, aeovVar, colVar.c);
                    this.x++;
                }
            } else if (i2 == 0) {
                this.x++;
            }
        }
        return -4;
    }

    public final synchronized long m() {
        int i = this.x;
        if (i == 0) {
            return -1L;
        }
        return N(i);
    }

    public final synchronized long n() {
        if (this.d == 0) {
            return Long.MIN_VALUE;
        }
        return this.c[this.w];
    }

    public final synchronized long o() {
        return this.A;
    }

    public final synchronized long p() {
        return Math.max(this.z, P(this.x));
    }

    public final synchronized long q() {
        return Y() ? this.r[i(this.x)] : this.i;
    }

    public final synchronized bse r() {
        if (this.E) {
            return null;
        }
        return this.G;
    }

    public final void s() {
        this.a.c(M());
    }

    public final void t(long j) {
        if (this.d != 0) {
            ahno.F(j > p());
            u(this.e + K(j));
        }
    }

    public final void u(int i) {
        this.a.d(O(i));
    }

    public final void v() throws cjt {
        cju cjuVar = this.p;
        if (cjuVar == null || cjuVar.a() != 1) {
            return;
        }
        cjt cjtVarC = this.p.c();
        cjtVarC.getClass();
        throw cjtVarC;
    }

    public final void w() {
        s();
        T();
    }

    public final void x() {
        y(true);
        T();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [bvh, java.lang.Object] */
    public final void y(boolean z) {
        yre yreVar;
        SparseArray sparseArray;
        col colVar = this.a;
        colVar.b(colVar.d);
        colVar.d.c(0L, colVar.b);
        cok cokVar = colVar.d;
        colVar.e = cokVar;
        colVar.f = cokVar;
        colVar.g = 0L;
        colVar.a.b();
        int i = 0;
        this.d = 0;
        this.e = 0;
        this.w = 0;
        this.x = 0;
        this.B = -1;
        this.C = -1;
        this.g = true;
        this.f = Long.MIN_VALUE;
        this.z = Long.MIN_VALUE;
        this.A = Long.MIN_VALUE;
        this.D = false;
        this.k = false;
        while (true) {
            yreVar = this.L;
            sparseArray = (SparseArray) yreVar.b;
            if (i >= sparseArray.size()) {
                break;
            }
            yreVar.c.a(sparseArray.valueAt(i));
            i++;
        }
        yreVar.a = -1;
        sparseArray.clear();
        if (z) {
            this.F = null;
            this.G = null;
            this.E = true;
            this.H = true;
        }
    }

    public final synchronized void z(long j) {
        if (j != this.y) {
            this.y = j;
            this.B = -1;
            this.C = -1;
            if (j != Long.MIN_VALUE && j <= this.A) {
                for (int i = 0; i < this.d; i++) {
                    int i2 = i(i);
                    V(this.e + i, this.c[i2], this.u[i2]);
                    if (this.B != -1) {
                        break;
                    }
                }
            }
        }
    }

    @Override // defpackage.cwj
    public final /* synthetic */ void f() {
    }
}
