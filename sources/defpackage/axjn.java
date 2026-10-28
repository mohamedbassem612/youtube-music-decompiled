package defpackage;

import android.os.StrictMode;
import java.io.Closeable;
import org.chromium.base.TraceEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class axjn implements Closeable {
    public static axjn a() {
        TraceEvent traceEventC = TraceEvent.c("StrictModeContext.allowDiskReads");
        try {
            axjm axjmVar = new axjm(StrictMode.allowThreadDiskReads(), null);
            if (traceEventC != null) {
                TraceEvent.b(0L);
            }
            return axjmVar;
        } catch (Throwable th) {
            if (traceEventC != null) {
                try {
                    TraceEvent.b(0L);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static axjn b() {
        TraceEvent traceEventC = TraceEvent.c("StrictModeContext.allowDiskWrites");
        try {
            axjm axjmVar = new axjm(StrictMode.allowThreadDiskWrites(), null);
            if (traceEventC != null) {
                TraceEvent.b(0L);
            }
            return axjmVar;
        } catch (Throwable th) {
            if (traceEventC != null) {
                try {
                    TraceEvent.b(0L);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
