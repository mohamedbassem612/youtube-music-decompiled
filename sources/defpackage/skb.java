package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class skb implements snk {
    public final String a;
    public final boolean b;
    private final String c;
    private final aixr d;
    private final boolean e;

    public skb(String str, aixr aixrVar, boolean z, String str2, boolean z2) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.c = str;
        this.d = aixrVar;
        this.e = z;
        if (str2 == null) {
            throw new NullPointerException("Null getContentVideoId");
        }
        this.a = str2;
        this.b = z2;
    }

    @Override // defpackage.snk
    public final aixr a() {
        return this.d;
    }

    @Override // defpackage.snk
    public final String b() {
        return this.c;
    }

    @Override // defpackage.snk
    public final boolean d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof skb) {
            skb skbVar = (skb) obj;
            if (this.c.equals(skbVar.c) && this.d.equals(skbVar.d) && this.e == skbVar.e && this.a.equals(skbVar.a) && this.b == skbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.a.hashCode()) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "ContentVideoIdEndedTrigger{getTriggerId=" + this.c + ", getTriggerType=" + this.d.toString() + ", shouldOnlyTriggerOnce=" + this.e + ", getContentVideoId=" + this.a + ", shouldPreventActivationOnTriggerRegistration=" + this.b + '}';
    }

    public skb() {
        throw null;
    }
}
