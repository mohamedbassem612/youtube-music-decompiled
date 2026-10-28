package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yay extends ycj {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/remote/internal/DialSession");
    private final xla H;
    private volatile HandlerThread I;
    private boolean J;
    private boolean K;
    private long L;
    private final long M;
    private final xpl N;
    private final afwv O;
    private final qcb P;
    public final SharedPreferences b;
    public final xoh c;
    public final xns d;
    public final xwj e;
    public final xnv f;
    public final mbc g;
    public final String h;
    volatile Handler i;
    public Uri j;
    public volatile xvn k;
    public volatile xog l;
    public final AtomicBoolean m;
    public final long n;
    public long o;
    public int p;
    public final xwo q;

    public yay(xvn xvnVar, qcb qcbVar, Context context, ycp ycpVar, ycp ycpVar2, ttm ttmVar, SharedPreferences sharedPreferences, xoh xohVar, xns xnsVar, xwj xwjVar, xwo xwoVar, xnv xnvVar, wjr wjrVar, int i, String str, afwv afwvVar, xla xlaVar, amyv amyvVar, xpl xplVar, String str2, vxz vxzVar, mbc mbcVar) {
        Optional optionalOfNullable = Optional.ofNullable(str2);
        xzd xzdVarCS = yno.cS(str);
        xzdVarCS.k(3);
        xzdVarCS.i(xvnVar.c);
        xzdVarCS.f(xqz.f(xvnVar));
        xzdVarCS.g(i);
        xzdVarCS.e(amyvVar);
        xyg xygVar = new xyg();
        xygVar.b(xvnVar.n);
        xzdVarCS.c(xygVar.a());
        super(context, ycpVar, ycpVar2, wjrVar, ttmVar, xlaVar, amyvVar, optionalOfNullable, vxzVar, xzdVarCS.a());
        this.m = new AtomicBoolean(false);
        this.k = xvnVar;
        this.P = qcbVar;
        this.b = sharedPreferences;
        this.c = xohVar;
        this.d = xnsVar;
        this.e = xwjVar;
        this.q = xwoVar;
        this.f = xnvVar;
        this.h = "m";
        this.N = xplVar;
        this.H = xlaVar;
        this.O = afwvVar;
        this.g = mbcVar;
        this.n = xlaVar.D() > 0 ? xlaVar.D() : 5000L;
        this.M = xlaVar.C() > 0 ? xlaVar.C() : 30000L;
        aihf aihfVarCreateBuilder = amja.a.createBuilder();
        String str3 = xvnVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        amja amjaVar = (amja) aihfVarCreateBuilder.instance;
        str3.getClass();
        amjaVar.b |= 1;
        amjaVar.c = str3;
        String str4 = xvnVar.f;
        if (str4 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            amja amjaVar2 = (amja) aihfVarCreateBuilder.instance;
            amjaVar2.b |= 2;
            amjaVar2.d = str4;
            String str5 = xvnVar.g;
            if (str5 != null) {
                aihfVarCreateBuilder.copyOnWrite();
                amja amjaVar3 = (amja) aihfVarCreateBuilder.instance;
                amjaVar3.b |= 8;
                amjaVar3.f = str5;
            }
        }
        String str6 = xvnVar.e;
        if (str6 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            amja amjaVar4 = (amja) aihfVarCreateBuilder.instance;
            amjaVar4.b |= 4;
            amjaVar4.e = str6;
        }
        aihf aihfVarCreateBuilder2 = amiz.a.createBuilder();
        amja amjaVar5 = (amja) aihfVarCreateBuilder.build();
        aihfVarCreateBuilder2.copyOnWrite();
        amiz amizVar = (amiz) aihfVarCreateBuilder2.instance;
        amjaVar5.getClass();
        amizVar.n = amjaVar5;
        amizVar.b |= SemanticState.Modal;
        wjrVar.y((amiz) aihfVarCreateBuilder2.build());
    }

    private final void aU() {
        xog xogVar = this.l;
        if (xogVar != null) {
            xogVar.b();
            this.l = null;
        }
        this.c.a();
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private final synchronized void aV() {
        if (this.I == null) {
            this.I = new HandlerThread(getClass().getName(), 10);
            this.I.start();
            this.i = new Handler(this.I.getLooper());
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, xla] */
    @Override // defpackage.yco
    public final void aA() {
        if (this.J) {
            ((agrc) ((agrc) a.b().i(agso.a, "MDX.Dial")).k("com/google/android/libraries/youtube/mdx/remote/internal/DialSession", "launchApp", 225, "DialSession.java")).t("Cannot call launchApp() more than once.");
            return;
        }
        this.L = this.g.b();
        ycp ycpVar = this.E;
        ycpVar.l(3);
        int i = 1;
        this.J = true;
        aV();
        this.p = 0;
        if (!this.k.r()) {
            this.F.w(16, "d_l");
            if (this.i != null) {
                this.i.post(new ygz(this, i));
                return;
            }
            return;
        }
        if (av()) {
            agrx agrxVar = agso.a;
            aP(amyu.MDX_SESSION_DISCONNECT_REASON_DIAL_RECOVERY_WAKE_ON_LAN_STARTED, Optional.empty());
            return;
        }
        ycpVar.l(4);
        this.F.w(16, "d_lw");
        this.o = Math.max(this.M, (this.k.j << 1) * 1000);
        xpl xplVar = this.N;
        xog xogVar = new xog((yed) xplVar.b, this.k.i, xplVar.a);
        xogVar.a();
        this.l = xogVar;
        aI(0L);
    }

    @Override // defpackage.yco
    public final void aB(boolean z) {
        agrx agrxVar = agso.a;
        aU();
        if (this.I != null) {
            if (!z || !this.K) {
                aK();
            } else if (this.i != null) {
                this.i.post(new xfd(this, 19));
            }
        }
    }

    public final /* synthetic */ ListenableFuture aC(Optional optional, Boolean bool) {
        if (bool.booleanValue()) {
            agrx agrxVar = agso.a;
            return ahng.n(Boolean.FALSE);
        }
        agrx agrxVar2 = agso.a;
        return super.q(amyu.MDX_SESSION_DISCONNECT_REASON_RECEIVER_DEAD_AFTER_RECEIVER_PING, optional);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, ttm] */
    public final void aD(xyq xyqVar, amyu amyuVar, Optional optional) {
        aU();
        this.F.w(16, "d_laf");
        if (this.v < this.w) {
            ((agrc) ((agrc) a.c().i(agso.a, "MDX.Dial")).k("com/google/android/libraries/youtube/mdx/remote/internal/DialSession", "handleAppLaunchFailure", 336, "DialSession.java")).E("Initial connection failed with error: %s, reason: %s, error code: %s. attempting retry.", xyqVar, amyuVar, optional);
            Uri uri = this.k.a;
            if (uri != null) {
                this.k = this.k.n(this.d.a(uri, this.k.p()));
            }
            if (this.x.V().contains(Integer.valueOf(amyuVar.aa))) {
                long jMax = Math.max(0L, 3000 - Math.max(0L, this.g.b() - this.L));
                if (this.i != null && jMax > 0) {
                    this.i.postDelayed(new xfd(this, 18), jMax);
                    return;
                }
            }
            aG();
            return;
        }
        if (optional.isPresent() && this.H.at()) {
            afwv afwvVar = this.O;
            int iIntValue = ((Integer) optional.get()).intValue();
            String str = this.k.c;
            Object obj = afwvVar.b;
            if (obj == null) {
                afwvVar.a.d(((Context) afwvVar.c).getString(xyqVar.i, str));
            } else {
                xyp.i(iIntValue, str).gT(((cf) obj).getSupportFragmentManager(), xyp.class.getCanonicalName());
            }
        } else {
            this.s.d(this.r.getString(xyqVar.i, this.k.c));
        }
        aP(amyuVar, optional);
    }

    public final void aE(boolean z) {
        aihf aihfVarCreateBuilder = amiz.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amiz amizVar = (amiz) aihfVarCreateBuilder.instance;
        amizVar.b |= SemanticState.LiveRegion;
        amizVar.l = z;
        amiz amizVar2 = (amiz) aihfVarCreateBuilder.build();
        wjr wjrVar = this.F;
        wjrVar.y(amizVar2);
        wjrVar.w(191, "cx_rsid");
        wjrVar.w(191, "cx_rlt");
    }

    public final void aF(xve xveVar) {
        this.K = true;
        xvn xvnVar = this.k;
        if (aL()) {
            this.b.edit().putString(xvnVar.n.b, xveVar.d.b + ',' + xveVar.e.b).apply();
        }
        this.F.w(16, "d_las");
        xwc xwcVar = xveVar.g;
        if (xwcVar != null) {
            xzd xzdVar = new xzd(this.z);
            xzdVar.b = xwcVar;
            xzdVar.a = (short) (xzdVar.a | 32);
            this.z = xzdVar.a();
        }
        aR(this.P.B(xveVar, new yaa((ycj) this), this.E, this));
    }

    public final void aG() {
        aK();
        this.J = false;
        this.v++;
        this.u = 0;
        aihf aihfVarCreateBuilder = amiz.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amiz amizVar = (amiz) aihfVarCreateBuilder.instance;
        amizVar.b |= SemanticState.Hidden;
        amizVar.k = true;
        this.F.y((amiz) aihfVarCreateBuilder.build());
        aA();
        this.D.c(this);
    }

    public final void aH() {
        if (this.i != null) {
            this.i.post(new xfd(this, 20));
        }
    }

    public final void aI(long j) {
        long jB = this.g.b();
        if (this.i != null) {
            this.i.postDelayed(new ywg(this, jB, j, 1), j);
        }
    }

    public final synchronized void aK() {
        if (this.I != null) {
            this.I.quit();
            this.I = null;
            this.i = null;
        }
    }

    public final boolean aL() {
        xla xlaVar = this.H;
        if (xlaVar.ab()) {
            return false;
        }
        return !yno.cZ() || xlaVar.aO();
    }

    public final boolean aM() {
        return this.k.k().a == 1;
    }

    @Override // defpackage.xzc
    public final xvr j() {
        return this.k;
    }

    @Override // defpackage.ycj, defpackage.xzc
    public final ListenableFuture q(amyu amyuVar, Optional optional) {
        int iB = b();
        if (iB != 1) {
            if (iB == 1) {
            }
            return super.q(amyuVar, optional);
        }
        xla xlaVar = this.H;
        if (xlaVar.aD() && xlaVar.T().contains(Integer.valueOf(amyuVar.aa))) {
            ListenableFuture listenableFutureAO = aO();
            if (listenableFutureAO == null) {
                listenableFutureAO = ahng.n(Boolean.FALSE);
            }
            return afxd.f(listenableFutureAO).h(new row(this, optional, 15, null), MoreExecutors.directExecutor());
        }
        if (this.H.av() && amyu.MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED.equals(amyuVar) && "MATCHES_RECEIVER".equals(y())) {
            return ahng.n(Boolean.FALSE);
        }
        return super.q(amyuVar, optional);
    }
}
