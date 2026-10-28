package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aavr {
    private static final agrf o = agrf.h("com/google/android/libraries/youtube/player/background/BackgroundTransitioner");
    private final vxz A;
    private final abxu B;
    public final Context a;
    public final abnc b;
    public final abtj c;
    public final abmt d;
    public tyy e;
    public final awmd f;
    public final vyo g;
    public final aunn h;
    public boolean i;
    public boolean j;
    public int k;
    public abvh l;
    public final igp m;
    public final igp n;
    private final awmd p;
    private final abwj q;
    private final Executor r;
    private final awmd s;
    private final abwk t;
    private final abru u;
    private final aunn v;
    private final aceo w;
    private final ServiceConnection x;
    private final awmd y;
    private boolean z;

    public aavr(Context context, awmd awmdVar, abnc abncVar, awmd awmdVar2, awmd awmdVar3, abtj abtjVar, abru abruVar, abwk abwkVar, vyo vyoVar, aunn aunnVar, aunn aunnVar2, abmt abmtVar, abwj abwjVar, abxu abxuVar, aceo aceoVar, vxz vxzVar, Executor executor, awmd awmdVar4) {
        context.getClass();
        this.a = context;
        awmdVar.getClass();
        this.p = awmdVar;
        abncVar.getClass();
        this.b = abncVar;
        this.s = awmdVar2;
        this.f = awmdVar3;
        abtjVar.getClass();
        this.c = abtjVar;
        this.t = abwkVar;
        this.g = vyoVar;
        this.u = abruVar;
        this.h = aunnVar;
        this.v = aunnVar2;
        this.d = abmtVar;
        this.q = abwjVar;
        this.m = new igp(this);
        this.n = new igp(this);
        this.B = abxuVar;
        this.w = aceoVar;
        this.A = vxzVar;
        this.r = executor;
        this.e = new aavp(0);
        this.y = awmdVar4;
        this.k = 1;
        this.i = false;
        this.x = new aavq(this);
        this.z = false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [acey, java.lang.Object] */
    private final wjf k() {
        ?? r0 = this.t.d;
        if ((this.e.a() != null || this.q.b) && r0 != 0) {
            return r0.i();
        }
        return null;
    }

    private final void l(boolean z) {
        if (!(this.d.w() && this.b.t()) && this.c.d()) {
            ((abrt) this.h.io()).d(z);
        }
    }

    private final void m() {
        if (this.A.l(25, 45639979L, false) && this.b.t()) {
            return;
        }
        abmt abmtVar = this.d;
        if (!abmtVar.x() || this.c.d()) {
            if (!this.i) {
                Intent intent = (Intent) this.p.io();
                intent.getClass();
                if ((abmtVar.o.c(40, 45637499L, 0L) & 2) == 0 || Build.VERSION.SDK_INT < 29) {
                    this.a.bindService(intent, this.x, 1);
                } else {
                    this.a.bindService(intent, 1, (Executor) this.B.c, this.x);
                }
                this.i = true;
                if (!abmtVar.aa()) {
                    return;
                }
            }
            if (o() && this.j && this.b.h) {
                g();
                ((abrt) this.h.io()).i(true);
            }
        }
    }

    private final void n() {
        this.k = 2;
        abnc abncVar = this.b;
        abncVar.l(true);
        abncVar.h();
    }

    private final boolean o() {
        boolean z = false;
        if (this.d.w() && this.b.t()) {
            abmw abmwVar = abmw.MEDIASESSION;
        } else {
            boolean zP = p();
            aceo aceoVar = this.w;
            boolean z2 = aceoVar.a != null && aceoVar.a.m();
            if (zP && z2) {
                z = true;
            }
            if (!z) {
                abmw abmwVar2 = abmw.MEDIASESSION;
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [abtj, java.lang.Object] */
    private final boolean p() {
        ?? r0 = ((grj) this.v.io()).a;
        wjf wjfVarK = k();
        int i = this.k;
        if (r0.d()) {
            return aajg.h(wjfVarK) || i == 3;
        }
        return false;
    }

    public final void a() {
        this.k = 1;
        l(false);
        abvh abvhVar = this.l;
        if (abvhVar != null) {
            if (abvhVar.b) {
                abvhVar.c.t(abvhVar.a);
            }
            abvhVar.c.k = null;
        }
    }

    public final void b() {
        if (o()) {
            m();
            boolean zL = this.d.g.l(314, 45740767L, false);
            aunn aunnVar = this.h;
            if (zL) {
                ((abrt) aunnVar.io()).a();
            } else {
                ((abrt) aunnVar.io()).h();
            }
        }
    }

    public final synchronized void c(abna abnaVar, abmy abmyVar) {
        abnc abncVar = this.b;
        abncVar.m(abmyVar);
        abncVar.h = false;
        this.k = 1;
        abncVar.l(false);
        abncVar.d = abnaVar.a;
        if (abnaVar.b) {
            abncVar.o();
        }
    }

    public final void d() {
        abmw abmwVar = abmw.MEDIASESSION;
        if (this.k == 0) {
            throw null;
        }
        if (this.b.h) {
            this.k = 3;
        }
        if (this.d.g.l(257, 45717649L, false)) {
            this.r.execute(afwl.i(new aadm(this, 17)));
        } else {
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r5 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(defpackage.wjf r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            abnc r0 = r4.b     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r0.k     // Catch: java.lang.Throwable -> L6d
            if (r1 != 0) goto L64
            boolean r5 = defpackage.aajg.h(r5)     // Catch: java.lang.Throwable -> L6d
            abmw r1 = defpackage.abmw.MEDIASESSION     // Catch: java.lang.Throwable -> L6d
            int r1 = r4.k     // Catch: java.lang.Throwable -> L6d
            r2 = 3
            r3 = 0
            if (r1 != r2) goto L1d
            if (r5 != 0) goto L19
            r4.a()     // Catch: java.lang.Throwable -> L6d
            goto L66
        L19:
            r4.n()     // Catch: java.lang.Throwable -> L6d
            goto L1f
        L1d:
            if (r5 == 0) goto L66
        L1f:
            boolean r5 = r0.t()     // Catch: java.lang.Throwable -> L6d
            if (r5 != 0) goto L64
            abmt r5 = r4.d     // Catch: java.lang.Throwable -> L6d
            boolean r5 = r5.x()     // Catch: java.lang.Throwable -> L6d
            if (r5 == 0) goto L35
            abtj r5 = r4.c     // Catch: java.lang.Throwable -> L6d
            boolean r5 = r5.d()     // Catch: java.lang.Throwable -> L6d
            if (r5 == 0) goto L64
        L35:
            boolean r5 = r4.z     // Catch: java.lang.Throwable -> L6d
            if (r5 != 0) goto L64
            r5 = 1
            awmd r0 = r4.p     // Catch: java.lang.RuntimeException -> L55 java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.io()     // Catch: java.lang.RuntimeException -> L55 java.lang.Throwable -> L6d
            android.content.Intent r0 = (android.content.Intent) r0     // Catch: java.lang.RuntimeException -> L55 java.lang.Throwable -> L6d
            r0.getClass()     // Catch: java.lang.RuntimeException -> L55 java.lang.Throwable -> L6d
            android.content.Context r1 = r4.a     // Catch: java.lang.RuntimeException -> L55 java.lang.Throwable -> L6d
            java.lang.String r2 = r1.getPackageName()     // Catch: java.lang.RuntimeException -> L55 java.lang.Throwable -> L6d
            r0.setPackage(r2)     // Catch: java.lang.RuntimeException -> L55 java.lang.Throwable -> L6d
            r1.startService(r0)     // Catch: java.lang.RuntimeException -> L55 java.lang.Throwable -> L6d
            r4.z = r5     // Catch: java.lang.RuntimeException -> L55 java.lang.Throwable -> L6d
            monitor-exit(r4)
            goto L6a
        L55:
            abmw r0 = defpackage.abmw.BACKGROUND     // Catch: java.lang.Throwable -> L6d
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "BackgroundTransitioner"
            r5[r3] = r1     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "%s: Failed to start background player Service"
            defpackage.abmx.b(r0, r1, r5)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r4)
            goto L6a
        L64:
            monitor-exit(r4)
            goto L6a
        L66:
            r4.l(r3)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r4)
        L6a:
            return
        L6b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6d
            throw r5
        L6d:
            r5 = move-exception
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aavr.e(wjf):void");
    }

    public final void f() {
        abmt abmtVar = this.d;
        if (abmtVar.w() && this.b.t()) {
            abmw abmwVar = abmw.MEDIASESSION;
            return;
        }
        if (abmtVar.x() && !this.c.d()) {
            abmw abmwVar2 = abmw.MEDIASESSION;
            return;
        }
        m();
        if (p()) {
            return;
        }
        ((abrt) this.h.io()).d(false);
    }

    public final void g() {
        abmw abmwVar = abmw.MEDIASESSION;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                this.a.startForegroundService((Intent) this.p.io());
            } catch (ForegroundServiceStartNotAllowedException e) {
                ((agrc) ((agrc) ((agrc) o.c().i(agso.a, "YTPL.background")).j(e)).k("com/google/android/libraries/youtube/player/background/BackgroundTransitioner", "startForegroundPriorityBackgroundService", (char) 718, "BackgroundTransitioner.java")).w("%s: Failed to start foreground priority player Service due to Android S+ restrictions", "BackgroundTransitioner");
                zvj zvjVarA = zvk.a();
                zvjVarA.j = 21;
                zvjVarA.i = 412;
                zvjVarA.d("Failed to start foreground priority player Service due to Android S+ restrictions");
                zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
                zvjVarA.f(e);
                ((zvl) this.y.io()).a(zvjVarA.a());
                return;
            }
        } else {
            this.a.startForegroundService((Intent) this.p.io());
        }
        if (this.d.v()) {
            this.u.d();
        }
    }

    public final void h() {
        if (this.k == 3) {
            ((agrc) ((agrc) o.c().i(agso.a, "YTPL.background")).k("com/google/android/libraries/youtube/player/background/BackgroundTransitioner", "stop", 520, "BackgroundTransitioner.java")).w("%s: About to stop background service while in a pending state.", "BackgroundTransitioner");
        }
        this.k = 1;
        l(true);
        i();
        this.b.l(false);
        this.j = false;
    }

    public final void i() {
        if (!(this.A.l(25, 45639979L, false) && this.b.t()) && this.i) {
            abmw abmwVar = abmw.MEDIASESSION;
            Context context = this.a;
            context.stopService((Intent) this.p.io());
            context.unbindService(this.x);
            this.i = false;
            this.z = false;
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [acey, java.lang.Object] */
    public final synchronized void j() {
        abnw abnwVar;
        abmw abmwVar = abmw.MEDIASESSION;
        int i = this.k;
        if (i == 0) {
            throw null;
        }
        abnc abncVar = this.b;
        abncVar.h = true;
        if (i - 1 == 0) {
            int i2 = 4;
            if (this.e.a() != null || this.q.b) {
                awmd awmdVar = this.s;
                if (awmdVar.io() != null && (abnwVar = ((abpj) awmdVar.io()).h) != null) {
                    ?? r6 = this.t.d;
                    abnw abnwVar2 = abnw.b;
                    if ((abnwVar.a(abnwVar2) || (abnwVar.a(abnw.d, abnw.e) && r6 != 0 && !r6.am())) && this.c.d()) {
                        if (awmdVar.io() == null || ((abpj) awmdVar.io()).h != abnwVar2) {
                            wjf wjfVarK = k();
                            if (aajg.h(wjfVarK)) {
                                i2 = 2;
                            } else {
                                if (wjfVarK != null && wjfVarK.t() != null) {
                                    aaje.k(wjfVarK.t());
                                }
                                i2 = 3;
                            }
                        } else {
                            i2 = 1;
                        }
                    }
                }
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                this.k = 3;
                this.u.a();
                b();
            } else if (i3 == 1) {
                n();
                this.u.a();
                b();
            } else if (i3 == 3) {
                abncVar.h();
            }
        }
    }
}
