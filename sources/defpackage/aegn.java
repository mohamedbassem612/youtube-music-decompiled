package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.webkit.CookieManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aegn implements aegh {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/ui/webview/WebViewAuthControllerImplAS");
    private static final String l = "aegh";
    public final mbc c;
    public final Executor d;
    public final Executor e;
    public final aunn f;
    public final vxz i;
    public final vxz j;
    public final kyr k;
    private final affd m;
    private final afho n;
    private final Executor o;
    private final aunn p;
    private final aunn q;
    private final aunn r;
    private final vxz s;
    private final abhh t;
    public final Object b = new Object();
    public final AtomicReference g = new AtomicReference();
    public final Map h = DesugarCollections.synchronizedMap(new HashMap());

    public aegn(Context context, affd affdVar, afho afhoVar, abhh abhhVar, mbc mbcVar, Executor executor, Executor executor2, Executor executor3, vxz vxzVar, vxz vxzVar2, vxz vxzVar3, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4) {
        this.m = affdVar;
        this.n = afhoVar;
        this.t = abhhVar;
        this.c = mbcVar;
        this.d = executor;
        this.e = executor2;
        this.o = executor3;
        this.k = new kyr(context, (byte[]) null);
        this.i = vxzVar;
        this.s = vxzVar2;
        this.j = vxzVar3;
        this.p = aunnVar;
        this.f = aunnVar2;
        this.q = aunnVar3;
        this.r = aunnVar4;
    }

    public static final void r(String str) {
        if (str != null) {
            zvp.a(zvn.a, zvm.z, "GenericWebView::" + l + ' ' + str);
        }
    }

    public static final void s(xir xirVar, amjm amjmVar) {
        if (xirVar != null) {
            aihf aihfVarCreateBuilder = amiu.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
            amjmVar.getClass();
            amiuVar.V = amjmVar;
            amiuVar.d |= 33554432;
            xirVar.h((amiu) aihfVarCreateBuilder.build());
        }
    }

    private static boolean t(Throwable th) {
        if (th == null) {
            return false;
        }
        if (th.getClass().getName().contains("MissingWebViewPackageException")) {
            return true;
        }
        return t(th.getCause());
    }

    @Override // defpackage.aegh
    public final aegg a() {
        return (aegg) ((aehn) this.q.io()).a;
    }

    @Override // defpackage.aegh
    public final /* synthetic */ aegg b(zwa zwaVar) {
        return null;
    }

    @Override // defpackage.aegh
    public final ListenableFuture c(agkz agkzVar, xir xirVar) {
        aegg aeggVar = new aegg(0);
        agkz agkzVar2 = (agkz) Collection.EL.stream(agkzVar).filter(new aciy(agkz.n(this.s.h(0, 45389063L).b), 14)).collect(aghu.b);
        if (agkzVar2.isEmpty()) {
            return ahno.aB(aeggVar);
        }
        ListenableFuture listenableFutureAs = ahno.as(q(), new aakn(this, aeggVar, agkzVar2, 8), this.j.m(7, 45798903L) ? this.e : this.d);
        ahno.at(listenableFutureAs, new ryh(xirVar, 9), MoreExecutors.directExecutor());
        return listenableFutureAs;
    }

    @Override // defpackage.aegh
    public final /* synthetic */ ListenableFuture d(agkz agkzVar, zwa zwaVar, xir xirVar) {
        return ahng.m(new UnsupportedOperationException());
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.aegh
    public final ListenableFuture e(aegg aeggVar) {
        ahgb ahgbVar = (ahgb) this.r.io();
        return awrc.ag(ahgbVar.c, awov.a, new adpb(ahgbVar, (Map) aeggVar.a, (awoq) null, 7));
    }

    @Override // defpackage.aegh
    public final /* synthetic */ ListenableFuture f(aegg aeggVar, zwa zwaVar) {
        return ahng.m(new UnsupportedOperationException());
    }

    @Override // defpackage.aegh
    public final void g() {
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.removeAllCookies(null);
            cookieManager.flush();
            this.h.clear();
        } catch (RuntimeException e) {
            if (t(e)) {
                r("MissingWebViewPackageException");
            }
        }
    }

    @Override // defpackage.aegh
    public final /* synthetic */ void h(zwa zwaVar) {
        throw new IllegalArgumentException("Account scoped callsite should not pass Identity.");
    }

    @Override // defpackage.aegh
    public final void i(final String str, final arkf arkfVar, final xir xirVar, final xgn xgnVar, final arkm arkmVar, final twi twiVar) {
        ListenableFuture listenableFutureAr = (arkfVar == arkf.WEB_VIEW_USE_CASE_GAMEPLAY_MINI_APP || arkfVar == arkf.WEB_VIEW_USE_CASE_MY_AD_CENTER) ? ahno.ar(this.n.a(this.m), new abzr(20), MoreExecutors.directExecutor()) : ahcs.e(this.t.u(this.m), afwl.a(new aeni(4)), MoreExecutors.directExecutor());
        final Executor executor = this.o;
        taf.i(listenableFutureAr, MoreExecutors.directExecutor(), new xfa(str, twiVar, 11, null), new tae() { // from class: aegl
            @Override // defpackage.tae, defpackage.twi
            public final void a(Object obj) {
                final aegn aegnVar = this.a;
                arkf arkfVar2 = arkfVar;
                final xir xirVar2 = xirVar;
                final String str2 = str;
                Callable callableJ = afwl.j(new hni(aegnVar, str2, (Account) obj, arkfVar2, xirVar2, 15));
                Executor executor2 = aegnVar.j.m(7, 45798903L) ? aegnVar.e : aegnVar.d;
                final twi twiVar2 = twiVar;
                Executor executor3 = executor;
                final arkm arkmVar2 = arkmVar;
                final xgn xgnVar2 = xgnVar;
                taf.i(ahno.ap(callableJ, executor2), executor3, new xfa(str2, twiVar2, 10, null), new tae() { // from class: aegk
                    @Override // defpackage.tae, defpackage.twi
                    public final void a(Object obj2) {
                        arkm arkmVar3;
                        xir xirVar3 = xirVar2;
                        if (xirVar3 != null) {
                            xirVar3.n("gw_ac");
                        }
                        xgn xgnVar3 = xgnVar2;
                        if (xgnVar3 != null && (arkmVar3 = arkmVar2) != null) {
                            aeho.i(xgnVar3, arkmVar3, 31, null, aegnVar.i.l(64, 45763769L, true));
                        }
                        twiVar2.a(str2);
                    }
                }, null);
            }
        }, null);
    }

    @Override // defpackage.aegh
    public final /* synthetic */ void j(String str, zwa zwaVar, arkf arkfVar, xir xirVar, xgn xgnVar, arkm arkmVar, twi twiVar) {
        throw new IllegalArgumentException("Account scoped callsite should pass Identity.");
    }

    @Override // defpackage.aegh
    public final void k(aegg aeggVar) {
        ((aehn) this.q.io()).a = aeggVar;
    }

    @Override // defpackage.aegh
    public final ListenableFuture m(agkz agkzVar, dvo dvoVar, xir xirVar) {
        if (!Objects.equals(dvoVar.c(), "Default")) {
            if (dvy.a("MULTI_PROFILE")) {
                agkz agkzVar2 = (agkz) Collection.EL.stream(agkzVar).filter(new aciy(agkz.n(this.s.h(0, 45389063L).b), 13)).collect(aghu.b);
                if (agkzVar2.isEmpty()) {
                    return ahno.aB(agpr.a);
                }
                ListenableFuture listenableFutureAs = ahno.as(q(), new aakn(this, dvoVar, agkzVar2, 9), this.j.m(7, 45798903L) ? this.e : this.d);
                ahno.at(listenableFutureAs, new ryh(xirVar, 8), MoreExecutors.directExecutor());
                return listenableFutureAs;
            }
        }
        return ahno.aB(agpr.a);
    }

    @Override // defpackage.aegh
    public final /* synthetic */ ListenableFuture n(agkz agkzVar, zwa zwaVar, dvo dvoVar, xir xirVar) {
        return ahng.m(new IllegalArgumentException());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.aegh
    public final void o(aegg aeggVar, dvo dvoVar) {
        CookieManager cookieManager = (dvoVar == null || Objects.equals(dvoVar.c(), "Default")) ? CookieManager.getInstance() : dvoVar.a();
        if (cookieManager == null) {
            if (dvoVar != null) {
                dvoVar.c();
                return;
            }
            return;
        }
        for (Map.Entry entry : aeggVar.a.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                cookieManager.setCookie(str, (String) it.next());
            }
        }
        cookieManager.flush();
    }

    final ListenableFuture q() {
        return ahno.ar(this.n.a(this.m), new aeiw(1), MoreExecutors.directExecutor());
    }

    @Override // defpackage.aegh
    public final /* synthetic */ void l(aegg aeggVar, zwa zwaVar) {
    }

    @Override // defpackage.aegh
    public final /* synthetic */ void p(aegg aeggVar, zwa zwaVar, dvo dvoVar) {
    }
}
