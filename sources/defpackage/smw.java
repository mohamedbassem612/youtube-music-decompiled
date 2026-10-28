package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class smw implements sms {
    public final String a;
    private final String b;
    private final aixr c;

    public smw(String str, aixr aixrVar, String str2) {
        this.b = str;
        this.c = aixrVar;
        if (str2 == null) {
            throw new NullPointerException("Null getTriggeringSlotId");
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

    @Override // defpackage.sms
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof smw) {
            smw smwVar = (smw) obj;
            if (this.b.equals(smwVar.b) && this.c.equals(smwVar.c) && this.a.equals(smwVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "SlotIdFulfilledEmptyTrigger{getTriggerId=" + this.b + ", getTriggerType=" + this.c.toString() + ", shouldOnlyTriggerOnce=false, getTriggeringSlotId=" + this.a + '}';
    }

    public smw() {
        throw null;
    }
}
