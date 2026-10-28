package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class twj {
    private final agkz a;

    public twj(agkz agkzVar) {
        this.a = agkzVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof twj) && this.a.equals(((twj) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return ((agpr) this.a).c ^ 583896283;
    }

    public final String toString() {
        return "Config{processName=null, clientName=null, migrations=" + String.valueOf(this.a) + '}';
    }

    public twj() {
        throw null;
    }
}
