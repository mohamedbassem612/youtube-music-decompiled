package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xun implements xzf {
    static final String a = wfs.g(568, "cast_icon_awareness_entity");
    public static final Duration b = Duration.ofSeconds(1);
    public final xql d;
    public final aerv e;
    public final mbc f;
    public final avlh g;
    public volatile xum h;
    public final awku i;
    public xuo j;
    public final AtomicReference k;
    public final vxz l;
    private final wbz p;
    private final zwb q;
    private final awmd r;
    private final awku s;
    private int t;
    private final ycp u;
    private yea v;
    public final awku c = new awku();
    private final awku m = new awku();
    private final avmr n = new avmr();
    private final avmr o = new avmr();

    public xun(xql xqlVar, ycp ycpVar, wbz wbzVar, zwb zwbVar, vxz vxzVar, aerv aervVar, mbc mbcVar, awmd awmdVar) {
        awku awkuVarAC = awku.aC(Boolean.FALSE);
        this.s = awkuVarAC;
        this.g = awkuVarAC.p();
        this.t = 0;
        this.h = new xum(ajpb.CAST_ICON_AWARENESS_STATE_UNSPECIFIED, 2, false);
        this.i = awku.aC(this.h);
        this.j = xuo.a;
        this.k = new AtomicReference(Optional.empty());
        this.d = xqlVar;
        this.u = ycpVar;
        this.p = wbzVar;
        this.q = zwbVar;
        this.l = vxzVar;
        this.e = aervVar;
        this.f = mbcVar;
        this.r = awmdVar;
    }

    public final synchronized void a() {
        avlh avlhVarG;
        int i = 1;
        if (this.t == 0) {
            ycp ycpVar = this.u;
            ycpVar.a(this);
            avmr avmrVar = this.n;
            vxz vxzVar = this.l;
            int i2 = 0;
            avlh avlhVarP = vxzVar.l(164, 45673420L, false) ? this.d.i.H(new ugm(this, 18)).p() : avlh.G(Boolean.FALSE);
            if (vxzVar.l(164, 45673420L, false)) {
                avlhVarG = this.p.e(this.q.e()).k(a).g(avla.e).y(new ugm(this, 17));
            } else {
                avlhVarG = avlh.G(ajpb.CAST_ICON_AWARENESS_STATE_UNSPECIFIED);
            }
            awku awkuVar = this.m;
            avmrVar.a(avlh.g(avlhVarP, avlhVarG, awkuVar, new acny(i)).al(new xul(this, i2), new xuk(i2)));
            awkuVar.kk(Integer.valueOf(ycpVar.b));
            if (vxzVar.l(211, 45759129L, false)) {
                this.o.a(avlh.f(this.i.H(new xdx(5)), vxzVar.l(211, 45759129L, false) ? this.d.i.H(new xdx(4)).p() : avlh.G(Boolean.FALSE), new jnx(14)).p().al(new xul(this.s, i), new xuk(i2)));
            } else if (vxzVar.l(210, 45758238L, false)) {
                yea yeaVar = (yea) this.r.io();
                this.v = yeaVar;
                yeaVar.a();
                this.o.a(avlh.f(this.i.H(new xdx(6)), yeaVar.b.H(new xdx(7)), new jnx(15)).p().al(new xul(this.s, i), new xuk(i2)));
            }
        }
        this.t++;
    }

    public final synchronized void b() {
        int i = this.t;
        if (i != 0) {
            int i2 = i - 1;
            this.t = i2;
            if (i2 == 0) {
                this.n.a(null);
                this.o.a(null);
                yea yeaVar = this.v;
                if (yeaVar != null) {
                    yeaVar.b();
                    this.v = null;
                }
                this.u.d(this);
            }
        }
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
        this.m.kk(Integer.valueOf(xzcVar.b()));
    }

    @Override // defpackage.xzf
    public final void h(xzc xzcVar) {
        this.m.kk(Integer.valueOf(xzcVar.b()));
    }

    @Override // defpackage.xzf
    public final void jv(xzc xzcVar) {
        this.m.kk(Integer.valueOf(xzcVar.b()));
    }
}
