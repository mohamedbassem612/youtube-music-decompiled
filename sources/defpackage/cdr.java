package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdr {
    public static final cdr a = new cdr(0);
    public final int b;

    public cdr(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.b == ((cdr) obj).b;
        }
        return true;
    }

    public final int hashCode() {
        return this.b << 1;
    }
}
