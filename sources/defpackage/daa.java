package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.cardboard.sdk.R;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class daa implements cvi {
    private static final byte[] b = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final bse c;
    private long A;
    private long B;
    private czz C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private cvk I;
    private cwj[] J;
    private boolean K;
    private boolean L;
    private long M;
    private long N;
    private final eol O;
    private final zs P;
    public cwj[] a;
    private final dbl d;
    private final int e;
    private final List f;
    private final SparseArray g;
    private final bwb h;
    private final bwb i;
    private final bwb j;
    private final byte[] k;
    private final bwb l;
    private final bwb m;
    private final ArrayDeque n;
    private final ArrayDeque o;
    private final bxl p;
    private final cwj q;
    private agke r;
    private int s;
    private int t;
    private long u;
    private int v;
    private bwb w;
    private long x;
    private int y;
    private long z;

    static {
        bsd bsdVar = new bsd();
        bsdVar.e("application/x-emsg");
        c = new bse(bsdVar);
    }

    public daa(dbl dblVar, int i, List list, cwj cwjVar) {
        this.d = dblVar;
        this.e = i;
        this.f = DesugarCollections.unmodifiableList(list);
        this.q = cwjVar;
        this.O = new eol();
        this.m = new bwb(16);
        this.h = new bwb(bxf.a);
        this.i = new bwb(6);
        this.j = new bwb();
        byte[] bArr = new byte[16];
        this.k = bArr;
        this.l = new bwb(bArr);
        this.n = new ArrayDeque();
        this.o = new ArrayDeque();
        this.g = new SparseArray();
        this.r = agpi.a;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = cvk.r;
        this.J = new cwj[0];
        this.a = new cwj[0];
        this.p = new bxl(new deo(this, 1));
        this.P = new zs((byte[]) null, (byte[]) null);
        this.M = -1L;
        this.N = -1L;
    }

    private static Pair i(bwb bwbVar, long j) throws bsz {
        long jX;
        long jX2;
        bwbVar.P(8);
        int i = bwbVar.i();
        int i2 = czv.a;
        bwbVar.Q(4);
        int i3 = (i >> 24) & 255;
        long jW = bwbVar.w();
        if (i3 == 0) {
            jX = bwbVar.w();
            jX2 = bwbVar.w();
        } else {
            jX = bwbVar.x();
            jX2 = bwbVar.x();
        }
        long j2 = j + jX2;
        long jC = bwp.C(jX, 1000000L, jW);
        bwbVar.Q(2);
        int iS = bwbVar.s();
        int[] iArr = new int[iS];
        long[] jArr = new long[iS];
        long[] jArr2 = new long[iS];
        long[] jArr3 = new long[iS];
        long j3 = j2;
        long jC2 = jC;
        int i4 = 0;
        while (i4 < iS) {
            int i5 = bwbVar.i();
            if ((Integer.MIN_VALUE & i5) != 0) {
                throw new bsz("Unhandled indirect reference", null, true, 1);
            }
            long jW2 = bwbVar.w();
            iArr[i4] = i5 & Alert.DURATION_SHOW_INDEFINITELY;
            jArr[i4] = j3;
            jArr3[i4] = jC2;
            jX += jW2;
            long[] jArr4 = jArr3;
            jC2 = bwp.C(jX, 1000000L, jW);
            jArr2[i4] = jC2 - jArr4[i4];
            bwbVar.Q(4);
            j3 += (long) iArr[i4];
            i4++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jC), new cuz(iArr, jArr, jArr2, jArr3));
    }

    private static bsa j(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            bwx bwxVar = (bwx) list.get(i);
            if (bwxVar.d == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bwxVar.a.b;
                UUID uuidI = om.i(bArr);
                if (uuidI == null) {
                    bvx.e("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new brz(uuidI, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList != null) {
            return new bsa(arrayList);
        }
        return null;
    }

    private final void k() {
        this.s = 0;
        this.v = 0;
    }

    private static void l(bwb bwbVar, int i, dak dakVar) throws bsz {
        bwbVar.P(i + 8);
        int i2 = bwbVar.i();
        int i3 = czv.a;
        if ((i2 & 1) != 0) {
            throw new bsz("Overriding TrackEncryptionBox parameters is unsupported.", null, false, 1);
        }
        boolean z = (i2 & 2) != 0;
        int iQ = bwbVar.q();
        if (iQ == 0) {
            Arrays.fill(dakVar.l, 0, dakVar.e, false);
            return;
        }
        int i4 = dakVar.e;
        if (iQ != i4) {
            throw new bsz(a.bQ(i4, iQ, "Senc sample count ", " is different from fragment sample count"), null, true, 1);
        }
        Arrays.fill(dakVar.l, 0, iQ, z);
        dakVar.b(bwbVar.d());
        bwb bwbVar2 = dakVar.m;
        bwbVar.K(bwbVar2.b, 0, bwbVar2.d);
        bwbVar2.P(0);
        dakVar.n = false;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0435  */
    /* JADX WARN: Code duplicated, block: B:161:0x044a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x044c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0455  */
    /* JADX WARN: Code duplicated, block: B:166:0x045e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0469  */
    /* JADX WARN: Code duplicated, block: B:170:0x0472  */
    /* JADX WARN: Code duplicated, block: B:171:0x0477  */
    /* JADX WARN: Code duplicated, block: B:172:0x0479 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x047b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0480  */
    /* JADX WARN: Code duplicated, block: B:175:0x0482 A[PHI: r32
      0x0482: PHI (r32v3 int) = (r5v78 int), (r32v4 int) binds: [B:171:0x0477, B:174:0x0480] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:177:0x0486  */
    /* JADX WARN: Code duplicated, block: B:179:0x0491  */
    /* JADX WARN: Code duplicated, block: B:182:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:183:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:186:0x04c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x04c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:189:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:190:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x0166  */
    private final void m(long j) throws bsz {
        bsx bsxVar;
        int i;
        long j2;
        bsx bsxVar2;
        int i2;
        List list;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        byte[] bArr;
        int i9;
        boolean z2;
        int i10;
        czz czzVar;
        czz czzVar2;
        int i11;
        int i12;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z3;
        int i13;
        long j3;
        long j4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long jC;
        czz czzVar3;
        boolean z4;
        ahbp ahbpVar;
        int i19;
        while (true) {
            ArrayDeque arrayDeque = this.n;
            if (arrayDeque.isEmpty() || ((bww) arrayDeque.peek()).a != j) {
                break;
            }
            bww bwwVar = (bww) arrayDeque.pop();
            int i20 = bwwVar.d;
            int i21 = 12;
            int i22 = 8;
            int i23 = 1;
            char c2 = 0;
            if (i20 == 1836019574) {
                bsa bsaVarJ = j(bwwVar.b);
                bww bwwVarA = bwwVar.a(1836475768);
                bwwVarA.getClass();
                SparseArray sparseArray = new SparseArray();
                List list2 = bwwVarA.b;
                int size = list2.size();
                int i24 = 0;
                long jW = -9223372036854775807L;
                while (i24 < size) {
                    bwx bwxVar = (bwx) list2.get(i24);
                    int i25 = bwxVar.d;
                    if (i25 == 1953654136) {
                        bwb bwbVar = bwxVar.a;
                        bwbVar.P(i21);
                        Pair pairCreate = Pair.create(Integer.valueOf(bwbVar.i()), new czw(bwbVar.i() - 1, bwbVar.i(), bwbVar.i(), bwbVar.i()));
                        sparseArray.put(((Integer) pairCreate.first).intValue(), (czw) pairCreate.second);
                    } else if (i25 == 1835362404) {
                        bwb bwbVar2 = bwxVar.a;
                        bwbVar2.P(8);
                        int i26 = bwbVar2.i();
                        int i27 = czv.a;
                        jW = ((i26 >> 24) & 255) == 0 ? bwbVar2.w() : bwbVar2.x();
                    }
                    i24++;
                    i21 = 12;
                }
                bww bwwVarA2 = bwwVar.a(1835365473);
                bsx bsxVarB = bwwVarA2 != null ? czv.b(bwwVarA2) : null;
                cvr cvrVar = new cvr();
                bwx bwxVarB = bwwVar.b(1969517665);
                if (bwxVarB != null) {
                    bsx bsxVarC = czv.c(bwxVarB, false);
                    cvrVar.b(bsxVarC);
                    bsxVar = bsxVarC;
                } else {
                    bsxVar = null;
                }
                bwx bwxVarB2 = bwwVar.b(1836476516);
                bwxVarB2.getClass();
                bsx bsxVar3 = new bsx(-9223372036854775807L, czv.d(bwxVarB2.a));
                long j5 = jW;
                List listI = czv.i(bwwVar, cvrVar, j5, bsaVarJ, (this.e & 16) != 0, false, new hfw(this, i23));
                int size2 = listI.size();
                SparseArray sparseArray2 = this.g;
                if (sparseArray2.size() == 0) {
                    String strL = om.l(listI);
                    int i28 = 0;
                    while (i28 < size2) {
                        dal dalVar = (dal) listI.get(i28);
                        daj dajVar = dalVar.a;
                        char c3 = c2;
                        if (dajVar.m) {
                            cvk cvkVar = this.I;
                            i = i23;
                            int i29 = dajVar.b;
                            cwj cwjVarS = cvkVar.s(i28, i29);
                            if (j5 == -9223372036854775807L && dajVar.i == null) {
                                j2 = dajVar.f;
                                if (j2 == -9223372036854775807L) {
                                    j2 = dajVar.e;
                                }
                            } else {
                                j2 = dajVar.e;
                            }
                            cwjVarS.f();
                            bse bseVar = dajVar.g;
                            bsxVar2 = bsxVar3;
                            bsd bsdVar = new bsd(bseVar);
                            bsdVar.a(strL);
                            nj.i(i29, cvrVar, bsdVar);
                            bsx[] bsxVarArr = new bsx[2];
                            bsxVarArr[c3] = bsxVar;
                            bsxVarArr[i] = bsxVar2;
                            nj.j(i29, bsxVarB, bsdVar, bseVar.m, bsxVarArr);
                            int i30 = dajVar.a;
                            sparseArray2.put(i30, new czz(cwjVarS, dalVar, o(sparseArray, i30), new bse(bsdVar)));
                            this.A = Math.max(this.A, j2);
                        } else {
                            bsxVar2 = bsxVar3;
                            i = i23;
                        }
                        i28++;
                        c2 = c3;
                        i23 = i;
                        bsxVar3 = bsxVar2;
                        j5 = j5;
                        cvrVar = cvrVar;
                        strL = strL;
                    }
                    this.I.t();
                } else {
                    int i31 = 0;
                    for (int i32 = 0; i32 < size2; i32++) {
                        if (((dal) listI.get(i32)).a.m) {
                            i31++;
                        }
                    }
                    ahno.O(sparseArray2.size() == i31);
                    for (int i33 = 0; i33 < size2; i33++) {
                        dal dalVar2 = (dal) listI.get(i33);
                        daj dajVar2 = dalVar2.a;
                        if (dajVar2.m) {
                            int i34 = dajVar2.a;
                            ((czz) sparseArray2.get(i34)).d(dalVar2, o(sparseArray, i34));
                        }
                    }
                }
            } else {
                boolean z5 = true;
                int i35 = 0;
                int i36 = 16;
                if (i20 == 1836019558) {
                    SparseArray sparseArray3 = this.g;
                    int i37 = this.e;
                    byte[] bArr2 = this.k;
                    List list3 = bwwVar.c;
                    int size3 = list3.size();
                    int i38 = 0;
                    while (i38 < size3) {
                        bww bwwVar2 = (bww) list3.get(i38);
                        if (bwwVar2.d == 1953653094) {
                            bwx bwxVarB3 = bwwVar2.b(1952868452);
                            bwxVarB3.getClass();
                            bwb bwbVar3 = bwxVarB3.a;
                            bwbVar3.P(i22);
                            int i39 = bwbVar3.i();
                            int i40 = czv.a;
                            czz czzVar4 = (czz) sparseArray3.get(bwbVar3.i());
                            if (czzVar4 == null) {
                                czzVar4 = null;
                            } else {
                                if ((i39 & 1) != 0) {
                                    long jX = bwbVar3.x();
                                    dak dakVar = czzVar4.b;
                                    dakVar.b = jX;
                                    dakVar.c = jX;
                                }
                                czw czwVar = czzVar4.e;
                                czzVar4.b.a = new czw((i39 & 2) != 0 ? bwbVar3.i() - 1 : czwVar.a, (i39 & 8) != 0 ? bwbVar3.i() : czwVar.b, (i39 & 16) != 0 ? bwbVar3.i() : czwVar.c, (i39 & 32) != 0 ? bwbVar3.i() : czwVar.d);
                            }
                            if (czzVar4 == null) {
                                i2 = i37;
                                list = list3;
                                i3 = size3;
                                i5 = i38;
                                i6 = i35;
                                z = z5;
                                i7 = i36;
                                i4 = 8;
                            } else {
                                dak dakVar2 = czzVar4.b;
                                long j6 = dakVar2.o;
                                boolean z6 = dakVar2.p;
                                czzVar4.e();
                                czzVar4.l = z5;
                                bwx bwxVarB4 = bwwVar2.b(1952867444);
                                if (bwxVarB4 == null || (i37 & 2) != 0) {
                                    dakVar2.o = j6;
                                    dakVar2.p = z6;
                                } else {
                                    bwb bwbVar4 = bwxVarB4.a;
                                    bwbVar4.P(8);
                                    dakVar2.o = ((bwbVar4.i() >> 24) & 255) == 1 ? bwbVar4.v() : bwbVar4.w();
                                    dakVar2.p = true;
                                }
                                List list4 = bwwVar2.b;
                                int size4 = list4.size();
                                i2 = i37;
                                int i41 = i35;
                                int i42 = i41;
                                int i43 = i42;
                                while (true) {
                                    i8 = 1953658222;
                                    if (i41 >= size4) {
                                        break;
                                    }
                                    List list5 = list3;
                                    bwx bwxVar2 = (bwx) list4.get(i41);
                                    int i44 = size3;
                                    if (bwxVar2.d == 1953658222) {
                                        bwb bwbVar5 = bwxVar2.a;
                                        bwbVar5.P(12);
                                        int iQ = bwbVar5.q();
                                        if (iQ > 0) {
                                            i43 += iQ;
                                            i42++;
                                        }
                                    }
                                    i41++;
                                    size3 = i44;
                                    list3 = list5;
                                }
                                list = list3;
                                i3 = size3;
                                int i45 = i35;
                                czzVar4.h = i45;
                                czzVar4.g = i45;
                                czzVar4.f = i45;
                                dakVar2.d = i42;
                                dakVar2.e = i43;
                                if (dakVar2.g.length < i42) {
                                    dakVar2.f = new long[i42];
                                    dakVar2.g = new int[i42];
                                }
                                if (dakVar2.h.length < i43) {
                                    int i46 = (i43 * R.styleable.AppCompatTheme_windowMinWidthMinor) / 100;
                                    dakVar2.h = new int[i46];
                                    dakVar2.i = new long[i46];
                                    dakVar2.j = new boolean[i46];
                                    dakVar2.l = new boolean[i46];
                                }
                                int i47 = 0;
                                int i48 = 0;
                                int i49 = 0;
                                while (i47 < size4) {
                                    long jA = 0;
                                    bwx bwxVar3 = (bwx) list4.get(i47);
                                    if (bwxVar3.d == i8) {
                                        int i50 = i48 + 1;
                                        bwb bwbVar6 = bwxVar3.a;
                                        bwbVar6.P(8);
                                        int i51 = bwbVar6.i();
                                        daj dajVar3 = czzVar4.d.a;
                                        int i52 = i48;
                                        czw czwVar2 = dakVar2.a;
                                        int i53 = bwp.a;
                                        dakVar2.g[i52] = bwbVar6.q();
                                        long[] jArr2 = dakVar2.f;
                                        int i54 = i49;
                                        long j7 = dakVar2.b;
                                        jArr2[i52] = j7;
                                        if ((i51 & 1) != 0) {
                                            jArr2[i52] = j7 + ((long) bwbVar6.i());
                                        }
                                        boolean z7 = (i51 & 4) != 0;
                                        int i55 = czwVar2.d;
                                        int i56 = z7 ? bwbVar6.i() : i55;
                                        boolean z8 = z7;
                                        int i57 = i51 & SemanticState.Hidden;
                                        int i58 = i51 & SemanticState.LiveRegion;
                                        int i59 = i51 & SemanticState.ReadOnly;
                                        int i60 = i51 & SemanticState.Modal;
                                        ahbp ahbpVar2 = dajVar3.i;
                                        if (ahbpVar2 != null) {
                                            i10 = size4;
                                            if (ahbpVar2.b == 1 && (ahbpVar = dajVar3.j) != null) {
                                                if (ahbpVar2.a(0) == 0) {
                                                    czzVar2 = czzVar4;
                                                    i11 = i55;
                                                    i12 = i56;
                                                } else {
                                                    long jA2 = ahbpVar2.a(0);
                                                    i11 = i55;
                                                    i12 = i56;
                                                    czzVar2 = czzVar4;
                                                    i19 = bwp.C(jA2, 1000000L, dajVar3.d) + bwp.C(ahbpVar.a(0), 1000000L, dajVar3.c) >= dajVar3.e ? 0 : 0;
                                                }
                                                jA = ahbpVar.a(i19);
                                            }
                                            iArr = dakVar2.h;
                                            jArr = dakVar2.i;
                                            zArr = dakVar2.j;
                                            if (dajVar3.b == 2 || (i2 & 1) == 0) {
                                                z3 = false;
                                            } else {
                                                z3 = true;
                                            }
                                            i13 = i54 + dakVar2.g[i52];
                                            j3 = dajVar3.c;
                                            j4 = dakVar2.o;
                                            i14 = i54;
                                            while (i14 < i13) {
                                                if (i57 != 0) {
                                                    i15 = bwbVar6.i();
                                                } else {
                                                    i15 = czwVar2.b;
                                                }
                                                n(i15);
                                                if (i58 != 0) {
                                                    i16 = bwbVar6.i();
                                                } else {
                                                    i16 = czwVar2.c;
                                                }
                                                n(i16);
                                                if (i59 != 0) {
                                                    i17 = bwbVar6.i();
                                                } else if (i14 != 0) {
                                                    i17 = i11;
                                                } else if (z8) {
                                                    i17 = i12;
                                                    i14 = 0;
                                                } else {
                                                    i14 = 0;
                                                    i17 = i11;
                                                }
                                                if (i60 != 0) {
                                                    i18 = bwbVar6.i();
                                                } else {
                                                    i18 = 0;
                                                }
                                                czw czwVar3 = czwVar2;
                                                jC = bwp.C((((long) i18) + j4) - jA, 1000000L, j3);
                                                jArr[i14] = jC;
                                                if (dakVar2.p) {
                                                    czzVar3 = czzVar2;
                                                } else {
                                                    czzVar3 = czzVar2;
                                                    jArr[i14] = jC + czzVar3.d.i;
                                                }
                                                iArr[i14] = i16;
                                                if (((i17 >> 16) & 1) != 0) {
                                                    z4 = false;
                                                } else if (z3) {
                                                    z4 = true;
                                                } else if (i14 == 0) {
                                                    z4 = true;
                                                    i14 = 0;
                                                } else {
                                                    z4 = false;
                                                }
                                                zArr[i14] = z4;
                                                j4 += (long) i15;
                                                czzVar2 = czzVar3;
                                                z3 = z3;
                                                i13 = i13;
                                                czwVar2 = czwVar3;
                                                i14++;
                                                i11 = i11;
                                            }
                                            czzVar = czzVar2;
                                            dakVar2.o = j4;
                                            i48 = i50;
                                            i49 = i13;
                                        } else {
                                            i10 = size4;
                                        }
                                        czzVar2 = czzVar4;
                                        i11 = i55;
                                        i12 = i56;
                                        iArr = dakVar2.h;
                                        jArr = dakVar2.i;
                                        zArr = dakVar2.j;
                                        if (dajVar3.b == 2) {
                                            z3 = false;
                                        } else {
                                            z3 = false;
                                        }
                                        i13 = i54 + dakVar2.g[i52];
                                        j3 = dajVar3.c;
                                        j4 = dakVar2.o;
                                        i14 = i54;
                                        while (i14 < i13) {
                                            if (i57 != 0) {
                                                i15 = bwbVar6.i();
                                            } else {
                                                i15 = czwVar2.b;
                                            }
                                            n(i15);
                                            if (i58 != 0) {
                                                i16 = bwbVar6.i();
                                            } else {
                                                i16 = czwVar2.c;
                                            }
                                            n(i16);
                                            if (i59 != 0) {
                                                i17 = bwbVar6.i();
                                            } else if (i14 != 0) {
                                                i17 = i11;
                                            } else if (z8) {
                                                i17 = i12;
                                                i14 = 0;
                                            } else {
                                                i14 = 0;
                                                i17 = i11;
                                            }
                                            if (i60 != 0) {
                                                i18 = bwbVar6.i();
                                            } else {
                                                i18 = 0;
                                            }
                                            czw czwVar4 = czwVar2;
                                            jC = bwp.C((((long) i18) + j4) - jA, 1000000L, j3);
                                            jArr[i14] = jC;
                                            if (dakVar2.p) {
                                                czzVar3 = czzVar2;
                                                jArr[i14] = jC + czzVar3.d.i;
                                            } else {
                                                czzVar3 = czzVar2;
                                            }
                                            iArr[i14] = i16;
                                            if (((i17 >> 16) & 1) != 0) {
                                                z4 = false;
                                            } else if (z3) {
                                                z4 = true;
                                            } else if (i14 == 0) {
                                                z4 = true;
                                                i14 = 0;
                                            } else {
                                                z4 = false;
                                            }
                                            zArr[i14] = z4;
                                            j4 += (long) i15;
                                            czzVar2 = czzVar3;
                                            z3 = z3;
                                            i13 = i13;
                                            czwVar2 = czwVar4;
                                            i14++;
                                            i11 = i11;
                                        }
                                        czzVar = czzVar2;
                                        dakVar2.o = j4;
                                        i48 = i50;
                                        i49 = i13;
                                    } else {
                                        i10 = size4;
                                        czzVar = czzVar4;
                                    }
                                    czzVar4 = czzVar;
                                    i38 = i38;
                                    size4 = i10;
                                    i47++;
                                    i8 = 1953658222;
                                }
                                i5 = i38;
                                daj dajVar4 = czzVar4.d.a;
                                czw czwVar5 = dakVar2.a;
                                czwVar5.getClass();
                                yhk yhkVarA = dajVar4.a(czwVar5.a);
                                bwx bwxVarB5 = bwwVar2.b(1935763834);
                                if (bwxVarB5 != null) {
                                    yhkVarA.getClass();
                                    bwb bwbVar7 = bwxVarB5.a;
                                    bwbVar7.P(8);
                                    if ((bwbVar7.i() & 1) == 1) {
                                        bwbVar7.Q(8);
                                    }
                                    int iN = bwbVar7.n();
                                    int iQ2 = bwbVar7.q();
                                    int i61 = dakVar2.e;
                                    if (iQ2 > i61) {
                                        throw new bsz(a.bQ(i61, iQ2, "Saiz sample count ", " is greater than fragment sample count"), null, true, 1);
                                    }
                                    int i62 = yhkVarA.a;
                                    if (iN == 0) {
                                        boolean[] zArr2 = dakVar2.l;
                                        i9 = 0;
                                        for (int i63 = 0; i63 < iQ2; i63++) {
                                            int iN2 = bwbVar7.n();
                                            i9 += iN2;
                                            zArr2[i63] = iN2 > i62;
                                        }
                                        z2 = false;
                                    } else {
                                        boolean z9 = iN > i62;
                                        i9 = iN * iQ2;
                                        z2 = false;
                                        Arrays.fill(dakVar2.l, 0, iQ2, z9);
                                    }
                                    Arrays.fill(dakVar2.l, iQ2, dakVar2.e, z2);
                                    if (i9 > 0) {
                                        dakVar2.b(i9);
                                    }
                                }
                                bwx bwxVarB6 = bwwVar2.b(1935763823);
                                if (bwxVarB6 != null) {
                                    bwb bwbVar8 = bwxVarB6.a;
                                    bwbVar8.P(8);
                                    int i64 = bwbVar8.i();
                                    if ((i64 & 1) == 1) {
                                        bwbVar8.Q(8);
                                    }
                                    int iQ3 = bwbVar8.q();
                                    if (iQ3 != 1) {
                                        throw new bsz(a.bR(iQ3, "Unexpected saio entry count: "), null, true, 1);
                                    }
                                    dakVar2.c += ((i64 >> 24) & 255) == 0 ? bwbVar8.w() : bwbVar8.x();
                                }
                                bwx bwxVarB7 = bwwVar2.b(1936027235);
                                if (bwxVarB7 != null) {
                                    l(bwxVarB7.a, 0, dakVar2);
                                }
                                Object obj = yhkVarA != null ? yhkVarA.d : null;
                                bwb bwbVar9 = null;
                                bwb bwbVar10 = null;
                                for (int i65 = 0; i65 < list4.size(); i65++) {
                                    bwx bwxVar4 = (bwx) list4.get(i65);
                                    bwb bwbVar11 = bwxVar4.a;
                                    int i66 = bwxVar4.d;
                                    if (i66 == 1935828848) {
                                        bwbVar11.P(12);
                                        if (bwbVar11.i() == 1936025959) {
                                            bwbVar9 = bwbVar11;
                                        }
                                    } else if (i66 == 1936158820) {
                                        bwbVar11.P(12);
                                        if (bwbVar11.i() == 1936025959) {
                                            bwbVar10 = bwbVar11;
                                        }
                                    }
                                }
                                if (bwbVar9 == null || bwbVar10 == null) {
                                    z = true;
                                } else {
                                    bwbVar9.P(8);
                                    int i67 = bwbVar9.i() >> 24;
                                    bwbVar9.Q(4);
                                    if ((i67 & 255) == 1) {
                                        bwbVar9.Q(4);
                                    }
                                    if (bwbVar9.i() != 1) {
                                        throw new bsz("Entry count in sbgp != 1 (unsupported).", null, false, 1);
                                    }
                                    bwbVar10.P(8);
                                    int i68 = bwbVar10.i() >> 24;
                                    bwbVar10.Q(4);
                                    int i69 = i68 & 255;
                                    long jW2 = i69 > 0 ? bwbVar10.w() : 0L;
                                    if (i69 >= 2) {
                                        bwbVar10.Q(4);
                                    }
                                    if (bwbVar10.w() != 1) {
                                        throw new bsz("Entry count in sgpd != 1 (unsupported).", null, false, 1);
                                    }
                                    if (i69 > 0 && jW2 == 0) {
                                        bwbVar10.Q(4);
                                    }
                                    z = true;
                                    bwbVar10.Q(1);
                                    int iN3 = bwbVar10.n();
                                    int i70 = (iN3 & 240) >> 4;
                                    int i71 = iN3 & 15;
                                    if (bwbVar10.n() == 1) {
                                        int iN4 = bwbVar10.n();
                                        int i72 = i36;
                                        byte[] bArr3 = new byte[i72];
                                        bwbVar10.K(bArr3, 0, i72);
                                        if (iN4 == 0) {
                                            int iN5 = bwbVar10.n();
                                            byte[] bArr4 = new byte[iN5];
                                            bwbVar10.K(bArr4, 0, iN5);
                                            bArr = bArr4;
                                        } else {
                                            bArr = null;
                                        }
                                        dakVar2.k = true;
                                        dakVar2.q = new yhk(true, (String) obj, iN4, bArr3, i70, i71, bArr, null);
                                    }
                                }
                                int size5 = list4.size();
                                for (int i73 = 0; i73 < size5; i73++) {
                                    bwx bwxVar5 = (bwx) list4.get(i73);
                                    if (bwxVar5.d == 1970628964) {
                                        bwb bwbVar12 = bwxVar5.a;
                                        bwbVar12.P(8);
                                        bwbVar12.K(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, b)) {
                                            l(bwbVar12, 16, dakVar2);
                                        }
                                    }
                                }
                                i4 = 8;
                                i6 = 0;
                                i7 = 16;
                            }
                        } else {
                            i2 = i37;
                            list = list3;
                            i3 = size3;
                            i4 = i22;
                            i5 = i38;
                            i6 = i35;
                            z = z5;
                            i7 = i36;
                        }
                        i38 = i5 + 1;
                        i22 = i4;
                        i35 = i6;
                        z5 = z;
                        i36 = i7;
                        i37 = i2;
                        size3 = i3;
                        list3 = list;
                    }
                    int i74 = i35;
                    bsa bsaVarJ2 = j(bwwVar.b);
                    if (bsaVarJ2 != null) {
                        int size6 = sparseArray3.size();
                        for (int i75 = i74; i75 < size6; i75++) {
                            czz czzVar5 = (czz) sparseArray3.valueAt(i75);
                            daj dajVar5 = czzVar5.d.a;
                            czw czwVar6 = czzVar5.b.a;
                            int i76 = bwp.a;
                            yhk yhkVarA2 = dajVar5.a(czwVar6.a);
                            bsa bsaVarB = bsaVarJ2.b((String) (yhkVarA2 != null ? yhkVarA2.d : null));
                            bsd bsdVar2 = new bsd(czzVar5.k);
                            bsdVar2.s = bsaVarB;
                            bse bseVar2 = new bse(bsdVar2);
                            if (czzVar5.j != null) {
                                czzVar5.j = bseVar2;
                            } else {
                                czzVar5.a.b(bseVar2);
                            }
                        }
                    }
                    if (this.z != -9223372036854775807L) {
                        int size7 = sparseArray3.size();
                        for (int i77 = i74; i77 < size7; i77++) {
                            czz czzVar6 = (czz) sparseArray3.valueAt(i77);
                            long j8 = this.z;
                            int i78 = czzVar6.f;
                            while (true) {
                                dak dakVar3 = czzVar6.b;
                                if (i78 >= dakVar3.e || dakVar3.a(i78) > j8) {
                                    break;
                                }
                                if (dakVar3.j[i78]) {
                                    czzVar6.i = i78;
                                }
                                i78++;
                            }
                        }
                        this.z = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((bww) arrayDeque.peek()).c(bwwVar);
                }
            }
        }
        k();
    }

    private static void n(int i) throws bsz {
        if (i < 0) {
            throw new bsz(a.bR(i, "Unexpected negative value: "), null, true, 1);
        }
    }

    private static final czw o(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (czw) sparseArray.valueAt(0);
        }
        czw czwVar = (czw) sparseArray.get(i);
        czwVar.getClass();
        return czwVar;
    }

    private final void p(cvz cvzVar, qha qhaVar) {
        this.I.z(cvzVar);
        this.K = true;
        qhaVar.a = this.N;
        k();
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return this.r;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        int i;
        int i2 = this.e;
        if ((i2 & 32) == 0) {
            cvkVar = new dbo(cvkVar, this.d);
        }
        this.I = cvkVar;
        k();
        cwj[] cwjVarArr = new cwj[2];
        this.J = cwjVarArr;
        cwj cwjVar = this.q;
        int i3 = 0;
        if (cwjVar != null) {
            cwjVarArr[0] = cwjVar;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            cwjVarArr[i] = this.I.s(100, 5);
            i4 = 101;
            i++;
        }
        cwj[] cwjVarArr2 = (cwj[]) bwp.ai(this.J, i);
        this.J = cwjVarArr2;
        for (cwj cwjVar2 : cwjVarArr2) {
            cwjVar2.b(c);
        }
        List list = this.f;
        this.a = new cwj[list.size()];
        while (i3 < this.a.length) {
            cwj cwjVarS = this.I.s(i4, 3);
            cwjVarS.b((bse) list.get(i3));
            this.a[i3] = cwjVarS;
            i3++;
            i4++;
        }
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        SparseArray sparseArray = this.g;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((czz) sparseArray.valueAt(i)).e();
        }
        this.o.clear();
        this.y = 0;
        this.p.a.clear();
        this.z = j2;
        this.n.clear();
        this.N = -1L;
        k();
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        cwd cwdVarA = dah.a(cvjVar, true);
        this.r = cwdVarA != null ? agke.q(cwdVarA) : agpi.a;
        return cwdVarA == null;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x036a  */
    /* JADX WARN: Code duplicated, block: B:166:0x0375  */
    /* JADX WARN: Code duplicated, block: B:167:0x0378  */
    /* JADX WARN: Code duplicated, block: B:169:0x037b  */
    /* JADX WARN: Code duplicated, block: B:170:0x037e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0397  */
    /* JADX WARN: Code duplicated, block: B:175:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:178:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:181:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061 A[PHI: r26
      0x0061: PHI (r26v7 char) = (r26v5 char), (r26v8 char) binds: [B:21:0x005f, B:18:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:257:0x0585  */
    /* JADX WARN: Code duplicated, block: B:259:0x0588  */
    /* JADX WARN: Code duplicated, block: B:260:0x058a  */
    /* JADX WARN: Code duplicated, block: B:375:0x0892  */
    /* JADX WARN: Code duplicated, block: B:376:0x08ab  */
    /* JADX WARN: Code duplicated, block: B:378:0x08af  */
    /* JADX WARN: Code duplicated, block: B:380:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:382:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:383:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:386:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:389:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:398:0x0900  */
    /* JADX WARN: Code duplicated, block: B:400:0x0904  */
    /* JADX WARN: Code duplicated, block: B:401:0x093e  */
    /* JADX WARN: Code duplicated, block: B:403:0x0949  */
    /* JADX WARN: Code duplicated, block: B:411:0x0965  */
    /* JADX WARN: Code duplicated, block: B:419:0x0990  */
    /* JADX WARN: Code duplicated, block: B:421:0x0999 A[LOOP:1: B:420:0x0997->B:421:0x0999, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:424:0x09af  */
    /* JADX WARN: Code duplicated, block: B:426:0x09bd  */
    /* JADX WARN: Code duplicated, block: B:428:0x09c2  */
    /* JADX WARN: Code duplicated, block: B:519:0x0ad3  */
    /* JADX WARN: Code duplicated, block: B:521:0x0ae0  */
    /* JADX WARN: Code duplicated, block: B:526:0x0b15  */
    /* JADX WARN: Code duplicated, block: B:527:0x0b19  */
    /* JADX WARN: Code duplicated, block: B:552:0x0876 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:0x058b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x03bf A[EDGE_INSN: B:605:0x03bf->B:179:0x03bf BREAK  A[LOOP:10: B:171:0x038f->B:609:?], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) throws bsz {
        boolean z;
        int i;
        czz czzVar;
        char c2;
        int i2;
        int i3;
        boolean z2;
        int iA;
        int i4;
        yhk yhkVarG;
        Object obj;
        long j;
        ArrayDeque arrayDeque;
        czx czxVar;
        int i5;
        long j2;
        long j3;
        int i6;
        int i7;
        int iA2;
        int iC;
        String strH;
        int iHashCode;
        int iB;
        char c3;
        long jC;
        int i8;
        bwb bwbVar;
        long jW;
        String strS;
        long jW2;
        long j4;
        long j5;
        String str;
        long j6;
        long j7;
        int i9;
        long j8;
        cvb cvbVar;
        long j9;
        ArrayDeque arrayDeque2;
        long j10;
        long j11;
        cvb cvbVar2;
        long j12;
        int i10;
        long j13;
        int i11;
        long j14;
        long j15;
        SparseArray sparseArray;
        int size;
        int i12;
        while (true) {
            int i13 = this.s;
            int i14 = 2;
            int i15 = 8;
            z = true;
            i = 0;
            if (i13 == 0) {
                int i16 = -1;
                if (this.v == 0) {
                    bwb bwbVar2 = this.m;
                    if (cvjVar.o(bwbVar2.b, 0, 8, true)) {
                        this.v = 8;
                        bwbVar2.P(0);
                        this.u = bwbVar2.w();
                        this.t = bwbVar2.i();
                        j8 = this.u;
                        if (j8 == 1) {
                            bwb bwbVar3 = this.m;
                            ((cvb) cvjVar).o(bwbVar3.b, 8, 8, false);
                            this.v += 8;
                            this.u = bwbVar3.x();
                        } else if (j8 == 0) {
                            cvbVar = (cvb) cvjVar;
                            j9 = cvbVar.a;
                            if (j9 == -1) {
                                arrayDeque2 = this.n;
                                if (arrayDeque2.isEmpty()) {
                                    j9 = -1;
                                } else {
                                    j9 = ((bww) arrayDeque2.peek()).a;
                                }
                            }
                            if (j9 != -1) {
                                this.u = (j9 - cvbVar.b) + ((long) this.v);
                            }
                        }
                        j10 = this.u;
                        int i17 = this.v;
                        j11 = i17;
                        if (j10 < j11) {
                            if (this.t == 1718773093 || i17 != 8) {
                                throw new bsz("Atom size less than header length (unsupported).", null, false, 1);
                            }
                            this.u = j11;
                            j10 = j11;
                        }
                        if (this.M != -1) {
                            if (this.t == 1936286840) {
                                bwb bwbVar4 = this.l;
                                bwbVar4.L((int) j10);
                                System.arraycopy(this.m.b, 0, bwbVar4.b, 0, 8);
                                ((cvb) cvjVar).o(bwbVar4.b, 8, (int) (this.u - ((long) this.v)), false);
                                this.P.l((cuz) i(new bwx(1936286840, bwbVar4).a, cvjVar.e()).second);
                            } else {
                                cvjVar.p((int) (j10 - j11), true);
                            }
                            k();
                        } else {
                            cvbVar2 = (cvb) cvjVar;
                            j12 = cvbVar2.b - j11;
                            i10 = this.t;
                            if ((i10 != 1836019558 || i10 == 1835295092) && !this.K) {
                                j13 = cvbVar2.a;
                                if (j13 == -1 && this.N == -1 && (this.e & SemanticState.LiveRegion) != 0) {
                                    this.N = j12;
                                    qhaVar.a = j13 - 16;
                                    this.s = 5;
                                } else {
                                    this.I.z(new cvy(this.A, j12));
                                    this.K = true;
                                    if (this.t == 1836019558) {
                                        sparseArray = this.g;
                                        size = sparseArray.size();
                                        for (i12 = 0; i12 < size; i12++) {
                                            dak dakVar = ((czz) sparseArray.valueAt(i12)).b;
                                            dakVar.c = j12;
                                            dakVar.b = j12;
                                        }
                                    }
                                    i11 = this.t;
                                    if (i11 == 1835295092) {
                                        this.C = null;
                                        this.x = j12 + this.u;
                                        this.s = 2;
                                    } else if (i11 != 1836019574 || i11 == 1953653099 || i11 == 1835297121 || i11 == 1835626086 || i11 == 1937007212 || i11 == 1836019558 || i11 == 1953653094 || i11 == 1836475768 || i11 == 1701082227 || i11 == 1835365473) {
                                        i16 = 1;
                                        long j16 = cvbVar2.b;
                                        j14 = this.u;
                                        long j17 = j16 + j14;
                                        if (j14 != this.v && i11 == 1835365473) {
                                            bwb bwbVar5 = this.l;
                                            bwbVar5.L(8);
                                            cvbVar2.n(bwbVar5.b, 0, 8, false);
                                            czv.f(bwbVar5);
                                            cvbVar2.p(bwbVar5.c, false);
                                            cvjVar.k();
                                        }
                                        j15 = j17 - 8;
                                        this.n.push(new bww(this.t, j15));
                                        if (this.u == this.v) {
                                            m(j15);
                                        } else {
                                            k();
                                        }
                                    } else if (i11 == 1751411826 || i11 == 1835296868 || i11 == 1836476516 || i11 == 1936286840 || i11 == 1937011556 || i11 == 1937011827 || i11 == 1668576371 || i11 == 1937011555 || i11 == 1937011578 || i11 == 1937013298 || i11 == 1937007471 || i11 == 1668232756 || i11 == 1937011571 || i11 == 1952867444 || i11 == 1952868452 || i11 == 1953196132 || i11 == 1953654136 || i11 == 1953658222 || i11 == 1886614376 || i11 == 1935763834 || i11 == 1935763823 || i11 == 1936027235 || i11 == 1970628964 || i11 == 1935828848 || i11 == 1936158820 || i11 == 1701606260 || i11 == 1835362404 || i11 == 1701671783 || i11 == 1969517665 || i11 == 1801812339 || i11 == 1768715124) {
                                        if (this.v != 8) {
                                            throw new bsz("Leaf atom defines extended atom size (unsupported).", null, false, 1);
                                        }
                                        if (this.u > 2147483647L) {
                                            throw new bsz("Leaf atom with length > 2147483647 (unsupported).", null, false, 1);
                                        }
                                        bwb bwbVar6 = new bwb((int) this.u);
                                        System.arraycopy(this.m.b, 0, bwbVar6.b, 0, 8);
                                        this.w = bwbVar6;
                                        i16 = 1;
                                        this.s = 1;
                                    } else {
                                        if (this.u > 2147483647L) {
                                            throw new bsz("Skipping atom with length > 2147483647 (unsupported).", null, false, 1);
                                        }
                                        this.w = null;
                                        i16 = 1;
                                        this.s = 1;
                                    }
                                }
                            } else {
                                if (this.t == 1836019558) {
                                    sparseArray = this.g;
                                    size = sparseArray.size();
                                    while (i12 < size) {
                                        dak dakVar2 = ((czz) sparseArray.valueAt(i12)).b;
                                        dakVar2.c = j12;
                                        dakVar2.b = j12;
                                    }
                                }
                                i11 = this.t;
                                if (i11 == 1835295092) {
                                    this.C = null;
                                    this.x = j12 + this.u;
                                    this.s = 2;
                                } else if (i11 != 1836019574) {
                                    i16 = 1;
                                    long j18 = cvbVar2.b;
                                    j14 = this.u;
                                    long j19 = j18 + j14;
                                    if (j14 != this.v) {
                                        bwb bwbVar7 = this.l;
                                        bwbVar7.L(8);
                                        cvbVar2.n(bwbVar7.b, 0, 8, false);
                                        czv.f(bwbVar7);
                                        cvbVar2.p(bwbVar7.c, false);
                                        cvjVar.k();
                                    }
                                    j15 = j19 - 8;
                                    this.n.push(new bww(this.t, j15));
                                    if (this.u == this.v) {
                                        m(j15);
                                    } else {
                                        k();
                                    }
                                } else {
                                    i16 = 1;
                                    long j110 = cvbVar2.b;
                                    j14 = this.u;
                                    long j111 = j110 + j14;
                                    if (j14 != this.v) {
                                        bwb bwbVar8 = this.l;
                                        bwbVar8.L(8);
                                        cvbVar2.n(bwbVar8.b, 0, 8, false);
                                        czv.f(bwbVar8);
                                        cvbVar2.p(bwbVar8.c, false);
                                        cvjVar.k();
                                    }
                                    j15 = j111 - 8;
                                    this.n.push(new bww(this.t, j15));
                                    if (this.u == this.v) {
                                        m(j15);
                                    } else {
                                        k();
                                    }
                                }
                            }
                            if (this.s == 5) {
                            }
                        }
                        i16 = 1;
                        if (this.s == 5) {
                        }
                    } else {
                        long j20 = this.M;
                        if (j20 != -1) {
                            qhaVar.a = j20;
                            this.M = -1L;
                            this.I.z(this.P.k());
                            this.L = true;
                            return 1;
                        }
                        this.p.b(0);
                    }
                } else {
                    j8 = this.u;
                    if (j8 == 1) {
                        bwb bwbVar9 = this.m;
                        ((cvb) cvjVar).o(bwbVar9.b, 8, 8, false);
                        this.v += 8;
                        this.u = bwbVar9.x();
                    } else if (j8 == 0) {
                        cvbVar = (cvb) cvjVar;
                        j9 = cvbVar.a;
                        if (j9 == -1) {
                            arrayDeque2 = this.n;
                            if (arrayDeque2.isEmpty()) {
                                j9 = ((bww) arrayDeque2.peek()).a;
                            } else {
                                j9 = -1;
                            }
                        }
                        if (j9 != -1) {
                            this.u = (j9 - cvbVar.b) + ((long) this.v);
                        }
                    }
                    j10 = this.u;
                    int i18 = this.v;
                    j11 = i18;
                    if (j10 < j11) {
                        if (this.t == 1718773093) {
                        }
                        throw new bsz("Atom size less than header length (unsupported).", null, false, 1);
                    }
                    if (this.M != -1) {
                        if (this.t == 1936286840) {
                            bwb bwbVar10 = this.l;
                            bwbVar10.L((int) j10);
                            System.arraycopy(this.m.b, 0, bwbVar10.b, 0, 8);
                            ((cvb) cvjVar).o(bwbVar10.b, 8, (int) (this.u - ((long) this.v)), false);
                            this.P.l((cuz) i(new bwx(1936286840, bwbVar10).a, cvjVar.e()).second);
                        } else {
                            cvjVar.p((int) (j10 - j11), true);
                        }
                        k();
                    } else {
                        cvbVar2 = (cvb) cvjVar;
                        j12 = cvbVar2.b - j11;
                        i10 = this.t;
                        if (i10 != 1836019558) {
                            j13 = cvbVar2.a;
                            if (j13 == -1) {
                            }
                            this.I.z(new cvy(this.A, j12));
                            this.K = true;
                            if (this.t == 1836019558) {
                                sparseArray = this.g;
                                size = sparseArray.size();
                                while (i12 < size) {
                                    dak dakVar3 = ((czz) sparseArray.valueAt(i12)).b;
                                    dakVar3.c = j12;
                                    dakVar3.b = j12;
                                }
                            }
                            i11 = this.t;
                            if (i11 == 1835295092) {
                                this.C = null;
                                this.x = j12 + this.u;
                                this.s = 2;
                            } else if (i11 != 1836019574) {
                                i16 = 1;
                                long j112 = cvbVar2.b;
                                j14 = this.u;
                                long j113 = j112 + j14;
                                if (j14 != this.v) {
                                    bwb bwbVar11 = this.l;
                                    bwbVar11.L(8);
                                    cvbVar2.n(bwbVar11.b, 0, 8, false);
                                    czv.f(bwbVar11);
                                    cvbVar2.p(bwbVar11.c, false);
                                    cvjVar.k();
                                }
                                j15 = j113 - 8;
                                this.n.push(new bww(this.t, j15));
                                if (this.u == this.v) {
                                    m(j15);
                                } else {
                                    k();
                                }
                            } else {
                                i16 = 1;
                                long j114 = cvbVar2.b;
                                j14 = this.u;
                                long j115 = j114 + j14;
                                if (j14 != this.v) {
                                    bwb bwbVar12 = this.l;
                                    bwbVar12.L(8);
                                    cvbVar2.n(bwbVar12.b, 0, 8, false);
                                    czv.f(bwbVar12);
                                    cvbVar2.p(bwbVar12.c, false);
                                    cvjVar.k();
                                }
                                j15 = j115 - 8;
                                this.n.push(new bww(this.t, j15));
                                if (this.u == this.v) {
                                    m(j15);
                                } else {
                                    k();
                                }
                            }
                            if (this.s == 5) {
                            }
                        } else {
                            j13 = cvbVar2.a;
                            if (j13 == -1) {
                            }
                            this.I.z(new cvy(this.A, j12));
                            this.K = true;
                            if (this.t == 1836019558) {
                                sparseArray = this.g;
                                size = sparseArray.size();
                                while (i12 < size) {
                                    dak dakVar4 = ((czz) sparseArray.valueAt(i12)).b;
                                    dakVar4.c = j12;
                                    dakVar4.b = j12;
                                }
                            }
                            i11 = this.t;
                            if (i11 == 1835295092) {
                                this.C = null;
                                this.x = j12 + this.u;
                                this.s = 2;
                            } else if (i11 != 1836019574) {
                                i16 = 1;
                                long j116 = cvbVar2.b;
                                j14 = this.u;
                                long j117 = j116 + j14;
                                if (j14 != this.v) {
                                    bwb bwbVar13 = this.l;
                                    bwbVar13.L(8);
                                    cvbVar2.n(bwbVar13.b, 0, 8, false);
                                    czv.f(bwbVar13);
                                    cvbVar2.p(bwbVar13.c, false);
                                    cvjVar.k();
                                }
                                j15 = j117 - 8;
                                this.n.push(new bww(this.t, j15));
                                if (this.u == this.v) {
                                    m(j15);
                                } else {
                                    k();
                                }
                            } else {
                                i16 = 1;
                                long j118 = cvbVar2.b;
                                j14 = this.u;
                                long j119 = j118 + j14;
                                if (j14 != this.v) {
                                    bwb bwbVar14 = this.l;
                                    bwbVar14.L(8);
                                    cvbVar2.n(bwbVar14.b, 0, 8, false);
                                    czv.f(bwbVar14);
                                    cvbVar2.p(bwbVar14.c, false);
                                    cvjVar.k();
                                }
                                j15 = j119 - 8;
                                this.n.push(new bww(this.t, j15));
                                if (this.u == this.v) {
                                    m(j15);
                                } else {
                                    k();
                                }
                            }
                            if (this.s == 5) {
                            }
                        }
                    }
                    i16 = 1;
                    if (this.s == 5) {
                    }
                }
                return i16;
            }
            if (i13 == 1) {
                long j21 = this.u - ((long) this.v);
                bwb bwbVar15 = this.w;
                int i19 = (int) j21;
                if (bwbVar15 != null) {
                    cvb cvbVar3 = (cvb) cvjVar;
                    cvbVar3.o(bwbVar15.b, 8, i19, false);
                    bwx bwxVar = new bwx(this.t, bwbVar15);
                    ArrayDeque arrayDeque3 = this.n;
                    if (arrayDeque3.isEmpty()) {
                        int i20 = bwxVar.d;
                        if (i20 == 1936286840) {
                            Pair pairI = i(bwxVar.a, cvbVar3.b);
                            zs zsVar = this.P;
                            zsVar.l((cuz) pairI.second);
                            this.B = ((Long) pairI.first).longValue();
                            if (this.L) {
                                i9 = 1;
                            } else {
                                i9 = 1;
                                this.I.z(zsVar.j() == 1 ? (cvz) pairI.second : zsVar.k());
                                this.K = true;
                            }
                            if ((this.e & SemanticState.Hidden) != 0 && !this.L && zsVar.j() > i9) {
                                this.M = cvbVar3.b;
                            }
                        } else if (i20 == 1701671783) {
                            bwb bwbVar16 = bwxVar.a;
                            if (this.J.length != 0) {
                                bwbVar16.P(8);
                                int i21 = bwbVar16.i();
                                int i22 = czv.a;
                                int i23 = (i21 >> 24) & 255;
                                if (i23 == 0) {
                                    strS = bwbVar16.S();
                                    strS.getClass();
                                    String strS2 = bwbVar16.S();
                                    strS2.getClass();
                                    long jW3 = bwbVar16.w();
                                    long jC2 = bwp.C(bwbVar16.w(), 1000000L, jW3);
                                    long j22 = this.B;
                                    long j23 = j22 != -9223372036854775807L ? j22 + jC2 : -9223372036854775807L;
                                    long jC3 = bwp.C(bwbVar16.w(), 1000L, jW3);
                                    jW2 = bwbVar16.w();
                                    j4 = -9223372036854775807L;
                                    j5 = j23;
                                    str = strS2;
                                    j6 = jC3;
                                    j7 = jC2;
                                } else if (i23 != 1) {
                                    bvx.e("FragmentedMp4Extractor", a.bR(i23, "Skipping unsupported emsg version: "));
                                } else {
                                    long jW4 = bwbVar16.w();
                                    long jC4 = bwp.C(bwbVar16.x(), 1000000L, jW4);
                                    long jC5 = bwp.C(bwbVar16.w(), 1000L, jW4);
                                    long jW5 = bwbVar16.w();
                                    strS = bwbVar16.S();
                                    strS.getClass();
                                    String strS3 = bwbVar16.S();
                                    strS3.getClass();
                                    j4 = -9223372036854775807L;
                                    j5 = jC4;
                                    j7 = -9223372036854775807L;
                                    jW2 = jW5;
                                    str = strS3;
                                    j6 = jC5;
                                }
                                String str2 = strS;
                                byte[] bArr = new byte[bwbVar16.d()];
                                bwbVar16.K(bArr, 0, bwbVar16.d());
                                long j24 = j7;
                                bwb bwbVar17 = new bwb(this.O.f(new cxt(str2, str, j6, jW2, bArr)));
                                int iD = bwbVar17.d();
                                for (cwj cwjVar : this.J) {
                                    bwbVar17.P(0);
                                    cwjVar.c(bwbVar17, iD);
                                }
                                ArrayDeque arrayDeque4 = this.o;
                                if (j5 == j4) {
                                    arrayDeque4.addLast(new czx(j24, true, iD));
                                    this.y += iD;
                                } else if (arrayDeque4.isEmpty()) {
                                    for (cwj cwjVar2 : this.J) {
                                        cwjVar2.e(j5, 1, iD, 0, null);
                                    }
                                } else {
                                    arrayDeque4.addLast(new czx(j5, false, iD));
                                    this.y += iD;
                                }
                            }
                        }
                    } else {
                        ((bww) arrayDeque3.peek()).d(bwxVar);
                    }
                } else {
                    ((cvb) cvjVar).p(i19, false);
                }
                m(((cvb) cvjVar).b);
            } else if (i13 != 2) {
                char c4 = 6;
                if (i13 == 5) {
                    bwb bwbVar18 = this.l;
                    bwbVar18.L(16);
                    if (cvjVar.o(bwbVar18.b, 0, 16, true)) {
                        bwbVar18.P(0);
                        int i24 = bwbVar18.i();
                        int i25 = bwbVar18.i();
                        if (i24 == 16 && i25 == 1835430511) {
                            bwbVar18.Q(4);
                            long jW6 = bwbVar18.w();
                            long j25 = ((cvb) cvjVar).a - jW6;
                            if (jW6 <= 0 || jW6 > 2147483647L || j25 < 0 || j25 < this.N) {
                                p(new cvy(this.A, this.N), qhaVar);
                            } else {
                                qhaVar.a = j25;
                                this.s = 6;
                            }
                        } else {
                            p(new cvy(this.A, this.N), qhaVar);
                        }
                    } else {
                        p(new cvy(this.A, this.N), qhaVar);
                    }
                    int i26 = this.s;
                    if (i26 == 6 || i26 == 0) {
                        return 1;
                    }
                } else if (i13 != 6) {
                    czzVar = this.C;
                    if (czzVar != null) {
                        c2 = 6;
                        i2 = 2;
                        break;
                    }
                    SparseArray sparseArray2 = this.g;
                    int size2 = sparseArray2.size();
                    czz czzVar2 = null;
                    long j26 = Long.MAX_VALUE;
                    int i27 = 0;
                    while (i27 < size2) {
                        int i28 = i14;
                        czz czzVar3 = (czz) sparseArray2.valueAt(i27);
                        if (czzVar3.l) {
                            c3 = c4;
                            if (czzVar3.h != czzVar3.b.d) {
                                jC = czzVar3.c();
                                if (jC < j26) {
                                    czzVar2 = czzVar3;
                                    j26 = jC;
                                }
                            }
                        } else {
                            c3 = c4;
                            if (czzVar3.f != czzVar3.d.b) {
                                jC = czzVar3.c();
                                if (jC < j26) {
                                    czzVar2 = czzVar3;
                                    j26 = jC;
                                }
                            }
                        }
                        i27++;
                        i14 = i28;
                        c4 = c3;
                    }
                    c2 = c4;
                    i2 = i14;
                    if (czzVar2 != null) {
                        cvb cvbVar4 = (cvb) cvjVar;
                        int iC2 = (int) (czzVar2.c() - cvbVar4.b);
                        if (iC2 < 0) {
                            bvx.e("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iC2 = 0;
                        }
                        cvbVar4.p(iC2, false);
                        this.C = czzVar2;
                        czzVar = czzVar2;
                        break;
                    }
                    cvb cvbVar5 = (cvb) cvjVar;
                    int i29 = (int) (this.x - cvbVar5.b);
                    if (i29 < 0) {
                        throw new bsz("Offset to end of mdat was negative.", null, true, 1);
                    }
                    cvbVar5.p(i29, false);
                    k();
                } else {
                    cvb cvbVar6 = (cvb) cvjVar;
                    long j27 = cvbVar6.a - cvbVar6.b;
                    bwb bwbVar19 = this.l;
                    bwbVar19.L(8);
                    if (cvjVar.n(bwbVar19.b, 0, 8, true)) {
                        bwbVar19.P(0);
                        int i30 = bwbVar19.i();
                        if (bwbVar19.i() != 1835430497) {
                            p(new cvy(this.A, this.N), qhaVar);
                        } else {
                            int i31 = (int) j27;
                            bwb bwbVar20 = new bwb(i31);
                            cvbVar6.o(bwbVar20.b, 0, i31, false);
                            bwbVar20.P(i30 == 1 ? 16 : 8);
                            SparseArray sparseArray3 = new SparseArray();
                            SparseArray sparseArray4 = new SparseArray();
                            while (bwbVar20.d() >= i15) {
                                int i32 = bwbVar20.c;
                                long jW7 = bwbVar20.w();
                                int i33 = bwbVar20.i();
                                if (jW7 == 1) {
                                    if (bwbVar20.d() < i15) {
                                        break;
                                    }
                                    jW7 = bwbVar20.v();
                                } else if (jW7 == 0) {
                                    jW7 = ((long) bwbVar20.d) - ((long) i32);
                                }
                                int i34 = jW7 == 1 ? 16 : i15;
                                if (jW7 < i34) {
                                    break;
                                }
                                long j28 = i32;
                                long j29 = jW7;
                                if (j29 > ((long) bwbVar20.d) - j28) {
                                    break;
                                }
                                if (i33 != 1952871009) {
                                    bwbVar = bwbVar20;
                                } else if (j29 < i34 + 16) {
                                    bwbVar20.P((int) (j28 + j29));
                                } else {
                                    int i35 = bwbVar20.i();
                                    int i36 = czv.a;
                                    int i37 = i35 >> 24;
                                    int i38 = bwbVar20.i();
                                    czz czzVar4 = (czz) this.g.get(i38);
                                    if (czzVar4 == null) {
                                        bwbVar20.P((int) (j28 + j29));
                                    } else {
                                        int i39 = i37 & 255;
                                        long j30 = czzVar4.d.a.c;
                                        int i40 = bwbVar20.i();
                                        int i41 = i40 >> 4;
                                        int i42 = i40 >> 2;
                                        int i43 = i40 & 3;
                                        bwb bwbVar21 = bwbVar20;
                                        long jW8 = bwbVar21.w();
                                        int i44 = (i41 & 3) + 1;
                                        int i45 = (i42 & 3) + 1;
                                        int i46 = i43 + 1;
                                        if (((i39 == 1 ? 16L : 8L) + ((long) i44) + ((long) i45) + ((long) i46)) * jW8 > bwbVar21.d()) {
                                            bwbVar = bwbVar21;
                                            bwbVar.P((int) (j28 + j29));
                                        } else {
                                            bwbVar = bwbVar21;
                                            int i47 = (int) jW8;
                                            long[] jArr = new long[i47];
                                            long[] jArr2 = new long[i47];
                                            int i48 = 0;
                                            while (i48 < i47) {
                                                int i49 = i47;
                                                if (i39 == 1) {
                                                    jW = bwbVar.x();
                                                    i39 = 1;
                                                } else {
                                                    jW = bwbVar.w();
                                                }
                                                long jX = i39 == 1 ? bwbVar.x() : bwbVar.w();
                                                bwbVar.Q(i44 + i45 + i46);
                                                jArr[i48] = bwp.C(jW, 1000000L, j30);
                                                jArr2[i48] = jX;
                                                i48++;
                                                i47 = i49;
                                                i39 = i39;
                                            }
                                            sparseArray3.put(i38, jArr);
                                            sparseArray4.put(i38, jArr2);
                                        }
                                        bwbVar20 = bwbVar;
                                        i15 = 8;
                                    }
                                }
                                bwbVar.P((int) (j28 + j29));
                                bwbVar20 = bwbVar;
                                i15 = 8;
                            }
                            if (sparseArray3.size() == 0) {
                                p(new cvy(this.A, this.N), qhaVar);
                            } else {
                                int iKeyAt = -1;
                                int i50 = -1;
                                for (int i51 = 0; i51 < sparseArray3.size(); i51++) {
                                    int iKeyAt2 = sparseArray3.keyAt(i51);
                                    czz czzVar5 = (czz) this.g.get(iKeyAt2);
                                    if (czzVar5 != null) {
                                        int i52 = czzVar5.d.a.b;
                                        if (iKeyAt != -1) {
                                            if (i50 != -1) {
                                                if (i52 == 1) {
                                                    i50 = iKeyAt2;
                                                } else {
                                                    i50 = -1;
                                                }
                                            }
                                        } else if (i52 == 2) {
                                            iKeyAt = iKeyAt2;
                                        } else {
                                            iKeyAt = -1;
                                            if (i50 != -1) {
                                                if (i52 == 1) {
                                                    i50 = iKeyAt2;
                                                } else {
                                                    i50 = -1;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (iKeyAt != -1) {
                                    i8 = iKeyAt;
                                } else if (i50 != -1) {
                                    i8 = i50;
                                } else {
                                    iKeyAt = sparseArray3.keyAt(0);
                                    i8 = iKeyAt;
                                }
                                p(new czy(sparseArray3, sparseArray4, this.A, this.N, i8), qhaVar);
                            }
                        }
                    } else {
                        p(new cvy(this.A, this.N), qhaVar);
                    }
                    if (this.s == 0) {
                        return 1;
                    }
                }
            } else {
                SparseArray sparseArray5 = this.g;
                int size3 = sparseArray5.size();
                czz czzVar6 = null;
                long j31 = Long.MAX_VALUE;
                for (int i53 = 0; i53 < size3; i53++) {
                    dak dakVar5 = ((czz) sparseArray5.valueAt(i53)).b;
                    if (dakVar5.n) {
                        long j32 = dakVar5.c;
                        if (j32 < j31) {
                            czzVar6 = (czz) sparseArray5.valueAt(i53);
                            j31 = j32;
                        }
                    }
                }
                if (czzVar6 == null) {
                    this.s = 3;
                } else {
                    cvb cvbVar7 = (cvb) cvjVar;
                    int i54 = (int) (j31 - cvbVar7.b);
                    if (i54 < 0) {
                        throw new bsz("Offset to encryption data was negative.", null, true, 1);
                    }
                    cvbVar7.p(i54, false);
                    dak dakVar6 = czzVar6.b;
                    bwb bwbVar22 = dakVar6.m;
                    cvbVar7.o(bwbVar22.b, 0, bwbVar22.d, false);
                    bwbVar22.P(0);
                    dakVar6.n = false;
                }
            }
        }
        if (this.s == 3) {
            this.D = !czzVar.l ? czzVar.d.d[czzVar.f] : czzVar.b.h[czzVar.f];
            String str3 = czzVar.d.a.g.q;
            this.G = !(Objects.equals(str3, "video/avc") || Objects.equals(str3, "video/hevc"));
            if (czzVar.f < czzVar.i) {
                ((cvb) cvjVar).p(this.D, false);
                yhk yhkVarG2 = czzVar.g();
                if (yhkVarG2 != null) {
                    dak dakVar7 = czzVar.b;
                    bwb bwbVar23 = dakVar7.m;
                    int i55 = yhkVarG2.a;
                    if (i55 != 0) {
                        bwbVar23.Q(i55);
                    }
                    if (dakVar7.c(czzVar.f)) {
                        bwbVar23.Q(bwbVar23.s() * 6);
                    }
                }
                if (!czzVar.f()) {
                    this.C = null;
                }
                this.s = 3;
                return 0;
            }
            if (czzVar.d.a.h == 1) {
                this.D -= 8;
                ((cvb) cvjVar).p(8, false);
            }
            boolean zEquals = "audio/ac4".equals(czzVar.d.a.g.q);
            int i56 = this.D;
            if (zEquals) {
                this.E = czzVar.b(i56, 7);
                int i57 = this.D;
                bwb bwbVar24 = this.l;
                cuq.b(i57, bwbVar24);
                czzVar.a.c(bwbVar24, 7);
                iB = this.E + 7;
                this.E = iB;
            } else {
                iB = czzVar.b(i56, 0);
                this.E = iB;
            }
            this.D += iB;
            this.s = 4;
            this.F = 0;
        }
        dal dalVar = czzVar.d;
        daj dajVar = dalVar.a;
        cwj cwjVar3 = czzVar.a;
        long jA = !czzVar.l ? dalVar.f[czzVar.f] : czzVar.b.a(czzVar.f);
        int i58 = dajVar.k;
        if (i58 == 0) {
            i3 = 3;
            if (dajVar.h == i2) {
                int i59 = this.D - this.E;
                bwb bwbVar25 = this.l;
                bwbVar25.L(i59);
                ((cvb) cvjVar).o(bwbVar25.b, 0, i59, false);
                if (czv.g(bwbVar25, dajVar.n)) {
                    int iD2 = bwbVar25.d();
                    cwjVar3.c(bwbVar25, iD2);
                    int i60 = this.E + iD2;
                    this.E = i60;
                    this.D = i60;
                } else {
                    z2 = false;
                }
                iA = czzVar.a();
                if (!this.G) {
                    iA |= 67108864;
                }
                i4 = iA;
                yhkVarG = czzVar.g();
                if (yhkVarG != null) {
                    obj = yhkVarG.e;
                } else {
                    obj = null;
                }
                if (z2) {
                    j = jA;
                    cwjVar3.e(j, i4, this.D, 0, (cwi) obj);
                } else {
                    j = jA;
                }
                while (true) {
                    arrayDeque = this.o;
                    if (!arrayDeque.isEmpty()) {
                        break;
                    }
                    czxVar = (czx) arrayDeque.removeFirst();
                    int i61 = this.y;
                    i5 = czxVar.c;
                    this.y = i61 - i5;
                    j2 = czxVar.a;
                    if (czxVar.b) {
                        j2 += j;
                    }
                    j3 = j2;
                    for (cwj cwjVar4 : this.J) {
                        cwjVar4.e(j3, 1, i5, this.y, null);
                    }
                }
                if (!czzVar.f()) {
                    this.C = null;
                }
                this.s = i3;
                return 0;
            }
            bse bseVar = czzVar.j;
            if (bseVar != null && cvh.f(dajVar.g.q)) {
                czzVar.k = cvh.d(cvjVar, this.D, czzVar.k);
                bsd bsdVar = new bsd(czzVar.k);
                bsdVar.s = bseVar.u;
                cwjVar3.b(new bse(bsdVar));
                czzVar.j = null;
            }
            while (true) {
                int i62 = this.E;
                int i63 = this.D;
                if (i62 >= i63) {
                    break;
                }
                this.E += cwjVar3.a(cvjVar, i63 - i62, false);
            }
        } else {
            bwb bwbVar26 = this.i;
            byte[] bArr2 = bwbVar26.b;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[i2] = 0;
            i3 = 3;
            int i64 = 4 - i58;
            while (true) {
                boolean z3 = z;
                if (this.E >= this.D) {
                    break;
                }
                int i65 = this.F;
                if (i65 == 0) {
                    if (this.a.length > 0 || !this.G) {
                        iC = bxf.c(dajVar.g);
                        if (i58 + iC > this.D - this.E) {
                            iC = 0;
                        }
                    } else {
                        iC = i;
                    }
                    ((cvb) cvjVar).o(bArr2, i64, i58 + iC, false);
                    bwbVar26.P(0);
                    int i66 = bwbVar26.i();
                    if (i66 < 0) {
                        throw new bsz("Invalid NAL length", null, z3, z3 ? 1 : 0);
                    }
                    this.F = i66 - iC;
                    bwb bwbVar27 = this.h;
                    bwbVar27.P(0);
                    cwjVar3.c(bwbVar27, 4);
                    this.E += 4;
                    this.D += i64;
                    this.H = (this.a.length <= 0 || iC <= 0 || (strH = bxf.h(dajVar.g)) == null || ((iHashCode = strH.hashCode()) == -1662541442 ? !(strH.equals("video/hevc") && ((bArr2[4] & 126) >> 1) == 39) : iHashCode == 1331836730 ? !(strH.equals("video/avc") && (bArr2[4] & 31) == c2) : !(iHashCode == 1331856911 && strH.equals("video/vvc") && ((bArr2[5] & 248) >> 3) == 23))) ? false : z3 ? 1 : 0;
                    cwjVar3.c(bwbVar26, iC);
                    this.E += iC;
                    if (iC <= 0 || this.G || !bxf.j(bArr2, iC, dajVar.g)) {
                        z = z3 ? 1 : 0;
                    } else {
                        z = z3 ? 1 : 0;
                        this.G = z;
                    }
                } else {
                    if (this.H) {
                        bwb bwbVar28 = this.j;
                        bwbVar28.L(i65);
                        i7 = i58;
                        ((cvb) cvjVar).o(bwbVar28.b, 0, this.F, false);
                        cwjVar3.c(bwbVar28, this.F);
                        iA2 = this.F;
                        int iE = bxf.e(bwbVar28.b, bwbVar28.d);
                        bwbVar28.P(0);
                        bwbVar28.O(iE);
                        int i67 = dajVar.g.s;
                        bxl bxlVar = this.p;
                        if (i67 == -1) {
                            if (bxlVar.b != 0) {
                                bxlVar.c(0);
                            }
                        } else if (bxlVar.b != i67) {
                            bxlVar.c(i67);
                        }
                        bxl bxlVar2 = this.p;
                        bxlVar2.a(jA, bwbVar28);
                        if ((czzVar.a() & 4) != 0) {
                            bxlVar2.b(0);
                        }
                    } else {
                        i7 = i58;
                        iA2 = cwjVar3.a(cvjVar, i65, false);
                    }
                    this.E += iA2;
                    this.F -= iA2;
                    i58 = i7;
                    z = true;
                }
                i = 0;
                c2 = 6;
            }
        }
        z2 = true;
        iA = czzVar.a();
        if (!this.G) {
            iA |= 67108864;
        }
        i4 = iA;
        yhkVarG = czzVar.g();
        if (yhkVarG != null) {
            obj = yhkVarG.e;
        } else {
            obj = null;
        }
        if (z2) {
            j = jA;
        } else {
            j = jA;
            cwjVar3.e(j, i4, this.D, 0, (cwi) obj);
        }
        while (true) {
            arrayDeque = this.o;
            if (!arrayDeque.isEmpty()) {
                break;
                break;
            }
            czxVar = (czx) arrayDeque.removeFirst();
            int i68 = this.y;
            i5 = czxVar.c;
            this.y = i68 - i5;
            j2 = czxVar.a;
            if (czxVar.b) {
                j2 += j;
            }
            j3 = j2;
            while (i6 < r2) {
                cwjVar4.e(j3, 1, i5, this.y, null);
            }
        }
        if (!czzVar.f()) {
            this.C = null;
        }
        this.s = i3;
        return 0;
    }

    public daj h(daj dajVar) {
        daj dajVarE;
        if (dajVar == null || (dajVarE = czv.e(dajVar)) == null) {
            return null;
        }
        return dajVarE;
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }

    @Deprecated
    public daa() {
        this(dbl.a, 32, agpi.a, null);
    }
}
