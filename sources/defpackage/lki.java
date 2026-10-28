package defpackage;

import android.os.ParcelFileDescriptor;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lki extends FileInputStream implements InputStreamRetargetInterface, qqd, qpv {
    private final ParcelFileDescriptor a;

    public lki(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.qqd
    public final Long a() {
        return Long.valueOf(this.a.getStatSize());
    }

    @Override // defpackage.qpv
    public final FileChannel b() {
        return getChannel();
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            super.close();
        } finally {
            this.a.close();
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
