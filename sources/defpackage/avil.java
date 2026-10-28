package defpackage;

import java.io.Closeable;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public interface avil extends Closeable {
    void b();

    void c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean d();

    int e();

    int f();

    avil g(int i);

    void i(OutputStream outputStream, int i);

    void j(byte[] bArr, int i, int i2);

    void k(int i);
}
