package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class alo {
    public final String a;
    public final long b;
    public final int c;

    public alo(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public float c(float f, float f2, float f3) {
        throw null;
    }

    public long d(float f, float f2, float f3) {
        throw null;
    }

    public long e(float f, float f2, float f3, float f4, alo aloVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            alo aloVar = (alo) obj;
            if (this.c == aloVar.c && awrc.c(this.a, aloVar.a) && this.b == aloVar.b) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + ((int) (this.b ^ 3))) * 31) + this.c;
    }

    public final String toString() {
        String str;
        long j = this.b;
        if (j == 12884901888L) {
            str = "Rgb";
        } else {
            str = j == 12884901889L ? "Xyz" : "Lab";
        }
        int i = this.c;
        return this.a + " (id=" + i + ", model=" + str + ')';
    }
}
