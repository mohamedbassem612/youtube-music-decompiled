package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aflj {
    public final aflk a;
    public final agev b;

    public aflj(aflk aflkVar, agev agevVar) {
        if (aflkVar == null) {
            throw new NullPointerException("Null repeatInterval");
        }
        this.a = aflkVar;
        this.b = agevVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aflj) {
            aflj afljVar = (aflj) obj;
            if (this.a.equals(afljVar.a) && this.b.equals(afljVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "PeriodicWorkSpec{repeatInterval=" + this.a.toString() + ", flexInterval=Optional.absent()}";
    }

    public aflj() {
        throw null;
    }
}
