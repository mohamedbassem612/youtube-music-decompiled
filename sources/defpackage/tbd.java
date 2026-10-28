package defpackage;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tbd {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/common/database/DatabaseUtil");
    public static final Integer a = 1;
    private static final Integer c = 0;

    public static long a(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        return DatabaseUtils.longForQuery(sQLiteDatabase, "select count(*) from " + str + (!TextUtils.isEmpty(str2) ? " where ".concat(str2) : ""), strArr);
    }

    public static Integer b(boolean z) {
        return z ? a : c;
    }

    public static String c(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(str);
            sb.append('.');
            sb.append(str2);
        }
        return sb.toString();
    }

    public static void d(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = sQLiteDatabase.query("sqlite_master", new String[]{"type", "name"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                String string = cursorQuery.getString(0);
                String string2 = cursorQuery.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    String strCa = a.ca(string2, string, "DROP ", " IF EXISTS ");
                    try {
                        sQLiteDatabase.execSQL(strCa);
                    } catch (SQLException e) {
                        ((agrc) ((agrc) ((agrc) b.b()).j(e)).k("com/google/android/libraries/youtube/common/database/DatabaseUtil", "wipeDatabase", 45, "DatabaseUtil.java")).w("Error executing %s", strCa);
                    }
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
    }

    public static boolean e(Cursor cursor, int i, boolean z) {
        if (cursor.isNull(i)) {
            return z;
        }
        return cursor.getInt(i) == 1;
    }

    public static String f(Cursor cursor, int i) {
        return !cursor.isNull(i) ? cursor.getString(i) : "";
    }
}
