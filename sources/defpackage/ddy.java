package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ddy implements ddr {
    private final dep a;
    private long f;
    private String h;
    private cwj i;
    private ddx j;
    private boolean k;
    private boolean l;
    private bse m;
    private boolean p;
    private final String b = "video/mp2t";
    private final boolean[] g = new boolean[3];
    private final deg c = new deg(7);
    private final deg d = new deg(8);
    private final deg e = new deg(6);
    private long o = -9223372036854775807L;
    private int n = -1;
    private final bwb q = new bwb();

    public ddy(dep depVar) {
        this.a = depVar;
    }

    private final void g() {
        this.i.getClass();
        int i = bwp.a;
    }

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
    private final void h(long j, int i, int i2, long j2) {
        int i3;
        boolean z = true;
        if (this.m != null) {
            boolean z2 = this.j.b;
        } else {
            deg degVar = this.c;
            degVar.d(i2);
            deg degVar2 = this.d;
            degVar2.d(i2);
            if (this.m == null) {
                if (degVar.a && degVar2.a) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(degVar.b, degVar.c));
                    arrayList.add(Arrays.copyOf(degVar2.b, degVar2.c));
                    bxe bxeVarG = bxf.g(degVar.b, 4, degVar.c);
                    amp ampVarL = bxf.l(degVar2.b, degVar2.c);
                    String strF = bvf.f(bxeVarG.a, bxeVarG.b, bxeVarG.c);
                    bsd bsdVar = new bsd();
                    bsdVar.a = this.h;
                    bsdVar.a(this.b);
                    bsdVar.e("video/avc");
                    bsdVar.k = strF;
                    bsdVar.u = bxeVarG.e;
                    bsdVar.v = bxeVarG.f;
                    bsdVar.E = new bru(bxeVarG.j, bxeVarG.k, bxeVarG.l, null, bxeVarG.h + 8, bxeVarG.i + 8);
                    bsdVar.B = bxeVarG.g;
                    bsdVar.r = arrayList;
                    int i4 = bxeVarG.m;
                    bsdVar.q = i4;
                    bsdVar.D = this.n;
                    this.m = new bse(bsdVar);
                    this.l = true;
                    this.a.e(i4);
                    this.j.a(bxeVarG);
                    this.j.c(ampVarL);
                    degVar.b();
                    degVar2.b();
                }
            } else if (degVar.a) {
                bxe bxeVarG2 = bxf.g(degVar.b, 4, degVar.c);
                this.a.e(bxeVarG2.m);
                this.j.a(bxeVarG2);
                degVar.b();
            } else if (degVar2.a) {
                this.j.c(bxf.l(degVar2.b, degVar2.c));
                degVar2.b();
            }
        }
        deg degVar3 = this.e;
        if (degVar3.d(i2)) {
            int iE = bxf.e(degVar3.b, degVar3.c);
            int iD = bxf.d(degVar3.b, 4, iE);
            if (iD != -1 && iD != (i3 = this.n) && (iD != 0 || i3 != -1)) {
                this.n = iD;
                bse bseVar = this.m;
                if (bseVar != null) {
                    bsd bsdVar2 = new bsd(bseVar);
                    bsdVar2.D = iD;
                    this.m = new bse(bsdVar2);
                    this.l = true;
                }
            }
            bwb bwbVar = this.q;
            bwbVar.N(degVar3.b, iE);
            bwbVar.P(4);
            this.a.b(j2, bwbVar);
        }
        ddx ddxVar = this.j;
        boolean z3 = this.k;
        if (ddxVar.d == 9) {
            if (z3 && ddxVar.h) {
                long j3 = ddxVar.e;
                int i5 = i + ((int) (j - j3));
                long j4 = ddxVar.j;
                if (j4 != -9223372036854775807L) {
                    long j5 = ddxVar.i;
                    if (j3 != j5) {
                        ddxVar.a.e(j4, ddxVar.k ? 1 : 0, (int) (j3 - j5), i5, null);
                    }
                }
            }
            ddxVar.i = ddxVar.e;
            ddxVar.j = ddxVar.g;
            ddxVar.k = false;
            ddxVar.h = true;
        }
        boolean z4 = ddxVar.l;
        boolean z5 = ddxVar.k;
        int i6 = ddxVar.d;
        if (i6 != 5 && (!z4 || i6 != 1)) {
            z = false;
        }
        boolean z6 = z5 | z;
        ddxVar.k = z6;
        ddxVar.d = 24;
        if (z6) {
            this.p = false;
        }
    }

    private final void i(byte[] bArr, int i, int i2) {
        if (this.m != null) {
            boolean z = this.j.b;
        } else {
            this.c.a(bArr, i, i2);
            this.d.a(bArr, i, i2);
        }
        this.e.a(bArr, i, i2);
        boolean z2 = this.j.f;
    }

    private final void j(long j, int i, long j2) {
        if (this.l && i > 0 && i <= 5) {
            cwj cwjVar = this.i;
            bse bseVar = this.m;
            bseVar.getClass();
            cwjVar.b(bseVar);
            this.k = true;
            this.l = false;
        }
        if (this.m != null) {
            boolean z = this.j.b;
        } else {
            this.c.c(i);
            this.d.c(i);
        }
        this.e.c(i);
        ddx ddxVar = this.j;
        boolean z2 = this.p;
        ddxVar.d = i;
        ddxVar.g = j2;
        ddxVar.e = j;
        ddxVar.l = z2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    @Override // defpackage.ddr
    public final void a(bwb bwbVar) {
        int i;
        int i2;
        g();
        int i3 = bwbVar.c;
        int i4 = bwbVar.d;
        byte[] bArr = bwbVar.b;
        this.f += (long) bwbVar.d();
        this.i.c(bwbVar, bwbVar.d());
        while (true) {
            int iB = bxf.b(bArr, i3, i4, this.g);
            if (iB == i4) {
                i(bArr, i3, i4);
                return;
            }
            int i5 = bArr[iB + 3] & 31;
            if (iB > 0) {
                int i6 = iB - 1;
                if (bArr[i6] == 0) {
                    i2 = 4;
                    i = i6;
                } else {
                    i = iB;
                    i2 = 3;
                }
            } else {
                i = iB;
                i2 = 3;
            }
            int i7 = i - i3;
            if (i7 > 0) {
                i(bArr, i3, i);
            }
            int i8 = i4 - i;
            long j = this.f - ((long) i8);
            h(j, i8, i7 < 0 ? -i7 : 0, this.o);
            j(j, i5, this.o);
            i3 = i + i2;
        }
    }

    @Override // defpackage.ddr
    public final void b(cvk cvkVar, dev devVar) {
        devVar.c();
        this.h = devVar.b();
        this.i = cvkVar.s(devVar.a(), 2);
        this.j = new ddx(this.i);
        this.a.c(cvkVar, devVar);
    }

    @Override // defpackage.ddr
    public final void c() {
        g();
        this.a.d();
        h(this.f, 0, 0, this.o);
        if (!this.k && this.l) {
            cwj cwjVar = this.i;
            bse bseVar = this.m;
            bseVar.getClass();
            cwjVar.b(bseVar);
            this.k = true;
            this.l = false;
        }
        j(this.f, 9, this.o);
        h(this.f, 0, 0, this.o);
    }

    @Override // defpackage.ddr
    public final void e(long j, int i) {
        this.o = j;
        this.p |= (i & 2) != 0;
    }

    @Override // defpackage.ddr
    public final void f() {
        this.f = 0L;
        this.p = false;
        this.o = -9223372036854775807L;
        bxf.i(this.g);
        this.c.b();
        this.d.b();
        this.e.b();
        this.a.a();
        ddx ddxVar = this.j;
        if (ddxVar != null) {
            ddxVar.b();
        }
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void d() {
    }
}
