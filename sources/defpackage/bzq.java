package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bzq {
    private static final String[] a = {"name", "length", "last_touch_timestamp"};
    private final bxo b;
    private String c;

    public bzq(bxo bxoVar) {
        this.b = bxoVar;
    }

    public static void b(bxo bxoVar, long j) throws bxn {
        String hexString = Long.toHexString(j);
        try {
            String strG = g(hexString);
            SQLiteDatabase writableDatabase = bxoVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                bxq.b(writableDatabase, 2, hexString);
                h(writableDatabase, strG);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new bxn(e);
        }
    }

    private static String g(String str) {
        return "ExoPlayerCacheFileMetadata".concat(String.valueOf(str));
    }

    private static void h(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(str)));
    }

    public final Map a() throws bxn {
        try {
            this.c.getClass();
            Cursor cursorQuery = this.b.getReadableDatabase().query(this.c, a, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new czo(cursorQuery.getLong(1), cursorQuery.getLong(2), null, null));
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return map;
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
        } catch (SQLException e) {
            throw new bxn(e);
        }
    }

    public final void c(long j) throws bxn {
        try {
            String hexString = Long.toHexString(j);
            this.c = g(hexString);
            bxo bxoVar = this.b;
            if (bxq.a(bxoVar.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = bxoVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    bxq.c(writableDatabase, 2, hexString);
                    h(writableDatabase, this.c);
                    writableDatabase.execSQL("CREATE TABLE " + this.c + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new bxn(e);
        }
    }

    public final void d(String str) throws bxn {
        this.c.getClass();
        try {
            this.b.getWritableDatabase().delete(this.c, "name = ?", new String[]{str});
        } catch (SQLException e) {
            throw new bxn(e);
        }
    }

    public final void e(Set set) throws bxn {
        this.c.getClass();
        try {
            SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.c, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new bxn(e);
        }
    }

    public final void f(String str, long j, long j2) throws bxn {
        this.c.getClass();
        try {
            SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.c, null, contentValues);
        } catch (SQLException e) {
            throw new bxn(e);
        }
    }
}
