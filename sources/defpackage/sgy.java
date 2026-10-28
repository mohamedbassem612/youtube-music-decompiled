package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sgy extends shc {
    private final ambn a;

    public sgy(ambn ambnVar) {
        this.a = ambnVar;
    }

    @Override // defpackage.sml
    public final int b() {
        return 10;
    }

    @Override // defpackage.shc, defpackage.sml
    public final ambn d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sml)) {
            return false;
        }
        sml smlVar = (sml) obj;
        return smlVar.b() == 10 && this.a.equals(smlVar.d());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RenderingContent{instreamAdPlayerOverlayRenderer=" + this.a.toString() + '}';
    }
}
