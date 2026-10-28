package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sgz extends shc {
    private final skz a;

    public sgz(skz skzVar) {
        this.a = skzVar;
    }

    @Override // defpackage.sml
    public final int b() {
        return 2;
    }

    @Override // defpackage.shc, defpackage.sml
    public final skz e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sml)) {
            return false;
        }
        sml smlVar = (sml) obj;
        return smlVar.b() == 2 && this.a.equals(smlVar.e());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RenderingContent{localVideoAd=" + this.a.toString() + '}';
    }
}
