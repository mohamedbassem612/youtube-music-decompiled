package defpackage;

import app.rive.semantics.SemanticState;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agyc extends agyf {
    final char[] a;

    public agyc(agyb agybVar) {
        super(agybVar, null);
        this.a = new char[SemanticState.LiveRegion];
        if (agybVar.b.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < 256; i++) {
            this.a[i] = agybVar.a(i >>> 4);
            this.a[i | SemanticState.Hidden] = agybVar.a(i & 15);
        }
    }

    @Override // defpackage.agyf, defpackage.agyg
    public final int a(byte[] bArr, CharSequence charSequence) throws agye {
        if (charSequence.length() % 2 == 1) {
            throw new agye("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            agyb agybVar = this.b;
            bArr[i2] = (byte) ((agybVar.b(charSequence.charAt(i)) << 4) | agybVar.b(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.agyf
    public final agyg b(agyb agybVar, Character ch) {
        return new agyc(agybVar);
    }

    @Override // defpackage.agyf, defpackage.agyg
    public final void c(Appendable appendable, byte[] bArr, int i) throws IOException {
        ahno.N(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.a;
            appendable.append(cArr[i3]);
            appendable.append(cArr[i3 | SemanticState.Hidden]);
        }
    }
}
