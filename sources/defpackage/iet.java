package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iet {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/queue/playlistrefresh/QueuePlaylistRefreshController");
    public final awmd b;
    public final avmb c;
    public final avmb d;
    public Optional e = Optional.empty();
    public final ies f = new ies(this);
    public avmn g;
    private final awmd h;
    private final zwb i;
    private final Executor j;
    private ListenableFuture k;

    public iet(awmd awmdVar, awmd awmdVar2, zwb zwbVar, avmb avmbVar, avmb avmbVar2, Executor executor) {
        this.h = awmdVar;
        this.b = awmdVar2;
        this.i = zwbVar;
        this.c = avmbVar;
        this.d = avmbVar2;
        this.j = executor;
    }

    public final wsy a() {
        xpl xplVar = (xpl) this.h.io();
        Object obj = xplVar.a;
        return ((wsz) aguu.aw((Context) obj, wsz.class, ((syn) xplVar.b).m(this.i.e()))).l();
    }

    public final void b() {
        avmn avmnVar = this.g;
        if (avmnVar == null || avmnVar.f()) {
            return;
        }
        avnr.b((AtomicReference) this.g);
    }

    public final void c() {
        agrx agrxVar = agso.a;
        b();
        ListenableFuture listenableFuture = this.k;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.k = null;
        }
        this.e = Optional.empty();
        ((abjp) this.b.io()).s(this.f);
    }

    public final void d(wsx wsxVar) {
        awmd awmdVar = this.b;
        if (((abjp) awmdVar.io()).j() == null || !((hyz) ((abjp) awmdVar.io()).j()).r().equals(this.e.orElse(""))) {
            agrx agrxVar = agso.a;
            c();
            return;
        }
        agrx agrxVar2 = agso.a;
        wsy wsyVarA = a();
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        wsxVar.m();
        ListenableFuture listenableFutureF = wsyVarA.d.f(wsxVar, executorDirectExecutor);
        this.k = listenableFutureF;
        ahno.at(listenableFutureF, new hfb(this, 11), this.j);
    }
}
