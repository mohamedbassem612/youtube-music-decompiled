package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class skq implements skp {
    public final String a;
    private final String b;
    private final aixr c;

    public skq(String str, aixr aixrVar, String str2) {
        this.b = str;
        this.c = aixrVar;
        if (str2 == null) {
            throw new NullPointerException("Null getTriggeringLayoutId");
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

    @Override // defpackage.skp
    public final String c() {
        return this.a;
    }

    @Override // defpackage.snk
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof skq) {
            skq skqVar = (skq) obj;
            if (this.b.equals(skqVar.b) && this.c.equals(skqVar.c) && this.a.equals(skqVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "LayoutExitedAfterTimeoutTrigger{getTriggerId=" + this.b + ", getTriggerType=" + this.c.toString() + ", shouldOnlyTriggerOnce=false, getTriggeringLayoutId=" + this.a + '}';
    }

    public skq() {
        throw null;
    }
}
