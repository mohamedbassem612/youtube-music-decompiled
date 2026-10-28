package j$.nio.file;

import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o0 implements q0 {
    public final /* synthetic */ WatchService a;

    public /* synthetic */ o0(WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ q0 a(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return watchService instanceof p0 ? ((p0) watchService).a : new o0(watchService);
    }

    public final /* synthetic */ n0 b() {
        return l0.b(this.a.poll());
    }

    public final /* synthetic */ n0 c(long j, TimeUnit timeUnit) {
        return l0.b(this.a.poll(j, timeUnit));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ n0 d() {
        return l0.b(this.a.take());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.a;
        if (obj instanceof o0) {
            obj = ((o0) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
