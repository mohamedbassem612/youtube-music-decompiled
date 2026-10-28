package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eyx implements euh, eug {
    private final List a;
    private final axr b;
    private int c;
    private esf d;
    private eug e;
    private List f;
    private boolean g;

    public eyx(List list, axr axrVar) {
        this.b = axrVar;
        gzj.bL(list);
        this.a = list;
        this.c = 0;
    }

    private final void h() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            f(this.d, this.e);
        } else {
            gzj.bM(this.f);
            this.e.e(new ewb("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.euh
    public final Class a() {
        return ((euh) this.a.get(0)).a();
    }

    @Override // defpackage.eug
    public final void b(Object obj) {
        if (obj != null) {
            this.e.b(obj);
        } else {
            h();
        }
    }

    @Override // defpackage.euh
    public final void d() {
        List list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((euh) it.next()).d();
        }
    }

    @Override // defpackage.eug
    public final void e(Exception exc) {
        List list = this.f;
        gzj.bM(list);
        list.add(exc);
        h();
    }

    @Override // defpackage.euh
    public final void f(esf esfVar, eug eugVar) {
        this.d = esfVar;
        this.e = eugVar;
        this.f = (List) this.b.a();
        ((euh) this.a.get(this.c)).f(esfVar, this);
        if (this.g) {
            gI();
        }
    }

    @Override // defpackage.euh
    public final int g() {
        return ((euh) this.a.get(0)).g();
    }

    @Override // defpackage.euh
    public final void gI() {
        this.g = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((euh) it.next()).gI();
        }
    }
}
