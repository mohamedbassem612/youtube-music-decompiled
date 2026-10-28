package defpackage;

import android.media.MediaCodec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class clm extends can {
    public final clo a;
    public final int b;

    public clm(Throwable th, clo cloVar) {
        int errorCode;
        super("Decoder failed: ".concat(String.valueOf(cloVar == null ? null : cloVar.b)), th);
        this.a = cloVar;
        if (th instanceof MediaCodec.CodecException) {
            ((MediaCodec.CodecException) th).getDiagnosticInfo();
            errorCode = ((MediaCodec.CodecException) th).getErrorCode();
        } else {
            errorCode = 0;
        }
        this.b = errorCode;
    }
}
