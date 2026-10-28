package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rtm implements rsq {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/ads/controlflow/externalapi/impl/AdWatchNextFetcher");
    public final awmd b;
    public final wuo c;
    public final wup d;
    public awlx e;
    public final abmt f;
    private final Executor g;
    private final Map h;

    public rtm(awmd awmdVar, Executor executor, wuo wuoVar, wup wupVar, abmt abmtVar) {
        this.b = awmdVar;
        this.g = executor;
        wuoVar.getClass();
        this.c = wuoVar;
        wupVar.getClass();
        this.d = wupVar;
        this.f = abmtVar;
        this.h = new HashMap();
    }

    public final ListenableFuture a(slb slbVar) {
        Map map = this.h;
        String str = slbVar.o;
        if (!map.containsKey(str)) {
            map.put(str, ahcs.e(ahng.n(slbVar), afwl.a(new rns(this, 7)), this.g));
        }
        return (ListenableFuture) map.get(str);
    }

    @Override // defpackage.rsq
    public final void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
        if (abobVar == abob.a) {
            this.h.clear();
            this.e = new awlx();
        }
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void e(aaxa aaxaVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void h(aazs aazsVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
