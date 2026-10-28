package defpackage;

import androidx.media3.decoder.DecoderInputBuffer;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cpk implements coo, coq, crk, crn {
    private long A;
    private final fsz B;
    public final int a;
    public final int[] b;
    public final bse[] c;
    public final boolean[] d;
    public final cpl e;
    public final crp f;
    public final ArrayList g;
    public final con h;
    public final con[] i;
    public long j;
    public cpb k;
    public boolean l;
    public boolean m;
    public boolean n;
    boolean o;
    public final aae p;
    private final cop q;
    private final crj r;
    private final List s;
    private final cpd t;
    private cpg u;
    private bse v;
    private cpj w;
    private long x;
    private int y;
    private boolean z;

    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    public cpk(int i, int[] iArr, bse[] bseVarArr, cpl cplVar, cop copVar, cra craVar, long j, cjz cjzVar, aae aaeVar, crj crjVar, aae aaeVar2, boolean z, long j2) {
        this.a = i;
        iArr = iArr == null ? new int[0] : iArr;
        this.b = iArr;
        this.c = bseVarArr == null ? new bse[0] : bseVarArr;
        this.e = cplVar;
        this.q = copVar;
        this.p = aaeVar2;
        this.r = crjVar;
        this.f = new crp("ChunkSampleStream");
        this.B = new fsz();
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        this.s = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.i = new con[length];
        this.d = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        con[] conVarArr = new con[i2];
        con conVarJ = con.J(craVar, cjzVar, aaeVar);
        this.h = conVarJ;
        iArr2[0] = i;
        conVarArr[0] = conVarJ;
        int i3 = 0;
        while (i3 < length) {
            con conVar = new con(craVar, null, null);
            this.i[i3] = conVar;
            int i4 = i3 + 1;
            conVarArr[i4] = conVar;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.t = new cpd(iArr2, conVarArr);
        this.x = j;
        this.j = j;
        this.A = Long.MIN_VALUE;
        this.z = z;
        if (!z || j2 == -9223372036854775807L) {
            return;
        }
        this.z = false;
        this.l = (j2 > j ? 1 : (j2 == j ? 0 : -1)) >>> 31;
    }

    private final int q(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.g;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((cpb) arrayList.get(i2)).c(0) <= i);
        return i2 - 1;
    }

    private final cpb r(int i) {
        ArrayList arrayList = this.g;
        cpb cpbVar = (cpb) arrayList.get(i);
        bwp.W(arrayList, i, arrayList.size());
        this.y = Math.max(this.y, arrayList.size());
        int i2 = 0;
        this.h.u(cpbVar.c(0));
        while (true) {
            con[] conVarArr = this.i;
            if (i2 >= conVarArr.length) {
                return cpbVar;
            }
            con conVar = conVarArr[i2];
            i2++;
            conVar.u(cpbVar.c(i2));
        }
    }

    private final void s() {
        int iQ = q(this.h.h(), this.y - 1);
        while (true) {
            int i = this.y;
            if (i > iQ) {
                return;
            }
            this.y = i + 1;
            cpb cpbVar = (cpb) this.g.get(i);
            bse bseVar = cpbVar.h;
            if (!bseVar.equals(this.v)) {
                this.p.d(this.a, bseVar, cpbVar.i, cpbVar.j, cpbVar.k);
            }
            this.v = bseVar;
        }
    }

    private final void t() {
        this.h.y(false);
        int i = 0;
        while (true) {
            con[] conVarArr = this.i;
            if (i >= conVarArr.length) {
                return;
            }
            conVarArr[i].y(false);
            i++;
        }
    }

    private final boolean u() {
        try {
            gu();
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    private final boolean v(int i) {
        int iH;
        cpb cpbVar = (cpb) this.g.get(i);
        if (this.h.h() <= cpbVar.c(0)) {
            int i2 = 0;
            do {
                con[] conVarArr = this.i;
                if (i2 >= conVarArr.length) {
                    return false;
                }
                iH = conVarArr[i2].h();
                i2++;
            } while (iH <= cpbVar.c(i2));
        }
        return true;
    }

    @Override // defpackage.coo
    public final int a() {
        if (!this.z || this.o || u()) {
            return this.l ? 4 : 0;
        }
        return 2;
    }

    @Override // defpackage.coo
    public final int b(ccu ccuVar, DecoderInputBuffer decoderInputBuffer, int i) {
        cpb cpbVar;
        boolean z = !this.m && l();
        if (k() || z || this.n || ((cpbVar = this.k) != null && cpbVar.c(0) <= this.h.h())) {
            return -3;
        }
        s();
        return this.h.l(ccuVar, decoderInputBuffer, i, this.o);
    }

    @Override // defpackage.coo
    public final int c(long j) throws Throwable {
        boolean z = !this.m && l();
        if (k() || z || this.n) {
            return 0;
        }
        con conVar = this.h;
        int iJ = conVar.j(j, this.o);
        cpb cpbVar = this.k;
        if (cpbVar != null) {
            iJ = Math.min(iJ, cpbVar.c(0) - conVar.h());
        }
        int i = iJ;
        conVar.A(i);
        s();
        return i;
    }

    @Override // defpackage.coq
    public final long d() {
        if (k()) {
            return this.x;
        }
        if (this.o) {
            return Long.MIN_VALUE;
        }
        return g().l;
    }

    public final long e(long j, cdv cdvVar) {
        return this.e.b(j, cdvVar);
    }

    @Override // defpackage.coo
    public final boolean f() {
        return !k() && this.h.F(this.o);
    }

    public final cpb g() {
        ArrayList arrayList = this.g;
        return (cpb) arrayList.get(arrayList.size() - 1);
    }

    @Override // defpackage.crk
    public final /* bridge */ /* synthetic */ void gq(crm crmVar, long j, long j2, boolean z) {
        cpg cpgVar = (cpg) crmVar;
        this.u = null;
        this.k = null;
        long j3 = cpgVar.e;
        cnc cncVar = new cnc(j3, cpgVar.f, j);
        cncVar.d = cpgVar.f();
        cncVar.e = cpgVar.g();
        cncVar.f = j2;
        cncVar.g = cpgVar.e();
        cnd cndVar = new cnd(cncVar);
        this.r.b(j3);
        this.p.f(cndVar, cpgVar.g, this.a, cpgVar.h, cpgVar.i, cpgVar.j, cpgVar.k, cpgVar.l);
        if (z) {
            return;
        }
        if (k()) {
            t();
        } else if (cpgVar instanceof cpb) {
            ArrayList arrayList = this.g;
            r(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.x = this.j;
            }
        }
        this.q.b(this);
    }

    @Override // defpackage.crk
    public final /* bridge */ /* synthetic */ void gr(crm crmVar, long j, long j2, int i) {
        cpg cpgVar = (cpg) crmVar;
        cnc cncVar = new cnc(cpgVar.e, cpgVar.f, j);
        if (i != 0) {
            cncVar.d = cpgVar.f();
            cncVar.e = cpgVar.g();
            cncVar.f = j2;
            cncVar.g = cpgVar.e();
        }
        this.p.l(new cnd(cncVar), cpgVar.g, this.a, cpgVar.h, cpgVar.i, cpgVar.j, cpgVar.k, cpgVar.l, i);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00db  */
    @Override // defpackage.crk
    public final /* bridge */ /* synthetic */ yvt gs(crm crmVar, long j, long j2, IOException iOException, int i) {
        yvt yvtVar;
        boolean zC;
        long jC;
        cpg cpgVar = (cpg) crmVar;
        long jE = cpgVar.e();
        boolean z = cpgVar instanceof cpb;
        ArrayList arrayList = this.g;
        int size = arrayList.size() - 1;
        boolean z2 = (jE != 0 && z && v(size)) ? false : true;
        long j3 = cpgVar.e;
        cnc cncVar = new cnc(j3, cpgVar.f, j);
        cncVar.d = cpgVar.f();
        cncVar.e = cpgVar.g();
        cncVar.f = j2;
        cncVar.g = jE;
        cnd cndVar = new cnd(cncVar);
        int i2 = cpgVar.g;
        int i3 = this.a;
        bse bseVar = cpgVar.h;
        int i4 = cpgVar.i;
        Object obj = cpgVar.j;
        long j4 = cpgVar.k;
        int i5 = bwp.a;
        long j5 = cpgVar.l;
        aae aaeVar = new aae(cndVar, iOException, i);
        cpl cplVar = this.e;
        crj crjVar = this.r;
        if (cplVar.h(cpgVar, z2, aaeVar, crjVar)) {
            if (z2) {
                yvtVar = crp.d;
                if (z) {
                    ahno.O(r(size) == cpgVar);
                    if (arrayList.isEmpty()) {
                        crjVar = crjVar;
                        this.x = this.j;
                    } else {
                        crjVar = crjVar;
                    }
                } else {
                    crjVar = crjVar;
                }
            } else {
                bvx.e("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            }
            if (yvtVar == null) {
                if (i > crjVar.a(i2)) {
                    jC = -9223372036854775807L;
                } else {
                    jC = crjVar.c(aaeVar);
                }
                if (jC != -9223372036854775807L) {
                    yvtVar = new yvt(0, jC);
                } else {
                    yvtVar = crp.e;
                }
            }
            zC = yvtVar.c();
            this.p.j(cndVar, i2, i3, bseVar, i4, obj, j4, j5, iOException, !zC);
            if (!zC) {
                this.u = null;
                crjVar.b(j3);
                this.q.b(this);
            }
            return yvtVar;
        }
        yvtVar = null;
        if (yvtVar == null) {
            if (i > crjVar.a(i2)) {
                jC = -9223372036854775807L;
            } else {
                jC = crjVar.c(aaeVar);
            }
            if (jC != -9223372036854775807L) {
                yvtVar = new yvt(0, jC);
            } else {
                yvtVar = crp.e;
            }
        }
        zC = yvtVar.c();
        this.p.j(cndVar, i2, i3, bseVar, i4, obj, j4, j5, iOException, !zC);
        if (!zC) {
            this.u = null;
            crjVar.b(j3);
            this.q.b(this);
        }
        return yvtVar;
    }

    @Override // defpackage.coq
    public final long gt() {
        if (this.o) {
            return Long.MIN_VALUE;
        }
        if (k()) {
            return this.x;
        }
        long jMax = this.j;
        cpb cpbVarG = g();
        if (!cpbVarG.j()) {
            ArrayList arrayList = this.g;
            cpbVarG = arrayList.size() > 1 ? (cpb) arrayList.get(arrayList.size() - 2) : null;
        }
        if (cpbVarG != null) {
            jMax = Math.max(jMax, cpbVarG.l);
        }
        return Math.max(jMax, this.h.o());
    }

    @Override // defpackage.coo
    public final void gu() throws IOException {
        crp crpVar = this.f;
        crpVar.d(Integer.MIN_VALUE);
        this.h.v();
        if (crpVar.g()) {
            return;
        }
        this.e.d();
    }

    @Override // defpackage.crk
    public final /* bridge */ /* synthetic */ void gv(crm crmVar, long j, long j2) {
        cpg cpgVar = (cpg) crmVar;
        this.u = null;
        this.e.e(cpgVar);
        long j3 = cpgVar.e;
        cnc cncVar = new cnc(j3, cpgVar.f, j);
        cncVar.d = cpgVar.f();
        cncVar.e = cpgVar.g();
        cncVar.f = j2;
        cncVar.g = cpgVar.e();
        cnd cndVar = new cnd(cncVar);
        this.r.b(j3);
        this.p.h(cndVar, cpgVar.g, this.a, cpgVar.h, cpgVar.i, cpgVar.j, cpgVar.k, cpgVar.l);
        this.q.b(this);
    }

    public final void h(cpj cpjVar) {
        this.w = cpjVar;
        this.h.w();
        int i = 0;
        while (true) {
            con[] conVarArr = this.i;
            if (i >= conVarArr.length) {
                this.f.e(this);
                return;
            } else {
                conVarArr[i].w();
                i++;
            }
        }
    }

    public final void i(long j) throws Throwable {
        ArrayList arrayList;
        cpb cpbVar;
        boolean zH;
        cpb cpbVar2;
        this.j = j;
        int i = 0;
        this.z = false;
        this.l = false;
        if (k()) {
            this.x = j;
            return;
        }
        int i2 = 0;
        while (true) {
            arrayList = this.g;
            cpbVar = null;
            if (i2 >= arrayList.size()) {
                break;
            }
            cpb cpbVar3 = (cpb) arrayList.get(i2);
            long j2 = cpbVar3.k;
            if (j2 != j || cpbVar3.a != -9223372036854775807L) {
                if (j2 > j) {
                    break;
                } else {
                    i2++;
                }
            } else {
                cpbVar = cpbVar3;
                break;
            }
        }
        if (cpbVar != null) {
            zH = this.h.G(cpbVar.c(0));
        } else {
            long jD = d();
            zH = this.h.H(j, jD == Long.MIN_VALUE || j < jD);
        }
        if (zH && ((cpbVar2 = this.k) == null || cpbVar2.c(0) > this.h.h())) {
            this.y = q(this.h.h(), 0);
            con[] conVarArr = this.i;
            while (i < conVarArr.length) {
                conVarArr[i].H(j, true);
                i++;
            }
            return;
        }
        this.x = j;
        this.o = false;
        arrayList.clear();
        this.y = 0;
        crp crpVar = this.f;
        if (!crpVar.g()) {
            crpVar.c();
            t();
            return;
        }
        this.h.s();
        con[] conVarArr2 = this.i;
        while (i < conVarArr2.length) {
            conVarArr2[i].s();
            i++;
        }
        crpVar.b();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    public final void j(long j) {
        boolean z;
        if (this.o) {
            long j2 = this.A;
            if (j2 != Long.MIN_VALUE) {
                z = true;
                if (j != Long.MIN_VALUE && j <= j2) {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.A = j;
        this.h.z(j);
        for (con conVar : this.i) {
            conVar.z(j);
        }
        if (z) {
            this.o = false;
            this.q.b(this);
        }
    }

    public final boolean k() {
        return this.x != -9223372036854775807L;
    }

    public final boolean l() {
        return ((!this.z && !this.l) || this.o || u()) ? false : true;
    }

    @Override // defpackage.coq
    public final void m(long j) {
        boolean z;
        crp crpVar = this.f;
        if (crpVar.f() || k()) {
            return;
        }
        if (crpVar.g()) {
            cpg cpgVar = this.u;
            cpgVar.getClass();
            boolean z2 = cpgVar instanceof cpb;
            if (z2 && v(this.g.size() - 1)) {
                return;
            }
            long j2 = this.A;
            if (j2 == Long.MIN_VALUE || cpgVar.k < j2) {
                this.e.g();
                return;
            }
            crpVar.b();
            if (z2) {
                this.k = (cpb) cpgVar;
                return;
            }
            return;
        }
        ArrayList arrayList = this.g;
        int iMin = Math.min(arrayList.size(), this.e.a(j, this.s));
        if (this.A != Long.MIN_VALUE) {
            z = false;
            while (iMin > 0) {
                int i = iMin - 1;
                if (((cpb) arrayList.get(i)).k < this.A) {
                    break;
                }
                z = true;
                iMin = i;
            }
        } else {
            z = false;
        }
        if (iMin < arrayList.size()) {
            ahno.O(!crpVar.g());
            int size = arrayList.size();
            while (true) {
                if (iMin >= size) {
                    iMin = -1;
                    break;
                } else if (!v(iMin)) {
                    break;
                } else {
                    iMin++;
                }
            }
            if (iMin != -1) {
                long j3 = g().l;
                cpb cpbVarR = r(iMin);
                if (arrayList.isEmpty()) {
                    this.x = this.j;
                }
                this.o = false;
                this.p.n(this.a, cpbVarR.k, j3);
            }
        }
        if (z) {
            this.x = -9223372036854775807L;
            this.o = true;
        }
    }

    public final void n(long j) {
        if (k()) {
            return;
        }
        con conVar = this.h;
        int i = conVar.e;
        conVar.I(j, true);
        int i2 = conVar.e;
        if (i2 > i) {
            long jN = conVar.n();
            int i3 = 0;
            while (true) {
                con[] conVarArr = this.i;
                if (i3 >= conVarArr.length) {
                    break;
                }
                conVarArr[i3].I(jN, this.d[i3]);
                i3++;
            }
        }
        int iMin = Math.min(q(i2, 0), this.y);
        if (iMin > 0) {
            bwp.W(this.g, 0, iMin);
            this.y -= iMin;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [crm, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.coq
    public final boolean o(ccy ccyVar) {
        List list;
        long j;
        boolean z;
        if (this.o) {
            return false;
        }
        crp crpVar = this.f;
        if (crpVar.g() || crpVar.f()) {
            return false;
        }
        boolean zK = k();
        if (zK) {
            list = Collections.EMPTY_LIST;
            j = this.x;
        } else {
            list = this.s;
            j = g().l;
        }
        List list2 = list;
        cpl cplVar = this.e;
        fsz fszVar = this.B;
        cplVar.i(ccyVar, j, list2, fszVar);
        boolean z2 = fszVar.a;
        ?? r3 = fszVar.b;
        fszVar.b = null;
        fszVar.a = false;
        if (r3 != 0) {
            long j2 = this.A;
            if (j2 == Long.MIN_VALUE || ((cpg) r3).k < j2) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (z2 || z) {
            this.x = -9223372036854775807L;
            this.o = true;
        } else {
            if (r3 == 0) {
                return false;
            }
            cpg cpgVar = (cpg) r3;
            this.u = cpgVar;
            if (r3 instanceof cpb) {
                cpb cpbVar = (cpb) r3;
                if (zK) {
                    long j3 = cpbVar.k;
                    long j4 = this.x;
                    if (j3 < j4) {
                        this.h.f = j4;
                        for (con conVar : this.i) {
                            conVar.f = this.x;
                        }
                        this.l = this.z;
                    }
                    this.z = false;
                    this.x = -9223372036854775807L;
                }
                cpd cpdVar = this.t;
                cpbVar.c = cpdVar;
                con[] conVarArr = cpdVar.a;
                int[] iArr = new int[conVarArr.length];
                for (int i = 0; i < conVarArr.length; i++) {
                    iArr[i] = conVarArr[i].k();
                }
                cpbVar.d = iArr;
                this.g.add(cpbVar);
            } else if (r3 instanceof cpn) {
                ((cpn) r3).a = this.t;
            }
            crpVar.h(r3, this, this.r.a(cpgVar.g));
        }
        return true;
    }

    @Override // defpackage.coq
    public final boolean p() {
        return this.f.g();
    }

    @Override // defpackage.crn
    public final void y() {
        this.h.x();
        int i = 0;
        while (true) {
            con[] conVarArr = this.i;
            if (i >= conVarArr.length) {
                break;
            }
            conVarArr[i].x();
            i++;
        }
        this.e.f();
        cpj cpjVar = this.w;
        if (cpjVar != null) {
            cpjVar.k(this);
        }
    }
}
