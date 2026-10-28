package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anyx implements weh {
    static final anyw a;
    public static final weq b;
    public final anzd c;

    static {
        anyw anywVar = new anyw();
        a = anywVar;
        b = anywVar;
    }

    public anyx(anzd anzdVar) {
        this.c = anzdVar;
    }

    public static anyv e(anzd anzdVar) {
        return new anyv(anzdVar.toBuilder());
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        anzd anzdVar = this.c;
        if ((anzdVar.b & 2) != 0) {
            agkxVar.c(anzdVar.d);
        }
        if (anzdVar.h.size() > 0) {
            agkxVar.j(anzdVar.h);
        }
        if ((anzdVar.b & SemanticState.LiveRegion) != 0) {
            agkxVar.c(anzdVar.m);
        }
        if ((anzdVar.b & SemanticState.ReadOnly) != 0) {
            agkxVar.c(anzdVar.n);
        }
        if ((anzdVar.b & SemanticState.Modal) != 0) {
            agkxVar.c(anzdVar.o);
        }
        if ((anzdVar.b & SemanticState.Obscured) != 0) {
            agkxVar.c(anzdVar.p);
        }
        if ((anzdVar.b & SemanticState.Multiline) != 0) {
            agkxVar.c(anzdVar.q);
        }
        if ((anzdVar.b & 524288) != 0) {
            agkxVar.c(anzdVar.w);
        }
        if ((anzdVar.b & 1048576) != 0) {
            agkxVar.c(anzdVar.x);
        }
        if ((anzdVar.b & 2097152) != 0) {
            agkxVar.c(anzdVar.y);
        }
        if ((anzdVar.b & 4194304) != 0) {
            agkxVar.c(anzdVar.z);
        }
        if ((anzdVar.b & 134217728) != 0) {
            agkxVar.c(anzdVar.E);
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
    public final /* bridge */ /* synthetic */ tzk d() {
        return new anyv(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anyx) && this.c.equals(((anyx) obj).c);
    }

    public final String f() {
        return this.c.q;
    }

    public final String g() {
        return this.c.y;
    }

    public String getAlbumTitle() {
        return this.c.r;
    }

    public Long getAlbumTrackIndex() {
        return Long.valueOf(this.c.t);
    }

    public String getAndroidMediaStoreContentUri() {
        return this.c.s;
    }

    public String getArtistNames() {
        return this.c.i;
    }

    public anzb getContentRating() {
        anzb anzbVar = this.c.v;
        return anzbVar == null ? anzb.a : anzbVar;
    }

    public alay getDescription() {
        alay alayVar = this.c.f;
        return alayVar == null ? alay.a : alayVar;
    }

    public Boolean getEligibleForResumption() {
        return Boolean.valueOf(this.c.A);
    }

    public anok getExternallyHostedMetadata() {
        anok anokVar = this.c.B;
        return anokVar == null ? anok.a : anokVar;
    }

    public Long getLengthMs() {
        return Long.valueOf(this.c.u);
    }

    public String getLikesCountAccessibilityText() {
        return this.c.G;
    }

    public String getLikesCountText() {
        return this.c.F;
    }

    public amud getLoggingDirectives() {
        amud amudVar = this.c.H;
        return amudVar == null ? amud.b : amudVar;
    }

    public anzw getMusicVideoType() {
        anzw anzwVarA = anzw.a(this.c.l);
        return anzwVarA == null ? anzw.MUSIC_VIDEO_TYPE_UNKNOWN : anzwVarA;
    }

    public String getPodcastShowPlaylistId() {
        return this.c.D;
    }

    public Long getPublishedTimestampMs() {
        return Long.valueOf(this.c.C);
    }

    public String getRadioAutomixPlaylistId() {
        return this.c.k;
    }

    public aqmh getThumbnailDetails() {
        aqmh aqmhVar = this.c.g;
        return aqmhVar == null ? aqmh.a : aqmhVar;
    }

    public String getTitle() {
        return this.c.e;
    }

    public String getVideoId() {
        return this.c.j;
    }

    public final boolean h() {
        return (this.c.b & 32768) != 0;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicTrackEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
