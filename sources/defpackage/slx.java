package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class slx implements snk {
    private final String a;
    private final aixr b;
    private final boolean c;
    private final String d;

    public slx(String str, aixr aixrVar, boolean z, String str2) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.a = str;
        this.b = aixrVar;
        this.c = z;
        if (str2 == null) {
            throw new NullPointerException("Null getSlotId");
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

    @Override // defpackage.snk
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof slx) {
            slx slxVar = (slx) obj;
            if (this.a.equals(slxVar.a) && this.b.equals(slxVar.b) && this.c == slxVar.c && this.d.equals(slxVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "OnSlotCancellationRequestedTrigger{getTriggerId=" + this.a + ", getTriggerType=" + this.b.toString() + ", shouldOnlyTriggerOnce=" + this.c + ", getSlotId=" + this.d + '}';
    }

    public slx() {
        throw null;
    }
}
