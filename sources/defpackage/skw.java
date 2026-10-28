package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class skw implements skp {
    public final String a;
    private final String b;
    private final aixr c;
    private final boolean d;

    public skw(String str, aixr aixrVar, boolean z, String str2) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.b = str;
        this.c = aixrVar;
        this.d = z;
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
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof skw) {
            skw skwVar = (skw) obj;
            if (this.b.equals(skwVar.b) && this.c.equals(skwVar.c) && this.d == skwVar.d && this.a.equals(skwVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdExitedTrigger{getTriggerId=" + this.b + ", getTriggerType=" + this.c.toString() + ", shouldOnlyTriggerOnce=" + this.d + ", getTriggeringLayoutId=" + this.a + '}';
    }

    public skw() {
        throw null;
    }
}
