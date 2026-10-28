package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class QuicException extends NetworkException {
    protected QuicException(String str, Throwable th) {
        super(str, th);
    }

    public int getConnectionCloseSource() {
        return 0;
    }

    public abstract int getQuicDetailedErrorCode();
}
