package defpackage;

import android.media.AudioTrack;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class tsh implements AudioTrack.OnPlaybackPositionUpdateListener {
    final /* synthetic */ tsi a;

    public tsh(tsi tsiVar) {
        this.a = tsiVar;
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public final void onMarkerReached(AudioTrack audioTrack) {
        audioTrack.getClass();
        this.a.f();
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public final void onPeriodicNotification(AudioTrack audioTrack) {
        audioTrack.getClass();
        tsi tsiVar = this.a;
        synchronized (tsiVar) {
            if (!tsiVar.d && tsiVar.c != null && audioTrack.getPlaybackHeadPosition() >= tsiVar.b) {
                tsiVar.f();
            }
        }
    }
}
