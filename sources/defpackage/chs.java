package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class chs implements cnk, cop, cpj {
    public static final /* synthetic */ int k = 0;
    private static final Pattern l = Pattern.compile("CC([1-4])=(.+)");
    private static final Pattern m = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    private long A;
    private boolean B;
    private final aae C;
    private final aae D;
    private final eol E;
    private final aepb F;
    final int a;
    public final cih b;
    public cnj c;
    public chp d;
    public cpk[] e;
    public cif[] f;
    public cio g;
    public int h;
    public List i;
    public final crw j;
    private final bzg n;
    private final cjz o;
    private final crj p;
    private final long q;
    private final crq r;
    private final cra s;
    private final coy t;
    private final chr[] u;
    private final IdentityHashMap v;
    private coq w;
    private boolean x = true;
    private boolean y;
    private long z;

    /* JADX WARN: Code duplicated, block: B:110:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0121  */
    /* JADX WARN: Code duplicated, block: B:36:0x0152  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public chs(int i, cio cioVar, aepb aepbVar, int i2, eol eolVar, bzg bzgVar, cjz cjzVar, aae aaeVar, crj crjVar, aae aaeVar2, long j, crq crqVar, cra craVar, qcb qcbVar, crw crwVar) {
        int i3;
        int length;
        int[][] iArr;
        boolean[] zArr;
        bse[][] bseVarArr;
        bse[] bseVarArrW;
        boolean z;
        int iMin;
        cir cirVarS;
        String[] strArrSplit;
        int length2;
        int i4;
        Integer num;
        this.a = i;
        this.g = cioVar;
        this.F = aepbVar;
        this.h = i2;
        this.E = eolVar;
        this.n = bzgVar;
        this.o = cjzVar;
        this.D = aaeVar;
        this.p = crjVar;
        this.C = aaeVar2;
        this.q = j;
        this.r = crqVar;
        this.s = craVar;
        this.j = crwVar;
        boolean z2 = true;
        if (crwVar != null && crwVar.c) {
            chx chxVar = new chx(this, 1);
            this.d = chxVar;
            crwVar.d(chxVar);
        }
        this.b = new cih(cioVar, qcbVar, craVar);
        int i5 = 0;
        this.e = new cpk[0];
        this.f = new cif[0];
        this.v = new IdentityHashMap();
        this.w = ave.e();
        aesh aeshVarD = cioVar.d(i2);
        this.i = aeshVarD.d;
        ?? r1 = aeshVarD.f;
        List list = this.i;
        int size = r1.size();
        HashMap mapO = aguu.o(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            Long lValueOf = Long.valueOf(((cij) r1.get(i6)).a);
            Integer numValueOf = Integer.valueOf(i6);
            mapO.put(lValueOf, numValueOf);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(numValueOf);
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        int i7 = 0;
        while (i7 < size) {
            cij cijVar = (cij) r1.get(i7);
            cir cirVarS2 = s(cijVar.e, "http://dashif.org/guidelines/trickmode");
            cirVarS2 = cirVarS2 == null ? s(cijVar.f, "http://dashif.org/guidelines/trickmode") : cirVarS2;
            if (cirVarS2 != null) {
                String str = cirVarS2.b;
                int i8 = bwp.a;
                z = z2;
                Integer num2 = (Integer) mapO.get(Long.valueOf(Long.parseLong(str.split("\\s+", 2)[i5])));
                if (num2 != null && u(cijVar, (cij) r1.get(num2.intValue()))) {
                    iMin = num2.intValue();
                }
                if (iMin == i7 && (cirVarS = s(cijVar.f, "urn:mpeg:dash:adaptation-set-switching:2016")) != null) {
                    String str2 = cirVarS.b;
                    int i9 = bwp.a;
                    strArrSplit = str2.split(",", -1);
                    length2 = strArrSplit.length;
                    for (i4 = i5; i4 < length2; i4++) {
                        num = (Integer) mapO.get(Long.valueOf(Long.parseLong(strArrSplit[i4])));
                        if (num == null && u(cijVar, (cij) r1.get(num.intValue()))) {
                            iMin = Math.min(iMin, num.intValue());
                        }
                    }
                }
                if (iMin != i7) {
                    List list2 = (List) sparseArray.get(i7);
                    List list3 = (List) sparseArray.get(iMin);
                    list3.addAll(list2);
                    sparseArray.put(i7, list3);
                    arrayList.remove(list2);
                }
                i7++;
                z2 = z;
                i5 = 0;
            } else {
                z = z2;
            }
            iMin = i7;
            if (iMin == i7) {
                String str3 = cirVarS.b;
                int i10 = bwp.a;
                strArrSplit = str3.split(",", -1);
                length2 = strArrSplit.length;
                while (i4 < length2) {
                    num = (Integer) mapO.get(Long.valueOf(Long.parseLong(strArrSplit[i4])));
                    if (num == null) {
                    }
                }
            }
            if (iMin != i7) {
                List list4 = (List) sparseArray.get(i7);
                List list5 = (List) sparseArray.get(iMin);
                list5.addAll(list4);
                sparseArray.put(i7, list5);
                arrayList.remove(list4);
            }
            i7++;
            z2 = z;
            i5 = 0;
        }
        boolean z3 = z2;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i11 = 0; i11 < size2; i11++) {
            int[] iArrS = ahng.S((Collection) arrayList.get(i11));
            iArr2[i11] = iArrS;
            Arrays.sort(iArrS);
        }
        boolean[] zArr2 = new boolean[size2];
        bse[][] bseVarArr2 = new bse[size2][];
        int i12 = 0;
        int length3 = 0;
        while (i12 < size2) {
            int[] iArr3 = iArr2[i12];
            int length4 = iArr3.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length4) {
                    iArr = iArr2;
                    break;
                }
                List list6 = ((cij) r1.get(iArr3[i13])).c;
                iArr = iArr2;
                for (int i14 = 0; i14 < list6.size(); i14++) {
                    if (!((ciy) list6.get(i14)).g.isEmpty()) {
                        zArr2[i12] = z3;
                        length3++;
                        break;
                    }
                }
                i13++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i12];
            int length5 = iArr4.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length5) {
                    zArr = zArr2;
                    bseVarArr = bseVarArr2;
                    bseVarArrW = new bse[0];
                    break;
                }
                int i16 = iArr4[i15];
                cij cijVar2 = (cij) r1.get(i16);
                List list7 = ((cij) r1.get(i16)).d;
                int[] iArr5 = iArr4;
                int i17 = 0;
                while (i17 < list7.size()) {
                    cir cirVar = (cir) list7.get(i17);
                    zArr = zArr2;
                    String str4 = cirVar.a;
                    bseVarArr = bseVarArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(str4)) {
                        bsd bsdVar = new bsd();
                        bsdVar.e("application/cea-608");
                        bsdVar.a = cijVar2.a + ":cea608";
                        bseVarArrW = w(cirVar, l, new bse(bsdVar));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(str4)) {
                        bsd bsdVar2 = new bsd();
                        bsdVar2.e("application/cea-708");
                        bsdVar2.a = cijVar2.a + ":cea708";
                        bseVarArrW = w(cirVar, m, new bse(bsdVar2));
                        break;
                    }
                    i17++;
                    bseVarArr2 = bseVarArr;
                    zArr2 = zArr;
                }
                i15++;
                iArr4 = iArr5;
            }
            bseVarArr[i12] = bseVarArrW;
            length3 += bseVarArrW.length;
            i12++;
            bseVarArr2 = bseVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        bse[][] bseVarArr3 = bseVarArr2;
        int size3 = length3 + size2 + list.size();
        bto[] btoVarArr = new bto[size3];
        chr[] chrVarArr = new chr[size3];
        int i18 = 0;
        int i19 = 0;
        ?? r2 = r1;
        while (i18 < size2) {
            int[] iArr7 = iArr6[i18];
            ArrayList arrayList3 = new ArrayList();
            for (int i20 : iArr7) {
                arrayList3.addAll(((cij) r2.get(i20)).c);
            }
            int size4 = arrayList3.size();
            bse[] bseVarArr4 = new bse[size4];
            int i21 = 0;
            while (i21 < size4) {
                bse bseVar = ((ciy) arrayList3.get(i21)).c;
                int i22 = size2;
                bsd bsdVar3 = new bsd(bseVar);
                bsdVar3.Q = cjzVar.a(bseVar);
                bseVarArr4[i21] = new bse(bsdVar3);
                i21++;
                size2 = i22;
            }
            int i23 = size2;
            cij cijVar3 = (cij) r2.get(iArr7[0]);
            long j2 = cijVar3.a;
            String string = j2 != -1 ? Long.toString(j2) : a.bR(i18, "unset:");
            int i24 = i19 + 1;
            if (zArr3[i18]) {
                i3 = i24;
                i24 = i19 + 2;
            } else {
                i3 = -1;
            }
            int i25 = bseVarArr3[i18].length != 0 ? i24 : -1;
            x(eolVar, bseVarArr4);
            btoVarArr[i19] = new bto(string, bseVarArr4);
            chr chrVar = new chr(cijVar3.b, 0, iArr7, i19, i3, i25, bseVarArr3[i18].length, -1, null);
            int i26 = i3;
            int i27 = i25;
            chrVarArr[i19] = chrVar;
            int i28 = -1;
            if (i26 != -1) {
                String strValueOf = String.valueOf(string);
                bsd bsdVar4 = new bsd();
                String strConcat = strValueOf.concat(":emsg");
                bsdVar4.a = strConcat;
                bsdVar4.e("application/x-emsg");
                bsdVar4.m = string;
                bse[] bseVarArr5 = new bse[z3];
                bseVarArr5[0] = new bse(bsdVar4);
                btoVarArr[i26] = new bto(strConcat, bseVarArr5);
                chrVarArr[i26] = new chr(5, 1, iArr7, i19, -1, -1, -1, -1, null);
                i28 = -1;
            }
            if (i27 != i28) {
                bse[] bseVarArr6 = bseVarArr3[i18];
                x(eolVar, bseVarArr6);
                int i29 = i27;
                int i30 = 0;
                while (true) {
                    length = bseVarArr6.length;
                    if (i30 >= length) {
                        break;
                    }
                    bse bseVar2 = bseVarArr6[i30];
                    bse[] bseVarArr7 = bseVarArr3[i18];
                    bsd bsdVar5 = new bsd(bseVar2);
                    bsdVar5.m = string;
                    bseVarArr7[i30] = new bse(bsdVar5);
                    chrVarArr[i29] = new chr(3, 1, iArr7, i19, -1, -1, -1, -1, bseVar2);
                    btoVarArr[i29] = new bto(string + ":cc:" + i30, bseVarArr3[i18][i30]);
                    i29++;
                    i30++;
                }
                i24 += length;
            }
            i19 = i24;
            i18++;
            size2 = i23;
            r2 = r2;
            z3 = true;
        }
        int i31 = 0;
        while (i31 < list.size()) {
            dep depVar = (dep) list.get(i31);
            bsd bsdVar6 = new bsd();
            bsdVar6.a = depVar.f();
            bsdVar6.e("application/x-emsg");
            btoVarArr[i19] = new bto(depVar.f() + ':' + i31, new bse(bsdVar6));
            chrVarArr[i19] = new chr(5, 2, new int[0], -1, -1, -1, -1, i31, null);
            i31++;
            i19++;
        }
        Pair pairCreate = Pair.create(new coy(btoVarArr), chrVarArr);
        this.t = (coy) pairCreate.first;
        this.u = (chr[]) pairCreate.second;
        this.A = Long.MIN_VALUE;
    }

    private final int r(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        chr[] chrVarArr = this.u;
        int i3 = chrVarArr[i2].e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && chrVarArr[i5].c == 0) {
                return i4;
            }
        }
        return -1;
    }

    private static cir s(List list, String str) {
        for (int i = 0; i < list.size(); i++) {
            cir cirVar = (cir) list.get(i);
            if (str.equals(cirVar.a)) {
                return cirVar;
            }
        }
        return null;
    }

    private final void t(boolean z) {
        this.B = z;
        for (cpk cpkVar : this.e) {
            cpkVar.n = z;
        }
    }

    private static boolean u(cij cijVar, cij cijVar2) {
        if (cijVar.b != cijVar2.b) {
            return false;
        }
        List list = cijVar.c;
        if (!list.isEmpty()) {
            List list2 = cijVar2.c;
            if (!list2.isEmpty()) {
                bse bseVar = ((ciy) list.get(0)).c;
                bse bseVar2 = ((ciy) list2.get(0)).c;
                int i = bseVar.f;
                int i2 = bseVar2.f;
                if (!Objects.equals(bseVar.d, bseVar2.d) || (i & (-16385)) != (i2 & (-16385))) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean v() {
        for (cpk cpkVar : this.e) {
            if (cpkVar.l()) {
                return true;
            }
        }
        return false;
    }

    private static bse[] w(cir cirVar, Pattern pattern, bse bseVar) {
        String str = cirVar.b;
        if (str != null) {
            int i = bwp.a;
            String[] strArrSplit = str.split(";", -1);
            bse[] bseVarArr = new bse[strArrSplit.length];
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                Matcher matcher = pattern.matcher(strArrSplit[i2]);
                if (matcher.matches()) {
                    int i3 = Integer.parseInt(matcher.group(1));
                    bsd bsdVar = new bsd(bseVar);
                    bsdVar.a = bseVar.a + ':' + i3;
                    bsdVar.M = i3;
                    bsdVar.d = matcher.group(2);
                    bseVarArr[i2] = new bse(bsdVar);
                }
            }
            return bseVarArr;
        }
        return new bse[]{bseVar};
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [dbl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dbl, java.lang.Object] */
    private static void x(eol eolVar, bse[] bseVarArr) {
        for (int i = 0; i < bseVarArr.length; i++) {
            bse bseVar = bseVarArr[i];
            fsz fszVar = (fsz) eolVar.a;
            if (fszVar.a && fszVar.b.c(bseVar)) {
                bsd bsdVar = new bsd(bseVar);
                bsdVar.e("application/x-media3-cues");
                bsdVar.N = fszVar.b.a(bseVar);
                String str = bseVar.q;
                String str2 = bseVar.l;
                bsdVar.k = String.valueOf(str).concat(str2 != null ? " ".concat(str2) : "");
                bsdVar.t = Long.MAX_VALUE;
                bseVar = new bse(bsdVar);
            }
            bseVarArr[i] = bseVar;
        }
    }

    @Override // defpackage.cnk
    public final long a(long j, cdv cdvVar) {
        for (cpk cpkVar : this.e) {
            if (cpkVar.a == 2) {
                return cpkVar.e(j, cdvVar);
            }
        }
        return j;
    }

    @Override // defpackage.cop
    public final /* bridge */ /* synthetic */ void b(coq coqVar) {
        this.c.b(this);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final long d() {
        return this.w.d();
    }

    @Override // defpackage.cnk
    public final long e() {
        if (this.B) {
            boolean z = false;
            for (cpk cpkVar : this.e) {
                try {
                    boolean z2 = cpkVar.l;
                    cpkVar.l = false;
                    z |= z2;
                } catch (Throwable th) {
                    cpkVar.l = false;
                    throw th;
                }
            }
            if (!v()) {
                t(false);
            }
            if (z) {
                return this.z;
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.cnk
    public final long f(long j) throws Throwable {
        for (cpk cpkVar : this.e) {
            cpkVar.i(j);
        }
        for (cif cifVar : this.f) {
            cifVar.e(j);
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v20, types: [byd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // defpackage.cnk
    public final long g(cqs[] cqsVarArr, boolean[] zArr, coo[] cooVarArr, boolean[] zArr2, long j) throws Throwable {
        int i;
        boolean z;
        int i2;
        int[] iArr;
        int[] iArr2;
        int i3;
        int i4;
        ?? r13;
        bto btoVarB;
        ?? r10;
        cig cigVar;
        int[] iArr3;
        long jH;
        boolean z2;
        cqs[] cqsVarArr2 = cqsVarArr;
        int[] iArr4 = new int[cqsVarArr2.length];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = -1;
            if (i6 >= cqsVarArr2.length) {
                break;
            }
            cqs cqsVar = cqsVarArr2[i6];
            if (cqsVar != null) {
                iArr4[i6] = this.t.a(cqsVar.d());
            } else {
                iArr4[i6] = -1;
            }
            i6++;
        }
        for (int i7 = 0; i7 < cqsVarArr2.length; i7++) {
            if (cqsVarArr2[i7] == null || !zArr[i7]) {
                ?? r4 = cooVarArr[i7];
                if (r4 instanceof cpk) {
                    ((cpk) r4).h(this);
                } else if (r4 instanceof cpi) {
                    ((cpi) r4).e();
                }
                cooVarArr[i7] = null;
            }
        }
        int i8 = 0;
        while (true) {
            z = true;
            if (i8 >= cqsVarArr2.length) {
                break;
            }
            ?? r5 = cooVarArr[i8];
            if ((r5 instanceof cmz) || (r5 instanceof cpi)) {
                int iR = r(i8, iArr4);
                if (iR == -1) {
                    z = cooVarArr[i8] instanceof cmz;
                } else {
                    ?? r11 = cooVarArr[i8];
                    if (!(r11 instanceof cpi) || ((cpi) r11).a != cooVarArr[iR]) {
                        z = false;
                    }
                }
                if (!z) {
                    ?? r6 = cooVarArr[i8];
                    if (r6 instanceof cpi) {
                        ((cpi) r6).e();
                    }
                    cooVarArr[i8] = null;
                }
            }
            i8++;
        }
        int i9 = 0;
        while (true) {
            i2 = 2;
            if (i9 >= cqsVarArr2.length) {
                break;
            }
            cqs cqsVar2 = cqsVarArr2[i9];
            if (cqsVar2 == null) {
                iArr2 = iArr4;
                i3 = i9;
                i4 = i5;
            } else {
                ?? r12 = cooVarArr[i9];
                if (r12 == null) {
                    zArr2[i9] = z;
                    int i10 = iArr4[i9];
                    chr[] chrVarArr = this.u;
                    chr chrVar = chrVarArr[i10];
                    int i11 = chrVar.c;
                    if (i11 == 0) {
                        int i12 = chrVar.f;
                        ?? r29 = i12 != i ? z : i5;
                        if (r29 != 0) {
                            btoVarB = this.t.b(i12);
                            r13 = z;
                        } else {
                            r13 = i5;
                            btoVarB = null;
                        }
                        agjz agjzVar = new agjz(4);
                        boolean z3 = z;
                        int i13 = chrVar.g;
                        if (i13 != i) {
                            for (int i14 = i5; i14 < chrVar.h; i14++) {
                                bse bseVar = chrVarArr[i13 + i14].i;
                                if (bseVar != null) {
                                    agjzVar.h(bseVar);
                                }
                            }
                        }
                        agke agkeVarG = agjzVar.g();
                        int i15 = ((agpi) agkeVarG).d;
                        int i16 = r13 + i15;
                        int i17 = i9;
                        bse[] bseVarArr = new bse[i16];
                        int[] iArr5 = new int[i16];
                        if (r29 != 0) {
                            bseVarArr[i5] = btoVarB.b(i5);
                            iArr5[i5] = 5;
                            r10 = z3;
                        } else {
                            r10 = i5;
                        }
                        agjz agjzVar2 = new agjz(4);
                        int i18 = i5;
                        ?? r14 = r10;
                        while (i18 < i15) {
                            bse bseVar2 = (bse) agkeVarG.get(i18);
                            bseVarArr[r14] = bseVar2;
                            iArr5[r14] = 3;
                            agjzVar2.h(bseVar2);
                            i18++;
                            r14++;
                        }
                        agke agkeVarG2 = agjzVar2.g();
                        if (!this.g.d || r29 == 0) {
                            cigVar = null;
                        } else {
                            cih cihVar = this.b;
                            cigVar = new cig(cihVar, cihVar.a);
                        }
                        cio cioVar = this.g;
                        int i19 = this.h;
                        int[] iArr6 = chrVar.a;
                        long jC = cioVar.c(i19);
                        ?? r2 = cioVar.d(i19).f;
                        int i20 = 0;
                        while (true) {
                            if (i20 >= iArr6.length) {
                                iArr3 = iArr4;
                                jH = -9223372036854775807L;
                                break;
                            }
                            List list = ((cij) r2.get(iArr6[i20])).c;
                            iArr3 = iArr4;
                            for (int i21 = 0; i21 < list.size(); i21++) {
                                cia ciaVarK = ((ciy) list.get(i21)).k();
                                if (ciaVarK != null && ciaVarK.f(jC) != 0) {
                                    jH = ciaVarK.h(ciaVarK.g(j, jC));
                                    break;
                                }
                            }
                            i20++;
                            iArr4 = iArr3;
                        }
                        long j2 = jH;
                        if (!this.x) {
                            z2 = false;
                            break;
                        }
                        ?? r0 = this.g.d(this.h).f;
                        agjz agjzVar3 = new agjz(4);
                        for (int i22 : iArr6) {
                            agjzVar3.j(((cij) r0.get(i22)).c);
                        }
                        agke agkeVarG3 = agjzVar3.g();
                        int i23 = 0;
                        while (true) {
                            if (i23 >= cqsVar2.q()) {
                                z2 = false;
                                break;
                            }
                            if (!con.D(((ciy) agkeVarG3.get(cqsVar2.n(i23))).c)) {
                                z2 = z3;
                                break;
                            }
                            i23++;
                        }
                        eol eolVar = this.E;
                        crq crqVar = this.r;
                        cio cioVar2 = this.g;
                        aepb aepbVar = this.F;
                        int i24 = this.h;
                        int i25 = chrVar.b;
                        long j3 = this.q;
                        bzg bzgVar = this.n;
                        crw crwVar = this.j;
                        bye byeVarA = eolVar.b.a();
                        if (bzgVar != null) {
                            byeVarA.e(bzgVar);
                        }
                        cig cigVar2 = cigVar;
                        iArr2 = iArr3;
                        i3 = i17;
                        cpk cpkVar = new cpk(i25, iArr5, bseVarArr, new cie((fsz) eolVar.a, crqVar, cioVar2, aepbVar, i24, iArr6, cqsVar2, i25, byeVarA, j3, r29, agkeVarG2, cigVar, crwVar), this, this.s, j, this.o, this.D, this.p, this.C, z2, j2);
                        cpkVar.j(this.A);
                        synchronized (this) {
                            this.v.put(cpkVar, cigVar2);
                        }
                        cooVarArr[i3] = cpkVar;
                    } else {
                        iArr2 = iArr4;
                        i3 = i9;
                        if (i11 == 2) {
                            i4 = 0;
                            cooVarArr[i3] = new cif((dep) this.i.get(chrVar.d), cqsVar2.d().b(0), this.g.d);
                        }
                    }
                    i4 = 0;
                } else {
                    iArr2 = iArr4;
                    i3 = i9;
                    i4 = i5;
                    if (r12 instanceof cpk) {
                        ((cie) ((cpk) r12).e).b = cqsVar2;
                    }
                }
            }
            i5 = i4;
            iArr4 = iArr2;
            i = -1;
            z = true;
            i9 = i3 + 1;
            cqsVarArr2 = cqsVarArr;
        }
        int[] iArr7 = iArr4;
        ?? r3 = i5;
        while (i5 < cqsVarArr.length) {
            if (cooVarArr[i5] != null || cqsVarArr[i5] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                chr chrVar2 = this.u[iArr[i5]];
                if (chrVar2.c != 1) {
                    continue;
                } else {
                    int iR2 = r(i5, iArr);
                    if (iR2 == -1) {
                        cooVarArr[i5] = new cmz();
                    } else {
                        cpk cpkVar2 = (cpk) cooVarArr[iR2];
                        int i26 = chrVar2.b;
                        int i27 = r3 == true ? 1 : 0;
                        while (true) {
                            con[] conVarArr = cpkVar2.i;
                            if (i27 >= conVarArr.length) {
                                throw new IllegalStateException();
                            }
                            if (cpkVar2.b[i27] == i26) {
                                boolean[] zArr3 = cpkVar2.d;
                                ahno.O(!zArr3[i27]);
                                zArr3[i27] = true;
                                conVarArr[i27].H(j, true);
                                cooVarArr[i5] = new cpi(cpkVar2, cpkVar2, conVarArr[i27], i27);
                                break;
                            }
                            i27++;
                        }
                    }
                }
            }
            i5++;
            iArr7 = iArr;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = cooVarArr.length;
        for (int i28 = r3 == true ? 1 : 0; i28 < length; i28++) {
            ?? r9 = cooVarArr[i28];
            if (r9 instanceof cpk) {
                cpk cpkVar3 = (cpk) r9;
                if (this.y) {
                    cpkVar3.m = true;
                }
                arrayList.add(cpkVar3);
            } else if (r9 instanceof cif) {
                arrayList2.add((cif) r9);
            }
        }
        cpk[] cpkVarArr = new cpk[arrayList.size()];
        this.e = cpkVarArr;
        arrayList.toArray(cpkVarArr);
        cif[] cifVarArr = new cif[arrayList2.size()];
        this.f = cifVarArr;
        arrayList2.toArray(cifVarArr);
        this.w = new cmu(arrayList, aguu.u(arrayList, new cbs(i2)));
        if (this.x) {
            this.x = r3;
            this.z = j;
            if (!this.y && v()) {
                t(true);
            }
        }
        return j;
    }

    @Override // defpackage.cnk, defpackage.coq
    public final long gt() {
        return this.w.gt();
    }

    @Override // defpackage.cnk
    public final long h(long j) {
        this.A = j;
        for (cpk cpkVar : this.e) {
            cpkVar.j(j);
        }
        return j;
    }

    @Override // defpackage.cnk
    public final coy i() {
        return this.t;
    }

    @Override // defpackage.cnk
    public final void j() {
        this.r.a();
    }

    @Override // defpackage.cpj
    public final synchronized void k(cpk cpkVar) {
        cig cigVar = (cig) this.v.remove(cpkVar);
        if (cigVar != null) {
            cigVar.a.x();
        }
    }

    @Override // defpackage.cnk
    public final void l(cnj cnjVar, long j) {
        this.c = cnjVar;
        cnjVar.gp(this);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    @Override // defpackage.cnk, defpackage.coq
    public final void m(long j) {
        int i;
        cpk[] cpkVarArr = this.e;
        int length = cpkVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            cpk cpkVar = cpkVarArr[i2];
            if (cpkVar.p()) {
                i = i2;
            } else {
                long jC = this.g.c(this.h);
                ahno.O(!cpkVar.f.g());
                if (cpkVar.k() || jC == -9223372036854775807L || cpkVar.g.isEmpty()) {
                    i = i2;
                } else {
                    cpb cpbVarG = cpkVar.g();
                    long j2 = cpbVarG.b;
                    if (j2 == -9223372036854775807L) {
                        j2 = cpbVarG.l;
                    }
                    if (j2 > jC) {
                        con conVar = cpkVar.h;
                        long jO = conVar.o();
                        if (jO > jC) {
                            conVar.t(Math.max(jC, conVar.p() + 1));
                            con[] conVarArr = cpkVar.i;
                            int length2 = conVarArr.length;
                            int i3 = 0;
                            while (i3 < length2) {
                                con conVar2 = conVarArr[i3];
                                conVar2.t(Math.max(jC, conVar2.p() + 1));
                                i3++;
                                i2 = i2;
                            }
                            i = i2;
                            cpkVar.p.n(cpkVar.a, jC, jO);
                        } else {
                            i = i2;
                        }
                    } else {
                        i = i2;
                    }
                }
            }
            i2 = i + 1;
        }
        this.w.m(j);
    }

    @Override // defpackage.cnk
    public final void n() {
        this.y = true;
    }

    @Override // defpackage.cnk, defpackage.coq
    public final boolean o(ccy ccyVar) {
        return this.w.o(ccyVar);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final boolean p() {
        return this.w.p();
    }

    @Override // defpackage.cnk
    public final void q(long j) {
        for (cpk cpkVar : this.e) {
            cpkVar.n(j);
        }
    }
}
