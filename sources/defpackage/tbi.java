package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class tbi extends SQLiteOpenHelper implements tbc {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/common/database/SchemaMigrationSQLiteOpenHelper");
    private final Context b;
    private final int c;

    public tbi(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.b = context;
        this.c = i;
    }

    protected abstract tbh a(int i);

    public final File b() {
        return this.b.getDatabasePath(getDatabaseName());
    }

    protected void c(SQLiteDatabase sQLiteDatabase) {
        tbd.d(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (int i = 0; i < this.c; i++) {
            a(i).a(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        c(sQLiteDatabase);
        onUpgrade(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        while (i < i2) {
            try {
                a(i).a(sQLiteDatabase);
                i++;
            } catch (SQLException e) {
                ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/common/database/SchemaMigrationSQLiteOpenHelper", "onUpgrade", 62, "SchemaMigrationSQLiteOpenHelper.java")).x("Error upgrading from %d to %d", i - 1, i);
                throw e;
            }
        }
    }
}
