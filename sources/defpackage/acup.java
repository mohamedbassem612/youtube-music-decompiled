package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acup implements abun {
    public final ajwo a;

    public acup(ajwo ajwoVar) {
        this.a = ajwoVar;
    }

    @Override // defpackage.abun
    public final /* synthetic */ agke c() {
        return agpi.a;
    }

    @Override // defpackage.abun
    public final Class d() {
        return acup.class;
    }

    @Override // defpackage.abun
    public final /* synthetic */ String e() {
        return aasc.g(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acup) {
            return this.a.equals(((acup) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ReelNonVideoItem{reelNonVideoCommand=" + String.valueOf(this.a) + '}';
    }

    public acup() {
        throw null;
    }
}
