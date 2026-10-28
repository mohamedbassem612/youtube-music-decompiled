package defpackage;

import org.chromium.net.NetError;
import org.chromium.net.QuicException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axlz extends QuicException {
    private final axly a;

    public axlz(android.net.http.QuicException quicException) {
        super(quicException.getMessage(), null);
        this.a = new axly(quicException, true);
        axly.a(this, quicException);
    }

    @Override // org.chromium.net.QuicException
    public final int getConnectionCloseSource() {
        return 0;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return NetError.ERR_HTTPENGINE_PROVIDER_IN_USE;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.a.getErrorCode();
    }

    @Override // org.chromium.net.QuicException
    public final int getQuicDetailedErrorCode() {
        return 0;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.a.immediatelyRetryable();
    }
}
