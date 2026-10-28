package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class skc implements skp {
    public final String a;
    public final long b;
    public final ahbo c;
    private final String d;
    private final aixr e;
    private final boolean f;

    public skc(String str, aixr aixrVar, boolean z, String str2, long j, ahbo ahboVar) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.d = str;
        this.e = aixrVar;
        this.f = z;
        if (str2 == null) {
            throw new NullPointerException("Null triggeringLayoutId");
        }
        this.a = str2;
        this.b = j;
        this.c = ahboVar;
    }

    @Override // defpackage.snk
    public final aixr a() {
        return this.e;
    }

    @Override // defpackage.snk
    public final String b() {
        return this.d;
    }

    @Override // defpackage.skp
    public final String c() {
        return this.a;
    }

    @Override // defpackage.snk
    public final boolean d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof skc) {
            skc skcVar = (skc) obj;
            if (this.d.equals(skcVar.d) && this.e.equals(skcVar.e) && this.f == skcVar.f && this.a.equals(skcVar.a) && this.b == skcVar.b && this.c.equals(skcVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.a.hashCode()) * 1000003;
        long j = this.b;
        return ((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ahbo ahboVar = this.c;
        return "DurationAfterLayoutExitedTrigger{getTriggerId=" + this.d + ", getTriggerType=" + this.e.toString() + ", shouldOnlyTriggerOnce=" + this.f + ", triggeringLayoutId=" + this.a + ", durationMs=" + this.b + ", layoutExitReasons=" + ahboVar.toString() + '}';
    }

    public skc() {
        throw null;
    }
}
