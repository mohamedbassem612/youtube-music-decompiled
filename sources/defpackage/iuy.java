package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iuy {
    public static final syn a;

    static {
        qss qssVar = new qss();
        ahno.P(qssVar.a.g().isEmpty(), "dropAllVersionsBefore() must be the first UpgradeStep. The newVersionNumber parameter must be the number of removed addSchemaVersion() steps plus one.");
        ahno.P(!qssVar.b.g(), "Only one call to dropAllVersionsBefore() may be made. It must be the first call to a SQLSchema.Builder.");
        qssVar.b = new agfa(new rmp());
        qssVar.a("CREATE TABLE music_sideloaded_playlist(id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT NOT NULL);");
        qssVar.a("CREATE TABLE music_sideloaded_playlist_track(playlist_track_pair_id INTEGER PRIMARY KEY AUTOINCREMENT, playlist_id INTEGER NOT NULL, audio_media_id INTEGER NOT NULL, position INTEGER,  FOREIGN KEY(playlist_id) REFERENCES music_sideloaded_playlist(id) ON DELETE CASCADE);");
        a = qssVar.b();
    }
}
