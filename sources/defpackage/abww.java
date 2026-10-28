package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abww {
    private static final agrf q = agrf.h("com/google/android/libraries/youtube/player/settings/PlayerSettingsStore");
    public final awku a;
    public final awku b;
    public final awku c;
    public final awmd d;
    public final awmd e;
    public final awmd f;
    public final awmd g;
    public final awmd h;
    public final Executor i;
    public final tqj j;
    public final AtomicBoolean k;
    public final AtomicBoolean l;
    public final avlh m;
    public Optional n;
    public Optional o;
    public final abhh p;
    private final awku r;
    private final agfr s;
    private final aunn t;
    private final Object u;
    private volatile ListenableFuture v;

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, tqj] */
    public abww(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, Executor executor, awmd awmdVar5, Optional optional, tqj tqjVar) {
        Optional optionalOf;
        Optional optionalEmpty;
        new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        new AtomicBoolean(false);
        this.u = new Object();
        this.o = Optional.empty();
        abhh abhhVar = new abhh(tqjVar, awmdVar2);
        this.p = abhhVar;
        if (((abmt) abhhVar.b.io()).bl()) {
            ?? r2 = abhhVar.a;
            int i = tqr.a;
            optionalOf = r2.k(88641) ? Optional.of(Boolean.valueOf(abhhVar.a.k(88642))) : Optional.empty();
        } else {
            optionalOf = Optional.empty();
        }
        optionalOf = true == optionalOf.isPresent() ? Optional.ofNullable(new awku(Optional.of(optionalOf.get()))) : optionalOf;
        this.a = (awku) (true != optionalOf.isPresent() ? new awku() : optionalOf.get());
        if (((abmt) abhhVar.b.io()).bl()) {
            ?? r3 = abhhVar.a;
            int i2 = tqr.a;
            int iMin = Math.min(r3.a(350787), 16);
            if (iMin > 0) {
                byte[] bArrN = abhhVar.a.n(8411776, iMin);
                Charset charset = StandardCharsets.UTF_8;
                charset.getClass();
                optionalEmpty = Optional.of(new String(bArrN, charset));
            } else {
                optionalEmpty = Optional.empty();
            }
        } else {
            optionalEmpty = Optional.empty();
        }
        optionalEmpty = true == optionalEmpty.isPresent() ? Optional.ofNullable(new awku(Optional.of(optionalEmpty.get()))) : optionalEmpty;
        this.b = (awku) (true != optionalEmpty.isPresent() ? new awku() : optionalEmpty.get());
        this.c = new awku();
        this.r = new awku();
        this.n = Optional.empty();
        this.d = awmdVar;
        this.e = awmdVar2;
        this.g = awmdVar3;
        this.h = awmdVar5;
        this.f = awmdVar4;
        this.i = executor;
        this.t = (aunn) optional.orElse(null);
        this.j = tqjVar;
        this.k = new AtomicBoolean(false);
        tpq tpqVar = (tpq) awmdVar.io();
        avlh avlhVarP = tpqVar.d().P();
        awgn awgnVar = new awgn(new tzh(tpqVar.a()));
        avnn avnnVar = atqp.o;
        this.m = awgnVar.g().k(avlhVarP).p().ax().kq(1);
        this.s = aguu.al(new jxq(this, awmdVar2, 17));
    }

    private final void p() {
        if (((abmt) this.e.io()).g.l(115, 45635224L, false)) {
            this.n = Optional.empty();
        }
    }

    public final abwv a() {
        return new abwv(this.a, this.b, this.t, this.e, this.i, this.p);
    }

    public final ListenableFuture b() {
        awmd awmdVar = this.e;
        ListenableFuture listenableFutureC = c();
        if (((abmt) awmdVar.io()).bl() && n()) {
            return ahng.n(Boolean.valueOf(m()));
        }
        return listenableFutureC == null ? ahng.n(Boolean.valueOf(m())) : ahno.ar(listenableFutureC, new aaoz(this, 17), this.i);
    }

    public final ListenableFuture c() {
        ListenableFuture listenableFuture;
        aunn aunnVar = this.t;
        if (aunnVar == null || !((abmt) this.e.io()).bv()) {
            return null;
        }
        ListenableFuture listenableFuture2 = this.v;
        if (listenableFuture2 != null) {
            return listenableFuture2;
        }
        synchronized (this.u) {
            listenableFuture = this.v;
            if (listenableFuture == null) {
                zwa zwaVarE = ((zwb) this.h.io()).e();
                afxd afxdVarF = afxd.f(((acqf) aunnVar.io()).c());
                int i = 13;
                oly olyVar = new oly(i);
                Executor executor = this.i;
                afxd afxdVarG = afxdVarF.h(olyVar, executor).g(new aaat(this, zwaVarE, i), executor);
                this.v = afxdVarG;
                listenableFuture = afxdVarG;
            }
        }
        return listenableFuture;
    }

    public final ListenableFuture d() {
        awmd awmdVar = this.e;
        ListenableFuture listenableFutureC = c();
        if (((abmt) awmdVar.io()).bl() && n()) {
            return ahng.n(Boolean.TRUE);
        }
        return listenableFutureC == null ? ahng.n(Boolean.valueOf(n())) : ahno.ar(listenableFutureC, new aaoz(this, 18), this.i);
    }

    public final avlh e() {
        return (avlh) this.s.io();
    }

    public final String f() {
        Optional optional = (Optional) this.b.aD();
        return (optional == null || !optional.isPresent()) ? "" : (String) optional.get();
    }

    public final void g(boolean z) {
        Optional optionalOf = Optional.of(Boolean.valueOf(z));
        this.o = optionalOf;
        this.r.kk(optionalOf);
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        if (!((abmt) this.e.io()).bv()) {
            abwv abwvVarA = a();
            abwvVarA.b(null);
            abwvVarA.a = "";
            taf.j(abwvVarA.a(), new abwu(2));
        }
        p();
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        if (!((abmt) this.e.io()).bv()) {
            abwv abwvVarA = a();
            abwvVarA.b(null);
            abwvVarA.a = "";
            taf.j(abwvVarA.a(), new abwu(0));
        }
        p();
    }

    public final boolean m() {
        Optional optional = (Optional) this.a.aD();
        return optional != null && optional.isPresent() && ((Boolean) optional.get()).booleanValue();
    }

    public final boolean n() {
        Optional optional = (Optional) this.a.aD();
        return optional != null && optional.isPresent();
    }
}
