package defpackage;

import org.chromium.net.NetworkException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tme extends NetworkException {
    private final int a;

    public tme(int i) {
        StringBuilder sb = new StringBuilder("Connection timeout out");
        if (i == 6) {
            sb.append(": connection timeout");
        } else if (i == 4) {
            sb.append(": read timeout");
        }
        super(sb.toString(), null);
        this.a = i;
    }

    public static tme a(int i) {
        if (i == 1) {
            return new tme(6);
        }
        return i == 2 ? new tme(4) : new tme(11);
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return -1;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.a;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return true;
    }
}
