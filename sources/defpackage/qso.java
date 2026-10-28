package defpackage;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteTableLockedException;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.Closeable;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class qso implements ComponentCallbacks2 {
    public static final agrf a = agrf.h("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper");
    public final Context b;
    public final ScheduledExecutorService c;
    public final agev d;
    public final List e;
    public final List f;
    public final Executor i;
    public ListenableFuture j;
    public boolean m;
    public final aero n;
    public final omj p;
    private final ahcx q;
    private ScheduledFuture t;
    public final Set g = new HashSet();
    public final Object h = new Object();
    public final hwe o = new hwe(this);
    private final aheh r = new iin(this, 5);
    public int k = 0;
    private boolean s = false;
    public boolean l = false;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    @Deprecated
    public qso(Context context, ScheduledExecutorService scheduledExecutorService, omj omjVar, ahcx ahcxVar, syn synVar) {
        this.q = ahcxVar;
        this.c = scheduledExecutorService;
        this.p = omjVar;
        this.i = new ahfg(scheduledExecutorService);
        this.b = context;
        this.d = (agev) synVar.c;
        this.e = synVar.a;
        this.f = synVar.b;
        this.n = (aero) synVar.d;
    }

    public static ahdm a(ListenableFuture listenableFuture, Closeable... closeableArr) {
        listenableFuture.getClass();
        hwe hweVar = new hwe(closeableArr, null);
        aheu aheuVar = ahdm.a;
        ahde ahdeVar = new ahde();
        ahfo ahfoVar = new ahfo(new ahcz(hweVar, ahdeVar, 0));
        ahfoVar.run();
        return new ahdm(ahfoVar, ahdeVar).d(new qsd(listenableFuture, 3), MoreExecutors.directExecutor());
    }

    public static void e(File file) throws qsl {
        File file2 = new File(String.valueOf(file.getPath()).concat("-wal"));
        File file3 = new File(String.valueOf(file.getPath()).concat("-journal"));
        File file4 = new File(String.valueOf(file.getPath()).concat("-shm"));
        try {
            if ((!file2.exists() || file2.delete()) && ((!file3.exists() || file3.delete()) && ((!file4.exists() || file4.delete()) && file.delete()))) {
            } else {
                throw new qsl(String.format("Unable to clean up database %s", file.getAbsolutePath()));
            }
        } catch (Throwable th) {
            throw new qsl(String.format("Unable to clean up database %s", file.getAbsolutePath()), th);
        }
    }

    public static SQLiteDatabase f(Context context, File file, aero aeroVar, agev agevVar, List list, List list2) {
        SQLiteDatabase sQLiteDatabaseJ = j(context, aeroVar, file);
        try {
            if (agevVar.g()) {
                agevVar.c();
                if (sQLiteDatabaseJ.getVersion() <= 0) {
                    afuu afuuVarD = afwt.d(34, "Dropping tables.", afux.a, true);
                    try {
                        sQLiteDatabaseJ.close();
                        e(file);
                        sQLiteDatabaseJ = j(context, aeroVar, file);
                        agevVar.c();
                        sQLiteDatabaseJ.setVersion(1);
                        afuuVarD.close();
                    } catch (Throwable th) {
                        try {
                            afuuVarD.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            try {
                if (k(sQLiteDatabaseJ, aeroVar, agevVar, list, list2)) {
                    sQLiteDatabaseJ.close();
                    sQLiteDatabaseJ = j(context, aeroVar, file);
                    try {
                        afuu afuuVarD2 = afwt.d(33, "Configuring reopened database.", afux.a, true);
                        try {
                            ahno.P(!k(sQLiteDatabaseJ, aeroVar, agevVar, list, list2), "Reopen request for a database that was already reopened after upgrade. Upgrade did not take despite error-free completion of the upgrade transaction.");
                            afuuVarD2.close();
                        } catch (Throwable th3) {
                            try {
                                afuuVarD2.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        sQLiteDatabaseJ.close();
                        throw new qsk("Failed to open database.", e);
                    } catch (IllegalStateException e2) {
                        e = e2;
                        sQLiteDatabaseJ.close();
                        throw new qsk("Failed to open database.", e);
                    } catch (Throwable th5) {
                        sQLiteDatabaseJ.close();
                        throw th5;
                    }
                }
                return sQLiteDatabaseJ;
            } catch (SQLiteException e3) {
                sQLiteDatabaseJ.close();
                throw new qsk("Failed to open database.", e3);
            } catch (Throwable th6) {
                sQLiteDatabaseJ.close();
                throw th6;
            }
        } catch (qsl e4) {
            throw new qsk("Failed to drop tables to apply new schema.", e4);
        }
    }

    public static boolean g(Context context, aero aeroVar) {
        int i = aeroVar.a;
        return !((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    private static int h(SQLiteDatabase sQLiteDatabase, agev agevVar) {
        if (!agevVar.g()) {
            return sQLiteDatabase.getVersion();
        }
        int version = sQLiteDatabase.getVersion();
        agevVar.c();
        return version - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean i(SQLiteDatabase sQLiteDatabase, agev agevVar, List list, List list2) {
        int i = ((agpi) list).d;
        int iH = h(sQLiteDatabase, agevVar);
        ahno.S(iH <= i, "Can't downgrade from version %s to version %s", iH, i);
        omr omrVar = new omr(sQLiteDatabase);
        sQLiteDatabase.beginTransaction();
        try {
            if (iH != i) {
                try {
                    try {
                        afuu afuuVarD = afwt.d(36, "Applying upgrade steps", afux.a, true);
                        try {
                            Iterator it = ((agke) list).subList(iH, i).iterator();
                            while (it.hasNext()) {
                                ((qsu) it.next()).a(omrVar);
                            }
                            afuuVarD.close();
                            if (agevVar.g()) {
                                agevVar.c();
                                sQLiteDatabase.setVersion(i + 1);
                            } else {
                                sQLiteDatabase.setVersion(i);
                            }
                        } catch (Throwable th) {
                            try {
                                afuuVarD.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (SQLiteDatabaseLockedException e) {
                        e = e;
                        throw new qsn("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                    } catch (InterruptedException e2) {
                        throw new qsn("Thread interrupted during database upgrade. Upgrade transaction will be unsuccessful.", e2);
                    }
                } catch (SQLiteDiskIOException e3) {
                    e = e3;
                    throw new qsn("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (SQLiteFullException e4) {
                    e = e4;
                    throw new qsn("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (SQLiteOutOfMemoryException e5) {
                    e = e5;
                    throw new qsn("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (SQLiteTableLockedException e6) {
                    e = e6;
                    throw new qsn("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (Throwable th3) {
                    throw new qsm(th3);
                }
            }
            agqs agqsVarListIterator = ((agke) list2).listIterator(0);
            if (agqsVarListIterator.hasNext()) {
                throw null;
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            return iH != h(sQLiteDatabase, agevVar);
        } catch (Throwable th4) {
            sQLiteDatabase.endTransaction();
            throw th4;
        }
    }

    private static SQLiteDatabase j(Context context, aero aeroVar, File file) {
        boolean zG = g(context, aeroVar);
        int i = zG ? 805306368 : 268435456;
        file.getParentFile().mkdirs();
        try {
            SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(file.getPath(), null, i, null);
            if (zG) {
                sQLiteDatabaseOpenDatabase.enableWriteAheadLogging();
            }
            return sQLiteDatabaseOpenDatabase;
        } catch (Throwable th) {
            throw new qsk("Failed to open database.", th);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    private static boolean k(SQLiteDatabase sQLiteDatabase, aero aeroVar, agev agevVar, List list, List list2) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        Iterator it = aeroVar.b.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("PRAGMA ".concat(String.valueOf((String) it.next())));
        }
        return i(sQLiteDatabase, agevVar, list, list2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006e A[Catch: all -> 0x00a9, TryCatch #0 {, blocks: (B:5:0x0008, B:10:0x0017, B:11:0x0026, B:15:0x0067, B:14:0x0063, B:16:0x006a, B:18:0x006e, B:19:0x0071), top: B:35:0x0008, outer: #1, inners: #2 }] */
    public final ahdm b() {
        ListenableFuture listenableFuture;
        ScheduledFuture scheduledFuture;
        ListenableFuture listenableFutureM;
        afty.r(false);
        afuu afuuVarD = null;
        try {
            synchronized (this.h) {
                int i = this.k + 1;
                this.k = i;
                ListenableFuture listenableFuture2 = this.j;
                listenableFuture = listenableFuture2;
                if (listenableFuture2 != null) {
                    scheduledFuture = this.t;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                    }
                } else {
                    ahno.P(i == 1, "DB was null with nonzero refcount");
                    afuuVarD = afwt.d(35, "Opening database", afux.a, true);
                    try {
                        ahcx ahcxVar = this.q;
                        Executor executor = this.i;
                        ahfo ahfoVar = new ahfo(ahcxVar);
                        executor.execute(ahfoVar);
                        aheh ahehVar = this.r;
                        ScheduledExecutorService scheduledExecutorService = this.c;
                        ahehVar.getClass();
                        ahfoVar.addListener(new ahei(ahfoVar, ahehVar), scheduledExecutorService);
                        olh olhVar = new olh(this, 9);
                        long j = afwl.a;
                        afwi afwiVar = new afwi(afty.c(false), olhVar);
                        int i2 = ahcs.c;
                        ahcr ahcrVar = new ahcr(ahfoVar, afwiVar);
                        ahfoVar.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
                        listenableFutureM = ahcrVar;
                    } catch (Exception e) {
                        listenableFutureM = ahng.m(e);
                    }
                    ListenableFuture listenableFuture3 = listenableFutureM;
                    this.j = listenableFuture3;
                    listenableFuture = listenableFuture3;
                    scheduledFuture = this.t;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                    }
                }
                throw th;
            }
            ListenableFuture listenableFutureO = ahng.o(listenableFuture);
            if (afuuVarD != null) {
                afuuVarD.a(listenableFutureO);
            }
            ahdm ahdmVarA = a(listenableFutureO, new qsj(this, 0));
            qsd qsdVar = new qsd(this, 2);
            long j2 = afwl.a;
            ahdm ahdmVarD = ahdmVarA.d(new afwf(afty.c(false), qsdVar), MoreExecutors.directExecutor());
            if (afuuVarD != null) {
                afuuVarD.close();
            }
            return ahdmVarD;
        } catch (Throwable th) {
            if (afuuVarD != null) {
                afuuVarD.close();
            }
            throw th;
        }
    }

    public final void c() {
        if (this.k != 0 || this.j == null) {
            return;
        }
        if (this.s) {
            d();
            return;
        }
        this.t = this.c.schedule(new mbo(this, 16), 60L, TimeUnit.SECONDS);
        if (this.m) {
            return;
        }
        ListenableFuture listenableFuture = this.j;
        iin iinVar = new iin(this, 6);
        listenableFuture.addListener(new ahei(listenableFuture, iinVar), this.i);
    }

    public final void d() {
        this.i.execute(new qca(this, 15));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        synchronized (this.h) {
            this.s = i >= 40;
            c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
