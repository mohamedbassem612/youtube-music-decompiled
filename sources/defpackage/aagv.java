package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aagv extends aahb {
    private final aahc a;
    private final weo b;
    private final int c;
    private final String d;

    private aagv(aahc aahcVar, weo weoVar, int i, String str) {
        this.a = aahcVar;
        this.b = weoVar;
        this.c = i;
        this.d = str;
    }

    @Override // defpackage.aahb
    public final int a() {
        return this.c;
    }

    @Override // defpackage.aahb
    public final weo b() {
        return this.b;
    }

    @Override // defpackage.aahb
    public final aahc c() {
        return this.a;
    }

    @Override // defpackage.aahb
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        weo weoVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aahb) {
            aahb aahbVar = (aahb) obj;
            if (this.a.equals(aahbVar.c()) && ((weoVar = this.b) != null ? weoVar.equals(aahbVar.b()) : aahbVar.b() == null) && this.c == aahbVar.a() && this.d.equals(aahbVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        weo weoVar = this.b;
        return (((((iHashCode * 1000003) ^ (weoVar == null ? 0 : weoVar.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        weo weoVar = this.b;
        return "OfflineEntityEvent{entityEventType=" + this.a.toString() + ", entityUpdate=" + String.valueOf(weoVar) + ", entityType=" + this.c + ", entityId=" + this.d + '}';
    }

    public /* synthetic */ aagv(aahc aahcVar, weo weoVar, int i, String str, aagu aaguVar) {
        this(aahcVar, weoVar, i, str);
    }
}
