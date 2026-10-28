package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sli implements sma {
    public final boolean a;
    public final String b;
    private final String c;
    private final aixr d;
    private final boolean e;

    public sli(String str, aixr aixrVar, boolean z, boolean z2, String str2) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.c = str;
        this.d = aixrVar;
        this.e = z;
        this.a = z2;
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
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sli) {
            sli sliVar = (sli) obj;
            if (this.c.equals(sliVar.c) && this.d.equals(sliVar.d) && this.e == sliVar.e && this.a == sliVar.a && this.b.equals(sliVar.b)) {
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
        return ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true == this.a ? 1231 : 1237)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MediaResumedTrigger{getTriggerId=" + this.c + ", getTriggerType=" + this.d.toString() + ", shouldOnlyTriggerOnce=" + this.e + ", shouldDisableIfVideoStartMuted=" + this.a + ", getMediaCpn=" + this.b + '}';
    }

    public sli() {
        throw null;
    }
}
