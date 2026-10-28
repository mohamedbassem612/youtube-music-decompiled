package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lgq extends kyb {
    final /* synthetic */ lgr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgq(lgr lgrVar, Context context) {
        super(context, "google_app_measurement_local.db");
        this.a = lgrVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            lgr lgrVar = this.a;
            lgrVar.aT().c.a("Opening the local database failed, dropping and recreating it");
            if (!lgrVar.aS().getDatabasePath("google_app_measurement_local.db").delete()) {
                lgrVar.aT().c.b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.a.aT().c.b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        mda.s(this.a.aT(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        mda.r(this.a.aT(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", lgr.a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
