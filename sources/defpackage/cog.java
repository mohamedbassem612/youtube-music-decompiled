package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cog implements cnk, cvk, crk, crn, com {
    public static final Map a;
    public static final bse b;
    private boolean D;
    private boolean E;
    private boolean F;
    private cvz G;
    private boolean H;
    private int K;
    private final coj L;
    private final ovo M;
    private final aae N;
    private final aae O;
    private abix P;
    public final String c;
    public cnj i;
    public cxx j;
    public boolean l;
    public long m;
    public boolean n;
    public boolean o;
    public boolean p;
    private final Uri s;
    private final bye t;
    private final cjz u;
    private final crj v;
    private final cra w;
    private final boolean x;
    private final bse y;
    private final long z;
    private long J = Long.MIN_VALUE;
    public final crp d = new crp("ProgressiveMediaPeriod");
    public final zhk q = new zhk(null, null);
    public final Runnable e = new bkn(this, 20);
    public final Runnable f = new cqc(this, 1);
    public final Handler g = bwp.H(null);
    private cof[] C = new cof[0];
    public con[] k = new con[0];
    private cob[] B = new cob[0];
    private final List A = new ArrayList();
    public final cod h = new cod();
    private int I = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        a = DesugarCollections.unmodifiableMap(map);
        bsd bsdVar = new bsd();
        bsdVar.a = "icy";
        bsdVar.e("application/x-icy");
        b = new bse(bsdVar);
    }

    public cog(Uri uri, bye byeVar, ovo ovoVar, cjz cjzVar, aae aaeVar, crj crjVar, aae aaeVar2, coj cojVar, cra craVar, String str, boolean z, bse bseVar, long j) {
        this.s = uri;
        this.t = byeVar;
        this.u = cjzVar;
        this.O = aaeVar;
        this.v = crjVar;
        this.N = aaeVar2;
        this.L = cojVar;
        this.w = craVar;
        this.c = str;
        this.x = z;
        this.y = bseVar;
        this.M = ovoVar;
        this.z = j;
    }

    private final int B() {
        int iK = 0;
        for (con conVar : this.k) {
            iK += conVar.k();
        }
        return iK;
    }

    private static int C(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 2;
        }
        return 1;
    }

    private final void D() {
        ahno.O(this.l);
        this.P.getClass();
        this.G.getClass();
    }

    private final void E() {
        cod codVar = this.h;
        if (codVar.c()) {
            this.d.b();
            return;
        }
        if (codVar.d()) {
            for (con conVar : this.k) {
                long jP = conVar.p();
                long j = this.J;
                if (jP != Long.MIN_VALUE && jP >= j) {
                    j = 1 + jP;
                }
                conVar.t(j);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    private final void F() {
        cod codVar = this.h;
        boolean zG = codVar.g();
        long j = zG ? codVar.c : -9223372036854775807L;
        boolean z = this.l;
        long j2 = this.J;
        long j3 = this.m;
        int iB = B();
        if (z && codVar.g()) {
            if (j2 == Long.MIN_VALUE) {
                j2 = j3;
            }
            if (j2 == -9223372036854775807L || codVar.c <= j2) {
                codVar.d = iB;
                codVar.c = -9223372036854775807L;
                codVar.a = 2;
            } else {
                codVar.c = -9223372036854775807L;
                codVar.a = j2 != Long.MIN_VALUE ? 8 : 4;
            }
        } else {
            codVar.d = iB;
            codVar.c = -9223372036854775807L;
            codVar.a = 2;
        }
        if (codVar.f()) {
            return;
        }
        this.o = false;
        zhk zhkVar = this.q;
        zhkVar.h();
        coc cocVar = new coc(this, this.s, this.t, this.M, this, zhkVar);
        if (this.l) {
            if (zG) {
                cvz cvzVar = this.G;
                cvzVar.getClass();
                cocVar.c(cvzVar.b(j).a.c, j);
                for (con conVar : this.k) {
                    conVar.f = j;
                }
            } else {
                D();
                ahno.O(this.K > 0);
                int i = 0;
                long jMin = Long.MAX_VALUE;
                while (true) {
                    con[] conVarArr = this.k;
                    if (i >= conVarArr.length) {
                        ahno.O(jMin != Long.MAX_VALUE);
                        break;
                    }
                    abix abixVar = this.P;
                    if (((boolean[]) abixVar.d)[i] && (((boolean[]) abixVar.c)[i] || !abixVar.a)) {
                        long jO = conVarArr[i].o();
                        if (jO == Long.MIN_VALUE) {
                            jMin = codVar.b;
                            break;
                        }
                        jMin = Math.min(jMin, jO);
                    }
                    i++;
                }
                cvz cvzVar2 = this.G;
                cvzVar2.getClass();
                cwa cwaVar = cvzVar2.b(jMin).a;
                cocVar.c(cwaVar.c, cwaVar.b);
                for (con conVar2 : this.k) {
                    int i2 = conVar2.d;
                    if (i2 > 0) {
                        conVar2.g = false;
                        conVar2.l = conVar2.c[conVar2.i(i2 - 1)];
                        int i3 = 0;
                        for (int i4 = conVar2.d - 1; i4 >= 0; i4--) {
                            if (Math.abs(conVar2.c[conVar2.i(i4)] - conVar2.l) > 1000) {
                                break;
                            }
                            i3++;
                        }
                        conVar2.m = i3;
                        conVar2.k = true;
                    } else {
                        conVar2.k = false;
                        conVar2.m = 0;
                    }
                }
            }
        }
        this.d.h(cocVar, this, this.v.a(this.I));
    }

    private final boolean G() {
        if (this.J == Long.MIN_VALUE || this.K == 0) {
            return false;
        }
        if (this.h.a != 4) {
            D();
            int i = 0;
            while (true) {
                con[] conVarArr = this.k;
                if (i >= conVarArr.length) {
                    break;
                }
                abix abixVar = this.P;
                if (((boolean[]) abixVar.d)[i] && ((((boolean[]) abixVar.c)[i] || !abixVar.a) && !conVarArr[i].C())) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    private final boolean H(int i, long j) {
        cvx cvxVarB;
        if (this.F) {
            return false;
        }
        D();
        if (con.D(((coy) this.P.b).b(i).b(0)) || !this.G.d()) {
            return false;
        }
        int i2 = this.C[i].a;
        cvz cvzVar = this.G;
        if (cvzVar instanceof cwh) {
            cwh cwhVar = (cwh) cvzVar;
            cvxVarB = cwhVar.f(i2) ? cwhVar.e(j, i2) : this.G.b(j);
        } else {
            cvxVarB = cvzVar.b(j);
        }
        return cvxVarB.a.b < j;
    }

    public final void A(cvz cvzVar) {
        this.G = this.j == null ? cvzVar : new cvy(-9223372036854775807L, 0L);
        this.m = cvzVar.a();
        boolean z = false;
        if (!this.n && cvzVar.a() == -9223372036854775807L) {
            z = true;
        }
        this.H = z;
        this.I = true == z ? 7 : 1;
        if (this.l) {
            this.L.b(this.m, cvzVar, z);
        } else {
            u();
        }
    }

    @Override // defpackage.cnk
    public final long a(long j, cdv cdvVar) {
        D();
        if (!this.G.d()) {
            return 0L;
        }
        cvx cvxVarB = this.G.b(j);
        return cdvVar.a(j, cvxVarB.a.b, cvxVarB.b.b);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final long d() {
        return gt();
    }

    @Override // defpackage.cnk
    public final long e() {
        cod codVar = this.h;
        int iB = B();
        if (!codVar.h && codVar.f) {
            codVar.f = false;
        } else {
            if (!codVar.e || (!codVar.f() && iB <= codVar.d)) {
                return -9223372036854775807L;
            }
            codVar.e = false;
        }
        return codVar.b;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d6 A[LOOP:2: B:62:0x00d4->B:63:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ef A[LOOP:3: B:66:0x00ed->B:67:0x00ef, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x00d1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x00e4, please report this as an issue */
    @Override // defpackage.cnk
    public final long f(long j) {
        boolean z;
        int i;
        int i2;
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((cnz) it.next()).e();
        }
        D();
        Object obj = this.P.c;
        long j2 = true != this.G.d() ? 0L : j;
        cod codVar = this.h;
        boolean zG = codVar.g();
        long j3 = codVar.b;
        int i3 = this.I;
        if (codVar.g() || i3 == 7 || (!codVar.f() && (i2 = codVar.a) != 1 && i2 != 2 && i2 != 7 && i2 != 5)) {
            z = false;
            break;
        }
        int length = this.k.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                z = true;
                break;
            }
            con conVar = this.k[i4];
            if (this.B[i4].h()) {
                if (!this.F) {
                    long jN = conVar.n();
                    if (jN == Long.MIN_VALUE || j2 > jN || conVar.e != 0 || j3 != j2) {
                        if (!conVar.H(j2, codVar.f()) && (((boolean[]) obj)[i4] || !this.E)) {
                            z = false;
                            break;
                        }
                    } else {
                        conVar.G(0);
                    }
                } else {
                    conVar.G(conVar.e);
                }
            }
            i4++;
        }
        codVar.e = false;
        codVar.b = j2;
        if (codVar.g()) {
            codVar.c = j2;
            if (!z) {
                if (!zG) {
                    if (codVar.b()) {
                        for (con conVar2 : this.k) {
                            conVar2.s();
                        }
                        this.d.b();
                    } else {
                        this.d.c();
                        for (con conVar3 : this.k) {
                            conVar3.y(false);
                        }
                    }
                }
            }
        } else if (!z) {
            codVar.c = j2;
            codVar.f = false;
            int i5 = codVar.a;
            if (i5 == 2 || i5 == 3 || i5 == 7) {
                codVar.a = 3;
            } else {
                codVar.a = 1;
            }
            if (!zG) {
                if (codVar.b()) {
                    while (i < r2) {
                        conVar2.s();
                    }
                    this.d.b();
                } else {
                    this.d.c();
                    while (i < r1) {
                        conVar3.y(false);
                    }
                }
            }
        }
        return j2;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0219  */
    /* JADX WARN: Code duplicated, block: B:118:0x0239  */
    /* JADX WARN: Code duplicated, block: B:120:0x0243  */
    /* JADX WARN: Code duplicated, block: B:132:0x0260  */
    /* JADX WARN: Code duplicated, block: B:134:0x026d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0279  */
    /* JADX WARN: Code duplicated, block: B:140:0x027f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0285 A[LOOP:8: B:141:0x0283->B:142:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x0293  */
    /* JADX WARN: Code duplicated, block: B:146:0x029e A[LOOP:9: B:145:0x029c->B:146:0x029e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:147:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:149:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:156:0x02be  */
    /* JADX WARN: Code duplicated, block: B:176:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0275 A[EDGE_INSN: B:182:0x0275->B:136:0x0275 BREAK  A[LOOP:7: B:130:0x025b->B:135:0x0272], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:140:0x027f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:144:0x0293, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    @Override // defpackage.cnk
    public final long g(cqs[] cqsVarArr, boolean[] zArr, coo[] cooVarArr, boolean[] zArr2, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        coy coyVar;
        boolean z4;
        int i2;
        coo cooVar;
        int i3;
        int i4;
        boolean[] zArr3;
        int length;
        boolean[] zArr4;
        int i5;
        int i6;
        cob[] cobVarArr;
        cob cobVar;
        boolean z5;
        Object obj;
        Object obj2;
        boolean z6;
        cqs cqsVar;
        boolean z7;
        cqs[] cqsVarArr2 = cqsVarArr;
        D();
        abix abixVar = this.P;
        Object obj3 = abixVar.b;
        Object obj4 = abixVar.d;
        int i7 = this.K;
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            z = true;
            if (i8 >= cqsVarArr2.length) {
                z2 = false;
                break;
            }
            cqs cqsVar2 = cqsVarArr2[i8];
            if (cqsVar2 != null) {
                coy coyVar2 = (coy) obj3;
                if (Objects.equals(coyVar2.b(coyVar2.a(cqsVar2.d())).b(0).q, "application/x-itut-t35")) {
                    z2 = true;
                    break;
                }
            }
            i8++;
        }
        int i9 = 0;
        while (i9 < cqsVarArr2.length) {
            coo cooVar2 = cooVarArr[i9];
            if (cooVar2 == null || !(cqsVarArr2[i9] == null || !zArr[i9] || (z2 && (cooVar2 instanceof cnz)))) {
                z7 = z8;
            } else {
                if (cooVar2 instanceof cnz) {
                    cnz cnzVar = (cnz) cooVar2;
                    this.A.remove(cnzVar);
                    int i10 = ((coe) cnzVar.a).a;
                    boolean[] zArr5 = (boolean[]) obj4;
                    ahno.O(zArr5[i10]);
                    z7 = z8;
                    this.K--;
                    zArr5[i10] = z7;
                    int i11 = ((coe) cnzVar.b).a;
                    ahno.O(zArr5[i11]);
                    this.K--;
                    zArr5[i11] = z7;
                } else {
                    z7 = z8;
                    int i12 = ((coe) cooVar2).a;
                    boolean[] zArr6 = (boolean[]) obj4;
                    ahno.O(zArr6[i12]);
                    this.K--;
                    zArr6[i12] = z7;
                }
                cooVarArr[i9] = null;
            }
            i9++;
            z8 = z7;
        }
        boolean z9 = z8;
        cod codVar = this.h;
        boolean z10 = (!codVar.g ? !(j == 0 || this.F) : i7 == 0) ? z9 : true;
        boolean z11 = z9;
        boolean z12 = z11;
        ?? r10 = z11;
        while (r10 < cqsVarArr2.length) {
            if (cooVarArr[r10] != null || (cqsVar = cqsVarArr2[r10]) == null) {
                obj = obj4;
                obj2 = obj3;
                z6 = z10;
            } else {
                ahno.O(cqsVar.q() == z ? z : z9);
                ahno.O(cqsVar.n(z9 ? 1 : 0) == 0 ? z : false);
                boolean z13 = z;
                coy coyVar3 = (coy) obj3;
                int iA = coyVar3.a(cqsVar.d());
                boolean[] zArr7 = (boolean[]) obj4;
                ahno.O(!zArr7[iA]);
                this.K++;
                zArr7[iA] = z13;
                boolean zH = H(iA, j);
                obj = obj4;
                obj2 = obj3;
                z12 = (z12 ? 1 : 0) | (H(iA, 0L) ? 1 : 0);
                coo coeVar = new coe(this, iA, zH);
                if (Build.VERSION.SDK_INT < 37 || z2 || !bsy.n(cqsVar.c().q)) {
                    z6 = z10;
                    break;
                }
                int i13 = 0;
                while (true) {
                    if (i13 >= coyVar3.b) {
                        z6 = z10;
                        break;
                    }
                    z6 = z10;
                    bse bseVarB = coyVar3.b(i13).b(0);
                    byte[] bArr = bvf.a;
                    if (Objects.equals(bseVarB.q, "application/x-itut-t35")) {
                        Iterator it = bseVarB.t.iterator();
                        while (it.hasNext()) {
                            byte[] bArr2 = (byte[]) it.next();
                            Iterator it2 = it;
                            if (bvf.i(bArr2, bArr2.length)) {
                                ahno.O(!zArr7[i13]);
                                this.K++;
                                zArr7[i13] = z13;
                                cnz cnzVar2 = new cnz(coeVar, new coe(this, i13, false), cqsVar.c());
                                this.A.add(cnzVar2);
                                coeVar = cnzVar2;
                                break;
                            }
                            it = it2;
                        }
                    }
                    i13++;
                    z10 = z6;
                }
                cooVarArr[r10] = coeVar;
                zArr2[r10] = z13;
                if (this.x && !this.B[iA].h()) {
                    z10 = z6 | codVar.g;
                } else if (!z6) {
                    con conVar = this.k[iA];
                    z10 = (conVar.h() == 0 || conVar.H(j, z13)) ? false : true;
                }
                cqsVarArr2 = cqsVarArr;
                obj3 = obj2;
                obj4 = obj;
                z = true;
                z9 = false;
                r10++;
                z12 = z12;
            }
            z10 = z6;
            cqsVarArr2 = cqsVarArr;
            obj3 = obj2;
            obj4 = obj;
            z = true;
            z9 = false;
            r10++;
            z12 = z12;
        }
        Object obj5 = obj4;
        Object obj6 = obj3;
        boolean z14 = z10;
        if (this.K == 0) {
            codVar.e = false;
            codVar.f = false;
            int i14 = codVar.a;
            if (i14 == 2 || i14 == 3 || i14 == 7) {
                codVar.a = 3;
            } else {
                z3 = true;
                codVar.a = 1;
            }
            codVar.g = z3;
            i = 0;
            while (true) {
                coyVar = (coy) obj6;
                if (i < coyVar.b) {
                    z4 = false;
                    break;
                }
                if (!((boolean[]) obj5)[i] && ((boolean[]) this.P.c)[i]) {
                    z4 = true;
                    break;
                }
                i++;
            }
            this.P.a = z4;
            if (this.x) {
                zArr3 = (boolean[]) obj5;
                length = zArr3.length;
                zArr4 = new boolean[length];
                for (i5 = 0; i5 < length; i5++) {
                    int i15 = coyVar.b(i5).c;
                    zArr4[i5] = (i15 == 2 && i15 != 4) || zArr3[i5];
                }
                i6 = 0;
                while (true) {
                    cobVarArr = this.B;
                    if (i6 < cobVarArr.length) {
                        break;
                    }
                    cobVar = cobVarArr[i6];
                    z5 = zArr4[i6];
                    cobVar.b.set(!z5);
                    if (!z5) {
                        cobVar.a.s();
                    }
                    i6++;
                }
            }
            if (this.K == 0) {
                if (z14) {
                    return j;
                }
                long jF = f(j);
                for (i2 = 0; i2 < cooVarArr.length; i2++) {
                    cooVar = cooVarArr[i2];
                    if (cooVar != null) {
                        zArr2[i2] = true;
                        if (cooVar instanceof cnz) {
                            ((cnz) cooVar).e();
                        }
                    }
                }
                return jF;
            }
            if (codVar.b()) {
                for (con conVar2 : this.k) {
                    conVar2.s();
                }
                this.d.b();
                return j;
            }
            this.d.c();
            for (con conVar3 : this.k) {
                conVar3.y(false);
            }
            return j;
        }
        if (codVar.f || !codVar.g) {
            codVar.f = z12;
        }
        z3 = true;
        codVar.g = z3;
        i = 0;
        while (true) {
            coyVar = (coy) obj6;
            if (i < coyVar.b) {
                z4 = false;
                break;
            }
            if (!((boolean[]) obj5)[i]) {
            }
            i++;
        }
        this.P.a = z4;
        if (this.x) {
            zArr3 = (boolean[]) obj5;
            length = zArr3.length;
            zArr4 = new boolean[length];
            while (i5 < length) {
                int i16 = coyVar.b(i5).c;
                zArr4[i5] = (i16 == 2 && i16 != 4) || zArr3[i5];
            }
            i6 = 0;
            while (true) {
                cobVarArr = this.B;
                if (i6 < cobVarArr.length) {
                    break;
                    break;
                }
                cobVar = cobVarArr[i6];
                z5 = zArr4[i6];
                cobVar.b.set(!z5);
                if (!z5) {
                    cobVar.a.s();
                }
                i6++;
            }
        }
        if (this.K == 0) {
            if (z14) {
                return j;
            }
            long jF2 = f(j);
            while (i2 < cooVarArr.length) {
                cooVar = cooVarArr[i2];
                if (cooVar != null) {
                    zArr2[i2] = true;
                    if (cooVar instanceof cnz) {
                        ((cnz) cooVar).e();
                    }
                }
            }
            return jF2;
        }
        if (codVar.b()) {
            while (i4 < r2) {
                conVar2.s();
            }
            this.d.b();
            return j;
        }
        this.d.c();
        while (i3 < r1) {
            conVar3.y(false);
        }
        return j;
    }

    @Override // defpackage.crk
    public final /* synthetic */ void gq(crm crmVar, long j, long j2, boolean z) {
        coc cocVar = (coc) crmVar;
        bze bzeVar = cocVar.b;
        cnc cncVar = new cnc(cocVar.a, cocVar.d, j);
        cncVar.d = bzeVar.b;
        cncVar.e = bzeVar.c;
        cncVar.f = j2;
        cncVar.g = bzeVar.a;
        this.N.f(new cnd(cncVar), this.I, -1, null, 0, null, cocVar.c, this.m);
        cod codVar = this.h;
        boolean zG = G();
        if (!z) {
            int i = codVar.a;
            int i2 = 1;
            if (i == 7) {
                if (zG && !codVar.g()) {
                    i2 = 8;
                }
                codVar.a = i2;
            } else if (i == 3) {
                codVar.a = 1;
            }
        }
        if (z) {
            return;
        }
        if (codVar.d()) {
            E();
        } else if (codVar.g()) {
            for (con conVar : this.k) {
                conVar.y(false);
            }
        }
        if (this.K <= 0 || codVar.f()) {
            return;
        }
        cnj cnjVar = this.i;
        cnjVar.getClass();
        cnjVar.b(this);
    }

    @Override // defpackage.crk
    public final /* bridge */ /* synthetic */ void gr(crm crmVar, long j, long j2, int i) {
        int i2;
        coc cocVar = (coc) crmVar;
        bze bzeVar = cocVar.b;
        cnc cncVar = new cnc(cocVar.a, cocVar.d, j);
        if (i != 0) {
            cncVar.d = bzeVar.b;
            cncVar.e = bzeVar.c;
            cncVar.f = j2;
            cncVar.g = bzeVar.a;
            i2 = i;
        } else {
            i2 = 0;
        }
        this.N.l(new cnd(cncVar), this.I, -1, null, 0, null, cocVar.c, this.m, i2);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9 A[LOOP:0: B:34:0x00a7->B:35:0x00a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // defpackage.crk
    public final /* synthetic */ yvt gs(crm crmVar, long j, long j2, IOException iOException, int i) {
        IOException iOException2;
        long jC;
        boolean z;
        yvt yvtVar;
        ?? r7;
        con[] conVarArr;
        int length;
        ?? r10;
        cvz cvzVar;
        coc cocVar = (coc) crmVar;
        bze bzeVar = cocVar.b;
        cnc cncVar = new cnc(cocVar.a, cocVar.d, j);
        cncVar.d = bzeVar.b;
        cncVar.e = bzeVar.c;
        cncVar.f = j2;
        cncVar.g = bzeVar.a;
        cnd cndVar = new cnd(cncVar);
        long j3 = cocVar.c;
        int i2 = bwp.a;
        cod codVar = this.h;
        crj crjVar = this.v;
        int iB = B();
        int i3 = codVar.d;
        int iA = crjVar.a(this.I);
        int i4 = iB > i3 ? 1 : i;
        if (i4 > iA) {
            iOException2 = iOException;
            jC = -9223372036854775807L;
        } else {
            iOException2 = iOException;
            jC = crjVar.c(new aae(cndVar, iOException2, i4));
        }
        if (jC == -9223372036854775807L) {
            yvtVar = crp.e;
            codVar.a = 6;
        } else {
            boolean z2 = this.n || !((cvzVar = this.G) == null || cvzVar.a() == -9223372036854775807L);
            boolean z3 = this.l;
            if (z2) {
                codVar.d = iB;
                codVar.a = 2;
            } else {
                if (!z3 || codVar.h()) {
                    codVar.e = z3;
                    codVar.b = 0L;
                    z = false;
                    codVar.d = 0;
                    codVar.a = 2;
                } else {
                    codVar.a = 5;
                }
                if (codVar.e()) {
                    yvtVar = crp.d;
                } else {
                    if (!z2) {
                        conVarArr = this.k;
                        length = conVarArr.length;
                        for (r10 = z; r10 < length; r10++) {
                            conVarArr[r10].y(z);
                        }
                        cocVar.c(0L, 0L);
                    }
                    if (iB > i3) {
                        r7 = 1;
                    } else {
                        r7 = z;
                    }
                    yvtVar = new yvt((int) r7, jC);
                }
            }
            z = false;
            if (codVar.e()) {
                if (!z2) {
                    conVarArr = this.k;
                    length = conVarArr.length;
                    while (r10 < length) {
                        conVarArr[r10].y(z);
                    }
                    cocVar.c(0L, 0L);
                }
                if (iB > i3) {
                    r7 = 1;
                } else {
                    r7 = z;
                }
                yvtVar = new yvt((int) r7, jC);
            } else {
                yvtVar = crp.d;
            }
        }
        this.N.j(cndVar, this.I, -1, null, 0, null, cocVar.c, this.m, iOException2, !yvtVar.c());
        return yvtVar;
    }

    @Override // defpackage.cnk, defpackage.coq
    public final long gt() {
        long jK;
        D();
        cod codVar = this.h;
        if (codVar.f() || this.K == 0) {
            return Long.MIN_VALUE;
        }
        if (codVar.g()) {
            return codVar.c;
        }
        if (this.E) {
            int length = this.k.length;
            jK = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                abix abixVar = this.P;
                if (((boolean[]) abixVar.c)[i] && ((boolean[]) abixVar.d)[i] && !this.k[i].E()) {
                    jK = Math.min(jK, this.k[i].o());
                }
            }
        } else {
            jK = Long.MAX_VALUE;
        }
        if (jK == Long.MAX_VALUE) {
            jK = k(false);
        }
        return jK == Long.MIN_VALUE ? codVar.b : jK;
    }

    @Override // defpackage.crk
    public final /* synthetic */ void gv(crm crmVar, long j, long j2) {
        coc cocVar = (coc) crmVar;
        if (this.m == -9223372036854775807L && this.G != null) {
            long jK = k(true);
            long j3 = jK == Long.MIN_VALUE ? 0L : jK + 10000;
            this.m = j3;
            this.L.b(j3, this.G, this.H);
        }
        bze bzeVar = cocVar.b;
        cnc cncVar = new cnc(cocVar.a, cocVar.d, j);
        cncVar.d = bzeVar.b;
        cncVar.e = bzeVar.c;
        cncVar.f = j2;
        cncVar.g = bzeVar.a;
        this.N.h(new cnd(cncVar), this.I, -1, null, 0, null, cocVar.c, this.m);
        cod codVar = this.h;
        codVar.c = -9223372036854775807L;
        codVar.a = 4;
        if (G()) {
            codVar.a();
            E();
        }
        cnj cnjVar = this.i;
        cnjVar.getClass();
        cnjVar.b(this);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    @Override // defpackage.cnk
    public final long h(long j) {
        cod codVar;
        long j2 = this.J;
        this.J = j;
        boolean z = false;
        for (con conVar : this.k) {
            conVar.z(j);
        }
        if (this.l) {
            if (j2 != Long.MIN_VALUE && (j == Long.MIN_VALUE || j > j2)) {
                z = true;
            }
            boolean zG = G();
            if (z) {
                if (zG) {
                    codVar = this.h;
                    codVar.a();
                    if (codVar.c()) {
                        this.d.b();
                    } else if (codVar.d()) {
                        E();
                    }
                } else {
                    cod codVar2 = this.h;
                    if (codVar2.a == 8) {
                        codVar2.a = 1;
                    }
                    if (this.K > 0) {
                        cnj cnjVar = this.i;
                        cnjVar.getClass();
                        cnjVar.b(this);
                    }
                }
            } else if (zG) {
                codVar = this.h;
                codVar.a();
                if (codVar.c()) {
                    this.d.b();
                } else if (codVar.d()) {
                    E();
                }
            }
        }
        return j;
    }

    @Override // defpackage.cnk
    public final coy i() {
        D();
        return (coy) this.P.b;
    }

    @Override // defpackage.cnk
    public final void j() throws IOException {
        x();
        if (this.h.f() && !this.l) {
            throw new bsz("Loading finished before preparation is complete.", null, true, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final long k(boolean z) {
        int i = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            con[] conVarArr = this.k;
            if (i >= conVarArr.length) {
                return jMax;
            }
            if (z) {
                jMax = Math.max(jMax, conVarArr[i].o());
            } else {
                abix abixVar = this.P;
                abixVar.getClass();
                if (((boolean[]) abixVar.d)[i]) {
                    jMax = Math.max(jMax, conVarArr[i].o());
                }
            }
            i++;
        }
    }

    @Override // defpackage.cnk
    public final void l(cnj cnjVar, long j) {
        this.i = cnjVar;
        bse bseVar = this.y;
        if (bseVar == null) {
            F();
            return;
        }
        this.h.c = j;
        s(0, 3).b(bseVar);
        A(new cvt(new long[]{0}, new long[]{0}, -9223372036854775807L));
        t();
    }

    @Override // defpackage.cnk, defpackage.coq
    public final void m(long j) {
        if (this.K <= 0 || !G()) {
            return;
        }
        this.h.a();
        E();
    }

    @Override // defpackage.cnk
    public final void n() {
        this.h.h = true;
    }

    @Override // defpackage.cnk, defpackage.coq
    public final boolean o(ccy ccyVar) {
        boolean z = this.l || this.y != null;
        cod codVar = this.h;
        int i = this.K;
        int i2 = codVar.a;
        if (i2 != 1 && i2 != 2) {
            return false;
        }
        if (z && i <= 0) {
            return false;
        }
        if (!this.d.g()) {
            F();
            return true;
        }
        if (!this.o) {
            return false;
        }
        this.o = false;
        return this.q.h();
    }

    @Override // defpackage.cnk, defpackage.coq
    public final boolean p() {
        cod codVar = this.h;
        return (codVar.a == 2 || codVar.b()) && this.q.g();
    }

    @Override // defpackage.cnk
    public final void q(long j) {
        if (this.F) {
            return;
        }
        D();
        if (this.h.g()) {
            return;
        }
        Object obj = this.P.d;
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            this.k[i].I(j, ((boolean[]) obj)[i]);
        }
    }

    public final cwj r(cof cofVar) {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            if (cofVar.equals(this.C[i])) {
                return this.k[i];
            }
        }
        if (this.D) {
            bvx.e("ProgressiveMediaPeriod", "Extractor added new track (id=" + cofVar.a + ") after finishing tracks.");
            return new cvf();
        }
        con conVarJ = con.J(this.w, this.u, this.O);
        cob cobVar = new cob(conVarJ);
        conVarJ.b = this;
        int i2 = length + 1;
        cof[] cofVarArr = (cof[]) Arrays.copyOf(this.C, i2);
        cofVarArr[length] = cofVar;
        int i3 = bwp.a;
        this.C = cofVarArr;
        con[] conVarArr = (con[]) Arrays.copyOf(this.k, i2);
        conVarArr[length] = conVarJ;
        this.k = conVarArr;
        cob[] cobVarArr = (cob[]) Arrays.copyOf(this.B, i2);
        cobVarArr[length] = cobVar;
        this.B = cobVarArr;
        return cobVar;
    }

    @Override // defpackage.cvk
    public final cwj s(int i, int i2) {
        return r(new cof(i, false));
    }

    @Override // defpackage.cvk
    public final void t() {
        this.D = true;
        this.g.post(this.e);
    }

    public final void u() {
        int i;
        if (this.p || this.l || !this.D || this.G == null) {
            return;
        }
        for (con conVar : this.k) {
            if (conVar.r() == null) {
                return;
            }
        }
        this.q.f();
        this.o = true;
        int length = this.k.length;
        int i2 = 0;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            bse bseVarR = this.k[i4].r();
            bseVarR.getClass();
            int iB = bsy.b(bseVarR.q);
            if (C(iB) > C(i3)) {
                i2 = i4;
                i3 = iB;
            }
        }
        bto[] btoVarArr = new bto[length];
        boolean[] zArr = new boolean[length];
        for (int i5 = 0; i5 < length; i5++) {
            bse bseVarR2 = this.k[i5].r();
            bseVarR2.getClass();
            String str = bseVarR2.q;
            boolean zI = bsy.i(str);
            boolean z = zI || bsy.n(str);
            zArr[i5] = z;
            this.E |= z;
            this.F = this.z != -9223372036854775807L && length == 1 && bsy.k(str);
            cxx cxxVar = this.j;
            if (cxxVar != null) {
                if (zI || this.C[i5].b) {
                    bsx bsxVar = bseVarR2.m;
                    bsx bsxVar2 = bsxVar == null ? new bsx(-9223372036854775807L, cxxVar) : bsxVar.d(cxxVar);
                    bsd bsdVar = new bsd(bseVarR2);
                    bsdVar.l = bsxVar2;
                    bseVarR2 = new bse(bsdVar);
                }
                if (zI && bseVarR2.i == -1 && bseVarR2.j == -1 && (i = cxxVar.a) != -1) {
                    bsd bsdVar2 = new bsd(bseVarR2);
                    bsdVar2.i = i;
                    bseVarR2 = new bse(bsdVar2);
                }
            }
            bse bseVarB = bseVarR2.b(this.u.a(bseVarR2));
            if (i5 != i2) {
                bsd bsdVar3 = new bsd(bseVarB);
                bsdVar3.m = Integer.toString(i2);
                bseVarB = new bse(bsdVar3);
            }
            btoVarArr[i5] = new bto(Integer.toString(i5), bseVarB);
            this.k[i5].z(this.J);
        }
        this.P = new abix(new coy(btoVarArr), zArr);
        if (this.F && this.m == -9223372036854775807L) {
            this.m = this.z;
            this.G = new coa(this, this.G);
        }
        this.L.b(this.m, this.G, this.H);
        this.l = true;
        cnj cnjVar = this.i;
        cnjVar.getClass();
        cnjVar.gp(this);
    }

    public final void v(int i) {
        D();
        abix abixVar = this.P;
        boolean[] zArr = (boolean[]) abixVar.e;
        if (zArr[i]) {
            return;
        }
        bse bseVarB = ((coy) abixVar.b).b(i).b(0);
        this.N.d(bsy.b(bseVarB.q), bseVarB, 0, null, this.h.b);
        zArr[i] = true;
    }

    public final void w(int i) {
        D();
        cod codVar = this.h;
        if (codVar.e()) {
            if ((!this.E || ((boolean[]) this.P.c)[i]) && !this.k[i].F(false)) {
                codVar.c = 0L;
                codVar.e = true;
                codVar.b = 0L;
                codVar.d = 0;
                codVar.a = 1;
                for (con conVar : this.k) {
                    conVar.y(false);
                }
                cnj cnjVar = this.i;
                cnjVar.getClass();
                cnjVar.b(this);
            }
        }
    }

    final void x() throws IOException {
        this.d.d(this.v.a(this.I));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cvi, java.lang.Object] */
    @Override // defpackage.crn
    public final void y() {
        for (con conVar : this.k) {
            conVar.x();
        }
        ovo ovoVar = this.M;
        ?? r0 = ovoVar.c;
        if (r0 != 0) {
            r0.c();
            ovoVar.c = null;
        }
        ovoVar.b = null;
    }

    @Override // defpackage.cvk
    public final void z(cvz cvzVar) {
        this.g.post(new cfv(this, cvzVar, 12, null));
    }
}
