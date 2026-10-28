package androidx.car.app;

import android.os.RemoteException;
import android.util.Log;
import defpackage.aeq;
import defpackage.yf;
import j$.util.Objects;
import java.security.InvalidParameterException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class FailureResponse {
    public static final int BUNDLER_EXCEPTION = 1;
    public static final int ILLEGAL_STATE_EXCEPTION = 2;
    public static final int INVALID_PARAMETER_EXCEPTION = 3;
    public static final int REMOTE_EXCEPTION = 6;
    public static final int RUNTIME_EXCEPTION = 5;
    public static final int SECURITY_EXCEPTION = 4;
    public static final int UNKNOWN_ERROR = 0;
    private final int mErrorType;
    private final String mStackTrace;

    public FailureResponse(Throwable th) {
        th.getClass();
        this.mStackTrace = Log.getStackTraceString(th);
        this.mErrorType = th instanceof aeq ? 1 : th instanceof IllegalStateException ? 2 : th instanceof InvalidParameterException ? 3 : th instanceof SecurityException ? 4 : th instanceof RuntimeException ? 5 : th instanceof RemoteException ? 6 : 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FailureResponse)) {
            return false;
        }
        FailureResponse failureResponse = (FailureResponse) obj;
        return this.mErrorType == failureResponse.mErrorType && Objects.equals(this.mStackTrace, failureResponse.mStackTrace);
    }

    public int getErrorType() {
        return this.mErrorType;
    }

    public String getStackTrace() {
        String str = this.mStackTrace;
        str.getClass();
        return str;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mErrorType), this.mStackTrace);
    }

    private FailureResponse() {
        this.mStackTrace = null;
        this.mErrorType = 0;
    }
}
