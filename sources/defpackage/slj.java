package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class slj implements sma {
    public final String a;
    public final boolean b;
    public final String c;
    public final snh d;
    public final boolean e;
    private final aixr f;
    private final boolean g;

    public slj(String str, aixr aixrVar, boolean z, String str2, snh snhVar, boolean z2, boolean z3) {
        this.a = str;
        this.f = aixrVar;
        this.b = z;
        if (str2 == null) {
            throw new NullPointerException("Null getActivatingMediaLayoutId");
        }
        this.c = str2;
        this.d = snhVar;
        this.g = z2;
        this.e = z3;
    }

    @Override // defpackage.snk
    public final aixr a() {
        return this.f;
    }

    @Override // defpackage.snk
    public final String b() {
        return this.a;
    }

    @Override // defpackage.snk
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof slj) {
            slj sljVar = (slj) obj;
            if (this.a.equals(sljVar.a) && this.f.equals(sljVar.f) && this.b == sljVar.b && this.c.equals(sljVar.c) && this.d.equals(sljVar.d) && this.g == sljVar.g && this.e == sljVar.e) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sma
    public final boolean h() {
        throw null;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 1231) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ 1231) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        snh snhVar = this.d;
        return "MediaTimeRangePingTrigger{getTriggerId=" + this.a + ", getTriggerType=" + this.f.toString() + ", shouldOnlyTriggerOnce=true, shouldDisableIfVideoStartMuted=" + this.b + ", getActivatingMediaLayoutId=" + this.c + ", getTimeRange=" + snhVar.toString() + ", shouldPreventActivationOnTriggerRegistration=" + this.g + ", shouldActivateOnVideoTimeEvent=true, shouldAttachActiveViewDataOnActivation=" + this.e + ", shouldDisableOnSeek=false}";
    }

    public slj() {
        throw null;
    }
}
