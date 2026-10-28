package defpackage;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aepf extends Handler {
    final /* synthetic */ aerj a;

    public aepf(aerj aerjVar) {
        this.a = aerjVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        Throwable thrown = logRecord.getThrown();
        if (thrown != null) {
            ((aciz) this.a.e.io()).r(Thread.currentThread(), thrown);
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
