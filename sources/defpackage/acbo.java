package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acbo implements CharSequence {
    private final CharSequence a;
    private final String b;
    private final int c;
    private String d;

    public acbo(CharSequence charSequence, String str) {
        this.a = charSequence;
        this.b = str;
        this.c = charSequence.length() + str.length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        ?? r2 = this;
        while (r2 instanceof acbo) {
            acbo acboVar = (acbo) r2;
            CharSequence charSequence = acboVar.a;
            int length = charSequence.length();
            if (i >= length) {
                return acboVar.b.charAt(i - length);
            }
            r2 = charSequence;
        }
        return r2.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.c;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = this;
        while (charSequence instanceof acbo) {
            acbo acboVar = (acbo) charSequence;
            arrayList.add(acboVar.b);
            charSequence = acboVar.a;
        }
        StringBuilder sb = new StringBuilder(this.c);
        sb.append(charSequence);
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                String string = sb.toString();
                this.d = string;
                return string;
            }
            sb.append((String) arrayList.get(size));
        }
    }
}
