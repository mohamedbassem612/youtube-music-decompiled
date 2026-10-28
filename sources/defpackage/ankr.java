package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ankr implements weh {
    static final ankq a;
    public static final weq b;
    private final ankw c;

    static {
        ankq ankqVar = new ankq();
        a = ankqVar;
        b = ankqVar;
    }

    public ankr(ankw ankwVar) {
        this.c = ankwVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        ankw ankwVar = this.c;
        if ((ankwVar.b & 16) != 0) {
            agkxVar.c(ankwVar.g);
        }
        if ((ankwVar.b & 32) != 0) {
            agkxVar.c(ankwVar.h);
        }
        return agkxVar.g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.c;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ankp d() {
        return new ankp(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof ankr) && this.c.equals(((ankr) obj).c);
    }

    public String getAndroidMediaStoreContentUri() {
        return this.c.i;
    }

    public String getExternalChannelId() {
        return this.c.d;
    }

    public String getName() {
        return this.c.e;
    }

    public aqmh getThumbnailDetails() {
        aqmh aqmhVar = this.c.f;
        return aqmhVar == null ? aqmh.a : aqmhVar;
    }

    public Long getTrackCount() {
        return Long.valueOf(this.c.j);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicArtistEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
