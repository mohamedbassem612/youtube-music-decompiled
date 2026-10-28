package defpackage;

import android.app.Notification;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atz {
    static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addHistoricMessage(message);
    }

    public static int b(byte[] bArr) {
        return ((bArr[11] & 255) << 8) | (bArr[10] & 255);
    }

    public static long c(byte b, byte b2) {
        int i;
        int i2;
        int i3 = b & 255;
        int i4 = b & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i5 & 1);
        } else {
            i2 = i6 == 3 ? 60000 : 10000 << i6;
        }
        return ((long) i) * ((long) i2);
    }

    public static List d(byte[] bArr) {
        long jB = b(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(i((jB * 1000000000) / 48000));
        arrayList.add(i(80000000L));
        return arrayList;
    }

    public static boolean e(long j, long j2) {
        return j - j2 <= 80000;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            byte b = byteBuffer.get();
            i |= (b & 127) << (i2 * 7);
            if ((b & 128) == 0) {
                break;
            }
        }
        return i;
    }

    public static List g(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            try {
                byte b = byteBufferAsReadOnlyBuffer.get();
                int i = b >> 3;
                if (((b >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                int iF = ((b >> 1) & 1) != 0 ? f(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
                if (byteBufferAsReadOnlyBuffer.position() + iF > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position());
                ByteBuffer byteBufferDuplicate2 = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate2.limit(byteBufferAsReadOnlyBuffer.position() + iF);
                arrayList.add(new aami(i & 15, byteBufferDuplicate2));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iF);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static void h(boolean z) {
        if (z) {
            throw new bxg();
        }
    }

    private static byte[] i(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
