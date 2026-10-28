package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpl implements dpd {
    public static final String[] a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] b = new String[0];
    public static final awmi c = atqp.k(2, new aho(7));
    public static final awmi d = atqp.k(2, new aho(8));
    public final SQLiteDatabase e;

    public dpl(SQLiteDatabase sQLiteDatabase) {
        this.e = sQLiteDatabase;
    }

    @Override // defpackage.dpd
    public final String a() {
        return this.e.getPath();
    }

    @Override // defpackage.dpd
    public final void b() {
        this.e.beginTransaction();
    }

    @Override // defpackage.dpd
    public final void c() {
        this.e.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    @Override // defpackage.dpd
    public final void d() {
        this.e.endTransaction();
    }

    @Override // defpackage.dpd
    public final void e(String str) {
        this.e.execSQL(str);
    }

    @Override // defpackage.dpd
    public final void f() {
        this.e.setTransactionSuccessful();
    }

    @Override // defpackage.dpd
    public final boolean g() {
        return this.e.inTransaction();
    }

    @Override // defpackage.dpd
    public final boolean h() {
        return this.e.isOpen();
    }

    @Override // defpackage.dpd
    public final dps i(String str) {
        SQLiteStatement sQLiteStatementCompileStatement = this.e.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new dps(sQLiteStatementCompileStatement);
    }

    @Override // defpackage.dpd
    public final void j(Object[] objArr) {
        this.e.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }
}
