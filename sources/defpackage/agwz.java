package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class agwz implements agxj {
    @Override // defpackage.agxj
    public final agxi a(ByteBuffer byteBuffer) {
        agxk agxkVarD = d(byteBuffer.remaining());
        agxkVarD.f(byteBuffer);
        return agxkVarD.o();
    }

    public final agxi b(byte[] bArr) {
        return e(bArr, bArr.length);
    }

    @Override // defpackage.agxj
    public final agxi c(CharSequence charSequence, Charset charset) {
        return f().i(charSequence, charset).o();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public agxk d(int i) {
        ahno.I((i ^ (-1)) >>> 31, "expectedInputSize must be >= 0 but was %s", i);
        return f();
    }

    public agxi e(byte[] bArr, int i) {
        ahno.N(0, i, bArr.length);
        agxk agxkVarD = d(i);
        agxkVarD.g(bArr, i);
        return agxkVarD.o();
    }
}
