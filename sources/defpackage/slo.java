package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class slo implements skp {
    private final String a;
    private final aixr b;
    private final boolean c;
    private final String d;

    public slo(String str, aixr aixrVar, boolean z, String str2) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.a = str;
        this.b = aixrVar;
        this.c = z;
        if (str2 == null) {
            throw new NullPointerException("Null getLayoutId");
        }
        this.d = str2;
    }

    @Override // defpackage.snk
    public final aixr a() {
        return this.b;
    }

    @Override // defpackage.snk
    public final String b() {
        return this.a;
    }

    @Override // defpackage.skp
    public final String c() {
        return this.d;
    }

    @Override // defpackage.snk
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof slo) {
            slo sloVar = (slo) obj;
            if (this.a.equals(sloVar.a) && this.b.equals(sloVar.b) && this.c == sloVar.c && this.d.equals(sloVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "OnEngagementPanelAutoCloseTrigger{getTriggerId=" + this.a + ", getTriggerType=" + this.b.toString() + ", shouldOnlyTriggerOnce=" + this.c + ", getLayoutId=" + this.d + '}';
    }

    public slo() {
        throw null;
    }
}
