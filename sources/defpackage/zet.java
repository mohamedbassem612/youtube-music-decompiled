package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zet implements zeo {
    public volatile boolean a;
    public volatile boolean b;
    private final mbc c;
    private final Deque d = new ArrayDeque();
    private final Handler e = new Handler(Looper.getMainLooper());
    private zll f;

    public zet(mbc mbcVar, zjr zjrVar) {
        this.a = zjrVar.cT();
        this.c = mbcVar;
    }

    @Override // defpackage.zeo
    public final void a(ywn ywnVar) {
        if (this.a && this.f == null) {
            s(zen.p, zsf.c);
            b(ywnVar);
        }
    }

    @Override // defpackage.zeo
    public final void b(ywn ywnVar) {
        if (!this.a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            Deque deque = this.d;
            if (deque.isEmpty()) {
                this.b = false;
                return;
            }
            arrayList.add((zem) deque.remove());
            if (arrayList.size() == 6 || deque.isEmpty()) {
                ywnVar.l("dedi", new zes(arrayList).a(ywnVar.a()));
                if (!deque.isEmpty()) {
                    arrayList = new ArrayList();
                }
            }
        }
    }

    @Override // defpackage.zeo
    public final void c(zsf zsfVar) {
        s(zen.l, zsfVar);
    }

    @Override // defpackage.zeo
    public final void d(zsf zsfVar, cbo cboVar) {
        t(zen.r, zsfVar, 0, zlo.NONE, cboVar, null);
    }

    @Override // defpackage.zeo
    public final void e(zsf zsfVar) {
        s(zen.b, zsfVar);
    }

    @Override // defpackage.zeo
    public final void f(zsf zsfVar) {
        s(zen.j, zsfVar);
    }

    @Override // defpackage.zeo
    public final void g(zll zllVar, zsf zsfVar) {
        if (this.a) {
            this.f = zllVar;
            if (zllVar == null) {
                s(zen.d, zsfVar);
            } else {
                s(zen.c, zsfVar);
            }
        }
    }

    @Override // defpackage.zeo
    public final void h(zsf zsfVar) {
        s(zen.a, zsfVar);
    }

    @Override // defpackage.zeo
    public final void i(zlo zloVar, zsf zsfVar) {
        t(zen.e, zsfVar, 0, zloVar, zjy.a(Thread.currentThread().getStackTrace()), null);
    }

    @Override // defpackage.zeo
    public final void j(zsf zsfVar, Surface surface, Exception exc) {
        StringBuilder sb = new StringBuilder();
        if (surface instanceof ctd) {
            sb.append("-placeholder");
        }
        if (exc != null) {
            sb.append("-failed");
        }
        this.e.post(new xhv((Object) this, zsfVar, surface, sb, 8));
    }

    @Override // defpackage.zeo
    public final void k(Surface surface, zsf zsfVar) {
        if (this.a) {
            if (surface == null) {
                t(zen.h, zsfVar, 0, zlo.NONE, zjy.a(Thread.currentThread().getStackTrace()), null);
            } else {
                t(zen.g, zsfVar, System.identityHashCode(surface), zlo.NONE, null, null);
            }
        }
    }

    @Override // defpackage.zeo
    public final void l(Surface surface, Surface surface2, zsf zsfVar) {
        String str;
        if (this.a) {
            if (surface2 != null) {
                t(zen.g, zsfVar, System.identityHashCode(surface2), zlo.NONE, null, null);
                return;
            }
            if (surface == null) {
                str = "oldsur.null";
            } else if (surface.isValid()) {
                str = "oldsur.valid-oldsurhash." + System.identityHashCode(surface);
            } else {
                str = "oldsur.invalid-oldsurhash." + System.identityHashCode(surface);
            }
            t(zen.h, zsfVar, 0, zlo.NONE, a.cl(str, (byte) 45, zjy.a(Thread.currentThread().getStackTrace())), null);
        }
    }

    @Override // defpackage.zeo
    public final void m(zsf zsfVar) {
        s(zen.i, zsfVar);
    }

    @Override // defpackage.zeo
    public final void n(zsf zsfVar) {
        s(zen.k, zsfVar);
    }

    @Override // defpackage.zeo
    public final void o(zsf zsfVar) {
        s(zen.m, zsfVar);
    }

    @Override // defpackage.zeo
    public final void p(zsf zsfVar) {
        s(zen.n, zsfVar);
    }

    @Override // defpackage.zeo
    public final void q(zsf zsfVar) {
        s(zen.o, zsfVar);
    }

    @Override // defpackage.zeo
    public final void r(Surface surface, zsf zsfVar, boolean z, ywn ywnVar) {
        if (this.a) {
            this.e.post(new zeq(this, surface, zsfVar, z, ywnVar, this.c.b(), 0));
        }
    }

    public final void s(zen zenVar, zsf zsfVar) {
        t(zenVar, zsfVar, 0, zlo.NONE, null, null);
    }

    public final void t(zen zenVar, zsf zsfVar, int i, zlo zloVar, Object obj, Long l) {
        zet zetVar;
        if (this.a) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                zej zejVar = new zej(zenVar, l != null ? l.longValue() : this.c.b(), zsfVar, i, zloVar, obj);
                Deque deque = this.d;
                deque.add(zejVar);
                if (deque.size() > 512) {
                    deque.remove();
                }
                zetVar = this;
            } else {
                zetVar = this;
                this.e.post(new zer(zetVar, zsfVar, zenVar, i, zloVar, obj, l, 0));
            }
            zetVar.b = true;
        }
    }

    @Override // defpackage.zeo
    public final boolean u() {
        return this.b;
    }
}
