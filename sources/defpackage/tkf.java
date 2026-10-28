package defpackage;

import org.chromium.net.NetworkException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tkf extends NetworkException {
    public final int a;
    public final byte[] b;
    private final int c;

    public tkf(String str, int i, int i2, byte[] bArr) {
        super(str, null);
        this.c = i;
        this.a = i2;
        this.b = bArr;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return 0;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.c;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return false;
    }
}
