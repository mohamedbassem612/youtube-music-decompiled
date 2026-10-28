package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uqf {
    public final usd a;
    public final urt b;
    public final zf c;

    public uqf(zf zfVar, usd usdVar, urt urtVar) {
        this.c = zfVar;
        this.a = usdVar;
        this.b = urtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uqf) {
            uqf uqfVar = (uqf) obj;
            if (awrc.c(this.c, uqfVar.c) && awrc.c(this.a, uqfVar.a) && awrc.c(this.b, uqfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.a.hashCode();
        urt urtVar = this.b;
        return (iHashCode * 31) + (urtVar == null ? 0 : urtVar.hashCode());
    }

    public final String toString() {
        return "InitializedState(audioController=" + this.c + ", compositionManager=" + this.a + ", compositionHistoryController=" + this.b + ')';
    }
}
