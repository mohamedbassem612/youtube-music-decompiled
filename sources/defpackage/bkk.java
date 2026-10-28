package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bkk {
    public static final /* synthetic */ int a = 0;
    private static final bkg b;

    static {
        bkg bkiVar;
        if (bhp.a()) {
            bkiVar = new bkf();
        } else {
            bkiVar = bki.a != null ? new bki() : new bkh();
        }
        b = bkiVar;
    }

    static int a(String str, byte[] bArr, int i, int i2) {
        return b.a(str, bArr, i, i2);
    }

    static int b(String str) {
        return b.c(str);
    }

    static String c(byte[] bArr, int i, int i2) {
        return i2 == 0 ? "" : b.b(bArr, i, i2);
    }
}
