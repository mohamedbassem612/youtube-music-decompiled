package defpackage;

import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agyi {
    public static final /* synthetic */ int a = 0;

    static {
        new agyh();
    }

    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        inputStream.getClass();
        outputStream.getClass();
        byte[] bArr = new byte[SemanticState.Multiline];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return j;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    public static byte[] b(InputStream inputStream) {
        inputStream.getClass();
        return c(inputStream, new ArrayDeque(20), 0);
    }

    public static byte[] c(InputStream inputStream, Queue queue, int i) throws IOException {
        int i2;
        int iMin = Math.min(SemanticState.Multiline, Math.max(SemanticState.Focused, Integer.highestOneBit(i) << 1));
        loop0: while (true) {
            i2 = 2147483639;
            if (i >= 2147483639) {
                if (inputStream.read() == -1) {
                    break;
                }
                throw new OutOfMemoryError("input is too large to fit in a byte array");
            }
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i3 = 0;
            while (i3 < iMin2) {
                int i4 = inputStream.read(bArr, i3, iMin2 - i3);
                if (i4 == -1) {
                    i2 = i;
                    break loop0;
                }
                i3 += i4;
                i += i4;
            }
            iMin = ahng.P(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        return a.h(queue, i2);
    }

    public static int d(InputStream inputStream, byte[] bArr, int i) throws IOException {
        inputStream.getClass();
        int i2 = 0;
        ahno.N(0, i, bArr.length);
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        return i2;
    }
}
