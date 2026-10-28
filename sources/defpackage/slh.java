package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class slh implements sma {
    public final boolean a;
    public final String b;
    private final String c;
    private final aixr d;

    public slh(String str, aixr aixrVar, boolean z, String str2) {
        this.c = str;
        this.d = aixrVar;
        this.a = z;
        if (str2 == null) {
            throw new NullPointerException("Null getMediaCpn");
        }
        this.b = str2;
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
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof slh) {
            slh slhVar = (slh) obj;
            if (this.c.equals(slhVar.c) && this.d.equals(slhVar.d) && this.a == slhVar.a && this.b.equals(slhVar.b)) {
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
        return ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1231) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MediaPlaybackStartedTrigger{getTriggerId=" + this.c + ", getTriggerType=" + this.d.toString() + ", shouldOnlyTriggerOnce=true, shouldDisableIfVideoStartMuted=" + this.a + ", getMediaCpn=" + this.b + '}';
    }

    public slh() {
        throw null;
    }
}
