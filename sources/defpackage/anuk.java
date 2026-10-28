package defpackage;

import app.rive.semantics.SemanticState;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anuk implements weh {
    static final anuj a;
    public static final weq b;
    public final anuu c;

    static {
        anuj anujVar = new anuj();
        a = anujVar;
        b = anujVar;
    }

    public anuk(anuu anuuVar) {
        this.c = anuuVar;
    }

    public static anui e(anuu anuuVar) {
        return new anui((aihh) anuuVar.toBuilder());
    }

    public static anui f(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihh aihhVar = (aihh) anuu.a.createBuilder();
        aihhVar.copyOnWrite();
        anuu anuuVar = (anuu) aihhVar.instance;
        anuuVar.b |= 1;
        anuuVar.c = str;
        return new anui(aihhVar);
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        anuu anuuVar = this.c;
        if (anuuVar.l.size() > 0) {
            agkxVar.j(anuuVar.l);
        }
        if ((anuuVar.b & SemanticState.LiveRegion) != 0) {
            agkxVar.c(anuuVar.n);
        }
        if ((anuuVar.b & SemanticState.ReadOnly) != 0) {
            agkxVar.c(anuuVar.o);
        }
        if ((anuuVar.b & SemanticState.Modal) != 0) {
            agkxVar.c(anuuVar.p);
        }
        if ((anuuVar.b & SemanticState.Obscured) != 0) {
            agkxVar.c(anuuVar.q);
        }
        if ((anuuVar.b & SemanticState.Multiline) != 0) {
            agkxVar.c(anuuVar.r);
        }
        if ((anuuVar.b & 16384) != 0) {
            agkxVar.c(anuuVar.s);
        }
        if ((anuuVar.b & 65536) != 0) {
            agkxVar.c(anuuVar.u);
        }
        if ((anuuVar.b & 1048576) != 0) {
            agkxVar.c(anuuVar.y);
        }
        anus podcastShowAdditionalMetadataModel = getPodcastShowAdditionalMetadataModel();
        agkx agkxVar2 = new agkx();
        anuy anuyVar = podcastShowAdditionalMetadataModel.a;
        if ((anuyVar.b & 1) != 0) {
            agkxVar2.c(anuyVar.c);
        }
        agkxVar.j(agkxVar2.g());
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
    public final boolean equals(Object obj) {
        return (obj instanceof anuk) && this.c.equals(((anuk) obj).c);
    }

    @Override // defpackage.weh
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final anui d() {
        return new anui((aihh) this.c.toBuilder());
    }

    public String getAndroidMediaStoreContentUri() {
        return this.c.v;
    }

    public alay getDescription() {
        alay alayVar = this.c.g;
        return alayVar == null ? alay.a : alayVar;
    }

    public Long getEstimatedPlayableTrackCount() {
        return Long.valueOf(this.c.x);
    }

    public String getFullListId() {
        return this.c.w;
    }

    public Boolean getLibraryCurationAllowed() {
        return Boolean.valueOf(this.c.f);
    }

    public aigj getOfflinePlaylistToken() {
        return this.c.z;
    }

    public String getOwnerDisplayName() {
        return this.c.t;
    }

    public String getPlaylistId() {
        return this.c.e;
    }

    public anuy getPodcastShowAdditionalMetadata() {
        anuy anuyVar = this.c.m;
        return anuyVar == null ? anuy.a : anuyVar;
    }

    public anus getPodcastShowAdditionalMetadataModel() {
        anuy anuyVar = this.c.m;
        if (anuyVar == null) {
            anuyVar = anuy.a;
        }
        return new anus((anuy) anuyVar.toBuilder().build());
    }

    public aqmh getThumbnailDetails() {
        aqmh aqmhVar = this.c.h;
        return aqmhVar == null ? aqmh.a : aqmhVar;
    }

    public String getTitle() {
        return this.c.d;
    }

    public Long getTrackCount() {
        return Long.valueOf(this.c.k);
    }

    public aotk getVisibility() {
        aotk aotkVarA = aotk.a(this.c.i);
        return aotkVarA == null ? aotk.PLAYLIST_ENTITY_VISIBILITY_UNKNOWN : aotkVarA;
    }

    public final String h() {
        return this.c.q;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String i() {
        return this.c.r;
    }

    public final List j() {
        return this.c.l;
    }

    public final boolean k() {
        return (this.c.b & SemanticState.Hidden) != 0;
    }

    public final boolean l() {
        return (this.c.b & SemanticState.Focused) != 0;
    }

    public final String toString() {
        return "MusicPlaylistEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
