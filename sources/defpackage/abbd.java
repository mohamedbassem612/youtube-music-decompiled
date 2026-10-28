package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abbd {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/features/gl/GlScene");
    private volatile boolean A;
    private volatile float B;
    private volatile float C;
    public final abdh b;
    public final abbe c;
    public abap d;
    public abak e;
    public abbu f;
    public abbp g;
    public abbs h;
    public zlp i;
    public Handler j;
    public boolean k;
    public volatile boolean l;
    public volatile int m;
    public volatile int n;
    public yib o;
    public wiz p;
    public boolean q;
    public int r;
    public final ahud s;
    private final Context t;
    private final awmd u;
    private final Handler v;
    private final abmt w;
    private volatile boolean x;
    private volatile int y;
    private volatile boolean z;

    public abbd(Context context, tbt tbtVar, abnc abncVar, awmd awmdVar, ahud ahudVar, abmt abmtVar) {
        Handler handler = new Handler(context.getMainLooper());
        new ArrayList();
        this.o = yib.c;
        this.p = wiz.e;
        this.r = 1;
        context.getClass();
        this.t = context;
        tbtVar.getClass();
        this.v = handler;
        abncVar.getClass();
        awmdVar.getClass();
        this.u = awmdVar;
        ahudVar.getClass();
        this.s = ahudVar;
        abmtVar.getClass();
        this.w = abmtVar;
        this.b = new abdh(context);
        this.c = new abbe(context);
    }

    public static int k(abak abakVar, abbu abbuVar) {
        if (abakVar == null) {
            return abbuVar != null ? 2 : 1;
        }
        return abbuVar == null ? 3 : 4;
    }

    private final void m() {
        if (n()) {
            this.d.d();
            f();
        }
    }

    private final boolean n() {
        return (this.e == null || this.d == null) ? false : true;
    }

    private static final void o(wjf wjfVar) {
        wjfVar.F();
        wjfVar.B();
    }

    public final View a(Context context, Handler handler, boolean z) {
        int i;
        abap abaoVar = (Objects.equals(this.t.getPackageName(), "com.google.android.apps.youtube.unplugged") || this.w.g.m(31, 45379969L)) ? new abao(context) : new abal(context);
        this.d = abaoVar;
        abaoVar.j();
        this.d.i();
        try {
            this.c.d(z);
        } catch (abbx e) {
            l(e);
        }
        int i2 = 8;
        if (z && this.c.a() == yia.a) {
            i = 2;
            i2 = 10;
        } else {
            i = 8;
        }
        this.d.h(i2, i2, i2, i);
        this.d.e(this.c);
        abak abakVar = this.e;
        if (abakVar != null) {
            abakVar.onRendererShutdown();
        }
        abak abakVar2 = (abak) this.u.io();
        this.e = abakVar2;
        if (!abakVar2.e) {
            abakVar2.g = this;
            abakVar2.f = this;
        }
        this.j = handler;
        try {
            this.d.f(this.e);
        } catch (Exception e2) {
            l(new abbx(e2.getMessage()));
        }
        if (this.k) {
            m();
        }
        return this.d.b();
    }

    final abce b() {
        abcd abcdVar = abcd.c;
        if (this.z) {
            boolean z = this.l;
            if (Math.min(this.m, this.n) <= this.y && this.B > 0.0f) {
                abcdVar = this.x ? abcd.b : abcd.a;
            }
        } else if (this.A) {
            boolean z2 = this.l;
        }
        return new abce(abcdVar, this.B, this.C);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    public final void c(aazj aazjVar) {
        boolean z;
        Handler handler;
        abob abobVar = aazjVar.a;
        wiz wizVar = this.p;
        if (abobVar.h()) {
            wjf wjfVar = aazjVar.c;
            wja wjaVarG = wjfVar != null ? wjfVar.g() : null;
            if (wjaVarG == null) {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/player/features/gl/GlScene", "handleVideoStageEventInternal", 732, "GlScene.java")).t("Could not retrieve VideoStreamingData for the Ad - unable to determine video type; falling back to 2D.");
                this.p = wiz.a;
            } else {
                this.p = wjaVarG.g();
                o(wjfVar);
            }
        } else {
            wjf wjfVar2 = aazjVar.b;
            if (wjfVar2 != null) {
                wiu wiuVarF = wjfVar2.f();
                this.p = wjfVar2.g() != null ? wjfVar2.g().g() : wiz.e;
                this.q = wiuVarF.aF();
                o(wjfVar2);
                aoqd aoqdVar = wiuVarF.d;
                if ((aoqdVar.b & Integer.MIN_VALUE) != 0) {
                    argy argyVar = aoqdVar.u;
                    if (argyVar == null) {
                        argyVar = argy.a;
                    }
                    boolean z2 = argyVar.b;
                }
                if ((aoqdVar.b & Integer.MIN_VALUE) != 0) {
                    argy argyVar2 = aoqdVar.u;
                    if (argyVar2 == null) {
                        argyVar2 = argy.a;
                    }
                    boolean z3 = argyVar2.c;
                }
                if (this.e != null && (aoqdVar.b & Integer.MIN_VALUE) != 0) {
                    argy argyVar3 = aoqdVar.u;
                    if (argyVar3 == null) {
                        argyVar3 = argy.a;
                    }
                    boolean z4 = argyVar3.e;
                }
                akwm akwmVar = aoqdVar.f;
                if (akwmVar == null) {
                    akwmVar = akwm.b;
                }
                this.y = akwmVar.ah;
                this.z = wiuVarF.ao(this.p);
                akwm akwmVar2 = aoqdVar.f;
                if (akwmVar2 == null) {
                    akwmVar2 = akwm.b;
                }
                int iBt = a.bt(akwmVar2.ai);
                if (iBt == 0 || iBt != 6) {
                    akwm akwmVar3 = aoqdVar.f;
                    if (akwmVar3 == null) {
                        akwmVar3 = akwm.b;
                    }
                    int iBt2 = a.bt(akwmVar3.ai);
                    if (iBt2 == 0 || iBt2 != 3) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                }
                this.A = z;
                akwm akwmVar4 = aoqdVar.f;
                if (akwmVar4 == null) {
                    akwmVar4 = akwm.b;
                }
                this.B = akwmVar4.aj;
                akwm akwmVar5 = aoqdVar.f;
                if (akwmVar5 == null) {
                    akwmVar5 = akwm.b;
                }
                this.C = akwmVar5.ak;
                i(b());
            } else {
                this.p = wiz.e;
            }
        }
        h(this.p, this.q);
        wiz wizVar2 = this.p;
        if (wizVar != wizVar2 && (handler = this.j) != null) {
            handler.obtainMessage(3, wizVar2.ordinal(), 0).sendToTarget();
        }
        if (this.e == null || !abobVar.a(abob.f, abob.i)) {
            return;
        }
        abak abakVar = this.e;
        abbo abboVar = abakVar.a;
        abboVar.s = abboVar.a.a();
        abboVar.d();
        abakVar.d = true;
    }

    public final void d() {
        if (n()) {
            this.d.c();
        }
        this.k = false;
    }

    public final void e() {
        m();
        this.k = true;
    }

    public final void f() {
        if (n()) {
            boolean z = this.l;
            boolean z2 = this.l;
            boolean z3 = this.l;
            if (n()) {
                this.d.k();
                this.d.b().setClickable(false);
            }
            g(new abbj(this, 1));
            i(b());
            Handler handler = this.j;
            boolean z4 = this.l;
            handler.obtainMessage(2, 0, 0).sendToTarget();
        }
    }

    public final void g(Runnable runnable) {
        abak abakVar = this.e;
        if (abakVar != null) {
            abakVar.b.add(runnable);
        }
    }

    public final void h(wiz wizVar, boolean z) {
        if (!n() || this.f == null) {
            return;
        }
        g(new hff(this, wizVar, z, 7, null));
    }

    @tcc
    void handleVideoStageEvent(aazj aazjVar) {
        afvn afvnVarB = aawb.b(aazjVar, "GS");
        try {
            c(aazjVar);
            afvnVarB.close();
        } catch (Throwable th) {
            try {
                afvnVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @tcc
    public void handleYouTubePlayerStateEvent(aazn aaznVar) {
        this.x = aaznVar.b();
        i(b());
    }

    public final void i(abce abceVar) {
        g(new abaq(this, abceVar, 0));
    }

    public final boolean j() {
        boolean z = this.l;
        return !this.p.a();
    }

    public final void l(abbx abbxVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(abbxVar.getMessage());
        sb.append('\n');
        for (StackTraceElement stackTraceElement : abbxVar.getStackTrace()) {
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/player/features/gl/GlScene", "notifyGlError", 1052, "GlScene.java")).w("%s", sb);
        this.v.post(new abaq(this, abbxVar, 2));
    }
}
