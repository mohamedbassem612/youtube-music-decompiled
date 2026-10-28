package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agyd extends agyf {
    private agyd(agyb agybVar, Character ch) {
        super(agybVar, ch);
        if (agybVar.b.length != 64) {
            throw new IllegalArgumentException();
        }
    }

    @Override // defpackage.agyf, defpackage.agyg
    public final int a(byte[] bArr, CharSequence charSequence) throws agye {
        CharSequence charSequenceH = h(charSequence);
        long length = charSequenceH.length();
        agyb agybVar = this.b;
        if (!agybVar.c(length)) {
            throw new agye("Invalid input length " + charSequenceH.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceH.length()) {
            int i3 = i2 + 1;
            int iB = (agybVar.b(charSequenceH.charAt(i)) << 18) | (agybVar.b(charSequenceH.charAt(i + 1)) << 12);
            bArr[i2] = (byte) (iB >>> 16);
            int i4 = i + 2;
            if (i4 < charSequenceH.length()) {
                int i5 = i + 3;
                int iB2 = iB | (agybVar.b(charSequenceH.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((iB2 >>> 8) & 255);
                if (i5 < charSequenceH.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iB2 | agybVar.b(charSequenceH.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.agyf
    public final agyg b(agyb agybVar, Character ch) {
        return new agyd(agybVar, ch);
    }

    @Override // defpackage.agyf, defpackage.agyg
    public final void c(Appendable appendable, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        ahno.N(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = bArr[i2] & 255;
            int i5 = bArr[i2 + 1] & 255;
            int i6 = bArr[i2 + 2] & 255;
            agyb agybVar = this.b;
            int i7 = (i4 << 16) | (i5 << 8) | i6;
            appendable.append(agybVar.a(i7 >>> 18));
            appendable.append(agybVar.a((i7 >>> 12) & 63));
            appendable.append(agybVar.a((i7 >>> 6) & 63));
            appendable.append(agybVar.a(i7 & 63));
            i2 += 3;
        }
        if (i2 < i) {
            i(appendable, bArr, i2, i - i2);
        }
    }

    public agyd(String str, String str2, Character ch) {
        this(new agyb(str, str2.toCharArray()), ch);
    }
}
