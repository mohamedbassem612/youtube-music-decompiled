package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class chz extends cmi {
    private final cjz C;
    private final crr D;
    private final chv E;
    private final SparseArray F;
    private final Runnable G;
    private final crq H;
    private final Uri I;
    private bye J;
    private bss K;
    private bso L;
    private final eol M;
    private final qcb N;
    public final byd a;
    public final crj b;
    public final Object c;
    public final Runnable d;
    public final Map e;
    public agke f;
    public cis g;
    public agke h;
    public chx i;
    public crp j;
    public bzg k;
    public IOException l;
    public Handler m;
    public cio n;
    public boolean o;
    public long p;
    public long q;
    public long r;
    public int s;
    public long t;
    public int u;
    public crw v;
    public final aae w;
    public final aepb x;

    static {
        bst.b("media3.exoplayer.dash");
    }

    public chz(bss bssVar, byd bydVar, crr crrVar, eol eolVar, cjz cjzVar, crj crjVar) {
        this.K = bssVar;
        this.L = bssVar.d;
        Uri uri = bssVar.c.a;
        this.I = uri;
        this.n = null;
        this.a = bydVar;
        this.D = crrVar;
        this.M = eolVar;
        this.C = cjzVar;
        this.b = crjVar;
        this.x = new aepb(null);
        this.w = F(null);
        this.c = new Object();
        this.f = agke.q(new cis(uri));
        this.e = new HashMap();
        this.F = new SparseArray();
        this.N = new qcb(this);
        this.t = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.E = new chv(this);
        this.H = new chw(this);
        this.G = new bkn(this, 14);
        this.d = new bkn(this, 15);
    }

    private final synchronized bso H() {
        return this.L;
    }

    private final cis I(List list) {
        ahno.O(!list.isEmpty());
        cis cisVar = (cis) list.get(0);
        long jLongValue = Long.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            cis cisVar2 = (cis) list.get(i);
            Long l = (Long) this.e.get(cisVar2.b);
            if (l == null) {
                return cisVar2;
            }
            if (l.longValue() < jLongValue) {
                jLongValue = l.longValue();
                cisVar = cisVar2;
            }
        }
        return cisVar;
    }

    private final cis J() {
        cis cisVar = this.g;
        if (cisVar != null && !this.e.containsKey(cisVar.b)) {
            for (int i = 0; i < this.f.size(); i++) {
                cis cisVar2 = (cis) this.f.get(i);
                if (cisVar2.b.equals(this.g.b)) {
                    return cisVar2;
                }
            }
        }
        return I(this.f);
    }

    private final synchronized void K(bso bsoVar) {
        this.L = bsoVar;
    }

    private final void L(crs crsVar, crk crkVar, int i) {
        this.j.h(crsVar, crkVar, i);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    private static boolean M(aesh aeshVar) {
        int i = 0;
        while (true) {
            ?? r2 = aeshVar.f;
            if (i >= r2.size()) {
                return false;
            }
            int i2 = ((cij) r2.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
            i++;
        }
    }

    public final cis b() {
        cis cisVarJ;
        Map map = this.e;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getValue()).longValue() <= jElapsedRealtime) {
                it.remove();
            }
        }
        agke agkeVar = this.h;
        if (agkeVar != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < agkeVar.size(); i++) {
                String str = (String) agkeVar.get(i);
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < this.f.size(); i2++) {
                    cis cisVar = (cis) this.f.get(i2);
                    if (Objects.equals(cisVar.b, str)) {
                        arrayList2.add(cisVar);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            cisVarJ = !arrayList.isEmpty() ? I(arrayList) : J();
        } else {
            cisVarJ = J();
        }
        this.g = cisVarJ;
        return cisVarJ;
    }

    @Override // defpackage.cno
    public final cnk c(cnm cnmVar, cra craVar, long j) {
        int iIntValue = ((Integer) cnmVar.a).intValue() - this.u;
        aae aaeVarF = F(cnmVar);
        aae aaeVarG = G(cnmVar);
        int i = this.u + iIntValue;
        cio cioVar = this.n;
        bzg bzgVar = q() ? this.v.d : this.k;
        eol eolVar = this.M;
        aepb aepbVar = this.x;
        cjz cjzVar = this.C;
        crj crjVar = this.b;
        long j2 = this.r;
        crq crqVar = this.H;
        qcb qcbVar = this.N;
        r();
        chs chsVar = new chs(i, cioVar, aepbVar, iIntValue, eolVar, bzgVar, cjzVar, aaeVarG, crjVar, aaeVarF, j2, crqVar, craVar, qcbVar, this.v);
        this.F.put(chsVar.a, chsVar);
        return chsVar;
    }

    public final void d() {
        crp crpVar = this.j;
        qcb qcbVar = new qcb(this);
        if (csm.b()) {
            qcbVar.J();
            return;
        }
        if (crpVar == null) {
            crpVar = new crp("SntpClient");
        }
        crpVar.h(new csl(), new csk(qcbVar), 1);
    }

    public final void f(crs crsVar, long j, long j2) {
        cnc cncVar = new cnc(crsVar.a, crsVar.b, j);
        cncVar.d = crsVar.d();
        cncVar.e = crsVar.e();
        cncVar.f = j2;
        cncVar.g = crsVar.c();
        this.w.f(new cnd(cncVar), crsVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void g(IOException iOException) {
        bvx.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.r = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        j(true);
    }

    public final void h(long j) {
        this.r = j;
        j(true);
    }

    /* JADX WARN: Code duplicated, block: B:196:0x0459  */
    /* JADX WARN: Code duplicated, block: B:223:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:225:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:89:0x023f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r30v10 */
    /* JADX WARN: Type inference failed for: r30v11 */
    /* JADX WARN: Type inference failed for: r30v12 */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r30v6, types: [int] */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r30v8 */
    /* JADX WARN: Type inference failed for: r30v9 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v25, types: [cqs] */
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
    public final void j(boolean z) {
        int i;
        ?? r11;
        boolean z2;
        boolean z3;
        long j;
        long j2;
        cia ciaVarK;
        long jMin;
        long jC;
        long jH;
        int i2;
        int i3;
        int i4;
        cpk[] cpkVarArr;
        ?? r30;
        ?? r31;
        long j3;
        cic cicVar;
        long jG;
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.F;
            if (i5 >= sparseArray.size()) {
                aesh aeshVarD = this.n.d(0);
                int iA = this.n.a() - 1;
                aesh aeshVarD2 = this.n.d(iA);
                long jC2 = this.n.c(iA);
                long jY = bwp.y(bwp.w(this.r));
                long jC3 = this.n.c(0);
                long j4 = aeshVarD.a;
                long jY2 = bwp.y(j4);
                boolean zM = M(aeshVarD);
                long jMax = jY2;
                int i6 = 0;
                while (true) {
                    ?? r15 = aeshVarD.f;
                    aesh aeshVar = aeshVarD;
                    boolean z5 = zM;
                    i = 2;
                    if (i6 >= r15.size()) {
                        break;
                    }
                    cij cijVar = (cij) r15.get(i6);
                    int i7 = cijVar.b;
                    int i8 = i6;
                    boolean z6 = (i7 == 1 || i7 == 2) ? false : true;
                    if (!z5 || !z6) {
                        List list = cijVar.c;
                        if (!list.isEmpty()) {
                            long jMax2 = jY2;
                            int i9 = 0;
                            while (i9 < list.size()) {
                                cia ciaVarK2 = ((ciy) list.get(i9)).k();
                                jMax2 = Math.max(jMax2, (ciaVarK2 == null || ciaVarK2.a(jC3, jY) == 0) ? jY2 : jY2 + ciaVarK2.h(ciaVarK2.c(jC3, jY)));
                                i9++;
                                list = list;
                            }
                            jMax = Math.max(jMax, jMax2);
                        }
                    }
                    i6 = i8 + 1;
                    aeshVarD = aeshVar;
                    zM = z5;
                    j4 = j4;
                }
                long j5 = j4;
                long jY3 = bwp.y(aeshVarD2.a);
                boolean zM2 = M(aeshVarD2);
                int i10 = 0;
                long jMin2 = Long.MAX_VALUE;
                while (true) {
                    r11 = aeshVarD2.f;
                    if (i10 >= r11.size()) {
                        break;
                    }
                    cij cijVar2 = (cij) r11.get(i10);
                    int i11 = cijVar2.b;
                    long j6 = jY3;
                    boolean z7 = (i11 == 1 || i11 == i) ? false : true;
                    if (!zM2 || !z7) {
                        List list2 = cijVar2.c;
                        if (!list2.isEmpty()) {
                            int i12 = 0;
                            long jMin3 = Long.MAX_VALUE;
                            while (i12 < list2.size()) {
                                cia ciaVarK3 = ((ciy) list2.get(i12)).k();
                                if (ciaVarK3 == null) {
                                    jH = j6 + jC2;
                                } else {
                                    long jA = ciaVarK3.a(jC2, jY);
                                    if (jA == 0) {
                                        jH = j6;
                                    } else {
                                        long jC4 = (ciaVarK3.c(jC2, jY) + jA) - 1;
                                        jH = j6 + ciaVarK3.h(jC4) + ciaVarK3.b(jC4, jC2);
                                    }
                                }
                                jMin3 = Math.min(jMin3, jH);
                                i12++;
                                list2 = list2;
                            }
                            jMin2 = Math.min(jMin2, jMin3);
                        }
                    }
                    i10++;
                    jY3 = j6;
                    i = 2;
                }
                if (!this.n.d) {
                    z2 = false;
                    break;
                }
                int i13 = 0;
                while (true) {
                    if (i13 >= r11.size()) {
                        z2 = true;
                        break;
                    }
                    cia ciaVarK4 = ((ciy) ((cij) r11.get(i13)).c.get(0)).k();
                    if (ciaVarK4 == null || ciaVarK4.j()) {
                        z2 = false;
                        break;
                    }
                    i13++;
                }
                if (z2) {
                    long j7 = this.n.f;
                    if (j7 != -9223372036854775807L) {
                        jMax = Math.max(jMax, jMin2 - bwp.y(j7));
                    }
                }
                long j8 = jMin2 - jMax;
                cio cioVar = this.n;
                long jF = cioVar.a;
                if (!cioVar.d && jF == -9223372036854775807L) {
                    int i14 = 0;
                    loop11: while (true) {
                        if (i14 >= cioVar.a()) {
                            z3 = z2;
                            jF = -9223372036854775807L;
                            break;
                        }
                        aesh aeshVarD3 = cioVar.d(i14);
                        long j9 = aeshVarD3.a;
                        if (j9 != -9223372036854775807L) {
                            int i15 = 0;
                            while (true) {
                                ?? r8 = aeshVarD3.f;
                                if (i15 >= r8.size()) {
                                    break;
                                }
                                cij cijVar3 = (cij) r8.get(i15);
                                int i16 = cijVar3.b;
                                if (i16 == 1 || i16 == 2) {
                                    List list3 = cijVar3.c;
                                    if (list3.isEmpty()) {
                                        continue;
                                    } else {
                                        agke agkeVar = cijVar3.g;
                                        if (!agkeVar.isEmpty()) {
                                            int i17 = 0;
                                            while (i17 < ((agpi) agkeVar).d) {
                                                cit citVar = (cit) agkeVar.get(i17);
                                                z3 = z2;
                                                int i18 = i14;
                                                long j10 = citVar.e;
                                                if (j10 != -9223372036854775807L) {
                                                    long j11 = citVar.f;
                                                    if (j11 != -9223372036854775807L) {
                                                        ciy ciyVar = (ciy) list3.get(0);
                                                        jC = bwp.C(j11, 1000000L, ciyVar.e) - ciyVar.f;
                                                    } else {
                                                        jC = 0;
                                                    }
                                                    jF = (j10 - bwp.F(jC)) - j9;
                                                    break loop11;
                                                }
                                                i17++;
                                                z2 = z3;
                                                i14 = i18;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                                i15++;
                                z2 = z2;
                                i14 = i14;
                            }
                        }
                        i14++;
                        z2 = z2;
                    }
                } else {
                    z3 = z2;
                }
                long j12 = jF;
                long jF2 = j12 != -9223372036854775807L ? j12 + bwp.F(jMax) : -9223372036854775807L;
                cio cioVar2 = this.n;
                if (cioVar2.d) {
                    ahno.O(cioVar2.a != -9223372036854775807L);
                    cio cioVar3 = this.n;
                    long jY4 = (jY - bwp.y(cioVar3.a)) - jMax;
                    bso bsoVar = jF().d;
                    long j13 = bsoVar.c;
                    long jF3 = bwp.F(jY4);
                    if (j13 != -9223372036854775807L) {
                        jMin = Math.min(jF3, j13);
                    } else {
                        cjf cjfVar = cioVar3.j;
                        if (cjfVar != null) {
                            long j14 = cjfVar.c;
                            if (j14 != -9223372036854775807L) {
                                jMin = Math.min(jF3, j14);
                            } else {
                                jMin = jF3;
                            }
                        } else {
                            jMin = jF3;
                        }
                    }
                    long jF4 = bwp.F(jY4 - j8);
                    if (jF4 < 0 && jMin > 0) {
                        jF4 = 0;
                    }
                    long j15 = this.n.c;
                    if (j15 != -9223372036854775807L) {
                        jF4 = Math.min(jF4 + j15, jF3);
                    }
                    long jT = jF4;
                    long j16 = bsoVar.b;
                    if (j16 != -9223372036854775807L) {
                        jT = bwp.t(j16, jT, jF3);
                    } else {
                        cjf cjfVar2 = this.n.j;
                        if (cjfVar2 != null) {
                            long j17 = cjfVar2.b;
                            if (j17 != -9223372036854775807L) {
                                jT = bwp.t(j17, jT, jF3);
                            }
                        }
                    }
                    long j18 = jT > jMin ? jT : jMin;
                    long jT2 = H().a;
                    if (jT2 == -9223372036854775807L) {
                        cio cioVar4 = this.n;
                        cjf cjfVar3 = cioVar4.j;
                        if (cjfVar3 != null) {
                            jT2 = cjfVar3.a;
                            if (jT2 == -9223372036854775807L) {
                                jT2 = cioVar4.g;
                                if (jT2 == -9223372036854775807L) {
                                    jT2 = 30000;
                                }
                            }
                        } else {
                            jT2 = cioVar4.g;
                            if (jT2 == -9223372036854775807L) {
                                jT2 = 30000;
                            }
                        }
                    }
                    if (jT2 < jT) {
                        jT2 = jT;
                    }
                    if (jT2 > j18) {
                        jT2 = bwp.t(bwp.F(jY4 - Math.min(5000000L, j8 / 2)), jT, j18);
                    }
                    long j19 = jT;
                    long j20 = j18;
                    float f = bsoVar.d;
                    if (f == -3.4028235E38f) {
                        cjf cjfVar4 = this.n.j;
                        f = cjfVar4 != null ? cjfVar4.d : -3.4028235E38f;
                    }
                    float f2 = bsoVar.e;
                    if (f2 == -3.4028235E38f) {
                        cjf cjfVar5 = this.n.j;
                        f2 = cjfVar5 != null ? cjfVar5.e : -3.4028235E38f;
                    }
                    if (f == -3.4028235E38f && f2 == -3.4028235E38f) {
                        cjf cjfVar6 = this.n.j;
                        j = jMax;
                        if (cjfVar6 == null || cjfVar6.a == -9223372036854775807L) {
                            f = 1.0f;
                            f2 = 1.0f;
                        }
                    } else {
                        j = jMax;
                    }
                    bsn bsnVar = new bsn();
                    bsnVar.a = jT2;
                    bsnVar.b = j19;
                    bsnVar.c = j20;
                    bsnVar.d = f;
                    bsnVar.e = f2;
                    K(new bso(bsnVar));
                    long jY5 = jY4 - bwp.y(H().a);
                    long jMin4 = Math.min(5000000L, j8 / 2);
                    j2 = jY5 < jMin4 ? jMin4 : jY5;
                } else {
                    j = jMax;
                    j2 = 0;
                }
                long jY6 = j - bwp.y(j5);
                long j21 = this.r;
                int i19 = this.u;
                cio cioVar5 = this.n;
                z(new cht(j12, jF2, j21, i19, jY6, j8, j2, cioVar5, jF(), cioVar5.d ? H() : null));
                if (q()) {
                    crw crwVar = this.v;
                    cio cioVar6 = this.n;
                    if (!Objects.equals(cioVar6, crwVar.f)) {
                        crwVar.f = cioVar6;
                        crwVar.g = crw.c(cioVar6);
                        crwVar.h = crw.b(cioVar6);
                    }
                }
                Handler handler = this.m;
                Runnable runnable = this.d;
                handler.removeCallbacks(runnable);
                if (z3) {
                    Handler handler2 = this.m;
                    cio cioVar7 = this.n;
                    long jW = bwp.w(this.r);
                    int iA2 = cioVar7.a() - 1;
                    aesh aeshVarD4 = cioVar7.d(iA2);
                    long jY7 = bwp.y(aeshVarD4.a);
                    long jC5 = cioVar7.c(iA2);
                    long jY8 = bwp.y(jW);
                    long jY9 = bwp.y(cioVar7.a);
                    long jY10 = bwp.y(cioVar7.e);
                    long j22 = 5000000;
                    if (jY10 != -9223372036854775807L && jY10 < 5000000) {
                        j22 = jY10;
                    }
                    long j23 = j22;
                    int i20 = 0;
                    while (true) {
                        ?? r6 = aeshVarD4.f;
                        aesh aeshVar2 = aeshVarD4;
                        if (i20 >= r6.size()) {
                            break;
                        }
                        List list4 = ((cij) r6.get(i20)).c;
                        if (!list4.isEmpty() && (ciaVarK = ((ciy) list4.get(0)).k()) != null) {
                            long jE = ((jY9 + jY7) + ciaVarK.e(jC5, jY8)) - jY8;
                            if (jE > 0 && (jE < j23 - 100000 || (jE > j23 && jE < j23 + 100000))) {
                                j23 = jE;
                            }
                        }
                        i20++;
                        aeshVarD4 = aeshVar2;
                    }
                    handler2.postDelayed(runnable, afxw.U(j23, 1000L, RoundingMode.CEILING));
                }
                if (this.o) {
                    o();
                    return;
                }
                if (z) {
                    cio cioVar8 = this.n;
                    if (cioVar8.d) {
                        long j24 = cioVar8.e;
                        if (j24 != -9223372036854775807L) {
                            if (j24 == 0) {
                                j24 = 5000;
                            }
                            n(Math.max(0L, (this.p + j24) - SystemClock.elapsedRealtime()));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            int iKeyAt = sparseArray.keyAt(i5);
            if (iKeyAt >= this.u) {
                chs chsVar = (chs) sparseArray.valueAt(i5);
                cio cioVar9 = this.n;
                int i21 = iKeyAt - this.u;
                chsVar.g = cioVar9;
                chsVar.h = i21;
                cih cihVar = chsVar.b;
                cihVar.h = z4;
                cihVar.f = -9223372036854775807L;
                cihVar.e = cioVar9;
                Iterator it = cihVar.d.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < cihVar.e.h) {
                        it.remove();
                    }
                }
                cpk[] cpkVarArr2 = chsVar.e;
                if (cpkVarArr2 != null) {
                    ?? r7 = z4;
                    while (r7 < cpkVarArr2.length) {
                        cie cieVar = (cie) cpkVarArr2[r7 == true ? 1 : 0].e;
                        try {
                            cieVar.c = cioVar9;
                            cieVar.d = i21;
                            long jC6 = cieVar.c.c(i21);
                            ArrayList arrayListC = cieVar.c();
                            ?? r10 = z4;
                            r7 = r7;
                            while (true) {
                                cic[] cicVarArr = cieVar.a;
                                if (r10 >= cicVarArr.length) {
                                    i3 = i5;
                                    i4 = i21;
                                    cpkVarArr = cpkVarArr2;
                                    r30 = r7 == true ? 1 : 0;
                                    break;
                                }
                                ciy ciyVar2 = (ciy) arrayListC.get(cieVar.b.n(r10));
                                cic cicVar2 = cicVarArr[r10];
                                cia ciaVarK5 = cicVar2.a.k();
                                cia ciaVarK6 = ciyVar2.k();
                                if (ciaVarK5 == null || ciaVarK6 == null || !ciaVarK5.j() || ciaVarK5.f(jC6) == 0 || ciaVarK6.f(jC6) == 0) {
                                    i3 = i5;
                                    i4 = i21;
                                    cpkVarArr = cpkVarArr2;
                                    r31 = r7 == true ? 1 : 0;
                                    j3 = jC6;
                                    cicVar = new cic(j3, ciyVar2, cicVar2.b, cicVar2.f, cicVar2.e, ciaVarK6);
                                } else {
                                    long jF5 = ciaVarK5.f(jC6);
                                    cpkVarArr = cpkVarArr2;
                                    r30 = r7 == true ? 1 : 0;
                                    try {
                                        long jD = ciaVarK5.d();
                                        long jH2 = ciaVarK5.h(jD);
                                        long j25 = jD + jF5;
                                        long j26 = j25 - 1;
                                        long jH3 = ciaVarK5.h(j26) + ciaVarK5.b(j26, jC6);
                                        long jD2 = ciaVarK6.d();
                                        i3 = i5;
                                        i4 = i21;
                                        try {
                                            long jH4 = ciaVarK6.h(jD2);
                                            long j27 = cicVar2.e;
                                            if (jH3 == jH4) {
                                                jG = j27 + (j25 - jD2);
                                            } else {
                                                if (jH3 < jH4) {
                                                    throw new cmj();
                                                }
                                                jG = jH4 < jH2 ? j27 - (ciaVarK6.g(jH2, jC6) - jD) : j27 + (ciaVarK5.g(jH4, jC6) - jD2);
                                            }
                                            j3 = jC6;
                                            cicVar = new cic(j3, ciyVar2, cicVar2.b, cicVar2.f, jG, ciaVarK6);
                                            r31 = r30;
                                        } catch (cmj e) {
                                            e = e;
                                        }
                                    } catch (cmj e2) {
                                        e = e2;
                                        i3 = i5;
                                        i4 = i21;
                                    }
                                }
                                cicVarArr[r10] = cicVar;
                                jC6 = j3;
                                cpkVarArr2 = cpkVarArr;
                                r7 = r31;
                                arrayListC = arrayListC;
                                i5 = i3;
                                i21 = i4;
                                r10++;
                                cieVar.e = e;
                            }
                        } catch (cmj e3) {
                            e = e3;
                            i3 = i5;
                            i4 = i21;
                            cpkVarArr = cpkVarArr2;
                            r30 = r7;
                        }
                        z4 = false;
                        cpkVarArr2 = cpkVarArr;
                        i5 = i3;
                        i21 = i4;
                        r7 = r30 + 1;
                    }
                    i2 = i5;
                    chsVar.c.b(chsVar);
                } else {
                    i2 = i5;
                }
                chsVar.i = cioVar9.d(i21).d;
                for (cif cifVar : chsVar.f) {
                    for (dep depVar : chsVar.i) {
                        if (depVar.f().equals(cifVar.a.f())) {
                            cifVar.g(depVar, cioVar9.d && i21 == cioVar9.a() + (-1));
                            break;
                        }
                    }
                }
            } else {
                i2 = i5;
            }
            i5 = i2 + 1;
            z4 = false;
        }
    }

    @Override // defpackage.cno
    public final synchronized bss jF() {
        return this.K;
    }

    @Override // defpackage.cno
    public final void jG() {
        this.H.a();
    }

    @Override // defpackage.cmi
    protected final void jH(bzg bzgVar) {
        this.k = bzgVar;
        cjz cjzVar = this.C;
        cjzVar.e(Looper.myLooper(), r());
        cjzVar.c();
        this.J = this.a.a();
        this.j = new crp("DashMediaSource");
        this.m = bwp.H(null);
        o();
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.cmi
    protected final void jI() {
        this.o = false;
        this.J = null;
        crp crpVar = this.j;
        if (crpVar != null) {
            crpVar.e(null);
            this.j = null;
        }
        K(jF().d);
        this.p = 0L;
        this.q = 0L;
        crw crwVar = this.v;
        if (crwVar != null) {
            chx chxVar = this.i;
            chxVar.getClass();
            crwVar.e(chxVar);
            this.v.a();
            this.v = null;
            this.i = null;
        }
        synchronized (this.c) {
            this.f = agke.q(new cis(this.I));
            this.e.clear();
            this.g = null;
            this.h = null;
        }
        this.k = null;
        this.l = null;
        Handler handler = this.m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.m = null;
        }
        this.r = -9223372036854775807L;
        this.s = 0;
        this.t = -9223372036854775807L;
        this.F.clear();
        aepb aepbVar = this.x;
        aepbVar.c.clear();
        aepbVar.e.clear();
        aepbVar.a.clear();
        aepbVar.d = null;
        this.C.d();
    }

    @Override // defpackage.cmi, defpackage.cno
    public final synchronized void jJ(bss bssVar) {
        this.K = bssVar;
        this.L = bssVar.d;
    }

    @Override // defpackage.cno
    public final void k(cnk cnkVar) {
        chs chsVar = (chs) cnkVar;
        cih cihVar = chsVar.b;
        cihVar.i = true;
        cihVar.c.removeCallbacksAndMessages(null);
        for (cpk cpkVar : chsVar.e) {
            cpkVar.h(chsVar);
        }
        chsVar.c = null;
        chp chpVar = chsVar.d;
        if (chpVar != null) {
            crw crwVar = chsVar.j;
            crwVar.getClass();
            crwVar.e(chpVar);
            chsVar.d = null;
        }
        this.F.remove(chsVar.a);
    }

    public final void m(cjh cjhVar, crr crrVar) {
        bye byeVar = this.J;
        Uri uri = Uri.parse(cjhVar.b);
        byh byhVar = new byh();
        byhVar.a = uri;
        byhVar.j = 1;
        L(new crs(new yvh(byeVar, byhVar.a(), 5, crrVar)), new cse(this, 1), 1);
    }

    public final void n(long j) {
        this.m.postDelayed(this.G, j);
    }

    public final void o() {
        cis cisVarB;
        this.m.removeCallbacks(this.G);
        if (this.j.f()) {
            return;
        }
        if (this.j.g()) {
            this.o = true;
            return;
        }
        synchronized (this.c) {
            cisVarB = b();
        }
        Uri uri = cisVarB.a;
        this.o = false;
        byh byhVar = new byh();
        byhVar.a = uri;
        byhVar.j = 1;
        L(new crs(new yvh(this.J, byhVar.a(), 4, this.D)), this.E, this.b.a(4));
    }

    public final boolean q() {
        crw crwVar = this.v;
        return crwVar != null && crwVar.c;
    }
}
