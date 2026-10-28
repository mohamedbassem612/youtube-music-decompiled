package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sly implements sms {
    public final int a;
    private final String b;
    private final aixr c;
    private final String d;

    public sly(String str, aixr aixrVar, String str2) {
        this.b = str;
        this.c = aixrVar;
        this.a = 11;
        this.d = str2;
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

    @Override // defpackage.sms
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sly) {
            sly slyVar = (sly) obj;
            if (this.b.equals(slyVar.b) && this.c.equals(slyVar.c) && this.a == slyVar.a && this.d.equals(slyVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.a) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        int i = this.a - 1;
        return "OpportunityTypeReceivedTrigger{getTriggerId=" + this.b + ", getTriggerType=" + this.c.toString() + ", shouldOnlyTriggerOnce=false, getOpportunityType=" + Integer.toString(i) + ", getOriginatingSlotId=" + this.d + '}';
    }

    public sly() {
        throw null;
    }
}
