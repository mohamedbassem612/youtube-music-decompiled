package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abni {
    public final String a;
    public final wjf b;
    public final abnp c;

    public abni(String str, wjf wjfVar, abnp abnpVar) {
        this.a = str;
        this.b = wjfVar;
        this.c = abnpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abni) {
            abni abniVar = (abni) obj;
            if (awrc.c(this.a, abniVar.a) && awrc.c(this.b, abniVar.b) && awrc.c(this.c, abniVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        wjf wjfVar = this.b;
        int iHashCode2 = (iHashCode + (wjfVar == null ? 0 : wjfVar.hashCode())) * 31;
        abnp abnpVar = this.c;
        return iHashCode2 + (abnpVar != null ? abnpVar.hashCode() : 0);
    }

    public final String toString() {
        return "CpnToPlayerResponse(cpn=" + this.a + ", playerResponse=" + this.b + ", playbackStartParameters=" + this.c + ')';
    }
}
