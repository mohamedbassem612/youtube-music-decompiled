package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class slw implements snk {
    public final String a;
    private final String b;
    private final aixr c;
    private final boolean d;

    public slw(String str, aixr aixrVar, boolean z, String str2) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.b = str;
        this.c = aixrVar;
        this.d = z;
        if (str2 == null) {
            throw new NullPointerException("Null getContentVideoId");
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

    @Override // defpackage.snk
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof slw) {
            slw slwVar = (slw) obj;
            if (this.b.equals(slwVar.b) && this.c.equals(slwVar.c) && this.d == slwVar.d && this.a.equals(slwVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "OnPlaybackWithContentVideoIdTrigger{getTriggerId=" + this.b + ", getTriggerType=" + this.c.toString() + ", shouldOnlyTriggerOnce=" + this.d + ", getContentVideoId=" + this.a + '}';
    }

    public slw() {
        throw null;
    }
}
