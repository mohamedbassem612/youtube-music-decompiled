package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iqk {
    private static final agrf c = agrf.h("com/google/android/apps/youtube/music/settings/store/MusicDownloadsPrefsStore");
    public final aunn a;
    public final Executor b;

    public iqk(aunn aunnVar, Executor executor) {
        this.a = aunnVar;
        this.b = executor;
    }

    public final ListenableFuture a() {
        return ahno.ar(((ayq) this.a.io()).i(), new iqj(1), this.b);
    }

    public final ListenableFuture b() {
        return ahno.ar(((ayq) this.a.io()).i(), new iam(20), this.b);
    }

    public final ListenableFuture c() {
        return ahno.ar(((ayq) this.a.io()).i(), new iqj(3), this.b);
    }

    public final ListenableFuture d(boolean z) {
        return ((ayq) this.a.io()).j(new iqm(z, 1));
    }
}
