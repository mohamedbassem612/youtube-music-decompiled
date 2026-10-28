package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class xkd {
    final List a;
    final List b;
    public final mbc c;
    public final awmd d;
    public final vyo e;
    public final tqj f;
    private final agfr g;
    private final awmd h;
    private final tbt i;
    private final Map j;
    private final boolean k;

    public xkd(tbt tbtVar, mbc mbcVar, agfr agfrVar, awmd awmdVar, awmd awmdVar2, vyo vyoVar, tqj tqjVar, boolean z) {
        tbtVar.getClass();
        this.i = tbtVar;
        this.g = agfrVar;
        this.h = awmdVar;
        awmdVar2.getClass();
        this.d = awmdVar2;
        vyoVar.getClass();
        this.e = vyoVar;
        mbcVar.getClass();
        this.c = mbcVar;
        this.f = tqjVar;
        this.k = !z;
        this.j = new HashMap();
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    private final xjy g(Class cls) {
        Map map = this.j;
        xjy xjyVar = (xjy) map.get(cls);
        if (xjyVar != null) {
            return xjyVar;
        }
        xjy xjyVar2 = new xjy(this);
        this.i.a(this, cls, xjyVar2);
        map.put(cls, xjyVar2);
        return xjyVar2;
    }

    public final void a(Class cls, xju xjuVar) {
        g(cls).d.add(new xjz(this, xjuVar));
    }

    public final void b(Class cls, String str) {
        g(cls).b.add(new xkb(this, str));
    }

    public final void c(Class cls, xjv xjvVar) {
        g(cls).c.add(new xkc(this, xjvVar));
    }

    public final synchronized void d() {
        if (this.k) {
            List<xjm> list = this.b;
            for (xjm xjmVar : list) {
                if (!xjmVar.g()) {
                    gdg gdgVar = (gdg) this.g.io();
                    gdk gdkVarB = xjmVar.b();
                    if (gdgVar.g) {
                        gdgVar.b.execute(new br(gdgVar, gdkVarB, 15, (byte[]) null));
                    } else {
                        gdgVar.c.offer(gdkVarB);
                    }
                }
            }
            list.clear();
        }
    }

    public final tfq e() {
        return (tfq) this.h.io();
    }

    public final xka f(Class cls, Class cls2, xjn xjnVar) {
        xka xkaVar = new xka(this, xjnVar, cls2);
        g(cls).a.add(xkaVar);
        return xkaVar;
    }
}
