package defpackage;

import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avhr extends OutputStream {
    final /* synthetic */ avht a;

    public avhr(avht avhtVar) {
        this.a = avhtVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.c(bArr, i, i2);
    }
}
