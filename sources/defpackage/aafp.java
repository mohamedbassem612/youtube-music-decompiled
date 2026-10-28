package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aafp implements tbh {
    @Override // defpackage.tbh
    public final void a(SQLiteDatabase sQLiteDatabase) {
        agkx agkxVar = new agkx();
        Cursor cursorQuery = sQLiteDatabase.query("streams", new String[]{"video_id", "itag", "external_yt_file_path"}, "external_yt_file_path IS NOT NULL", null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("video_id"));
                int i = cursorQuery.getInt(cursorQuery.getColumnIndex("itag"));
                String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("external_yt_file_path"));
                if (!TextUtils.isEmpty(string2)) {
                    Uri uriFromFile = Uri.fromFile(new File(string2));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("video_id", string);
                    contentValues.put("itag", Integer.valueOf(i));
                    contentValues.put("ytb_uri", uriFromFile.toString());
                    agkxVar.c(contentValues);
                }
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        agqr it = agkxVar.g().iterator();
        while (it.hasNext()) {
            ContentValues contentValues2 = (ContentValues) it.next();
            String[] strArr = {contentValues2.getAsString("video_id"), contentValues2.getAsString("itag")};
            contentValues2.remove("video_id");
            contentValues2.remove("itag");
            int iUpdate = sQLiteDatabase.update("streams", contentValues2, "video_id = ? AND itag = ?", strArr);
            if (iUpdate != 1) {
                ((agrc) ((agrc) aafs.a.b()).k("com/google/android/libraries/youtube/offline/database/OfflineSQLiteOpenHelper$OfflineSchemaMigrationV35", "apply", 1918, "OfflineSQLiteOpenHelper.java")).E("Unexpected number of rows affected (%d) when populating streams URI column for (%s, %s)", Integer.valueOf(iUpdate), strArr[0], strArr[1]);
            }
        }
    }
}
