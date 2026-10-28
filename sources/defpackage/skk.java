package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class skk implements snk {
    private final String a;
    private final aixr b;
    private final boolean c;
    private final boolean d;

    public skk(String str, aixr aixrVar, boolean z, boolean z2) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.a = str;
        this.b = aixrVar;
        this.c = z;
        this.d = z2;
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
        if (obj instanceof skk) {
            skk skkVar = (skk) obj;
            if (this.a.equals(skkVar.a) && this.b.equals(skkVar.b) && this.c == skkVar.c && this.d == skkVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "InPlayerSpaceTakenTrigger{getTriggerId=" + this.a + ", getTriggerType=" + this.b.toString() + ", shouldOnlyTriggerOnce=" + this.c + ", activateOnlyDuringOrganicPlayback=" + this.d + '}';
    }

    public skk() {
        throw null;
    }
}
