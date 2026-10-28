package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rmi {
    public final agkz a;
    public final rlt b;
    public final rmv c;

    public rmi(agkz agkzVar, rlt rltVar, rmv rmvVar) {
        this.a = agkzVar;
        this.b = rltVar;
        this.c = rmvVar;
    }

    static wnt c() {
        wnt wntVar = new wnt();
        wntVar.f(agpr.a);
        return wntVar;
    }

    final zwa a() {
        rlt rltVar = this.b;
        return rltVar == null ? zvz.a : rltVar;
    }

    final boolean b() {
        rlt rltVar = this.b;
        return (rltVar == null || rltVar.d) ? false : true;
    }

    public final boolean equals(Object obj) {
        rlt rltVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rmi) {
            rmi rmiVar = (rmi) obj;
            if (this.a.equals(rmiVar.a) && ((rltVar = this.b) != null ? rltVar.equals(rmiVar.b) : rmiVar.b == null)) {
                rmv rmvVar = this.c;
                if (rmvVar == null) {
                    if (rmiVar.c == null) {
                        return true;
                    }
                } else if (rmvVar.equals(rmiVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        rlt rltVar = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (rltVar == null ? 0 : rltVar.hashCode())) * 1000003;
        rmv rmvVar = this.c;
        return iHashCode2 ^ (rmvVar != null ? rmvVar.hashCode() : 0);
    }

    public final String toString() {
        rmv rmvVar = this.c;
        rlt rltVar = this.b;
        return "State{inflight=" + String.valueOf(this.a) + ", accountIdentity=" + String.valueOf(rltVar) + ", profile=" + String.valueOf(rmvVar) + '}';
    }

    public rmi() {
        throw null;
    }
}
