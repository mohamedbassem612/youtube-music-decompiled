package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sha extends shc {
    private final sna a;

    public sha(sna snaVar) {
        this.a = snaVar;
    }

    @Override // defpackage.sml
    public final int b() {
        return 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sml)) {
            return false;
        }
        sml smlVar = (sml) obj;
        return smlVar.b() == 5 && this.a.equals(smlVar.f());
    }

    @Override // defpackage.shc, defpackage.sml
    public final sna f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RenderingContent{surveyAd=" + this.a.toString() + '}';
    }
}
