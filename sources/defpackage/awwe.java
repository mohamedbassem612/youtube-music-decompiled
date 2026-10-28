package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awwe extends CancellationException implements awuo {
    private final transient awwd a;

    public awwe(String str, Throwable th, awwd awwdVar) {
        super(str);
        this.a = awwdVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.awuo
    public final /* bridge */ /* synthetic */ Throwable a() {
        if (!awuv.a) {
            return null;
        }
        String message = getMessage();
        message.getClass();
        return new awwe(message, this, b());
    }

    public final awwd b() {
        awwd awwdVar = this.a;
        return awwdVar == null ? awwq.a : awwdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awwe) {
            awwe awweVar = (awwe) obj;
            if (awrc.c(awweVar.getMessage(), getMessage()) && awrc.c(awweVar.b(), b()) && awrc.c(awweVar.getCause(), getCause())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (awuv.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = (message.hashCode() * 31) + b().hashCode();
        Throwable cause = getCause();
        return (iHashCode * 31) + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + b();
    }
}
