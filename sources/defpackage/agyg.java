package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agyg {
    public static final agyg d = new agyd("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final agyg e = new agyd("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final agyg f;

    static {
        new agyf("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new agyf("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        f = new agyc(new agyb("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract void c(Appendable appendable, byte[] bArr, int i);

    public abstract int d(int i);

    public abstract int e(int i);

    public abstract agyg f();

    public abstract agyg g();

    public CharSequence h(CharSequence charSequence) {
        throw null;
    }

    public final String j(byte[] bArr) {
        return l(bArr, bArr.length);
    }

    public final byte[] k(CharSequence charSequence) {
        try {
            CharSequence charSequenceH = h(charSequence);
            int iD = d(charSequenceH.length());
            byte[] bArr = new byte[iD];
            int iA = a(bArr, charSequenceH);
            if (iA == iD) {
                return bArr;
            }
            byte[] bArr2 = new byte[iA];
            System.arraycopy(bArr, 0, bArr2, 0, iA);
            return bArr2;
        } catch (agye e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final String l(byte[] bArr, int i) {
        ahno.N(0, i, bArr.length);
        StringBuilder sb = new StringBuilder(e(i));
        try {
            c(sb, bArr, i);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
