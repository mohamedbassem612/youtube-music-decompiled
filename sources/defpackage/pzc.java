package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pzc extends SQLiteOpenHelper {
    static {
        agsn.h("GnpSdk");
    }

    public pzc(Context context, long j) {
        super(context, "".concat(j + "_thread_surveys.notifications.db"), (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        getDatabaseName();
        sQLiteDatabase.execSQL("CREATE TABLE thread_surveys(thread_id TEXT PRIMARY KEY NOT NULL,view_index INTEGER NOT NULL DEFAULT(0));");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        getDatabaseName();
    }
}
