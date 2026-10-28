package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abib {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/features/playbackposition/PlaybackPositionStartupController");
    public final ahbw b;
    public final abhz c;
    public wby d;
    public avmn e;
    public wcn f;
    public final vxz g;
    private final Executor h;
    private final wco i;
    private final wbz j;
    private final tbt k;
    private final zwb l;

    public abib(zwb zwbVar, vxz vxzVar, wco wcoVar, wbz wbzVar, abhz abhzVar, Executor executor, ahbw ahbwVar, tbt tbtVar) {
        this.g = vxzVar;
        this.h = executor;
        this.b = ahbwVar;
        this.k = tbtVar;
        this.l = zwbVar;
        this.i = wcoVar;
        this.j = wbzVar;
        this.f = wcoVar.b(zwbVar.e());
        this.d = wbzVar.b(zwbVar.e());
        this.c = abhzVar;
    }

    private final void e() {
        avmc avmcVarB = this.f.b(76);
        tzj tzjVar = new tzj();
        avmcVarB.F(new tzi(tzjVar));
        aheo aheoVarQ = aheo.p(tzjVar).r(new thc(this, 15), this.h).q(new vzs(this, 12), MoreExecutors.directExecutor()).r(new thc(this, 16), MoreExecutors.directExecutor()).q(new vzs(this, 13), MoreExecutors.directExecutor());
        hmb hmbVar = new hmb(19);
        Executor executor = taf.a;
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        taa taaVar = new taa(taf.c, null, hmbVar);
        long j = afwl.a;
        aheoVarQ.addListener(new ahei(aheoVarQ, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
    }

    public final void a() {
        this.k.g(this, abib.class);
        e();
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        avmn avmnVar = this.e;
        if (avmnVar != null && !avmnVar.f()) {
            avnr.b((AtomicReference) this.e);
        }
        wco wcoVar = this.i;
        zwb zwbVar = this.l;
        this.f = wcoVar.b(zwbVar.e());
        this.d = this.j.b(zwbVar.e());
        e();
    }
}
