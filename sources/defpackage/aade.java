package defpackage;

import android.database.Cursor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aade implements aaqi {
    private final awmd a;

    public aade(awmd awmdVar) {
        this.a = awmdVar;
    }

    @Override // defpackage.aaqi
    public final int a(String str, int i) {
        taq.c();
        Cursor cursorQuery = ((aafe) this.a.io()).a().query("hashes", new String[]{"merkle_level"}, "video_id = ? AND itag = ?", new String[]{str, Integer.toString(i)}, null, null, "merkle_level DESC", "1");
        try {
            return cursorQuery.moveToNext() ? cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("merkle_level")) : -1;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // defpackage.aaqi
    public final aamf b(String str, int i, int i2, int i3) {
        aalw aalwVar;
        taq.c();
        Cursor cursorQuery = ((aafe) this.a.io()).a().query("hashes", aafe.a, "video_id = ? AND itag = ? AND merkle_level = ? AND block_index = ?", new String[]{str, Integer.toString(i), Integer.toString(i2), Integer.toString(i3)}, null, null, null, null);
        try {
            if (cursorQuery.moveToNext()) {
                cursorQuery.getClass();
                aalwVar = new aalw(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("video_id")), cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("itag")), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("storage_id")), cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("merkle_level")), cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("block_index")), cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("digest")), cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("hash_state")), tbd.e(cursorQuery, cursorQuery.getColumnIndexOrThrow("matches_bytes_on_disk"), true));
            } else {
                aalwVar = null;
            }
            return aalwVar;
        } finally {
            cursorQuery.close();
        }
    }
}
