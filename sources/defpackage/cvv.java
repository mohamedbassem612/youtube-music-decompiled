package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cvv {
    public static final String[] a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] b = {44100, 48000, 32000};
    public static final int[] c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = i4 - 1;
        int i8 = b[i5];
        if (i2 == 2) {
            i8 /= 2;
        } else if (i2 == 0) {
            i8 /= 4;
        }
        int i9 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? c[i7] : d[i7]) * 12) / i8) + i9) << 2;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? e[i7] : f[i7];
        } else {
            i6 = g[i7];
        }
        if (i2 == 3) {
            return ((i6 * 144) / i8) + i9;
        }
        return (((i3 == 1 ? 72 : 144) * i6) / i8) + i9;
    }

    public static int b(int i, int i2) {
        if (i2 != 1) {
            return i2 != 2 ? 384 : 1152;
        }
        return i != 3 ? 576 : 1152;
    }

    public static boolean c(int i) {
        return (i & (-2097152)) == -2097152;
    }
}
