package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ywy implements ywz {
    public wja d;
    public yvw e;
    public long f;
    public long g;
    public String h;
    public wiu i;
    public yxh j;
    public yxb k;
    public float l;
    public float m;
    public int n;
    public zjd o;
    public zfp p;
    public byte[] q;
    public Integer r;
    public arfb s;
    public yxi t;
    public boolean u;
    public yxe v;
    public zgp w;

    public ywy(ywz ywzVar) {
        this.f = -1L;
        this.g = -1L;
        this.d = ywzVar.h();
        this.e = ywzVar.i();
        this.f = ywzVar.f();
        this.g = ywzVar.e();
        this.h = ywzVar.r();
        this.i = ywzVar.g();
        this.j = ywzVar.l();
        this.k = ywzVar.j();
        this.l = ywzVar.c();
        this.m = ywzVar.b();
        this.n = ywzVar.d();
        this.o = ywzVar.o();
        this.p = ywzVar.n();
        this.q = ywzVar.v();
        this.r = ywzVar.q();
        this.s = ywzVar.p();
        this.t = ywzVar.m();
        this.u = ywzVar.t();
        this.v = ywzVar.k();
        this.w = ywzVar.w();
    }

    public final void A(Float f) {
        this.l = f.floatValue();
    }

    @Override // defpackage.ywz
    public float b() {
        return this.m;
    }

    @Override // defpackage.ywz
    public float c() {
        return this.l;
    }

    @Override // defpackage.ywz
    public final int d() {
        return this.n;
    }

    @Override // defpackage.ywz
    public final long e() {
        return this.g;
    }

    @Override // defpackage.ywz
    public final long f() {
        return this.f;
    }

    @Override // defpackage.ywz
    public final wiu g() {
        return this.i;
    }

    @Override // defpackage.ywz
    public final wja h() {
        return this.d;
    }

    @Override // defpackage.ywz
    public final yvw i() {
        return this.e;
    }

    @Override // defpackage.ywz
    public final yxb j() {
        return this.k;
    }

    @Override // defpackage.ywz
    public final yxe k() {
        return this.v;
    }

    @Override // defpackage.ywz
    public final yxh l() {
        return this.j;
    }

    @Override // defpackage.ywz
    public final yxi m() {
        return this.t;
    }

    @Override // defpackage.ywz
    public final zfp n() {
        return this.p;
    }

    @Override // defpackage.ywz
    public final zjd o() {
        return this.o;
    }

    @Override // defpackage.ywz
    public arfb p() {
        return this.s;
    }

    @Override // defpackage.ywz
    public Integer q() {
        return this.r;
    }

    @Override // defpackage.ywz
    public final String r() {
        return this.h;
    }

    @Override // defpackage.ywz
    public final /* synthetic */ boolean s(int i) {
        return (d() & i) != 0;
    }

    @Override // defpackage.ywz
    public boolean t() {
        return this.u;
    }

    @Override // defpackage.ywz
    public final /* synthetic */ boolean u(long j) {
        yxh yxhVarL = l();
        if (yxhVarL == null) {
            zhr.a(zhq.MLPLAYER, "LoadVideoParams.playerListener = null");
            return false;
        }
        if (h() == null) {
            zhz zhzVar = new zhz("invalid.parameter", 0L, "streamingData.null");
            zhzVar.o();
            yxhVarL.h(zhzVar);
            return false;
        }
        if (i() == null) {
            zhz zhzVar2 = new zhz("invalid.parameter", 0L, "position.null");
            zhzVar2.o();
            yxhVarL.h(zhzVar2);
            return false;
        }
        if (r() == null) {
            zhz zhzVar3 = new zhz("invalid.parameter", 0L, "cpn.null");
            zhzVar3.o();
            yxhVarL.h(zhzVar3);
            return false;
        }
        if (l() == null) {
            zhz zhzVar4 = new zhz("invalid.parameter", 0L, "playerListener.null");
            zhzVar4.o();
            yxhVarL.h(zhzVar4);
            return false;
        }
        if (g() == null) {
            zhz zhzVar5 = new zhz("invalid.parameter", 0L, "playerConfig.null");
            zhzVar5.o();
            yxhVarL.h(zhzVar5);
            return false;
        }
        if (h().D() && (f() != -1 || e() != -1)) {
            yxhVarL.h(new zhz("invalid.parameter", 0L, "c.liveclipparams;minMs." + f() + ";maxMs." + e()));
        }
        boolean z = f() == -1 || e() == -1 || f() < e();
        if (f() != -1 && (f() < 0 || (h().h != 0 && f() >= h().h))) {
            z = false;
        }
        if ((e() != -1 && (e() <= 0 || (h().h != 0 && e() > h().h))) || !z) {
            zhz zhzVar6 = new zhz("invalid.parameter", 0L, "minMs." + f() + ";maxMs." + e() + ";durationMs." + h().h);
            zhzVar6.o();
            yxhVarL.h(zhzVar6);
            return false;
        }
        if ((f() == -1 || i().a == j || i().a >= f()) && (e() == -1 || i().a == j || i().a <= e())) {
            return true;
        }
        zhz zhzVar7 = new zhz("invalid.parameter", 0L, "startMs." + i().a + ";minMs." + f() + ";maxMs." + e());
        zhzVar7.o();
        yxhVarL.h(zhzVar7);
        return false;
    }

    @Override // defpackage.ywz
    public final byte[] v() {
        return this.q;
    }

    @Override // defpackage.ywz
    public final zgp w() {
        return this.w;
    }

    public final void x(wja wjaVar, yvw yvwVar, long j, long j2, String str, wiu wiuVar, yxh yxhVar, yxb yxbVar, float f, float f2, int i, zjd zjdVar, zfp zfpVar, byte[] bArr, Integer num, arfb arfbVar, yxi yxiVar, boolean z, yxe yxeVar, zgp zgpVar) {
        this.d = wjaVar;
        this.e = yvwVar;
        this.f = j;
        this.g = j2;
        this.h = str;
        this.i = wiuVar;
        this.j = yxhVar;
        this.k = yxbVar;
        this.l = f;
        this.m = f2;
        this.n = i;
        this.o = zjdVar;
        this.p = zfpVar;
        this.q = bArr;
        this.r = num;
        this.s = arfbVar;
        this.t = yxiVar;
        this.u = z;
        this.v = yxeVar;
        this.w = zgpVar;
    }

    public final void y(Integer num) {
        int i = this.n;
        num.intValue();
        this.n = i | 2;
    }

    public final void z(Float f) {
        this.m = f.floatValue();
    }

    public ywy() {
        this.f = -1L;
        this.g = -1L;
    }
}
