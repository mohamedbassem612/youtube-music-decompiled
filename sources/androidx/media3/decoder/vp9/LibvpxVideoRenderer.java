package androidx.media3.decoder.vp9;

import android.os.Handler;
import android.view.Surface;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import app.rive.semantics.SemanticState;
import defpackage.bse;
import defpackage.cam;
import defpackage.caz;
import defpackage.csq;
import defpackage.cty;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LibvpxVideoRenderer extends csq {
    private final int l;
    private final int m;
    private final int n;
    private VpxDecoder o;

    public LibvpxVideoRenderer(long j, Handler handler, cty ctyVar, int i) {
        this(j, handler, ctyVar, i, Runtime.getRuntime().availableProcessors(), 4, 4);
    }

    @Override // defpackage.cdq
    public final int c(bse bseVar) {
        if (VpxLibrary.a() && "video/x-vnd.on2.vp9".equalsIgnoreCase(bseVar.q)) {
            return bseVar.S != 0 ? 130 : 148;
        }
        return SemanticState.Focused;
    }

    @Override // defpackage.csq
    protected final /* bridge */ /* synthetic */ cam d(bse bseVar, CryptoConfig cryptoConfig) {
        int i = bseVar.r;
        if (i == -1) {
            i = 786432;
        }
        VpxDecoder vpxDecoder = new VpxDecoder(this.l, this.m, i, cryptoConfig, this.n);
        this.o = vpxDecoder;
        return vpxDecoder;
    }

    @Override // defpackage.csq
    protected final caz e(String str, bse bseVar, bse bseVar2) {
        return new caz(str, bseVar, bseVar2, 3, 0);
    }

    @Override // defpackage.cdp, defpackage.cdq
    public final String f() {
        return "LibvpxVideoRenderer";
    }

    @Override // defpackage.csq
    protected final void g(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) throws VpxDecoderException {
        VpxDecoder vpxDecoder = this.o;
        if (vpxDecoder == null) {
            throw new VpxDecoderException("Failed to render output buffer to surface: decoder is not initialized.");
        }
        if (vpxDecoder.vpxRenderFrame(vpxDecoder.a, surface, videoDecoderOutputBuffer) == -1) {
            throw new VpxDecoderException("Buffer render failed.");
        }
        videoDecoderOutputBuffer.release();
    }

    @Override // defpackage.csq
    protected final void h(int i) {
        VpxDecoder vpxDecoder = this.o;
        if (vpxDecoder != null) {
            vpxDecoder.b = i;
        }
    }

    public LibvpxVideoRenderer(long j, Handler handler, cty ctyVar, int i, int i2, int i3, int i4) {
        super(j, handler, ctyVar, i);
        this.n = i2;
        this.l = i3;
        this.m = i4;
    }
}
