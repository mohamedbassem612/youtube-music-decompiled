package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hle {
    public static final agkj a;
    public static final agkj b;
    public final akna c;

    static {
        agkh agkhVar = new agkh(4);
        agkhVar.e("FEmusic_offline_songs", akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS);
        agkhVar.e("FEmusic_offline_nma", akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_EPISODE_CONTAINERS);
        agkhVar.e("FEmusic_offline_releases", akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_ALBUMS);
        agkhVar.e("FEmusic_offline_playlists", akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_PLAYLISTS);
        agkhVar.e("FEmusic_offline", akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_DEFAULT);
        a = agkhVar.d(true);
        agkh agkhVar2 = new agkh(4);
        agkhVar2.e(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS, "FEmusic_offline_songs");
        agkhVar2.e(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS_DOWNLOADED_SUBCHIP, "FEmusic_offline_songs");
        agkhVar2.e(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_EPISODE_CONTAINERS, "FEmusic_offline_nma");
        agkhVar2.e(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_EPISODE_CONTAINERS_DOWNLOADED_SUBCHIP, "FEmusic_offline_nma");
        agkhVar2.e(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_ALBUMS, "FEmusic_offline_releases");
        agkhVar2.e(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_ALBUMS_DOWNLOADED_SUBCHIP, "FEmusic_offline_releases");
        agkhVar2.e(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_PLAYLISTS, "FEmusic_offline_playlists");
        agkhVar2.e(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_PLAYLISTS_DOWNLOADED_SUBCHIP, "FEmusic_offline_playlists");
        agkhVar2.e(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_DEFAULT, "FEmusic_offline");
        b = agkhVar2.d(true);
    }

    public hle(akna aknaVar) {
        this.c = aknaVar;
    }

    public static hle a(String str) {
        try {
            try {
                akmy akmyVarB = akmy.b(str);
                yw ywVar = new yw();
                aihf aihfVarCreateBuilder = akna.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                akna aknaVar = (akna) aihfVarCreateBuilder.instance;
                aknaVar.c = Integer.valueOf(akmyVarB.k);
                aknaVar.b = 1;
                ywVar.d((akna) aihfVarCreateBuilder.build());
                return ywVar.c();
            } catch (IllegalArgumentException unused) {
                throw new IllegalArgumentException("Invalid continuation token: ".concat(String.valueOf(str)));
            }
        } catch (IllegalArgumentException unused2) {
            akmz akmzVarB = akmz.b(str);
            yw ywVar2 = new yw();
            aihf aihfVarCreateBuilder2 = akna.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            akna aknaVar2 = (akna) aihfVarCreateBuilder2.instance;
            aknaVar2.c = Integer.valueOf(akmzVarB.g);
            aknaVar2.b = 2;
            ywVar2.d((akna) aihfVarCreateBuilder2.build());
            return ywVar2.c();
        }
    }

    public static boolean b(String str) {
        try {
            try {
                akmy.b(str);
                return true;
            } catch (IllegalArgumentException unused) {
                akmz.b(str);
                return true;
            }
        } catch (IllegalArgumentException unused2) {
            return false;
        }
    }

    public final boolean c() {
        return this.c.b == 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hle) {
            return this.c.equals(((hle) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "DownloadsLibraryReloadContinuationTokenModel{continuationToken=" + String.valueOf(this.c) + '}';
    }

    public hle() {
        throw null;
    }
}
