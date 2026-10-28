package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hrx {
    public final agkh a;
    public final agkj b;
    public final agkj c;
    public final agkj d;
    public final agkj e;
    private final agke f;

    public hrx(agkh agkhVar, agke agkeVar, agkj agkjVar, agkj agkjVar2, agkj agkjVar3, agkj agkjVar4) {
        this.a = agkhVar;
        this.f = agkeVar;
        this.b = agkjVar;
        this.c = agkjVar2;
        this.d = agkjVar3;
        this.e = agkjVar4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hrx) {
            hrx hrxVar = (hrx) obj;
            if (this.a.equals(hrxVar.a) && aguu.v(this.f, hrxVar.f) && aguu.q(this.b, hrxVar.b) && aguu.q(this.c, hrxVar.c) && aguu.q(this.d, hrxVar.d) && aguu.q(this.e, hrxVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        agkj agkjVar = this.e;
        agkj agkjVar2 = this.d;
        agkj agkjVar3 = this.c;
        agkj agkjVar4 = this.b;
        agke agkeVar = this.f;
        return "PlaylistRefreshData{results=" + String.valueOf(this.a) + ", playlistIdsToDownload=" + String.valueOf(agkeVar) + ", videosMap=" + String.valueOf(agkjVar4) + ", playlistMap=" + String.valueOf(agkjVar3) + ", undownloadedVideoIdsMap=" + String.valueOf(agkjVar2) + ", formatTypeMap=" + String.valueOf(agkjVar) + '}';
    }

    public hrx() {
        throw null;
    }
}
