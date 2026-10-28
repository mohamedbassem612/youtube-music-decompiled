package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hcw implements wfv {
    private static final agrf c = agrf.h("com/google/android/apps/youtube/music/feedback/MusicSmartDownloadsSyncTimesFeedbackFiller");
    public final Context a;
    public final Executor b;
    private final zwb d;
    private final syn e;

    public hcw(syn synVar, zwb zwbVar, Context context, Executor executor) {
        this.e = synVar;
        this.d = zwbVar;
        this.a = context;
        this.b = executor;
    }

    @Override // defpackage.wfv
    public final void b(Bundle bundle) {
        ListenableFuture listenableFutureN = this.e.n(this.d.e());
        gmv gmvVar = new gmv(this, 11);
        Executor executor = this.b;
        taf.h(ahno.as(ahno.ar(listenableFutureN, gmvVar, executor), new gqb(this, bundle, 2, null), executor), executor, new glo(15));
    }

    @Override // defpackage.wfv
    public final void c(Bundle bundle) {
    }
}
