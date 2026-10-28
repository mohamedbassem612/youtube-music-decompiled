package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lzt {
    public static final lzp a;

    static {
        lzp lzrVar;
        if (lwp.a()) {
            lzrVar = new lzo();
        } else {
            lzrVar = lzr.a != null ? new lzr() : new lzq();
        }
        a = lzrVar;
    }

    static int a(String str, byte[] bArr, int i, int i2) {
        return a.a(str, bArr, i, i2);
    }

    static int b(String str) {
        return a.c(str);
    }

    public static boolean c(byte[] bArr, int i, int i2) {
        while (i < i2) {
            if (bArr[i] < 0) {
                return a.e(bArr, i, i2);
            }
            i++;
        }
        return true;
    }
}
