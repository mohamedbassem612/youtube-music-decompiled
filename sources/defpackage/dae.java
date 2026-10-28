package defpackage;

import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dae implements cvi {
    private long A;
    private cvk B;
    private dad[] C;
    private long[][] D;
    private int E;
    public final int a;
    private final dbl b;
    private final bwb c;
    private final bwb d;
    private final bwb e;
    private final bwb f;
    private final ArrayDeque g;
    private final dag h;
    private final List i;
    private final List j;
    private final List k;
    private agke l = agpi.a;
    private int m;
    private int n;
    private long o;
    private int p;
    private bwb q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private int z;

    public dae(dbl dblVar, int i) {
        this.b = dblVar;
        this.a = i;
        this.m = (i & 4) != 0 ? 3 : 0;
        this.h = new dag();
        this.i = new ArrayList();
        this.f = new bwb(16);
        this.g = new ArrayDeque();
        this.c = new bwb(bxf.a);
        this.d = new bwb(6);
        this.e = new bwb();
        this.r = -1;
        this.B = cvk.r;
        this.C = new dad[0];
        this.j = new ArrayList();
        this.k = new ArrayList();
    }

    public static int h(dal dalVar, long j) {
        int iA = dalVar.a(j);
        return iA == -1 ? dalVar.b(j) : iA;
    }

    public static long i(dal dalVar, long j, long j2) {
        int iH = h(dalVar, j);
        return iH != -1 ? Math.min(dalVar.c[iH], j2) : j2;
    }

    private static int j(int i) {
        return i != 1903435808 ? 0 : 1;
    }

    private final void k() {
        this.m = 0;
        this.p = 0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0260  */
    /* JADX WARN: Code duplicated, block: B:104:0x0268  */
    /* JADX WARN: Code duplicated, block: B:106:0x026e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0279  */
    /* JADX WARN: Code duplicated, block: B:109:0x0281  */
    /* JADX WARN: Code duplicated, block: B:110:0x0285  */
    /* JADX WARN: Code duplicated, block: B:113:0x0293  */
    /* JADX WARN: Code duplicated, block: B:114:0x0295  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:122:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:139:0x0308  */
    /* JADX WARN: Code duplicated, block: B:140:0x030b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0333  */
    /* JADX WARN: Code duplicated, block: B:146:0x033c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0342  */
    /* JADX WARN: Code duplicated, block: B:152:0x034c  */
    /* JADX WARN: Code duplicated, block: B:155:0x035a A[EDGE_INSN: B:155:0x035a->B:156:0x035c BREAK  A[LOOP:5: B:150:0x0346->B:234:?]] */
    /* JADX WARN: Code duplicated, block: B:157:0x035e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x0364  */
    /* JADX WARN: Code duplicated, block: B:162:0x036c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x0373  */
    /* JADX WARN: Code duplicated, block: B:232:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0358 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:? A[LOOP:5: B:150:0x0346->B:234:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x02cf A[EDGE_INSN: B:236:0x02cf->B:128:0x02cf BREAK  A[LOOP:6: B:116:0x02aa->B:127:0x02cc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:85:0x021f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0224  */
    /* JADX WARN: Code duplicated, block: B:89:0x0232  */
    /* JADX WARN: Code duplicated, block: B:91:0x0238  */
    /* JADX WARN: Code duplicated, block: B:93:0x023b  */
    /* JADX WARN: Code duplicated, block: B:94:0x023d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0243  */
    /* JADX WARN: Code duplicated, block: B:99:0x025a  */
    private final void l(long j) throws bsz {
        bsx bsxVarB;
        bsx bsxVar;
        int i;
        long j2;
        List list;
        int i2;
        int size;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3;
        String str;
        int i4;
        List list2;
        long j3;
        bse bseVar;
        String str2;
        int i5;
        bsd bsdVar;
        ArrayList arrayList3;
        int i6;
        String str3;
        long j4;
        bsx bsxVar2;
        List list3;
        bsx bsxVar3;
        bse bseVar2;
        boolean z;
        int i7;
        boolean z2;
        int i8;
        Iterator it;
        boolean z3;
        int length;
        int iMin;
        boolean z4;
        long jMin;
        int i9;
        int i10;
        int i11;
        long j5;
        int i12;
        int i13;
        int i14;
        int i15;
        while (true) {
            ArrayDeque arrayDeque = this.g;
            if (arrayDeque.isEmpty() || ((bww) arrayDeque.peek()).a != j) {
                break;
            }
            bww bwwVar = (bww) arrayDeque.pop();
            if (bwwVar.d == 1836019574) {
                long j6 = bwwVar.a;
                bww bwwVarA = bwwVar.a(1835365473);
                ArrayList arrayList4 = new ArrayList();
                if (bwwVarA != null) {
                    bsxVarB = czv.b(bwwVarA);
                    if (this.x) {
                        bsxVarB.getClass();
                        bwu bwuVar = (bwu) bsxVarB.c(bwu.class, new bym(6));
                        if (bwuVar != null && bwuVar.b[0] == 0) {
                            this.A = 16L;
                        }
                        bwu bwuVar2 = (bwu) bsxVarB.c(bwu.class, new bym(7));
                        bwuVar2.getClass();
                        List listD = bwuVar2.d();
                        ArrayList arrayList5 = new ArrayList(listD.size());
                        for (int i16 = 0; i16 < listD.size(); i16++) {
                            int iIntValue = ((Integer) listD.get(i16)).intValue();
                            if (iIntValue == 0) {
                                i15 = 1;
                            } else if (iIntValue == 1) {
                                i15 = 2;
                            } else if (iIntValue != 2) {
                                i15 = iIntValue != 3 ? 0 : 4;
                            } else {
                                i15 = 3;
                            }
                            arrayList5.add(Integer.valueOf(i15));
                        }
                        arrayList4 = arrayList5;
                    }
                } else {
                    bsxVarB = null;
                }
                ArrayList arrayList6 = new ArrayList();
                int i17 = this.E;
                ArrayList arrayList7 = arrayList4;
                cvr cvrVar = new cvr();
                bwx bwxVarB = bwwVar.b(1969517665);
                if (bwxVarB != null) {
                    bsx bsxVarC = czv.c(bwxVarB, false);
                    cvrVar.b(bsxVarC);
                    bsxVar = bsxVarC;
                } else {
                    bsxVar = null;
                }
                boolean z5 = 1 == i17;
                bwx bwxVarB2 = bwwVar.b(1836476516);
                bwxVarB2.getClass();
                long j7 = -9223372036854775807L;
                bsx bsxVar4 = new bsx(-9223372036854775807L, czv.d(bwxVarB2.a));
                int i18 = this.a;
                ArrayList arrayList8 = arrayList6;
                ArrayList arrayList9 = arrayList7;
                List<dal> listI = czv.i(bwwVar, cvrVar, -9223372036854775807L, null, 1 == (i18 & 1), z5, new bwa(5));
                if (this.x) {
                    ahno.P(arrayList9.size() == listI.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(arrayList9.size()), Integer.valueOf(listI.size())));
                }
                ArrayList arrayList10 = new ArrayList();
                Iterator it2 = listI.iterator();
                while (true) {
                    i = -1;
                    if (!it2.hasNext()) {
                        break;
                    }
                    int i19 = ((dal) it2.next()).a.l;
                    if (i19 != -1) {
                        Integer numValueOf = Integer.valueOf(i19);
                        if (!arrayList10.contains(numValueOf)) {
                            arrayList10.add(numValueOf);
                        }
                    }
                }
                List list4 = this.j;
                list4.clear();
                for (dal dalVar : listI) {
                    if (arrayList10.contains(Integer.valueOf(dalVar.a.a))) {
                        list4.add(dalVar);
                    }
                }
                String strL = om.l(listI);
                int i20 = -1;
                long j8 = -9223372036854775807L;
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    j2 = 0;
                    if (i21 >= listI.size()) {
                        break;
                    }
                    dal dalVar2 = (dal) listI.get(i21);
                    int i23 = dalVar2.b;
                    if (i23 != 0) {
                        daj dajVar = dalVar2.a;
                        if (dajVar.m) {
                            cvk cvkVar = this.B;
                            i2 = i22 + 1;
                            int i24 = dajVar.b;
                            dad dadVar = new dad(dajVar, dalVar2, cvkVar.s(i22, i24));
                            String str4 = strL;
                            if (dajVar.i == null) {
                                list2 = list4;
                                j3 = dajVar.f;
                                if (j3 == j8) {
                                }
                                list = list2;
                                cwj cwjVar = dadVar.c;
                                cwjVar.f();
                                long jMax = Math.max(j7, j3);
                                bseVar = dajVar.g;
                                str2 = bseVar.q;
                                if ("audio/true-hd".equals(str2)) {
                                    i5 = dalVar2.e << 4;
                                } else {
                                    i5 = dalVar2.e + 30;
                                }
                                bsdVar = new bsd(bseVar);
                                bsdVar.p = i5;
                                if (i24 == 2) {
                                    i13 = bseVar.f;
                                    if ((i18 & 8) != 0) {
                                        if (i20 == -1) {
                                            i14 = 1;
                                        } else {
                                            i14 = 2;
                                        }
                                        i13 |= i14;
                                    }
                                    if (this.x) {
                                        arrayList3 = arrayList9;
                                        bsdVar.h = ((Integer) arrayList3.get(i21)).intValue();
                                        i13 |= 32768;
                                    } else {
                                        arrayList3 = arrayList9;
                                    }
                                    bsdVar.f = i13;
                                    i24 = 2;
                                } else {
                                    arrayList3 = arrayList9;
                                }
                                if (bsy.n(str2)) {
                                    if (dalVar2.c()) {
                                        i4 = i21;
                                        z3 = dalVar2.j;
                                        if (z3) {
                                            length = i23;
                                        } else {
                                            length = dalVar2.h.length;
                                        }
                                        arrayList2 = arrayList3;
                                        iMin = Math.min(length, 20);
                                        if (j3 != j8) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        ahno.O(z4);
                                        i6 = i20;
                                        str3 = str2;
                                        jMin = Math.min(j3, 10000000L);
                                        int i25 = 0;
                                        i10 = -1;
                                        for (i9 = 0; i9 < iMin; i9++) {
                                            if (z3) {
                                                i11 = i9;
                                            } else {
                                                i11 = dalVar2.h[i9];
                                            }
                                            j5 = dalVar2.f[i11];
                                            if (j5 <= jMin) {
                                                break;
                                            }
                                            if (j5 < 0 && (i12 = dalVar2.d[i11]) > i25) {
                                                i25 = i12;
                                                i10 = i11;
                                            }
                                        }
                                        if (i10 != -1) {
                                            j4 = dalVar2.f[i10];
                                        }
                                    } else {
                                        i4 = i21;
                                        i6 = i20;
                                        arrayList2 = arrayList3;
                                        j4 = j8;
                                        str3 = str2;
                                    }
                                    if (j4 != j8) {
                                        bsxVar2 = new bsx(j8, new cxq(j4));
                                    } else {
                                        bsxVar2 = null;
                                    }
                                    nj.i(i24, cvrVar, bsdVar);
                                    bsx bsxVar5 = bseVar.m;
                                    list3 = this.i;
                                    bsx[] bsxVarArr = new bsx[5];
                                    if (list3.isEmpty()) {
                                        bsxVar3 = null;
                                    } else {
                                        bsxVar3 = new bsx(list3);
                                    }
                                    bsxVarArr[0] = bsxVar3;
                                    bsxVarArr[1] = bsxVar;
                                    bsxVarArr[2] = bsxVar4;
                                    bsxVarArr[3] = bsxVar2;
                                    bsxVarArr[4] = null;
                                    nj.j(i24, bsxVarB, bsdVar, bsxVar5, bsxVarArr);
                                    str = str4;
                                    bsdVar.a(str);
                                    bseVar2 = new bse(bsdVar);
                                    if (!Objects.equals(str3, "audio/mpeg") || cvh.f(str3)) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    i7 = dajVar.l;
                                    if (i7 != -1) {
                                        z2 = false;
                                        break;
                                    }
                                    it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((dal) it.next()).a.a == i7) {
                                                z2 = true;
                                                break;
                                            }
                                        } else {
                                            z2 = false;
                                            break;
                                        }
                                    }
                                    if (!z || z2) {
                                        dadVar.g = bseVar2;
                                    } else {
                                        cwjVar.b(bseVar2);
                                    }
                                    i8 = i6;
                                    i3 = -1;
                                    if (i24 == 2 || i8 != -1) {
                                        size = i8;
                                    } else {
                                        size = arrayList8.size();
                                    }
                                    arrayList = arrayList8;
                                    arrayList.add(dadVar);
                                    j7 = jMax;
                                } else {
                                    i4 = i21;
                                    i6 = i20;
                                    arrayList2 = arrayList3;
                                    str3 = str2;
                                }
                                j4 = j8;
                                if (j4 != j8) {
                                    bsxVar2 = new bsx(j8, new cxq(j4));
                                } else {
                                    bsxVar2 = null;
                                }
                                nj.i(i24, cvrVar, bsdVar);
                                bsx bsxVar6 = bseVar.m;
                                list3 = this.i;
                                bsx[] bsxVarArr2 = new bsx[5];
                                if (list3.isEmpty()) {
                                    bsxVar3 = null;
                                } else {
                                    bsxVar3 = new bsx(list3);
                                }
                                bsxVarArr2[0] = bsxVar3;
                                bsxVarArr2[1] = bsxVar;
                                bsxVarArr2[2] = bsxVar4;
                                bsxVarArr2[3] = bsxVar2;
                                bsxVarArr2[4] = null;
                                nj.j(i24, bsxVarB, bsdVar, bsxVar6, bsxVarArr2);
                                str = str4;
                                bsdVar.a(str);
                                bseVar2 = new bse(bsdVar);
                                if (Objects.equals(str3, "audio/mpeg")) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                i7 = dajVar.l;
                                if (i7 != -1) {
                                    z2 = false;
                                    break;
                                }
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((dal) it.next()).a.a == i7) {
                                            z2 = true;
                                            break;
                                        }
                                    } else {
                                        z2 = false;
                                        break;
                                    }
                                }
                                if (z) {
                                    dadVar.g = bseVar2;
                                } else {
                                    dadVar.g = bseVar2;
                                }
                                i8 = i6;
                                i3 = -1;
                                if (i24 == 2) {
                                    size = i8;
                                } else {
                                    size = i8;
                                }
                                arrayList = arrayList8;
                                arrayList.add(dadVar);
                                j7 = jMax;
                            } else {
                                list2 = list4;
                            }
                            j3 = dajVar.e;
                            if (j3 == j8) {
                                j3 = dalVar2.i;
                            }
                            list = list2;
                            cwj cwjVar2 = dadVar.c;
                            cwjVar2.f();
                            long jMax2 = Math.max(j7, j3);
                            bseVar = dajVar.g;
                            str2 = bseVar.q;
                            if ("audio/true-hd".equals(str2)) {
                                i5 = dalVar2.e << 4;
                            } else {
                                i5 = dalVar2.e + 30;
                            }
                            bsdVar = new bsd(bseVar);
                            bsdVar.p = i5;
                            if (i24 == 2) {
                                i13 = bseVar.f;
                                if ((i18 & 8) != 0) {
                                    if (i20 == -1) {
                                        i14 = 1;
                                    } else {
                                        i14 = 2;
                                    }
                                    i13 |= i14;
                                }
                                if (this.x) {
                                    arrayList3 = arrayList9;
                                    bsdVar.h = ((Integer) arrayList3.get(i21)).intValue();
                                    i13 |= 32768;
                                } else {
                                    arrayList3 = arrayList9;
                                }
                                bsdVar.f = i13;
                                i24 = 2;
                            } else {
                                arrayList3 = arrayList9;
                            }
                            if (bsy.n(str2)) {
                                if (dalVar2.c()) {
                                    i4 = i21;
                                    i6 = i20;
                                    arrayList2 = arrayList3;
                                    j4 = j8;
                                    str3 = str2;
                                } else {
                                    i4 = i21;
                                    z3 = dalVar2.j;
                                    if (z3) {
                                        length = dalVar2.h.length;
                                    } else {
                                        length = i23;
                                    }
                                    arrayList2 = arrayList3;
                                    iMin = Math.min(length, 20);
                                    if (j3 != j8) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    ahno.O(z4);
                                    i6 = i20;
                                    str3 = str2;
                                    jMin = Math.min(j3, 10000000L);
                                    int i26 = 0;
                                    i10 = -1;
                                    while (i9 < iMin) {
                                        if (z3) {
                                            i11 = i9;
                                        } else {
                                            i11 = dalVar2.h[i9];
                                        }
                                        j5 = dalVar2.f[i11];
                                        if (j5 <= jMin) {
                                            break;
                                            break;
                                        }
                                        if (j5 < 0) {
                                        }
                                    }
                                    if (i10 != -1) {
                                        j4 = dalVar2.f[i10];
                                    }
                                }
                                if (j4 != j8) {
                                    bsxVar2 = new bsx(j8, new cxq(j4));
                                } else {
                                    bsxVar2 = null;
                                }
                                nj.i(i24, cvrVar, bsdVar);
                                bsx bsxVar7 = bseVar.m;
                                list3 = this.i;
                                bsx[] bsxVarArr3 = new bsx[5];
                                if (list3.isEmpty()) {
                                    bsxVar3 = null;
                                } else {
                                    bsxVar3 = new bsx(list3);
                                }
                                bsxVarArr3[0] = bsxVar3;
                                bsxVarArr3[1] = bsxVar;
                                bsxVarArr3[2] = bsxVar4;
                                bsxVarArr3[3] = bsxVar2;
                                bsxVarArr3[4] = null;
                                nj.j(i24, bsxVarB, bsdVar, bsxVar7, bsxVarArr3);
                                str = str4;
                                bsdVar.a(str);
                                bseVar2 = new bse(bsdVar);
                                if (Objects.equals(str3, "audio/mpeg")) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                i7 = dajVar.l;
                                if (i7 != -1) {
                                    z2 = false;
                                    break;
                                }
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((dal) it.next()).a.a == i7) {
                                            z2 = true;
                                            break;
                                        }
                                    } else {
                                        z2 = false;
                                        break;
                                    }
                                }
                                if (z) {
                                    dadVar.g = bseVar2;
                                } else {
                                    dadVar.g = bseVar2;
                                }
                                i8 = i6;
                                i3 = -1;
                                if (i24 == 2) {
                                    size = i8;
                                } else {
                                    size = i8;
                                }
                                arrayList = arrayList8;
                                arrayList.add(dadVar);
                                j7 = jMax2;
                            } else {
                                i4 = i21;
                                i6 = i20;
                                arrayList2 = arrayList3;
                                str3 = str2;
                            }
                            j4 = j8;
                            if (j4 != j8) {
                                bsxVar2 = new bsx(j8, new cxq(j4));
                            } else {
                                bsxVar2 = null;
                            }
                            nj.i(i24, cvrVar, bsdVar);
                            bsx bsxVar8 = bseVar.m;
                            list3 = this.i;
                            bsx[] bsxVarArr4 = new bsx[5];
                            if (list3.isEmpty()) {
                                bsxVar3 = null;
                            } else {
                                bsxVar3 = new bsx(list3);
                            }
                            bsxVarArr4[0] = bsxVar3;
                            bsxVarArr4[1] = bsxVar;
                            bsxVarArr4[2] = bsxVar4;
                            bsxVarArr4[3] = bsxVar2;
                            bsxVarArr4[4] = null;
                            nj.j(i24, bsxVarB, bsdVar, bsxVar8, bsxVarArr4);
                            str = str4;
                            bsdVar.a(str);
                            bseVar2 = new bse(bsdVar);
                            if (Objects.equals(str3, "audio/mpeg")) {
                                z = true;
                            } else {
                                z = true;
                            }
                            i7 = dajVar.l;
                            if (i7 != -1) {
                                z2 = false;
                                break;
                            }
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((dal) it.next()).a.a == i7) {
                                        z2 = true;
                                        break;
                                    }
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                            if (z) {
                                dadVar.g = bseVar2;
                            } else {
                                dadVar.g = bseVar2;
                            }
                            i8 = i6;
                            i3 = -1;
                            if (i24 == 2) {
                                size = i8;
                            } else {
                                size = i8;
                            }
                            arrayList = arrayList8;
                            arrayList.add(dadVar);
                            j7 = jMax2;
                        } else {
                            list = list4;
                            i2 = i22;
                            size = i20;
                            arrayList = arrayList8;
                            arrayList2 = arrayList9;
                            i3 = -1;
                            str = strL;
                            i4 = i21;
                        }
                    } else {
                        list = list4;
                        i2 = i22;
                        size = i20;
                        arrayList = arrayList8;
                        arrayList2 = arrayList9;
                        i3 = -1;
                        str = strL;
                        i4 = i21;
                    }
                    i21 = i4 + 1;
                    i20 = size;
                    arrayList8 = arrayList;
                    i = i3;
                    strL = str;
                    arrayDeque = arrayDeque;
                    i22 = i2;
                    listI = listI;
                    list4 = list;
                    arrayList9 = arrayList2;
                    j8 = -9223372036854775807L;
                }
                ArrayDeque arrayDeque2 = arrayDeque;
                List list5 = list4;
                int i27 = i;
                int i28 = i20;
                dad[] dadVarArr = (dad[]) arrayList8.toArray(new dad[0]);
                this.C = dadVarArr;
                int length2 = dadVarArr.length;
                long[][] jArr = new long[length2][];
                int[] iArr = new int[length2];
                long[] jArr2 = new long[length2];
                boolean[] zArr = new boolean[length2];
                for (int i29 = 0; i29 < dadVarArr.length; i29++) {
                    jArr[i29] = new long[dadVarArr[i29].b.b];
                    jArr2[i29] = dadVarArr[i29].b.f[0];
                }
                int i30 = 0;
                while (i30 < dadVarArr.length) {
                    long j9 = Long.MAX_VALUE;
                    int i31 = i27;
                    for (int i32 = 0; i32 < dadVarArr.length; i32++) {
                        if (!zArr[i32]) {
                            long j10 = jArr2[i32];
                            if (j10 <= j9) {
                                i31 = i32;
                                j9 = j10;
                            }
                        }
                    }
                    int i33 = iArr[i31];
                    long[] jArr3 = jArr[i31];
                    jArr3[i33] = j2;
                    dal dalVar3 = dadVarArr[i31].b;
                    int i34 = i31;
                    j2 += (long) dalVar3.d[i33];
                    int i35 = i33 + 1;
                    iArr[i34] = i35;
                    if (i35 < jArr3.length) {
                        jArr2[i34] = dalVar3.f[i35];
                    } else {
                        zArr[i34] = true;
                        i30++;
                    }
                    i27 = -1;
                }
                this.D = jArr;
                this.B.t();
                this.B.z(new dac(j7, this.C, i28));
                arrayDeque2.clear();
                this.m = true != list5.isEmpty() ? 4 : 2;
            } else if (!arrayDeque.isEmpty()) {
                ((bww) arrayDeque.peek()).c(bwwVar);
            }
        }
        int i36 = this.m;
        if (i36 == 4 || i36 == 2) {
            return;
        }
        k();
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return this.l;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        if ((this.a & 16) == 0) {
            cvkVar = new dbo(cvkVar, this.b);
        }
        this.B = cvkVar;
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        this.g.clear();
        this.p = 0;
        this.r = -1;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.y = 0;
        this.z = 0;
        this.j.clear();
        this.k.clear();
        if (j == 0) {
            if (this.m != 3) {
                k();
                return;
            }
            dag dagVar = this.h;
            dagVar.c.clear();
            dagVar.d = 0;
            this.i.clear();
            return;
        }
        for (dad dadVar : this.C) {
            dal dalVar = dadVar.b;
            int iA = dalVar.a(j2);
            if (iA == -1) {
                iA = dalVar.b(j2);
            }
            dadVar.f = iA;
            jtq jtqVar = dadVar.h;
            if (jtqVar != null) {
                jtqVar.c();
            }
        }
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        cwd cwdVarA = dah.a(cvjVar, false);
        this.l = cwdVarA != null ? agke.q(cwdVarA) : agpi.a;
        return cwdVarA == null;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x031b  */
    /* JADX WARN: Code duplicated, block: B:162:0x03af  */
    /* JADX WARN: Code duplicated, block: B:217:0x049f  */
    /* JADX WARN: Code duplicated, block: B:219:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:221:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:251:0x0591 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x0593  */
    /* JADX WARN: Code duplicated, block: B:258:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:261:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:263:0x05da  */
    /* JADX WARN: Code duplicated, block: B:264:0x05df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:265:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:406:0x01f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x023e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x04c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x04e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x04e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01df  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) throws bsz {
        long j;
        byte b;
        long j2;
        char c;
        boolean z;
        long j3;
        int i;
        int i2;
        int[] iArr;
        int i3;
        int iC;
        int i4;
        int i5;
        long j4;
        long jF;
        long j5;
        long j6;
        char c2;
        int i6;
        ArrayList arrayList;
        List listH;
        int i7;
        List listH2;
        boolean z2;
        int i8;
        while (true) {
            int i9 = this.m;
            byte b2 = 0;
            boolean z3 = true;
            if (i9 != 0) {
                int i10 = 4;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            List list = this.j;
                            dal dalVar = (dal) list.get(this.y);
                            int i11 = this.z;
                            int i12 = dalVar.b;
                            if (i11 < i12) {
                                long j7 = dalVar.c[i11];
                                if (cvjVar.f() != j7) {
                                    qhaVar.a = j7;
                                    return 1;
                                }
                                int i13 = dalVar.d[this.z];
                                bwb bwbVar = this.e;
                                bwbVar.L(i13);
                                cvjVar.j(bwbVar.b, 0, i13);
                                String strC = bwbVar.C(Math.min(bwbVar.s(), bwbVar.d()));
                                long[] jArr = dalVar.f;
                                long jF2 = bwp.F(jArr[this.z]);
                                int i14 = this.z + 1;
                                this.k.add(new cxl(jF2, i14 < i12 ? bwp.F(jArr[i14]) : bwp.F(dalVar.i), false, new bsg(null, strC)));
                                this.z++;
                            } else {
                                dad[] dadVarArr = this.C;
                                int length = dadVarArr.length;
                                int i15 = 0;
                                while (i15 < length) {
                                    dad dadVar = dadVarArr[i15];
                                    if (dadVar.a.l == dalVar.a.a) {
                                        bse bseVar = dadVar.g;
                                        bseVar.getClass();
                                        ArrayList arrayList2 = new ArrayList();
                                        bsx bsxVar = bseVar.m;
                                        if (bsxVar != null) {
                                            arrayList2.addAll(bsxVar.f(bsw.class, new bym(5)));
                                        }
                                        arrayList2.addAll(this.k);
                                        bsd bsdVar = new bsd(bseVar);
                                        bsdVar.l = new bsx(arrayList2);
                                        bse bseVar2 = new bse(bsdVar);
                                        String str = bseVar2.q;
                                        if (Objects.equals(str, "audio/mpeg") || cvh.f(str)) {
                                            dadVar.g = bseVar2;
                                        } else {
                                            dadVar.c.b(bseVar2);
                                            dadVar.g = null;
                                        }
                                    } else {
                                        z3 = z3;
                                    }
                                    i15++;
                                    z3 = z3;
                                }
                                this.y++;
                                this.z = 0;
                                this.k.clear();
                                if (this.y == list.size()) {
                                    this.m = 2;
                                }
                            }
                            return 0;
                        }
                        dag dagVar = this.h;
                        List list2 = this.i;
                        int i16 = dagVar.d;
                        if (i16 != 0) {
                            if (i16 != 1) {
                                char c3 = 2817;
                                short s = 2816;
                                short s2 = 2192;
                                if (i16 != 2) {
                                    long jF3 = cvjVar.f();
                                    int iD = (int) ((cvjVar.d() - cvjVar.f()) - ((long) dagVar.e));
                                    bwb bwbVar2 = new bwb(iD);
                                    cvjVar.j(bwbVar2.b, 0, iD);
                                    int i17 = 0;
                                    while (true) {
                                        List list3 = dagVar.c;
                                        if (i17 < list3.size()) {
                                            yvt yvtVar = (yvt) list3.get(i17);
                                            bwbVar2.P((int) (yvtVar.a - jF3));
                                            bwbVar2.Q(i10);
                                            int iJ = bwbVar2.j();
                                            String strC2 = bwbVar2.C(iJ);
                                            switch (strC2.hashCode()) {
                                                case -1711564334:
                                                    if (!strC2.equals("SlowMotion_Data")) {
                                                        throw new bsz("Invalid SEF name", null, true, 1);
                                                    }
                                                    c2 = 2192;
                                                    i6 = yvtVar.b - (iJ + 8);
                                                    if (c2 == 2192) {
                                                        arrayList = new ArrayList();
                                                        listH = dag.b.h(bwbVar2.C(i6));
                                                        for (i7 = 0; i7 < listH.size(); i7++) {
                                                            listH2 = dag.a.h((CharSequence) listH.get(i7));
                                                            if (listH2.size() != 3) {
                                                                throw new bsz(null, null, true, 1);
                                                            }
                                                            try {
                                                                arrayList.add(new cyo(Long.parseLong((String) listH2.get(0)), Long.parseLong((String) listH2.get(1)), 1 << (Integer.parseInt((String) listH2.get(2)) - 1)));
                                                            } catch (NumberFormatException e) {
                                                                throw new bsz(null, e, true, 1);
                                                            }
                                                        }
                                                        list2.add(new cyp(arrayList));
                                                    } else if (c2 == 2816 && c2 != c3 && c2 != 2819 && c2 != 2820) {
                                                        throw new IllegalStateException();
                                                    }
                                                    i17++;
                                                    i10 = 4;
                                                    c3 = 2817;
                                                    break;
                                                    break;
                                                case -1332107749:
                                                    if (!strC2.equals("Super_SlowMotion_Edit_Data")) {
                                                        throw new bsz("Invalid SEF name", null, true, 1);
                                                    }
                                                    c2 = 2819;
                                                    i6 = yvtVar.b - (iJ + 8);
                                                    if (c2 == 2192) {
                                                        arrayList = new ArrayList();
                                                        listH = dag.b.h(bwbVar2.C(i6));
                                                        while (i7 < listH.size()) {
                                                            listH2 = dag.a.h((CharSequence) listH.get(i7));
                                                            if (listH2.size() != 3) {
                                                                throw new bsz(null, null, true, 1);
                                                            }
                                                            arrayList.add(new cyo(Long.parseLong((String) listH2.get(0)), Long.parseLong((String) listH2.get(1)), 1 << (Integer.parseInt((String) listH2.get(2)) - 1)));
                                                        }
                                                        list2.add(new cyp(arrayList));
                                                    } else if (c2 == 2816) {
                                                        continue;
                                                    }
                                                    i17++;
                                                    i10 = 4;
                                                    c3 = 2817;
                                                    break;
                                                    break;
                                                case -1251387154:
                                                    if (!strC2.equals("Super_SlowMotion_Data")) {
                                                        throw new bsz("Invalid SEF name", null, true, 1);
                                                    }
                                                    c2 = 2816;
                                                    i6 = yvtVar.b - (iJ + 8);
                                                    if (c2 == 2192) {
                                                        arrayList = new ArrayList();
                                                        listH = dag.b.h(bwbVar2.C(i6));
                                                        while (i7 < listH.size()) {
                                                            listH2 = dag.a.h((CharSequence) listH.get(i7));
                                                            if (listH2.size() != 3) {
                                                                throw new bsz(null, null, true, 1);
                                                            }
                                                            arrayList.add(new cyo(Long.parseLong((String) listH2.get(0)), Long.parseLong((String) listH2.get(1)), 1 << (Integer.parseInt((String) listH2.get(2)) - 1)));
                                                        }
                                                        list2.add(new cyp(arrayList));
                                                    } else if (c2 == 2816) {
                                                        continue;
                                                    }
                                                    i17++;
                                                    i10 = 4;
                                                    c3 = 2817;
                                                    break;
                                                    break;
                                                case -830665521:
                                                    if (!strC2.equals("Super_SlowMotion_Deflickering_On")) {
                                                        throw new bsz("Invalid SEF name", null, true, 1);
                                                    }
                                                    c2 = 2820;
                                                    i6 = yvtVar.b - (iJ + 8);
                                                    if (c2 == 2192) {
                                                        arrayList = new ArrayList();
                                                        listH = dag.b.h(bwbVar2.C(i6));
                                                        while (i7 < listH.size()) {
                                                            listH2 = dag.a.h((CharSequence) listH.get(i7));
                                                            if (listH2.size() != 3) {
                                                                throw new bsz(null, null, true, 1);
                                                            }
                                                            arrayList.add(new cyo(Long.parseLong((String) listH2.get(0)), Long.parseLong((String) listH2.get(1)), 1 << (Integer.parseInt((String) listH2.get(2)) - 1)));
                                                        }
                                                        list2.add(new cyp(arrayList));
                                                    } else if (c2 == 2816) {
                                                        continue;
                                                    }
                                                    i17++;
                                                    i10 = 4;
                                                    c3 = 2817;
                                                    break;
                                                    break;
                                                case 1760745220:
                                                    if (!strC2.equals("Super_SlowMotion_BGM")) {
                                                        throw new bsz("Invalid SEF name", null, true, 1);
                                                    }
                                                    c2 = c3;
                                                    i6 = yvtVar.b - (iJ + 8);
                                                    if (c2 == 2192) {
                                                        arrayList = new ArrayList();
                                                        listH = dag.b.h(bwbVar2.C(i6));
                                                        while (i7 < listH.size()) {
                                                            listH2 = dag.a.h((CharSequence) listH.get(i7));
                                                            if (listH2.size() != 3) {
                                                                throw new bsz(null, null, true, 1);
                                                            }
                                                            arrayList.add(new cyo(Long.parseLong((String) listH2.get(0)), Long.parseLong((String) listH2.get(1)), 1 << (Integer.parseInt((String) listH2.get(2)) - 1)));
                                                        }
                                                        list2.add(new cyp(arrayList));
                                                    } else if (c2 == 2816) {
                                                        continue;
                                                    }
                                                    i17++;
                                                    i10 = 4;
                                                    c3 = 2817;
                                                    break;
                                                    break;
                                                default:
                                                    throw new bsz("Invalid SEF name", null, true, 1);
                                            }
                                        } else {
                                            qhaVar.a = 0L;
                                        }
                                    }
                                } else {
                                    long jD = cvjVar.d();
                                    int i18 = dagVar.e - 20;
                                    bwb bwbVar3 = new bwb(i18);
                                    cvjVar.j(bwbVar3.b, 0, i18);
                                    int i19 = 0;
                                    while (i19 < i18 / 12) {
                                        bwbVar3.Q(2);
                                        short sF = bwbVar3.F();
                                        if (sF == s2 || sF == s || sF == 2817 || sF == 2819 || sF == 2820) {
                                            dagVar.c.add(new yvt((jD - ((long) dagVar.e)) - ((long) bwbVar3.j()), bwbVar3.j()));
                                        } else {
                                            bwbVar3.Q(8);
                                        }
                                        i19++;
                                        s = 2816;
                                        s2 = 2192;
                                    }
                                    List list4 = dagVar.c;
                                    if (!list4.isEmpty()) {
                                        dagVar.d = 3;
                                        long j8 = ((yvt) list4.get(0)).a;
                                        qhaVar.a = j8;
                                        j5 = j8;
                                        j6 = 0;
                                        if (j5 != j6) {
                                            return 1;
                                        }
                                        k();
                                        return 1;
                                    }
                                    qhaVar.a = 0L;
                                }
                            } else {
                                bwb bwbVar4 = new bwb(8);
                                cvjVar.j(bwbVar4.b, 0, 8);
                                dagVar.e = bwbVar4.j() + 8;
                                if (bwbVar4.i() != 1397048916) {
                                    qhaVar.a = 0L;
                                } else {
                                    jF = cvjVar.f() - ((long) (dagVar.e - 12));
                                    qhaVar.a = jF;
                                    dagVar.d = 2;
                                }
                            }
                            j6 = 0;
                            j5 = 0;
                            if (j5 != j6) {
                                return 1;
                            }
                            k();
                            return 1;
                        }
                        long jD2 = cvjVar.d();
                        jF = (jD2 == -1 || jD2 < 8) ? 0L : jD2 - 8;
                        qhaVar.a = jF;
                        dagVar.d = 1;
                        j5 = jF;
                        j6 = 0;
                        if (j5 != j6) {
                            return 1;
                        }
                        k();
                        return 1;
                    }
                    long jF4 = cvjVar.f();
                    int i20 = this.r;
                    if (i20 == -1) {
                        int i21 = 0;
                        byte b3 = 1;
                        byte b4 = 1;
                        int i22 = -1;
                        int i23 = -1;
                        long jMin = Long.MAX_VALUE;
                        int i24 = -1;
                        j2 = 262144;
                        long j9 = Long.MAX_VALUE;
                        long j10 = Long.MAX_VALUE;
                        long j11 = Long.MAX_VALUE;
                        long j12 = Long.MAX_VALUE;
                        while (true) {
                            dad[] dadVarArr2 = this.C;
                            if (i21 >= dadVarArr2.length) {
                                break;
                            }
                            dad dadVar2 = dadVarArr2[i21];
                            int i25 = dadVar2.f;
                            byte b5 = b2;
                            dal dalVar2 = dadVar2.b;
                            byte b6 = b3;
                            if (i25 == dalVar2.b) {
                                j4 = jF4;
                            } else {
                                j4 = jF4;
                                long j13 = dalVar2.f[i25];
                                if (dadVar2.d) {
                                    jMin = Math.min(jMin, j13);
                                } else if (dadVar2.e && j13 < j10) {
                                    j10 = j13;
                                    i22 = i21;
                                }
                                long j14 = dalVar2.c[i25];
                                long[][] jArr2 = this.D;
                                jArr2.getClass();
                                long j15 = jArr2[i21][i25];
                                long j16 = j14 - j4;
                                b3 = (j16 < 0 || j16 >= 262144) ? (byte) 1 : b5;
                                if (b3 != 0) {
                                    if (b3 == b4 && j16 < j12) {
                                        b4 = b3;
                                        j12 = j16;
                                        i24 = i21;
                                        j11 = j15;
                                    }
                                } else if (b4 == 0) {
                                    b4 = b5;
                                    if (b3 == b4) {
                                        b4 = b3;
                                        j12 = j16;
                                        i24 = i21;
                                        j11 = j15;
                                    }
                                } else {
                                    b4 = b3;
                                    j12 = j16;
                                    i24 = i21;
                                    j11 = j15;
                                }
                                if (j15 < j9) {
                                    i23 = i21;
                                    j9 = j15;
                                }
                                i21++;
                                b2 = b5;
                                jF4 = j4;
                            }
                            b3 = b6;
                            i21++;
                            b2 = b5;
                            jF4 = j4;
                        }
                        j = jF4;
                        b = b2;
                        i20 = (jMin == Long.MAX_VALUE || i22 == -1 || j10 > jMin) ? (j9 == Long.MAX_VALUE || b3 == 0 || j11 < j9 + 10485760) ? i24 : i23 : i22;
                        this.r = i20;
                        if (i20 == -1) {
                            return -1;
                        }
                    } else {
                        j = jF4;
                        b = 0;
                        j2 = 262144;
                    }
                    dad dadVar3 = this.C[i20];
                    cwj cwjVar = dadVar3.c;
                    int i26 = dadVar3.f;
                    dal dalVar3 = dadVar3.b;
                    long j17 = dalVar3.c[i26] + this.A;
                    int[] iArr2 = dalVar3.d;
                    int iD2 = iArr2[i26];
                    jtq jtqVar = dadVar3.h;
                    long j18 = (j17 - j) + ((long) this.s);
                    if (j18 < 0 || j18 >= j2) {
                        qhaVar.a = j17;
                        return 1;
                    }
                    daj dajVar = dadVar3.a;
                    int i27 = dajVar.h;
                    if (i27 == 1) {
                        j18 += 8;
                        iD2 -= 8;
                        i27 = 1;
                    }
                    cvjVar.l((int) j18);
                    bse bseVar3 = dajVar.g;
                    String str2 = bseVar3.q;
                    if (Objects.equals(str2, "video/avc") || Objects.equals(str2, "video/hevc") || Objects.equals(str2, "video/apv")) {
                        c = 1;
                    } else {
                        c = 1;
                        this.v = true;
                    }
                    int i28 = dajVar.k;
                    if (i28 != 0) {
                        bwb bwbVar5 = this.d;
                        byte[] bArr = bwbVar5.b;
                        bArr[b] = b;
                        bArr[c] = b;
                        bArr[2] = b;
                        int i29 = 4 - i28;
                        iD2 += i29;
                        while (this.t < iD2) {
                            int i30 = this.u;
                            if (i30 == 0) {
                                if (this.v) {
                                    iArr = iArr2;
                                } else {
                                    iArr = iArr2;
                                    if (bxf.c(bseVar3) + i28 <= iArr2[i26] - this.s) {
                                        iC = bxf.c(bseVar3);
                                        i3 = i28 + iC;
                                    }
                                    cvjVar.j(bArr, i29, i3);
                                    this.s += i3;
                                    i4 = b;
                                    bwbVar5.P(i4);
                                    i5 = bwbVar5.i();
                                    if (i5 >= 0) {
                                        throw new bsz("Invalid NAL length", null, true, 1);
                                    }
                                    this.u = i5 - iC;
                                    bwb bwbVar6 = this.c;
                                    bwbVar6.P(i4);
                                    cwjVar.c(bwbVar6, 4);
                                    this.t += 4;
                                    if (iC > 0) {
                                        cwjVar.c(bwbVar5, iC);
                                        this.t += iC;
                                        if (bxf.j(bArr, iC, bseVar3)) {
                                            this.v = true;
                                        }
                                    }
                                }
                                i3 = i28;
                                iC = b;
                                cvjVar.j(bArr, i29, i3);
                                this.s += i3;
                                i4 = b;
                                bwbVar5.P(i4);
                                i5 = bwbVar5.i();
                                if (i5 >= 0) {
                                    throw new bsz("Invalid NAL length", null, true, 1);
                                }
                                this.u = i5 - iC;
                                bwb bwbVar7 = this.c;
                                bwbVar7.P(i4);
                                cwjVar.c(bwbVar7, 4);
                                this.t += 4;
                                if (iC > 0) {
                                    cwjVar.c(bwbVar5, iC);
                                    this.t += iC;
                                    if (bxf.j(bArr, iC, bseVar3)) {
                                        this.v = true;
                                    }
                                }
                            } else {
                                iArr = iArr2;
                                int iA = cwjVar.a(cvjVar, i30, b);
                                this.s += iA;
                                this.t += iA;
                                this.u -= iA;
                            }
                            iArr2 = iArr;
                            b = 0;
                        }
                    } else {
                        if (i27 == 2) {
                            bwb bwbVar8 = this.e;
                            bwbVar8.L(iD2);
                            cvjVar.j(bwbVar8.b, 0, iD2);
                            this.s += iD2;
                            if (czv.g(bwbVar8, dajVar.n)) {
                                iD2 = bwbVar8.d();
                                cwjVar.c(bwbVar8, iD2);
                                this.t += iD2;
                            } else {
                                z = false;
                            }
                            j3 = dalVar3.f[i26];
                            i = dalVar3.g[i26];
                            if (!this.v) {
                                i |= 67108864;
                            }
                            i2 = i;
                            if (jtqVar != null) {
                                jtqVar.d(cwjVar, j3, i2, iD2, 0, null);
                                if (i26 + 1 == dalVar3.b) {
                                    jtqVar.b(cwjVar, null);
                                }
                            } else if (z) {
                                cwjVar.e(j3, i2, iD2, 0, null);
                            }
                            dadVar3.f++;
                            this.r = -1;
                            this.s = 0;
                            this.t = 0;
                            this.u = 0;
                            this.v = false;
                            return 0;
                        }
                        bse bseVar4 = dadVar3.g;
                        if ("audio/ac4".equals(str2)) {
                            if (this.t == 0) {
                                bwb bwbVar9 = this.e;
                                cuq.b(iD2, bwbVar9);
                                cwjVar.c(bwbVar9, 7);
                                this.t += 7;
                            }
                            iD2 += 7;
                        } else if (bseVar4 == null) {
                            if (jtqVar != null) {
                                jtqVar.e(cvjVar);
                            }
                        } else if (Objects.equals(str2, "audio/mpeg")) {
                            bwb bwbVar10 = this.e;
                            bwbVar10.L(4);
                            cvjVar.i(bwbVar10.b, 0, 4);
                            cvjVar.k();
                            cvu cvuVar = new cvu();
                            if (cvuVar.a(bwbVar10.i()) && !Objects.equals(bseVar4.q, cvuVar.b)) {
                                bsd bsdVar2 = new bsd(bseVar4);
                                String str3 = cvuVar.b;
                                str3.getClass();
                                bsdVar2.e(str3);
                                bseVar4 = new bse(bsdVar2);
                            }
                            cwjVar.b(bseVar4);
                            dadVar3.g = null;
                        } else if (cvh.f(str2)) {
                            cwjVar.b(cvh.d(cvjVar, iD2, bseVar4));
                            dadVar3.g = null;
                        } else if (jtqVar != null) {
                            jtqVar.e(cvjVar);
                        }
                        while (true) {
                            int i31 = this.t;
                            if (i31 >= iD2) {
                                break;
                            }
                            int iA2 = cwjVar.a(cvjVar, iD2 - i31, false);
                            this.s += iA2;
                            this.t += iA2;
                            this.u -= iA2;
                        }
                    }
                    z = true;
                    j3 = dalVar3.f[i26];
                    i = dalVar3.g[i26];
                    if (!this.v) {
                        i |= 67108864;
                    }
                    i2 = i;
                    if (jtqVar != null) {
                        jtqVar.d(cwjVar, j3, i2, iD2, 0, null);
                        if (i26 + 1 == dalVar3.b) {
                            jtqVar.b(cwjVar, null);
                        }
                    } else if (z) {
                        cwjVar.e(j3, i2, iD2, 0, null);
                    }
                    dadVar3.f++;
                    this.r = -1;
                    this.s = 0;
                    this.t = 0;
                    this.u = 0;
                    this.v = false;
                    return 0;
                }
                long j19 = this.o - ((long) this.p);
                long jF5 = cvjVar.f() + j19;
                bwb bwbVar11 = this.q;
                if (bwbVar11 != null) {
                    cvjVar.j(bwbVar11.b, this.p, (int) j19);
                    if (this.n == 1718909296) {
                        this.w = true;
                        bwbVar11.P(8);
                        if (j(bwbVar11.i()) != 0) {
                            i8 = 1;
                            break;
                        }
                        bwbVar11.Q(4);
                        while (true) {
                            if (bwbVar11.d() <= 0) {
                                i8 = 0;
                                break;
                            }
                            if (j(bwbVar11.i()) != 0) {
                                i8 = 1;
                                break;
                            }
                        }
                        this.E = i8;
                    } else {
                        ArrayDeque arrayDeque = this.g;
                        if (!arrayDeque.isEmpty()) {
                            ((bww) arrayDeque.peek()).d(new bwx(this.n, bwbVar11));
                        }
                    }
                } else {
                    if (!this.w && this.n == 1835295092) {
                        this.E = 1;
                    }
                    if (j19 < 262144) {
                        cvjVar.l((int) j19);
                    } else {
                        qhaVar.a = cvjVar.f() + j19;
                        z2 = true;
                    }
                    l(jF5);
                    if (z2 && this.m != 2) {
                        return 1;
                    }
                }
                z2 = false;
                l(jF5);
                if (z2) {
                    continue;
                }
            } else {
                if (this.p == 0) {
                    bwb bwbVar12 = this.f;
                    if (!cvjVar.o(bwbVar12.b, 0, 8, true)) {
                        return -1;
                    }
                    this.p = 8;
                    bwbVar12.P(0);
                    this.o = bwbVar12.w();
                    this.n = bwbVar12.i();
                }
                long j20 = this.o;
                if (j20 == 1) {
                    bwb bwbVar13 = this.f;
                    cvjVar.j(bwbVar13.b, 8, 8);
                    this.p += 8;
                    this.o = bwbVar13.x();
                } else if (j20 == 0) {
                    long jD3 = cvjVar.d();
                    if (jD3 == -1) {
                        bww bwwVar = (bww) this.g.peek();
                        jD3 = bwwVar != null ? bwwVar.a : -1L;
                    }
                    if (jD3 != -1) {
                        this.o = (jD3 - cvjVar.f()) + ((long) this.p);
                    }
                }
                long j21 = this.o;
                int i32 = this.p;
                long j22 = i32;
                if (j21 < j22) {
                    if (this.n != 1718773093 || i32 != 8) {
                        throw new bsz("Atom size less than header length (unsupported).", null, false, 1);
                    }
                    this.o = j22;
                    i32 = 8;
                }
                int i33 = this.n;
                if (i33 == 1836019574 || i33 == 1953653099 || i33 == 1835297121 || i33 == 1835626086 || i33 == 1937007212 || i33 == 1701082227 || i33 == 1835365473 || i33 == 1635284069 || i33 == 1953654118) {
                    long jF6 = cvjVar.f();
                    long j23 = this.o;
                    long j24 = jF6 + j23;
                    long j25 = this.p;
                    if (j23 != j25 && this.n == 1835365473) {
                        bwb bwbVar14 = this.e;
                        bwbVar14.L(8);
                        cvjVar.i(bwbVar14.b, 0, 8);
                        czv.f(bwbVar14);
                        cvjVar.l(bwbVar14.c);
                        cvjVar.k();
                    }
                    long j26 = j24 - j25;
                    this.g.push(new bww(this.n, j26));
                    if (this.o == this.p) {
                        l(j26);
                    } else {
                        k();
                    }
                } else {
                    if (i33 == 1835296868 || i33 == 1836476516 || i33 == 1751411826 || i33 == 1937011556 || i33 == 1937011827 || i33 == 1937011571 || i33 == 1668576371 || i33 == 1701606260 || i33 == 1937011555 || i33 == 1937011578 || i33 == 1937013298 || i33 == 1937007471 || i33 == 1668232756 || i33 == 1953196132 || i33 == 1718909296 || i33 == 1969517665 || i33 == 1801812339 || i33 == 1768715124 || i33 == 1667785072) {
                        ahno.O(i32 == 8);
                        ahno.O(this.o <= 2147483647L);
                        bwb bwbVar15 = new bwb((int) this.o);
                        System.arraycopy(this.f.b, 0, bwbVar15.b, 0, 8);
                        this.q = bwbVar15;
                    } else {
                        this.q = null;
                    }
                    this.m = 1;
                }
            }
        }
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }
}
