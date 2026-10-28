package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afsb {
    public final Set a;
    public final long b;
    public final agev c;

    public afsb(Set set, long j, agev agevVar) {
        this.a = set;
        this.b = j;
        if (agevVar == null) {
            throw new NullPointerException("Null ignoreFirstConstraintTime");
        }
        this.c = agevVar;
    }

    public static afsb a(afsb afsbVar, afsb afsbVar2) {
        Set set = afsbVar.a;
        ahno.O(set.equals(afsbVar2.a));
        HashSet hashSet = new HashSet();
        agev agevVarI = agdf.a;
        hashSet.addAll(set);
        long jMin = Math.min(afsbVar.b, afsbVar2.b);
        agev agevVar = afsbVar.c;
        boolean zG = agevVar.g();
        agev agevVar2 = afsbVar2.c;
        if (zG && agevVar2.g()) {
            agevVarI = agev.i(Long.valueOf(Math.min(((Long) agevVar.c()).longValue(), ((Long) agevVar2.c()).longValue())));
        } else if (agevVar.g()) {
            agevVarI = agevVar;
        } else if (agevVar2.g()) {
            agevVarI = agevVar2;
        }
        return new afsb(hashSet, jMin, agevVarI);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afsb) {
            afsb afsbVar = (afsb) obj;
            if (this.a.equals(afsbVar.a) && this.b == afsbVar.b && this.c.equals(afsbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        agev agevVar = this.c;
        return "SyncSchedule{constraints=" + this.a.toString() + ", nextSyncTime=" + this.b + ", ignoreFirstConstraintTime=" + String.valueOf(agevVar) + '}';
    }

    public afsb() {
        throw null;
    }
}
