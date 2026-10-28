package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nux {
    static tke a(int i, int i2, int[] iArr, boolean z) {
        int i3;
        int iB;
        int i4 = i + i2;
        int i5 = i4 - 1;
        if (!z) {
            i4 = i5;
        }
        if (z && i == 0) {
            iB = 0;
            i3 = 0;
        } else {
            i3 = i;
            iB = b(iArr, i);
        }
        if (i2 > 0) {
            i2 += b(iArr, i4) - iB;
        }
        return new tke(i3 + iB, i2);
    }

    private static int b(int[] iArr, int i) {
        int iF = rpi.f(iArr, i);
        return iF >= 0 ? iF + 1 : (-iF) - 1;
    }
}
