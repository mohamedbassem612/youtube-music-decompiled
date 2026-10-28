package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import androidx.media3.decoder.VideoDecoderOutputBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ctk extends GLSurfaceView implements ctl {
    private final ctj a;

    public ctk(Context context) {
        super(context, null);
        ctj ctjVar = new ctj(this);
        this.a = ctjVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(ctjVar);
        setRenderMode(0);
    }

    @Override // defpackage.ctl
    public final void jL(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        ctj ctjVar = this.a;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = (VideoDecoderOutputBuffer) ctjVar.b.getAndSet(videoDecoderOutputBuffer);
        if (videoDecoderOutputBuffer2 != null) {
            videoDecoderOutputBuffer2.release();
        }
        ctjVar.a.requestRender();
    }
}
