package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ws {
    public final int a;
    public final CharSequence b;

    public ws(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    private static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ws)) {
            return false;
        }
        ws wsVar = (ws) obj;
        if (this.a != wsVar.a) {
            return false;
        }
        CharSequence charSequence = wsVar.b;
        String strA = a(this.b);
        String strA2 = a(charSequence);
        if (strA == null) {
            if (strA2 != null) {
                return false;
            }
        } else if (!strA.equals(strA2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), a(this.b)});
    }
}
