package defpackage;

import android.util.SparseArray;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.common.util.MemoryMappedBuffer;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.util.Locale;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class txl extends MemoryMappedBuffer {
    public int A;
    public int B;
    public txf C;
    public SparseArray D;
    public File E;
    public boolean F;
    public long G;
    public long H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public int M;
    private final boolean N;
    private int O;
    private int P;
    private long Q;
    private int R;
    private int S;
    private int T;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public txl(int i, int i2, boolean z, boolean z2) {
        super(null, (1 << i) + i2);
        this.E = null;
        this.l = i;
        int i3 = ((i << 1) + 1) << 16;
        this.j = i3;
        this.k = (((char) i3) + ((i3 >>> 16) & 4095)) | (i << 16);
        this.m = z;
        this.N = z2;
    }

    public static long C(MemoryMappedBuffer memoryMappedBuffer) {
        long j = memoryMappedBuffer.f;
        long jPeekLong = Memory.peekLong(32 + j, false);
        return (memoryMappedBuffer.a(0, 112) - (Memory.peekLong(j + 24, false) + jPeekLong)) + (jPeekLong >>> 32);
    }

    public final int A() {
        if (this.m) {
            if (!this.K) {
                throw new IllegalStateException("mmcb !verified");
            }
            if (this.h != 2) {
                throw new IllegalStateException("mmcb !loaded");
            }
        }
        if (this.M == 0) {
            return y() - this.u;
        }
        int i = this.S;
        int i2 = this.q;
        int iC = (int) c((i << 3) + ((char) i2), i2 >>> 16);
        int i3 = this.S;
        int i4 = this.M;
        return i3 < i4 ? (i4 - i3) - iC : Math.max((y() - this.S) - iC, this.M - this.u);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x013e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0142  */
    /* JADX WARN: Code duplicated, block: B:77:0x0148  */
    /* JADX WARN: Code duplicated, block: B:78:0x014a  */
    /* JADX WARN: Code duplicated, block: B:80:0x014d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0137 A[SYNTHETIC] */
    public final int B(int i, long j, int i2, int i3) {
        boolean z;
        long j2;
        int i4;
        int i5 = 2;
        char c = 0;
        if (this.m) {
            if (!this.K) {
                throw new IllegalStateException("mmcb !verified");
            }
            if (i >= ((this.s + 7) >>> 3)) {
                if (this.h != 2) {
                    throw new IllegalStateException("mmcb !loaded");
                }
                if (i <= (1 << (this.q >>> 16)) - 1) {
                    z = true;
                }
            }
            throw new IllegalStateException(String.format("mmcb bad item size=%d", Integer.valueOf(i)));
        }
        z = false;
        if (j == 0) {
            j2 = 0;
        } else {
            if (j > this.H) {
                I(txb.u);
                return -2;
            }
            j2 = j;
        }
        int iY = y();
        boolean z2 = this.S < this.M;
        boolean z3 = z2;
        while (true) {
            if (z) {
                int i6 = this.M;
                if (i6 == 0) {
                    if (this.S != 0) {
                        Locale locale = Locale.US;
                        Integer numValueOf = Integer.valueOf(this.M);
                        Integer numValueOf2 = Integer.valueOf(this.S);
                        Object[] objArr = new Object[i5];
                        objArr[c] = numValueOf;
                        objArr[1] = numValueOf2;
                        throw new IllegalStateException(String.format(locale, "bad circularHead/Tail: %d, %d", objArr));
                    }
                } else if (i6 == 0 || this.S == 0) {
                    Locale locale2 = Locale.US;
                    Integer numValueOf3 = Integer.valueOf(this.M);
                    Integer numValueOf4 = Integer.valueOf(this.S);
                    Object[] objArr2 = new Object[i5];
                    objArr2[c] = numValueOf3;
                    objArr2[1] = numValueOf4;
                    throw new IllegalStateException(String.format(locale2, "bad circularHead/Tail: %d, %d", objArr2));
                }
            }
            if (this.M == 0) {
                int i7 = this.u;
                this.S = i7;
                this.M = i7;
                i4 = i7;
                break;
            }
            int i8 = this.S;
            int i9 = this.q;
            int iC = i8 + ((int) c((i8 << 3) + ((char) i9), i9 >>> 16));
            int i10 = iC + i;
            if (i10 > iY && (!this.N || !z2)) {
                iC = this.u;
                i10 = iC + i;
            }
            int i11 = this.M;
            boolean z4 = iC <= i11;
            if (z4) {
                if (i11 - i10 >= i3) {
                    this.S = iC;
                    i4 = iC;
                    z3 = z4;
                    break;
                }
                if (!M()) {
                    I(txb.v);
                    return -1;
                }
                if (this.N) {
                    if (this.S < this.M) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z2 = z3;
                } else {
                    z3 = z4;
                }
                i5 = 2;
                c = 0;
            } else {
                if (((iY - i10) + i11) - this.u >= i3) {
                    this.S = iC;
                    i4 = iC;
                    z3 = z4;
                    break;
                }
                if (!M()) {
                    I(txb.v);
                    return -1;
                }
                if (this.N) {
                    if (this.S < this.M) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z2 = z3;
                } else {
                    z3 = z4;
                }
                i5 = 2;
                c = 0;
            }
        }
        if (z3 != z2) {
            this.T = (this.T + 1) & 3;
        }
        n(i4, Math.min(i, Math.max(i2, (this.s + 7) >>> 3)));
        int i12 = this.q;
        int i13 = i4 << 3;
        w(((char) i12) + i13, i12 >>> 16, i);
        int i14 = this.T;
        int i15 = this.p;
        w(((char) i15) + i13, i15 >>> 16, i14);
        if (j2 == 0) {
            return i4;
        }
        int i16 = this.r;
        w(i13 + ((char) i16), i16 >>> 16, Math.max(j2 - this.G, 0L));
        return i4;
    }

    protected abstract txb D(txi txiVar);

    protected abstract txh E();

    public final txj F(txk txkVar) {
        int i = txkVar.a;
        int i2 = this.b - 8;
        if (i == 24 || i >= 128) {
            int i3 = this.k;
            int i4 = this.j;
            int i5 = i3 >>> 16;
            if (i < i2 - (((((i4 >>> 16) & 4095) + i5) + 7) >>> 3)) {
                int iB = (int) b(i, i4);
                if (iB == 0) {
                    w((i << 3) + ((char) i3), i5, 0L);
                    return new txj(0, txb.a);
                }
                int i6 = this.u;
                if (this.m && this.h != 2) {
                    throw new IllegalStateException("mmcb !loaded");
                }
                int i7 = this.s + 7;
                int iY = y();
                int i8 = i7 >>> 3;
                int i9 = iY - i8;
                int i10 = txkVar.b;
                long j = this.Q;
                boolean zO = O();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = -1;
                while (iB != 0) {
                    if (iB >= i6 && iB < i9) {
                        int i15 = this.q;
                        int i16 = iB << 3;
                        int iC = (int) c(i16 + ((char) i15), i15 >>> 16);
                        if (iC >= i8 && iC + iB <= iY) {
                            int i17 = this.q;
                            int iC2 = (int) c(i16 + ((char) i17), i17 >>> 16);
                            int i18 = this.p;
                            int i19 = i;
                            int i20 = i6;
                            int i21 = i8;
                            int iC3 = (int) c(i16 + ((char) i18), i18 >>> 16);
                            if (iC3 != i14) {
                                i14 = i14 == -1 ? iC3 : (i14 + 1) & 3;
                                if (iC3 != i14) {
                                    return new txj(0, txb.H);
                                }
                            } else if (i13 > iB) {
                            }
                            if (zO) {
                                int i22 = this.O;
                                long jC = c(i16 + ((char) i22), i22 >>> 16);
                                if (iC2 >= i10) {
                                    if (jC != (j & a((iB + i10 + 7) & (-8), ((iB + iC2) - 8) & (-8)))) {
                                        return new txj(0, txb.F);
                                    }
                                } else if (jC != 0) {
                                    return new txj(0, txb.F);
                                }
                            }
                            int i23 = this.o;
                            long j2 = this.f;
                            int i24 = i10;
                            if ((((1 << (i23 >>> 16)) - 1) & ((Memory.peekByte((((long) iB) + j2) + ((long) ((i23 >> 3) & 8191))) & 255) >>> (i23 & 7))) != 0) {
                                i12++;
                            }
                            int i25 = iB + iC2;
                            int i26 = this.n;
                            int i27 = i16 + ((char) i26);
                            int i28 = i5;
                            int iC4 = (int) ((((Memory.peekByte(j2 + ((long) (i27 >> 3))) & 255) >>> (i27 & 7)) & 1) == 0 ? 0L : c(i27 + 1, (i26 >>> 16) - 1));
                            i13 = i25;
                            i10 = i24;
                            i11 = iB;
                            i6 = i20;
                            i8 = i21;
                            i5 = i28;
                            iB = iC4;
                            i = i19;
                        }
                    }
                    return new txj(0, txb.G);
                }
                w((i << 3) + ((char) i3), i5, i11);
                return new txj(i12, txb.a);
            }
        }
        return new txj(0, txb.E);
    }

    public final void G(int i, int i2, int i3) {
        if (this.m && !this.K) {
            throw new IllegalStateException("mmcb !verified");
        }
        long j = i;
        if (O()) {
            int i4 = this.q;
            int i5 = i << 3;
            long jA = a((i3 + i + 7) & (-8), ((i + ((int) c(((char) i4) + i5, i4 >>> 16))) - 8) & (-8));
            int i6 = this.O;
            w(i5 + ((char) i6), i6 >>> 16, this.Q & jA);
        }
        int i7 = this.k;
        int i8 = i7 >>> 16;
        int i9 = (i2 << 3) + ((char) i7);
        int iC = (int) c(i9, i8);
        if (iC != 0) {
            int i10 = this.n;
            int i11 = (iC << 3) + ((char) i10);
            long j2 = i11 >> 3;
            long j3 = this.f + j2;
            int iPeekByte = Memory.peekByte(j3) & 255;
            int i12 = i11 & 7;
            if (j != 0) {
                w(i11 + 1, (i10 >>> 16) - 1, j);
                long j4 = this.f + j2;
                Memory.pokeByte(j4, (byte) (Memory.peekByte(j4) | (1 << i12)));
            } else if (((iPeekByte >>> i12) & 1) == 1) {
                Memory.pokeByte(j3, (byte) (Memory.peekByte(j3) & (~(1 << i12))));
            }
        } else {
            k(i2, this.j, j);
        }
        w(i9, i8, j);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0112  */
    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[PHI: r0
      0x0120: PHI (r0v22 aigj) = (r0v21 aigj), (r0v23 aigj) binds: [B:51:0x0110, B:53:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    public final void H(int i, txk[] txkVarArr) throws Throwable {
        int i2;
        aigj aigjVarZ;
        txl txlVar;
        int i3;
        ahno.O(this.h == 2);
        txf txfVar = this.C;
        txfVar.getClass();
        int i4 = this.z;
        int i5 = i << 3;
        int iC = (int) c(((char) i4) + i5, i4 >>> 16);
        long j = i;
        if (iC > 0) {
            int i6 = this.A;
            int iC2 = ((int) c(((char) i6) + i5, i6 >>> 16)) + 1;
            int i7 = this.B;
            txfVar.c(i, i7);
            txl txlVar2 = txfVar.c;
            int i8 = txlVar2.q;
            aigj aigjVar = null;
            if (((int) txlVar2.c(((char) i8) + i5, i8 >>> 16)) != i7) {
                i2 = 1;
                int i9 = txlVar2.q;
                int iC3 = ((int) txlVar2.c(((char) i9) + i5, i9 >>> 16)) - i7;
                if (iC3 <= 0) {
                    txlVar2.I(txb.I);
                } else {
                    byte[] bArr = new byte[iC3];
                    txlVar2.t(i7 + i, bArr, iC3);
                    aigjVarZ = aigj.z(bArr);
                    txlVar = txfVar.c;
                    i3 = txfVar.a;
                    if ((((i2 << (i3 >>> 16)) - 1) & ((Memory.peekByte((txlVar.f + j) + ((long) ((i3 >> 3) & 8191))) & 255) >>> (i3 & 7))) == 0) {
                        aigjVar = aigjVarZ;
                    } else {
                        aigjVar = aigjVarZ;
                    }
                }
            } else if (txlVar2.a != null) {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(txfVar.b(i));
                        try {
                            aigjVarZ = aigj.I(fileInputStream);
                            if (txlVar2.O()) {
                                int iD = aigjVarZ.d();
                                i2 = 1;
                                long jA = 0;
                                for (int i10 = 1; i10 <= 8; i10++) {
                                    try {
                                        jA = (jA << 8) | ((long) (aigjVarZ.a(iD - i10) & 255));
                                    } catch (Throwable th) {
                                        th = th;
                                        Throwable th2 = th;
                                        try {
                                            fileInputStream.close();
                                            throw th2;
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                            throw th2;
                                        }
                                    }
                                }
                                aigjVarZ = aigjVarZ.e(0, iD - 8);
                                if (s(aigjVarZ) != jA) {
                                    txlVar2.I(txb.J);
                                    fileInputStream.close();
                                }
                            } else {
                                i2 = 1;
                            }
                            fileInputStream.close();
                            txlVar = txfVar.c;
                            i3 = txfVar.a;
                            if ((((i2 << (i3 >>> 16)) - 1) & ((Memory.peekByte((txlVar.f + j) + ((long) ((i3 >> 3) & 8191))) & 255) >>> (i3 & 7))) == 0 && (aigjVarZ = MemoryMappedBuffer.e(aigjVarZ)) == null) {
                                txlVar.I(txb.n);
                            } else {
                                aigjVar = aigjVarZ;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            i2 = 1;
                        }
                    } catch (Exception e) {
                        e = e;
                        i2 = 1;
                        txfVar.c.I(txb.r);
                        e.getMessage();
                    }
                } catch (Exception e2) {
                    e = e2;
                    txfVar.c.I(txb.r);
                    e.getMessage();
                }
            } else {
                i2 = 1;
                aigjVarZ = (aigj) txfVar.a().get(i);
                if (aigjVarZ == null) {
                    txfVar.c.I(txb.p);
                } else {
                    txlVar = txfVar.c;
                    i3 = txfVar.a;
                    if ((((i2 << (i3 >>> 16)) - 1) & ((Memory.peekByte((txlVar.f + j) + ((long) ((i3 >> 3) & 8191))) & 255) >>> (i3 & 7))) == 0) {
                        aigjVar = aigjVarZ;
                    } else {
                        aigjVar = aigjVarZ;
                    }
                }
            }
            if (aigjVar == null) {
                int i11 = this.o;
                long j2 = this.f + j + ((long) ((i11 >> 3) & 8191));
                Memory.pokeByte(j2, (byte) (Memory.peekByte(j2) & (~(((i2 << (i11 >>> 16)) - 1) << (i11 & 7)))));
                return;
            }
            byte[] bArrG = aigjVar.G();
            long[] jArr = new long[iC];
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i12 < iC) {
                int i16 = 0;
                long j3 = 0;
                while (i16 < iC2) {
                    byte[] bArr2 = bArrG;
                    int i17 = iC2 - i16;
                    if (i13 < i17) {
                        i15 |= (bArr2[i14] & 255) << i13;
                        i13 += 8;
                        i14++;
                    }
                    int iMin = Math.min(i17, i13);
                    j3 |= ((long) (i15 & ((i2 << iMin) - 1))) << i16;
                    i16 += iMin;
                    i15 >>>= iMin;
                    i13 -= iMin;
                    bArrG = bArr2;
                    jArr = jArr;
                    i12 = i12;
                }
                int i18 = i12;
                jArr[i18] = j3;
                i12 = i18 + 1;
            }
            long[] jArr2 = jArr;
            int length = txkVarArr.length;
            int i19 = 0;
            int i20 = 0;
            while (i19 < length) {
                int iB = (int) b(txkVarArr[i19].a, this.j);
                while (iB != 0) {
                    int i21 = this.r;
                    int i22 = i20 + 1;
                    int i23 = iB << 3;
                    w(((char) i21) + i23, i21 >>> 16, jArr2[i20]);
                    int i24 = this.n;
                    int i25 = i23 + ((char) i24);
                    int i26 = i19;
                    iB = (int) ((((Memory.peekByte(this.f + ((long) (i25 >> 3))) & 255) >>> (i25 & 7)) & 1) == 0 ? 0L : c(i25 + 1, (i24 >>> 16) - 1));
                    i20 = i22;
                    i19 = i26;
                }
                i19++;
            }
            iC = i20;
        } else {
            i2 = 1;
        }
        int i27 = this.y;
        w(SemanticState.Focused, 64, c(i5 + ((char) i27), i27 >>> 16));
        w(960, 64, C(this));
        J();
        if (iC > 0) {
            txfVar.e(i, this.B);
        }
        int i28 = this.o;
        long j4 = this.f + j + ((long) ((i28 >> 3) & 8191));
        Memory.pokeByte(j4, (byte) (Memory.peekByte(j4) & (~(((i2 << (i28 >>> 16)) - 1) << (i28 & 7)))));
    }

    public final void I(txb txbVar) {
        this.d.a(txbVar);
    }

    protected final void J() {
        if (this.r == 0) {
            throw new IllegalStateException();
        }
        long jC = c(SemanticState.Focused, 64);
        this.G = jC;
        this.H = jC + ((1 << (this.r >>> 16)) - 1);
    }

    public final void K() {
        this.w = 0;
    }

    public final boolean L(int i, int i2) {
        long j = this.Q;
        int i3 = this.q;
        int i4 = i << 3;
        int iC = (int) c(((char) i3) + i4, i3 >>> 16);
        int i5 = this.O;
        long jC = c(i4 + ((char) i5), i5 >>> 16);
        if (iC >= i2) {
            if (jC == (j & a((i2 + i + 7) & (-8), ((i + iC) - 8) & (-8)))) {
                return true;
            }
        } else if (jC == 0) {
            return true;
        }
        return false;
    }

    public boolean M() {
        int i;
        if (!this.K) {
            throw new IllegalStateException();
        }
        int i2 = this.M;
        txk[] txkVarArrP = P();
        txkVarArrP.getClass();
        int i3 = 0;
        while (true) {
            if (i3 >= txkVarArrP.length) {
                break;
            }
            S(txkVarArrP[i3].a);
            i3++;
        }
        S(24);
        int i4 = 4;
        int i5 = -1;
        for (txk txkVar : txkVarArrP) {
            int i6 = txkVar.a;
            int iB = (int) b(i6, this.j);
            if (iB != 0) {
                int i7 = this.p;
                int iC = (int) c((iB << 3) + ((char) i7), i7 >>> 16);
                if (iC < i4) {
                    i4 = iC;
                }
                if (iC > i5) {
                    i5 = iC;
                }
                int i8 = this.k;
                int iC2 = (int) c((i6 << 3) + ((char) i8), i8 >>> 16);
                int i9 = this.p;
                int iC3 = (int) c((iC2 << 3) + ((char) i9), i9 >>> 16);
                if (iC3 < i4) {
                    i4 = iC3;
                }
                if (iC3 > i5) {
                    i5 = iC3;
                }
            }
        }
        if (i5 == -1) {
            this.T = 0;
            this.S = 0;
            this.M = 0;
            i = 0;
        } else {
            if (i5 == i4 + 1) {
                i4 = i5;
            }
            this.T = i4;
            int iY = y();
            i = Alert.DURATION_SHOW_INDEFINITELY;
            int i10 = 0;
            for (txk txkVar2 : txkVarArrP) {
                int i11 = txkVar2.a;
                int iB2 = (int) b(i11, this.j);
                if (iB2 != 0) {
                    int i12 = this.p;
                    if (((int) c((iB2 << 3) + ((char) i12), i12 >>> 16)) == this.T) {
                        iB2 += iY;
                    }
                    if (iB2 < i) {
                        i = iB2;
                    }
                    int i13 = this.k;
                    int iC4 = (int) c((i11 << 3) + ((char) i13), i13 >>> 16);
                    int i14 = this.p;
                    if (((int) c((iC4 << 3) + ((char) i14), i14 >>> 16)) == this.T) {
                        iC4 += iY;
                    }
                    if (iC4 > i10) {
                        i10 = iC4;
                    }
                }
            }
            if (i >= iY) {
                i -= iY;
            }
            this.M = i;
            if (i10 >= iY) {
                i10 -= iY;
            }
            this.S = i10;
        }
        boolean z = i2 != i;
        I(z ? txb.A : txb.B);
        return z;
    }

    protected abstract boolean N(boolean z);

    public final boolean O() {
        return this.Q != 0;
    }

    public abstract txk[] P();

    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0057: INVOKE 
      (r6 I:com.google.android.libraries.youtube.common.util.MemoryMappedBuffer)
      (r0 I:java.lang.String)
      (r12 I:java.lang.Throwable)
     VIRTUAL call: com.google.android.libraries.youtube.common.util.MemoryMappedBuffer.g(java.lang.String, java.lang.Throwable):void A[Catch: all -> 0x0078, MD:(java.lang.String, java.lang.Throwable):void (m)] (LINE:88), block:B:29:0x0055 */
    /* JADX WARN: Type inference failed for: r6v1, types: [txl] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    public final boolean Q() {
        txl txlVar;
        ?? r6;
        MemoryMappedBuffer memoryMappedBuffer;
        MemoryMappedBuffer memoryMappedBufferG;
        Throwable th;
        int iNativeOpen;
        ahno.O(this.K);
        int i = this.b;
        int i2 = i + SemanticState.Obscured;
        boolean z = true;
        if (i2 < (1 << this.l)) {
            throw new agfz(a.bR(i, "Illegal change: 4096, from: "));
        }
        this.L = true;
        txe txeVar = new txe(this);
        try {
            if (txeVar.a) {
                r();
            }
            File file = this.a;
            if (txeVar.b || file == null) {
                txlVar = this;
                txlVar.b = i2;
                r6 = txlVar;
                if (txeVar.a && txlVar.d() != txb.a) {
                }
                memoryMappedBuffer = txlVar;
                r6 = txlVar;
                txeVar.close();
                r6.L = false;
                return z;
            }
            try {
                if (tym.o(file, this.c)) {
                    try {
                        iNativeOpen = MemoryMappedBuffer.nativeOpen(file.getPath(), this.e);
                        try {
                            txl txlVar2 = this;
                            try {
                                super.h(iNativeOpen, txeVar.d, i2);
                                MemoryMappedBuffer.nativeClose(iNativeOpen);
                                txlVar = txlVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                MemoryMappedBuffer.nativeClose(iNativeOpen);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        iNativeOpen = -1;
                    }
                } else {
                    txlVar = this;
                }
                txlVar.b = i2;
                r6 = txlVar;
                if (txeVar.a) {
                }
            } catch (Exception e) {
                memoryMappedBufferG.g("resize", e);
                memoryMappedBufferG.d.a(txb.k);
                memoryMappedBuffer = memoryMappedBufferG;
            }
            memoryMappedBuffer = txlVar;
            r6 = txlVar;
            txeVar.close();
            r6.L = false;
            return z;
            memoryMappedBuffer = txlVar;
            r6 = txlVar;
            z = false;
            r6 = memoryMappedBuffer;
            memoryMappedBuffer = txlVar;
            r6 = txlVar;
            txeVar.close();
            r6.L = false;
            return z;
        } catch (Throwable th5) {
            try {
                txeVar.close();
                throw th5;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }

    public final int R(int[] iArr, int[] iArr2, int i) {
        int i2;
        if (i <= 0) {
            return 0;
        }
        int i3 = this.l;
        int i4 = iArr2[0];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = i5 + 1;
            i6++;
            if (i5 == 0) {
                i8 = i4;
            }
            if (i6 != i) {
                int i10 = iArr2[i6];
                int i11 = this.n;
                int i12 = (i4 << 3) + ((char) i11);
                i2 = i3;
                if (i10 != ((int) ((((Memory.peekByte(this.f + ((long) (i12 >> 3))) & 255) >>> (i12 & 7)) & 1) == 0 ? 0L : c(i12 + 1, (i11 >>> 16) - 1))) || i9 == 129) {
                    i4 = i10;
                } else {
                    i5 = i9;
                    i4 = i10;
                }
                i3 = i2;
            } else {
                i2 = i3;
            }
            if (iArr != null) {
                if (i9 > 1) {
                    i8 |= 1 << i2;
                    iArr[i7 + 1] = i5 - 1;
                }
                iArr[i7] = i8;
            }
            i7 += i9 > 1 ? 2 : 1;
            if (i6 == i) {
                return i7;
            }
            i5 = 0;
            i3 = i2;
        }
    }

    final void S(int i) {
        int i2 = this.j;
        int iB = (int) b(i, i2);
        int i3 = iB;
        while (true) {
            long jC = 0;
            if (i3 == 0) {
                i3 = 0;
                break;
            }
            int i4 = this.o;
            long j = this.f;
            if ((((1 << (i4 >>> 16)) - 1) & ((Memory.peekByte((((long) i3) + j) + ((long) ((i4 >> 3) & 8191))) & 255) >>> (i4 & 7))) != 0) {
                break;
            }
            int i5 = this.n;
            int i6 = (i3 << 3) + ((char) i5);
            if ((((Memory.peekByte(j + ((long) (i6 >> 3))) & 255) >>> (i6 & 7)) & 1) != 0) {
                jC = c(i6 + 1, (i5 >>> 16) - 1);
            }
            i3 = (int) jC;
        }
        if (iB != i3) {
            k(i, i2, i3);
            if (i3 == 0) {
                int i7 = this.k;
                w((i << 3) + ((char) i7), i7 >>> 16, 0L);
            }
        }
    }

    @Override // com.google.android.libraries.youtube.common.util.MemoryMappedBuffer
    public txb d() throws Throwable {
        long j;
        long j2;
        txb txbVar;
        txb txbVarD;
        if (this.h == 2) {
            return txb.a;
        }
        txb txbVarD2 = super.d();
        txb txbVar2 = txb.a;
        if (txbVarD2 != txbVar2) {
            return txbVarD2;
        }
        if (this.m && this.h != 2) {
            throw new IllegalStateException("mmcb !loaded");
        }
        boolean z = c(0, 5) == 0;
        if (z) {
            txh txhVarE = E();
            j = 12;
            int i = txhVarE.f;
            n(0, i);
            j2 = 3;
            long j3 = this.f;
            Memory.pokeByte(j3, (byte) (Memory.peekByte(j3) & (-225)));
            long j4 = this.f + 3;
            Memory.pokeByte(j4, (byte) ((Memory.peekByte(j4) & (-256)) | 1));
            w(SemanticState.Focused, 64, txhVarE.a);
            int i2 = txhVarE.b - 1;
            long j5 = this.f + 1;
            Memory.pokeByte(j5, (byte) ((Memory.peekByte(j5) & (-8)) | (i2 & 7)));
            int i3 = txhVarE.c;
            long j6 = this.f + 1;
            Memory.pokeByte(j6, (byte) ((Memory.peekByte(j6) & (-249)) | ((i3 << 3) & 248)));
            int i4 = txhVarE.e;
            long j7 = this.f + 12;
            Memory.pokeByte(j7, (byte) ((Memory.peekByte(j7) & (-64)) | i4));
            int i5 = txhVarE.d;
            long j8 = this.f + 2;
            Memory.pokeByte(j8, (byte) ((Memory.peekByte(j8) & (-64)) | i5));
            w(52, 20, i);
            w(32, 20, 128L);
            int i6 = txhVarE.g;
            long j9 = this.f;
            Memory.pokeByte(j9, (byte) ((Memory.peekByte(j9) & (-32)) | i6));
            w(960, 64, C(this));
        } else {
            j = 12;
            j2 = 3;
        }
        int iPeekByte = Memory.peekByte(this.f + j2) & 255;
        this.P = iPeekByte;
        if (!z) {
            if (iPeekByte == 0) {
                if (c(960, 64) != 0) {
                    r();
                    txb txbVar3 = txb.K;
                    I(txbVar3);
                    return txbVar3;
                }
                long j10 = this.f + j2;
                Memory.pokeByte(j10, (byte) ((Memory.peekByte(j10) & (-256)) | 1));
                w(960, 64, C(this));
                this.P = 1;
            }
            boolean z2 = c(960, 64) == C(this);
            if (!z2 || this.P != 1) {
                r();
                txb txbVar4 = !z2 ? txb.L : txb.K;
                I(txbVar4);
                return txbVar4;
            }
        }
        this.D = this.a != null ? null : new SparseArray();
        int i7 = this.b;
        int i8 = this.l;
        int i9 = i7 - (1 << i8);
        this.I = i9;
        if (i9 == 0) {
            i9 = 8;
        }
        this.J = i7 - i9;
        long j11 = this.f;
        long j12 = j11 + 1;
        int iPeekByte2 = (Memory.peekByte(j12) & 7) + 1;
        int iPeekByte3 = Memory.peekByte(j12) & 255;
        byte bPeekByte = Memory.peekByte(j11 + 2);
        int iPeekByte4 = Memory.peekByte(j11 + j) & 63;
        this.Q = (1 << iPeekByte4) - 1;
        this.v = Memory.peekByte(j11) & 31;
        this.u = (int) c(52, 20);
        int iC = (int) c(32, 20);
        this.t = iC;
        int i10 = iPeekByte2 << 16;
        this.o = i10;
        int i11 = (((char) i10) + (iPeekByte2 & 4095)) | ((i8 + 1) << 16);
        this.n = i11;
        int i12 = (((char) i11) + ((i11 >>> 16) & 4095)) | (iPeekByte4 << 16);
        this.O = i12;
        int i13 = (((char) i12) + (i12 >>> 16)) | 131072;
        this.p = i13;
        int i14 = (((char) i13) + (i13 >>> 16)) | ((iPeekByte3 >>> 3) << 16);
        this.q = i14;
        int i15 = (((char) i14) + (i14 >>> 16)) | ((bPeekByte & 63) << 16);
        this.r = i15;
        int i16 = ((char) i15) + (i15 >>> 16);
        this.s = i16;
        int i17 = i16 | 262144;
        this.x = i17;
        int i18 = (((char) i17) + (i17 >>> 16)) | 4194304;
        this.y = i18;
        int i19 = (((char) i18) + (i18 >>> 16)) | 65536;
        this.R = i19;
        int i20 = (((char) i19) + 1) | ((i8 - 3) << 16);
        this.z = i20;
        int i21 = (((char) i20) + ((i20 >>> 16) & 4095)) | 393216;
        this.A = i21;
        this.B = ((((char) i21) + (i21 >>> 16)) + 7) >>> 3;
        int i22 = this.u;
        if (i22 < iC || i22 >= y() || this.t < 128) {
            r();
            txb txbVar5 = txb.K;
            I(txbVar5);
            return txbVar5;
        }
        this.C = new txf(this, SemanticState.ReadOnly, this.R);
        J();
        if (N(z)) {
            this.K = true;
        } else {
            if (this.w == 0) {
                txk[] txkVarArrP = P();
                if (txkVarArrP != null) {
                    int[] iArr = new int[txkVarArrP.length];
                    int i23 = 0;
                    int i24 = 0;
                    while (true) {
                        if (i23 >= txkVarArrP.length) {
                            txk txkVar = new txk(24, this.B);
                            txj txjVarF = F(txkVar);
                            if (txjVarF.t()) {
                                long jB = b(txkVar.a, this.j);
                                while (true) {
                                    int i25 = (int) jB;
                                    if (i25 == 0) {
                                        break;
                                    }
                                    int i26 = i25 << 3;
                                    int i27 = this.o;
                                    if ((((1 << (i27 >>> 16)) - 1) & ((Memory.peekByte((this.f + ((long) i25)) + ((long) ((i27 >> 3) & 8191))) & 255) >>> (i27 & 7))) != 0) {
                                        int i28 = this.x;
                                        if (((int) c(((char) i28) + i26, i28 >>> 16)) == 0) {
                                            H(i25, txkVarArrP);
                                        }
                                    }
                                    int i29 = this.n;
                                    int i30 = i26 + ((char) i29);
                                    jB = (((Memory.peekByte(this.f + ((long) (i30 >> 3))) & 255) >>> (i30 & 7)) & 1) == 0 ? 0L : c(i30 + 1, (i29 >>> 16) - 1);
                                }
                                txbVar = txbVar2;
                            } else {
                                txbVar = txjVarF.b;
                            }
                            if (txbVar != txbVar2) {
                                txbVarD = txbVar;
                                break;
                            }
                            txbVarD = D(new txi(txkVarArrP, iArr));
                            break;
                        }
                        txj txjVarF2 = F(txkVarArrP[i23]);
                        if (!txjVarF2.t()) {
                            txbVarD = txjVarF2.b;
                            break;
                        }
                        iArr[i24] = txjVarF2.a;
                        i23++;
                        i24++;
                    }
                } else {
                    txbVarD = txb.N;
                }
                if (txbVarD != txbVar2) {
                    r();
                    I(txbVarD);
                    return txbVarD;
                }
            }
            this.K = true;
            M();
        }
        this.w++;
        return txbVar2;
    }

    @Override // com.google.android.libraries.youtube.common.util.MemoryMappedBuffer
    protected void i(File file) {
        File file2 = this.E;
        if (file2 != null) {
            tym.r(file2, this.c);
        }
        K();
    }

    @Override // com.google.android.libraries.youtube.common.util.MemoryMappedBuffer
    public final void j(File file) {
        if (Objects.equals(file, this.a)) {
            return;
        }
        super.j(file);
        K();
        this.E = file == null ? null : new File(file.getParentFile(), String.valueOf(file.getName()).concat(".overflow"));
    }

    @Override // com.google.android.libraries.youtube.common.util.MemoryMappedBuffer
    public boolean r() {
        boolean zR = super.r();
        if (zR) {
            this.D = null;
            this.u = 0;
            this.M = 0;
            this.S = 0;
            this.P = 0;
            this.v = 0;
            this.t = 0;
            this.T = 0;
            this.G = 0L;
            this.H = 0L;
            this.r = 0;
            this.q = 0;
            this.n = 0;
            this.p = 0;
            this.o = 0;
            this.A = 0;
            this.y = 0;
            this.z = 0;
            this.x = 0;
            this.s = 0;
            this.R = 0;
            this.B = 0;
            this.O = 0;
            this.Q = 0L;
            this.I = 0;
            this.J = 0;
            this.C = null;
            this.K = false;
        }
        return zR;
    }

    public final int y() {
        if (!this.m || this.h == 2) {
            return this.J;
        }
        throw new IllegalStateException("mmcb !loaded");
    }

    public final int z() {
        if (this.m && this.h != 2) {
            throw new IllegalStateException("mmcb !loaded");
        }
        if (this.I == 0) {
            return 0;
        }
        return this.b - 8;
    }
}
