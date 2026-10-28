package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class skt implements skp {
    public final String a;
    public final ahbo b;
    private final String c;
    private final aixr d;
    private final boolean e;

    public skt(String str, aixr aixrVar, boolean z, String str2, ahbo ahboVar) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.c = str;
        this.d = aixrVar;
        this.e = z;
        if (str2 == null) {
            throw new NullPointerException("Null getTriggeringLayoutId");
        }
        this.a = str2;
        this.b = ahboVar;
    }

    public static skt e(String str, String str2, int i) {
        return new skt(str, aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON, false, str2, ahbo.c(i));
    }

    @Override // defpackage.snk
    public final aixr a() {
        return this.d;
    }

    @Override // defpackage.snk
    public final String b() {
        return this.c;
    }

    @Override // defpackage.skp
    public final String c() {
        return this.a;
    }

    @Override // defpackage.snk
    public final boolean d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof skt) {
            skt sktVar = (skt) obj;
            if (this.c.equals(sktVar.c) && this.d.equals(sktVar.d) && this.e == sktVar.e && this.a.equals(sktVar.a) && this.b.equals(sktVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ahbo ahboVar = this.b;
        return "LayoutExitedForReasonTrigger{getTriggerId=" + this.c + ", getTriggerType=" + this.d.toString() + ", shouldOnlyTriggerOnce=" + this.e + ", getTriggeringLayoutId=" + this.a + ", getLayoutExitReasons=" + ahboVar.toString() + '}';
    }

    public skt() {
        throw null;
    }
}
