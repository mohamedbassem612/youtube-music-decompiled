package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sle implements sma {
    public final boolean a;
    public final String b;
    private final String c;
    private final aixr d;

    public sle(String str, aixr aixrVar, boolean z, String str2) {
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
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sle) {
            sle sleVar = (sle) obj;
            if (this.c.equals(sleVar.c) && this.d.equals(sleVar.d) && this.a == sleVar.a && this.b.equals(sleVar.b)) {
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
        return ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MediaFullscreenExitedTrigger{getTriggerId=" + this.c + ", getTriggerType=" + this.d.toString() + ", shouldOnlyTriggerOnce=false, shouldDisableIfVideoStartMuted=" + this.a + ", getMediaCpn=" + this.b + '}';
    }

    public sle() {
        throw null;
    }
}
