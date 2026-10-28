package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adwq {
    public final maw a;
    public final agfr b;
    public final AtomicBoolean c;

    public adwq(maw mawVar, agfr agfrVar, AtomicBoolean atomicBoolean) {
        this.a = mawVar;
        this.b = agfrVar;
        this.c = atomicBoolean;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adwq) {
            adwq adwqVar = (adwq) obj;
            maw mawVar = this.a;
            if (mawVar != null ? mawVar.equals(adwqVar.a) : adwqVar.a == null) {
                agfr agfrVar = this.b;
                if (agfrVar != null ? agfrVar.equals(adwqVar.b) : adwqVar.b == null) {
                    AtomicBoolean atomicBoolean = this.c;
                    if (atomicBoolean == null) {
                        if (adwqVar.c == null) {
                            return true;
                        }
                    } else if (atomicBoolean.equals(adwqVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        maw mawVar = this.a;
        int iHashCode = mawVar == null ? 0 : mawVar.hashCode();
        agfr agfrVar = this.b;
        int iHashCode2 = agfrVar == null ? 0 : agfrVar.hashCode();
        int i = iHashCode ^ 1000003;
        AtomicBoolean atomicBoolean = this.c;
        return (((i * 1000003) ^ iHashCode2) * 583896283) ^ (atomicBoolean != null ? atomicBoolean.hashCode() : 0);
    }

    public final String toString() {
        AtomicBoolean atomicBoolean = this.c;
        agfr agfrVar = this.b;
        return "SectionListContext{blockRegistry=" + String.valueOf(this.a) + ", blockRegistrySupplier=" + String.valueOf(agfrVar) + ", renderNextServices=null, renderNextGroupScope=null, isInBatchUpdate=" + String.valueOf(atomicBoolean) + '}';
    }

    public adwq() {
        throw null;
    }
}
