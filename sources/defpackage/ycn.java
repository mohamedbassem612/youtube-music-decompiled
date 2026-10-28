package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ycn implements xzf {
    static final long a;
    static final long b;
    static final long c;
    private static final agrf h = agrf.h("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionInfoStorageController");
    public final aunn e;
    public final aunn f;
    public final aunn g;
    private final mbc j;
    private xzc k;
    private xzd l;
    private final long m;
    private final xla n;
    private adyp p;
    private final zik q = new ycm(this);
    private final Handler i = new Handler(Looper.getMainLooper());
    private final yas o = new yas(this, 2);
    public boolean d = false;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        a = 60000L;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        b = 120000L;
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        c = 600000L;
    }

    public ycn(mbc mbcVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, xla xlaVar) {
        this.j = mbcVar;
        this.e = aunnVar;
        this.f = aunnVar2;
        this.g = aunnVar3;
        this.n = xlaVar;
        this.m = xlaVar.M();
    }

    public final void a() {
        if (this.l == null) {
            ((agrc) ((agrc) h.c().i(agso.a, "MDX.SessionInfoStorageController")).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionInfoStorageController", "refreshValues", 191, "MdxSessionInfoStorageController.java")).t("cannot update values because session builders are null");
            return;
        }
        if (this.p == null) {
            ((yck) this.e.io()).e(this.l.a());
            return;
        }
        long epochMilli = this.j.f().toEpochMilli();
        long jC = this.p.e().c();
        long j = this.m;
        boolean z = false;
        if (j > 0) {
            jC = this.n.M() + epochMilli;
        } else if (j < 0) {
            z = true;
        } else {
            xzc xzcVar = this.k;
            if (xzcVar != null) {
                long jMax = Math.max(b, xzcVar.f() - this.k.d());
                if (this.k.aw() == 2) {
                    jMax = Math.max(jMax, c);
                }
                jC = jMax + epochMilli;
            }
        }
        aunn aunnVar = this.e;
        yck yckVar = (yck) aunnVar.io();
        xzd xzdVar = this.l;
        adyp adypVar = this.p;
        adypVar.h(epochMilli);
        adypVar.i(jC);
        adypVar.f(z);
        xzdVar.b(adypVar.e());
        yckVar.e(xzdVar.a());
        ((yck) aunnVar.io()).a();
    }

    public final void b() {
        this.i.postDelayed(this.o, a);
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
        if (xzcVar != this.k) {
            ((agrc) ((agrc) h.c().i(agso.a, "MDX.SessionInfoStorageController")).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionInfoStorageController", "onMdxSessionEnded", 166, "MdxSessionInfoStorageController.java")).t("Mismatching session disconnect, ignore");
            return;
        }
        xzd xzdVar = this.l;
        if (xzdVar == null) {
            ((agrc) ((agrc) h.c().i(agso.a, "MDX.SessionInfoStorageController")).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionInfoStorageController", "onMdxSessionEnded", 170, "MdxSessionInfoStorageController.java")).t("session info builder lost, ignore");
            return;
        }
        xzdVar.d(xzcVar.r());
        a();
        yat yatVar = (yat) this.g.io();
        xze xzeVarA = this.l.a();
        taq.d();
        yatVar.j = false;
        ycs ycsVarA = yatVar.k.a(xzeVarA.k);
        yatVar.e = ycsVarA;
        if (ycsVarA != null && yatVar.d(xzeVarA)) {
            agrx agrxVar = agso.a;
            yatVar.c(ycsVarA, xzeVarA);
        } else {
            yatVar.a(0);
        }
        xzcVar.az(this.q);
        this.i.removeCallbacks(this.o);
        this.k = null;
        this.p = null;
        this.l = null;
    }

    @Override // defpackage.xzf
    public final void h(xzc xzcVar) {
        agrx agrxVar = agso.a;
        aunn aunnVar = this.e;
        ((yck) aunnVar.io()).b();
        this.k = xzcVar;
        this.p = null;
        xzd xzdVar = new xzd(xzcVar.n());
        xzdVar.j(this.j.f().toEpochMilli());
        this.l = xzdVar;
        xze xzeVarA = xzdVar.a();
        if (!this.n.aa()) {
            ((yck) aunnVar.io()).e(xzeVarA);
        }
        yat yatVar = (yat) this.g.io();
        taq.d();
        yatVar.j = true;
        ycs ycsVar = yatVar.e;
        if (ycsVar != null && !ycsVar.f(xzcVar)) {
            ycsVar.d();
        }
        yatVar.g = null;
        yatVar.h = "";
        yatVar.f = null;
        yatVar.b(null, 0);
    }

    @Override // defpackage.xzf
    public final void jv(xzc xzcVar) {
        long epochMilli = this.j.f().toEpochMilli();
        adyp adypVar = new adyp();
        adypVar.g(epochMilli);
        this.p = adypVar;
        if (this.l == null || this.k != xzcVar) {
            ((agrc) ((agrc) h.c().i(agso.a, "MDX.SessionInfoStorageController")).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionInfoStorageController", "onMdxSessionConnected", 150, "MdxSessionInfoStorageController.java")).t("session info builder lost or mismatch, using connected time as a proxy for started time");
            xzd xzdVar = new xzd(xzcVar.n());
            xzdVar.j(epochMilli);
            this.l = xzdVar;
        }
        this.k = xzcVar;
        xzcVar.ay(this.q);
        a();
        b();
    }
}
