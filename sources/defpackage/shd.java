package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class shd extends sls {
    private final String a;
    private final aixr b;
    private final boolean c;
    private final String d;

    public shd(String str, aixr aixrVar, boolean z, String str2) {
        this.a = str;
        this.b = aixrVar;
        this.c = z;
        if (str2 == null) {
            throw new NullPointerException("Null getMediaCpn");
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
        return true;
    }

    @Override // defpackage.sls
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sls) {
            sls slsVar = (sls) obj;
            if (this.a.equals(slsVar.b()) && this.b.equals(slsVar.a())) {
                slsVar.d();
                if (this.c == slsVar.h() && this.d.equals(slsVar.e())) {
                    slsVar.f();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.sma
    public final boolean h() {
        return this.c;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1231) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1231;
    }

    public final String toString() {
        return "OnMediaPlaybackErrorTrigger{getTriggerId=" + this.a + ", getTriggerType=" + this.b.toString() + ", shouldOnlyTriggerOnce=true, shouldDisableIfVideoStartMuted=" + this.c + ", getMediaCpn=" + this.d + ", getShouldOnlyTriggerForFatalError=true}";
    }

    @Override // defpackage.sls
    public final void f() {
    }
}
