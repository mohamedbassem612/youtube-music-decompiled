package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import org.chromium.net.NetError;
import org.chromium.net.NetworkException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axly extends NetworkException {
    private final android.net.http.NetworkException a;

    public axly(android.net.http.NetworkException networkException, boolean z) {
        super(networkException.getMessage(), null);
        this.a = networkException;
        a(this, networkException);
        if (!z && ank$$ExternalSyntheticApiModelOutline0.m218m((Object) networkException)) {
            throw new IllegalArgumentException("Translating QuicException as NetworkException results in loss of information. Make sure you handle QuicException first. See the stacktrace for where the translation is being performed, and the cause for the exception being translated.", networkException);
        }
    }

    static void a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        while (th2.getCause() != null && setNewSetFromMap.add(th2.getCause())) {
            th2 = th2.getCause();
        }
        th.setStackTrace(th2.getStackTrace());
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return NetError.ERR_HTTPENGINE_PROVIDER_IN_USE;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.a.getErrorCode();
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.a.isImmediatelyRetryable();
    }
}
