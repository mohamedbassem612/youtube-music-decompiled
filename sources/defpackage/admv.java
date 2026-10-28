package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class admv {
    public final int a;
    public final int b;

    public admv(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof admv) {
            admv admvVar = (admv) obj;
            if (this.a == admvVar.a && this.b == admvVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "ComparableValues(first=" + this.a + ", second=" + this.b + ')';
    }
}
