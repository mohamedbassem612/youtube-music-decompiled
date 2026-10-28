package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fff {
    public static final /* synthetic */ int a = 0;
    private static final AtomicReference b = new AtomicReference();

    public static ByteBuffer a(InputStream inputStream, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) b.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                b.set(bArr);
                throw th;
            }
        }
        b.set(bArr);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return z ? ByteBuffer.wrap(byteArray) : b(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static void c(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        b(byteBuffer);
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                fileChannelConvertMaybeLegacyFileChannelFromLibrary.write(byteBuffer);
                fileChannelConvertMaybeLegacyFileChannelFromLibrary.force(false);
                fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                randomAccessFile.close();
                if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                    try {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                    } catch (IOException unused) {
                    }
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                    try {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static byte[] d(ByteBuffer byteBuffer) {
        aerm aermVar = null;
        if (!byteBuffer.isReadOnly() && byteBuffer.hasArray()) {
            aermVar = new aerm(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        }
        if (aermVar != null && aermVar.b == 0 && aermVar.a == ((byte[]) aermVar.c).length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        b(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }
}
