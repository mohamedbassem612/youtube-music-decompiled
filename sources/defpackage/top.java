package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class top implements tos {
    private final InputStream[] a;

    public top(InputStream[] inputStreamArr) {
        this.a = inputStreamArr;
    }

    @Override // defpackage.tos
    public final InputStream a() {
        return this.a[0];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = 0;
        while (true) {
            InputStream[] inputStreamArr = this.a;
            if (i >= inputStreamArr.length) {
                return;
            }
            InputStream inputStream = inputStreamArr[i];
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            i++;
        }
    }
}
