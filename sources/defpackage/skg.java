package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class skg implements snk {
    public final String a;
    private final String b;
    private final aixr c;

    public skg(String str, aixr aixrVar, String str2) {
        this.b = str;
        this.c = aixrVar;
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

    @Override // defpackage.snk
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof skg) {
            skg skgVar = (skg) obj;
            if (this.b.equals(skgVar.b) && this.c.equals(skgVar.c)) {
                String str = this.a;
                if (str == null) {
                    if (skgVar.a == null) {
                        return true;
                    }
                } else if (str.equals(skgVar.a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
        String str = this.a;
        return (((iHashCode * 1000003) ^ 1237) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "DynamicDurationAfterCacheMissTrigger{getTriggerId=" + this.b + ", getTriggerType=" + this.c.toString() + ", shouldOnlyTriggerOnce=false, cuepointId=" + this.a + '}';
    }

    public skg() {
        throw null;
    }
}
