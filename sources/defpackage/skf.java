package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class skf implements snk {
    public final String a;
    public final agke b;
    public final boolean c;
    private final String d;
    private final aixr e;

    public skf(String str, aixr aixrVar, String str2, agke agkeVar, boolean z) {
        this.d = str;
        this.e = aixrVar;
        if (str2 == null) {
            throw new NullPointerException("Null getMediaCpn");
        }
        this.a = str2;
        if (agkeVar == null) {
            throw new NullPointerException("Null getPlayerVisibilityStates");
        }
        this.b = agkeVar;
        this.c = z;
    }

    @Override // defpackage.snk
    public final aixr a() {
        return this.e;
    }

    @Override // defpackage.snk
    public final String b() {
        return this.d;
    }

    @Override // defpackage.snk
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof skf) {
            skf skfVar = (skf) obj;
            if (this.d.equals(skfVar.d) && this.e.equals(skfVar.e) && this.a.equals(skfVar.a) && aguu.v(this.b, skfVar.b) && this.c == skfVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode()) * 583896283) ^ 1231) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        agke agkeVar = this.b;
        return "DurationAfterMediaPausedTrigger{getTriggerId=" + this.d + ", getTriggerType=" + this.e.toString() + ", shouldOnlyTriggerOnce=false, getMediaCpn=" + this.a + ", getPauseDurationMilliseconds=0, getLactThresholdMilliseconds=0, getShouldOnlyTriggerOnUserInitiatedPause=true, getPlayerVisibilityStates=" + String.valueOf(agkeVar) + ", getActivateOnlyIfCtaOverlayAbsent=" + this.c + '}';
    }

    public skf() {
        throw null;
    }
}
