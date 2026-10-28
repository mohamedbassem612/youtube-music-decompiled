package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agyn {
    public static final FileInputStream a(File file) {
        return new FileInputStream(file);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    public static final byte[] b(File file, ahng ahngVar) throws Throwable {
        agyk agykVar = new agyk();
        try {
            FileInputStream fileInputStreamA = a(file);
            agykVar.b(fileInputStreamA);
            long size = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStreamA.getChannel()).size();
            int i = agyi.a;
            ahno.J(((size > 0L ? 1 : (size == 0L ? 0 : -1)) ^ (-1)) >>> 31, "expectedSize (%s) must be non-negative", size);
            if (size > 2147483639) {
                throw new OutOfMemoryError(size + " bytes is too large to fit in a byte array");
            }
            int i2 = (int) size;
            byte[] bArrC = new byte[i2];
            int i3 = i2;
            while (i3 > 0) {
                int i4 = i2 - i3;
                int i5 = fileInputStreamA.read(bArrC, i4, i3);
                if (i5 == -1) {
                    bArrC = Arrays.copyOf(bArrC, i4);
                    agykVar.close();
                    return bArrC;
                }
                i3 -= i5;
            }
            int i6 = fileInputStreamA.read();
            if (i6 != -1) {
                ArrayDeque arrayDeque = new ArrayDeque(22);
                arrayDeque.add(bArrC);
                arrayDeque.add(new byte[]{(byte) i6});
                bArrC = agyi.c(fileInputStreamA, arrayDeque, i2 + 1);
            }
            agykVar.close();
            return bArrC;
        } catch (Throwable th) {
            try {
                throw agykVar.a(th);
            } catch (Throwable th2) {
                agykVar.close();
                throw th2;
            }
        }
    }
}
