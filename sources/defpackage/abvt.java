package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abvt implements abun {
    public final abnl a;
    public final abnp b;

    public abvt(abnl abnlVar, abnp abnpVar) {
        this.a = abnlVar;
        this.b = abnpVar;
    }

    @Override // defpackage.abun
    public final /* synthetic */ agke c() {
        return agpi.a;
    }

    @Override // defpackage.abun
    public final Class d() {
        return abvt.class;
    }

    @Override // defpackage.abun
    public final /* synthetic */ String e() {
        return aasc.g(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abvt) {
            abvt abvtVar = (abvt) obj;
            if (this.a.equals(abvtVar.a) && this.b.equals(abvtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        abnp abnpVar = this.b;
        return "SeedlessPlaylistPlaybackItem{playbackStartDescriptor=" + String.valueOf(this.a) + ", playbackStartParameters=" + String.valueOf(abnpVar) + '}';
    }

    public abvt() {
        throw null;
    }
}
