package defpackage;

import android.os.SystemClock;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cie implements cpl {
    protected final cic[] a;
    public cqs b;
    public cio c;
    public int d;
    public IOException e;
    public cim f;
    private final crq g;
    private final int[] h;
    private final int i;
    private final bye j;
    private final long k;
    private final cig l;
    private boolean m;
    private final crw n;
    private final aepb o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [cie, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [dbl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [dbl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [dbl, java.lang.Object] */
    public cie(fsz fszVar, crq crqVar, cio cioVar, aepb aepbVar, int i, int[] iArr, cqs cqsVar, int i2, bye byeVar, long j, boolean z, List list, cig cigVar, crw crwVar) {
        ArrayList arrayList;
        cvi daaVar;
        cpf cpfVar;
        ?? obj = new Object();
        obj.g = crqVar;
        obj.c = cioVar;
        obj.o = aepbVar;
        obj.h = iArr;
        obj.b = cqsVar;
        obj.i = i2;
        obj.j = byeVar;
        obj.d = i;
        obj.k = j;
        obj.l = cigVar;
        obj.n = crwVar;
        long jC = cioVar.c(i);
        ArrayList arrayListC = obj.c();
        obj.a = new cic[cqsVar.q()];
        int i3 = 0;
        int i4 = 0;
        cie cieVar = obj;
        while (i4 < cieVar.a.length) {
            ciy ciyVar = (ciy) arrayListC.get(cqsVar.n(i4));
            cim cimVarF = aepbVar.f(ciyVar.d);
            cic[] cicVarArr = cieVar.a;
            int i5 = i4;
            cimVarF = cimVarF == null ? (cim) ciyVar.d.get(i3) : cimVarF;
            bse bseVar = ciyVar.c;
            String str = bseVar.p;
            if (bsy.m(str)) {
                if (fszVar.a) {
                    daaVar = new dbh(fszVar.b.b(bseVar), bseVar);
                    arrayList = arrayListC;
                } else {
                    arrayList = arrayListC;
                    i5 = i5;
                    cpfVar = null;
                }
                int i6 = i5;
                cicVarArr[i6] = new cic(jC, ciyVar, cimVarF, cpfVar, 0L, ciyVar.k());
                i4 = i6 + 1;
                cieVar = this;
                arrayListC = arrayList;
                i3 = 0;
            } else {
                if (bsy.l(str)) {
                    arrayList = arrayListC;
                    daaVar = new czc(fszVar.b, true != fszVar.a ? 3 : 1);
                } else {
                    arrayList = arrayListC;
                    if (Objects.equals(str, "image/jpeg")) {
                        daaVar = new cxi(1, 0);
                    } else {
                        if (Objects.equals(str, "image/png")) {
                            daaVar = new cwx(2, (byte[]) null);
                        } else {
                            int i7 = true != z ? 0 : 4;
                            daaVar = new daa(fszVar.b, fszVar.a ? i7 : i7 | 32, list, cigVar);
                        }
                        cpfVar = new cpf(daaVar, i2, bseVar);
                        int i8 = i5;
                        cicVarArr[i8] = new cic(jC, ciyVar, cimVarF, cpfVar, 0L, ciyVar.k());
                        i4 = i8 + 1;
                        cieVar = this;
                        arrayListC = arrayList;
                        i3 = 0;
                    }
                }
            }
            cpfVar = new cpf(daaVar, i2, bseVar);
            int i9 = i5;
            cicVarArr[i9] = new cic(jC, ciyVar, cimVarF, cpfVar, 0L, ciyVar.k());
            i4 = i9 + 1;
            cieVar = this;
            arrayListC = arrayList;
            i3 = 0;
        }
    }

    private final long j(long j) {
        cio cioVar = this.c;
        long j2 = cioVar.a;
        if (j2 != -9223372036854775807L) {
            return j - bwp.y(j2 + cioVar.d(this.d).a);
        }
        return -9223372036854775807L;
    }

    private final cic k(int i) {
        cic[] cicVarArr = this.a;
        cic cicVar = cicVarArr[i];
        ciy ciyVar = cicVar.a;
        cim cimVarF = this.o.f(ciyVar.d);
        if (cimVarF != null) {
            if (!cimVarF.equals(cicVar.b)) {
                cic cicVar2 = new cic(cicVar.d, ciyVar, cimVarF, cicVar.f, cicVar.e, cicVar.c);
                cicVarArr[i] = cicVar2;
                cicVar = cicVar2;
            }
            this.f = cimVarF;
        }
        return cicVar;
    }

    private static final long l(cic cicVar, cpo cpoVar, long j, long j2, long j3) {
        return cpoVar != null ? cpoVar.h() : bwp.t(cicVar.f(j), j2, j3);
    }

    @Override // defpackage.cpl
    public final int a(long j, List list) {
        return (this.e != null || this.b.q() < 2) ? list.size() : this.b.e(j, list);
    }

    @Override // defpackage.cpl
    public final long b(long j, cdv cdvVar) {
        long j2;
        long jG;
        int i = 0;
        while (true) {
            cic[] cicVarArr = this.a;
            if (i >= cicVarArr.length) {
                return j;
            }
            cic cicVar = cicVarArr[i];
            if (cicVar.c != null) {
                long jD = cicVar.d();
                if (jD != 0) {
                    long jF = cicVar.f(j);
                    long jG2 = cicVar.g(jF);
                    if (jG2 >= j || (jD != -1 && jF >= (cicVar.b() + jD) - 1)) {
                        j2 = jG2;
                        jG = j2;
                    } else {
                        jG = cicVar.g(jF + 1);
                        j2 = jG2;
                    }
                    return cdvVar.a(j, j2, jG);
                }
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public final ArrayList c() {
        ?? r0 = this.c.d(this.d).f;
        ArrayList arrayList = new ArrayList();
        for (int i : this.h) {
            arrayList.addAll(((cij) r0.get(i)).c);
        }
        return arrayList;
    }

    @Override // defpackage.cpl
    public final void d() throws IOException {
        IOException iOException = this.e;
        if (iOException != null) {
            throw iOException;
        }
        this.g.a();
    }

    @Override // defpackage.cpl
    public final void e(cpg cpgVar) {
        if (cpgVar instanceof cpn) {
            int iA = this.b.a(((cpn) cpgVar).h);
            cic[] cicVarArr = this.a;
            cic cicVar = cicVarArr[iA];
            if (cicVar.c == null) {
                cpf cpfVar = cicVar.f;
                cpfVar.getClass();
                cuz cuzVarA = cpfVar.a();
                if (cuzVarA != null) {
                    ciy ciyVar = cicVar.a;
                    cicVarArr[iA] = new cic(cicVar.d, ciyVar, cicVar.b, cpfVar, cicVar.e, new cib(cuzVarA, ciyVar.f));
                }
            }
        }
        cig cigVar = this.l;
        if (cigVar != null) {
            long j = cigVar.b;
            if (j == -9223372036854775807L || cpgVar.l > j) {
                cigVar.b = cpgVar.l;
            }
            cigVar.c.g = true;
        }
    }

    @Override // defpackage.cpl
    public final void f() {
        int i = 0;
        while (true) {
            cic[] cicVarArr = this.a;
            if (i >= cicVarArr.length) {
                return;
            }
            cpf cpfVar = cicVarArr[i].f;
            if (cpfVar != null) {
                cpfVar.c();
            }
            i++;
        }
    }

    @Override // defpackage.cpl
    public final void g() {
        if (this.e == null) {
            this.b.t();
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.cpl
    public final boolean h(cpg cpgVar, boolean z, aae aaeVar, crj crjVar) {
        cri criVar;
        yvt yvtVarD;
        int i;
        if (z) {
            cig cigVar = this.l;
            if (cigVar != null) {
                long j = cigVar.b;
                boolean z2 = j != -9223372036854775807L && j < cpgVar.k;
                cih cihVar = cigVar.c;
                if (cihVar.e.d) {
                    if (!cihVar.h) {
                        if (z2) {
                            cihVar.a();
                        }
                    }
                    return true;
                }
            }
            if (!this.c.d && (cpgVar instanceof cpo)) {
                Object obj = aaeVar.c;
                if ((obj instanceof byv) && ((byv) obj).d == 404) {
                    cic cicVar = this.a[this.b.a(cpgVar.h)];
                    long jD = cicVar.d();
                    if (jD != -1 && jD != 0) {
                        if (((cpo) cpgVar).h() > (cicVar.b() + jD) - 1) {
                            this.m = true;
                        }
                        return true;
                    }
                }
            }
            cqs cqsVar = this.b;
            bse bseVar = cpgVar.h;
            int iA = cqsVar.a(bseVar);
            cic[] cicVarArr = this.a;
            cic cicVar2 = cicVarArr[iA];
            aepb aepbVar = this.o;
            agke agkeVar = cicVar2.a.d;
            cim cimVarF = aepbVar.f(agkeVar);
            if (cimVarF == null || cicVar2.b.equals(cimVarF)) {
                cqs cqsVar2 = this.b;
                crw crwVar = this.n;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (crwVar == null || !crwVar.c) {
                    int iQ = cqsVar2.q();
                    int i2 = 0;
                    for (int i3 = 0; i3 < iQ; i3++) {
                        if (cqsVar2.s(i3, jElapsedRealtime)) {
                            i2++;
                        }
                    }
                    HashSet hashSet = new HashSet();
                    for (int i4 = 0; i4 < agkeVar.size(); i4++) {
                        hashSet.add(Integer.valueOf(((cim) agkeVar.get(i4)).c));
                    }
                    int size = hashSet.size();
                    HashSet hashSet2 = new HashSet();
                    List listG = aepbVar.g(agkeVar);
                    for (int i5 = 0; i5 < listG.size(); i5++) {
                        hashSet2.add(Integer.valueOf(((cim) listG.get(i5)).c));
                    }
                    criVar = new cri(size, size - hashSet2.size(), iQ, i2, false);
                } else {
                    String str = cicVar2.b.b;
                    int i6 = 0;
                    int i7 = 0;
                    for (int i8 = 0; i8 < cqsVar2.q(); i8++) {
                        agke agkeVar2 = cicVarArr[i8].a.d;
                        for (int i9 = 0; i9 < agkeVar2.size(); i9++) {
                            if (str.equals(((cim) agkeVar2.get(i9)).b)) {
                                i6++;
                                if (!cqsVar2.s(i8, jElapsedRealtime)) {
                                    break;
                                }
                                i7++;
                                break;
                            }
                        }
                    }
                    HashSet hashSet3 = new HashSet();
                    for (int i10 = 0; i10 < agkeVar.size(); i10++) {
                        hashSet3.add(((cim) agkeVar.get(i10)).b);
                    }
                    int size2 = hashSet3.size();
                    HashSet hashSet4 = new HashSet();
                    List listG2 = aepbVar.g(agkeVar);
                    for (int i11 = 0; i11 < listG2.size(); i11++) {
                        hashSet4.add(((cim) listG2.get(i11)).b);
                    }
                    criVar = new cri(size2, size2 - hashSet4.size(), i6, i7, true);
                }
                if ((criVar.a(2) || criVar.a(1)) && (yvtVarD = crjVar.d(criVar, aaeVar)) != null) {
                    int i12 = yvtVarD.b;
                    if (criVar.a(i12)) {
                        if (i12 == 2) {
                            cqs cqsVar3 = this.b;
                            return cqsVar3.r(cqsVar3.a(bseVar), yvtVarD.a);
                        }
                        cim cimVar = cicVar2.b;
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() + yvtVarD.a;
                        aepb.h(cimVar.b, jElapsedRealtime2, aepbVar.c);
                        if (aepbVar.d == null && (i = cimVar.c) != Integer.MIN_VALUE) {
                            aepb.h(Integer.valueOf(i), jElapsedRealtime2, aepbVar.e);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x02ef A[PHI: r6
      0x02ef: PHI (r6v3 int) = (r6v2 int), (r6v4 int), (r6v4 int) binds: [B:73:0x01b9, B:82:0x01f1, B:85:0x01f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x011d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cpl
    public final void i(ccy ccyVar, long j, List list, fsz fszVar) {
        List list2;
        cpo cpoVar;
        long j2;
        long jMax;
        int i;
        long j3;
        Object cpmVar;
        civ civVarB;
        if (this.e == null) {
            long j4 = ccyVar.a;
            long j5 = j - j4;
            long jY = bwp.y(this.c.a) + bwp.y(this.c.d(this.d).a) + j;
            cig cigVar = this.l;
            if (cigVar != null) {
                cih cihVar = cigVar.c;
                cio cioVar = cihVar.e;
                if (cioVar.d) {
                    if (cihVar.h) {
                        return;
                    }
                    Map.Entry entryCeilingEntry = cihVar.d.ceilingEntry(Long.valueOf(cioVar.h));
                    if (entryCeilingEntry != null && ((Long) entryCeilingEntry.getValue()).longValue() < jY) {
                        long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
                        cihVar.f = jLongValue;
                        chz chzVar = (chz) cihVar.j.a;
                        long j6 = chzVar.t;
                        if (j6 == -9223372036854775807L || j6 < jLongValue) {
                            chzVar.t = jLongValue;
                        }
                        cihVar.a();
                        return;
                    }
                }
            }
            long jY2 = bwp.y(bwp.w(this.k));
            long j7 = j(jY2);
            if (list.isEmpty()) {
                list2 = list;
                cpoVar = null;
            } else {
                list2 = list;
                cpoVar = (cpo) list2.get(list.size() - 1);
            }
            int iQ = this.b.q();
            cpq[] cpqVarArr = new cpq[iQ];
            for (int i2 = 0; i2 < iQ; i2++) {
                cic cicVar = this.a[i2];
                if (cicVar.c == null) {
                    cpqVarArr[i2] = cpq.b;
                } else {
                    long jA = cicVar.a(jY2);
                    long jC = cicVar.c(jY2);
                    long jL = l(cicVar, cpoVar, j, jA, jC);
                    if (jL < jA) {
                        cpqVarArr[i2] = cpq.b;
                    } else {
                        cpqVarArr[i2] = new cid(k(i2), jL, jC, this.n);
                    }
                }
            }
            if (this.c.d) {
                cic[] cicVarArr = this.a;
                if (cicVarArr[0].d() != 0) {
                    j2 = j4;
                    jMax = Math.max(0L, Math.min(j(jY2), cicVarArr[0].e(cicVarArr[0].c(jY2))) - j2);
                } else {
                    j2 = j4;
                    jMax = -9223372036854775807L;
                }
            } else {
                j2 = j4;
                jMax = -9223372036854775807L;
            }
            this.b.m(j2, j5, jMax, list2, cpqVarArr);
            int iF = this.b.f();
            SystemClock.elapsedRealtime();
            cic cicVarK = k(iF);
            cpf cpfVar = cicVarK.f;
            if (cpfVar != null) {
                ciy ciyVar = cicVarK.a;
                civ civVar = cpfVar.a == null ? ciyVar.h : null;
                civ civVarL = cicVarK.c == null ? ciyVar.l() : null;
                if (civVar != null || civVarL != null) {
                    bye byeVar = this.j;
                    bse bseVarC = this.b.c();
                    int iG = this.b.g();
                    Object objH = this.b.h();
                    if (civVar != null) {
                        civ civVarB2 = civVar.b(civVarL, cicVarK.b.a);
                        if (civVarB2 != null) {
                            civVar = civVarB2;
                        }
                    } else {
                        civVarL.getClass();
                        civVar = civVarL;
                    }
                    fszVar.b = new cpn(byeVar, aun.o(ciyVar, cicVarK.b, civVar, 0, agpn.b), bseVarC, iG, objH, cpfVar);
                    return;
                }
            }
            long j8 = cicVarK.d;
            cio cioVar2 = this.c;
            boolean z = 1;
            boolean z2 = cioVar2.d && this.d == cioVar2.a() + (-1);
            if (z2 && j8 == -9223372036854775807L) {
                i = 0;
                j8 = -9223372036854775807L;
            } else {
                i = 1;
            }
            if (cicVarK.d() != 0) {
                long jA2 = cicVarK.a(jY2);
                long jC2 = cicVarK.c(jY2);
                if (z2) {
                    long jE = cicVarK.e(jC2);
                    i &= (((jE + (jE - cicVarK.g(jC2))) > j8 ? 1 : ((jE + (jE - cicVarK.g(jC2))) == j8 ? 0 : -1)) ^ (-1)) >>> 31;
                }
                long jL2 = l(cicVarK, cpoVar, j, jA2, jC2);
                if (jL2 < jA2) {
                    this.e = new cmj();
                    return;
                }
                if (jL2 > jC2 || (this.m && jL2 >= jC2)) {
                    z = i;
                } else if (i == 0 || cicVarK.g(jL2) < j8) {
                    int iMin = (int) Math.min(1L, (jC2 - jL2) + 1);
                    if (j8 == -9223372036854775807L) {
                        j3 = -1;
                        break;
                    }
                    while (true) {
                        if (iMin <= 1) {
                            j3 = -1;
                            break;
                        }
                        j3 = -1;
                        if (cicVarK.g((((long) iMin) + jL2) - 1) < j8) {
                            break;
                        } else {
                            iMin--;
                        }
                    }
                    long j9 = true != list.isEmpty() ? -9223372036854775807L : j;
                    bye byeVar2 = this.j;
                    int i3 = this.i;
                    bse bseVarC2 = this.b.c();
                    int iG2 = this.b.g();
                    Object objH2 = this.b.h();
                    ciy ciyVar2 = cicVarK.a;
                    long jG = cicVarK.g(jL2);
                    civ civVarH = cicVarK.h(jL2);
                    if (cpfVar == null) {
                        cpmVar = new cpr(byeVar2, aun.o(ciyVar2, cicVarK.b, civVarH, true != cicVarK.i(jL2, j7) ? 8 : 0, agpn.b), bseVarC2, iG2, objH2, jG, cicVarK.e(jL2), jL2, i3, bseVarC2);
                    } else {
                        int i4 = 1;
                        int i5 = 1;
                        while (true) {
                            bseVarC2 = bseVarC2;
                            if (i4 >= iMin || (civVarB = civVarH.b(cicVarK.h(jL2 + ((long) i4)), cicVarK.b.a)) == null) {
                                break;
                            }
                            i5++;
                            i4++;
                            civVarH = civVarB;
                        }
                        long j10 = jL2 + ((long) i5) + j3;
                        long jE2 = cicVarK.e(j10);
                        cpmVar = new cpm(byeVar2, aun.o(ciyVar2, cicVarK.b, civVarH, true != cicVarK.i(j10, j7) ? 8 : 0, agpn.b), bseVarC2, iG2, objH2, jG, jE2, j9, (j8 == -9223372036854775807L || j8 > jE2) ? -9223372036854775807L : j8, jL2, i5, bsy.k(bseVarC2.q) ? jG : -ciyVar2.f, cpfVar);
                    }
                    fszVar.b = cpmVar;
                    return;
                }
            } else {
                z = i;
            }
            fszVar.a = z;
        }
    }
}
