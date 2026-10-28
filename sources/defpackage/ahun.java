package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahun implements Runnable {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ UrlRequest b;

    public ahun(SettableFuture settableFuture, UrlRequest urlRequest) {
        this.a = settableFuture;
        this.b = urlRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        agsn agsnVar = ahup.a;
        SettableFuture settableFuture = this.a;
        settableFuture.isCancelled();
        if (settableFuture.isCancelled()) {
            this.b.cancel();
        }
    }
}
