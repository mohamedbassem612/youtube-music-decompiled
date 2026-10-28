package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class umg {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public umg(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof umg) {
            umg umgVar = (umg) obj;
            if (this.a == umgVar.a && this.b == umgVar.b && this.c == umgVar.c && this.d == umgVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "ResolvedTheme(primaryColor=" + this.a + ", secondaryColor=" + this.b + ", translucentPrimaryColor=" + this.c + ", translucentSecondaryColor=" + this.d + ')';
    }
}
