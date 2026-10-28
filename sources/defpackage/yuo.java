package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.media.interfaces.RestartPrefetchEvaluationSource;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yuo implements Observer, zew, zdo {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/media/player/androidframework/AndroidFrameworkPlayerWrapper");
    private final zeu A;
    private ywh B;
    private boolean C;
    private wja D;
    private wiu E;
    private String F;
    private zkj G;
    private final abte H;
    private final ahnz I;
    public final String b;
    public final zeo c;
    public ywn d;
    final yum e;
    yul f;
    public final Handler g;
    public boolean h;
    public volatile boolean k;
    wgs l;
    public zlm m;
    public int n;
    public int o;
    public final int q;
    public final int r;
    public final AtomicInteger s;
    public final AtomicInteger t;
    public final tfq u;
    final hed v;
    private final Context w;
    private final yos x;
    private final zjr y;
    private final zkk z;
    public float i = 0.0f;
    public zsf j = zsf.a;
    public int p = 0;

    public yuo(Context context, tfq tfqVar, yos yosVar, String str, zjr zjrVar, zkk zkkVar, abte abteVar, zeo zeoVar, yha yhaVar, ahnz ahnzVar, ScheduledExecutorService scheduledExecutorService, hed hedVar) {
        this.w = context;
        this.H = abteVar;
        zkf.d(tfqVar);
        this.u = tfqVar;
        zkf.d(yosVar);
        this.x = yosVar;
        zkf.d(str);
        this.b = str;
        zkf.d(zjrVar);
        this.y = zjrVar;
        zkf.d(zkkVar);
        this.z = zkkVar;
        this.c = zeoVar;
        this.I = ahnzVar;
        this.A = new zeu(yhaVar, scheduledExecutorService);
        this.d = ywn.b;
        this.v = hedVar;
        this.e = new yum(this);
        int iD = (int) zjrVar.i.d(17, 45621553L);
        this.q = iD == 0 ? 3 : iD;
        this.r = (int) zjrVar.i.d(16, 45621552L);
        this.s = new AtomicInteger();
        this.t = new AtomicInteger();
        this.g = new Handler(context.getMainLooper());
        this.B = ywh.a;
        int i = zic.a;
        yul yulVar = new yul(this, context, zeoVar, abteVar, zjrVar, hedVar);
        this.f = yulVar;
        yulVar.start();
    }

    private final wgs ad(yod yodVar, String str) {
        wgs wgsVar;
        if (this.y.u.f(str) == arfb.VIDEO_QUALITY_SETTING_HIGHER_QUALITY && (wgsVar = yodVar.d) != null) {
            return wgsVar;
        }
        wgs[] wgsVarArr = yodVar.b;
        if (yodVar.g.c()) {
            for (wgs wgsVar2 : wgsVarArr) {
                if (wgsVar2.f() <= 360) {
                    return wgsVar2;
                }
            }
        }
        return wgsVarArr[0];
    }

    private final yod ae(wja wjaVar, wiu wiuVar, yoc yocVar, int i, Integer num, String str) {
        if (!wjaVar.G()) {
            return this.x.a(wiuVar, wjaVar.s, null, yocVar, this.y.fu(wiuVar.V()) ? wir.y() : wir.f(), yos.a, 2, i, num, str, ywn.b, zkg.a, false);
        }
        wgs wgsVar = (wgs) wjaVar.s.get(0);
        wgs[] wgsVarArr = {wgsVar};
        wgs[] wgsVarArr2 = new wgs[0];
        yog yogVar = wgs.a ? yoc.f : yoc.e;
        wiw[] wiwVarArr = {new wiw(-1, aipc.QUALITY_ORDINAL_UNKNOWN, "raw", true)};
        wgo[] wgoVarArr = {new wgo(wgsVar.f, wgsVar.u(), wgsVar.J(), false)};
        yoc yocVar2 = new yoc(yogVar);
        zjr zjrVar = this.y;
        return new yod(wgsVarArr, wgsVarArr2, wgsVar, wiwVarArr, wgoVarArr, yogVar, yocVar2, Alert.DURATION_SHOW_INDEFINITELY, false, zjrVar.cQ(), zjrVar.dc());
    }

    private final void af(boolean z, boolean z2) {
        if (this.h) {
            yul yulVar = this.f;
            if (z2) {
                yulVar.j();
            } else {
                yulVar.i();
            }
            Q(false);
            this.D = null;
            this.F = null;
            if (z && !this.f.u) {
                this.B.y();
            }
            this.h = false;
        }
    }

    private final void ag(yod yodVar, int i) {
        wgs wgsVarAd = ad(yodVar, this.F);
        this.B.j(new yvu(wgsVarAd, wgsVarAd, null, yodVar.e, yodVar.f, yodVar.g, i, -1L, 0, yvt.a(d(), e(), -1), null, null, null, null));
        x(wgsVarAd, e(), null, null, null, this.j == zsf.f ? this.d : ywn.b, Optional.empty());
    }

    private final boolean ah() {
        return this.y.R().x;
    }

    public static String q(wgs wgsVar) {
        if (wgsVar == null) {
            return "";
        }
        return "itag." + wgsVar.e();
    }

    public static String s(boolean z, String str) {
        return !z ? "net.unavailable" : str;
    }

    public static String t(wgs wgsVar) {
        return wgsVar != null ? "shost.".concat(String.valueOf(wgsVar.e.getHost())) : "";
    }

    @Override // defpackage.zew
    public final void A() {
        this.f.b();
        float f = this.i;
        if (f != 0.0f) {
            M(f);
        }
        Q(true);
    }

    @Override // defpackage.zew
    public final void E() {
        wja wjaVar;
        yuo yuoVar;
        if (!this.h || (wjaVar = this.D) == null) {
            return;
        }
        try {
            yuoVar = this;
            try {
                yod yodVarAe = yuoVar.ae(wjaVar, this.E, null, Alert.DURATION_SHOW_INDEFINITELY, null, this.F);
                if (yuoVar.ad(yodVarAe, yuoVar.F).equals(yuoVar.l)) {
                    return;
                }
                yuoVar.ag(yodVarAe, 2);
            } catch (yof e) {
                e = e;
                yof yofVar = e;
                ywn ywnVar = yuoVar.d;
                zhz zhzVarQ = hed.q(zhw.a, yofVar, yuoVar.D, 0L);
                zhzVarQ.p();
                ywnVar.k(zhzVarQ);
            }
        } catch (yof e2) {
            e = e2;
            yuoVar = this;
        }
    }

    public final void F() {
        this.f.quit();
        zlm zlmVar = this.m;
        if (zlmVar != null) {
            zlmVar.H();
        }
        yul yulVar = new yul(this, this.w, this.c, this.H, this.y, this.v);
        this.f = yulVar;
        yulVar.start();
    }

    @Override // defpackage.zew
    public final void I(long j, appa appaVar) {
        int i;
        if (this.f.j != j) {
            this.A.c.r(appaVar);
            long jMax = Math.max(0L, Math.min(j, this.n));
            if (this.y.br()) {
                i = appaVar == appa.SEEK_SOURCE_DOUBLE_TAP_TO_SEEK ? 5 : 2;
            } else {
                i = 1;
            }
            this.k = true;
            yul yulVar = this.f;
            yun yunVar = new yun(jMax, i, appaVar);
            yulVar.j = yunVar.a;
            Handler handler = yulVar.g;
            handler.sendMessage(Message.obtain(handler, 4, yunVar));
        }
    }

    @Override // defpackage.zew
    public final void K(zlm zlmVar) {
        if (this.m != zlmVar) {
            if (zlmVar == null) {
                Q(false);
                this.m.q();
                this.m.v(null);
                this.m = null;
                this.f.a();
                return;
            }
            zeo zeoVar = this.c;
            zeoVar.h(this.j);
            this.m = zlmVar;
            yum yumVar = this.e;
            zlmVar.v(yumVar);
            zeoVar.g(yumVar, this.j);
            this.f.e(zlmVar);
            if (this.f.s) {
                zlmVar.s(500);
            }
            Q(this.f.s);
        }
    }

    @Override // defpackage.zew
    public final void M(float f) {
        if (ah()) {
            if (this.f.k) {
                this.f.f(f);
            } else {
                this.i = f;
                this.B.p(f);
            }
        }
    }

    @Override // defpackage.zew
    public final void N(boolean z) {
        this.f.g(z);
    }

    @Override // defpackage.zew
    public final void O(float f) {
        this.f.h(f);
    }

    public final void Q(boolean z) {
        zlm zlmVar = this.m;
        if (zlmVar != null) {
            if (z) {
                zlmVar.K(1);
            } else {
                zlmVar.J(1);
            }
        }
    }

    @Override // defpackage.zew
    public final boolean R() {
        yul yulVar = this.f;
        int i = yul.w;
        return yulVar.l;
    }

    @Override // defpackage.zew
    public final boolean S() {
        yul yulVar = this.f;
        int i = yul.w;
        return yulVar.t;
    }

    @Override // defpackage.zew
    public final boolean T(wja wjaVar, wiu wiuVar) {
        return false;
    }

    @Override // defpackage.zdo
    public final boolean U(wja wjaVar, wiu wiuVar, boolean z) {
        if (wjaVar.w()) {
            return (this.y.i.m(24, 45375053L) && wjaVar.G()) ? false : true;
        }
        return false;
    }

    @Override // defpackage.zdo
    public final boolean V() {
        return false;
    }

    @Override // defpackage.zew
    public final boolean W() {
        yul yulVar = this.f;
        int i = yul.w;
        return yulVar.s;
    }

    @Override // defpackage.zew
    public final boolean X(zev zevVar) {
        return false;
    }

    @Override // defpackage.zew
    public final zsf Y(ywk ywkVar) {
        arfb arfbVar;
        this.D = ywkVar.d;
        this.E = ywkVar.i;
        this.F = ywkVar.h;
        this.d = ywkVar.a;
        int i = ywkVar.n;
        this.p = i;
        this.C = (i & SemanticState.Hidden) != 0;
        zjr zjrVar = this.y;
        this.j = (zjrVar.eF() && this.C) ? zsf.f : zsf.a;
        this.B = new ywh(ywkVar.b);
        this.s.set(0);
        this.c.f(this.j);
        ahnz ahnzVar = this.I;
        wgs wgsVar = (wgs) aguu.J(ywkVar.d.r, null);
        if (wgsVar != null) {
            String host = wgsVar.e.getHost();
            if (!TextUtils.isEmpty(host) && host.endsWith(".googlevideo.com")) {
                ahnzVar.a = host;
            }
        }
        zjrVar.E.c(ywkVar.h, this.j);
        wja wjaVar = this.D;
        this.A.d(this.d, wjaVar);
        this.z.deleteObserver(this);
        try {
            yod yodVarAe = ae(wjaVar, this.E, null, Alert.DURATION_SHOW_INDEFINITELY, ywkVar.r, this.F);
            zkd zkdVar = zjrVar.u;
            ywh ywhVar = this.B;
            ywhVar.getClass();
            zkdVar.h(new vnm(ywhVar, 15), ywkVar.h, false);
            if (zjrVar.bJ() && ywkVar.r != null) {
                zkdVar.j(ywkVar.h, arfb.VIDEO_QUALITY_SETTING_ADVANCED_MENU);
            } else if (zjrVar.bJ() && (arfbVar = ywkVar.s) != null) {
                zkdVar.j(ywkVar.h, arfbVar);
            }
            int i2 = yodVarAe.h;
            if (i2 != Integer.MAX_VALUE) {
                this.d.l("lmdu", Integer.toString(i2));
            }
            yog yogVar = yodVarAe.g;
            if (yogVar.e()) {
                this.d.l("pmqs", yodVarAe.e());
            }
            wgs wgsVarAd = ad(yodVarAe, this.F);
            this.B.j(new yvu(wgsVarAd, wgsVarAd, null, yodVarAe.e, yodVarAe.f, yogVar, 1, -1L, 0, yvt.a(d(), e(), -1), null, null, null, null));
            zlm zlmVar = this.m;
            if (zlmVar != null) {
                zeo zeoVar = this.c;
                zlo zloVar = zlo.SURFACE;
                zeoVar.i(zloVar, this.j);
                zlmVar.w(zloVar);
            }
            x(wgsVarAd, ywkVar.e.a, Boolean.valueOf(ywkVar.s(2)), Float.valueOf(ywkVar.l), Float.valueOf(ywkVar.m), this.j == zsf.f ? this.d : ywn.b, Optional.of(Boolean.valueOf(ywkVar.u)));
            this.z.addObserver(this);
            if (this.C) {
                M(ywkVar.m);
            }
            return this.j;
        } catch (yof e) {
            this.d.k(hed.q(zhw.d, e, this.D, 0L));
            return null;
        }
    }

    @Override // defpackage.zew
    public final void Z(int i) {
        this.A.c.A(i);
        this.f.g.sendEmptyMessage(3);
        Q(false);
    }

    @Override // defpackage.zew
    public final float a() {
        float f = this.i;
        return f == 0.0f ? this.f.h : f;
    }

    @Override // defpackage.zew
    public final void aa(boolean z, int i) {
        this.A.c.A(i);
        this.c.n(this.j);
        af(z, false);
    }

    @Override // defpackage.zew
    public final void ab(int i) {
        this.A.c.A(i);
        this.c.c(this.j);
        af(true, true);
    }

    @Override // defpackage.zew
    public final int b(wja wjaVar, wiu wiuVar) {
        int i = true != ah() ? 0 : 2;
        return this.y.bl() ? i | 16 : i;
    }

    @Override // defpackage.zew
    public final int c() {
        return -1;
    }

    @Override // defpackage.zew
    public final long d() {
        return (long) ((this.o / 100.0f) * this.n);
    }

    @Override // defpackage.zew
    public final long e() {
        return this.f.j;
    }

    @Override // defpackage.zew
    public final long f() {
        return -1L;
    }

    @Override // defpackage.zew
    public final long g() {
        return this.n;
    }

    @Override // defpackage.zew
    public final long h() {
        return -1L;
    }

    @Override // defpackage.zew
    public final long i() {
        return -1L;
    }

    @Override // defpackage.zew
    public final long j(long j) {
        return -1L;
    }

    @Override // defpackage.zew
    public final wgs k() {
        return this.l;
    }

    @Override // defpackage.zew
    public final wgs l() {
        return this.l;
    }

    @Override // defpackage.zew
    public final yod m(wja wjaVar, wiu wiuVar, boolean z, yoc yocVar, int i) {
        yoc yocVar2 = yocVar;
        if (z && yocVar2 != null && yocVar2.g.b == 0) {
            yocVar2 = new yoc(new yog(360, 360), yocVar2.h, yocVar2.i, yocVar2.j, yocVar2.k, yocVar2.l, yocVar2.m, yocVar2.n, yocVar2.o, null);
        }
        return ae(wjaVar, wiuVar, yocVar2, i, null, null);
    }

    @Override // defpackage.zew
    public final yve n() {
        return new yve(this.j);
    }

    @Override // defpackage.zew
    public final /* synthetic */ zia o() {
        return yno.p(this);
    }

    @Override // defpackage.zew
    public final zia p(String str) {
        if (this.y.aV()) {
            return (this.h && Objects.equals(str, this.F)) ? yno.p(this) : zia.a;
        }
        return yno.p(this);
    }

    @Override // defpackage.zew
    public final String r() {
        return this.F;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable == this.z) {
            y();
        }
    }

    @Override // defpackage.zew
    public final void v() {
        zlm zlmVar = this.m;
        if (zlmVar != null) {
            zlmVar.q();
        }
    }

    public final void x(wgs wgsVar, long j, Boolean bool, Float f, Float f2, ywn ywnVar, Optional optional) {
        yul yulVar = this.f;
        int i = yul.w;
        boolean z = false;
        if (yulVar.q && wgsVar.equals(this.l)) {
            z = true;
        }
        yulVar.q = z;
        this.l = wgsVar;
        this.f.i();
        int i2 = (int) wgsVar.d;
        this.n = i2;
        this.B.k(0L, i2);
        zlm zlmVar = this.m;
        if (zlmVar != null) {
            zlmVar.q();
        }
        this.B.b().A();
        Q(true);
        this.h = true;
        yui yuiVar = new yui();
        yuiVar.a = this.F;
        yuiVar.b = wgsVar;
        yuiVar.c = this.B;
        yuiVar.d = this.m;
        yuiVar.e = this.E;
        yuiVar.i = j;
        yuiVar.l = bool;
        yuiVar.j = f != null ? f.floatValue() : this.f.i;
        yuiVar.m = this.C;
        yuiVar.f = this.j;
        yuiVar.k = f2 != null ? f2.floatValue() : this.f.h;
        yuiVar.g = ywnVar == null ? ywn.b : ywnVar;
        yuiVar.h = this.D;
        yuiVar.n = ((Boolean) optional.orElse(Boolean.valueOf(this.f.l))).booleanValue();
        yul yulVar2 = this.f;
        zsf zsfVar = yuiVar.f;
        if (zsfVar == null) {
            zsfVar = zsf.a;
        }
        yulVar2.d = zsfVar;
        yulVar2.j = yuiVar.i;
        Handler handler = yulVar2.g;
        handler.sendMessage(Message.obtain(handler, 1, yuiVar));
    }

    public final void y() {
        yuo yuoVar;
        Object objIo = this.z.io();
        if (this.m == null || this.D == null || this.E == null) {
            return;
        }
        zkj zkjVar = (zkj) objIo;
        if (zkjVar.equals(this.G)) {
            return;
        }
        this.G = zkjVar;
        try {
            yuoVar = this;
            try {
                yod yodVarAe = yuoVar.ae(this.D, this.E, null, Alert.DURATION_SHOW_INDEFINITELY, null, this.F);
                ajbx ajbxVar = yuoVar.E.d.k;
                if (ajbxVar == null) {
                    ajbxVar = ajbx.a;
                }
                if (!ajbxVar.d || yuoVar.ad(yodVarAe, yuoVar.F).equals(yuoVar.l)) {
                    return;
                }
                yuoVar.ag(yodVarAe, 10001);
            } catch (yof e) {
                e = e;
                yof yofVar = e;
                ywn ywnVar = yuoVar.d;
                zhz zhzVarQ = hed.q(zhw.a, yofVar, yuoVar.D, 0L);
                zhzVarQ.p();
                ywnVar.k(zhzVarQ);
            }
        } catch (yof e2) {
            e = e2;
            yuoVar = this;
        }
    }

    @Override // defpackage.zew
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.zew
    public final /* synthetic */ void C() {
    }

    @Override // defpackage.zew
    public final /* synthetic */ void G() {
    }

    @Override // defpackage.zew
    public final void u() {
    }

    @Override // defpackage.zew
    public final void z() {
    }

    @Override // defpackage.zew
    public final /* synthetic */ void D(ywn ywnVar) {
    }

    @Override // defpackage.zew
    public final void P(boolean z) {
    }

    @Override // defpackage.zew
    public final void ac(acca accaVar) {
    }

    @Override // defpackage.zew
    public final void w(boolean z) {
    }

    @Override // defpackage.zew
    public final void H(RestartPrefetchEvaluationSource restartPrefetchEvaluationSource, boolean z) {
    }

    @Override // defpackage.zew
    public final /* synthetic */ void J(boolean z, ajvs ajvsVar) {
    }

    @Override // defpackage.zew
    public final void L(int i, int i2) {
    }
}
