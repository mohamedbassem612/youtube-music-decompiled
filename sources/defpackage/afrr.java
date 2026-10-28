package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afrr {
    public static final agrf a = agrf.h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore");
    public final ahex c;
    public final mbc d;
    private final Context g;
    private final omr h;
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public long f = -1;

    public afrr(Context context, ahex ahexVar, omr omrVar, mbc mbcVar) {
        this.h = omrVar;
        this.d = mbcVar;
        this.g = context;
        this.c = ahexVar;
    }

    static File e(Context context) {
        return new File(context.getFilesDir(), "103795117_".concat(String.valueOf(qnl.l(context).replaceAll("[^A-Za-z0-9\\-_:]", "_"))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067 A[Catch: RuntimeException -> 0x007d, all -> 0x00bf, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x007d, blocks: (B:8:0x001f, B:10:0x0034, B:13:0x0042, B:15:0x004c, B:16:0x0061, B:18:0x0067), top: B:47:0x001f, outer: #4 }] */
    public final afsu a() {
        Context context = this.g;
        File fileE = e(context);
        this.b.readLock().lock();
        try {
            if (!fileE.exists() && this.h.m()) {
                try {
                    File file = new File(context.getFilesDir().getPath(), "103795117");
                    if (file.exists()) {
                        if (e(context).exists()) {
                            if (!file.delete()) {
                                ((agrc) ((agrc) a.b()).k("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryMigrateToPerProcessDatabase", 205, "SyncManagerDataStore.java")).t("Unable to delete old Sync database file.");
                            }
                        } else if (!file.renameTo(e(context))) {
                            ((agrc) ((agrc) a.c()).k("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryMigrateToPerProcessDatabase", 199, "SyncManagerDataStore.java")).t("Failed to rename old sync database file.");
                            if (!file.delete()) {
                                ((agrc) ((agrc) a.b()).k("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryMigrateToPerProcessDatabase", 205, "SyncManagerDataStore.java")).t("Unable to delete old Sync database file.");
                            }
                        }
                    }
                } catch (RuntimeException e) {
                    ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryMigrateToPerProcessDatabase", (char) 210, "SyncManagerDataStore.java")).t("Error while migrating Sync datastore file.");
                }
            }
            afsu afsuVar = null;
            FileInputStream fileInputStream = null;
            if (fileE.exists()) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(fileE);
                    try {
                        afsuVar = (afsu) afsu.parseDelimitedFrom(afsu.a, fileInputStream2);
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        yno.I(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            this.b.readLock().unlock();
            return afsuVar == null ? afsu.a : afsuVar;
        } catch (Throwable th3) {
            this.b.readLock().unlock();
            throw th3;
        }
    }

    public final ListenableFuture b() {
        ListenableFuture listenableFutureC = c();
        afro afroVar = new afro(this, 0);
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), afroVar);
        int i = ahcs.c;
        ahex ahexVar = this.c;
        ahcr ahcrVar = new ahcr(listenableFutureC, afwiVar);
        listenableFutureC.addListener(ahcrVar, MoreExecutors.c(ahexVar, ahcrVar));
        return ahcrVar;
    }

    final ListenableFuture c() {
        if (this.e.get()) {
            return new aher(Long.valueOf(this.f));
        }
        ahex ahexVar = this.c;
        rru rruVar = new rru(this, 16);
        long j = afwl.a;
        return ahexVar.submit(new ahcz(afty.c(false), rruVar, 1));
    }

    final ListenableFuture d(final afsa afsaVar, final long j, final boolean z) {
        return this.c.submit(new Callable() { // from class: afrp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aihf aihfVarCreateBuilder;
                Iterator it;
                afst afstVar;
                afsa afsaVar2;
                afrr afrrVar = this.a;
                afrrVar.b.writeLock().lock();
                long j2 = j;
                try {
                    afsu afsuVarA = afsu.a;
                    try {
                        afsuVarA = afrrVar.a();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            afsaVar2 = afsaVar;
                            if (!zHasNext) {
                                break;
                            }
                            afst afstVar2 = (afst) it.next();
                            afsw afswVar = afstVar2.c;
                            if (afswVar == null) {
                                afswVar = afsw.a;
                            }
                            if (afsaVar2.equals(new afsa(afswVar))) {
                                afstVar = afstVar2;
                            } else {
                                aihfVarCreateBuilder.ak(afstVar2);
                            }
                        }
                    } catch (IOException e) {
                        if (!afrrVar.g(e)) {
                            ((agrc) ((agrc) ((agrc) afrr.a.b()).j(e)).k("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateLastSyncTime", 324, "SyncManagerDataStore.java")).t("Unable to read or clear store, will not update sync time. Sync may run too frequently.");
                        }
                    }
                    aihfVarCreateBuilder = afsu.a.createBuilder();
                    aihfVarCreateBuilder.mergeFrom((aihn) afsuVarA);
                    aihfVarCreateBuilder.copyOnWrite();
                    ((afsu) aihfVarCreateBuilder.instance).d = afsu.emptyProtobufList();
                    it = afsuVarA.d.iterator();
                    afstVar = null;
                    if (afstVar != null) {
                        if (afsuVarA.c < 0) {
                            long epochMilli = afrrVar.f;
                            if (epochMilli < 0) {
                                epochMilli = afrrVar.d.f().toEpochMilli();
                                afrrVar.f = epochMilli;
                            }
                            aihfVarCreateBuilder.copyOnWrite();
                            afsu afsuVar = (afsu) aihfVarCreateBuilder.instance;
                            afsuVar.b |= 1;
                            afsuVar.c = epochMilli;
                        }
                        aihf aihfVarCreateBuilder2 = afst.a.createBuilder();
                        afsw afswVar2 = afsaVar2.a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        afst afstVar3 = (afst) aihfVarCreateBuilder2.instance;
                        afswVar2.getClass();
                        afstVar3.c = afswVar2;
                        afstVar3.b |= 1;
                        aihfVarCreateBuilder2.copyOnWrite();
                        afst afstVar4 = (afst) aihfVarCreateBuilder2.instance;
                        afstVar4.b |= 4;
                        afstVar4.e = j2;
                        if (z) {
                            aihfVarCreateBuilder2.copyOnWrite();
                            afst afstVar5 = (afst) aihfVarCreateBuilder2.instance;
                            afstVar5.b |= 2;
                            afstVar5.d = j2;
                            aihfVarCreateBuilder2.copyOnWrite();
                            afst afstVar6 = (afst) aihfVarCreateBuilder2.instance;
                            afstVar6.b |= 8;
                            afstVar6.f = 0;
                        } else {
                            long j3 = afstVar.d;
                            aihfVarCreateBuilder2.copyOnWrite();
                            afst afstVar7 = (afst) aihfVarCreateBuilder2.instance;
                            afstVar7.b |= 2;
                            afstVar7.d = j3;
                            int i = afstVar.f + 1;
                            aihfVarCreateBuilder2.copyOnWrite();
                            afst afstVar8 = (afst) aihfVarCreateBuilder2.instance;
                            afstVar8.b |= 8;
                            afstVar8.f = i;
                        }
                        aihfVarCreateBuilder.ak((afst) aihfVarCreateBuilder2.build());
                        try {
                            afrrVar.f((afsu) aihfVarCreateBuilder.build());
                        } catch (IOException e2) {
                            ((agrc) ((agrc) ((agrc) afrr.a.b()).j(e2)).k("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateLastSyncTime", 384, "SyncManagerDataStore.java")).t("Error writing sync data file after sync. Sync may run too frequently.");
                        }
                    }
                    afrrVar.b.writeLock().unlock();
                    return null;
                } catch (Throwable th) {
                    afrrVar.b.writeLock().unlock();
                    throw th;
                }
            }
        });
    }

    public final void f(afsu afsuVar) throws Throwable {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(e(this.g));
            try {
                afsuVar.writeDelimitedTo(fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable th) {
                th = th;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public final boolean g(Throwable th) {
        ((agrc) ((agrc) ((agrc) a.c()).j(th)).k("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", (char) 577, "SyncManagerDataStore.java")).t("Could not read sync datastore. There was probably a write error. Wiping store.");
        this.b.writeLock().lock();
        try {
            boolean z = false;
            this.e.set(false);
            long epochMilli = this.f;
            if (epochMilli <= 0) {
                epochMilli = this.d.f().toEpochMilli();
            }
            aihf aihfVarCreateBuilder = afsu.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            afsu afsuVar = (afsu) aihfVarCreateBuilder.instance;
            afsuVar.b |= 1;
            afsuVar.c = epochMilli;
            try {
                try {
                    f((afsu) aihfVarCreateBuilder.build());
                    this.e.set(true);
                    z = true;
                } catch (IOException e) {
                    ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", 597, "SyncManagerDataStore.java")).t("Could not write to datastore to clear store.");
                    this.e.set(false);
                }
                this.b.writeLock().unlock();
                return z;
            } catch (Throwable th2) {
                this.e.set(true);
                throw th2;
            }
        } catch (Throwable th3) {
            this.b.writeLock().unlock();
            throw th3;
        }
    }
}
