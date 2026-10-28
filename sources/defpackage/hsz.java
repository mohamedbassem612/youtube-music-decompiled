package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hsz {
    private static final agrf c = agrf.h("com/google/android/apps/youtube/music/offline/logging/MusicSmartDownloadsSyncTimesLogger");
    public final Context a;
    public final mbc b;
    private final Executor d;
    private final zwb e;
    private final syn f;

    public hsz(Context context, Executor executor, zwb zwbVar, syn synVar, mbc mbcVar) {
        this.a = context;
        this.d = executor;
        this.e = zwbVar;
        this.f = synVar;
        this.b = mbcVar;
    }

    private final ListenableFuture e() {
        return ahno.ar(this.f.n(this.e.e()), new hrk(this, 6), this.d);
    }

    public final void c() {
        ListenableFuture listenableFutureE = e();
        hqj hqjVar = new hqj(this, 4);
        Executor executor = this.d;
        taf.h(ahno.as(listenableFutureE, hqjVar, executor), executor, new hou(5));
    }

    public final void d(int i) {
        ListenableFuture listenableFutureE = e();
        hsx hsxVar = new hsx(this, i, 0);
        Executor executor = this.d;
        taf.h(ahno.as(listenableFutureE, hsxVar, executor), executor, new hou(4));
    }
}
