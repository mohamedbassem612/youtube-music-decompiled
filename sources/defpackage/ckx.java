package defpackage;

import android.os.HandlerThread;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ckx implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ ckx(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // defpackage.agfr
    public final Object io() {
        HandlerThread handlerThread;
        int i = this.$cid;
        if (i == 0) {
            handlerThread = new HandlerThread(ckz.d(this.a, "ExoPlayer:MediaCodecQueueingThread:"));
        } else {
            if (i != 1) {
                int i2 = this.a;
                return i != 2 ? Integer.valueOf(i2) : Integer.valueOf(i2);
            }
            handlerThread = new HandlerThread(ckz.d(this.a, "ExoPlayer:MediaCodecAsyncAdapter:"));
        }
        return handlerThread;
    }
}
