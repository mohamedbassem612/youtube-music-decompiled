package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iex {
    public final List a;
    public final alss b;

    public iex(List list, alss alssVar) {
        list.getClass();
        this.a = list;
        this.b = alssVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof iex) {
            iex iexVar = (iex) obj;
            if (awrc.c(this.a, iexVar.a) && awrc.c(this.b, iexVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        alss alssVar = this.b;
        return iHashCode + (alssVar == null ? 0 : alssVar.hashCode());
    }

    public final String toString() {
        return "QueueResponse(queueItems=" + this.a + ", response=" + this.b + ')';
    }
}
