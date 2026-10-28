package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vzt {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/innertube/datapush/DataPushClientImpl");
    public final Context b;
    public final awmd c;
    public final awmd d;
    public final ahex e;
    public final ListenableFuture g;
    public final vwt i;
    public final abxv j;
    public final hed k;
    private final awmd n;
    private final ListenableFuture o;
    public volatile boolean h = false;
    public final String f = "embedded_filegroups_embedded_datapush_proto.dat";
    private final awly l = new awlo().az();
    private final ConcurrentHashMap m = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public vzt(Context context, awmd awmdVar, awmd awmdVar2, vwt vwtVar, abxv abxvVar, hed hedVar, ahex ahexVar, avlr avlrVar, avlr avlrVar2, awmd awmdVar3) {
        this.b = context;
        this.c = awmdVar;
        this.d = awmdVar2;
        this.i = vwtVar;
        this.j = abxvVar;
        this.k = hedVar;
        this.e = ahexVar;
        int i = 6;
        rru rruVar = new rru(this, i);
        long j = afwl.a;
        ListenableFuture listenableFutureSubmit = ahexVar.submit(new ahcz(afty.c(false), rruVar, 1));
        this.g = listenableFutureSubmit;
        zpw zpwVar = (zpw) awmdVar.io();
        oij oijVarA = oik.a();
        oijVarA.b(true);
        afxd afxdVarG = afxd.f(zpwVar.e(oijVarA.a())).g(new vzs(this, 0), ahexVar);
        afxd afxdVarC = afxd.f(new ahud(new ahek(true, agke.p(new ListenableFuture[]{afxdVarG, listenableFutureSubmit})), (byte[]) null).k(new fzs(this, afxdVarG, 9), ahexVar)).c(Exception.class, new thc(this, i), ahexVar);
        this.o = afxdVarC;
        this.n = awmdVar3;
        b(afxdVarC, true);
        zpw zpwVar2 = (zpw) awmdVar.io();
        ((omj) zpwVar2.a).b(new ebs(zpwVar2, 14), zpwVar2.o);
        avlrVar.af(new vub(this, 10));
        avlrVar2.af(new vub(this, 11));
    }

    public final ListenableFuture a(ohz ohzVar) {
        zpw zpwVar = (zpw) this.c.io();
        oij oijVarA = oik.a();
        oijVarA.a = agev.i(ohzVar.c);
        afxd afxdVarF = afxd.f(zpwVar.e(oijVarA.a()));
        uzh uzhVar = new uzh(ohzVar, 13);
        ahex ahexVar = this.e;
        return afxdVarF.h(uzhVar, ahexVar).h(new row(this, ohzVar, 9), ahexVar).h(new row(this, ohzVar, 10), ahexVar);
    }

    public final void b(ListenableFuture listenableFuture, final boolean z) {
        afxd.f(listenableFuture).g(new agek() { // from class: vzr
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                agqr it = ((agkj) obj).values().iterator();
                while (it.hasNext()) {
                    this.a.c((waa) it.next(), z);
                }
                return null;
            }
        }, this.e);
    }

    public final synchronized void c(waa waaVar, boolean z) {
        String strD = waaVar.d();
        if (z && this.m.containsKey(strD)) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.m;
        if (!concurrentHashMap.containsKey(strD)) {
            concurrentHashMap.put(strD, new awli().az());
            this.l.kk(strD);
        }
        ((awly) concurrentHashMap.get(strD)).kk(this.i.g(waaVar, 4));
    }

    public final void d() {
        ((vzw) this.n.io()).c.set(false);
    }
}
