package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tba implements tbh {
    private final String a;

    public tba(String str) {
        this.a = str;
    }

    @Override // defpackage.tbh
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + this.a + " (insertionOrder INTEGER PRIMARY KEY AUTOINCREMENT,key TEXT KEY,value BLOB NOT NULL,sortingValue INTEGER NOT NULL)");
    }
}
