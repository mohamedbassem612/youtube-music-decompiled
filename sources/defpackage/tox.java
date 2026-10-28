package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tox extends FilterOutputStream {
    final /* synthetic */ toy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tox(toy toyVar, OutputStream outputStream) {
        super(outputStream);
        this.a = toyVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.out.close();
        } catch (IOException unused) {
            this.a.c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            this.out.flush();
        } catch (IOException unused) {
            this.a.c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        try {
            this.out.write(i);
        } catch (IOException unused) {
            this.a.c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.out.write(bArr, i, i2);
        } catch (IOException unused) {
            this.a.c = true;
        }
    }
}
