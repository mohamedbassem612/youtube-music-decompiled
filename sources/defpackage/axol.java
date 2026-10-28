package defpackage;

import org.chromium.net.NetworkException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class axol extends NetworkException {
    protected final int a;
    public final int b;

    public axol(String str, int i, int i2) {
        super(str, null);
        this.a = i;
        this.b = i2;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return this.b;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(super.getMessage());
        sb.append(", ErrorCode=");
        sb.append(this.a);
        int i = this.b;
        if (i != 0) {
            sb.append(", InternalErrorCode=");
            sb.append(i);
        }
        sb.append(", Retryable=");
        sb.append(immediatelyRetryable());
        return sb.toString();
    }

    @Override // org.chromium.net.NetworkException
    public boolean immediatelyRetryable() {
        int i = this.a;
        return i == 3 || i == 4 || i == 5 || i == 6 || i == 8;
    }
}
