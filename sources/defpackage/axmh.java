package defpackage;

import android.net.http.UrlRequest;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axmh extends ExperimentalUrlRequest {
    private final UrlRequest a;
    private final axlw b;
    private final String c;
    private final Collection d;
    private final axow e;

    public axmh(UrlRequest urlRequest, axlw axlwVar, String str, Collection collection, RequestFinishedInfo.Listener listener) {
        this.a = urlRequest;
        this.b = axlwVar;
        this.c = str;
        this.d = collection;
        this.e = listener == null ? null : new axow(listener);
    }

    final void a(int i, axmi axmiVar, CronetException cronetException) {
        axma.a(this.b, this.c, this.d, this.e, i, axmiVar, cronetException);
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        this.a.cancel();
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        this.a.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(org.chromium.net.UrlRequest.StatusListener statusListener) {
        this.a.getStatus(new axmg(statusListener));
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        this.a.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.a.start();
    }
}
