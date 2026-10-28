package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class djg {
    public final String a;
    public final int b;
    private final int c = 0;
    private final int d = 0;
    private final CharSequence e = null;

    public djg(auzc auzcVar) {
        this.a = (String) auzcVar.b;
        this.b = auzcVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof djg) {
            djg djgVar = (djg) obj;
            if (this.a.equals(djgVar.a) && this.b == djgVar.b) {
                int i = djgVar.c;
                int i2 = djgVar.d;
                CharSequence charSequence = djgVar.e;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), 0, 0, null);
    }
}
