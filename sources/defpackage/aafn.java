package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aafn implements tbh {
    private final long a;

    public aafn(long j) {
        this.a = j;
    }

    @Override // defpackage.tbh
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN metadata_timestamp INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN streams_timestamp INTEGER DEFAULT 0");
        ContentValues contentValues = new ContentValues();
        Long lValueOf = Long.valueOf(this.a);
        contentValues.put("metadata_timestamp", lValueOf);
        contentValues.put("streams_timestamp", lValueOf);
        sQLiteDatabase.update("videosV2", contentValues, null, null);
    }
}
