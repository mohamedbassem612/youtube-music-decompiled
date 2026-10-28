package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecg implements eao, eab {
    public static final String a = dzf.a("SystemJobScheduler");
    public static final long b;
    public static final long c;
    public final ecf d;
    public final WorkDatabase e;
    public final dzp f;
    public final Map g = new HashMap();
    private final Context h;
    private final JobScheduler i;
    private final dyl j;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        b = 3600000L;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        c = 7200000L;
    }

    public ecg(Context context, WorkDatabase workDatabase, dyl dylVar, JobScheduler jobScheduler, ecf ecfVar, dzp dzpVar) {
        this.h = context;
        this.i = jobScheduler;
        this.d = ecfVar;
        this.e = workDatabase;
        this.j = dylVar;
        this.f = dzpVar;
    }

    public static eek e(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new eek(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
            } catch (NullPointerException unused) {
            }
        }
        return null;
    }

    public static List f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listB = ece.b(jobScheduler);
        if (listB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listB) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static void g(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            dzf.b();
            Log.e(a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Override // defpackage.eab
    public final void a(eek eekVar, boolean z) {
        Map map = this.g;
        if (!z) {
            Runnable runnable = (Runnable) map.remove(eekVar);
            if (runnable != null) {
                this.f.a(runnable);
                return;
            }
            return;
        }
        if (map.containsKey(eekVar)) {
            return;
        }
        dhr dhrVar = new dhr((Object) this, (Object) eekVar, 7, (char[]) null);
        map.put(eekVar, dhrVar);
        dhrVar.run();
    }

    @Override // defpackage.eao
    public final void b(String str) {
        ArrayList arrayList;
        Context context = this.h;
        JobScheduler jobScheduler = this.i;
        List<JobInfo> listF = f(context, jobScheduler);
        if (listF == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : listF) {
                eek eekVarE = e(jobInfo);
                if (eekVarE != null && str.equals(eekVarE.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            dzf.b();
            g(jobScheduler, iIntValue);
        }
        this.e.z().d(str);
    }

    @Override // defpackage.eao
    public final void c(ees... eesVarArr) {
        int iIntValue;
        WorkDatabase workDatabase = this.e;
        dov dovVar = new dov(workDatabase);
        for (ees eesVar : eesVarArr) {
            workDatabase.m();
            try {
                eet eetVarC = workDatabase.C();
                String str = eesVar.c;
                ees eesVarC = eetVarC.c(str);
                if (eesVarC == null) {
                    dzf.b();
                    Log.w(a, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.p();
                } else if (eesVarC.d != dzr.a) {
                    dzf.b();
                    Log.w(a, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.p();
                } else {
                    eesVar.getClass();
                    eek eekVar = new eek(str, eesVar.t);
                    eeg eegVarA = workDatabase.z().a(eekVar);
                    if (eegVarA != null) {
                        iIntValue = eegVarA.c;
                    } else {
                        Object objE = ((dmq) dovVar.a).e(new ebs(dovVar, 2));
                        objE.getClass();
                        iIntValue = ((Number) objE).intValue();
                    }
                    if (eegVarA == null) {
                        workDatabase.z().c(new eeg(eekVar.a, eekVar.b, iIntValue));
                    }
                    h(eesVar, iIntValue);
                    workDatabase.p();
                }
                workDatabase.n();
            } catch (Throwable th) {
                this.e.n();
                throw th;
            }
        }
    }

    @Override // defpackage.eao
    public final boolean d() {
        return true;
    }

    public final void h(ees eesVar, int i) {
        i(eesVar, i, this.d.a(eesVar, i, Math.max(eesVar.a() - System.currentTimeMillis(), 0L)));
    }

    public final void i(ees eesVar, int i, JobInfo jobInfo) {
        String str;
        dzf.b();
        String str2 = eesVar.c;
        String str3 = eesVar.e;
        try {
            if (this.i.schedule(jobInfo) == 0) {
                dzf.b();
                Log.w(a, "Unable to schedule work ID " + str2);
                if (eesVar.r && eesVar.z == 1) {
                    eesVar.r = false;
                    String.format("Scheduling a non-expedited job (work ID %s)", str2);
                    dzf.b();
                    h(eesVar, i);
                }
            }
        } catch (IllegalStateException e) {
            Context context = this.h;
            WorkDatabase workDatabase = this.e;
            int i2 = ece.a;
            int size = workDatabase.C().h().size();
            String strAD = "<faulty JobScheduler failed to getPendingJobs>";
            if (Build.VERSION.SDK_INT >= 34) {
                JobScheduler jobSchedulerA = ece.a(context);
                List listB = ece.b(jobSchedulerA);
                if (listB != null) {
                    List listF = f(context, jobSchedulerA);
                    int size2 = listF != null ? listB.size() - listF.size() : 0;
                    String str4 = null;
                    if (size2 == 0) {
                        str = null;
                    } else {
                        str = size2 + " of which are not owned by WorkManager";
                    }
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    List listF2 = f(context, (JobScheduler) systemService);
                    int size3 = listF2 != null ? listF2.size() : 0;
                    if (size3 != 0) {
                        str4 = size3 + " from WorkManager in the default namespace";
                    }
                    String[] strArr = {listB.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str4};
                    ArrayList arrayList = new ArrayList();
                    atqq.ba(strArr, arrayList);
                    strAD = atqq.aD(arrayList, ",\n", null, null, null, 62);
                }
            } else {
                List listF3 = f(context, ece.a(context));
                if (listF3 != null) {
                    strAD = listF3.size() + " jobs from WorkManager";
                }
            }
            String str5 = "JobScheduler " + (Build.VERSION.SDK_INT >= 31 ? 150 : 100) + " job limit exceeded.\nIn JobScheduler there are " + strAD + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.";
            dzf.b();
            Log.e(a, str5);
            throw new IllegalStateException(str5, e);
        } catch (Throwable th) {
            dzf.b();
            String str6 = a;
            Objects.toString(eesVar);
            Log.e(str6, "Unable to schedule ".concat(String.valueOf(eesVar)), th);
        }
    }
}
