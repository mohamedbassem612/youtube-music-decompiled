package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sks implements sma {
    public final boolean a;
    public final String b;
    public final String c;
    public final ahbo d;
    private final String e;
    private final aixr f;
    private final boolean g;

    public sks(String str, aixr aixrVar, boolean z, boolean z2, String str2, String str3, ahbo ahboVar) {
        this.e = str;
        this.f = aixrVar;
        this.g = z;
        this.a = z2;
        if (str2 == null) {
            throw new NullPointerException("Null getTriggeringLayoutId");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null getMediaCpn");
        }
        this.c = str3;
        this.d = ahboVar;
    }

    public static sks e(String str, String str2, String str3, int... iArr) {
        return new sks(str, aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON_PING, false, false, str2, str3, ahbo.b(iArr));
    }

    public static sks f(String str, String str2, String str3, boolean z, int... iArr) {
        return new sks(str, aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON_PING, true, z, str2, str3, ahbo.b(iArr));
    }

    @Override // defpackage.snk
    public final aixr a() {
        return this.f;
    }

    @Override // defpackage.snk
    public final String b() {
        return this.e;
    }

    @Override // defpackage.snk
    public final boolean d() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sks) {
            sks sksVar = (sks) obj;
            if (this.e.equals(sksVar.e) && this.f.equals(sksVar.f) && this.g == sksVar.g && this.a == sksVar.a && this.b.equals(sksVar.b) && this.c.equals(sksVar.c) && this.d.equals(sksVar.d)) {
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
        return ((((((((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true == this.a ? 1231 : 1237)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ahbo ahboVar = this.d;
        return "LayoutExitedForReasonPingTrigger{getTriggerId=" + this.e + ", getTriggerType=" + this.f.toString() + ", shouldOnlyTriggerOnce=" + this.g + ", shouldDisableIfVideoStartMuted=" + this.a + ", getTriggeringLayoutId=" + this.b + ", getMediaCpn=" + this.c + ", getLayoutExitReasons=" + ahboVar.toString() + '}';
    }

    public sks() {
        throw null;
    }
}
