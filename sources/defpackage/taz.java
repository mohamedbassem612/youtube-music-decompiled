package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class taz implements tbh {
    private final /* synthetic */ int $cid;
    private final String a;

    public taz(String str, int i) {
        this.$cid = i;
        this.a = str;
    }

    @Override // defpackage.tbh
    public final void a(SQLiteDatabase sQLiteDatabase) {
        int i = this.$cid;
        String str = this.a;
        if (i == 0) {
            sQLiteDatabase.execSQL("DROP INDEX IF EXISTS ".concat(str.concat("_key_index")));
            return;
        }
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS " + str.concat("_key_index") + " ON " + str + " (key)");
    }
}
