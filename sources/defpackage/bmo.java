package defpackage;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bmo extends MediaDataSource {
    long a;
    final /* synthetic */ bmp b;

    public bmo(bmp bmpVar) {
        this.b = bmpVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.a;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + ((long) this.b.available())) {
                        this.b.c(j);
                        this.a = j;
                    }
                }
                bmp bmpVar = this.b;
                if (i2 > bmpVar.available()) {
                    i2 = bmpVar.available();
                }
                int i3 = bmpVar.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.a += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.a = -1L;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
