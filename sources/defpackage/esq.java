package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class esq implements ComponentCallbacks2, fcz {
    private static final fec e;
    protected final erj a;
    protected final Context b;
    public final fcy c;
    public final CopyOnWriteArrayList d;
    private final fdh f;
    private final fdg g;
    private final fdm h;
    private final Runnable i;
    private final fcs j;
    private fec k;

    static {
        fec fecVarA = fec.a(Bitmap.class);
        fecVarA.T();
        e = fecVarA;
        fec.a(fce.class).T();
    }

    public esq(erj erjVar, fcy fcyVar, fdg fdgVar, Context context) {
        fdh fdhVar = new fdh();
        gzj gzjVar = erjVar.j;
        this.h = new fdm();
        px pxVar = new px(this, 14, null);
        this.i = pxVar;
        this.a = erjVar;
        this.c = fcyVar;
        this.g = fdgVar;
        this.f = fdhVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        fcs fctVar = avg.c(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new fct(applicationContext, new esp(this, fdhVar)) : new fdc();
        this.j = fctVar;
        synchronized (erjVar.d) {
            if (erjVar.d.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            erjVar.d.add(this);
        }
        char[] cArr = ffs.a;
        if (a.x()) {
            fcyVar.a(this);
        } else {
            ffs.d().post(pxVar);
        }
        fcyVar.a(fctVar);
        this.d = new CopyOnWriteArrayList(erjVar.b.b);
        p(erjVar.b.a());
    }

    private final synchronized void t() {
        Set set = this.h.a;
        Iterator it = ffs.e(set).iterator();
        while (it.hasNext()) {
            j((fem) it.next());
        }
        set.clear();
    }

    private final synchronized void u(fec fecVar) {
        this.k = (fec) this.k.l(fecVar);
    }

    public esn a(Class cls) {
        return new esn(this.a, this, cls, this.b);
    }

    public esn b() {
        return a(Bitmap.class).l(e);
    }

    public esn c() {
        return a(Drawable.class);
    }

    public esn d(Drawable drawable) {
        return c().e(drawable);
    }

    public esn e(Integer num) {
        return c().g(num);
    }

    public esn f(Object obj) {
        return c().h(obj);
    }

    public esn g(byte[] bArr) {
        return c().i(bArr);
    }

    final synchronized fec h() {
        return this.k;
    }

    public final void i(View view) {
        j(new eso(view));
    }

    public final void j(fem femVar) {
        if (femVar != null) {
            boolean zR = r(femVar);
            fdx fdxVarD = femVar.d();
            if (zR) {
                return;
            }
            List list = this.a.d;
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((esq) it.next()).r(femVar)) {
                    }
                }
                if (fdxVarD != null) {
                    femVar.f(null);
                    fdxVarD.c();
                }
            }
        }
    }

    @Override // defpackage.fcz
    public final synchronized void k() {
        this.h.k();
        t();
        fdh fdhVar = this.f;
        Iterator it = ffs.e(fdhVar.a).iterator();
        while (it.hasNext()) {
            fdhVar.a((fdx) it.next());
        }
        fdhVar.b.clear();
        fcy fcyVar = this.c;
        fcyVar.b(this);
        fcyVar.b(this.j);
        ffs.d().removeCallbacks(this.i);
        List list = this.a.d;
        synchronized (list) {
            try {
                if (!list.contains(this)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                list.remove(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.fcz
    public final synchronized void l() {
        o();
        this.h.l();
    }

    @Override // defpackage.fcz
    public final synchronized void m() {
        this.h.m();
        n();
    }

    public final synchronized void n() {
        fdh fdhVar = this.f;
        fdhVar.c = true;
        for (fdx fdxVar : ffs.e(fdhVar.a)) {
            if (fdxVar.n()) {
                fdxVar.f();
                fdhVar.b.add(fdxVar);
            }
        }
    }

    public final synchronized void o() {
        fdh fdhVar = this.f;
        fdhVar.c = false;
        for (fdx fdxVar : ffs.e(fdhVar.a)) {
            if (!fdxVar.l() && !fdxVar.n()) {
                fdxVar.b();
            }
        }
        fdhVar.b.clear();
    }

    protected synchronized void p(fec fecVar) {
        this.k = (fec) ((fec) fecVar.clone()).r();
    }

    final synchronized void q(fem femVar, fdx fdxVar) {
        this.h.a.add(femVar);
        fdh fdhVar = this.f;
        fdhVar.a.add(fdxVar);
        if (!fdhVar.c) {
            fdxVar.b();
        } else {
            fdxVar.c();
            fdhVar.b.add(fdxVar);
        }
    }

    final synchronized boolean r(fem femVar) {
        fdx fdxVarD = femVar.d();
        if (fdxVarD == null) {
            return true;
        }
        if (!this.f.a(fdxVarD)) {
            return false;
        }
        this.h.a.remove(femVar);
        femVar.f(null);
        return true;
    }

    public synchronized void s(fec fecVar) {
        u(fecVar);
    }

    public final synchronized String toString() {
        fdg fdgVar;
        fdh fdhVar;
        fdgVar = this.g;
        fdhVar = this.f;
        return super.toString() + "{tracker=" + String.valueOf(fdhVar) + ", treeNode=" + String.valueOf(fdgVar) + '}';
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
