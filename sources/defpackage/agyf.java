package defpackage;

import j$.util.Objects;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
class agyf extends agyg {
    private volatile agyg a;
    final agyb b;
    final Character c;

    public agyf(agyb agybVar, Character ch) {
        this.b = agybVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            byte[] bArr = agybVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z = false;
            }
        }
        ahno.K(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.agyg
    public int a(byte[] bArr, CharSequence charSequence) throws agye {
        int i;
        CharSequence charSequenceH = h(charSequence);
        long length = charSequenceH.length();
        agyb agybVar = this.b;
        if (!agybVar.c(length)) {
            throw new agye("Invalid input length " + charSequenceH.length());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceH.length()) {
            long jB = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = agybVar.e;
                if (i4 >= i) {
                    break;
                }
                jB <<= agybVar.d;
                if (i2 + i4 < charSequenceH.length()) {
                    jB |= (long) agybVar.b(charSequenceH.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = agybVar.f;
            int i7 = i5 * agybVar.d;
            int i8 = (i6 - 1) << 3;
            while (i8 >= (i6 << 3) - i7) {
                bArr[i3] = (byte) ((jB >>> i8) & 255);
                i8 -= 8;
                i3++;
            }
            i2 += i;
        }
        return i3;
    }

    public agyg b(agyb agybVar, Character ch) {
        return new agyf(agybVar, ch);
    }

    @Override // defpackage.agyg
    public void c(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        ahno.N(0, i, bArr.length);
        while (i2 < i) {
            int i3 = this.b.f;
            i(appendable, bArr, i2, Math.min(i3, i - i2));
            i2 += i3;
        }
    }

    @Override // defpackage.agyg
    public final int d(int i) {
        return (int) (((((long) this.b.d) * ((long) i)) + 7) / 8);
    }

    @Override // defpackage.agyg
    public final int e(int i) {
        agyb agybVar = this.b;
        return agybVar.e * ahng.X(i, agybVar.f, RoundingMode.CEILING);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agyf)) {
            return false;
        }
        agyf agyfVar = (agyf) obj;
        return this.b.equals(agyfVar.b) && Objects.equals(this.c, agyfVar.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    @Override // defpackage.agyg
    public final agyg f() {
        agyb agybVar;
        int length;
        boolean z;
        agyg agygVarB = this.a;
        if (agygVarB == null) {
            agyb agybVar2 = this.b;
            int i = 0;
            while (true) {
                char[] cArr = agybVar2.b;
                if (i >= cArr.length) {
                    agybVar = agybVar2;
                    break;
                }
                if (ahno.ai(cArr[i])) {
                    int i2 = 0;
                    while (true) {
                        length = cArr.length;
                        if (i2 >= length) {
                            z = false;
                            break;
                        }
                        if (ahno.ah(cArr[i2])) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    ahno.P(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                    char[] cArr2 = new char[length];
                    for (int i3 = 0; i3 < cArr.length; i3++) {
                        char c = cArr[i3];
                        if (ahno.ai(c)) {
                            c ^= 32;
                        }
                        cArr2[i3] = (char) c;
                    }
                    agybVar = new agyb(agybVar2.a.concat(".lowerCase()"), cArr2);
                    if (!agybVar2.h || agybVar.h) {
                        break;
                        break;
                    }
                    byte[] bArr = agybVar.g;
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                    for (int i4 = 65; i4 <= 90; i4++) {
                        int i5 = i4 | 32;
                        byte b = bArr[i4];
                        byte b2 = bArr[i5];
                        if (b == -1) {
                            bArrCopyOf[i4] = b2;
                        } else {
                            char c2 = (char) i4;
                            char c3 = (char) i5;
                            if (b2 != -1) {
                                throw new IllegalStateException(ahno.E("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c2), Character.valueOf(c3)));
                            }
                            bArrCopyOf[i5] = b;
                        }
                    }
                    agybVar = new agyb(agybVar.a.concat(".ignoreCase()"), agybVar.b, bArrCopyOf, true);
                    break;
                }
                i++;
            }
            agygVarB = agybVar == agybVar2 ? this : b(agybVar, this.c);
            this.a = agygVarB;
        }
        return agygVarB;
    }

    @Override // defpackage.agyg
    public final agyg g() {
        return this.c != null ? b(this.b, null) : this;
    }

    @Override // defpackage.agyg
    public final CharSequence h(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.c;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ Objects.hashCode(this.c);
    }

    final void i(Appendable appendable, byte[] bArr, int i, int i2) {
        ahno.N(i, i + i2, bArr.length);
        agyb agybVar = this.b;
        int i3 = agybVar.f;
        if (i2 > i3) {
            throw new IllegalArgumentException();
        }
        int i4 = 0;
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | ((long) (bArr[i + i5] & 255))) << 8;
        }
        int i6 = (i2 + 1) << 3;
        int i7 = agybVar.d;
        while (i4 < (i2 << 3)) {
            appendable.append(agybVar.a(((int) (j >>> ((i6 - i7) - i4))) & agybVar.c));
            i4 += i7;
        }
        Character ch = this.c;
        if (ch != null) {
            while (i4 < (i3 << 3)) {
                ch.charValue();
                appendable.append('=');
                i4 += i7;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        agyb agybVar = this.b;
        sb.append(agybVar);
        if (8 % agybVar.d != 0) {
            Character ch = this.c;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public agyf(String str, String str2, Character ch) {
        this(new agyb(str, str2.toCharArray()), ch);
    }
}
