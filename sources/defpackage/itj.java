package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class itj implements wnf {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/sideloaded/search/SideloadedSearchService");
    public static final agkj b;
    public final iup c;
    public final hfn d;
    public final kyr e;
    private final xgn f;
    private final Executor g;
    private final abxv h;
    private final kyr i;

    static {
        zh zhVar = new zh();
        zhVar.a = 1;
        b = agkj.j("display_context", zhVar.d());
    }

    public itj(kyr kyrVar, iup iupVar, hfn hfnVar, kyr kyrVar2, abxv abxvVar, xgn xgnVar, Executor executor) {
        this.i = kyrVar;
        this.c = iupVar;
        this.d = hfnVar;
        this.e = kyrVar2;
        this.h = abxvVar;
        this.f = xgnVar;
        this.g = executor;
    }

    @Override // defpackage.wnf
    public final wlu a(acjx acjxVar) {
        if (TextUtils.isEmpty(acjxVar.c())) {
            throw new IllegalArgumentException("Continuation token should not be empty");
        }
        abxv abxvVar = this.h;
        aihf aihfVarCreateBuilder = alxh.a.createBuilder();
        String strC = acjxVar.c();
        aihfVarCreateBuilder.copyOnWrite();
        alxh alxhVar = (alxh) aihfVarCreateBuilder.instance;
        strC.getClass();
        alxhVar.b |= 16;
        alxhVar.h = strC;
        return new ith(abxvVar, (alxh) aihfVarCreateBuilder.build());
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture b(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    @Override // defpackage.wnf
    public final void c(wlu wluVar, wne wneVar, zza zzaVar) {
        String strA = axiw.a(((alxh) ((ith) wluVar).a().instance).h);
        xgn xgnVar = this.f;
        xgnVar.b(xhb.a(130686), null, null);
        xgnVar.w(new xgj(xhb.a(130686)), null);
        kyr kyrVar = this.i;
        int i = 17;
        afxd afxdVarG = afxd.f(kyrVar.v(strA, new String[]{"internal.3p:MusicRecording"})).g(new iii(this, i), MoreExecutors.directExecutor()).g(new iii(this, 18), MoreExecutors.directExecutor());
        afxd afxdVarG2 = afxd.f(kyrVar.v(strA, new String[]{"internal.3p:MusicAlbum"})).g(new itg(this, 1), MoreExecutors.directExecutor()).g(new itg(this, 0), MoreExecutors.directExecutor());
        afxd afxdVarG3 = afxd.f(kyrVar.v(strA, new String[]{"internal.3p:MusicGroup"})).g(new iii(this, 19), MoreExecutors.directExecutor()).g(new iii(this, 20), MoreExecutors.directExecutor());
        taf.i(ahng.h(afxdVarG, afxdVarG2, afxdVarG3).a(new hni((Object) this, (Object) afxdVarG, (ListenableFuture) afxdVarG2, (ListenableFuture) afxdVarG3, (Object) strA, 8), MoreExecutors.directExecutor()), this.g, new ijj(zzaVar, 5), new hvn(zzaVar, i), null);
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture d(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }
}
