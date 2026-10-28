package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class aars extends SQLiteOpenHelper {
    private final int a;

    public aars(Context context) {
        super(context, "bgol_tasks.db", (SQLiteDatabase.CursorFactory) null, 12);
        this.a = 12;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        Cursor cursorQuery = writableDatabase.query("transfers", null, null, null, null, null, null);
        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("file_path");
        int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("extras");
        int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("output_extras");
        HashSet hashSet = new HashSet();
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    new aamv(cursorQuery.getBlob(columnIndexOrThrow2));
                    new aamv(cursorQuery.getBlob(columnIndexOrThrow3));
                } catch (Exception unused) {
                    hashSet.add(cursorQuery.getString(columnIndexOrThrow));
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            writableDatabase.delete("transfers", "file_path = ?", new String[]{(String) it.next()});
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        onUpgrade(sQLiteDatabase, 0, this.a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        tbd.d(sQLiteDatabase);
        onUpgrade(sQLiteDatabase, 0, this.a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3;
        agrf agrfVar = aart.a;
        if (i < 8) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS transfers");
                sQLiteDatabase.execSQL("CREATE TABLE transfers (file_path TEXT PRIMARY KEY,network_uri TEXT,status INTEGER,status_reason INTEGER,bytes_transferred BIGINT,bytes_total BIGINT,extras BLOB,output_extras BLOB, accountname TEXT,priority INTEGER DEFAULT 0)");
                sQLiteDatabase.execSQL("CREATE INDEX idx_transfers_accountname ON transfers (accountname)");
                i3 = 8;
            } catch (SQLiteException e) {
                e = e;
                i3 = i;
                ((agrc) ((agrc) ((agrc) aart.a.b()).j(e)).k("com/google/android/libraries/youtube/offline/transfer/base/SQLiteTransfersDbHelper$TransfersSQLiteOpenHelper", "onUpgrade", 401, "SQLiteTransfersDbHelper.java")).x("[Offline] Error trying to upgrade from %d to %d. Wiping data and create database from scratch.", i3, i2);
                tbd.d(sQLiteDatabase);
                onUpgrade(sQLiteDatabase, 0, this.a);
                return;
            }
        } else {
            i3 = i;
        }
        if (i3 == 8 && i2 > 8) {
            try {
                Cursor cursorQuery = sQLiteDatabase.query("transfers", null, null, null, null, null, null);
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("file_path");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("extras");
                while (cursorQuery.moveToNext()) {
                    try {
                        String string = cursorQuery.getString(columnIndexOrThrow);
                        aamv aamvVar = new aamv(cursorQuery.getBlob(columnIndexOrThrow2));
                        if (aamvVar.m("thumbnail", false)) {
                            long j = aarq.a;
                            aamvVar.j("transfer_type", 2);
                        } else if (aamvVar.m("ad", false)) {
                            long j2 = aarq.a;
                            aamvVar.j("transfer_type", 3);
                        } else {
                            long j3 = aarq.a;
                            aamvVar.j("transfer_type", 1);
                        }
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("file_path", string);
                        contentValues.put("extras", aamvVar.g());
                        sQLiteDatabase.update("transfers", contentValues, "file_path = ?", new String[]{string});
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                cursorQuery.close();
                i3 = 9;
            } catch (SQLiteException e2) {
                e = e2;
                ((agrc) ((agrc) ((agrc) aart.a.b()).j(e)).k("com/google/android/libraries/youtube/offline/transfer/base/SQLiteTransfersDbHelper$TransfersSQLiteOpenHelper", "onUpgrade", 401, "SQLiteTransfersDbHelper.java")).x("[Offline] Error trying to upgrade from %d to %d. Wiping data and create database from scratch.", i3, i2);
                tbd.d(sQLiteDatabase);
                onUpgrade(sQLiteDatabase, 0, this.a);
                return;
            }
        }
        if (i3 != 9 || i2 <= 9) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE transfers ADD COLUMN failure_count INTEGER NOT NULL DEFAULT 0");
    }
}
