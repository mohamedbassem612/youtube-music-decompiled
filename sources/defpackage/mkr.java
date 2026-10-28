package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mkr {
    public List b;
    public List c;
    public List d;
    public List e;
    public List f;
    public List g;
    public List h;
    public List i;
    public List j;
    public List k;
    public List l;
    public List m;
    public List n;
    public List o;
    public WeakReference a = new WeakReference(null);
    public Integer p = null;
    public nxg q = null;

    final void a(MotionEvent motionEvent) {
        List list = this.h;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ntj) it.next()).a((View) this.a.get(), new nxg(motionEvent.getX(), motionEvent.getY()));
            }
        }
    }

    final void b(MotionEvent motionEvent) {
        List list = this.e;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ntl) it.next()).a((View) this.a.get(), new nxg(motionEvent.getX(), motionEvent.getY()), motionEvent);
            }
        }
    }

    final boolean c() {
        return this.f != null;
    }

    final boolean d() {
        return this.i != null;
    }

    final boolean e() {
        return j() || c() || f() || i() || d() || h() || g();
    }

    final boolean f() {
        return this.h != null;
    }

    final boolean g() {
        return this.n != null;
    }

    final boolean h() {
        return this.l != null;
    }

    final boolean i() {
        return this.k != null;
    }

    final boolean j() {
        return this.e != null;
    }

    final boolean k() {
        return (this.b == null && this.c == null && this.d == null && this.g == null && this.j == null) ? false : true;
    }

    final boolean l(boolean z) {
        return z && (j() || f()) && d();
    }
}
