package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class smh implements snk {
    private final String a;
    private final aixr b;
    private final Optional c;

    public smh(String str, aixr aixrVar, Optional optional) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.a = str;
        this.b = aixrVar;
        this.c = optional;
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
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof smh) {
            smh smhVar = (smh) obj;
            if (this.a.equals(smhVar.a) && this.b.equals(smhVar.b) && this.c.equals(smhVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        return "ReelItemSequenceAbandonedTrigger{getTriggerId=" + this.a + ", getTriggerType=" + this.b.toString() + ", shouldOnlyTriggerOnce=false, getIdentifier=" + optional.toString() + '}';
    }

    public smh() {
        throw null;
    }
}
