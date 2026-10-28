package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agxa implements agxk {
    public void c(char c) {
        throw null;
    }

    @Override // defpackage.agxk
    public void f(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.agxk
    public void g(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.agxk
    public void h(byte[] bArr) {
        g(bArr, bArr.length);
    }

    @Override // defpackage.agxk
    public agxk i(CharSequence charSequence, Charset charset) {
        h(charSequence.toString().getBytes(charset));
        return this;
    }

    @Override // defpackage.agxk
    public void j(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            c(charSequence.charAt(i));
        }
    }

    @Override // defpackage.agxk
    public void k(int i) {
        throw null;
    }
}
