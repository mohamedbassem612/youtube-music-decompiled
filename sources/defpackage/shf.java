package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class shf implements snk {
    private final String a;
    private final aixr b;
    private final boolean c;

    public shf(String str, aixr aixrVar, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.a = str;
        this.b = aixrVar;
        this.c = z;
    }

    @Override // defpackage.snk
    public final aixr a() {
        return this.b;
    }

    @Override // defpackage.snk
    public final String b() {
        return this.a;
    }

    @Override // defpackage.snk
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof shf) {
            shf shfVar = (shf) obj;
            if (this.a.equals(shfVar.a) && this.b.equals(shfVar.b) && this.c == shfVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "BelowPlayerSpaceTakenTrigger{getTriggerId=" + this.a + ", getTriggerType=" + this.b.toString() + ", shouldOnlyTriggerOnce=" + this.c + '}';
    }

    public shf() {
        throw null;
    }
}
