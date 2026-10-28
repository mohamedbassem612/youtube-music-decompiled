package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sgw extends shc {
    private final sgo a;

    public sgw(sgo sgoVar) {
        this.a = sgoVar;
    }

    @Override // defpackage.shc, defpackage.sml
    public final sgo a() {
        return this.a;
    }

    @Override // defpackage.sml
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sml)) {
            return false;
        }
        sml smlVar = (sml) obj;
        return smlVar.b() == 1 && this.a.equals(smlVar.a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RenderingContent{adIntro=" + this.a.toString() + '}';
    }
}
