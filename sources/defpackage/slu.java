package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class slu implements snk {
    public final agke a;
    private final String b;
    private final aixr c;
    private final boolean d;

    public slu(String str, aixr aixrVar, boolean z, agke agkeVar) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.b = str;
        this.c = aixrVar;
        this.d = z;
        if (agkeVar == null) {
            throw new NullPointerException("Null getAllowedSlotTypeList");
        }
        this.a = agkeVar;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof slu) {
            slu sluVar = (slu) obj;
            if (this.b.equals(sluVar.b) && this.c.equals(sluVar.c) && this.d == sluVar.d && aguu.v(this.a, sluVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        agke agkeVar = this.a;
        return "OnNextSlotEnterRequestedTrigger{getTriggerId=" + this.b + ", getTriggerType=" + this.c.toString() + ", shouldOnlyTriggerOnce=" + this.d + ", getAllowedSlotTypeList=" + agkeVar.toString() + '}';
    }

    public slu() {
        throw null;
    }
}
