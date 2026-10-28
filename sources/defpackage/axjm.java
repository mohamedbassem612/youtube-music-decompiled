package defpackage;

import android.os.StrictMode;
import internal.J.N;
import org.chromium.base.EarlyTraceEvent;
import org.chromium.base.TraceEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axjm extends axjn {
    private final StrictMode.ThreadPolicy a;
    private final StrictMode.VmPolicy b;

    public axjm(StrictMode.ThreadPolicy threadPolicy, StrictMode.VmPolicy vmPolicy) {
        this.a = threadPolicy;
        this.b = vmPolicy;
    }

    @Override // defpackage.axjn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.b;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
        long jHashCode = hashCode();
        int i = EarlyTraceEvent.a;
        if (TraceEvent.a) {
            N.MffNhCLU(jHashCode);
        }
    }
}
