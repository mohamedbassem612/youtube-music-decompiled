package defpackage;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahwa implements qno {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private final ahvz b;

    public ahwa(ahvz ahvzVar) {
        this.b = ahvzVar;
    }

    @Override // defpackage.qno
    public final void a() {
        if (Process.isIsolated() || a.getAndSet(true)) {
            return;
        }
        afuu afuuVarD = afwt.d(209, "AndroidLoggerConfig", afux.a, true);
        try {
            ahvz ahvzVar = this.b;
            if (!agua.a.compareAndSet(false, true)) {
                throw new IllegalStateException("Logger backend configuration may only occur once.");
            }
            if (!a.ap(agug.d, ahvzVar)) {
                throw new IllegalStateException("Logger backends can only be configured once.");
            }
            agug.e();
            aguh.a.b.set(aguw.a);
            afuuVarD.close();
        } catch (Throwable th) {
            try {
                afuuVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
