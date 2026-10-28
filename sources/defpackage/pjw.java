package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pjw {
    public static final pjw a = new pjw(0, null);
    public final int b;
    public final String c;

    public pjw(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pjw) {
            pjw pjwVar = (pjw) obj;
            if (this.b == pjwVar.b && awrc.c(this.c, pjwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.c;
        return (this.b * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TrayIdentifier(id=" + this.b + ", tag=" + this.c + ')';
    }
}
