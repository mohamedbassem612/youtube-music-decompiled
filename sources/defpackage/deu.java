package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import org.chromium.net.NetError;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class deu implements cvi {
    public final List a;
    public final SparseArray b;
    public final SparseBooleanArray c;
    public final SparseBooleanArray d;
    public cvk e;
    public int f;
    public boolean g;
    public int h;
    public final elq i;
    private final int j;
    private final bwb k = new bwb(new byte[9400], 0);
    private final SparseIntArray l;
    private final dbl m;
    private final der n;
    private boolean o;
    private boolean p;
    private int q;
    private cuy r;

    public deu(int i, dbl dblVar, nzd nzdVar, elq elqVar) {
        this.i = elqVar;
        this.j = i;
        this.m = dblVar;
        this.a = Collections.singletonList(nzdVar);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.c = sparseBooleanArray;
        this.d = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.b = sparseArray;
        this.l = new SparseIntArray();
        this.n = new der();
        this.e = cvk.r;
        this.h = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray3 = this.b;
            if (i2 >= size) {
                sparseArray3.put(0, new den(new des(this)));
                return;
            } else {
                sparseArray3.put(sparseArray2.keyAt(i2), (dew) sparseArray2.valueAt(i2));
                i2++;
            }
        }
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        if (this.j == 0) {
            cvkVar = new dbo(cvkVar, this.m);
        }
        this.e = cvkVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        cuy cuyVar;
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            nzd nzdVar = (nzd) list.get(i);
            if (nzdVar.f() != -9223372036854775807L) {
                long jD = nzdVar.d();
                if (jD != -9223372036854775807L && jD != 0 && jD != j2) {
                    nzdVar.i(j2);
                }
            } else {
                nzdVar.i(j2);
            }
        }
        if (j2 != 0 && (cuyVar = this.r) != null) {
            cuyVar.a(j2);
        }
        this.k.L(0);
        this.l.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i2 >= sparseArray.size()) {
                this.q = 0;
                return;
            } else {
                ((dew) sparseArray.valueAt(i2)).b();
                i2++;
            }
        }
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        byte[] bArr = this.k.b;
        cvb cvbVar = (cvb) cvjVar;
        cvbVar.n(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    cvbVar.p(i, false);
                    return true;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:102:0x01bc A[PHI: r7
      0x01bc: PHI (r7v6 int) = (r7v5 int), (r7v7 int) binds: [B:101:0x01ba, B:99:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x01c7 A[LOOP:3: B:86:0x0188->B:104:0x01c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:119:0x0200  */
    /* JADX WARN: Code duplicated, block: B:122:0x020b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0214  */
    /* JADX WARN: Code duplicated, block: B:125:0x0217  */
    /* JADX WARN: Code duplicated, block: B:126:0x021b  */
    /* JADX WARN: Code duplicated, block: B:128:0x022a  */
    /* JADX WARN: Code duplicated, block: B:129:0x022e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0236  */
    /* JADX WARN: Code duplicated, block: B:133:0x023b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0247  */
    /* JADX WARN: Code duplicated, block: B:136:0x0249  */
    /* JADX WARN: Code duplicated, block: B:140:0x0253  */
    /* JADX WARN: Code duplicated, block: B:143:0x025d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0269  */
    /* JADX WARN: Code duplicated, block: B:164:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x00ee A[EDGE_INSN: B:167:0x00ee->B:59:0x00ee BREAK  A[LOOP:4: B:91:0x019a->B:103:0x01c4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0179  */
    /* JADX WARN: Code duplicated, block: B:84:0x017f  */
    /* JADX WARN: Code duplicated, block: B:88:0x018f  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b7  */
    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) {
        bwb bwbVar;
        byte[] bArr;
        int i;
        int i2;
        int iE;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        dew dewVar;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        int i13;
        int iA;
        int i14;
        SparseArray sparseArray;
        dew dewVar2;
        dei deiVar;
        int i15;
        int i16;
        int iD;
        long j;
        long jF;
        long j2;
        boolean z2 = this.g;
        cvb cvbVar = (cvb) cvjVar;
        long j3 = cvbVar.a;
        int i17 = 0;
        if (z2) {
            if (j3 != -1) {
                der derVar = this.n;
                if (!derVar.b) {
                    int i18 = this.h;
                    if (i18 <= 0) {
                        derVar.a(cvjVar);
                    } else if (!derVar.d) {
                        int iMin = (int) Math.min(112800L, j3);
                        long j4 = j3 - ((long) iMin);
                        if (cvbVar.b != j4) {
                            qhaVar.a = j4;
                            return 1;
                        }
                        bwb bwbVar2 = derVar.a;
                        bwbVar2.L(iMin);
                        cvjVar.k();
                        cvbVar.n(bwbVar2.b, 0, iMin, false);
                        int i19 = bwbVar2.c;
                        int i20 = bwbVar2.d;
                        int i21 = i20 + NetError.ERR_PROXY_DELEGATE_CANCELED_CONNECT_RESPONSE;
                        while (true) {
                            if (i21 < i19) {
                                j2 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr2 = bwbVar2.b;
                            int i22 = 0;
                            for (int i23 = -4; i23 <= 4; i23++) {
                                int i24 = (i23 * 188) + i21;
                                if (i24 >= i19 && i24 < i20 && bArr2[i24] == 71) {
                                    i22++;
                                    if (i22 == 5) {
                                        long jF2 = rx.f(bwbVar2, i21, i18);
                                        if (jF2 == -9223372036854775807L) {
                                            break;
                                        }
                                        j2 = jF2;
                                        break;
                                    }
                                } else {
                                    i22 = 0;
                                }
                            }
                            i21--;
                        }
                        derVar.f = j2;
                        derVar.d = true;
                    } else if (derVar.f == -9223372036854775807L) {
                        derVar.a(cvjVar);
                    } else if (derVar.c) {
                        long j5 = derVar.e;
                        if (j5 == -9223372036854775807L) {
                            derVar.a(cvjVar);
                        } else {
                            nzd nzdVar = derVar.h;
                            derVar.g = nzdVar.c(derVar.f) - nzdVar.b(j5);
                            derVar.a(cvjVar);
                        }
                    } else {
                        int iMin2 = (int) Math.min(112800L, j3);
                        if (cvbVar.b != 0) {
                            qhaVar.a = 0L;
                            return 1;
                        }
                        bwb bwbVar3 = derVar.a;
                        bwbVar3.L(iMin2);
                        cvjVar.k();
                        cvbVar.n(bwbVar3.b, 0, iMin2, false);
                        int i25 = bwbVar3.c;
                        int i26 = bwbVar3.d;
                        while (true) {
                            if (i25 >= i26) {
                                jF = -9223372036854775807L;
                                break;
                            }
                            if (bwbVar3.b[i25] == 71) {
                                jF = rx.f(bwbVar3, i25, i18);
                                if (jF != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i25++;
                        }
                        derVar.e = jF;
                        derVar.c = true;
                    }
                }
            }
            if (this.o) {
                j = 0;
            } else {
                this.o = true;
                der derVar2 = this.n;
                long j6 = derVar2.g;
                if (j6 != -9223372036854775807L) {
                    nzd nzdVar2 = derVar2.h;
                    j = 0;
                    cuy cuyVar = new cuy(new cut(), new deq(this.h, nzdVar2), j6, j6 + 1, 0L, j3, 188L, 940);
                    this.r = cuyVar;
                    this.e.z(cuyVar.a);
                } else {
                    j = 0;
                    this.e.z(new cvy(-9223372036854775807L, 0L));
                }
            }
            if (this.p) {
                this.p = false;
                d(j, j);
                if (cvbVar.b != j) {
                    qhaVar.a = j;
                    return 1;
                }
            }
            cuy cuyVar2 = this.r;
            if (cuyVar2 != null && cuyVar2.b()) {
                return cuyVar2.f(cvjVar, qhaVar);
            }
            bwbVar = this.k;
            bArr = bwbVar.b;
            if (9400 - bwbVar.c < 188) {
                iD = bwbVar.d();
                if (iD > 0) {
                    System.arraycopy(bArr, bwbVar.c, bArr, 0, iD);
                }
                bwbVar.N(bArr, iD);
            }
            while (true) {
                i17 = -1;
                if (bwbVar.d() < 188) {
                    i = bwbVar.c;
                    i2 = bwbVar.d;
                    iE = rx.e(bwbVar.b, i, i2);
                    bwbVar.P(iE);
                    i3 = iE + 188;
                    if (i3 > i2) {
                        this.q += iE - i;
                    } else {
                        this.q = 0;
                    }
                    i4 = bwbVar.d;
                    if (i3 <= i4) {
                        return 0;
                    }
                    i5 = bwbVar.i();
                    if ((8388608 & i5) != 0) {
                        bwbVar.P(i3);
                        return 0;
                    }
                    if ((4194304 & i5) != 0) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    i7 = i5 & 32;
                    i8 = (i5 >> 8) & 8191;
                    if ((i5 & 16) != 0) {
                        dewVar = (dew) this.b.get(i8);
                    } else {
                        dewVar = null;
                    }
                    if (dewVar == null) {
                        bwbVar.P(i3);
                        return 0;
                    }
                    i9 = i5 & 15;
                    SparseIntArray sparseIntArray = this.l;
                    i10 = sparseIntArray.get(i8, i9 - 1);
                    sparseIntArray.put(i8, i9);
                    if (i10 == i9) {
                        bwbVar.P(i3);
                        return 0;
                    }
                    if (i9 != ((i10 + 1) & 15)) {
                        dewVar.b();
                    }
                    if (i7 != 0) {
                        int iN = bwbVar.n();
                        if ((bwbVar.n() & 64) != 0) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        i6 |= i12;
                        bwbVar.Q(iN - 1);
                    }
                    z = this.g;
                    if (!z) {
                        i11 = 0;
                        if (!this.d.get(i8, false)) {
                        }
                        if (!z) {
                            this.p = true;
                        }
                        bwbVar.P(i3);
                        return i11;
                    }
                    i11 = 0;
                    bwbVar.O(i3);
                    dewVar.a(bwbVar, i6);
                    bwbVar.O(i4);
                    if (!z) {
                        this.p = true;
                    }
                    bwbVar.P(i3);
                    return i11;
                }
                i13 = bwbVar.d;
                iA = cvjVar.a(bArr, i13, 9400 - i13);
                if (iA == -1) {
                    i14 = 0;
                    while (true) {
                        sparseArray = this.b;
                        if (i14 < sparseArray.size()) {
                            break;
                            break;
                        }
                        dewVar2 = (dew) sparseArray.valueAt(i14);
                        if (!(dewVar2 instanceof dei)) {
                            deiVar = (dei) dewVar2;
                            i15 = deiVar.a;
                            if (i15 == 3) {
                                i16 = 1;
                                if (i15 == 1) {
                                    deiVar.a(new bwb(), i16);
                                }
                            } else if (deiVar.b == -1) {
                                i16 = 1;
                                deiVar.a(new bwb(), i16);
                            }
                        }
                        i14++;
                    }
                } else {
                    bwbVar.O(i13 + iA);
                }
            }
        } else {
            bwbVar = this.k;
            bArr = bwbVar.b;
            if (9400 - bwbVar.c < 188) {
                iD = bwbVar.d();
                if (iD > 0) {
                    System.arraycopy(bArr, bwbVar.c, bArr, 0, iD);
                }
                bwbVar.N(bArr, iD);
            }
            while (true) {
                i17 = -1;
                if (bwbVar.d() < 188) {
                    i = bwbVar.c;
                    i2 = bwbVar.d;
                    iE = rx.e(bwbVar.b, i, i2);
                    bwbVar.P(iE);
                    i3 = iE + 188;
                    if (i3 > i2) {
                        this.q += iE - i;
                    } else {
                        this.q = 0;
                    }
                    i4 = bwbVar.d;
                    if (i3 <= i4) {
                        return 0;
                    }
                    i5 = bwbVar.i();
                    if ((8388608 & i5) != 0) {
                        bwbVar.P(i3);
                        return 0;
                    }
                    if ((4194304 & i5) != 0) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    i7 = i5 & 32;
                    i8 = (i5 >> 8) & 8191;
                    if ((i5 & 16) != 0) {
                        dewVar = (dew) this.b.get(i8);
                    } else {
                        dewVar = null;
                    }
                    if (dewVar == null) {
                        bwbVar.P(i3);
                        return 0;
                    }
                    i9 = i5 & 15;
                    SparseIntArray sparseIntArray2 = this.l;
                    i10 = sparseIntArray2.get(i8, i9 - 1);
                    sparseIntArray2.put(i8, i9);
                    if (i10 == i9) {
                        bwbVar.P(i3);
                        return 0;
                    }
                    if (i9 != ((i10 + 1) & 15)) {
                        dewVar.b();
                    }
                    if (i7 != 0) {
                        int iN2 = bwbVar.n();
                        if ((bwbVar.n() & 64) != 0) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        i6 |= i12;
                        bwbVar.Q(iN2 - 1);
                    }
                    z = this.g;
                    if (!z) {
                        i11 = 0;
                        if (!this.d.get(i8, false)) {
                        }
                        if (!z && this.g && j3 != -1) {
                            this.p = true;
                        }
                        bwbVar.P(i3);
                        return i11;
                    }
                    i11 = 0;
                    bwbVar.O(i3);
                    dewVar.a(bwbVar, i6);
                    bwbVar.O(i4);
                    if (!z) {
                        this.p = true;
                    }
                    bwbVar.P(i3);
                    return i11;
                }
                i13 = bwbVar.d;
                iA = cvjVar.a(bArr, i13, 9400 - i13);
                if (iA == -1) {
                    i14 = 0;
                    while (true) {
                        sparseArray = this.b;
                        if (i14 < sparseArray.size()) {
                            break;
                        }
                        dewVar2 = (dew) sparseArray.valueAt(i14);
                        if (!(dewVar2 instanceof dei)) {
                            deiVar = (dei) dewVar2;
                            i15 = deiVar.a;
                            if (i15 == 3) {
                                i16 = 1;
                                if (i15 == 1) {
                                    deiVar.a(new bwb(), i16);
                                }
                            } else if (deiVar.b == -1) {
                                i16 = 1;
                                deiVar.a(new bwb(), i16);
                            }
                        }
                        i14++;
                    }
                } else {
                    bwbVar.O(i13 + iA);
                }
            }
        }
        return i17;
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }
}
