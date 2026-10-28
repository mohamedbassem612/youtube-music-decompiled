package defpackage;

import com.google.android.libraries.youtube.media.interfaces.QoeError;
import com.google.android.libraries.youtube.media.interfaces.VideoplaybackUmpParserCallbacks;
import com.google.protos.youtube.api.innertube.NextRequestPolicyOuterClass$NextRequestPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ypt extends VideoplaybackUmpParserCallbacks {
    final /* synthetic */ ypu a;
    private final xeu b;
    private final ywn c;

    public ypt(ypu ypuVar, xeu xeuVar, ywn ywnVar) {
        this.a = ypuVar;
        this.b = xeuVar;
        this.c = ywnVar;
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.VideoplaybackUmpParserCallbacks
    public final void onError(QoeError qoeError) {
        try {
            ypu ypuVar = this.a;
            if (ypuVar.f) {
                return;
            }
            ypuVar.f = true;
            this.c.k(new zhz(qoeError.getCode(), 0L));
        } catch (Throwable th) {
            yno.R(this.c, th);
            yno.Q(this.b, th, "Fail to onError");
            if (!this.a.g) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.VideoplaybackUmpParserCallbacks
    public final void onMedia(int i, int i2) {
        try {
            ypu ypuVar = this.a;
            ByteBuffer byteBuffer = ypuVar.b;
            byteBuffer.position(i);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.limit(i2);
            ypuVar.e.addLast(byteBufferSlice);
        } catch (Throwable th) {
            yno.R(this.c, th);
            yno.Q(this.b, th, "Fail to onMedia");
            if (!this.a.g) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.VideoplaybackUmpParserCallbacks
    public final void onNextRequestPolicy(NextRequestPolicyOuterClass$NextRequestPolicy nextRequestPolicyOuterClass$NextRequestPolicy) {
        try {
            xxj xxjVar = this.a.i;
            if (xxjVar != null) {
                ((yzj) xxjVar.a).m(nextRequestPolicyOuterClass$NextRequestPolicy);
            }
        } catch (Throwable th) {
            yno.R(this.c, th);
            yno.Q(this.b, th, "Fail to onNextRequestPolicy");
            if (!this.a.g) {
                throw th;
            }
        }
    }
}
