package defpackage;

import androidx.media3.decoder.DecoderInputBuffer;
import app.rive.semantics.SemanticState;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cue extends cav {
    private final DecoderInputBuffer k;
    private final bwb l;
    private cud m;
    private long n;

    public cue() {
        super(6);
        this.k = new DecoderInputBuffer(1);
        this.l = new bwb();
    }

    private final void a() {
        cud cudVar = this.m;
        if (cudVar != null) {
            cudVar.b();
        }
    }

    @Override // defpackage.cav, defpackage.cdm
    public final void A(int i, Object obj) {
        if (i == 8) {
            this.m = (cud) obj;
        }
    }

    @Override // defpackage.cav
    protected final void D() {
        a();
    }

    @Override // defpackage.cav
    protected final void G(long j, boolean z, boolean z2) {
        this.n = Long.MIN_VALUE;
        a();
    }

    @Override // defpackage.cdp
    public final void af(long j, long j2) {
        float[] fArr;
        while (!X() && this.n < 100000 + j) {
            DecoderInputBuffer decoderInputBuffer = this.k;
            decoderInputBuffer.clear();
            if (k(r(), decoderInputBuffer, 0) != -4 || decoderInputBuffer.isEndOfStream()) {
                return;
            }
            long j3 = decoderInputBuffer.timeUs;
            this.n = j3;
            long j4 = this.e;
            if (this.m != null && j3 >= j4) {
                decoderInputBuffer.flip();
                ByteBuffer byteBuffer = decoderInputBuffer.data;
                int i = bwp.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    bwb bwbVar = this.l;
                    bwbVar.N(byteBuffer.array(), byteBuffer.limit());
                    bwbVar.P(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(bwbVar.j());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.m.a(this.n - this.d, fArr);
                }
            }
        }
    }

    @Override // defpackage.cdp
    public final boolean ag() {
        return X();
    }

    @Override // defpackage.cdp
    public final boolean ah() {
        return true;
    }

    @Override // defpackage.cdq
    public final int c(bse bseVar) {
        if ("application/x-camera-motion".equals(bseVar.q)) {
            return 132;
        }
        return SemanticState.Focused;
    }

    @Override // defpackage.cdp, defpackage.cdq
    public final String f() {
        return "CameraMotionRenderer";
    }
}
