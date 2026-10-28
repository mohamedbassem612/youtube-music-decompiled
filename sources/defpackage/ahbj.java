package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahbj extends agvp {
    private static final char[] a = {'+'};
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final boolean c;
    private final boolean[] d;

    public ahbj(String str, boolean z) {
        super(null);
        ahno.G(!str.matches(".*[0-9A-Za-z].*"), "Alphanumeric characters are always 'safe' and should not be explicitly specified");
        String strConcat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (z && strConcat.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.c = z;
        char[] charArray = strConcat.toCharArray();
        int iMax = -1;
        for (char c : charArray) {
            iMax = Math.max((int) c, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        this.d = zArr;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01dc  */
    @Override // defpackage.agvp
    public final String b(String str) {
        int codePoint;
        char[] cArr;
        int iCharCount;
        char cCharAt;
        int i;
        int i2;
        int length;
        int i3;
        str.getClass();
        int i4 = 0;
        while (i4 < str.length()) {
            char cCharAt2 = str.charAt(i4);
            boolean[] zArr = this.d;
            if (cCharAt2 >= zArr.length || !zArr[cCharAt2]) {
                int length2 = str.length();
                char[] cArrC = (char[]) agqu.a.get();
                cArrC.getClass();
                int i5 = 0;
                int i6 = 0;
                while (i4 < length2) {
                    if (i4 >= length2) {
                        throw new IndexOutOfBoundsException("Index exceeds specified range");
                    }
                    int i7 = i4 + 1;
                    char cCharAt3 = str.charAt(i4);
                    if (cCharAt3 >= 55296 && cCharAt3 <= 57343) {
                        if (cCharAt3 > 56319) {
                            codePoint = cCharAt3;
                            codePoint = cCharAt3;
                            throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt3 + "' with value " + ((int) cCharAt3) + " at index " + i4 + " in '" + str + '\'');
                        }
                        if (i7 == length2) {
                            codePoint = -cCharAt3;
                        } else {
                            char cCharAt4 = str.charAt(i7);
                            if (!Character.isLowSurrogate(cCharAt4)) {
                                throw new IllegalArgumentException("Expected low surrogate but got char '" + cCharAt4 + "' with value " + ((int) cCharAt4) + " at index " + i7 + " in '" + str + '\'');
                            }
                            codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                        }
                    }
                    if (codePoint < 0) {
                        throw new IllegalArgumentException("Trailing high surrogate at end of input");
                    }
                    if (codePoint < zArr.length && zArr[codePoint]) {
                        cArr = null;
                    } else if (codePoint == 32 && this.c) {
                        cArr = a;
                    } else {
                        if (codePoint <= 127) {
                            char[] cArr2 = b;
                            cArr = new char[]{'%', cArr2[codePoint >>> 4], cArr2[codePoint & 15]};
                        } else if (codePoint <= 2047) {
                            char[] cArr3 = b;
                            cArr = new char[]{'%', cArr3[(codePoint >>> 10) | 12], cArr3[(codePoint >>> 6) & 15], '%', cArr3[((codePoint >>> 4) & 3) | 8], cArr3[codePoint & 15]};
                        } else if (codePoint <= 65535) {
                            char[] cArr4 = b;
                            cArr = new char[]{'%', 'E', cArr4[codePoint >>> 12], '%', cArr4[((codePoint >>> 10) & 3) | 8], cArr4[(codePoint >>> 6) & 15], '%', cArr4[((codePoint >>> 4) & 3) | 8], cArr4[codePoint & 15]};
                        } else {
                            if (codePoint > 1114111) {
                                throw new IllegalArgumentException(a.bR(codePoint, "Invalid unicode character value "));
                            }
                            char[] cArr5 = b;
                            cArr = new char[]{'%', 'F', cArr5[codePoint >>> 18], '%', cArr5[((codePoint >>> 16) & 3) | 8], cArr5[(codePoint >>> 12) & 15], '%', cArr5[((codePoint >>> 10) & 3) | 8], cArr5[(codePoint >>> 6) & 15], '%', cArr5[((codePoint >>> 4) & 3) | 8], cArr5[codePoint & 15]};
                        }
                        iCharCount = Character.charCount(codePoint) + i4;
                        if (cArr != null) {
                            i = i4 - i5;
                            i2 = i6 + i;
                            length = cArrC.length;
                            int length3 = cArr.length;
                            i3 = i2 + length3;
                            if (length < i3) {
                                cArrC = agvp.c(cArrC, i6, i3 + (length2 - i4) + 32);
                            }
                            if (i > 0) {
                                str.getChars(i5, i4, cArrC, i6);
                                i6 = i2;
                            }
                            System.arraycopy(cArr, 0, cArrC, i6, length3);
                            i6 += length3;
                            i5 = iCharCount;
                        }
                        i4 = iCharCount;
                        while (i4 < length2) {
                            cCharAt = str.charAt(i4);
                            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                                break;
                            }
                            i4++;
                        }
                    }
                    iCharCount = Character.charCount(codePoint) + i4;
                    if (cArr != null) {
                        i = i4 - i5;
                        i2 = i6 + i;
                        length = cArrC.length;
                        int length4 = cArr.length;
                        i3 = i2 + length4;
                        if (length < i3) {
                            cArrC = agvp.c(cArrC, i6, i3 + (length2 - i4) + 32);
                        }
                        if (i > 0) {
                            str.getChars(i5, i4, cArrC, i6);
                            i6 = i2;
                        }
                        System.arraycopy(cArr, 0, cArrC, i6, length4);
                        i6 += length4;
                        i5 = iCharCount;
                    }
                    i4 = iCharCount;
                    while (i4 < length2) {
                        cCharAt = str.charAt(i4);
                        if (cCharAt >= zArr.length) {
                            break;
                        }
                        break;
                        break;
                    }
                }
                int i8 = length2 - i5;
                if (i8 > 0) {
                    int i9 = i8 + i6;
                    if (cArrC.length < i9) {
                        cArrC = agvp.c(cArrC, i6, i9);
                    }
                    str.getChars(i5, length2, cArrC, i6);
                    i6 = i9;
                }
                return new String(cArrC, 0, i6);
            }
            i4++;
        }
        return str;
    }
}
