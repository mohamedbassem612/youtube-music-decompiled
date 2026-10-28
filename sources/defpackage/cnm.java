package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cnm {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public cnm(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final cnm a(Object obj) {
        return !this.a.equals(obj) ? new cnm(obj, this.b, this.c, this.d, this.e) : this;
    }

    public final boolean b(cnm cnmVar) {
        if (cnmVar != null) {
            return this == cnmVar || (this.a.equals(cnmVar.a) && this.b == cnmVar.b && this.c == cnmVar.c && this.d == cnmVar.d);
        }
        return false;
    }

    public final boolean c() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cnm) {
            cnm cnmVar = (cnm) obj;
            if (b(cnmVar) && this.e == cnmVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }
}
