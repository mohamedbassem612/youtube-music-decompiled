package defpackage;

import app.rive.semantics.SemanticState;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anjx implements weh {
    static final anjw a;
    public static final weq b;
    public final ankd c;

    static {
        anjw anjwVar = new anjw();
        a = anjwVar;
        b = anjwVar;
    }

    public anjx(ankd ankdVar) {
        this.c = ankdVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        ankd ankdVar = this.c;
        if ((ankdVar.b & 2) != 0) {
            agkxVar.c(ankdVar.d);
        }
        if (ankdVar.h.size() > 0) {
            agkxVar.j(ankdVar.h);
        }
        if ((ankdVar.b & 64) != 0) {
            agkxVar.c(ankdVar.k);
        }
        if ((ankdVar.b & SemanticState.Focused) != 0) {
            agkxVar.c(ankdVar.l);
        }
        if (ankdVar.o.size() > 0) {
            agkxVar.j(ankdVar.o);
        }
        if ((ankdVar.b & 262144) != 0) {
            agkxVar.c(ankdVar.x);
        }
        if ((ankdVar.b & 1048576) != 0) {
            agkxVar.c(ankdVar.z);
        }
        if ((ankdVar.b & 2097152) != 0) {
            agkxVar.c(ankdVar.A);
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
        return new anjv((aihh) this.c.toBuilder());
    }

    public final List e() {
        return this.c.o;
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anjx) && this.c.equals(((anjx) obj).c);
    }

    public final boolean f() {
        return (this.c.b & SemanticState.Modal) != 0;
    }

    public String getAndroidMediaStoreContentUri() {
        return this.c.w;
    }

    public String getArtistDisplayName() {
        return this.c.i;
    }

    public String getAudioPlaylistId() {
        return this.c.m;
    }

    public ankb getContentRating() {
        ankb ankbVar = this.c.r;
        return ankbVar == null ? ankb.a : ankbVar;
    }

    public alay getDescription() {
        alay alayVar = this.c.f;
        return alayVar == null ? alay.a : alayVar;
    }

    public Long getDurationMs() {
        return Long.valueOf(this.c.p);
    }

    public String getLikeTargetPlaylistId() {
        return this.c.t;
    }

    public amud getLoggingDirectives() {
        amud amudVar = this.c.y;
        return amudVar == null ? amud.b : amudVar;
    }

    public aigj getOfflinePlaylistToken() {
        return this.c.B;
    }

    public String getRadioAutomixPlaylistId() {
        return this.c.v;
    }

    public String getRadioPlaylistMixPlaylistId() {
        return this.c.u;
    }

    public akke getReleaseDate() {
        akke akkeVar = this.c.q;
        return akkeVar == null ? akke.a : akkeVar;
    }

    public ankf getReleaseType() {
        ankf ankfVarA = ankf.a(this.c.s);
        return ankfVarA == null ? ankf.MUSIC_RELEASE_TYPE_UNKNOWN : ankfVarA;
    }

    public aqmh getThumbnailDetails() {
        aqmh aqmhVar = this.c.g;
        return aqmhVar == null ? aqmh.a : aqmhVar;
    }

    public String getTitle() {
        return this.c.e;
    }

    public Long getTrackCount() {
        return Long.valueOf(this.c.n);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicAlbumReleaseEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
