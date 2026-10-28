package defpackage;

import app.rive.semantics.SemanticState;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avhq extends OutputStream {
    public final List a = new ArrayList();
    private axst b;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.b == null) {
            axst axstVarS = avjt.s(Math.max(SemanticState.Obscured, i2));
            this.b = axstVarS;
            this.a.add(axstVarS);
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, this.b.h());
            axst axstVar = this.b;
            if (iMin == 0) {
                axst axstVarS2 = avjt.s(Math.max(i2, axstVar.g() << 1));
                this.b = axstVarS2;
                this.a.add(axstVarS2);
            } else {
                axstVar.i(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte b = (byte) i;
        axst axstVar = this.b;
        if (axstVar != null && axstVar.h() > 0) {
            ((ByteBuffer) this.b.a).put(b);
        } else {
            write(new byte[]{b}, 0, 1);
        }
    }
}
