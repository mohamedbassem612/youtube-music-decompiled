package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SyncFailedException;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lkj extends FileOutputStream implements qqe, qpv {
    private final ParcelFileDescriptor a;

    public lkj(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.qqe
    public final void a() throws SyncFailedException {
        getFD().sync();
    }

    @Override // defpackage.qpv
    public final FileChannel b() {
        return getChannel();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            super.close();
        } finally {
            this.a.close();
        }
    }
}
