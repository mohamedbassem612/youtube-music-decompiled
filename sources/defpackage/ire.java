package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ire {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/settings/utils/PodcastsPrefsStoreHelper");
    public final Context b;
    public final Executor c;
    private final zwb d;
    private final syn e;

    public ire(Context context, Executor executor, zwb zwbVar, syn synVar) {
        this.b = context;
        this.c = executor;
        this.d = zwbVar;
        this.e = synVar;
    }

    public final afxd a() {
        return afxd.f(this.e.n(this.d.e())).g(new iii(this, 14), MoreExecutors.directExecutor());
    }

    public final ListenableFuture b() {
        afxd afxdVarF = afxd.f(this.e.n(this.d.e()));
        hqj hqjVar = new hqj(this, 17);
        Executor executor = this.c;
        afxd afxdVarB = afxdVarF.h(hqjVar, executor).b(Throwable.class, new iqj(14), executor);
        afxd afxdVarH = a().h(new gpr(13), executor);
        return ahng.h(afxdVarB, afxdVarH).a(afwl.j(new uf(afxdVarB, afxdVarH, 20, null)), executor);
    }
}
