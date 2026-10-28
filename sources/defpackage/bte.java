package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bte {
    private final bsb a;

    public bte(bsb bsbVar) {
        this.a = bsbVar;
    }

    public final boolean a(int i) {
        return this.a.c(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bte) {
            return this.a.equals(((bte) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
