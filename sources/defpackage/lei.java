package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.RemoteException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lei implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ lei(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v78, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int iDelete;
        switch (this.$cid) {
            case 0:
                ((ler) this.a).ah("invalid_user_id");
                return;
            case 1:
                ((ler) this.a).ah("invalid_user_id");
                return;
            case 2:
                Object obj = this.a;
                lco lcoVar = ((lff) obj).b;
                if (lcoVar == null) {
                    ((ldz) obj).aT().c.a("Failed to send storage consent settings to service");
                    return;
                }
                try {
                    lcoVar.x(((lff) obj).s(false));
                    ((lff) obj).A();
                    return;
                } catch (RemoteException e) {
                    ((ldz) obj).aT().c.b("Failed to send storage consent settings to the service", e);
                    return;
                }
            case 3:
                Object obj2 = this.a;
                lco lcoVar2 = ((lff) obj2).b;
                if (lcoVar2 == null) {
                    ((ldz) obj2).aT().c.a("Failed to send Dma consent settings to service");
                    return;
                }
                try {
                    lcoVar2.v(((lff) obj2).s(false));
                    ((lff) obj2).A();
                    return;
                } catch (RemoteException e2) {
                    ((ldz) obj2).aT().c.b("Failed to send Dma consent settings to the service", e2);
                    return;
                }
            case 4:
                lff lffVar = ((lfe) this.a).c;
                lffVar.x(new ComponentName(lffVar.aS(), "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 5:
                ((lff) this.a).t();
                return;
            case 6:
                lff lffVar2 = ((lfe) ((lfa) this.a).b).c;
                lffVar2.aU().j(new lei(lffVar2, 5));
                return;
            case 7:
                ((lfv) this.a).Z();
                return;
            case 8:
                lfv lfvVar = (lfv) this.a;
                lfvVar.A();
                lfvVar.v = new elq(lfvVar);
                lgp lgpVar = new lgp(lfvVar);
                lgpVar.x();
                lfvVar.b = lgpVar;
                lbt lbtVarI = lfvVar.i();
                ldo ldoVar = lfvVar.a;
                kro.l(ldoVar);
                lbtVarI.b = ldoVar;
                lfh lfhVar = new lfh(lfvVar);
                lfhVar.x();
                lfvVar.g = lfhVar;
                lbo lboVar = new lbo(lfvVar);
                lboVar.x();
                lfvVar.e = lboVar;
                lew lewVar = new lew(lfvVar);
                lewVar.x();
                lfvVar.f = lewVar;
                lhq lhqVar = new lhq(lfvVar);
                lhqVar.x();
                lfvVar.d = lhqVar;
                lfvVar.c = new ldf(lfvVar);
                if (lfvVar.n != lfvVar.o) {
                    lfvVar.aT().c.c("Not all upload components initialized", Integer.valueOf(lfvVar.n), Integer.valueOf(lfvVar.o));
                }
                lfvVar.k.set(true);
                lfvVar.aT().k.a("UploadController is now fully initialized");
                lfvVar.A();
                int iC = lfvVar.i().C(null, lcl.bc);
                if (iC > 0) {
                    ldo ldoVarO = lfvVar.o();
                    ldoVarO.o();
                    agm agmVar = ldoVarO.h;
                    synchronized (agmVar.b) {
                        agmVar.a = iC;
                    }
                    agmVar.g(iC);
                }
                lfvVar.v().V();
                lgp lgpVarV = lfvVar.v();
                lgpVarV.o();
                lgpVarV.w();
                if (lgpVarV.ae()) {
                    adam adamVar = lcl.ax;
                    if (((Long) adamVar.b(null)).longValue() != 0 && (iDelete = lgpVarV.e().delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), adamVar.b(null).toString()})) > 0) {
                        lgpVarV.aT().k.b("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
                if (lfvVar.g.d.a() == 0) {
                    ldi ldiVar = lfvVar.g.d;
                    lfvVar.aV();
                    ldiVar.b(System.currentTimeMillis());
                }
                lfvVar.V();
                return;
            case 9:
                Object obj3 = this.a;
                try {
                    SQLiteDatabase sQLiteDatabaseE = ((lgp) obj3).e();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("elapsed_time", (Long) 0L);
                    sQLiteDatabaseE.update("raw_events", contentValues, null, null);
                    return;
                } catch (SQLiteException e3) {
                    ((lfo) obj3).aT().c.b("Failed to remove elapsed times from raw events table", e3);
                    return;
                }
            case 10:
                ((lgt) this.a).a();
                return;
            case 11:
                lhb lhbVar = (lhb) this.a;
                lhc lhcVar = lhbVar.c;
                lhcVar.o();
                lhcVar.aT().j.a("Application going to the background");
                lhcVar.m().u(true);
                if (!lhcVar.G().p()) {
                    lhcVar.m().w(false, false, lhbVar.b);
                    lhcVar.m().b.d();
                }
                lhcVar.aT().i.b("Application backgrounded at: timestamp_millis", Long.valueOf(lhbVar.a));
                ler lerVarI = lhcVar.i();
                lerVarI.o();
                lerVarI.a();
                lff lffVarJ = lerVarI.j();
                lffVarJ.o();
                lffVarJ.a();
                if (!lffVarJ.T() || lffVarJ.L().k() >= 242600) {
                    lff lffVarJ2 = lerVarI.j();
                    lffVarJ2.o();
                    lffVarJ2.a();
                    lffVarJ2.B(new lfa(lffVarJ2, lffVarJ2.s(true), 1));
                }
                liv livVarU = lhcVar.n().u();
                liv livVar = liv.CLIENT_UPLOAD_ELIGIBLE;
                if (livVarU == livVar) {
                    long jE = lhcVar.L().ak(lhcVar.aS().getPackageName(), lhcVar.G().a) ? 10000L : lhcVar.G().E(lhcVar.aS().getPackageName(), lcl.H);
                    lhm lhmVarN = lhcVar.n();
                    lhmVarN.a();
                    lhmVarN.o();
                    liv livVarU2 = lhmVarN.u();
                    if (livVarU2 != livVar) {
                        lhmVarN.aT().k.b("[sgtm] Not eligible for Scion upload", livVarU2.name());
                        return;
                    }
                    JobScheduler jobScheduler = lhmVarN.a;
                    if (jobScheduler != null && jobScheduler.getPendingJob(lhmVarN.s() + 1) != null) {
                        lhmVarN.aT().k.a("[sgtm] There's a pending background upload job, override it.");
                    }
                    lhmVarN.aT().k.c("[sgtm] Scheduling background upload: delay millis, jobId", Long.valueOf(jE), Integer.valueOf(lhmVarN.s() + 1));
                    PersistableBundle persistableBundle = new PersistableBundle();
                    persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
                    JobInfo jobInfoBuild = new JobInfo.Builder(lhmVarN.s() + 1, new ComponentName(lhmVarN.aS(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(jE).setExtras(persistableBundle).build();
                    JobScheduler jobScheduler2 = lhmVarN.a;
                    kro.l(jobScheduler2);
                    lhmVarN.aT().k.b("[sgtm] Background upload job scheduled with result", jobScheduler2.schedule(jobInfoBuild) == 1 ? "SUCCESS" : "FAILURE");
                    return;
                }
                return;
            case 12:
                lhh lhhVar = (lhh) this.a;
                lhhVar.c = lhhVar.h;
                return;
            case 13:
                ((lhl) this.a).b.aT().k.a("[sgtm] Finished client uploading job from DelayedRunnable.");
                return;
            case 14:
                Object obj4 = this.a;
                synchronized (((lom) obj4).a) {
                    if (((lom) obj4).c()) {
                        lqd lqdVar = lom.h;
                        lqd.a("%s ** IS FORCE-RELEASED ON TIMEOUT **", ((lom) obj4).d);
                        ((lom) obj4).b();
                        if (((lom) obj4).c()) {
                            ((lom) obj4).b = 1;
                            ((lom) obj4).e();
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 15:
                Object obj5 = this.a;
                synchronized (((lor) obj5).a) {
                    los losVar = ((lor) obj5).b;
                    if (losVar != null) {
                        losVar.c();
                    }
                    break;
                }
                return;
            case 16:
                ((kjc) this.a).w(new TimeoutException());
                return;
            case 17:
                ThreadLocal threadLocal = mci.a;
                throw ((Throwable) this.a);
            case 18:
                throw ((Throwable) this.a);
            case 19:
                throw ((Throwable) this.a);
            default:
                Process.myTid();
                this.a.run();
                return;
        }
    }

    public lei(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
