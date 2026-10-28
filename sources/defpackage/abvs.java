package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abvs implements abuh, yxo {
    public final abwj b;
    public final abvx d;
    public final Executor e;
    public final abmt f;
    public int k;
    private final Executor o;
    private final awmd p;
    private final ci q;
    private static final agrf n = agrf.h("com/google/android/libraries/youtube/player/service/SabrPrefetchController");
    public static final agke a = agpi.a;
    public final List c = new ArrayList();
    public final Map g = new HashMap();
    public final Map h = new HashMap();
    public agke i = agpi.a;
    public abul j = new abul(0, null);
    public abuk m = abuk.a;
    public boolean l = false;

    public abvs(ci ciVar, abwj abwjVar, abvx abvxVar, Executor executor, Executor executor2, abmt abmtVar, awmd awmdVar) {
        this.q = ciVar;
        this.b = abwjVar;
        this.d = abvxVar;
        this.o = new ahfg(executor);
        this.e = executor2;
        this.p = awmdVar;
        this.f = abmtVar;
    }

    private final void g(String str, abul abulVar) {
        c(str, abulVar, abulVar != null ? aasc.f(abulVar, this.i) : null);
    }

    private final void h(Runnable runnable) {
        this.o.execute(afwl.i(runnable));
    }

    public final void a(ListenableFuture listenableFuture, abul abulVar, abun abunVar) {
        boolean zIsDone = listenableFuture.isDone();
        if (!zIsDone || this.f.aE()) {
            listenableFuture.cancel(false);
            c(true != zIsDone ? "prefetch_cancelled" : "prefetch_cancelled_done", abulVar, abunVar);
        }
    }

    @Override // defpackage.abuh
    public final void b() {
        h(new abbj(this, 19));
    }

    @Override // defpackage.yxo
    public final void bo(boolean z) {
        abwj abwjVar = this.b;
        if (abwjVar.b && abwjVar.c) {
            h(new csd(this, z, 15));
        } else {
            ((agrc) ((agrc) n.b()).k("com/google/android/libraries/youtube/player/service/SabrPrefetchController", "prefetch", 171, "SabrPrefetchController.java")).t("SABR Prefetching attempted when not enabled");
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [acey, java.lang.Object] */
    public final void c(String str, abul abulVar, abun abunVar) {
        ahhp ahhpVar;
        ?? r0;
        if (this.f.e.m(327, 45758722L)) {
            abwk abwkVar = (abwk) this.p.io();
            acip acipVarM = null;
            if (abwkVar != null && (r0 = abwkVar.d) != 0) {
                acipVarM = r0.m();
            }
            if (acipVarM == null || (ahhpVar = (ahhp) acipVarM.e().a()) == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ci=");
            sb.append(this.j);
            if (abulVar != null) {
                sb.append(";pi=");
                sb.append(abulVar);
            }
            int i = 1;
            if (abunVar instanceof abvz) {
                abvz abvzVar = (abvz) abunVar;
                sb.append(";vid=");
                sb.append(abvzVar.a().w());
                Optional optionalO = abvzVar.a().o();
                abyy abyyVar = new abyy(sb, i);
                if (true == optionalO.isPresent()) {
                    Object obj = optionalO.get();
                    StringBuilder sb2 = (StringBuilder) abyyVar.a;
                    sb2.append(";p_cpn=");
                    sb2.append((String) obj);
                }
            }
            sb.append(";cpn=");
            sb.append(acipVarM.au());
            ahhpVar.b(str, sb.toString(), true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:46:0x010d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [abun, java.lang.Object] */
    public final void d(boolean z) {
        Optional optionalAo;
        hmr hmrVar;
        Object obj;
        ?? r3;
        ListenableFuture listenableFuture;
        abvs abvsVar;
        Executor executorDirectExecutor;
        if (this.i.isEmpty()) {
            this.l = true;
            return;
        }
        abul abulVarE = aasc.e(this.j, this.i, this.m.c, this.k + 1);
        if (abulVarE == null || this.k >= this.i.size()) {
            this.l = true;
            g("prefetch_all", null);
            return;
        }
        int i = this.k;
        abmt abmtVar = this.f;
        if (abmtVar.b() == 0 || i < abmtVar.b()) {
            if (abmtVar.a() != 0) {
                int i2 = 0;
                for (int i3 = this.j.b + 1; i3 < abulVarE.b && i3 < this.i.size(); i3++) {
                    ListenableFuture listenableFuture2 = (ListenableFuture) this.g.get(((abun) this.i.get(i3)).e());
                    if (listenableFuture2 != null && !listenableFuture2.isDone()) {
                        i2++;
                    }
                    if (i2 < abmtVar.a()) {
                    }
                }
            }
            abun abunVarF = aasc.f(abulVarE, this.i);
            if (abunVarF != null) {
                Map map = this.g;
                if (map.containsKey(abunVarF.e())) {
                    ListenableFuture listenableFuture3 = (ListenableFuture) map.get(abunVarF.e());
                    if (listenableFuture3.isCancelled()) {
                        if (abunVarF == null) {
                            return;
                        }
                        abul abulVarE2 = aasc.e(this.j, this.i, this.m.c, 1);
                        ci ciVar = this.q;
                        abup abupVar = new abup(abulVarE, abunVarF, Objects.equals(abulVarE, abulVarE2));
                        abul abulVar = this.j;
                        optionalAo = ciVar.ao(abupVar, abulVar, aasc.f(abulVar, this.i), z);
                        hmrVar = new hmr(this, abunVarF, abulVarE, 6);
                        if (true == optionalAo.isPresent()) {
                            Object obj2 = optionalAo.get();
                            obj = hmrVar.c;
                            r3 = hmrVar.b;
                            Object obj3 = hmrVar.a;
                            listenableFuture = (ListenableFuture) obj2;
                            abvsVar = (abvs) obj;
                            abvsVar.g.put(r3.e(), listenableFuture);
                            abvsVar.c("prefetch_triggered", (abul) obj3, r3);
                            if (!r3.d().equals(abvz.class)) {
                                if (abvsVar.f.aS()) {
                                    executorDirectExecutor = MoreExecutors.directExecutor();
                                } else {
                                    executorDirectExecutor = abvsVar.e;
                                }
                                taf.i(listenableFuture, executorDirectExecutor, new ztb(17), new yqj(obj, 12), null);
                            }
                            abvsVar.l = false;
                        }
                    } else if (listenableFuture3.isDone()) {
                        this.k++;
                        d(z);
                        return;
                    }
                } else {
                    if (abunVarF == null) {
                        return;
                    }
                    abul abulVarE3 = aasc.e(this.j, this.i, this.m.c, 1);
                    ci ciVar2 = this.q;
                    abup abupVar2 = new abup(abulVarE, abunVarF, Objects.equals(abulVarE, abulVarE3));
                    abul abulVar2 = this.j;
                    optionalAo = ciVar2.ao(abupVar2, abulVar2, aasc.f(abulVar2, this.i), z);
                    hmrVar = new hmr(this, abunVarF, abulVarE, 6);
                    if (true == optionalAo.isPresent()) {
                        Object obj4 = optionalAo.get();
                        obj = hmrVar.c;
                        r3 = hmrVar.b;
                        Object obj5 = hmrVar.a;
                        listenableFuture = (ListenableFuture) obj4;
                        abvsVar = (abvs) obj;
                        abvsVar.g.put(r3.e(), listenableFuture);
                        abvsVar.c("prefetch_triggered", (abul) obj5, r3);
                        if (!r3.d().equals(abvz.class)) {
                            if (abvsVar.f.aS()) {
                                executorDirectExecutor = MoreExecutors.directExecutor();
                            } else {
                                executorDirectExecutor = abvsVar.e;
                            }
                            taf.i(listenableFuture, executorDirectExecutor, new ztb(17), new yqj(obj, 12), null);
                        }
                        abvsVar.l = false;
                    }
                }
            } else {
                if (abunVarF == null) {
                    return;
                }
                abul abulVarE4 = aasc.e(this.j, this.i, this.m.c, 1);
                ci ciVar3 = this.q;
                abup abupVar3 = new abup(abulVarE, abunVarF, Objects.equals(abulVarE, abulVarE4));
                abul abulVar3 = this.j;
                optionalAo = ciVar3.ao(abupVar3, abulVar3, aasc.f(abulVar3, this.i), z);
                hmrVar = new hmr(this, abunVarF, abulVarE, 6);
                if (true == optionalAo.isPresent()) {
                    Object obj6 = optionalAo.get();
                    obj = hmrVar.c;
                    r3 = hmrVar.b;
                    Object obj7 = hmrVar.a;
                    listenableFuture = (ListenableFuture) obj6;
                    abvsVar = (abvs) obj;
                    abvsVar.g.put(r3.e(), listenableFuture);
                    abvsVar.c("prefetch_triggered", (abul) obj7, r3);
                    if (!r3.d().equals(abvz.class)) {
                        if (abvsVar.f.aS()) {
                            executorDirectExecutor = MoreExecutors.directExecutor();
                        } else {
                            executorDirectExecutor = abvsVar.e;
                        }
                        taf.i(listenableFuture, executorDirectExecutor, new ztb(17), new yqj(obj, 12), null);
                    }
                    abvsVar.l = false;
                }
            }
            this.k++;
            return;
        }
        g("prefetch_throttled", abulVarE);
    }

    public final void e(abep abepVar) {
        this.c.add(abepVar);
    }

    @Override // defpackage.abuh
    public final synchronized void f(agke agkeVar, abuk abukVar, abul abulVar) throws Throwable {
        try {
            try {
                h(new aasv(this, agkeVar, abulVar, abukVar, 9));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
