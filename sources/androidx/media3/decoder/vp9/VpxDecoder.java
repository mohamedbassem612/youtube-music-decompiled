package androidx.media3.decoder.vp9;

import android.view.Surface;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import defpackage.bwp;
import defpackage.caj;
import defpackage.cak;
import defpackage.can;
import defpackage.cap;
import defpackage.caq;
import defpackage.cas;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class VpxDecoder extends cas {
    public final long a;
    public volatile int b;
    private final CryptoConfig c;
    private ByteBuffer d;

    public VpxDecoder(int i, int i2, int i3, CryptoConfig cryptoConfig, int i4) throws VpxDecoderException {
        super(new DecoderInputBuffer[i], new VideoDecoderOutputBuffer[i2]);
        if (!VpxLibrary.a()) {
            throw new VpxDecoderException("Failed to load decoder native libraries.");
        }
        this.c = cryptoConfig;
        if (cryptoConfig != null && !VpxLibrary.vpxIsSecureDecodeSupported()) {
            throw new VpxDecoderException("Vpx decoder does not support secure decode.");
        }
        long jVpxInit = vpxInit(false, false, i4);
        this.a = jVpxInit;
        if (jVpxInit == 0) {
            throw new VpxDecoderException("Failed to initialize decoder");
        }
        i(i3);
    }

    private native long vpxClose(long j);

    private native long vpxDecode(long j, ByteBuffer byteBuffer, int i);

    private native int vpxGetErrorCode(long j);

    private native String vpxGetErrorMessage(long j);

    private native int vpxGetFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    private native long vpxInit(boolean z, boolean z2, int i);

    private native int vpxReleaseFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    private native long vpxSecureDecode(long j, ByteBuffer byteBuffer, int i, CryptoConfig cryptoConfig, int i2, byte[] bArr, byte[] bArr2, int i3, int[] iArr, int[] iArr2);

    @Override // defpackage.cas
    protected final /* synthetic */ can a(Throwable th) {
        return new VpxDecoderException("Unexpected decode error", th);
    }

    @Override // defpackage.cas
    protected final /* bridge */ /* synthetic */ can b(DecoderInputBuffer decoderInputBuffer, caq caqVar, boolean z) {
        VpxDecoder vpxDecoder;
        long jVpxDecode;
        ByteBuffer byteBuffer;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) caqVar;
        if (z && (byteBuffer = this.d) != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.data;
        int i = bwp.a;
        int iLimit = byteBuffer2.limit();
        cak cakVar = decoderInputBuffer.cryptoInfo;
        boolean zIsEncrypted = decoderInputBuffer.isEncrypted();
        long j = this.a;
        if (zIsEncrypted) {
            CryptoConfig cryptoConfig = this.c;
            int i2 = cakVar.c;
            byte[] bArr = cakVar.b;
            bArr.getClass();
            byte[] bArr2 = cakVar.a;
            bArr2.getClass();
            vpxDecoder = this;
            jVpxDecode = vpxDecoder.vpxSecureDecode(j, byteBuffer2, iLimit, cryptoConfig, i2, bArr, bArr2, cakVar.f, cakVar.d, cakVar.e);
        } else {
            vpxDecoder = this;
            jVpxDecode = vpxDecoder.vpxDecode(j, byteBuffer2, iLimit);
        }
        if (jVpxDecode != 0) {
            long j2 = vpxDecoder.a;
            if (jVpxDecode != -2) {
                return new VpxDecoderException("Decode error: ".concat(String.valueOf(vpxDecoder.vpxGetErrorMessage(j2))));
            }
            String strValueOf = String.valueOf(vpxDecoder.vpxGetErrorMessage(j2));
            vpxDecoder.vpxGetErrorCode(j2);
            String strConcat = "Drm error: ".concat(strValueOf);
            return new VpxDecoderException(strConcat, new caj(strConcat));
        }
        if (decoderInputBuffer.hasSupplementalData()) {
            ByteBuffer byteBuffer3 = decoderInputBuffer.supplementalData;
            byteBuffer3.getClass();
            int iRemaining = byteBuffer3.remaining();
            if (iRemaining > 0) {
                ByteBuffer byteBuffer4 = vpxDecoder.d;
                if (byteBuffer4 == null || byteBuffer4.capacity() < iRemaining) {
                    vpxDecoder.d = ByteBuffer.allocate(iRemaining);
                } else {
                    vpxDecoder.d.clear();
                }
                vpxDecoder.d.put(byteBuffer3);
                vpxDecoder.d.flip();
            }
        }
        if (vpxDecoder.k(decoderInputBuffer.timeUs)) {
            videoDecoderOutputBuffer.init(decoderInputBuffer.timeUs, vpxDecoder.b, vpxDecoder.d);
            int iVpxGetFrame = vpxDecoder.vpxGetFrame(vpxDecoder.a, videoDecoderOutputBuffer);
            if (iVpxGetFrame == 1) {
                videoDecoderOutputBuffer.shouldBeSkipped = true;
            } else if (iVpxGetFrame == -1) {
                return new VpxDecoderException("Buffer initialization failed.");
            }
            videoDecoderOutputBuffer.format = decoderInputBuffer.format;
        } else {
            videoDecoderOutputBuffer.shouldBeSkipped = true;
        }
        return null;
    }

    @Override // defpackage.cas
    protected final DecoderInputBuffer c() {
        return new DecoderInputBuffer(2);
    }

    @Override // defpackage.cas
    protected final /* bridge */ /* synthetic */ caq e() {
        return new VideoDecoderOutputBuffer(new cap() { // from class: androidx.media3.decoder.vp9.VpxDecoder$$ExternalSyntheticLambda0
            @Override // defpackage.cap
            public final void a(caq caqVar) {
                this.a.l((VideoDecoderOutputBuffer) caqVar);
            }
        });
    }

    @Override // defpackage.cam
    public final String getName() {
        return "libvpx".concat(String.valueOf(VpxLibrary.a() ? VpxLibrary.vpxGetVersion() : null));
    }

    protected final void l(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        if (this.b == 1 && !videoDecoderOutputBuffer.shouldBeSkipped) {
            vpxReleaseFrame(this.a, videoDecoderOutputBuffer);
        }
        super.h(videoDecoderOutputBuffer);
    }

    @Override // defpackage.cas, defpackage.cam
    public final void release() {
        super.release();
        this.d = null;
        vpxClose(this.a);
    }

    public native int vpxRenderFrame(long j, Surface surface, VideoDecoderOutputBuffer videoDecoderOutputBuffer);
}
