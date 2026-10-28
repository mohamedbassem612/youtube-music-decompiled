package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class snp implements skp, sma {
    public final boolean a;
    public final String b;
    public final String c;
    private final String d;
    private final aixr e;

    public snp(String str, aixr aixrVar, boolean z, String str2, String str3) {
        this.d = str;
        this.e = aixrVar;
        this.a = z;
        if (str2 == null) {
            throw new NullPointerException("Null getLayoutId");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null getMediaCpn");
        }
        this.c = str3;
    }

    @Override // defpackage.snk
    public final aixr a() {
        return this.e;
    }

    @Override // defpackage.snk
    public final String b() {
        return this.d;
    }

    @Override // defpackage.skp
    public final String c() {
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
        if (obj instanceof snp) {
            snp snpVar = (snp) obj;
            if (this.d.equals(snpVar.d) && this.e.equals(snpVar.e) && this.a == snpVar.a && this.b.equals(snpVar.b) && this.c.equals(snpVar.c)) {
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
        return ((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 1237) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "VisitAdvertiserLinkClickedTrigger{getTriggerId=" + this.d + ", getTriggerType=" + this.e.toString() + ", shouldOnlyTriggerOnce=false, shouldDisableIfVideoStartMuted=" + this.a + ", getLayoutId=" + this.b + ", getMediaCpn=" + this.c + '}';
    }

    public snp() {
        throw null;
    }
}
