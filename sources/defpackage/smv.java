package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class smv implements sms {
    public final String a;
    private final String b;
    private final aixr c;
    private final boolean d;

    public smv(String str, aixr aixrVar, boolean z, String str2) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.b = str;
        this.c = aixrVar;
        this.d = z;
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
        return this.d;
    }

    @Override // defpackage.sms
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof smv) {
            smv smvVar = (smv) obj;
            if (this.b.equals(smvVar.b) && this.c.equals(smvVar.c) && this.d == smvVar.d && this.a.equals(smvVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "SlotIdExitedTrigger{getTriggerId=" + this.b + ", getTriggerType=" + this.c.toString() + ", shouldOnlyTriggerOnce=" + this.d + ", getTriggeringSlotId=" + this.a + '}';
    }

    public smv() {
        throw null;
    }
}
