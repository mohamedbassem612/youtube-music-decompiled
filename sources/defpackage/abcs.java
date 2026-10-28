package defpackage;

import androidx.media3.decoder.VideoDecoderOutputBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abcs {
    public static final axr a = new axt(4);
    public VideoDecoderOutputBuffer b;
    public abcr c;

    public abcs(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.b = videoDecoderOutputBuffer;
    }

    public final int a() {
        return this.b.height;
    }

    public final void b() {
        this.b.release();
        a.b(this);
    }

    public final int[] c() {
        return this.b.yuvStrides;
    }
}
