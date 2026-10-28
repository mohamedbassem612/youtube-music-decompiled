package androidx.media3.decoder.opus;

import android.os.Handler;
import androidx.media3.decoder.CryptoConfig;
import defpackage.ahbo;
import defpackage.bse;
import defpackage.buj;
import defpackage.bwp;
import defpackage.cam;
import defpackage.cfx;
import defpackage.cgf;
import defpackage.cgu;
import defpackage.cwk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LibopusAudioRenderer extends cgu {
    public LibopusAudioRenderer() {
        super(new buj[0]);
    }

    @Override // defpackage.cgu
    protected final int d(bse bseVar) {
        int i = bseVar.S;
        int i2 = OpusLibrary.a;
        boolean z = i == 0;
        if (!OpusLibrary.a() || !"audio/opus".equalsIgnoreCase(bseVar.q)) {
            return 0;
        }
        if (((cgu) this).k.H(bwp.J(2, bseVar.I, bseVar.K))) {
            return !z ? 2 : 4;
        }
        return 1;
    }

    @Override // defpackage.cgu
    protected final /* bridge */ /* synthetic */ bse e(cam camVar) {
        OpusDecoder opusDecoder = (OpusDecoder) camVar;
        return bwp.J(true != opusDecoder.a ? 2 : 4, opusDecoder.b, 48000);
    }

    @Override // defpackage.cdp, defpackage.cdq
    public final String f() {
        return "LibopusAudioRenderer";
    }

    @Override // defpackage.cgu
    protected final /* bridge */ /* synthetic */ cam g(bse bseVar, CryptoConfig cryptoConfig) {
        int iA = ((cgu) this).k.a(bwp.J(4, bseVar.I, bseVar.K));
        int i = bseVar.r;
        if (i == -1) {
            i = 5760;
        }
        return new OpusDecoder(i, bseVar.t, cryptoConfig, iA == 2);
    }

    @Override // defpackage.cgu
    protected final /* bridge */ /* synthetic */ ahbo h(cam camVar) {
        return cwk.c(((OpusDecoder) camVar).b);
    }

    public LibopusAudioRenderer(Handler handler, cfx cfxVar, cgf cgfVar) {
        super(handler, cfxVar, cgfVar);
    }

    public LibopusAudioRenderer(buj... bujVarArr) {
        super(bujVarArr);
    }
}
