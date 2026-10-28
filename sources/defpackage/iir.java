package defpackage;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iir {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/widget/recentlyplayed/MusicWidgetRecentlyPlayedMetadataController");
    public iiq d;
    public final hef e;
    private final tbt f;
    public final awkx c = new awkx();
    public List b = new CopyOnWriteArrayList();

    public iir(tbt tbtVar, hef hefVar) {
        this.f = tbtVar;
        this.e = hefVar;
    }

    private final void d() {
        agrx agrxVar = agso.a;
        hef hefVar = this.e;
        ListenableFuture listenableFutureC = ((qrx) hefVar.a).c();
        gqq gqqVar = new gqq(hefVar, 9);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), gqqVar);
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureC, afwiVar);
        listenableFutureC.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        iin iinVar = new iin(this, 2);
        ahcrVar.addListener(new ahei(ahcrVar, iinVar), MoreExecutors.directExecutor());
    }

    public final void a(Bundle bundle) {
        agrx agrxVar = agso.a;
        this.b.size();
        ahng.aH(bundle, "recently_played", this.b);
    }

    public final void b() {
        agrx agrxVar = agso.a;
        this.f.f(this);
        d();
    }

    public final void c() {
        iiq iiqVar = this.d;
        if (iiqVar != null) {
            agrx agrxVar = agso.a;
            ((ihr) iiqVar).e();
        }
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        agrx agrxVar = agso.a;
        d();
    }
}
