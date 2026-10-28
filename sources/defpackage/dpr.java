package defpackage;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dpr implements dph {
    private final SQLiteProgram a;

    public dpr(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // defpackage.dph
    public final void a(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    @Override // defpackage.dph
    public final void b(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // defpackage.dph
    public final void c(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.dph
    public final void d(int i) {
        this.a.bindNull(i);
    }

    @Override // defpackage.dph
    public final void e(int i, String str) {
        this.a.bindString(i, str);
    }
}
