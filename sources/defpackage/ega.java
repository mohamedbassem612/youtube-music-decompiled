package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.view.ViewGroup;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ega implements Function0 {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ega(bj bjVar, ViewGroup viewGroup, Object obj, awrm awrmVar, int i) {
        this.$cid = i;
        this.d = bjVar;
        this.c = viewGroup;
        this.a = obj;
        this.b = awrmVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, zqy] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, zqy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                Object obj = this.d;
                bj bjVar = (bj) obj;
                dv dvVar = bjVar.d;
                Object obj2 = this.a;
                Object obj3 = this.c;
                bjVar.g = dvVar.s((ViewGroup) obj3, obj2);
                if (bjVar.g == null) {
                    bjVar.h = true;
                    return awmy.a;
                }
                ((awrm) this.b).a = new bi(obj, obj2, obj3, 1, null);
                if (dd.aa(2)) {
                    ea eaVar = bjVar.b;
                    ea eaVar2 = bjVar.c;
                    Objects.toString(eaVar);
                    Objects.toString(eaVar2);
                }
                return awmy.a;
            }
            if (i != 2) {
                ?? r0 = this.a;
                Object obj4 = this.d;
                Object objA = zqj.a(r0);
                if (objA == null) {
                    objA = obj4;
                }
                ((zqj) this.c).c.g(new zhg(new zqn((zqg) objA, (zqg) obj4, r0), this.b, (byte[]) null));
                return awmy.a;
            }
            ?? r1 = this.b;
            Object obj5 = this.d;
            Object objA2 = zqj.a(r1);
            if (objA2 == null) {
                objA2 = obj5;
            }
            ((zqj) this.a).c.g(new zhg(new zqn((zqg) objA2, (zqg) obj5, r1), new yrc(this.c, 11), (byte[]) null));
            return awmy.a;
        }
        egb egbVar = (egb) this.a;
        eet eetVar = egbVar.b;
        String string = ((UUID) this.b).toString();
        ees eesVarC = eetVar.c(string);
        Object obj6 = this.c;
        if (eesVarC == null || eesVarC.d.a()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        eds edsVar = egbVar.a;
        synchronized (((eam) edsVar).l) {
            dzf.b();
            eby ebyVar = (eby) ((eam) edsVar).g.remove(string);
            if (ebyVar != null) {
                if (((eam) edsVar).b == null) {
                    Context context = ((eam) edsVar).c;
                    int i2 = efw.a;
                    context.getClass();
                    Object systemService = context.getApplicationContext().getSystemService("power");
                    systemService.getClass();
                    PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, "WorkManager: ProcessorForegroundLck");
                    synchronized (efx.a) {
                    }
                    wakeLockNewWakeLock.getClass();
                    ((eam) edsVar).b = wakeLockNewWakeLock;
                    ((eam) edsVar).b.acquire();
                }
                ((eam) edsVar).f.put(string, ebyVar);
                Context context2 = ((eam) edsVar).c;
                eek eekVarA = ebyVar.a();
                int i3 = edu.k;
                Intent intent = new Intent(context2, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_START_FOREGROUND");
                intent.putExtra("KEY_WORKSPEC_ID", eekVarA.a);
                intent.putExtra("KEY_GENERATION", eekVarA.b);
                intent.putExtra("KEY_NOTIFICATION_ID", ((dyv) obj6).a);
                intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ((dyv) obj6).b);
                intent.putExtra("KEY_NOTIFICATION", ((dyv) obj6).c);
                context2.startForegroundService(intent);
                ArrayList arrayList = new ArrayList(((eam) edsVar).k);
                eek eekVarA2 = ebyVar.a();
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((eab) arrayList.get(i4)).a(eekVarA2, true);
                }
            }
        }
        Object obj7 = this.d;
        eek eekVarE = bou.e(eesVarC);
        int i5 = edu.k;
        Context context3 = (Context) obj7;
        Intent intent2 = new Intent(context3, (Class<?>) SystemForegroundService.class);
        intent2.setAction("ACTION_NOTIFY");
        dyv dyvVar = (dyv) obj6;
        intent2.putExtra("KEY_NOTIFICATION_ID", dyvVar.a);
        intent2.putExtra("KEY_FOREGROUND_SERVICE_TYPE", dyvVar.b);
        intent2.putExtra("KEY_NOTIFICATION", dyvVar.c);
        intent2.putExtra("KEY_WORKSPEC_ID", eekVarE.a);
        intent2.putExtra("KEY_GENERATION", eekVarE.b);
        context3.startService(intent2);
        return null;
    }

    public /* synthetic */ ega(egb egbVar, UUID uuid, dyv dyvVar, Context context, int i) {
        this.$cid = i;
        this.a = egbVar;
        this.b = uuid;
        this.c = dyvVar;
        this.d = context;
    }

    public /* synthetic */ ega(zqj zqjVar, zqy zqyVar, zqg zqgVar, aeiv aeivVar, int i) {
        this.$cid = i;
        this.a = zqjVar;
        this.b = zqyVar;
        this.d = zqgVar;
        this.c = aeivVar;
    }

    public /* synthetic */ ega(zqj zqjVar, zqy zqyVar, zqg zqgVar, awqg awqgVar, int i) {
        this.$cid = i;
        this.c = zqjVar;
        this.a = zqyVar;
        this.d = zqgVar;
        this.b = awqgVar;
    }
}
