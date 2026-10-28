package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pqq {
    public final aiaz a;
    public final aibb b;
    public final Map c;

    public pqq(aiaz aiazVar, aibb aibbVar, Map map) {
        aiazVar.getClass();
        map.getClass();
        this.a = aiazVar;
        this.b = aibbVar;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pqq) {
            pqq pqqVar = (pqq) obj;
            if (awrc.c(this.a, pqqVar.a) && awrc.c(this.b, pqqVar.b) && awrc.c(this.c, pqqVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "MultiLoginUpdateRequestAndResponse(request=" + this.a + ", response=" + this.b + ", authResultPerUser=" + this.c + ')';
    }
}
