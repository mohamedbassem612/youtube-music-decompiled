package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qpz implements Closeable {
    private final /* synthetic */ int $cid;
    public Object a;

    public qpz(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.$cid;
        if (i == 0) {
            Object obj = this.a;
            if (obj != null) {
                ((Semaphore) obj).release();
                this.a = null;
                return;
            }
            return;
        }
        Object obj2 = this.a;
        if (i != 1) {
            if (obj2 != null) {
                ((Semaphore) obj2).release();
                this.a = null;
                return;
            }
            return;
        }
        if (obj2 != null) {
            ((FileLock) obj2).release();
            this.a = null;
        }
    }

    public qpz(Semaphore semaphore, int i, byte[] bArr) {
        this.$cid = i;
        this.a = semaphore;
    }
}
