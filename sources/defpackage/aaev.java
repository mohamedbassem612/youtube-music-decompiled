package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaev {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/offline/database/OfflineDatabaseProvider");
    public hxh a;
    private final String c;
    private final aalv d;
    private aafs e;
    private final hzo f = new hzo(this);
    private final abxv g;

    public aaev(abxv abxvVar, String str, aalv aalvVar) {
        this.c = str;
        this.g = abxvVar;
        this.d = aalvVar;
    }

    private final void e(SQLiteException sQLiteException) {
        this.d.g(sQLiteException != null ? aauj.a(sQLiteException) : aoel.DB_EXCEPTION_TYPE_NO_EXCEPTION);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    public final synchronized SQLiteDatabase a() {
        SQLiteDatabase writableDatabase;
        aafs aafsVar = this.e;
        if (aafsVar == null) {
            abxv abxvVar = this.g;
            String str = this.c;
            hzo hzoVar = this.f;
            mbc mbcVar = (mbc) abxvVar.b.io();
            mbcVar.getClass();
            Context context = (Context) abxvVar.c.io();
            context.getClass();
            vxu vxuVar = (vxu) abxvVar.a.io();
            vxuVar.getClass();
            aalf aalfVar = (aalf) abxvVar.d.io();
            aalfVar.getClass();
            hzoVar.getClass();
            aafs aafsVar2 = new aafs(mbcVar, context, vxuVar, aalfVar, str, hzoVar);
            this.e = aafsVar2;
            aafsVar = aafsVar2;
        }
        try {
            writableDatabase = aafsVar.getWritableDatabase();
            e(null);
        } catch (SQLiteException e) {
            e(e);
            throw e;
        }
        return writableDatabase;
    }

    public final synchronized void b() {
        aafs aafsVar = this.e;
        if (aafsVar != null) {
            aafsVar.close();
            this.e = null;
        }
    }

    public final synchronized SQLiteDatabase c() {
        return a();
    }

    public final synchronized SQLiteDatabase d() {
        return a();
    }
}
