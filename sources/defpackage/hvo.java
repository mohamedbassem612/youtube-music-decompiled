package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hvo implements jkv {
    public static final /* synthetic */ int e = 0;
    private static final Duration f = Duration.ofMillis(100);
    private static final xgj g = new xgj(xhb.b(156422));
    private static final xgj h = new xgj(xhb.b(156423));
    private static final agrf i = agrf.h("com/google/android/apps/youtube/music/onboarding/OnboardingHelper");
    public final jnj a;
    public final kjc b;
    public final hfn c;
    public final kro d;
    private final jkx j;
    private final xgn k;
    private final hfn l;

    public hvo(hfn hfnVar, kjc kjcVar, jnj jnjVar, jkx jkxVar, kro kroVar, xgn xgnVar, hfn hfnVar2) {
        this.c = hfnVar;
        this.b = kjcVar;
        this.a = jnjVar;
        this.j = jkxVar;
        this.d = kroVar;
        this.k = xgnVar;
        this.l = hfnVar2;
    }

    public static ajwo d(Optional optional) {
        anta antaVar;
        if (optional.isPresent()) {
            aihf aihfVarCreateBuilder = anta.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            anta antaVar2 = (anta) aihfVarCreateBuilder.instance;
            antaVar2.b |= 1;
            antaVar2.c = true;
            Object obj = optional.get();
            aihfVarCreateBuilder.copyOnWrite();
            anta antaVar3 = (anta) aihfVarCreateBuilder.instance;
            antaVar3.e = (almd) obj;
            antaVar3.b |= 4;
            antaVar = (anta) aihfVarCreateBuilder.build();
        } else {
            aihf aihfVarCreateBuilder2 = anta.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            anta antaVar4 = (anta) aihfVarCreateBuilder2.instance;
            antaVar4.b |= 1;
            antaVar4.c = true;
            antaVar = (anta) aihfVarCreateBuilder2.build();
        }
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(antb.a, antaVar);
        return (ajwo) aihhVar.build();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, tqj] */
    private final boolean i() {
        kjc kjcVar = this.b;
        hfn hfnVar = this.l;
        String strO = kjcVar.o();
        boolean zA = hfnVar.A();
        if (zA) {
            ?? r4 = hfnVar.a;
            int i2 = tqr.a;
            if (r4.c(1071578) == hmy.o(strO)) {
                return true;
            }
        }
        ListenableFuture listenableFutureC = c(strO);
        if (zA) {
            taf.n(listenableFutureC, MoreExecutors.directExecutor(), new gov(hfnVar, strO, 19));
        }
        try {
            return ((ailw) listenableFutureC.get(f.toMillis(), TimeUnit.MILLISECONDS)).c;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return true;
        }
    }

    private final afxd j(String str) {
        return afxd.f(c(str)).h(new idm(this, str, 1), MoreExecutors.directExecutor());
    }

    @Override // defpackage.jkv
    public final void a(String str, int i2) {
        if (ahno.ag(str, "android.permission.POST_NOTIFICATIONS") && i2 == 105) {
            this.k.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, h, null);
        }
    }

    @Override // defpackage.jkv
    public final void b(String str, int i2) {
        if (ahno.ag(str, "android.permission.POST_NOTIFICATIONS") && i2 == 105) {
            this.k.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, g, null);
        }
    }

    public final ListenableFuture c(String str) {
        ListenableFuture listenableFutureC = ((qrx) this.c.a).c();
        gqq gqqVar = new gqq(str, 3);
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), gqqVar);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        int i2 = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureC, afwiVar);
        listenableFutureC.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        return ahcrVar;
    }

    public final void f() {
        if (a.aM() && this.j.d("android.permission.POST_NOTIFICATIONS", 105, Optional.of(this))) {
            xgn xgnVar = this.k;
            xgnVar.b(xhb.a(156421), null, null);
            xgnVar.l(g);
            xgnVar.l(h);
        }
    }

    public final boolean g() {
        return !i();
    }

    public final ListenableFuture h() {
        hfn hfnVar = this.l;
        String strO = this.b.o();
        return hfnVar.A() ? j(strO).g(new gqa(hfnVar, strO, 15), MoreExecutors.directExecutor()) : j(strO);
    }
}
