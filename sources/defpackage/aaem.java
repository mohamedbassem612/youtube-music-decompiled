package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaem {
    public static final String[] a = {"original_video_id", "ad_break_id", "ad_video_id", "vast_type", "expiry_timestamp", "asset_frequency_cap", "vast_playback_count", "vast", "ad_intro_video_id", "ad_intro_player_response"};
    private final aaev b;

    public aaem(aaev aaevVar) {
        aaevVar.getClass();
        this.b = aaevVar;
    }

    public final SQLiteDatabase a() {
        return this.b.d();
    }
}
