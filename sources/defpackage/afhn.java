package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afhn {
    public final affd a;
    public final afhq b;
    public final int c;

    public afhn(affd affdVar, afhq afhqVar, int i) {
        this.a = affdVar;
        if (afhqVar == null) {
            throw new NullPointerException("Null info");
        }
        this.b = afhqVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afhn) {
            afhn afhnVar = (afhn) obj;
            if (this.a.equals(afhnVar.a) && this.b.equals(afhnVar.b) && this.c == afhnVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        int i = this.c - 1;
        return "Account{id=" + this.a.toString() + ", info=" + this.b.toString() + ", state=" + Integer.toString(i) + '}';
    }

    public afhn() {
        throw null;
    }
}
