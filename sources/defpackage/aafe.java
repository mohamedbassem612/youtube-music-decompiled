package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aafe {
    public static final String[] a = {"video_id", "itag", "storage_id", "merkle_level", "block_index", "digest", "hash_state", "matches_bytes_on_disk"};
    public final List b = new ArrayList();
    private final aaev c;

    public aafe(aaev aaevVar) {
        this.c = aaevVar;
    }

    public final SQLiteDatabase a() {
        return this.c.d();
    }
}
