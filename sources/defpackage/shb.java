package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class shb extends shc {
    private final snc a;

    public shb(snc sncVar) {
        this.a = sncVar;
    }

    @Override // defpackage.sml
    public final int b() {
        return 6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sml)) {
            return false;
        }
        sml smlVar = (sml) obj;
        return smlVar.b() == 6 && this.a.equals(smlVar.g());
    }

    @Override // defpackage.shc, defpackage.sml
    public final snc g() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RenderingContent{surveyInterstitialAd=" + this.a.toString() + '}';
    }
}
