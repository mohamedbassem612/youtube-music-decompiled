package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agxv extends agxd {
    private long b = 0;
    private long c = 0;
    private int d = 0;

    @Override // defpackage.agxd
    protected final agxi b() {
        long j = this.b;
        long j2 = this.d;
        long j3 = this.c ^ j2;
        long j4 = (j ^ j2) + j3;
        long j5 = j3 + j4;
        long j6 = (j4 ^ (j4 >>> 33)) * (-49064778989728563L);
        long j7 = (j5 ^ (j5 >>> 33)) * (-49064778989728563L);
        long j8 = (j6 ^ (j6 >>> 33)) * (-4265267296055464877L);
        long j9 = (j7 ^ (j7 >>> 33)) * (-4265267296055464877L);
        long j10 = j9 ^ (j9 >>> 33);
        long j11 = (j8 ^ (j8 >>> 33)) + j10;
        this.b = j11;
        this.c = j10 + j11;
        byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.b).putLong(this.c).array();
        int i = agxi.b;
        return new agxf(bArrArray);
    }

    @Override // defpackage.agxd
    protected final void e(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong() * (-8663945395140668459L);
        long j2 = byteBuffer.getLong();
        long jRotateLeft = this.b ^ (Long.rotateLeft(j, 31) * 5545529020109919103L);
        this.b = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j3 = this.c;
        this.b = ((jRotateLeft2 + j3) * 5) + 1390208809;
        long jRotateLeft3 = j3 ^ (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L));
        this.c = jRotateLeft3;
        this.c = ((Long.rotateLeft(jRotateLeft3, 31) + this.b) * 5) + 944331445;
        this.d += 16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.agxd
    protected final void l(ByteBuffer byteBuffer) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        this.d += byteBuffer.remaining();
        long j8 = 0;
        switch (byteBuffer.remaining()) {
            case 1:
                j = 0;
                j7 = ((long) (byteBuffer.get(0) & 255)) ^ j;
                this.b ^= Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L;
                this.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                return;
            case 2:
                j2 = 0;
                j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                j7 = ((long) (byteBuffer.get(0) & 255)) ^ j;
                this.b ^= Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L;
                this.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                return;
            case 3:
                j3 = 0;
                j2 = j3 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                j7 = ((long) (byteBuffer.get(0) & 255)) ^ j;
                this.b ^= Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L;
                this.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                return;
            case 4:
                j4 = 0;
                j3 = j4 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                j2 = j3 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                j7 = ((long) (byteBuffer.get(0) & 255)) ^ j;
                this.b ^= Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L;
                this.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                return;
            case 5:
                j5 = 0;
                j4 = j5 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                j3 = j4 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                j2 = j3 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                j7 = ((long) (byteBuffer.get(0) & 255)) ^ j;
                this.b ^= Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L;
                this.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                return;
            case 6:
                j6 = 0;
                j5 = j6 ^ (((long) (byteBuffer.get(5) & 255)) << 40);
                j4 = j5 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                j3 = j4 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                j2 = j3 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                j7 = ((long) (byteBuffer.get(0) & 255)) ^ j;
                this.b ^= Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L;
                this.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                return;
            case 7:
                j6 = ((long) (byteBuffer.get(6) & 255)) << 48;
                j5 = j6 ^ (((long) (byteBuffer.get(5) & 255)) << 40);
                j4 = j5 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                j3 = j4 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                j2 = j3 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                j7 = ((long) (byteBuffer.get(0) & 255)) ^ j;
                this.b ^= Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L;
                this.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                return;
            case 8:
                j7 = byteBuffer.getLong();
                this.b ^= Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L;
                this.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                return;
            case 9:
                j8 ^= (long) (byteBuffer.get(8) & 255);
                j7 = byteBuffer.getLong();
                this.b ^= Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L;
                this.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                return;
            case 10:
                j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                j8 ^= (long) (byteBuffer.get(8) & 255);
                j7 = byteBuffer.getLong();
                this.b ^= Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L;
                this.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                return;
            case 11:
                j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                j8 ^= (long) (byteBuffer.get(8) & 255);
                j7 = byteBuffer.getLong();
                this.b ^= Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L;
                this.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                return;
            case 12:
                j8 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                j8 ^= (long) (byteBuffer.get(8) & 255);
                j7 = byteBuffer.getLong();
                this.b ^= Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L;
                this.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                return;
            case 13:
                j8 ^= ((long) (byteBuffer.get(12) & 255)) << 32;
                j8 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                j8 ^= (long) (byteBuffer.get(8) & 255);
                j7 = byteBuffer.getLong();
                this.b ^= Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L;
                this.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                return;
            case 14:
                j8 ^= ((long) (byteBuffer.get(13) & 255)) << 40;
                j8 ^= ((long) (byteBuffer.get(12) & 255)) << 32;
                j8 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                j8 ^= (long) (byteBuffer.get(8) & 255);
                j7 = byteBuffer.getLong();
                this.b ^= Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L;
                this.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                return;
            case 15:
                j8 = ((long) (byteBuffer.get(14) & 255)) << 48;
                j8 ^= ((long) (byteBuffer.get(13) & 255)) << 40;
                j8 ^= ((long) (byteBuffer.get(12) & 255)) << 32;
                j8 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                j8 ^= (long) (byteBuffer.get(8) & 255);
                j7 = byteBuffer.getLong();
                this.b ^= Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L;
                this.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                return;
            default:
                throw new AssertionError("Should never get here.");
        }
    }
}
