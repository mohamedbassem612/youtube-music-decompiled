package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cyx {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final czd c = new czd();
    public int d;
    public int e;
    public long f;
    public qcb g;

    public final long a(cvj cvjVar, int i) {
        byte[] bArr = this.a;
        ((cvb) cvjVar).o(bArr, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
