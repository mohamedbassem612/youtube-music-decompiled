package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hnl implements wnf {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/appsearch/service/DownloadsSearchService");
    public static final agkj b;
    public final hpy c;
    public final Executor d;
    public final hfn e;
    public final kyr f;
    private final hpk g;
    private final xit h;
    private final xgn i;
    private final Executor j;
    private final aajt k;
    private final abxv l;
    private final grj m;

    static {
        zh zhVar = new zh();
        zhVar.a = 2;
        b = agkj.j("display_context", zhVar.d());
    }

    public hnl(aajt aajtVar, grj grjVar, kyr kyrVar, hfn hfnVar, hpy hpyVar, hpk hpkVar, abxv abxvVar, xit xitVar, xgn xgnVar, Executor executor, Executor executor2) {
        this.k = aajtVar;
        this.m = grjVar;
        this.f = kyrVar;
        this.e = hfnVar;
        this.c = hpyVar;
        this.g = hpkVar;
        this.l = abxvVar;
        this.h = xitVar;
        this.i = xgnVar;
        this.d = executor;
        this.j = executor2;
    }

    public static List e(List list, int i) {
        return (List) Collection.EL.stream(list).filter(new mob(i, 1)).map(new hnf(7)).collect(aghu.a);
    }

    private final ListenableFuture g(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, Class cls) {
        afxd afxdVarG = afxd.f(listenableFuture).g(new hdn(10), this.d);
        return ahng.h(afxdVarG, listenableFuture2).a(afwl.j(new hlm(this, afxdVarG, listenableFuture2, cls, 2)), MoreExecutors.directExecutor());
    }

    @Override // defpackage.wnf
    public final wlu a(acjx acjxVar) {
        if (TextUtils.isEmpty(acjxVar.c())) {
            throw new IllegalArgumentException("Continuation token should not be empty");
        }
        abxv abxvVar = this.l;
        aihf aihfVarCreateBuilder = alxh.a.createBuilder();
        String strC = acjxVar.c();
        aihfVarCreateBuilder.copyOnWrite();
        alxh alxhVar = (alxh) aihfVarCreateBuilder.instance;
        strC.getClass();
        alxhVar.b |= 16;
        alxhVar.h = strC;
        return new hnj(abxvVar, (alxh) aihfVarCreateBuilder.build());
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture b(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    @Override // defpackage.wnf
    public final void c(wlu wluVar, wne wneVar, zza zzaVar) {
        xir xirVarN = this.h.p(3);
        xirVarN.n("sr_s");
        aihf aihfVarCreateBuilder = amiu.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amjd.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amjd amjdVar = (amjd) aihfVarCreateBuilder2.instance;
        amjdVar.c = 6;
        amjdVar.b |= 2;
        amjd amjdVar2 = (amjd) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
        amjdVar2.getClass();
        amiuVar.Y = amjdVar2;
        amiuVar.e |= SemanticState.Focused;
        xirVarN.h((amiu) aihfVarCreateBuilder.build());
        String strA = axiw.a(((alxh) ((hnj) wluVar).a().instance).h);
        xgn xgnVar = this.i;
        xgnVar.b(xhb.a(122502), null, null);
        xgnVar.w(new xgj(xhb.a(122502)), null);
        tk tkVar = new tk();
        tkVar.e(this.m.y());
        tkVar.d(2);
        tl tlVarA = tkVar.a();
        aajt aajtVar = this.k;
        afxd afxdVarF = afxd.f(afxd.f(aajtVar.b()).g(new aaat(strA, tlVarA, 6), aajtVar.h));
        hdn hdnVar = new hdn(12);
        Executor executor = this.d;
        afxd afxdVarG = afxdVarF.g(hdnVar, executor);
        afxd afxdVarG2 = afxd.f(afxdVarG).g(new hdn(13), executor);
        ListenableFuture listenableFutureE = this.g.e(hpu.b());
        ListenableFuture listenableFutureB = ahng.h(afxdVarG2, listenableFutureE).b(afwl.c(new gmf(this, afxdVarG2, listenableFutureE, 3)), MoreExecutors.directExecutor());
        hpy hpyVar = this.c;
        int i = 10;
        ListenableFuture listenableFutureG = g(afxdVarG, ahcs.f(hpyVar.a(kro.aq()), afwl.d(new hba(this, i)), executor), anuk.class);
        ListenableFuture listenableFutureG2 = g(afxdVarG, ahcs.f(hpyVar.a(kro.aq()), afwl.d(new hba(this, 8)), executor), anjx.class);
        taf.i(ahng.h(listenableFutureB, listenableFutureG, listenableFutureG2).a(afwl.j(new hni((Object) this, (Object) listenableFutureB, listenableFutureG, listenableFutureG2, (Object) strA, 0)), MoreExecutors.directExecutor()), this.j, new gou(this, zzaVar, i), new gov(zzaVar, xirVarN, 15, null), null);
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture d(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    public final void f(int i) {
        this.i.l(new xgj(xhb.b(i)));
    }
}
