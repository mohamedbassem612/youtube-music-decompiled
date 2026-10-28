package j$.nio.file;

import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p0 implements WatchService {
    public final /* synthetic */ q0 a;

    public /* synthetic */ p0(q0 q0Var) {
        this.a = q0Var;
    }

    public static /* synthetic */ WatchService a(q0 q0Var) {
        if (q0Var == null) {
            return null;
        }
        return q0Var instanceof o0 ? ((o0) q0Var).a : new p0(q0Var);
    }

    @Override // java.nio.file.WatchService, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ((o0) this.a).close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        q0 q0Var = this.a;
        if (obj instanceof p0) {
            obj = ((p0) obj).a;
        }
        return q0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll() {
        return m0.a(((o0) this.a).b());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey take() {
        return m0.a(((o0) this.a).d());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll(long j, TimeUnit timeUnit) {
        return m0.a(((o0) this.a).c(j, timeUnit));
    }
}
