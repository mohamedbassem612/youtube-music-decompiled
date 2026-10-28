package androidx.media3.decoder.av1;

import android.os.Handler;
import android.view.Surface;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import app.rive.semantics.SemanticState;
import defpackage.bse;
import defpackage.bwp;
import defpackage.cam;
import defpackage.caz;
import defpackage.csq;
import defpackage.cty;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class Libdav1dVideoRenderer extends csq {
    private static final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final boolean q;
    private final int r;
    private Dav1dDecoder s;

    static {
        int i = bwp.a;
        l = 737280;
    }

    public Libdav1dVideoRenderer(long j, Handler handler, cty ctyVar, int i) {
        this(j, handler, ctyVar, i, 0, 2, 4, 4, false, -99);
    }

    @Override // defpackage.cdq
    public final int c(bse bseVar) {
        if ("video/av01".equalsIgnoreCase(bseVar.q) && Dav1dLibrary.isAvailable()) {
            return bseVar.S != 0 ? 130 : 148;
        }
        return SemanticState.Focused;
    }

    @Override // defpackage.csq
    protected final /* bridge */ /* synthetic */ cam d(bse bseVar, CryptoConfig cryptoConfig) {
        int i = bseVar.r;
        if (i == -1) {
            i = l;
        }
        Dav1dDecoder dav1dDecoder = new Dav1dDecoder(this.m, this.n, i, this.o, this.p, this.q, this.r);
        this.s = dav1dDecoder;
        return dav1dDecoder;
    }

    @Override // defpackage.csq
    protected final caz e(String str, bse bseVar, bse bseVar2) {
        return new caz(str, bseVar, bseVar2, 3, 0);
    }

    @Override // defpackage.cdp, defpackage.cdq
    public final String f() {
        return "Libdav1dVideoRenderer";
    }

    @Override // defpackage.csq
    protected final void g(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) throws Dav1dDecoderException {
        Dav1dDecoder dav1dDecoder = this.s;
        if (dav1dDecoder == null) {
            throw new Dav1dDecoderException("Failed to render output buffer to surface: decoder is not initialized.", -1);
        }
        try {
            dav1dDecoder.renderToSurface(videoDecoderOutputBuffer, surface);
        } finally {
            videoDecoderOutputBuffer.release();
        }
    }

    @Override // defpackage.csq
    protected final void h(int i) {
        Dav1dDecoder dav1dDecoder = this.s;
        if (dav1dDecoder != null) {
            dav1dDecoder.setOutputMode(i);
        }
    }

    public Libdav1dVideoRenderer(long j, Handler handler, cty ctyVar, int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        super(j, handler, ctyVar, i);
        this.o = i2;
        this.m = i4;
        this.n = i5;
        this.p = i3;
        this.q = z;
        this.r = i6;
    }
}
