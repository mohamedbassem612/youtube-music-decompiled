package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebm extends dzt {
    public static final Object a;
    private static ebm m;
    private static ebm n;
    public Context b;
    public dyl c;
    public WorkDatabase d;
    public List e;
    public eam f;
    public boolean g = false;
    public BroadcastReceiver.PendingResult h;
    public volatile egp i;
    public dov j;
    public axfd k;
    public final axfd l;
    private final awut o;

    static {
        dzf.a("WorkManagerImpl");
        m = null;
        n = null;
        a = new Object();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public ebm(Context context, final dyl dylVar, axfd axfdVar, WorkDatabase workDatabase, final List list, eam eamVar, axfd axfdVar2) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        dzf dzfVar = new dzf();
        synchronized (dzf.a) {
            if (dzf.b == null) {
                dzf.b = dzfVar;
            }
        }
        this.b = applicationContext;
        this.k = axfdVar;
        this.d = workDatabase;
        this.f = eamVar;
        this.l = axfdVar2;
        this.c = dylVar;
        this.e = list;
        this.o = axfdVar.c;
        final WorkDatabase workDatabase2 = this.d;
        this.j = new dov(workDatabase2, (byte[]) null);
        eam eamVar2 = this.f;
        final ?? r7 = axfdVar.a;
        int i = eaq.a;
        eamVar2.c(new eaa() { // from class: eap
            @Override // defpackage.eaa
            public final void a(eek eekVar, boolean z) {
                int i2 = eaq.a;
                r7.execute(new aew(workDatabase2, eekVar, list, dylVar, 9));
            }
        });
        ListIterator listIterator = ((awoa) list).listIterator(0);
        while (listIterator.hasNext()) {
            eao eaoVar = (eao) listIterator.next();
            if (eaoVar instanceof eab) {
                eam eamVar3 = this.f;
                eab eabVar = (eab) eaoVar;
                synchronized (eamVar3.l) {
                    eamVar3.k.add(eabVar);
                }
            }
        }
        this.k.aw(new efm(applicationContext, this));
        awut awutVar = this.o;
        Context context2 = this.b;
        String str = eaw.a;
        awutVar.getClass();
        context2.getClass();
        if (efs.a(context2, dylVar)) {
            awro.t(awutVar, null, 0, new bej(new awzj(awzf.a(awqx.u(new awzj(workDatabase.C().k(), new eau(null), 2), -1, 1)), new eav(context2, null), 3), (awoq) null, 16), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    public static ebm j(Context context) {
        ebm ebmVarJ;
        dmo dmoVarG;
        edp edpVar;
        Object obj = a;
        synchronized (obj) {
            synchronized (obj) {
                try {
                    ebmVarJ = m;
                    if (ebmVarJ == null) {
                        ebmVarJ = n;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (ebmVarJ == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof dyk)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            dyl dylVarA = ((dyk) applicationContext).a();
            synchronized (obj) {
                try {
                    if (m == null) {
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        ebm ebmVar = n;
                        if (ebmVar == null) {
                            applicationContext2.getClass();
                            dylVarA.getClass();
                            axfd axfdVar = new axfd(dylVarA.c);
                            final Context applicationContext3 = applicationContext2.getApplicationContext();
                            applicationContext3.getClass();
                            ?? r5 = axfdVar.a;
                            r5.getClass();
                            if (applicationContext2.getResources().getBoolean(R.bool.workmanager_test_configuration)) {
                                dmoVarG = new dmo(applicationContext3, WorkDatabase.class, null);
                                dmoVarG.d = true;
                            } else {
                                dmoVarG = azt.g(applicationContext3, WorkDatabase.class, "androidx.work.workdb");
                                dmoVarG.c = new dpf() { // from class: eay
                                    @Override // defpackage.dpf
                                    public final dpg a(xio xioVar) {
                                        return new dpq().a(azu.j(applicationContext3, (String) xioVar.e, (dpe) xioVar.d, true, true));
                                    }
                                };
                            }
                            if (dmoVarG.h != null) {
                                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
                            }
                            dmoVarG.b = r5;
                            dmoVarG.a.add(new dzy());
                            dmoVarG.b(eag.c);
                            dmoVarG.b(new ean(applicationContext3, 2, 3));
                            dmoVarG.b(eah.c);
                            dmoVarG.b(eai.c);
                            dmoVarG.b(new ean(applicationContext3, 5, 6));
                            dmoVarG.b(eaj.c);
                            dmoVarG.b(eak.c);
                            dmoVarG.b(eal.c);
                            dmoVarG.b(new ebn(applicationContext3));
                            dmoVarG.b(new ean(applicationContext3, 10, 11));
                            dmoVarG.b(eac.c);
                            dmoVarG.b(ead.c);
                            dmoVarG.b(eae.c);
                            dmoVarG.b(eaf.c);
                            dmoVarG.b(new ean(applicationContext3, 21, 22));
                            dmoVarG.e = false;
                            dmoVarG.f = true;
                            dmoVarG.g = true;
                            WorkDatabase workDatabase = (WorkDatabase) dmoVarG.a();
                            Context applicationContext4 = applicationContext2.getApplicationContext();
                            applicationContext4.getClass();
                            Context applicationContext5 = applicationContext4.getApplicationContext();
                            applicationContext5.getClass();
                            ede edeVar = new ede(applicationContext5, axfdVar);
                            Context applicationContext6 = applicationContext4.getApplicationContext();
                            applicationContext6.getClass();
                            edg edgVar = new edg(applicationContext6, axfdVar);
                            if (Build.VERSION.SDK_INT < 28) {
                                Context applicationContext7 = applicationContext4.getApplicationContext();
                                applicationContext7.getClass();
                                String str = edn.a;
                                edpVar = new edp(applicationContext7, axfdVar);
                            } else {
                                edpVar = null;
                            }
                            Context applicationContext8 = applicationContext4.getApplicationContext();
                            applicationContext8.getClass();
                            axfd axfdVar2 = new axfd(applicationContext4, edeVar, edgVar, edpVar, new edq(applicationContext8, axfdVar));
                            eam eamVar = new eam(applicationContext2.getApplicationContext(), dylVarA, axfdVar, workDatabase);
                            workDatabase.getClass();
                            awoa awoaVar = new awoa(10);
                            int i = eaq.a;
                            ecg ecgVar = new ecg(applicationContext2, workDatabase, dylVarA, ece.a(applicationContext2), new ecf(applicationContext2), new efk(axfdVar));
                            String str2 = efr.a;
                            PackageManager packageManager = applicationContext2.getPackageManager();
                            packageManager.getClass();
                            efr.a(packageManager, new ComponentName(applicationContext2, (Class<?>) SystemJobService.class), true, efq.a);
                            dzf.b();
                            awoaVar.add(ecgVar);
                            awoaVar.add(new ecc(applicationContext2, dylVarA, axfdVar2, eamVar, new qv(eamVar, axfdVar), axfdVar));
                            ebmVar = new ebm(applicationContext2.getApplicationContext(), dylVarA, axfdVar, workDatabase, awoaVar.f(), eamVar, axfdVar2);
                            n = ebmVar;
                        }
                        m = ebmVar;
                    } else if (n != null) {
                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                    ebmVarJ = j(applicationContext);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ebmVarJ;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.dzt
    public final dzk a(String str) {
        str.getClass();
        azx azxVar = this.c.j;
        ?? r1 = this.k.a;
        r1.getClass();
        return bbl.f(azxVar, "CancelWorkByName_".concat(str), r1, new bgz(str, this, 4, null));
    }

    @Override // defpackage.dzt
    public final dzk b(UUID uuid) {
        return dms.i(uuid, this);
    }

    @Override // defpackage.dzt
    public final dzk c(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new eax(this, null, 2, list).j();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.dzt
    public final void d() {
        azx azxVar = this.c.j;
        ?? r1 = this.k.a;
        r1.getClass();
        bbl.f(azxVar, "CancelWorkByTag_transfer_dm2", r1, new qf(this, 14));
    }

    @Override // defpackage.dzt
    public final dzk e(String str, int i, List list) {
        return new eax(this, str, i, list).j();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.dzt
    public final dzk g(String str, int i, ayq ayqVar) {
        if (i != 3) {
            return new eax(this, str, i != 2 ? 1 : 2, Collections.singletonList(ayqVar)).j();
        }
        str.getClass();
        azx azxVar = this.c.j;
        ?? r0 = this.k.a;
        r0.getClass();
        return bbl.f(azxVar, "enqueueUniquePeriodic_".concat(str), r0, new ebq(this, str, ayqVar, 0));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.dzt
    public final ListenableFuture i(dov dovVar) {
        WorkDatabase workDatabase = this.d;
        axfd axfdVar = this.k;
        workDatabase.getClass();
        axfdVar.getClass();
        agw agwVar = new agw(dovVar, 12);
        ?? r4 = axfdVar.a;
        r4.getClass();
        return ape.f(new dzm((Executor) r4, "loadStatusFuture", new bgz(agwVar, workDatabase, 5, null), 1));
    }

    public final void k() {
        synchronized (a) {
            this.g = true;
            BroadcastReceiver.PendingResult pendingResult = this.h;
            if (pendingResult != null) {
                pendingResult.finish();
                this.h = null;
            }
        }
    }

    public final void l() throws Throwable {
        azx azxVar = this.c.j;
        ebk ebkVar = new ebk(this, 6);
        drb.a();
        ebkVar.invoke();
    }

    public final void m(eek eekVar, int i) {
        this.k.aw(new efv(this.f, new dov(eekVar), true, i));
    }
}
