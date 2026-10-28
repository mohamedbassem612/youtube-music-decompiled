package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axmu implements Runnable {
    public ByteBuffer a;
    public boolean b;
    final /* synthetic */ CronetBidirectionalStream c;

    public axmu(CronetBidirectionalStream cronetBidirectionalStream) {
        this.c = cronetBidirectionalStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ByteBuffer byteBuffer = this.a;
            this.a = null;
            CronetBidirectionalStream cronetBidirectionalStream = this.c;
            synchronized (cronetBidirectionalStream.n) {
                if (cronetBidirectionalStream.g()) {
                    return;
                }
                boolean z = false;
                if (this.b) {
                    cronetBidirectionalStream.s = 4;
                    if (cronetBidirectionalStream.t == 10) {
                        z = true;
                    }
                } else {
                    cronetBidirectionalStream.s = 2;
                }
                CronetBidirectionalStream cronetBidirectionalStream2 = this.c;
                cronetBidirectionalStream2.c.onReadCompleted(cronetBidirectionalStream2, cronetBidirectionalStream2.u, byteBuffer, this.b);
                if (z) {
                    cronetBidirectionalStream2.d();
                }
            }
        } catch (Exception e) {
            this.c.e(e);
        }
    }
}
