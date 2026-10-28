package com.google.android.libraries.youtube.media.player.exo2.platypus;

import com.google.android.libraries.youtube.media.interfaces.Time;
import com.google.android.libraries.youtube.media.interfaces.VideoClip;
import defpackage.zcf;
import defpackage.zcl;
import defpackage.zik;
import java.io.Closeable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class ClipWrapper implements Closeable {
    final zcf a;
    final PlaybackControllerWrapper b;
    public VideoClip c;

    public ClipWrapper(zcf zcfVar, PlaybackControllerWrapper playbackControllerWrapper, VideoClip videoClip) {
        this.a = zcfVar;
        this.b = playbackControllerWrapper;
        this.c = videoClip;
    }

    final void a(long j) {
        VideoClip videoClip = this.c;
        if (videoClip != null) {
            Time time = Time.b;
            if (j != -1 && j > 0) {
                time = new Time(j, 1000L);
            }
            videoClip.setClipEndTime(time);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.d.j = zcl.c;
        synchronized (zik.class) {
            this.c = null;
        }
    }
}
