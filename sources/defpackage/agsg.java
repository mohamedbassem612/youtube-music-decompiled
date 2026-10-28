package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agsg implements agrp {
    private final agrp a;
    private final Object b;

    public agsg(agrp agrpVar, Object obj) {
        agrpVar.getClass();
        this.a = agrpVar;
        obj.getClass();
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agsg)) {
            return false;
        }
        agsg agsgVar = (agsg) obj;
        return this.a.equals(agsgVar.a) && this.b.equals(agsgVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return "SpecializedLogSiteKey{ delegate='" + this.a.toString() + "', qualifier='" + obj.toString() + "' }";
    }
}
