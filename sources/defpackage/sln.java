package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sln implements skp {
    public final String a;
    public final aixo b;
    public final aixg c;
    private final String d;
    private final aixr e;
    private final boolean f;

    public sln(String str, aixr aixrVar, boolean z, String str2, aixo aixoVar, aixg aixgVar) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.d = str;
        this.e = aixrVar;
        this.f = z;
        if (str2 == null) {
            throw new NullPointerException("Null getNonMatchingLayoutId");
        }
        this.a = str2;
        this.b = aixoVar;
        this.c = aixgVar;
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
        if (obj instanceof sln) {
            sln slnVar = (sln) obj;
            if (this.d.equals(slnVar.d) && this.e.equals(slnVar.e) && this.f == slnVar.f && this.a.equals(slnVar.a) && this.b.equals(slnVar.b) && this.c.equals(slnVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        aixg aixgVar = this.c;
        aixo aixoVar = this.b;
        return "OnDifferentLayoutIdEnteredTrigger{getTriggerId=" + this.d + ", getTriggerType=" + this.e.toString() + ", shouldOnlyTriggerOnce=" + this.f + ", getNonMatchingLayoutId=" + this.a + ", getSlotType=" + aixoVar.toString() + ", getLayoutType=" + aixgVar.toString() + '}';
    }

    public sln() {
        throw null;
    }
}
