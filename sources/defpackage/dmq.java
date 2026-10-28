package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dmq {
    public awut a;
    public awou b;
    public Executor c;
    public Executor d;
    public dmg e;
    public boolean f;
    public dlv j;
    public final pj k = new pj((byte[]) null, (byte[]) null);
    public final ThreadLocal g = new ThreadLocal();
    public final Map h = new LinkedHashMap();
    public boolean i = true;

    private final Object w(Function0 function0) {
        if (!q()) {
            return apb.f(this, false, true, new ank(function0, 6));
        }
        m();
        try {
            Object objInvoke = function0.invoke();
            p();
            return objInvoke;
        } finally {
            n();
        }
    }

    protected abstract dmg a();

    public final dmg b() {
        dmg dmgVar = this.e;
        if (dmgVar != null) {
            return dmgVar;
        }
        awrc.b("internalTracker");
        return null;
    }

    protected dmu c() {
        throw new awmk("An operation is not implemented.");
    }

    public final dpg d() {
        dlv dlvVar = this.j;
        if (dlvVar == null) {
            awrc.b("connectionManager");
            dlvVar = null;
        }
        dpg dpgVar = dlvVar.d;
        if (dpgVar != null) {
            return dpgVar;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final Object e(Callable callable) {
        return w(new py(callable, 13));
    }

    public List f(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(atqq.u(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            awsd awsdVar = (awsd) entry.getKey();
            awsdVar.getClass();
            linkedHashMap.put(((awqu) awsdVar).a(), entry.getValue());
        }
        return u();
    }

    protected Map g() {
        Set<Map.Entry> setEntrySet = h().entrySet();
        int iU = atqq.u(atqq.N(setEntrySet, 10));
        if (iU < 16) {
            iU = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
        for (Map.Entry entry : setEntrySet) {
            Class cls = (Class) entry.getKey();
            List<Class> list = (List) entry.getValue();
            cls.getClass();
            int i = awrn.a;
            awqv awqvVar = new awqv(cls);
            ArrayList arrayList = new ArrayList(atqq.N(list, 10));
            for (Class cls2 : list) {
                cls2.getClass();
                arrayList.add(new awqv(cls2));
            }
            awml awmlVar = new awml(awqvVar, arrayList);
            linkedHashMap.put(awmlVar.a, awmlVar.b);
        }
        return linkedHashMap;
    }

    protected Map h() {
        return awnp.a;
    }

    public Set i() {
        Set<Class> setJ = j();
        ArrayList arrayList = new ArrayList(atqq.N(setJ, 10));
        for (Class cls : setJ) {
            cls.getClass();
            int i = awrn.a;
            arrayList.add(new awqv(cls));
        }
        return atqq.aw(arrayList);
    }

    public Set j() {
        return awnq.a;
    }

    public final awou k() {
        awut awutVar = this.a;
        if (awutVar == null) {
            awrc.b("coroutineScope");
            awutVar = null;
        }
        return ((axcw) awutVar).a;
    }

    public final void l() {
        if (!this.f && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void m() {
        l();
        l();
        dpd dpdVarB = d().b();
        if (!dpdVarB.g()) {
            dms.e(new bej(b(), (awoq) null, 5));
        }
        if (((dpl) dpdVarB).e.isWriteAheadLoggingEnabled()) {
            dpdVarB.c();
        } else {
            dpdVarB.b();
        }
    }

    public final void n() {
        d().b().d();
        if (r()) {
            return;
        }
        dmg dmgVarB = b();
        dmgVarB.b.f(dmgVarB.f, dmgVarB.g);
    }

    public final void o(Runnable runnable) {
        w(new py(runnable, 12));
    }

    public final void p() {
        d().b().f();
    }

    public final boolean q() {
        dlv dlvVar = this.j;
        if (dlvVar == null) {
            awrc.b("connectionManager");
            dlvVar = null;
        }
        return dlvVar.d != null;
    }

    public final boolean r() {
        return s() && d().b().g();
    }

    public final boolean s() {
        dlv dlvVar = this.j;
        if (dlvVar == null) {
            awrc.b("connectionManager");
            dlvVar = null;
        }
        dpd dpdVar = dlvVar.e;
        if (dpdVar != null) {
            return dpdVar.h();
        }
        return false;
    }

    public final void t(dpt dptVar) throws Exception {
        dmg dmgVarB = b();
        dnl dnlVar = dmgVarB.b;
        dpb dpbVarA = dptVar.a("PRAGMA query_only");
        try {
            dpbVarA.l();
            boolean zN = dpbVarA.n();
            dpbVarA.close();
            if (!zN) {
                azu.i(dptVar, "PRAGMA temp_store = MEMORY");
                azu.i(dptVar, "PRAGMA recursive_triggers = 1");
                azu.i(dptVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (dnlVar.c) {
                    azu.i(dptVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    azu.i(dptVar, awrc.C("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                dmj dmjVar = dnlVar.e;
                ReentrantLock reentrantLock = dmjVar.a;
                reentrantLock.lock();
                try {
                    dmjVar.d = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (dmgVarB.h) {
                we weVar = dmgVarB.i;
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    dpbVarA.close();
                } catch (Throwable th4) {
                    avkz.d(th2, th4);
                }
                throw th3;
            }
        }
    }

    public List u() {
        return awno.a;
    }

    public final Object v(awqk awqkVar, awoq awoqVar) {
        dlv dlvVar = this.j;
        if (dlvVar == null) {
            awrc.b("connectionManager");
            dlvVar = null;
        }
        dnw dnwVar = (dnw) awoqVar.getContext().get(dnw.b);
        dnv dnvVar = dnwVar != null ? dnwVar.a : null;
        if (dnvVar != null) {
            return awqkVar.invoke(dnvVar, awoqVar);
        }
        dnx dnxVar = dlvVar.f;
        dnv dnvVar2 = new dnv(dnxVar.b, (dpt) dnxVar.c.a());
        return awro.p(new dnw(dnvVar2), new bev(awqkVar, dnvVar2, (awoq) null, 4), awoqVar);
    }
}
