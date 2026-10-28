package defpackage;

import android.util.Log;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abdl implements xgn {
    private static final String e = "abdl";
    public final xgn a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public Object d;
    private final Executor f;
    private final agex g;

    public abdl(xgn xgnVar, Executor executor, agex agexVar, Object obj) {
        this.a = xgnVar;
        this.f = executor;
        this.g = agexVar;
        this.d = obj;
    }

    private final void H(Runnable runnable) {
        if (a.x()) {
            this.b.add(runnable);
        } else {
            this.f.execute(new abaq(this, runnable, 4));
        }
    }

    private final void I(Runnable runnable) {
        if (a.x()) {
            this.c.add(runnable);
        } else {
            this.f.execute(new abaq(this, runnable, 6));
        }
    }

    @Override // defpackage.xhz
    public final void A(xgz xgzVar, amdd amddVar) {
        I(new aapc(this, xgzVar, amddVar, 7, (char[]) null));
        F();
    }

    @Override // defpackage.xgn
    public final void B() {
        if (a.x()) {
            E();
        } else {
            this.f.execute(new abbj(this, 5));
        }
    }

    @Override // defpackage.xgn
    public final void C(xgt xgtVar) {
        this.a.C(xgtVar);
    }

    @Override // defpackage.xgn
    public final xgt D(xhc xhcVar, xgu xguVar, ajwo ajwoVar) {
        return this.a.D(xhcVar, xguVar, ajwoVar);
    }

    public final void E() {
        this.b.clear();
        this.c.clear();
        this.a.B();
    }

    public final void F() {
        if (a.x()) {
            G();
        } else {
            Log.e(e, "Tried to perform interaction logging outside of application's main thread");
            this.f.execute(new abbj(this, 4));
        }
    }

    public final void G() {
        if (this.g.a(this.d)) {
            List list = this.b;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            List list2 = this.c;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
            list2.clear();
        }
    }

    @Override // defpackage.xgn
    public final xgt a() {
        return this.a.a();
    }

    @Override // defpackage.xgn
    public final xgt b(xhc xhcVar, ajwo ajwoVar, amdd amddVar) {
        return this.a.b(xhcVar, ajwoVar, amddVar);
    }

    @Override // defpackage.xgn
    public final xgt c(xhc xhcVar, xgu xguVar, ajwo ajwoVar, amdd amddVar, amdd amddVar2) {
        return this.a.c(xhcVar, xguVar, ajwoVar, amddVar, amddVar2);
    }

    @Override // defpackage.xhy
    public final /* bridge */ /* synthetic */ xhz d(xgz xgzVar) {
        H(new abaq(this, xgzVar, 7, null));
        F();
        return this;
    }

    @Override // defpackage.xhy
    public final /* bridge */ /* synthetic */ xhz e(xgz xgzVar, xgz xgzVar2) {
        H(new aapc((Object) this, (Object) xgzVar, (Object) xgzVar2, 4, (byte[]) null));
        F();
        return this;
    }

    @Override // defpackage.xhy
    public final ajwo f(ajwo ajwoVar) {
        return this.a.f(ajwoVar);
    }

    @Override // defpackage.xgn
    public final argn g(Object obj, xhc xhcVar) {
        return this.a.g(obj, xhcVar);
    }

    @Override // defpackage.xgn
    public final argn h(Object obj, xhc xhcVar, int i) {
        return this.a.h(obj, xhcVar, i);
    }

    @Override // defpackage.xhy
    public final String i() {
        return this.a.i();
    }

    @Override // defpackage.xgn
    public final void k(List list) {
        H(new abaq(this, list, 5));
        F();
    }

    @Override // defpackage.xgn
    public final void l(xgz xgzVar) {
        H(new abaq(this, xgzVar, 3, null));
        F();
    }

    @Override // defpackage.xgn
    public final void m(xgz xgzVar, xgz xgzVar2) {
        H(new aapc((Object) this, (Object) xgzVar, (Object) xgzVar2, 3, (byte[]) null));
        F();
    }

    @Override // defpackage.xgn
    public final /* synthetic */ void n(List list) {
        yno.dm();
    }

    @Override // defpackage.xhz
    public final void o(ameb amebVar, xgz xgzVar, amdd amddVar) {
        I(new aasv(this, amebVar, xgzVar, amddVar, 5, null));
        F();
    }

    @Override // defpackage.xhz
    public final void p(xgz xgzVar, amdd amddVar) {
        I(new aapc(this, xgzVar, amddVar, 6, (char[]) null));
        F();
    }

    @Override // defpackage.xhz
    public final void q(xgz xgzVar, atqe atqeVar, amdd amddVar) {
        I(new aasv(this, xgzVar, (aihn) atqeVar, amddVar, 4));
        F();
    }

    @Override // defpackage.xhy
    public final void r(String str) {
        this.a.r(str);
    }

    @Override // defpackage.xhy
    public final void s(xgz xgzVar, String str) {
        this.a.s(xgzVar, str);
    }

    @Override // defpackage.xhy
    public final void t() {
        this.a.t();
    }

    @Override // defpackage.xgn
    public final void u() {
        this.a.u();
    }

    @Override // defpackage.xgn
    public final void v() {
        this.a.v();
    }

    @Override // defpackage.xhz
    public final void w(xgz xgzVar, amdd amddVar) {
        I(new aapc(this, xgzVar, amddVar, 5, (char[]) null));
        F();
    }

    @Override // defpackage.xhz
    public final void x(xgz xgzVar, atqd atqdVar, amdd amddVar) {
        I(new aasv(this, xgzVar, (aihn) atqdVar, amddVar, 2));
        F();
    }

    @Override // defpackage.xgn
    public final void y(MessageLite messageLite, aigj aigjVar, amdd amddVar) {
        I(new aasv(this, messageLite, aigjVar, amddVar, 3));
        F();
    }

    @Override // defpackage.xgn
    public final void z(final Consumer consumer) {
        I(new Runnable() { // from class: abdk
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.z(consumer);
            }
        });
        F();
    }

    @Override // defpackage.xgn
    public final void j(Object obj, xhc xhcVar, int i) {
    }
}
