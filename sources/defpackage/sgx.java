package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sgx extends shc {
    private final sgt a;

    public sgx(sgt sgtVar) {
        this.a = sgtVar;
    }

    @Override // defpackage.sml
    public final int b() {
        return 4;
    }

    @Override // defpackage.shc, defpackage.sml
    public final sgt c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sml)) {
            return false;
        }
        sml smlVar = (sml) obj;
        return smlVar.b() == 4 && this.a.equals(smlVar.c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RenderingContent{adVideoEnd=" + this.a.toString() + '}';
    }
}
