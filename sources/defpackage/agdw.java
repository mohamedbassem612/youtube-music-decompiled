package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agdw implements agex {
    protected agdw() {
    }

    public static agdw h(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return agdt.a;
        }
        if (length != 1) {
            return length != 2 ? new agdj(charSequence) : new agdo(charSequence.charAt(0), charSequence.charAt(1));
        }
        return new agdn(charSequence.charAt(0));
    }

    public static agdw i(CharSequence charSequence) {
        return h(charSequence).e();
    }

    public static String k(char c) {
        char[] cArr = new char[6];
        int i = 0;
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i2 = c;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i2 & 15);
            i++;
            i2 >>= 4;
        }
        return String.copyValueOf(cArr);
    }

    @Override // defpackage.agex
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);

    public int c(CharSequence charSequence) {
        return d(charSequence, 0);
    }

    public int d(CharSequence charSequence, int i) {
        int length = charSequence.length();
        ahno.X(i, length);
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public agdw e() {
        return new agds(this);
    }

    public String f(CharSequence charSequence) {
        String string = charSequence.toString();
        int iC = c(string);
        if (iC == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iC] = '.';
        while (true) {
            iC++;
            if (iC >= charArray.length) {
                return new String(charArray);
            }
            if (b(charArray[iC])) {
                charArray[iC] = '.';
            }
        }
    }

    public final int g(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (b(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public final String j(CharSequence charSequence) {
        String string = charSequence.toString();
        int iC = c(string);
        if (iC == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i = 1;
        while (true) {
            iC++;
            while (iC != charArray.length) {
                if (b(charArray[iC])) {
                    i++;
                } else {
                    charArray[iC - i] = charArray[iC];
                    iC++;
                }
            }
            return new String(charArray, 0, iC - i);
        }
    }

    public final boolean l(CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (b(charSequence.charAt(length)));
        return false;
    }
}
