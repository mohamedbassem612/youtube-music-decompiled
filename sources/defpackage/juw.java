package defpackage;

import android.view.Surface;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import androidx.media3.decoder.av1.Dav1dDecoder;
import androidx.media3.decoder.av1.Dav1dDecoderException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class juw implements cam {
    private final Dav1dDecoder a;

    public juw(Dav1dDecoder dav1dDecoder) {
        this.a = dav1dDecoder;
    }

    @Override // defpackage.cam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final DecoderInputBuffer dequeueInputBuffer() {
        return this.a.dequeueInputBuffer();
    }

    @Override // defpackage.cam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final VideoDecoderOutputBuffer dequeueOutputBuffer() {
        return this.a.dequeueOutputBuffer();
    }

    @Override // defpackage.cam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void queueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        this.a.queueInputBuffer(decoderInputBuffer);
    }

    public final void d(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) throws Dav1dDecoderException {
        this.a.renderToSurface(videoDecoderOutputBuffer, surface);
    }

    public final void e(int i) {
        this.a.setOutputMode(i);
    }

    @Override // defpackage.cam
    public final void flush() {
        this.a.flush();
    }

    @Override // defpackage.cam
    public final String getName() {
        return this.a.getName();
    }

    @Override // defpackage.cam
    public final void release() {
        this.a.release();
    }

    @Override // defpackage.cam
    public final void setOutputStartTimeUs(long j) {
        this.a.setOutputStartTimeUs(j);
    }

    @Override // defpackage.cam
    public final /* synthetic */ void setCallback(cal calVar, Executor executor) {
    }
}
