package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sgh implements sma {
    public final String a;
    private final String b;
    private final aixr c;

    public sgh(String str, aixr aixrVar, String str2) {
        this.b = str;
        this.c = aixrVar;
        if (str2 == null) {
            throw new NullPointerException("Null getLayoutId");
        }
        this.a = str2;
    }

    @Override // defpackage.snk
    public final aixr a() {
        return this.c;
    }

    @Override // defpackage.snk
    public final String b() {
        return this.b;
    }

    @Override // defpackage.snk
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sgh) {
            sgh sghVar = (sgh) obj;
            if (this.b.equals(sghVar.b) && this.c.equals(sghVar.c) && this.a.equals(sghVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sma
    public final boolean h() {
        throw null;
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ActiveViewMeasurableCriteriaSatisfiedTrigger{getTriggerId=" + this.b + ", getTriggerType=" + this.c.toString() + ", shouldOnlyTriggerOnce=false, shouldDisableIfVideoStartMuted=false, getLayoutId=" + this.a + '}';
    }

    public sgh() {
        throw null;
    }
}
