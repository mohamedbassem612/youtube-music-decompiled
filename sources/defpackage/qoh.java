package defpackage;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import j$.time.Duration;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qoh implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ qoh(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v34, types: [aunn, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        zhk zhkVar;
        Bitmap bitmap;
        switch (this.$cid) {
            case 0:
                int i = qol.a;
                return ((Context) this.a).getExternalFilesDirs(null);
            case 1:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return null;
            case 2:
                int i2 = qol.a;
                return ((Context) this.a).getExternalCacheDirs();
            case 3:
                qrp qrpVar = (qrp) this.a;
                Set<String> setKeySet = qrpVar.c;
                if (setKeySet == null) {
                    setKeySet = qrpVar.e.getAll().keySet();
                }
                SharedPreferences.Editor editorEdit = qrpVar.e.edit();
                Iterator<String> it = setKeySet.iterator();
                while (it.hasNext()) {
                    editorEdit.remove(it.next());
                }
                if (!editorEdit.commit()) {
                    throw new IOException("Failed to remove migrated SharedPreferences keys: ".concat(String.valueOf(qrpVar.b)));
                }
                if (!qrpVar.d || !qrpVar.e.getAll().isEmpty()) {
                    return null;
                }
                Context context = qrpVar.a;
                String str = qrpVar.b;
                File file = new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), String.valueOf(str).concat(".xml"));
                File file2 = new File(String.valueOf(file.getPath()).concat(".bak"));
                file.delete();
                file2.delete();
                if (file.exists() || file2.exists()) {
                    throw new IOException("Failed to delete empty SharedPreferences file: ".concat(String.valueOf(str)));
                }
                return null;
            case 4:
                return xsc.af((Context) this.a);
            case 5:
                Object obj = this.a;
                rdr rdrVar = (rdr) obj;
                ReentrantLock reentrantLock = rdrVar.h;
                reentrantLock.lock();
                try {
                    quc qucVar = ((rdr) obj).n.c;
                    if (qucVar.f().isZero()) {
                        rbc rbcVar = new rbc(rdr.I, rbd.d);
                        rbcVar.c();
                        rbcVar.a("Trying to generate a thumbnail for composition with graphical duration of zero, segment count=%s", Integer.valueOf(qucVar.c().size()));
                        reentrantLock.unlock();
                        return null;
                    }
                    rdt rdtVar = ((rdr) obj).e;
                    synchronized (rdtVar.b) {
                        if (!rdtVar.d) {
                            rdtVar.c = new rds(null, new zhk(null, null));
                        }
                        break;
                    }
                    rdi rdiVar = ((rdr) obj).x;
                    rdiVar.f(new rcu(rdiVar, 6));
                    rdrVar.h.unlock();
                    rdt rdtVar2 = rdrVar.e;
                    synchronized (rdtVar2.b) {
                        zhkVar = rdtVar2.c.b;
                        break;
                    }
                    if (zhkVar == null) {
                        return null;
                    }
                    Duration duration = rdt.a;
                    if (!zhkVar.d(duration.toMillis())) {
                        rbc rbcVar2 = new rbc(rdt.e, rbd.c);
                        rbcVar2.c();
                        rbcVar2.d("It took more than %s to generate a thumbnail, not waiting for it.", duration);
                        rbcVar2.a("It took a while to generate a thumbnail, not waiting for it.", new Object[0]);
                    }
                    synchronized (rdtVar2.b) {
                        bitmap = rdtVar2.c.a;
                        rdtVar2.c = new rds(null, null);
                        break;
                    }
                    return bitmap;
                } catch (Throwable th) {
                    rdrVar.h.unlock();
                    throw th;
                }
            case 6:
                ((rfa) this.a).l();
                return null;
            case 7:
                ((rfa) this.a).l();
                return null;
            case 8:
                vbz vbzVarA = ((vca) ((agfa) this.a).a.io()).a();
                if (vbzVarA == null) {
                    return null;
                }
                vbzVarA.a();
                return vbzVarA;
            case 9:
                trh trhVarC = ((tre) this.a).h.c(0);
                return trhVarC != null ? trhVarC.b() : agdf.a;
            case 10:
                ActivityManager activityManager = (ActivityManager) ((Context) this.a).getSystemService("activity");
                if (activityManager == null) {
                    return agdf.a;
                }
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                return agev.i(Long.valueOf(memoryInfo.totalMem));
            case 11:
                return ((sdv) this.a).g();
            case 12:
                return ((sdv) this.a).i();
            case 13:
                return ((sdx) this.a).h();
            case 14:
                return ((sdx) this.a).g();
            case 15:
                return ((sdv) this.a).d();
            case 16:
                return ((sdx) this.a).d();
            case 17:
                sql sqlVar = (sql) this.a;
                return agev.h(sqlVar.q.M(sqlVar.o.e()));
            case 18:
                Object obj2 = this.a;
                syn synVar = (syn) obj2;
                avmn avmnVarAk = ((taq) synVar.b).Q().ak(new sqk(obj2, 2));
                ((avmm) synVar.a).c(avmnVarAk);
                return avmnVarAk;
            case 19:
                lkw.b((Context) this.a);
                return Boolean.valueOf(lkw.c());
            default:
                Object obj3 = this.a;
                synchronized (obj3) {
                    if (((tpb) obj3).b == null) {
                        return null;
                    }
                    ((tpb) obj3).k();
                    if (((tpb) obj3).l()) {
                        ((tpb) obj3).j();
                        ((tpb) obj3).d = 0;
                    }
                    return null;
                }
        }
    }
}
