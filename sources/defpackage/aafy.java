package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aafy {
    static final String[] a = {"video_id", "language_code", "subtitles_path", "track_vss_id", "user_visible_track_name"};
    private final aaev b;

    public aafy(aaev aaevVar) {
        this.b = aaevVar;
    }

    public final void a(String str) {
        b().delete("subtitles_v5", "video_id = ?", new String[]{str});
    }

    public final SQLiteDatabase b() {
        return this.b.d();
    }
}
