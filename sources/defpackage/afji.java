package defpackage;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class afji extends Service {
    public jij a;

    public final jij a() {
        jij jijVar = this.a;
        if (jijVar != null) {
            return jijVar;
        }
        awrc.b("registry");
        return null;
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.getClass();
        afju afjuVarM = a().M(getClass());
        synchronized (afjuVarM.b) {
            Iterator it = afjuVarM.c.entrySet().iterator();
            while (it.hasNext()) {
                printWriter.println(((Map.Entry) it.next()).toString());
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((afjh) aguu.av(this, afjh.class)).dS(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        afvl afvlVarQ;
        afjg afjgVar = new afjg(this, intent, i2, 0);
        if (intent != null) {
            long j = afwl.a;
            afvlVarQ = afwl.q(intent);
        } else {
            afvlVarQ = null;
        }
        if (afvlVarQ == null) {
            afjgVar.invoke();
            return 2;
        }
        afvh afvhVarA = afty.a();
        afvl afvlVarE = afty.e(afvhVarA, afvlVarQ);
        try {
            afjgVar.invoke();
            afty.e(afvhVarA, afvlVarE);
            return 2;
        } catch (Throwable th) {
            try {
                aftt.a(th);
                throw th;
            } catch (Throwable th2) {
                afty.e(afvhVarA, afvlVarE);
                throw th2;
            }
        }
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        afju afjuVarM = a().M(getClass());
        synchronized (afjuVarM.b) {
            if (afjuVarM.f.ordinal() == 2) {
                afjuVarM.b();
                afjs afjsVar = new afjs();
                agjp agjpVar = afjuVarM.d;
                aghg aghgVar = new aghg(agjpVar);
                agkx agkxVar = new agkx();
                Iterator<E> it = aghgVar.iterator();
                while (it.hasNext()) {
                    agkxVar.c(((afwn) it.next()).a);
                }
                agkz<afvl> agkzVarG = agkxVar.g();
                afwq afwqVar = new afwq(afjsVar, new StackTraceElement[0]);
                agkh agkhVar = new agkh(4);
                for (afvl afvlVar : agkzVarG) {
                    afwq afwqVar2 = new afwq(null, afwq.g(afvlVar, null));
                    afwqVar.addSuppressed(afwqVar2);
                    agkhVar.e(afvlVar, afwqVar2);
                }
                agkj agkjVarD = agkhVar.d(true);
                afwq.e(agkjVarD);
                afwq.d(agkjVarD);
                ((agrc) ((agrc) ((agrc) afju.a.b()).j(afwqVar)).k("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "onTimeout", 431, "ForegroundServiceTracker.java")).t("Timeout elapsed");
                afjuVarM.e.clear();
                agjpVar.r();
            }
        }
    }
}
