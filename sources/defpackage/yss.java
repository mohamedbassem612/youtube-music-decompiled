package defpackage;

import com.google.android.libraries.youtube.media.interfaces.NetFetchCallbacks;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yss implements ypx {
    public final NetFetchCallbacks a;

    public yss(NetFetchCallbacks netFetchCallbacks) {
        this.a = netFetchCallbacks;
    }

    @Override // defpackage.ypx
    public final void a(ByteBuffer byteBuffer) {
        synchronized (zik.class) {
            this.a.onBodyData(byteBuffer);
        }
    }

    @Override // defpackage.ypx
    public final void b(boolean z) {
        synchronized (zik.class) {
            this.a.onDone(null, z);
        }
    }
}
