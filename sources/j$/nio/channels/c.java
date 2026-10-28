package j$.nio.channels;

import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileLock;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c implements Channel {
    public abstract void a(boolean z);

    public abstract Future b(long j, long j2, boolean z);

    public abstract void c(long j, long j2, boolean z, Object obj, f fVar);

    public abstract Future d(ByteBuffer byteBuffer, long j);

    public abstract void e(ByteBuffer byteBuffer, long j, Object obj, f fVar);

    public abstract c f(long j);

    public abstract FileLock g(long j, long j2, boolean z);

    public abstract Future h(ByteBuffer byteBuffer, long j);

    public abstract void i(ByteBuffer byteBuffer, long j, Object obj, f fVar);

    public abstract long size();
}
