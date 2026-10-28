package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agxi {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final /* synthetic */ int b = 0;

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract boolean d(agxi agxiVar);

    public abstract byte[] e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof agxi)) {
            return false;
        }
        agxi agxiVar = (agxi) obj;
        return b() == agxiVar.b() && d(agxiVar);
    }

    public byte[] f() {
        return e();
    }

    public final int hashCode() {
        if (b() >= 32) {
            return a();
        }
        byte[] bArrF = f();
        int i = bArrF[0] & 255;
        for (int i2 = 1; i2 < bArrF.length; i2++) {
            i |= (bArrF[i2] & 255) << (i2 << 3);
        }
        return i;
    }

    public final String toString() {
        byte[] bArrF = f();
        StringBuilder sb = new StringBuilder(bArrF.length << 1);
        for (byte b2 : bArrF) {
            char[] cArr = a;
            sb.append(cArr[(b2 >> 4) & 15]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }
}
