package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tza {
    public final int a;

    public tza(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof tza) && this.a == ((tza) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "StyleResource{id=" + this.a + '}';
    }

    public tza() {
        throw null;
    }
}
