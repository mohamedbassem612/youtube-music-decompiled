package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iej {
    public final agke a;
    public final int b;
    public final int c;
    public final boolean d;
    public final String e;
    public final String f;
    public final agke g;
    public final aigj h;
    public final ajwo i;
    public final anvl j;
    public final Optional k;
    public final Optional l;
    public final Optional m;
    public final Optional n;
    public final Optional o;
    public final Optional p;
    public final aimm q;
    public final Optional r;
    private final agke s;
    private final agke t;

    public iej(agke agkeVar, int i, int i2, boolean z, String str, String str2, agke agkeVar2, agke agkeVar3, aigj aigjVar, agke agkeVar4, ajwo ajwoVar, anvl anvlVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, aimm aimmVar, Optional optional7) {
        this.a = agkeVar;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.g = agkeVar2;
        this.s = agkeVar3;
        this.h = aigjVar;
        this.t = agkeVar4;
        this.i = ajwoVar;
        this.j = anvlVar;
        this.k = optional;
        this.l = optional2;
        this.m = optional3;
        this.n = optional4;
        this.o = optional5;
        this.p = optional6;
        this.q = aimmVar;
        this.r = optional7;
    }

    public final void a() {
        this.a.size();
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        aigj aigjVar;
        ajwo ajwoVar;
        anvl anvlVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof iej) {
            iej iejVar = (iej) obj;
            if (aguu.v(this.a, iejVar.a) && this.b == iejVar.b && this.c == iejVar.c && this.d == iejVar.d && ((str = this.e) != null ? str.equals(iejVar.e) : iejVar.e == null) && ((str2 = this.f) != null ? str2.equals(iejVar.f) : iejVar.f == null) && aguu.v(this.g, iejVar.g) && aguu.v(this.s, iejVar.s) && ((aigjVar = this.h) != null ? aigjVar.equals(iejVar.h) : iejVar.h == null) && aguu.v(this.t, iejVar.t) && ((ajwoVar = this.i) != null ? ajwoVar.equals(iejVar.i) : iejVar.i == null) && ((anvlVar = this.j) != null ? anvlVar.equals(iejVar.j) : iejVar.j == null) && this.k.equals(iejVar.k) && this.l.equals(iejVar.l) && this.m.equals(iejVar.m) && this.n.equals(iejVar.n) && this.o.equals(iejVar.o) && this.p.equals(iejVar.p) && this.q.equals(iejVar.q) && this.r.equals(iejVar.r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.e;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i = this.b;
        int i2 = ((((((((iHashCode * 1000003) ^ i) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ iHashCode2) * 1000003;
        String str2 = this.f;
        int iHashCode3 = (((((i2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003;
        aigj aigjVar = this.h;
        int iHashCode4 = (((iHashCode3 ^ (aigjVar == null ? 0 : aigjVar.hashCode())) * 1000003) ^ this.t.hashCode()) * 1000003;
        ajwo ajwoVar = this.i;
        int iHashCode5 = (iHashCode4 ^ (ajwoVar == null ? 0 : ajwoVar.hashCode())) * 1000003;
        anvl anvlVar = this.j;
        return ((((((((((((((((iHashCode5 ^ (anvlVar != null ? anvlVar.hashCode() : 0)) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode();
    }

    public final String toString() {
        Optional optional = this.r;
        aimm aimmVar = this.q;
        Optional optional2 = this.p;
        Optional optional3 = this.o;
        Optional optional4 = this.n;
        Optional optional5 = this.m;
        Optional optional6 = this.l;
        Optional optional7 = this.k;
        anvl anvlVar = this.j;
        ajwo ajwoVar = this.i;
        agke agkeVar = this.t;
        aigj aigjVar = this.h;
        agke agkeVar2 = this.s;
        agke agkeVar3 = this.g;
        return "QueueSnapshot{videos=" + String.valueOf(this.a) + ", playbackPosition=" + this.b + ", autonavIndex=" + this.c + ", isInfinite=" + this.d + ", title=" + this.e + ", byline=" + this.f + ", watchNextTrackingParams=" + String.valueOf(agkeVar3) + ", watchNextResponsesWithPlaylistPanel=" + String.valueOf(agkeVar2) + ", currentWatchNextResponse=" + String.valueOf(aigjVar) + ", musicQueueResponses=" + String.valueOf(agkeVar) + ", currentWatchPageCommand=" + String.valueOf(ajwoVar) + ", musicQueueConfig=" + String.valueOf(anvlVar) + ", musicQueueHeaderRenderer=" + String.valueOf(optional7) + ", queueSubHeaderChipCloudRenderer=" + String.valueOf(optional6) + ", autoplaySubHeaderChipCloudRenderer=" + String.valueOf(optional5) + ", queueContextParams=" + String.valueOf(optional4) + ", shuffleCommand=" + String.valueOf(optional3) + ", unshuffleCommand=" + String.valueOf(optional2) + ", syncStatus=" + String.valueOf(aimmVar) + ", responsiveSignals=" + String.valueOf(optional) + '}';
    }

    public iej() {
        throw null;
    }
}
