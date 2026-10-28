package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wgp {
    private static final int[] a = {7680, 5120, 3840, 2560, 1920, 1280, 854, 640, 428, SemanticState.Hidden};
    private static final int[] b = {4320, 2880, 2160, 1440, 1080, 720, 480, 360, 240, 144};

    static int a(int i, int i2) {
        boolean z = wgs.a;
        int i3 = true != z ? 2160 : 4320;
        if (i > (true != z ? 3840 : 7680) || i2 > i3) {
            return -1;
        }
        for (int i4 = true != z ? 3 : 1; i4 < 10; i4++) {
            if (i > a[i4] || i2 > b[i4]) {
                return b[i4 - 1];
            }
        }
        return (i > 0 || i2 > 0) ? 144 : -1;
    }

    public static int b(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return -1;
        }
        if (i == 0 && i2 == 0) {
            return -1;
        }
        int[] iArr = b;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int i3 = 0;
        while (i3 < 10 && iMax < a[i3] * 1.3f && iMin < iArr[i3] * 1.3f) {
            i3++;
        }
        return iArr[Math.max(0, i3 - 1)];
    }
}
