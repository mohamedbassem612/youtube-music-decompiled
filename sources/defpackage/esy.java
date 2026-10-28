package defpackage;

import app.rive.semantics.SemanticState;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class esy implements Closeable {
    public final Charset a;
    public int b;
    private final InputStream c;
    private byte[] d;
    private int e;

    public esy(InputStream inputStream, Charset charset) {
        charset.getClass();
        if (!charset.equals(esz.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.c = inputStream;
        this.a = charset;
        this.d = new byte[SemanticState.Multiline];
    }

    private final void b() throws IOException {
        byte[] bArr = this.d;
        int length = bArr.length;
        int i = this.c.read(bArr, 0, SemanticState.Multiline);
        if (i == -1) {
            throw new EOFException();
        }
        this.e = 0;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    final String a() {
        int i;
        byte[] bArr;
        String string;
        int i2;
        synchronized (this.c) {
            if (this.d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.e >= this.b) {
                b();
            }
            for (int i3 = this.e; i3 != this.b; i3++) {
                byte[] bArr2 = this.d;
                if (bArr2[i3] == 10) {
                    int i4 = this.e;
                    if (i3 != i4) {
                        i2 = i3 - 1;
                        if (bArr2[i2] != 13) {
                            i2 = i3;
                        }
                    } else {
                        i2 = i3;
                    }
                    string = new String(bArr2, i4, i2 - i4, this.a.name());
                    this.e = i3 + 1;
                }
            }
            esx esxVar = new esx(this, (this.b - this.e) + 80);
            loop1: while (true) {
                byte[] bArr3 = this.d;
                int i5 = this.e;
                esxVar.write(bArr3, i5, this.b - i5);
                this.b = -1;
                b();
                i = this.e;
                while (i != this.b) {
                    bArr = this.d;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.e;
            if (i != i6) {
                esxVar.write(bArr, i6, i - i6);
            }
            this.e = i + 1;
            string = esxVar.toString();
        }
        return string;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.c;
        synchronized (inputStream) {
            if (this.d != null) {
                this.d = null;
                inputStream.close();
            }
        }
    }
}
