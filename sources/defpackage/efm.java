package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efm implements Runnable {
    private static final String a = dzf.a("ForceStopRunnable");
    private static final long b;
    private final Context c;
    private final ebm d;
    private int e = 0;
    private final dov f;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        b = 315360000000L;
    }

    public efm(Context context, ebm ebmVar) {
        this.c = context.getApplicationContext();
        this.d = ebmVar;
        this.f = ebmVar.j;
    }

    static Intent a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, a(context), Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + b;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x02b1 A[Catch: SQLiteException -> 0x0300, all -> 0x037e, TRY_ENTER, TryCatch #3 {SQLiteException -> 0x0300, blocks: (B:135:0x02fc, B:136:0x02ff, B:86:0x01f6, B:91:0x0201, B:93:0x0215, B:95:0x021f, B:97:0x023d, B:101:0x0248, B:104:0x025b, B:105:0x025e, B:107:0x026e, B:109:0x0274, B:111:0x0284, B:112:0x0288, B:114:0x028e, B:116:0x029e, B:128:0x02cb, B:118:0x02a6, B:123:0x02b1, B:120:0x02ab, B:127:0x02c1), top: B:179:0x01ae }] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            ebm ebmVar = this.d;
            dyl dylVar = ebmVar.c;
            if (TextUtils.isEmpty(dylVar.g)) {
                dzf.b();
            } else {
                boolean zA = efs.a(this.c, dylVar);
                dzf.b();
                if (!zA) {
                    ebmVar.k();
                    return;
                }
            }
            Context context = this.c;
            if (!((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked()) {
                dzf.b();
                Log.e(a, "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialize WorkManager from directBootAware components. See https://developer.android.com/training/articles/direct-boot");
                IllegalStateException illegalStateException = new IllegalStateException("WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialize WorkManager from directBootAware components. See https://developer.android.com/training/articles/direct-boot");
                axo axoVar = ebmVar.c.f;
                throw illegalStateException;
            }
            while (true) {
                try {
                    context.getClass();
                    File databasePath = context.getDatabasePath("androidx.work.workdb");
                    databasePath.getClass();
                    if (databasePath.exists()) {
                        dzf.b();
                        String str = eba.a;
                        File databasePath2 = context.getDatabasePath("androidx.work.workdb");
                        databasePath2.getClass();
                        File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
                        String[] strArr = eba.b;
                        int length = strArr.length;
                        int iU = atqq.u(3);
                        if (iU < 16) {
                            iU = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
                        int i = 0;
                        for (int i2 = 3; i < i2; i2 = 3) {
                            String str2 = strArr[i];
                            awml awmlVar = new awml(new File(String.valueOf(databasePath2.getPath()).concat(String.valueOf(str2))), new File(String.valueOf(file.getPath()).concat(String.valueOf(str2))));
                            linkedHashMap.put(awmlVar.a, awmlVar.b);
                            i++;
                        }
                        for (Map.Entry entry : atqq.B(linkedHashMap, new awml(databasePath2, file)).entrySet()) {
                            File file2 = (File) entry.getKey();
                            File file3 = (File) entry.getValue();
                            if (file2.exists()) {
                                if (file3.exists()) {
                                    dzf.b();
                                    Objects.toString(file3);
                                    Log.w(str, "Over-writing contents of ".concat(String.valueOf(file3)));
                                }
                                if (file2.renameTo(file3)) {
                                    Objects.toString(file2);
                                    Objects.toString(file3);
                                } else {
                                    Objects.toString(file2);
                                    Objects.toString(file3);
                                }
                                dzf.b();
                            }
                        }
                    }
                    dzf.b();
                    try {
                        WorkDatabase workDatabase = ebmVar.d;
                        String str3 = ecg.a;
                        JobScheduler jobSchedulerA = ece.a(context);
                        List<JobInfo> listF = ecg.f(context, jobSchedulerA);
                        List listB = workDatabase.z().b();
                        HashSet hashSet = new HashSet(listB);
                        HashSet hashSet2 = new HashSet(listF != null ? listF.size() : 0);
                        if (listF != null && !listF.isEmpty()) {
                            for (JobInfo jobInfo : listF) {
                                eek eekVarE = ecg.e(jobInfo);
                                if (eekVarE != null) {
                                    String str4 = eekVarE.a;
                                    if (hashSet.contains(str4)) {
                                        hashSet2.add(str4);
                                    }
                                }
                                ecg.g(jobSchedulerA, jobInfo.getId());
                            }
                        }
                        Iterator it = listB.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!hashSet2.contains((String) it.next())) {
                                    dzf.b();
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (z) {
                            workDatabase.m();
                            try {
                                eet eetVarC = workDatabase.C();
                                Iterator it2 = listB.iterator();
                                while (it2.hasNext()) {
                                    eetVarC.w((String) it2.next(), -1L);
                                }
                                workDatabase.p();
                                workDatabase.n();
                            } catch (Throwable th) {
                                workDatabase.n();
                                throw th;
                            }
                        }
                        try {
                            WorkDatabase workDatabase2 = ebmVar.d;
                            eet eetVarC2 = workDatabase2.C();
                            eeo eeoVarB = workDatabase2.B();
                            workDatabase2.m();
                            try {
                                List<ees> listG = eetVarC2.g();
                                boolean z2 = (listG == null || listG.isEmpty()) ? false : true;
                                if (z2) {
                                    for (ees eesVar : listG) {
                                        try {
                                            dzr dzrVar = dzr.a;
                                            String str5 = eesVar.c;
                                            eetVarC2.A(dzrVar, str5);
                                            eetVarC2.r(str5, -512);
                                            eetVarC2.w(str5, -1L);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            workDatabase2.n();
                                            throw th;
                                        }
                                    }
                                }
                                eeoVarB.b();
                                workDatabase2.p();
                                workDatabase2.n();
                                boolean z3 = z2 || z;
                                ebm ebmVar2 = this.d;
                                Long lA = ((WorkDatabase) ebmVar2.j.a).x().a("reschedule_needed");
                                if (lA == null || lA.longValue() != 1) {
                                    try {
                                        int i3 = Build.VERSION.SDK_INT >= 31 ? 570425344 : 536870912;
                                        Context context2 = this.c;
                                        PendingIntent broadcast = PendingIntent.getBroadcast(context2, -1, a(context2), i3);
                                        if (Build.VERSION.SDK_INT >= 30) {
                                            if (broadcast != null) {
                                                broadcast.cancel();
                                            }
                                            int i4 = 0;
                                            List historicalProcessExitReasons = ((ActivityManager) context2.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                                            if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                                                Long lA2 = ((WorkDatabase) this.f.a).x().a("last_force_stop_ms");
                                                long jLongValue = lA2 != null ? lA2.longValue() : 0L;
                                                while (true) {
                                                    if (i4 < historicalProcessExitReasons.size()) {
                                                        ApplicationExitInfo applicationExitInfoM = aaj$$ExternalSyntheticApiModelOutline0.m(historicalProcessExitReasons.get(i4));
                                                        if (applicationExitInfoM.getReason() != 10 || applicationExitInfoM.getTimestamp() < jLongValue) {
                                                            i4++;
                                                        } else {
                                                            dzf.b();
                                                            ebm ebmVar3 = this.d;
                                                            ebmVar3.l();
                                                            dov dovVar = this.f;
                                                            bnz bnzVar = ebmVar3.c.k;
                                                            ((WorkDatabase) dovVar.a).x().b(new edz("last_force_stop_ms", Long.valueOf(System.currentTimeMillis())));
                                                        }
                                                    }
                                                }
                                            }
                                            if (z3) {
                                                dzf.b();
                                                eaq.a(ebmVar2.c, ebmVar2.d, ebmVar2.e);
                                            }
                                        } else if (broadcast == null) {
                                            b(context2);
                                            dzf.b();
                                            ebm ebmVar4 = this.d;
                                            ebmVar4.l();
                                            dov dovVar2 = this.f;
                                            bnz bnzVar2 = ebmVar4.c.k;
                                            ((WorkDatabase) dovVar2.a).x().b(new edz("last_force_stop_ms", Long.valueOf(System.currentTimeMillis())));
                                        } else if (z3) {
                                            dzf.b();
                                            eaq.a(ebmVar2.c, ebmVar2.d, ebmVar2.e);
                                        }
                                    } catch (IllegalArgumentException e) {
                                        e = e;
                                        dzf.b();
                                        Log.w(a, "Ignoring exception", e);
                                    } catch (SecurityException e2) {
                                        e = e2;
                                        dzf.b();
                                        Log.w(a, "Ignoring exception", e);
                                    }
                                } else {
                                    dzf.b();
                                    ebmVar2.l();
                                    ((WorkDatabase) ebmVar2.j.a).x().b(new edz("reschedule_needed", 0L));
                                }
                                this.d.k();
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            int i5 = this.e + 1;
                            this.e = i5;
                            if (i5 >= 3) {
                                if (!(e instanceof SQLiteAccessPermException) && !(e instanceof SQLiteCantOpenDatabaseException) && !(e instanceof SQLiteConstraintException) && !(e instanceof SQLiteDatabaseCorruptException) && !(e instanceof SQLiteDatabaseLockedException) && !(e instanceof SQLiteDiskIOException) && !(e instanceof SQLiteFullException) && !(e instanceof SQLiteTableLockedException)) {
                                    throw e;
                                }
                                dzf.b();
                                Log.e(a, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                                IllegalStateException illegalStateException2 = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                                axo axoVar2 = this.d.c.f;
                                throw illegalStateException2;
                            }
                            dzf.b();
                            try {
                                Thread.sleep(((long) this.e) * 300);
                            } catch (InterruptedException unused) {
                            }
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                    }
                } catch (SQLiteException e5) {
                    dzf.b();
                    Log.e(a, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException3 = new IllegalStateException("Unexpected SQLite exception during migrations", e5);
                    axo axoVar3 = this.d.c.f;
                    throw illegalStateException3;
                }
            }
        } catch (Throwable th4) {
            this.d.k();
            throw th4;
        }
    }
}
