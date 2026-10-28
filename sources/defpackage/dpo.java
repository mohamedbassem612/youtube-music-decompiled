package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpo extends SQLiteOpenHelper {
    private final Context a;
    private final dpe b;
    private final boolean c;
    private boolean d;
    private final dqb e;
    private boolean f;
    private final heg g;

    public dpo(Context context, String str, final heg hegVar, dpe dpeVar, boolean z) {
        String string;
        super(context, str, null, dpeVar.a, new DatabaseErrorHandler() { // from class: dpm
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.getClass();
                dpl dplVarJ = azv.j(hegVar, sQLiteDatabase);
                Log.e("SupportSQLite", a.bV(dplVarJ, "Corruption reported by sqlite on database: ", ".path"));
                if (!dplVarJ.h()) {
                    String strA = dplVarJ.a();
                    if (strA != null) {
                        dpe.a(strA);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = dplVarJ.e.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                dpe.a((String) obj);
                            }
                        } else {
                            String strA2 = dplVarJ.a();
                            if (strA2 != null) {
                                dpe.a(strA2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    dplVarJ.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        this.a = context;
        this.g = hegVar;
        this.b = dpeVar;
        this.c = z;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.e = new dqb(string, context.getCacheDir());
    }

    private final SQLiteDatabase c() {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        writableDatabase.getClass();
        return writableDatabase;
    }

    public final dpl a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        return azv.j(this.g, sQLiteDatabase);
    }

    public final dpd b() {
        SQLiteDatabase sQLiteDatabaseC;
        dpd dpdVarA;
        File parentFile;
        try {
            this.e.a((this.f || getDatabaseName() == null) ? false : true);
            this.d = false;
            String databaseName = getDatabaseName();
            boolean z = this.f;
            if (databaseName != null && !z && (parentFile = this.a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Objects.toString(parentFile);
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: ".concat(parentFile.toString()));
                }
            }
            try {
                sQLiteDatabaseC = c();
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    sQLiteDatabaseC = c();
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof dpn) {
                        dpn dpnVar = (dpn) th;
                        Throwable th2 = dpnVar.a;
                        int i = dpnVar.b;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) {
                            throw th2;
                        }
                        if (i2 != 4) {
                            throw new awmj();
                        }
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                        th = th2;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.c) {
                        throw th;
                    }
                    this.a.deleteDatabase(databaseName);
                    try {
                        sQLiteDatabaseC = c();
                    } catch (dpn e) {
                        throw e.a;
                    }
                }
            }
            if (this.d) {
                close();
                dpdVarA = b();
            } else {
                dpdVarA = a(sQLiteDatabaseC);
            }
            this.e.b();
            return dpdVarA;
        } catch (Throwable th3) {
            this.e.b();
            throw th3;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        try {
            dqb dqbVar = this.e;
            Map map = dqb.a;
            boolean z = dqbVar.b;
            dqbVar.a(false);
            super.close();
            this.g.a = null;
            this.f = false;
        } finally {
            this.e.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.d && this.b.a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            a(sQLiteDatabase);
        } catch (Throwable th) {
            throw new dpn(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            dpe dpeVar = this.b;
            dpt dptVar = new dpt(a(sQLiteDatabase));
            dpb dpbVarA = dptVar.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = false;
                if (dpbVarA.l() && dpbVarA.b(0) == 0) {
                    z = true;
                }
                dlv dlvVar = dpeVar.b;
                dpbVarA.close();
                dmt dmtVar = dlvVar.b;
                dmtVar.a(dptVar);
                if (!z) {
                    ahek ahekVarG = dmtVar.g(dptVar);
                    if (!ahekVarG.a) {
                        throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(ahekVarG.b)));
                    }
                }
                dlvVar.a(dptVar);
                dmtVar.e();
                for (azt aztVar : dlvVar.c) {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        dpbVarA.close();
                    } catch (Throwable th3) {
                        avkz.d(th, th3);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            throw new dpn(2, th4);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.d = true;
        try {
            this.b.b(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new dpn(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        Object awmmVar;
        sQLiteDatabase.getClass();
        if (!this.d) {
            try {
                dpe dpeVar = this.b;
                dpl dplVarA = a(sQLiteDatabase);
                dlv dlvVar = dpeVar.b;
                dpt dptVar = new dpt(dplVarA);
                dpb dpbVarA = dptVar.a("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
                try {
                    boolean z = dpbVarA.l() && dpbVarA.b(0) != 0;
                    dpbVarA.close();
                    if (z) {
                        dpb dpbVarA2 = dptVar.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            String strD = dpbVarA2.l() ? dpbVarA2.d(0) : null;
                            dpbVarA2.close();
                            dmt dmtVar = dlvVar.b;
                            String str = dmtVar.b;
                            if (!awrc.c(str, strD) && !awrc.c(dmtVar.c, strD)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + str + ", found: " + strD);
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    dpbVarA2.close();
                                } catch (Throwable th3) {
                                    avkz.d(th, th3);
                                }
                                throw th2;
                            }
                        }
                    } else {
                        azu.i(dptVar, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            dmt dmtVar2 = dlvVar.b;
                            ahek ahekVarG = dmtVar2.g(dptVar);
                            if (!ahekVarG.a) {
                                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) ahekVarG.b));
                            }
                            dmtVar2.f();
                            dlvVar.a(dptVar);
                            awmmVar = awmy.a;
                            if (!(awmmVar instanceof awmm)) {
                                azu.i(dptVar, "END TRANSACTION");
                            }
                            Throwable thA = awmn.a(awmmVar);
                            if (thA != null) {
                                azu.i(dptVar, "ROLLBACK TRANSACTION");
                                throw thA;
                            }
                        } catch (Throwable th4) {
                            awmmVar = new awmm(th4);
                        }
                    }
                    dlvVar.b.c(dptVar);
                    Iterator it = dlvVar.c.iterator();
                    while (it.hasNext()) {
                        ((azt) it.next()).f(dptVar.a);
                    }
                    dpeVar.b.e = dplVarA;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        try {
                            dpbVarA.close();
                        } catch (Throwable th7) {
                            avkz.d(th5, th7);
                        }
                        throw th6;
                    }
                }
            } catch (Throwable th8) {
                throw new dpn(5, th8);
            }
        }
        this.f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.d = true;
        try {
            this.b.b(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new dpn(3, th);
        }
    }
}
