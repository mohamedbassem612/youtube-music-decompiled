package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaParser;
import com.google.cardboard.sdk.R;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class jub implements jtn {
    private static final byte[] b = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final bse c;
    private jua A;
    private int B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private cvk G;
    private cwj[] H;
    private cwj[] I;
    private boolean J;
    public MediaParser.MediaParsersImplementation a;
    private jtl d;
    private final int e;
    private final List f;
    private final byte[] k;
    private final bwb l;
    private final cwj p;
    private int q;
    private int r;
    private long s;
    private int t;
    private bwb u;
    private long v;
    private int w;
    private final eol K = new eol();
    private final bwb m = new bwb(16);
    private final bwb h = new bwb(bxf.a);
    private final bwb i = new bwb(5);
    private final bwb j = new bwb();
    private final ArrayDeque n = new ArrayDeque();
    private final ArrayDeque o = new ArrayDeque();
    private final SparseArray g = new SparseArray();
    private long y = -9223372036854775807L;
    private long x = -9223372036854775807L;
    private long z = -9223372036854775807L;

    static {
        bsd bsdVar = new bsd();
        bsdVar.e("application/x-emsg");
        c = new bse(bsdVar);
    }

    public jub(int i, List list, cwj cwjVar) {
        this.e = i;
        this.f = DesugarCollections.unmodifiableList(list);
        this.p = cwjVar;
        byte[] bArr = new byte[16];
        this.k = bArr;
        this.l = new bwb(bArr);
        l();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    private static bsa j(List list) {
        elq elqVar;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            jtu jtuVar = (jtu) list.get(i);
            if (jtuVar.d == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = jtuVar.a.b;
                bwb bwbVar = new bwb(bArr);
                if (bwbVar.d >= 32) {
                    bwbVar.P(0);
                    if (bwbVar.i() == bwbVar.d() + 4 && bwbVar.i() == 1886614376) {
                        int i2 = (bwbVar.i() >> 24) & 255;
                        if (i2 > 1) {
                            bvx.e("PsshAtomUtil", a.bR(i2, "Unsupported pssh version: "));
                        } else {
                            UUID uuid = new UUID(bwbVar.v(), bwbVar.v());
                            if (i2 == 1) {
                                bwbVar.Q(bwbVar.q() << 4);
                            }
                            int iQ = bwbVar.q();
                            if (iQ == bwbVar.d()) {
                                bwbVar.K(new byte[iQ], 0, iQ);
                                elqVar = new elq(uuid);
                            }
                        }
                        elqVar = null;
                    } else {
                        elqVar = null;
                    }
                } else {
                    elqVar = null;
                }
                Object obj = elqVar == null ? null : elqVar.a;
                if (obj == null) {
                    bvx.e("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new brz((UUID) obj, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList != null) {
            return new bsa(arrayList);
        }
        return null;
    }

    private static jua k(SparseArray sparseArray) {
        int size = sparseArray.size();
        long j = Long.MAX_VALUE;
        jua juaVar = null;
        for (int i = 0; i < size; i++) {
            jua juaVar2 = (jua) sparseArray.valueAt(i);
            int i2 = juaVar2.h;
            juf jufVar = juaVar2.b;
            if (i2 != jufVar.d) {
                long j2 = jufVar.f[i2];
                if (j2 < j) {
                    juaVar = juaVar2;
                    j = j2;
                }
            }
        }
        return juaVar;
    }

    private final void l() {
        this.q = 0;
        this.t = 0;
    }

    private static void m(bwb bwbVar, int i, juf jufVar) throws bsz {
        bwbVar.P(i + 8);
        int i2 = bwbVar.i();
        if ((i2 & 1) != 0) {
            throw new bsz("Overriding TrackEncryptionBox parameters is unsupported.", null, false, 1);
        }
        boolean z = (i2 & 2) != 0;
        int iQ = bwbVar.q();
        int i3 = jufVar.e;
        if (iQ != i3) {
            throw new bsz(a.bQ(i3, iQ, "Length mismatch: ", ", "), null, true, 1);
        }
        Arrays.fill(jufVar.n, 0, iQ, z);
        jufVar.b(bwbVar.d());
        bwb bwbVar2 = jufVar.o;
        bwbVar.K(bwbVar2.b, 0, bwbVar2.d);
        bwbVar2.P(0);
        jufVar.p = false;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x035f  */
    /* JADX WARN: Code duplicated, block: B:147:0x038c  */
    /* JADX WARN: Code duplicated, block: B:287:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:288:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:299:0x0730  */
    /* JADX WARN: Code duplicated, block: B:372:0x088b  */
    /* JADX WARN: Code duplicated, block: B:374:0x089e  */
    /* JADX WARN: Code duplicated, block: B:376:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:377:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:435:0x08ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01da A[PHI: r7
      0x01da: PHI (r7v17 int) = (r7v15 int), (r7v19 int) binds: [B:79:0x01ce, B:84:0x01d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x01de  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ec  */
    private final void n(long j) throws bsz {
        int i;
        bsa bsaVar;
        jtt jttVar;
        List list;
        int i2;
        int i3;
        int i4;
        long jW;
        int i5;
        int i6;
        long jV;
        long jV2;
        long j2;
        long jC;
        long[] jArr;
        long[] jArr2;
        jtt jttVarA;
        Pair pairCreate;
        jue jueVarI;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iN;
        byte[] bArr;
        int i13;
        int i14;
        boolean z;
        while (true) {
            ArrayDeque arrayDeque = this.n;
            if (arrayDeque.isEmpty() || ((jtt) arrayDeque.peek()).a != j) {
                break;
            }
            jtt jttVar2 = (jtt) arrayDeque.pop();
            int i15 = jttVar2.d;
            int i16 = 12;
            int i17 = -1;
            int i18 = 16;
            int i19 = 8;
            if (i15 == 1836019574) {
                bsa bsaVarJ = j(jttVar2.b);
                jtt jttVarA2 = jttVar2.a(1836475768);
                SparseArray sparseArray = new SparseArray();
                List list2 = jttVarA2.b;
                int size = list2.size();
                long jW2 = -9223372036854775807L;
                int i20 = 0;
                while (i20 < size) {
                    jtu jtuVar = (jtu) list2.get(i20);
                    int i21 = jtuVar.d;
                    if (i21 == 1953654136) {
                        bwb bwbVar = jtuVar.a;
                        bwbVar.P(i16);
                        Pair pairCreate2 = Pair.create(Integer.valueOf(bwbVar.i()), new jtz(bwbVar.q() - 1, bwbVar.q(), bwbVar.q(), bwbVar.i()));
                        sparseArray.put(((Integer) pairCreate2.first).intValue(), (jtz) pairCreate2.second);
                    } else if (i21 == 1835362404) {
                        bwb bwbVar2 = jtuVar.a;
                        bwbVar2.P(8);
                        jW2 = ((bwbVar2.i() >> 24) & 255) == 0 ? bwbVar2.w() : bwbVar2.x();
                    }
                    i20++;
                    i16 = 12;
                }
                SparseArray sparseArray2 = new SparseArray();
                List list3 = jttVar2.c;
                int size2 = list3.size();
                int i22 = 0;
                while (i22 < size2) {
                    jtt jttVar3 = (jtt) list3.get(i22);
                    if (jttVar3.d == 1953653099) {
                        jtu jtuVarB = jttVar2.b(1836476516);
                        int i23 = this.e;
                        int i24 = jty.a;
                        jtt jttVarA3 = jttVar3.a(1835297121);
                        jttVarA3.getClass();
                        jtu jtuVarB2 = jttVarA3.b(1751411826);
                        jtuVarB2.getClass();
                        bwb bwbVar3 = jtuVarB2.a;
                        bwbVar3.P(i18);
                        int i25 = bwbVar3.i();
                        if (i25 == 1936684398) {
                            i4 = 1;
                        } else if (i25 == 1986618469) {
                            i4 = 2;
                        } else if (i25 == 1952807028 || i25 == 1935832172 || i25 == 1937072756 || i25 == 1668047728) {
                            i4 = 3;
                        } else {
                            i4 = i25 == 1835365473 ? 5 : i17;
                        }
                        if (i4 == i17) {
                            bsaVar = bsaVarJ;
                            jttVar = jttVar2;
                            list = list3;
                            i2 = size2;
                            i3 = i22;
                        } else {
                            jtu jtuVarB3 = jttVar3.b(1953196132);
                            jtuVarB3.getClass();
                            bwb bwbVar4 = jtuVarB3.a;
                            bwbVar4.P(i19);
                            int i26 = (bwbVar4.i() >> 24) & 255;
                            bwbVar4.Q(i26 == 0 ? 8 : 16);
                            int i27 = bwbVar4.i();
                            list = list3;
                            bwbVar4.Q(4);
                            int i28 = bwbVar4.c;
                            int i29 = 0;
                            while (true) {
                                i2 = size2;
                                int i30 = i26 == 0 ? 4 : 8;
                                if (i29 < i30) {
                                    int i31 = i29;
                                    if (bwbVar4.b[i28 + i29] != -1) {
                                        jW = i26 == 0 ? bwbVar4.w() : bwbVar4.x();
                                        if (jW == 0) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                    i29 = i31 + 1;
                                    size2 = i2;
                                } else {
                                    bwbVar4.Q(i30);
                                }
                                jW = -9223372036854775807L;
                                break;
                            }
                            bwbVar4.Q(16);
                            int i32 = bwbVar4.i();
                            int i33 = bwbVar4.i();
                            bwbVar4.Q(4);
                            int i34 = bwbVar4.i();
                            int i35 = bwbVar4.i();
                            int i36 = i32;
                            int i37 = 65536;
                            i3 = i22;
                            if (i36 != 0) {
                                if (i36 == 0) {
                                    i37 = i34;
                                    i5 = i36;
                                } else if (i33 != -65536) {
                                    i37 = i34;
                                    i5 = 0;
                                } else if (i34 == 65536) {
                                    i33 = -65536;
                                    i37 = i34;
                                    i5 = 0;
                                } else if (i35 == 0) {
                                    i6 = 270;
                                } else {
                                    i33 = -65536;
                                    i5 = 0;
                                }
                                if (i5 != -65536 && i33 == 0 && i37 == 0 && i35 == -65536) {
                                    i6 = 180;
                                } else {
                                    i6 = 0;
                                }
                            } else {
                                if (i33 == 65536) {
                                    if (i34 != -65536) {
                                        i33 = 65536;
                                    } else if (i35 == 0) {
                                        i6 = 90;
                                    } else {
                                        i33 = 65536;
                                        i34 = -65536;
                                    }
                                }
                                i36 = 0;
                                if (i36 == 0) {
                                    i37 = i34;
                                    i5 = i36;
                                } else if (i33 != -65536) {
                                    i37 = i34;
                                    i5 = 0;
                                } else if (i34 == 65536) {
                                    i33 = -65536;
                                    i37 = i34;
                                    i5 = 0;
                                } else if (i35 == 0) {
                                    i6 = 270;
                                } else {
                                    i33 = -65536;
                                    i5 = 0;
                                }
                                if (i5 != -65536) {
                                    i6 = 0;
                                } else {
                                    i6 = 0;
                                }
                            }
                            if (jW2 != -9223372036854775807L) {
                                jW = jW2;
                            }
                            bwb bwbVar5 = jtuVarB.a;
                            bwbVar5.P(8);
                            if (((bwbVar5.i() >> 24) & 255) == 0) {
                                jV = bwbVar5.w();
                                jV2 = bwbVar5.w();
                            } else {
                                jV = bwbVar5.v();
                                jV2 = bwbVar5.v();
                            }
                            long j3 = new bxa(jV, jV2, bwbVar5.w()).c;
                            if (jW == -9223372036854775807L) {
                                j2 = j3;
                                jC = -9223372036854775807L;
                            } else {
                                j2 = j3;
                                jC = bwp.C(jW, 1000000L, j2);
                            }
                            jtt jttVarA4 = jttVarA3.a(1835626086);
                            jttVarA4.getClass();
                            jtt jttVarA5 = jttVarA4.a(1937007212);
                            jttVarA5.getClass();
                            jtu jtuVarB4 = jttVarA3.b(1835296868);
                            jtuVarB4.getClass();
                            bwb bwbVar6 = jtuVarB4.a;
                            bwbVar6.P(8);
                            int i38 = (bwbVar6.i() >> 24) & 255;
                            bwbVar6.Q(i38 == 0 ? 8 : 16);
                            int i39 = i38 == 0 ? 4 : 8;
                            long jW3 = bwbVar6.w();
                            bwbVar6.Q(i39);
                            int iS = bwbVar6.s();
                            int i40 = iS >> 10;
                            int i41 = iS >> 5;
                            int i42 = iS & 31;
                            StringBuilder sb = new StringBuilder();
                            sb.append((char) ((i40 & 31) + 96));
                            sb.append((char) ((i41 & 31) + 96));
                            sb.append((char) (i42 + 96));
                            Pair pairCreate3 = Pair.create(Long.valueOf(jW3), sb.toString());
                            jtu jtuVarB5 = jttVarA5.b(1937011556);
                            if (jtuVarB5 == null) {
                                throw new bsz("Malformed sample table (stbl) missing sample description (stsd)", null, true, 1);
                            }
                            int i43 = i23 & 16;
                            jtx jtxVarA = jty.a(jtuVarB5.a, i27, i6, (String) pairCreate3.second, bsaVarJ);
                            if (i43 != 0 || (jttVarA = jttVar3.a(1701082227)) == null) {
                                bsaVar = bsaVarJ;
                                jttVar = jttVar2;
                            } else {
                                jtu jtuVarB6 = jttVarA.b(1701606260);
                                if (jtuVarB6 == null) {
                                    bsaVar = bsaVarJ;
                                    jttVar = jttVar2;
                                    pairCreate = null;
                                } else {
                                    bwb bwbVar7 = jtuVarB6.a;
                                    bwbVar7.P(8);
                                    int i44 = bwbVar7.i() >> 24;
                                    int iQ = bwbVar7.q();
                                    long[] jArr3 = new long[iQ];
                                    long[] jArr4 = new long[iQ];
                                    int i45 = 0;
                                    while (i45 < iQ) {
                                        int i46 = i44 & 255;
                                        bsa bsaVar2 = bsaVarJ;
                                        jArr3[i45] = i46 == 1 ? bwbVar7.x() : bwbVar7.w();
                                        jArr4[i45] = i46 == 1 ? bwbVar7.v() : bwbVar7.i();
                                        if (bwbVar7.G() != 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        bwbVar7.Q(2);
                                        i45++;
                                        bsaVarJ = bsaVar2;
                                        jttVar2 = jttVar2;
                                    }
                                    bsaVar = bsaVarJ;
                                    jttVar = jttVar2;
                                    pairCreate = Pair.create(jArr3, jArr4);
                                }
                                if (pairCreate != null) {
                                    long[] jArr5 = (long[]) pairCreate.first;
                                    jArr2 = (long[]) pairCreate.second;
                                    jArr = jArr5;
                                }
                                jue jueVar = jtxVarA.a != null ? new jue(i27, i4, ((Long) pairCreate3.first).longValue(), j2, jC, jtxVarA.a, jtxVarA.c, jtxVarA.d, jtxVarA.b, jArr, jArr2) : null;
                                jueVarI = i(jueVar);
                                if (jueVarI != null) {
                                    sparseArray2.put(jueVarI.a, jueVarI);
                                }
                            }
                            jArr = null;
                            jArr2 = null;
                            if (jtxVarA.a != null) {
                            }
                            jueVarI = i(jueVar);
                            if (jueVarI != null) {
                                sparseArray2.put(jueVarI.a, jueVarI);
                            }
                        }
                        jueVarI = i(jueVar);
                        if (jueVarI != null) {
                            sparseArray2.put(jueVarI.a, jueVarI);
                        }
                    } else {
                        bsaVar = bsaVarJ;
                        jttVar = jttVar2;
                        list = list3;
                        i2 = size2;
                        i3 = i22;
                    }
                    i22 = i3 + 1;
                    list3 = list;
                    size2 = i2;
                    bsaVarJ = bsaVar;
                    jttVar2 = jttVar;
                    i17 = -1;
                    i18 = 16;
                    i19 = 8;
                }
                int size3 = sparseArray2.size();
                SparseArray sparseArray3 = this.g;
                if (sparseArray3.size() == 0) {
                    for (int i47 = 0; i47 < size3; i47++) {
                        jue jueVar2 = (jue) sparseArray2.valueAt(i47);
                        jua juaVar = new jua(this.G.s(i47, jueVar2.b));
                        int i48 = jueVar2.a;
                        juaVar.b(jueVar2, s(sparseArray, i48));
                        sparseArray3.put(i48, juaVar);
                        this.y = Math.max(this.y, jueVar2.e);
                    }
                    if (this.H == null) {
                        cwj[] cwjVarArr = new cwj[2];
                        this.H = cwjVarArr;
                        cwj cwjVar = this.p;
                        if (cwjVar != null) {
                            cwjVarArr[0] = cwjVar;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        if ((this.e & 4) != 0) {
                            cwjVarArr[i] = this.G.s(sparseArray3.size(), 5);
                            i++;
                        }
                        cwj[] cwjVarArr2 = (cwj[]) Arrays.copyOf(this.H, i);
                        this.H = cwjVarArr2;
                        for (cwj cwjVar2 : cwjVarArr2) {
                            cwjVar2.b(c);
                        }
                    }
                    if (this.I == null) {
                        List list4 = this.f;
                        this.I = new cwj[list4.size()];
                        for (int i49 = 0; i49 < this.I.length; i49++) {
                            cwj cwjVarS = this.G.s(sparseArray3.size() + 1 + i49, 3);
                            cwjVarS.b((bse) list4.get(i49));
                            this.I[i49] = cwjVarS;
                        }
                    }
                    this.G.t();
                } else {
                    ahno.O(sparseArray3.size() == size3);
                    for (int i50 = 0; i50 < size3; i50++) {
                        jue jueVar3 = (jue) sparseArray2.valueAt(i50);
                        int i51 = jueVar3.a;
                        ((jua) sparseArray3.get(i51)).b(jueVar3, s(sparseArray, i51));
                    }
                }
            } else {
                int i52 = 0;
                if (i15 == 1836019558) {
                    SparseArray sparseArray4 = this.g;
                    int i53 = this.e;
                    byte[] bArr2 = this.k;
                    List list5 = jttVar2.c;
                    int size4 = list5.size();
                    int i54 = 0;
                    while (i54 < size4) {
                        jtt jttVar4 = (jtt) list5.get(i54);
                        if (jttVar4.d == 1953653094) {
                            bwb bwbVar8 = jttVar4.b(1952868452).a;
                            bwbVar8.P(8);
                            int i55 = bwbVar8.i();
                            jua juaVar2 = sparseArray4.size() == 1 ? (jua) sparseArray4.valueAt(i52) : (jua) sparseArray4.get(bwbVar8.i());
                            if (juaVar2 == null) {
                                juaVar2 = null;
                            } else {
                                if ((i55 & 1) != 0) {
                                    long jX = bwbVar8.x();
                                    juf jufVar = juaVar2.b;
                                    jufVar.b = jX;
                                    jufVar.c = jX;
                                }
                                jtz jtzVar = juaVar2.e;
                                juaVar2.b.a = new jtz((i55 & 2) != 0 ? bwbVar8.q() - 1 : jtzVar.a, (i55 & 8) != 0 ? bwbVar8.q() : jtzVar.b, (i55 & 16) != 0 ? bwbVar8.q() : jtzVar.c, (i55 & 32) != 0 ? bwbVar8.q() : jtzVar.d);
                            }
                            if (juaVar2 == null) {
                                i7 = i53;
                                i8 = i54;
                            } else {
                                juf jufVar2 = juaVar2.b;
                                long jX2 = jufVar2.q;
                                juaVar2.c();
                                if (jttVar4.b(1952867444) != null && (i53 & 2) == 0) {
                                    bwb bwbVar9 = jttVar4.b(1952867444).a;
                                    bwbVar9.P(8);
                                    jX2 = ((bwbVar9.i() >> 24) & 255) == 1 ? bwbVar9.x() : bwbVar9.w();
                                }
                                List list6 = jttVar4.b;
                                int size5 = list6.size();
                                i7 = i53;
                                int i56 = 0;
                                int i57 = 0;
                                int i58 = 0;
                                while (true) {
                                    i10 = 1953658222;
                                    if (i58 >= size5) {
                                        break;
                                    }
                                    int i59 = i54;
                                    jtu jtuVar2 = (jtu) list6.get(i58);
                                    long j4 = jX2;
                                    if (jtuVar2.d == 1953658222) {
                                        bwb bwbVar10 = jtuVar2.a;
                                        bwbVar10.P(12);
                                        int iQ2 = bwbVar10.q();
                                        if (iQ2 > 0) {
                                            i57 += iQ2;
                                            i56++;
                                        }
                                    }
                                    i58++;
                                    i54 = i59;
                                    jX2 = j4;
                                }
                                i8 = i54;
                                long j5 = jX2;
                                juaVar2.h = 0;
                                juaVar2.g = 0;
                                juaVar2.f = 0;
                                jufVar2.d = i56;
                                jufVar2.e = i57;
                                if (jufVar2.g.length < i56) {
                                    jufVar2.f = new long[i56];
                                    jufVar2.g = new int[i56];
                                }
                                if (jufVar2.h.length < i57) {
                                    int i60 = (i57 * R.styleable.AppCompatTheme_windowMinWidthMinor) / 100;
                                    jufVar2.h = new int[i60];
                                    jufVar2.j = new int[i60];
                                    jufVar2.k = new long[i60];
                                    jufVar2.l = new boolean[i60];
                                    jufVar2.n = new boolean[i60];
                                    jufVar2.i = new int[i60];
                                }
                                int i61 = 0;
                                int i62 = 0;
                                int i63 = 0;
                                while (i61 < size5) {
                                    jtu jtuVar3 = (jtu) list6.get(i61);
                                    if (jtuVar3.d == i10) {
                                        int i64 = i62 + 1;
                                        bwb bwbVar11 = jtuVar3.a;
                                        bwbVar11.P(8);
                                        int i65 = bwbVar11.i();
                                        jue jueVar4 = juaVar2.d;
                                        jtz jtzVar2 = jufVar2.a;
                                        int i66 = i62;
                                        jufVar2.g[i66] = bwbVar11.q();
                                        long[] jArr6 = jufVar2.f;
                                        int i67 = i63;
                                        long j6 = jufVar2.b;
                                        jArr6[i66] = j6;
                                        if ((i65 & 1) != 0) {
                                            jArr6[i66] = j6 + ((long) bwbVar11.i());
                                        }
                                        boolean z2 = (i65 & 4) != 0;
                                        int i68 = jtzVar2.d;
                                        int iQ3 = z2 ? bwbVar11.q() : i68;
                                        boolean z3 = z2;
                                        int i69 = i65 & SemanticState.Hidden;
                                        int i70 = i65 & SemanticState.LiveRegion;
                                        int i71 = i65 & SemanticState.ReadOnly;
                                        int i72 = i65 & SemanticState.Modal;
                                        long[] jArr7 = jueVar4.h;
                                        long jC2 = (jArr7 != null && jArr7.length == 1 && jArr7[0] == 0) ? bwp.C(jueVar4.i[0], 1000L, jueVar4.c) : 0L;
                                        int[] iArr = jufVar2.h;
                                        int[] iArr2 = jufVar2.i;
                                        int[] iArr3 = jufVar2.j;
                                        long[] jArr8 = jufVar2.k;
                                        boolean[] zArr = jufVar2.l;
                                        boolean z4 = jueVar4.b == 2 && (i7 & 1) != 0;
                                        int i73 = i67 + jufVar2.g[i66];
                                        int i74 = iQ3;
                                        long j7 = jueVar4.c;
                                        long j8 = i66 > 0 ? jufVar2.q : j5;
                                        int i75 = i67;
                                        while (i75 < i73) {
                                            int iQ4 = i69 != 0 ? bwbVar11.q() : jtzVar2.b;
                                            int iQ5 = i70 != 0 ? bwbVar11.q() : jtzVar2.c;
                                            if (i75 != 0) {
                                                if (i71 != 0) {
                                                    i14 = bwbVar11.i();
                                                } else {
                                                    i14 = i68;
                                                }
                                            } else if (z3) {
                                                i14 = i74;
                                                i75 = 0;
                                            } else {
                                                i75 = 0;
                                                if (i71 != 0) {
                                                    i14 = bwbVar11.i();
                                                } else {
                                                    i14 = i68;
                                                }
                                            }
                                            jtz jtzVar3 = jtzVar2;
                                            if (i72 != 0) {
                                                iArr3[i75] = (int) ((((long) bwbVar11.i()) * 1000) / j7);
                                            } else {
                                                iArr3[i75] = 0;
                                            }
                                            long j9 = j8;
                                            jArr8[i75] = bwp.C(j8, 1000L, j7) - jC2;
                                            iArr[i75] = iQ5;
                                            iArr2[i75] = iQ4;
                                            if (((i14 >> 16) & 1) != 0) {
                                                z = false;
                                            } else if (!z4) {
                                                z = true;
                                            } else if (i75 == 0) {
                                                z = true;
                                                i75 = 0;
                                            } else {
                                                z = false;
                                            }
                                            zArr[i75] = z;
                                            j8 = j9 + ((long) iQ4);
                                            i75++;
                                            jtzVar2 = jtzVar3;
                                            z4 = z4;
                                            i73 = i73;
                                        }
                                        jufVar2.q = j8;
                                        i62 = i64;
                                        i63 = i73;
                                    }
                                    i61++;
                                    i10 = 1953658222;
                                }
                                yhk yhkVarA = juaVar2.d.a(jufVar2.a.a);
                                jtu jtuVarB7 = jttVar4.b(1935763834);
                                if (jtuVarB7 != null) {
                                    int i76 = yhkVarA.a;
                                    bwb bwbVar12 = jtuVarB7.a;
                                    bwbVar12.P(8);
                                    if ((bwbVar12.i() & 1) == 1) {
                                        bwbVar12.Q(8);
                                    }
                                    int iN2 = bwbVar12.n();
                                    int iQ6 = bwbVar12.q();
                                    int i77 = jufVar2.e;
                                    if (iQ6 != i77) {
                                        throw new bsz(a.bQ(i77, iQ6, "Length mismatch: ", ", "), null, true, 1);
                                    }
                                    if (iN2 == 0) {
                                        boolean[] zArr2 = jufVar2.n;
                                        i13 = 0;
                                        for (int i78 = 0; i78 < iQ6; i78++) {
                                            int iN3 = bwbVar12.n();
                                            i13 += iN3;
                                            zArr2[i78] = iN3 > i76;
                                        }
                                    } else {
                                        i13 = iN2 * iQ6;
                                        Arrays.fill(jufVar2.n, 0, iQ6, iN2 > i76);
                                    }
                                    jufVar2.b(i13);
                                }
                                jtu jtuVarB8 = jttVar4.b(1935763823);
                                if (jtuVarB8 != null) {
                                    bwb bwbVar13 = jtuVarB8.a;
                                    bwbVar13.P(8);
                                    int i79 = bwbVar13.i();
                                    if ((i79 & 1) == 1) {
                                        bwbVar13.Q(8);
                                    }
                                    int iQ7 = bwbVar13.q();
                                    if (iQ7 != 1) {
                                        throw new bsz(a.bR(iQ7, "Unexpected saio entry count: "), null, false, 1);
                                    }
                                    jufVar2.c += ((i79 >> 24) & 255) == 0 ? bwbVar13.w() : bwbVar13.x();
                                }
                                jtu jtuVarB9 = jttVar4.b(1936027235);
                                if (jtuVarB9 != null) {
                                    m(jtuVarB9.a, 0, jufVar2);
                                }
                                jtu jtuVarB10 = jttVar4.b(1935828848);
                                jtu jtuVarB11 = jttVar4.b(1936158820);
                                if (jtuVarB10 != null && jtuVarB11 != null) {
                                    Object obj = yhkVarA != null ? yhkVarA.d : null;
                                    bwb bwbVar14 = jtuVarB10.a;
                                    bwbVar14.P(8);
                                    int i80 = bwbVar14.i();
                                    if (bwbVar14.i() == 1936025959) {
                                        if (((i80 >> 24) & 255) == 1) {
                                            bwbVar14.Q(4);
                                        }
                                        if (bwbVar14.i() != 1) {
                                            throw new bsz("Entry count in sbgp != 1 (unsupported).", null, false, 1);
                                        }
                                        bwb bwbVar15 = jtuVarB11.a;
                                        bwbVar15.P(8);
                                        int i81 = bwbVar15.i();
                                        if (bwbVar15.i() == 1936025959) {
                                            int i82 = (i81 >> 24) & 255;
                                            if (i82 != 1) {
                                                if (i82 >= 2) {
                                                    bwbVar15.Q(4);
                                                }
                                                if (bwbVar15.w() == 1) {
                                                    throw new bsz("Entry count in sgpd != 1 (unsupported).", null, false, 1);
                                                }
                                                bwbVar15.Q(1);
                                                int iN4 = bwbVar15.n();
                                                i11 = (iN4 & 240) >> 4;
                                                i12 = iN4 & 15;
                                                if (bwbVar15.n() == 1) {
                                                    iN = bwbVar15.n();
                                                    byte[] bArr3 = new byte[16];
                                                    bwbVar15.K(bArr3, 0, 16);
                                                    if (iN == 0) {
                                                        int iN5 = bwbVar15.n();
                                                        byte[] bArr4 = new byte[iN5];
                                                        bwbVar15.K(bArr4, 0, iN5);
                                                        bArr = bArr4;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    jufVar2.m = true;
                                                    jufVar2.r = new yhk(true, (String) obj, iN, bArr3, i11, i12, bArr);
                                                }
                                            } else if (bwbVar15.w() == 0) {
                                                throw new bsz("Variable length description in sgpd found (unsupported)", null, false, 1);
                                            }
                                            if (bwbVar15.w() == 1) {
                                                throw new bsz("Entry count in sgpd != 1 (unsupported).", null, false, 1);
                                            }
                                            bwbVar15.Q(1);
                                            int iN6 = bwbVar15.n();
                                            i11 = (iN6 & 240) >> 4;
                                            i12 = iN6 & 15;
                                            if (bwbVar15.n() == 1) {
                                                iN = bwbVar15.n();
                                                byte[] bArr5 = new byte[16];
                                                bwbVar15.K(bArr5, 0, 16);
                                                if (iN == 0) {
                                                    int iN7 = bwbVar15.n();
                                                    byte[] bArr6 = new byte[iN7];
                                                    bwbVar15.K(bArr6, 0, iN7);
                                                    bArr = bArr6;
                                                } else {
                                                    bArr = null;
                                                }
                                                jufVar2.m = true;
                                                jufVar2.r = new yhk(true, (String) obj, iN, bArr5, i11, i12, bArr);
                                            }
                                        }
                                    }
                                }
                                int size6 = list6.size();
                                for (int i83 = 0; i83 < size6; i83++) {
                                    jtu jtuVar4 = (jtu) list6.get(i83);
                                    if (jtuVar4.d == 1970628964) {
                                        bwb bwbVar16 = jtuVar4.a;
                                        bwbVar16.P(8);
                                        bwbVar16.K(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, b)) {
                                            m(bwbVar16, 16, jufVar2);
                                        }
                                    }
                                }
                            }
                            i9 = 0;
                        } else {
                            i7 = i53;
                            list5 = list5;
                            size4 = size4;
                            i8 = i54;
                            i9 = i52;
                        }
                        i54 = i8 + 1;
                        i52 = i9;
                        i53 = i7;
                        list5 = list5;
                        size4 = size4;
                    }
                    int i84 = i52;
                    bsa bsaVarJ2 = j(jttVar2.b);
                    if (bsaVarJ2 != null) {
                        int size7 = sparseArray4.size();
                        for (int i85 = i84; i85 < size7; i85++) {
                            jua juaVar3 = (jua) sparseArray4.valueAt(i85);
                            yhk yhkVarA2 = juaVar3.d.a(juaVar3.b.a.a);
                            bsa bsaVarB = bsaVarJ2.b((String) (yhkVarA2 != null ? yhkVarA2.d : null));
                            bsd bsdVar = new bsd(juaVar3.d.f);
                            bsdVar.s = bsaVarB;
                            juaVar3.a.b(new bse(bsdVar));
                        }
                    }
                    if (this.x != -9223372036854775807L) {
                        int size8 = sparseArray4.size();
                        for (int i86 = i84; i86 < size8; i86++) {
                            jua juaVar4 = (jua) sparseArray4.valueAt(i86);
                            long jF = bwp.F(this.x);
                            int i87 = juaVar4.f;
                            while (true) {
                                juf jufVar3 = juaVar4.b;
                                if (i87 >= jufVar3.e || jufVar3.a(i87) >= jF) {
                                    break;
                                }
                                if (jufVar3.l[i87]) {
                                    juaVar4.i = i87;
                                }
                                i87++;
                            }
                        }
                        this.x = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((jtt) arrayDeque.peek()).c.add(jttVar2);
                }
            }
        }
        l();
    }

    private final void o(jtm jtmVar) throws bsz {
        String strS;
        long j;
        String str;
        long jC;
        long jW;
        long j2;
        long jX;
        long jX2;
        int i = ((int) this.s) - this.t;
        bwb bwbVar = this.u;
        if (bwbVar != null) {
            if (!jtmVar.j(bwbVar.b, 8, i)) {
                return;
            }
            jtu jtuVar = new jtu(this.r, this.u);
            long jD = jtmVar.d();
            ArrayDeque arrayDeque = this.n;
            if (arrayDeque.isEmpty()) {
                int i2 = jtuVar.d;
                if (i2 == 1936286840) {
                    bwb bwbVar2 = jtuVar.a;
                    bwbVar2.P(8);
                    int i3 = bwbVar2.i() >> 24;
                    bwbVar2.Q(4);
                    long jW2 = bwbVar2.w();
                    if ((i3 & 255) == 0) {
                        jX = bwbVar2.w();
                        jX2 = bwbVar2.w();
                    } else {
                        jX = bwbVar2.x();
                        jX2 = bwbVar2.x();
                    }
                    long j3 = jD + jX2;
                    long jC2 = bwp.C(jX, 1000000L, jW2);
                    bwbVar2.Q(2);
                    int iS = bwbVar2.s();
                    int[] iArr = new int[iS];
                    long[] jArr = new long[iS];
                    long[] jArr2 = new long[iS];
                    long[] jArr3 = new long[iS];
                    long j4 = jX;
                    long jC3 = jC2;
                    int i4 = 0;
                    while (i4 < iS) {
                        int i5 = bwbVar2.i();
                        if ((i5 & Integer.MIN_VALUE) != 0) {
                            throw new bsz("Unhandled indirect reference", null, true, 1);
                        }
                        long jW3 = bwbVar2.w();
                        iArr[i4] = i5 & Alert.DURATION_SHOW_INDEFINITELY;
                        jArr[i4] = j3;
                        jArr3[i4] = jC3;
                        long j5 = j4 + jW3;
                        long[] jArr4 = jArr;
                        long[] jArr5 = jArr2;
                        int i6 = i4;
                        jC3 = bwp.C(j5, 1000000L, jW2);
                        jArr5[i6] = jC3 - jArr3[i6];
                        bwbVar2.Q(4);
                        j3 += (long) iArr[i6];
                        int i7 = i6 + 1;
                        jArr2 = jArr5;
                        j4 = j5;
                        i4 = i7;
                        jArr = jArr4;
                    }
                    Pair pairCreate = Pair.create(Long.valueOf(jC2), new cuz(iArr, jArr, jArr2, jArr3));
                    this.z = ((Long) pairCreate.first).longValue();
                    this.G.z((cvz) pairCreate.second);
                    this.J = true;
                } else if (i2 == 1701671783) {
                    bwb bwbVar3 = jtuVar.a;
                    cwj[] cwjVarArr = this.H;
                    if (cwjVarArr != null && cwjVarArr.length != 0) {
                        bwbVar3.P(8);
                        int i8 = (bwbVar3.i() >> 24) & 255;
                        if (i8 == 0) {
                            strS = bwbVar3.S();
                            strS.getClass();
                            String strS2 = bwbVar3.S();
                            strS2.getClass();
                            long jW4 = bwbVar3.w();
                            long jC4 = bwp.C(bwbVar3.w(), 1000000L, jW4);
                            long j6 = this.z;
                            j = j6 != -9223372036854775807L ? j6 + jC4 : -9223372036854775807L;
                            str = strS2;
                            jC = bwp.C(bwbVar3.w(), 1000L, jW4);
                            jW = bwbVar3.w();
                            j2 = jC4;
                        } else if (i8 != 1) {
                            bvx.e("FragmentedMp4Extractor", a.bR(i8, "Skipping unsupported emsg version: "));
                        } else {
                            long jW5 = bwbVar3.w();
                            long jC5 = bwp.C(bwbVar3.x(), 1000000L, jW5);
                            long jC6 = bwp.C(bwbVar3.w(), 1000L, jW5);
                            long jW6 = bwbVar3.w();
                            strS = bwbVar3.S();
                            strS.getClass();
                            String strS3 = bwbVar3.S();
                            strS3.getClass();
                            j2 = -9223372036854775807L;
                            j = jC5;
                            jW = jW6;
                            str = strS3;
                            jC = jC6;
                        }
                        String str2 = strS;
                        byte[] bArr = new byte[bwbVar3.d()];
                        bwbVar3.K(bArr, 0, bwbVar3.d());
                        bwb bwbVar4 = new bwb(this.K.f(new cxt(str2, str, jC, jW, bArr)));
                        int iD = bwbVar4.d();
                        for (cwj cwjVar : this.H) {
                            bwbVar4.P(0);
                            cwjVar.c(bwbVar4, iD);
                        }
                        if (j == -9223372036854775807L) {
                            this.o.addLast(new yvt(j2, iD));
                            this.w += iD;
                        } else {
                            for (cwj cwjVar2 : this.H) {
                                cwjVar2.e(j, 1, iD, 0, null);
                            }
                        }
                    }
                }
            } else {
                ((jtt) arrayDeque.peek()).b.add(jtuVar);
            }
        } else if (!jtmVar.k(i)) {
            return;
        }
        n(jtmVar.d());
    }

    private final void p(jtm jtmVar) throws bsz {
        SparseArray sparseArray = this.g;
        int size = sparseArray.size();
        long j = Long.MAX_VALUE;
        jua juaVar = null;
        for (int i = 0; i < size; i++) {
            juf jufVar = ((jua) sparseArray.valueAt(i)).b;
            if (jufVar.p) {
                long j2 = jufVar.c;
                if (j2 < j) {
                    long j3 = jufVar.o.c;
                    juaVar = (jua) sparseArray.valueAt(i);
                    j = j2 + j3;
                }
            }
        }
        if (juaVar == null) {
            this.q = 3;
            return;
        }
        int iD = (int) (j - jtmVar.d());
        if (iD < 0) {
            throw new bsz("Offset to encryption data was negative.", null, true, 1);
        }
        if (jtmVar.k(iD)) {
            juf jufVar2 = juaVar.b;
            bwb bwbVar = jufVar2.o;
            int i2 = bwbVar.c;
            bwbVar.P(i2 + jtmVar.a(bwbVar.b, i2, bwbVar.d()));
            if (bwbVar.d() <= 0) {
                bwbVar.P(0);
                jufVar2.p = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0202  */
    /* JADX WARN: Code duplicated, block: B:131:0x0221  */
    /* JADX WARN: Code duplicated, block: B:132:0x0226  */
    /* JADX WARN: Code duplicated, block: B:134:0x022c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa A[LOOP:0: B:32:0x00a8->B:33:0x00aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x0125  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    private final boolean q(jtm jtmVar) throws bsz {
        long j;
        long jB;
        ArrayDeque arrayDeque;
        long jD;
        int i;
        long jD2;
        jua juaVarK;
        SparseArray sparseArray;
        int size;
        int i2;
        bwb bwbVar;
        if (this.t != 0) {
            j = this.s;
            if (j == 1) {
                bwbVar = this.m;
                if (jtmVar.j(bwbVar.b, 8, 8)) {
                    this.t += 8;
                    this.s = bwbVar.x();
                }
            } else if (j == 0) {
                jB = jtmVar.b();
                if (jB == -1) {
                    arrayDeque = this.n;
                    if (arrayDeque.isEmpty()) {
                        jB = -1;
                    } else {
                        jB = ((jtt) arrayDeque.peek()).a;
                    }
                }
                if (jB != -1) {
                    this.s = (jB - jtmVar.d()) + ((long) this.t);
                }
            }
            if (this.s >= this.t) {
                throw new bsz("Atom size less than header length (unsupported).", null, false, 1);
            }
            jD = jtmVar.d() - ((long) this.t);
            if (this.r == 1836019558) {
                sparseArray = this.g;
                size = sparseArray.size();
                for (i2 = 0; i2 < size; i2++) {
                    juf jufVar = ((jua) sparseArray.valueAt(i2)).b;
                    jufVar.c = jD;
                    jufVar.b = jD;
                }
            }
            i = this.r;
            if (i == 1835295092) {
                this.A = null;
                this.v = this.s + jD;
                if (!this.J) {
                    this.G.z(new cvy(this.y, jD));
                    this.J = true;
                }
                if ((this.e & SemanticState.ReadOnly) == 0 && this.s == this.t && (juaVarK = k(this.g)) != null) {
                    jue jueVar = juaVarK.d;
                    if (jueVar.b == 3) {
                        long j2 = jueVar.c;
                        if (this.a != null) {
                            juf jufVar2 = juaVarK.b;
                            if (jufVar2.e > 0 && j2 != 0) {
                                int i3 = juaVarK.f;
                                this.a.r(jufVar2.a(i3) * 1000, (((long) jufVar2.i[i3]) * 1000000) / j2);
                            }
                        }
                        n(this.v);
                    } else {
                        this.q = 2;
                    }
                } else {
                    this.q = 2;
                }
            } else if (i != 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227) {
                jD2 = (jtmVar.d() + this.s) - 8;
                this.n.push(new jtt(this.r, jD2));
                if (this.s == this.t) {
                    n(jD2);
                } else {
                    l();
                }
            } else if (i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783) {
                if (this.t != 8) {
                    throw new bsz("Leaf atom defines extended atom size (unsupported).", null, false, 1);
                }
                if (this.s > 2147483647L) {
                    throw new bsz("Leaf atom with length > 2147483647 (unsupported).", null, false, 1);
                }
                this.u = new bwb((int) this.s);
                System.arraycopy(this.m.b, 0, this.u.b, 0, 8);
                this.q = 1;
            } else {
                if (this.s > 2147483647L) {
                    throw new bsz("Skipping atom with length > 2147483647 (unsupported).", null, false, 1);
                }
                this.u = null;
                this.q = 1;
            }
            return true;
        }
        if (jtmVar.b() == -1 || jtmVar.b() != jtmVar.d()) {
            try {
                if (jtmVar.j(this.m.b, 0, 8)) {
                    this.t = 8;
                    bwb bwbVar2 = this.m;
                    bwbVar2.P(0);
                    this.s = bwbVar2.w();
                    this.r = bwbVar2.i();
                    j = this.s;
                    if (j == 1) {
                        bwbVar = this.m;
                        if (jtmVar.j(bwbVar.b, 8, 8)) {
                            this.t += 8;
                            this.s = bwbVar.x();
                        }
                    } else if (j == 0) {
                        jB = jtmVar.b();
                        if (jB == -1) {
                            arrayDeque = this.n;
                            if (arrayDeque.isEmpty()) {
                                jB = ((jtt) arrayDeque.peek()).a;
                            } else {
                                jB = -1;
                            }
                        }
                        if (jB != -1) {
                            this.s = (jB - jtmVar.d()) + ((long) this.t);
                        }
                    }
                    if (this.s >= this.t) {
                        throw new bsz("Atom size less than header length (unsupported).", null, false, 1);
                    }
                    jD = jtmVar.d() - ((long) this.t);
                    if (this.r == 1836019558) {
                        sparseArray = this.g;
                        size = sparseArray.size();
                        while (i2 < size) {
                            juf jufVar3 = ((jua) sparseArray.valueAt(i2)).b;
                            jufVar3.c = jD;
                            jufVar3.b = jD;
                        }
                    }
                    i = this.r;
                    if (i == 1835295092) {
                        this.A = null;
                        this.v = this.s + jD;
                        if (!this.J) {
                            this.G.z(new cvy(this.y, jD));
                            this.J = true;
                        }
                        if ((this.e & SemanticState.ReadOnly) == 0) {
                            this.q = 2;
                        } else {
                            this.q = 2;
                        }
                    } else if (i != 1836019574) {
                        jD2 = (jtmVar.d() + this.s) - 8;
                        this.n.push(new jtt(this.r, jD2));
                        if (this.s == this.t) {
                            n(jD2);
                        } else {
                            l();
                        }
                    } else {
                        jD2 = (jtmVar.d() + this.s) - 8;
                        this.n.push(new jtt(this.r, jD2));
                        if (this.s == this.t) {
                            n(jD2);
                        } else {
                            l();
                        }
                    }
                    return true;
                }
            } catch (EOFException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0263  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x025b A[EDGE_INSN: B:109:0x025b->B:101:0x025b BREAK  A[LOOP:1: B:96:0x0230->B:113:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:49:0x010f A[LOOP:0: B:49:0x010f->B:53:0x011c, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:51:0x0115  */
    /* JADX WARN: Code duplicated, block: B:53:0x011c A[LOOP:0: B:49:0x010f->B:53:0x011c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0122  */
    /* JADX WARN: Code duplicated, block: B:57:0x0130  */
    /* JADX WARN: Code duplicated, block: B:61:0x013c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145  */
    /* JADX WARN: Code duplicated, block: B:65:0x015a  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x016f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:90:0x020b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0212  */
    /* JADX WARN: Code duplicated, block: B:95:0x0223  */
    /* JADX WARN: Code duplicated, block: B:98:0x0238  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final boolean r(jtm jtmVar) throws bsz {
        juf jufVar;
        jue jueVar;
        cwj cwjVar;
        int i;
        long jA;
        int i2;
        bwb bwbVar;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        int i6;
        boolean z;
        String str;
        int i7;
        int iA;
        bwb bwbVar2;
        int i8;
        boolean z2;
        yhk yhkVarE;
        Object obj;
        ?? r1;
        MediaParser.MediaParsersImplementation mediaParsersImplementation;
        ArrayDeque arrayDeque;
        int i9;
        int i10;
        long j;
        cwj[] cwjVarArr;
        int length;
        int i11;
        int i12;
        int i13;
        int iA2;
        int i14;
        int i15;
        jua juaVar;
        boolean zEquals;
        int i16;
        int iA3;
        jua juaVar2;
        yhk yhkVarE2;
        juf jufVar2;
        bwb bwbVar3;
        int i17;
        int i18 = 4;
        int i19 = 0;
        if (this.q != 3) {
            jua juaVar3 = this.A;
            jufVar = juaVar3.b;
            jueVar = juaVar3.d;
            cwjVar = juaVar3.a;
            i = juaVar3.f;
            jA = jufVar.a(i) * 1000;
            i2 = jueVar.j;
            if (i2 == 0) {
                while (true) {
                    i12 = this.D;
                    i13 = this.C;
                    if (i12 >= i13) {
                        int i20 = i;
                        i8 = i19;
                        z2 = jufVar.l[i20];
                        yhkVarE = this.A.e();
                        if (yhkVarE != null) {
                            int i21 = (z2 ? 1 : 0) | 1073741824;
                            obj = yhkVarE.e;
                            r1 = i21;
                        } else {
                            obj = null;
                            r1 = z2;
                        }
                        cwjVar.e(jA, r1 == true ? 1 : 0, this.C, 0, (cwi) obj);
                        mediaParsersImplementation = this.a;
                        if (mediaParsersImplementation != null) {
                            mediaParsersImplementation.r(jA, (((long) this.B) * 1000000) / jueVar.c);
                        }
                        while (true) {
                            arrayDeque = this.o;
                            if (!arrayDeque.isEmpty()) {
                                break;
                            }
                            yvt yvtVar = (yvt) arrayDeque.removeFirst();
                            int i22 = this.w;
                            i10 = yvtVar.b;
                            this.w = i22 - i10;
                            j = jA + yvtVar.a;
                            cwjVarArr = this.H;
                            length = cwjVarArr.length;
                            for (i11 = i8; i11 < length; i11++) {
                                cwjVarArr[i11].e(j, 1, i10, this.w, null);
                            }
                        }
                        if (!this.A.d()) {
                            this.A = null;
                        }
                        i9 = 3;
                        this.q = i9;
                        return true;
                    }
                    iA2 = cwjVar.a(jtmVar, i13 - i12, false);
                    if (iA2 != 0) {
                        this.D += iA2;
                    } else {
                        i7 = i19;
                    }
                }
            } else {
                bwbVar = this.i;
                i3 = i2 + 1;
                i4 = 4 - i2;
                bArr = bwbVar.b;
                while (true) {
                    if (this.D >= this.C) {
                        int i23 = i;
                        i8 = i19;
                        z2 = jufVar.l[i23];
                        yhkVarE = this.A.e();
                        if (yhkVarE != null) {
                            int i24 = (z2 ? 1 : 0) | 1073741824;
                            obj = yhkVarE.e;
                            r1 = i24;
                        } else {
                            obj = null;
                            r1 = z2;
                        }
                        cwjVar.e(jA, r1 == true ? 1 : 0, this.C, 0, (cwi) obj);
                        mediaParsersImplementation = this.a;
                        if (mediaParsersImplementation != null) {
                            mediaParsersImplementation.r(jA, (((long) this.B) * 1000000) / jueVar.c);
                        }
                        while (true) {
                            arrayDeque = this.o;
                            if (!arrayDeque.isEmpty()) {
                                break;
                                break;
                            }
                            yvt yvtVar2 = (yvt) arrayDeque.removeFirst();
                            int i25 = this.w;
                            i10 = yvtVar2.b;
                            this.w = i25 - i10;
                            j = jA + yvtVar2.a;
                            cwjVarArr = this.H;
                            length = cwjVarArr.length;
                            while (i11 < length) {
                                cwjVarArr[i11].e(j, 1, i10, this.w, null);
                            }
                        }
                        if (!this.A.d()) {
                            this.A = null;
                        }
                        i9 = 3;
                        this.q = i9;
                        return true;
                    }
                    i5 = this.E;
                    if (i5 == 0) {
                        if (jtmVar.j(bArr, i4, i3)) {
                            bwbVar.P(i19);
                            i6 = bwbVar.i();
                            if (i6 <= 0) {
                                throw new bsz("Invalid NAL length", null, true, 1);
                            }
                            this.E = i6 - 1;
                            bwb bwbVar4 = this.h;
                            bwbVar4.P(i19);
                            cwjVar.c(bwbVar4, i18);
                            cwjVar.c(bwbVar, 1);
                            if (this.I.length > 0) {
                                str = jueVar.f.q;
                                byte b2 = bArr[i18];
                                byte[] bArr2 = bxf.a;
                                if (("video/avc".equals(str) || (b2 & 31) != 6) && !("video/hevc".equals(str) && ((b2 & 126) >> 1) == 39)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                            this.F = z;
                            this.D += 5;
                            this.C += i4;
                            i18 = 4;
                            i19 = 0;
                        } else {
                            i7 = i19;
                        }
                    } else if (this.F) {
                        bwbVar2 = this.j;
                        bwbVar2.H(i5);
                        i7 = 0;
                        if (jtmVar.j(bwbVar2.b, 0, this.E)) {
                            bwbVar2.P(0);
                            bwbVar2.O(this.E);
                            cwjVar.c(bwbVar2, this.E);
                            int i26 = this.E;
                            int iE = bxf.e(bwbVar2.b, bwbVar2.d);
                            bwbVar2.P("video/hevc".equals(jueVar.f.q) ? 1 : 0);
                            bwbVar2.O(iE);
                            azz.k(jA, bwbVar2, this.I);
                            iA = i26;
                            i7 = 0;
                            this.D += iA;
                            this.E -= iA;
                            i19 = i7;
                            i = i;
                            i18 = 4;
                        }
                    } else {
                        i7 = 0;
                        iA = cwjVar.a(jtmVar, i5, false);
                        if (iA == 0) {
                        }
                        this.D += iA;
                        this.E -= iA;
                        i19 = i7;
                        i = i;
                        i18 = 4;
                    }
                }
            }
        } else {
            jua juaVarK = this.A;
            if (juaVarK != null) {
                juf jufVar3 = juaVarK.b;
                int[] iArr = jufVar3.i;
                i14 = juaVarK.f;
                this.B = iArr[i14];
                i15 = jufVar3.h[i14];
                this.C = i15;
                if (i14 < juaVarK.i) {
                    if (juaVarK.d.g == 1) {
                        this.C = i15 - 8;
                        if (jtmVar.k(8)) {
                        }
                    }
                    juaVar = this.A;
                    zEquals = "audio/ac4".equals(juaVar.d.f.q);
                    i16 = this.C;
                    if (zEquals) {
                        this.D = juaVar.a(i16, 7);
                        int i27 = this.C;
                        bwb bwbVar5 = this.l;
                        cuq.b(i27, bwbVar5);
                        this.A.a.c(bwbVar5, 7);
                        iA3 = this.D + 7;
                        this.D = iA3;
                    } else {
                        iA3 = juaVar.a(i16, 0);
                        this.D = iA3;
                    }
                    this.C += iA3;
                    byte[] bArr3 = this.i.b;
                    bArr3[0] = 0;
                    bArr3[1] = 0;
                    bArr3[2] = 0;
                    this.q = 4;
                    this.E = 0;
                    jua juaVar4 = this.A;
                    jufVar = juaVar4.b;
                    jueVar = juaVar4.d;
                    cwjVar = juaVar4.a;
                    i = juaVar4.f;
                    jA = jufVar.a(i) * 1000;
                    i2 = jueVar.j;
                    if (i2 == 0) {
                        while (true) {
                            i12 = this.D;
                            i13 = this.C;
                            if (i12 >= i13) {
                                int i28 = i;
                                i8 = i19;
                                z2 = jufVar.l[i28];
                                yhkVarE = this.A.e();
                                if (yhkVarE != null) {
                                    int i29 = (z2 ? 1 : 0) | 1073741824;
                                    obj = yhkVarE.e;
                                    r1 = i29;
                                } else {
                                    obj = null;
                                    r1 = z2;
                                }
                                cwjVar.e(jA, r1 == true ? 1 : 0, this.C, 0, (cwi) obj);
                                mediaParsersImplementation = this.a;
                                if (mediaParsersImplementation != null) {
                                    mediaParsersImplementation.r(jA, (((long) this.B) * 1000000) / jueVar.c);
                                }
                                while (true) {
                                    arrayDeque = this.o;
                                    if (!arrayDeque.isEmpty()) {
                                        break;
                                        break;
                                    }
                                    yvt yvtVar3 = (yvt) arrayDeque.removeFirst();
                                    int i210 = this.w;
                                    i10 = yvtVar3.b;
                                    this.w = i210 - i10;
                                    j = jA + yvtVar3.a;
                                    cwjVarArr = this.H;
                                    length = cwjVarArr.length;
                                    while (i11 < length) {
                                        cwjVarArr[i11].e(j, 1, i10, this.w, null);
                                    }
                                }
                                if (!this.A.d()) {
                                    this.A = null;
                                }
                                i9 = 3;
                                this.q = i9;
                                return true;
                            }
                            iA2 = cwjVar.a(jtmVar, i13 - i12, false);
                            if (iA2 != 0) {
                                this.D += iA2;
                            }
                        }
                    } else {
                        bwbVar = this.i;
                        i3 = i2 + 1;
                        i4 = 4 - i2;
                        bArr = bwbVar.b;
                        while (true) {
                            if (this.D >= this.C) {
                                int i211 = i;
                                i8 = i19;
                                z2 = jufVar.l[i211];
                                yhkVarE = this.A.e();
                                if (yhkVarE != null) {
                                    int i212 = (z2 ? 1 : 0) | 1073741824;
                                    obj = yhkVarE.e;
                                    r1 = i212;
                                } else {
                                    obj = null;
                                    r1 = z2;
                                }
                                cwjVar.e(jA, r1 == true ? 1 : 0, this.C, 0, (cwi) obj);
                                mediaParsersImplementation = this.a;
                                if (mediaParsersImplementation != null) {
                                    mediaParsersImplementation.r(jA, (((long) this.B) * 1000000) / jueVar.c);
                                }
                                while (true) {
                                    arrayDeque = this.o;
                                    if (!arrayDeque.isEmpty()) {
                                        break;
                                        break;
                                    }
                                    yvt yvtVar4 = (yvt) arrayDeque.removeFirst();
                                    int i213 = this.w;
                                    i10 = yvtVar4.b;
                                    this.w = i213 - i10;
                                    j = jA + yvtVar4.a;
                                    cwjVarArr = this.H;
                                    length = cwjVarArr.length;
                                    while (i11 < length) {
                                        cwjVarArr[i11].e(j, 1, i10, this.w, null);
                                    }
                                }
                                if (!this.A.d()) {
                                    this.A = null;
                                }
                                i9 = 3;
                                this.q = i9;
                                return true;
                            }
                            i5 = this.E;
                            if (i5 == 0) {
                                if (jtmVar.j(bArr, i4, i3)) {
                                    bwbVar.P(i19);
                                    i6 = bwbVar.i();
                                    if (i6 <= 0) {
                                        throw new bsz("Invalid NAL length", null, true, 1);
                                    }
                                    this.E = i6 - 1;
                                    bwb bwbVar6 = this.h;
                                    bwbVar6.P(i19);
                                    cwjVar.c(bwbVar6, i18);
                                    cwjVar.c(bwbVar, 1);
                                    if (this.I.length > 0) {
                                        str = jueVar.f.q;
                                        byte b3 = bArr[i18];
                                        byte[] bArr4 = bxf.a;
                                        if ("video/avc".equals(str)) {
                                            z = false;
                                        } else {
                                            z = false;
                                        }
                                    } else {
                                        z = false;
                                    }
                                    this.F = z;
                                    this.D += 5;
                                    this.C += i4;
                                    i18 = 4;
                                    i19 = 0;
                                }
                            } else if (this.F) {
                                bwbVar2 = this.j;
                                bwbVar2.H(i5);
                                i7 = 0;
                                if (jtmVar.j(bwbVar2.b, 0, this.E)) {
                                    bwbVar2.P(0);
                                    bwbVar2.O(this.E);
                                    cwjVar.c(bwbVar2, this.E);
                                    int i214 = this.E;
                                    int iE2 = bxf.e(bwbVar2.b, bwbVar2.d);
                                    bwbVar2.P("video/hevc".equals(jueVar.f.q) ? 1 : 0);
                                    bwbVar2.O(iE2);
                                    azz.k(jA, bwbVar2, this.I);
                                    iA = i214;
                                    i7 = 0;
                                    this.D += iA;
                                    this.E -= iA;
                                    i19 = i7;
                                    i = i;
                                    i18 = 4;
                                }
                            } else {
                                i7 = 0;
                                iA = cwjVar.a(jtmVar, i5, false);
                                if (iA == 0) {
                                }
                                this.D += iA;
                                this.E -= iA;
                                i19 = i7;
                                i = i;
                                i18 = 4;
                            }
                        }
                    }
                } else if (jtmVar.k(i15)) {
                    juaVar2 = this.A;
                    yhkVarE2 = juaVar2.e();
                    if (yhkVarE2 != null) {
                        jufVar2 = juaVar2.b;
                        bwbVar3 = jufVar2.o;
                        i17 = yhkVarE2.a;
                        if (i17 != 0) {
                            bwbVar3.Q(i17);
                        }
                        if (jufVar2.c(juaVar2.f)) {
                            bwbVar3.Q(bwbVar3.s() * 6);
                        }
                    }
                    if (!this.A.d()) {
                        this.A = null;
                    }
                    i9 = 3;
                    this.q = i9;
                    return true;
                }
                i7 = i19;
            } else {
                juaVarK = k(this.g);
                if (juaVarK == null) {
                    int iD = (int) (this.v - jtmVar.d());
                    if (iD < 0) {
                        throw new bsz("Offset to end of mdat was negative.", null, true, 1);
                    }
                    if (jtmVar.k(iD)) {
                        l();
                        return false;
                    }
                } else {
                    int iD2 = (int) (juaVarK.b.f[juaVarK.h] - jtmVar.d());
                    if (iD2 < 0) {
                        bvx.e("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                        iD2 = 0;
                    }
                    if (jtmVar.k(iD2)) {
                        this.A = juaVarK;
                        juf jufVar4 = juaVarK.b;
                        int[] iArr2 = jufVar4.i;
                        i14 = juaVarK.f;
                        this.B = iArr2[i14];
                        i15 = jufVar4.h[i14];
                        this.C = i15;
                        if (i14 < juaVarK.i) {
                            if (juaVarK.d.g == 1) {
                                this.C = i15 - 8;
                                if (jtmVar.k(8)) {
                                }
                            }
                            juaVar = this.A;
                            zEquals = "audio/ac4".equals(juaVar.d.f.q);
                            i16 = this.C;
                            if (zEquals) {
                                this.D = juaVar.a(i16, 7);
                                int i215 = this.C;
                                bwb bwbVar7 = this.l;
                                cuq.b(i215, bwbVar7);
                                this.A.a.c(bwbVar7, 7);
                                iA3 = this.D + 7;
                                this.D = iA3;
                            } else {
                                iA3 = juaVar.a(i16, 0);
                                this.D = iA3;
                            }
                            this.C += iA3;
                            byte[] bArr5 = this.i.b;
                            bArr5[0] = 0;
                            bArr5[1] = 0;
                            bArr5[2] = 0;
                            this.q = 4;
                            this.E = 0;
                            jua juaVar5 = this.A;
                            jufVar = juaVar5.b;
                            jueVar = juaVar5.d;
                            cwjVar = juaVar5.a;
                            i = juaVar5.f;
                            jA = jufVar.a(i) * 1000;
                            i2 = jueVar.j;
                            if (i2 == 0) {
                                while (true) {
                                    i12 = this.D;
                                    i13 = this.C;
                                    if (i12 >= i13) {
                                        int i216 = i;
                                        i8 = i19;
                                        z2 = jufVar.l[i216];
                                        yhkVarE = this.A.e();
                                        if (yhkVarE != null) {
                                            int i217 = (z2 ? 1 : 0) | 1073741824;
                                            obj = yhkVarE.e;
                                            r1 = i217;
                                        } else {
                                            obj = null;
                                            r1 = z2;
                                        }
                                        cwjVar.e(jA, r1 == true ? 1 : 0, this.C, 0, (cwi) obj);
                                        mediaParsersImplementation = this.a;
                                        if (mediaParsersImplementation != null) {
                                            mediaParsersImplementation.r(jA, (((long) this.B) * 1000000) / jueVar.c);
                                        }
                                        while (true) {
                                            arrayDeque = this.o;
                                            if (!arrayDeque.isEmpty()) {
                                                break;
                                                break;
                                            }
                                            yvt yvtVar5 = (yvt) arrayDeque.removeFirst();
                                            int i218 = this.w;
                                            i10 = yvtVar5.b;
                                            this.w = i218 - i10;
                                            j = jA + yvtVar5.a;
                                            cwjVarArr = this.H;
                                            length = cwjVarArr.length;
                                            while (i11 < length) {
                                                cwjVarArr[i11].e(j, 1, i10, this.w, null);
                                            }
                                        }
                                        if (!this.A.d()) {
                                            this.A = null;
                                        }
                                        i9 = 3;
                                        this.q = i9;
                                        return true;
                                    }
                                    iA2 = cwjVar.a(jtmVar, i13 - i12, false);
                                    if (iA2 != 0) {
                                        this.D += iA2;
                                    }
                                }
                            } else {
                                bwbVar = this.i;
                                i3 = i2 + 1;
                                i4 = 4 - i2;
                                bArr = bwbVar.b;
                                while (true) {
                                    if (this.D >= this.C) {
                                        int i219 = i;
                                        i8 = i19;
                                        z2 = jufVar.l[i219];
                                        yhkVarE = this.A.e();
                                        if (yhkVarE != null) {
                                            int i2110 = (z2 ? 1 : 0) | 1073741824;
                                            obj = yhkVarE.e;
                                            r1 = i2110;
                                        } else {
                                            obj = null;
                                            r1 = z2;
                                        }
                                        cwjVar.e(jA, r1 == true ? 1 : 0, this.C, 0, (cwi) obj);
                                        mediaParsersImplementation = this.a;
                                        if (mediaParsersImplementation != null) {
                                            mediaParsersImplementation.r(jA, (((long) this.B) * 1000000) / jueVar.c);
                                        }
                                        while (true) {
                                            arrayDeque = this.o;
                                            if (!arrayDeque.isEmpty()) {
                                                break;
                                                break;
                                            }
                                            yvt yvtVar6 = (yvt) arrayDeque.removeFirst();
                                            int i2111 = this.w;
                                            i10 = yvtVar6.b;
                                            this.w = i2111 - i10;
                                            j = jA + yvtVar6.a;
                                            cwjVarArr = this.H;
                                            length = cwjVarArr.length;
                                            while (i11 < length) {
                                                cwjVarArr[i11].e(j, 1, i10, this.w, null);
                                            }
                                        }
                                        if (!this.A.d()) {
                                            this.A = null;
                                        }
                                        i9 = 3;
                                        this.q = i9;
                                        return true;
                                    }
                                    i5 = this.E;
                                    if (i5 == 0) {
                                        if (jtmVar.j(bArr, i4, i3)) {
                                            bwbVar.P(i19);
                                            i6 = bwbVar.i();
                                            if (i6 <= 0) {
                                                throw new bsz("Invalid NAL length", null, true, 1);
                                            }
                                            this.E = i6 - 1;
                                            bwb bwbVar8 = this.h;
                                            bwbVar8.P(i19);
                                            cwjVar.c(bwbVar8, i18);
                                            cwjVar.c(bwbVar, 1);
                                            if (this.I.length > 0) {
                                                str = jueVar.f.q;
                                                byte b4 = bArr[i18];
                                                byte[] bArr6 = bxf.a;
                                                if ("video/avc".equals(str)) {
                                                    z = false;
                                                } else {
                                                    z = false;
                                                }
                                            } else {
                                                z = false;
                                            }
                                            this.F = z;
                                            this.D += 5;
                                            this.C += i4;
                                            i18 = 4;
                                            i19 = 0;
                                        }
                                    } else if (this.F) {
                                        bwbVar2 = this.j;
                                        bwbVar2.H(i5);
                                        i7 = 0;
                                        if (jtmVar.j(bwbVar2.b, 0, this.E)) {
                                            bwbVar2.P(0);
                                            bwbVar2.O(this.E);
                                            cwjVar.c(bwbVar2, this.E);
                                            int i2112 = this.E;
                                            int iE3 = bxf.e(bwbVar2.b, bwbVar2.d);
                                            bwbVar2.P("video/hevc".equals(jueVar.f.q) ? 1 : 0);
                                            bwbVar2.O(iE3);
                                            azz.k(jA, bwbVar2, this.I);
                                            iA = i2112;
                                            i7 = 0;
                                            this.D += iA;
                                            this.E -= iA;
                                            i19 = i7;
                                            i = i;
                                            i18 = 4;
                                        }
                                    } else {
                                        i7 = 0;
                                        iA = cwjVar.a(jtmVar, i5, false);
                                        if (iA == 0) {
                                        }
                                        this.D += iA;
                                        this.E -= iA;
                                        i19 = i7;
                                        i = i;
                                        i18 = 4;
                                    }
                                }
                            }
                        } else if (jtmVar.k(i15)) {
                            juaVar2 = this.A;
                            yhkVarE2 = juaVar2.e();
                            if (yhkVarE2 != null) {
                                jufVar2 = juaVar2.b;
                                bwbVar3 = jufVar2.o;
                                i17 = yhkVarE2.a;
                                if (i17 != 0) {
                                    bwbVar3.Q(i17);
                                }
                                if (jufVar2.c(juaVar2.f)) {
                                    bwbVar3.Q(bwbVar3.s() * 6);
                                }
                            }
                            if (!this.A.d()) {
                                this.A = null;
                            }
                            i9 = 3;
                            this.q = i9;
                            return true;
                        }
                    }
                }
                i7 = i19;
            }
        }
        return i7;
    }

    private static final jtz s(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (jtz) sparseArray.valueAt(0);
        }
        jtz jtzVar = (jtz) sparseArray.get(i);
        jtzVar.getClass();
        return jtzVar;
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        this.G = cvkVar;
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        SparseArray sparseArray = this.g;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((jua) sparseArray.valueAt(i)).c();
        }
        this.o.clear();
        this.w = 0;
        this.x = j2;
        this.n.clear();
        l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [cvb] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        boolean z;
        ?? r12;
        long jV;
        int i;
        boolean z2;
        boolean z3;
        ?? r0 = (cvb) cvjVar;
        long j = r0.a;
        int[] iArr = jud.a;
        long j2 = 4096;
        if (j != -1 && j <= 4096) {
            j2 = j;
        }
        bwb bwbVar = new bwb(64);
        int i2 = (int) j2;
        ?? r5 = 0;
        int i3 = 0;
        boolean z4 = false;
        while (true) {
            if (i3 < i2) {
                bwbVar.L(8);
                r0.n(bwbVar.b, r5, 8, r5);
                long jW = bwbVar.w();
                int i4 = bwbVar.i();
                if (jW == 1) {
                    r0.n(bwbVar.b, 8, 8, r5);
                    i = 16;
                    bwbVar.O(16);
                    jV = bwbVar.v();
                } else {
                    if (jW == 0 && j != -1) {
                        jW = (j - cvjVar.e()) + 8;
                    }
                    jV = jW;
                    i = 8;
                }
                long j3 = i;
                if (jV >= j3) {
                    i3 += i;
                    if (i4 == 1836019574) {
                        i2 += (int) jV;
                        if (j != -1 && i2 > j) {
                            i2 = (int) j;
                        }
                        bwbVar = bwbVar;
                        r5 = 0;
                    } else if (i4 != 1836019558) {
                        if (i4 == 1836475768) {
                            z2 = true;
                        } else if ((((long) i3) + jV) - j3 >= i2) {
                            z2 = false;
                        } else {
                            int i5 = (int) (jV - j3);
                            i3 += i5;
                            if (i4 != 1718909296) {
                                if (i5 != 0) {
                                    bwbVar = bwbVar;
                                    z3 = false;
                                    r0.m(i5, false);
                                }
                                r5 = z3;
                            } else if (i5 >= 8) {
                                bwbVar.L(i5);
                                r0.n(bwbVar.b, 0, i5, false);
                                int i6 = i5 >> 2;
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if (i7 != 1) {
                                        int i8 = bwbVar.i();
                                        if ((i8 >>> 8) != 3368816) {
                                            bwbVar = bwbVar;
                                            int[] iArr2 = jud.a;
                                            int i9 = 0;
                                            while (true) {
                                                if (i9 >= 26) {
                                                    continue;
                                                } else if (iArr2[i9] != i8) {
                                                    i9++;
                                                }
                                            }
                                        } else {
                                            bwbVar = bwbVar;
                                        }
                                        z4 = true;
                                        break;
                                    }
                                    bwbVar = bwbVar;
                                    bwbVar.Q(4);
                                }
                                if (!z4) {
                                    bwbVar = bwbVar;
                                }
                            }
                            bwbVar = bwbVar;
                            bwbVar = bwbVar;
                            z3 = false;
                            r5 = z3;
                        }
                        r12 = 0;
                        z = z2;
                    } else {
                        r12 = 0;
                        z = true;
                    }
                }
                r12 = 0;
                return r12;
            }
            ?? r13 = r5;
            z = r13 == true ? 1 : 0;
            r12 = r13;
            if (z4 && z) {
                return true;
            }
            return r12;
        }
    }

    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) throws bsz {
        jtl jtlVar = this.d;
        if (jtlVar == null) {
            jtlVar = new jtl();
            this.d = jtlVar;
        }
        jtlVar.a = cvjVar;
        while (true) {
            int i = this.q;
            if (i != 0) {
                if (i != 1) {
                    jtl jtlVar2 = this.d;
                    if (i == 2) {
                        p(jtlVar2);
                    } else if (r(jtlVar2)) {
                        return 0;
                    }
                } else {
                    o(this.d);
                }
            } else if (!q(this.d)) {
                return -1;
            }
        }
    }

    @Override // defpackage.jtn
    public final void h(jtk jtkVar) throws bsz {
        while (jtkVar.i()) {
            int i = this.q;
            long j = jtkVar.b;
            long jC = jtkVar.c();
            if (i == 0) {
                q(jtkVar);
            } else if (i == 1) {
                o(jtkVar);
            } else if (i != 2) {
                try {
                    r(jtkVar);
                } catch (IOException e) {
                    throw new bsz(null, e, true, 1);
                }
            } else {
                p(jtkVar);
            }
            if (i == this.q && j == jtkVar.b && jC == jtkVar.c()) {
                throw new bsz("Extractor failed to make progress.", null, true, 1);
            }
        }
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }

    protected jue i(jue jueVar) {
        return jueVar;
    }
}
