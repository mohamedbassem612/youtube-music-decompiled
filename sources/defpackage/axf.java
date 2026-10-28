package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class axf {
    private static final byte[] a = new byte[1792];
    private final CharSequence b;
    private final int c;
    private int d;
    private char e;

    static {
        for (int i = 0; i < 1792; i++) {
            a[i] = Character.getDirectionality(i);
        }
    }

    public axf(CharSequence charSequence) {
        this.b = charSequence;
        this.c = charSequence.length();
    }

    private static byte d(char c) {
        return c < 1792 ? a[c] : Character.getDirectionality(c);
    }

    final byte a() {
        int i = this.d - 1;
        CharSequence charSequence = this.b;
        char cCharAt = charSequence.charAt(i);
        this.e = cCharAt;
        boolean zIsLowSurrogate = Character.isLowSurrogate(cCharAt);
        int i2 = this.d;
        if (!zIsLowSurrogate) {
            this.d = i2 - 1;
            return d(this.e);
        }
        int iCodePointBefore = Character.codePointBefore(charSequence, i2);
        this.d -= Character.charCount(iCodePointBefore);
        return Character.getDirectionality(iCodePointBefore);
    }

    final int b() {
        byte bD;
        this.d = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.d;
            if (i4 < this.c && i == 0) {
                CharSequence charSequence = this.b;
                char cCharAt = charSequence.charAt(i4);
                this.e = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = this.d;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence, i5);
                    this.d += Character.charCount(iCodePointAt);
                    bD = Character.getDirectionality(iCodePointAt);
                } else {
                    this.d = i5 + 1;
                    bD = d(this.e);
                }
                if (bD != 0) {
                    if (bD == 1 || bD == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (bD != 9) {
                        switch (bD) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i == 0) {
            return 0;
        }
        if (i2 != 0) {
            return i2;
        }
        while (this.d > 0) {
            switch (a()) {
                case 14:
                case 15:
                    if (i == i3) {
                        return -1;
                    }
                    i3--;
                    break;
                case 16:
                case 17:
                    if (i == i3) {
                        return 1;
                    }
                    i3--;
                    break;
                case 18:
                    i3++;
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    final int c() {
        this.d = this.c;
        int i = 0;
        while (true) {
            int i2 = i;
            while (this.d > 0) {
                byte bA = a();
                if (bA == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }
}
