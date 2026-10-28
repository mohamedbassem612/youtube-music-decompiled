package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qpl extends qqk {
    public static final /* synthetic */ int a = 0;
    private final List b;

    public qpl(OutputStream outputStream, List list) {
        super(outputStream);
        this.b = list;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((qqy) it.next()).close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.out.write(i);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((qqy) it.next()).a(1);
        }
    }

    @Override // defpackage.qqk, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((qqy) it.next()).a(bArr.length);
        }
    }

    @Override // defpackage.qqk, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((qqy) it.next()).a(i2);
        }
    }
}
