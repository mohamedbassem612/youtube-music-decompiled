package defpackage;

import android.text.Html;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acbw implements CharSequence {
    public final String a;
    final boolean b;
    private CharSequence c;

    public acbw(CharSequence charSequence, boolean z) {
        this.a = charSequence.toString();
        this.b = z;
    }

    public final CharSequence a() {
        if (this.c == null) {
            boolean z = this.b;
            String str = this.a;
            if (z) {
                this.c = accm.c(str);
            } else {
                this.c = Html.fromHtml(str);
            }
        }
        return this.c;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return a().charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acbw) {
            return this.a.equals(((acbw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return a().length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return a().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return a().toString();
    }
}
