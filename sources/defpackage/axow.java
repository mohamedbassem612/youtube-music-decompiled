package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axow extends RequestFinishedInfo.Listener {
    private final RequestFinishedInfo.Listener a;

    public axow(RequestFinishedInfo.Listener listener) {
        super(listener.getExecutor());
        this.a = listener;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final Executor getExecutor() {
        return this.a.getExecutor();
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        this.a.onRequestFinished(requestFinishedInfo);
    }
}
