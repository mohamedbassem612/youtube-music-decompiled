package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bxq {
    static {
        bst.b("media3.database");
    }

    public static int a(SQLiteDatabase sQLiteDatabase, int i, String str) throws bxn {
        try {
            int i2 = -1;
            if (bwp.as(sQLiteDatabase)) {
                Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", d(i, str), null, null, null);
                try {
                    if (cursorQuery.getCount() != 0) {
                        cursorQuery.moveToNext();
                        i2 = cursorQuery.getInt(0);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } else if (cursorQuery != null) {
                        cursorQuery.close();
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
            return i2;
        } catch (SQLException e) {
            throw new bxn(e);
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase, int i, String str) throws bxn {
        try {
            if (bwp.as(sQLiteDatabase)) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", d(i, str));
            }
        } catch (SQLException e) {
            throw new bxn(e);
        }
    }

    public static void c(SQLiteDatabase sQLiteDatabase, int i, String str) throws bxn {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", (Integer) 1);
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e) {
            throw new bxn(e);
        }
    }

    private static String[] d(int i, String str) {
        return new String[]{Integer.toString(i), str};
    }
}
