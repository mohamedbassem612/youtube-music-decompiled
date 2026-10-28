package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class inr {
    public static final Duration a;
    public final ahey b;
    public ListenableFuture c;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        durationOfSeconds.getClass();
        a = durationOfSeconds;
    }

    public inr(ahey aheyVar) {
        aheyVar.getClass();
        this.b = aheyVar;
    }

    public final void a() {
        ListenableFuture listenableFuture = this.c;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
        this.c = null;
    }
}
