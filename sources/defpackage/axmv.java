package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axmv implements Runnable {
    final /* synthetic */ CronetBidirectionalStream a;
    private ByteBuffer b;
    private final boolean c;

    public axmv(CronetBidirectionalStream cronetBidirectionalStream, ByteBuffer byteBuffer, boolean z) {
        this.a = cronetBidirectionalStream;
        this.b = byteBuffer;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ByteBuffer byteBuffer = this.b;
            this.b = null;
            CronetBidirectionalStream cronetBidirectionalStream = this.a;
            synchronized (cronetBidirectionalStream.n) {
                if (cronetBidirectionalStream.g()) {
                    return;
                }
                boolean z = false;
                if (this.c) {
                    cronetBidirectionalStream.t = 10;
                    if (cronetBidirectionalStream.s == 4) {
                        z = true;
                    }
                }
                CronetBidirectionalStream cronetBidirectionalStream2 = this.a;
                cronetBidirectionalStream2.c.onWriteCompleted(cronetBidirectionalStream2, cronetBidirectionalStream2.u, byteBuffer, this.c);
                if (z) {
                    cronetBidirectionalStream2.d();
                }
            }
        } catch (Exception e) {
            this.a.e(e);
        }
    }
}
