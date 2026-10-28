package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class htd {
    public final agke a;
    public final Optional b;
    public final Optional c;
    public final agke d;
    public final agke e;

    public htd(agke agkeVar, Optional optional, Optional optional2, agke agkeVar2, agke agkeVar3) {
        this.a = agkeVar;
        this.b = optional;
        this.c = optional2;
        this.d = agkeVar2;
        this.e = agkeVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof htd) {
            htd htdVar = (htd) obj;
            if (aguu.v(this.a, htdVar.a) && this.b.equals(htdVar.b) && this.c.equals(htdVar.c) && aguu.v(this.d, htdVar.d) && aguu.v(this.e, htdVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        agke agkeVar = this.e;
        agke agkeVar2 = this.d;
        Optional optional = this.c;
        Optional optional2 = this.b;
        return "DownloadsLibrary{singleTrackContainers=" + String.valueOf(this.a) + ", smartDownloadedSingleTrackContainers=" + String.valueOf(optional2) + ", singleEpisodeContainer=" + String.valueOf(optional) + ", albums=" + String.valueOf(agkeVar2) + ", playlists=" + String.valueOf(agkeVar) + '}';
    }

    public htd() {
        throw null;
    }
}
