package defpackage;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class szo extends Handler implements szy {
    private final szy a;

    public szo(szy szyVar) {
        this.a = szyVar;
    }

    @Override // defpackage.szy
    public final void a(Throwable th) {
        this.a.a(th);
    }

    @Override // defpackage.szy
    public final /* synthetic */ void c(Throwable th) {
        if (th != null) {
            a(th);
        }
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        if (!Level.SEVERE.equals(logRecord.getLevel()) || logRecord.getThrown() == null) {
            return;
        }
        a(logRecord.getThrown());
    }

    @Override // defpackage.szy
    public final /* synthetic */ void b() {
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // defpackage.szy
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.szy
    public final /* synthetic */ void e() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
