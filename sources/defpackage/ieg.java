package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ieg {
    public final long A;
    public final agke a;
    public final agke b;
    public final long c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final Optional g;
    public final String h;
    public final String i;
    public final aobx j;
    public final aoyh k;
    public final aobz l;
    public final agke m;
    public final agke n;
    public final aigj o;
    public final agke p;
    public final ajwo q;
    public final anvl r;
    public final Optional s;
    public final Optional t;
    public final Optional u;
    public final Optional v;
    public final Optional w;
    public final Optional x;
    public final aimm y;
    public final Optional z;

    public ieg(agke agkeVar, agke agkeVar2, long j, int i, boolean z, boolean z2, Optional optional, String str, String str2, aobx aobxVar, aoyh aoyhVar, aobz aobzVar, agke agkeVar3, agke agkeVar4, aigj aigjVar, agke agkeVar5, ajwo ajwoVar, anvl anvlVar, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, aimm aimmVar, Optional optional8, long j2) {
        this.a = agkeVar;
        this.b = agkeVar2;
        this.c = j;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = optional;
        this.h = str;
        this.i = str2;
        this.j = aobxVar;
        this.k = aoyhVar;
        this.l = aobzVar;
        this.m = agkeVar3;
        this.n = agkeVar4;
        this.o = aigjVar;
        this.p = agkeVar5;
        this.q = ajwoVar;
        this.r = anvlVar;
        this.s = optional2;
        this.t = optional3;
        this.u = optional4;
        this.v = optional5;
        this.w = optional6;
        this.x = optional7;
        this.y = aimmVar;
        this.z = optional8;
        this.A = j2;
    }

    public static ief a() {
        ief iefVar = new ief();
        agke agkeVar = agpi.a;
        iefVar.j(agkeVar);
        iefVar.f(agkeVar);
        iefVar.i(0);
        iefVar.h(false);
        iefVar.g(false);
        iefVar.l(aimm.a);
        iefVar.k(0L);
        iefVar.m(0L);
        return iefVar;
    }

    public final Optional b() {
        agke agkeVar = this.a;
        if (agkeVar.isEmpty()) {
            return Optional.empty();
        }
        int i = this.d;
        return (i < 0 || i >= agkeVar.size()) ? Optional.empty() : Optional.of((hyz) agkeVar.get(i));
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        aobx aobxVar;
        aoyh aoyhVar;
        aobz aobzVar;
        aigj aigjVar;
        ajwo ajwoVar;
        anvl anvlVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ieg) {
            ieg iegVar = (ieg) obj;
            if (aguu.v(this.a, iegVar.a) && aguu.v(this.b, iegVar.b) && this.c == iegVar.c && this.d == iegVar.d && this.e == iegVar.e && this.f == iegVar.f && this.g.equals(iegVar.g) && ((str = this.h) != null ? str.equals(iegVar.h) : iegVar.h == null) && ((str2 = this.i) != null ? str2.equals(iegVar.i) : iegVar.i == null) && ((aobxVar = this.j) != null ? aobxVar.equals(iegVar.j) : iegVar.j == null) && ((aoyhVar = this.k) != null ? aoyhVar.equals(iegVar.k) : iegVar.k == null) && ((aobzVar = this.l) != null ? aobzVar.equals(iegVar.l) : iegVar.l == null) && aguu.v(this.m, iegVar.m) && aguu.v(this.n, iegVar.n) && ((aigjVar = this.o) != null ? aigjVar.equals(iegVar.o) : iegVar.o == null) && aguu.v(this.p, iegVar.p) && ((ajwoVar = this.q) != null ? ajwoVar.equals(iegVar.q) : iegVar.q == null) && ((anvlVar = this.r) != null ? anvlVar.equals(iegVar.r) : iegVar.r == null) && this.s.equals(iegVar.s) && this.t.equals(iegVar.t) && this.u.equals(iegVar.u) && this.v.equals(iegVar.v) && this.w.equals(iegVar.w) && this.x.equals(iegVar.x) && this.y.equals(iegVar.y) && this.z.equals(iegVar.z) && this.A == iegVar.A) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = true != this.e ? 1237 : 1231;
        long j = this.c;
        int iHashCode2 = (((((((((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.d) * 1000003) ^ i) * 1000003) ^ (true == this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode();
        String str = this.h;
        int iHashCode3 = ((iHashCode2 * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.i;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        aobx aobxVar = this.j;
        int iHashCode5 = (iHashCode4 ^ (aobxVar == null ? 0 : aobxVar.hashCode())) * 1000003;
        aoyh aoyhVar = this.k;
        int iHashCode6 = (iHashCode5 ^ (aoyhVar == null ? 0 : aoyhVar.hashCode())) * 1000003;
        aobz aobzVar = this.l;
        int iHashCode7 = (((((iHashCode6 ^ (aobzVar == null ? 0 : aobzVar.hashCode())) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003;
        aigj aigjVar = this.o;
        int iHashCode8 = (((iHashCode7 ^ (aigjVar == null ? 0 : aigjVar.hashCode())) * 1000003) ^ this.p.hashCode()) * 1000003;
        ajwo ajwoVar = this.q;
        int iHashCode9 = (iHashCode8 ^ (ajwoVar == null ? 0 : ajwoVar.hashCode())) * 1000003;
        anvl anvlVar = this.r;
        int iHashCode10 = (((((((((((((((((iHashCode9 ^ (anvlVar != null ? anvlVar.hashCode() : 0)) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode()) * 1000003) ^ this.v.hashCode()) * 1000003) ^ this.w.hashCode()) * 1000003) ^ this.x.hashCode()) * 1000003) ^ this.y.hashCode()) * 1000003) ^ this.z.hashCode()) * 1000003;
        long j2 = this.A;
        return iHashCode10 ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        Optional optional = this.z;
        aimm aimmVar = this.y;
        Optional optional2 = this.x;
        Optional optional3 = this.w;
        Optional optional4 = this.v;
        Optional optional5 = this.u;
        Optional optional6 = this.t;
        Optional optional7 = this.s;
        anvl anvlVar = this.r;
        ajwo ajwoVar = this.q;
        agke agkeVar = this.p;
        aigj aigjVar = this.o;
        agke agkeVar2 = this.n;
        agke agkeVar3 = this.m;
        aobz aobzVar = this.l;
        aoyh aoyhVar = this.k;
        aobx aobxVar = this.j;
        Optional optional8 = this.g;
        agke agkeVar4 = this.b;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(agkeVar4);
        String strValueOf3 = String.valueOf(optional8);
        String strValueOf4 = String.valueOf(aobxVar);
        String strValueOf5 = String.valueOf(aoyhVar);
        String strValueOf6 = String.valueOf(aobzVar);
        String strValueOf7 = String.valueOf(agkeVar3);
        String strValueOf8 = String.valueOf(agkeVar2);
        String strValueOf9 = String.valueOf(aigjVar);
        String strValueOf10 = String.valueOf(agkeVar);
        String strValueOf11 = String.valueOf(ajwoVar);
        String strValueOf12 = String.valueOf(anvlVar);
        String strValueOf13 = String.valueOf(optional7);
        String strValueOf14 = String.valueOf(optional6);
        String strValueOf15 = String.valueOf(optional5);
        String strValueOf16 = String.valueOf(optional4);
        String strValueOf17 = String.valueOf(optional3);
        String strValueOf18 = String.valueOf(optional2);
        String strValueOf19 = String.valueOf(aimmVar);
        String strValueOf20 = String.valueOf(optional);
        StringBuilder sb = new StringBuilder("MusicPlaybackQueueState{queue=");
        sb.append(strValueOf);
        sb.append(", autonav=");
        sb.append(strValueOf2);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(", playbackPosition=");
        sb.append(this.d);
        sb.append(", isInfinite=");
        sb.append(this.e);
        sb.append(", hasExpandedAutomix=");
        sb.append(this.f);
        sb.append(", playbackContentMode=");
        sb.append(strValueOf3);
        sb.append(", playlistPanelTitle=");
        sb.append(this.h);
        sb.append(", playlistPanelByline=");
        sb.append(this.i);
        sb.append(", nextContinuation=");
        sb.append(strValueOf4);
        sb.append(", previousContinuation=");
        sb.append(strValueOf5);
        sb.append(", nextRadioContinuation=");
        sb.append(strValueOf6);
        sb.append(", watchNextTrackingParams=");
        sb.append(strValueOf7);
        sb.append(", watchNextResponsesWithPlaylistPanel=");
        sb.append(strValueOf8);
        sb.append(", currentWatchNextResponse=");
        sb.append(strValueOf9);
        sb.append(", musicQueueResponses=");
        sb.append(strValueOf10);
        sb.append(", currentWatchPageCommand=");
        sb.append(strValueOf11);
        long j = this.A;
        sb.append(", musicQueueConfig=");
        sb.append(strValueOf12);
        sb.append(", musicQueueHeaderRenderer=");
        sb.append(strValueOf13);
        sb.append(", queueSubHeaderChipCloudRenderer=");
        sb.append(strValueOf14);
        sb.append(", autoplaySubHeaderChipCloudRenderer=");
        sb.append(strValueOf15);
        sb.append(", queueContextParams=");
        sb.append(strValueOf16);
        sb.append(", shuffleCommand=");
        sb.append(strValueOf17);
        sb.append(", unshuffleCommand=");
        sb.append(strValueOf18);
        sb.append(", syncStatus=");
        sb.append(strValueOf19);
        sb.append(", responsiveSignals=");
        sb.append(strValueOf20);
        sb.append(", queueSavedTimestamp=");
        sb.append(j);
        sb.append('}');
        return sb.toString();
    }

    public ieg() {
        throw null;
    }
}
