package j$.desugar.sun.nio.fs;

import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class f extends FileLock {
    public final FileLock a;

    public f(FileLock fileLock, e eVar) {
        super(eVar, fileLock.position(), fileLock.size(), fileLock.isShared());
        this.a = fileLock;
    }

    @Override // java.nio.channels.FileLock
    public final boolean isValid() {
        return this.a.isValid();
    }

    @Override // java.nio.channels.FileLock
    public final void release() throws IOException {
        this.a.release();
    }
}
