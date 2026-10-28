package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cgm extends AudioTrack$StreamEventCallback {
    final /* synthetic */ cgn a;

    public cgm(cgn cgnVar) {
        this.a = cgnVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        this.a.c.p.h(-1, new cce(15));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.p.h(-1, new cce(16));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.p.h(-1, new cce(15));
    }
}
