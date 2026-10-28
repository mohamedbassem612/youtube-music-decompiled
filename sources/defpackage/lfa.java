package defpackage;

import android.app.job.JobParameters;
import android.content.ComponentName;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lfa implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public lfa(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj2;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, mdm] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, mdm] */
    /* JADX WARN: Type inference failed for: r0v69, types: [avmn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, mbb] */
    /* JADX WARN: Type inference failed for: r1v26, types: [afvn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Object, lco] */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.lang.Object, mdm] */
    /* JADX WARN: Type inference failed for: r8v54, types: [android.view.ViewTreeObserver$OnWindowFocusChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ?? r8;
        int i = 2;
        switch (this.$cid) {
            case 0:
                Object obj = this.b;
                lco lcoVar = ((lff) obj).b;
                if (lcoVar == null) {
                    ((ldz) obj).aT().f.a("Failed to send app foregrounded");
                    return;
                }
                try {
                    lcoVar.l((lbg) this.a);
                    ((lff) obj).A();
                    return;
                } catch (RemoteException e) {
                    ((ldz) this.b).aT().c.b("Failed to send app foregrounded to the service", e);
                    return;
                }
            case 1:
                Object obj2 = this.b;
                lco lcoVar2 = ((lff) obj2).b;
                if (lcoVar2 == null) {
                    ((ldz) obj2).aT().f.a("Failed to send app backgrounded");
                    return;
                }
                try {
                    lcoVar2.k((lbg) this.a);
                    ((lff) obj2).A();
                    return;
                } catch (RemoteException e2) {
                    ((ldz) this.b).aT().c.b("Failed to send app backgrounded to the service", e2);
                    return;
                }
            case 2:
                Object obj3 = this.b;
                lco lcoVar3 = ((lff) obj3).b;
                if (lcoVar3 == null) {
                    ((ldz) obj3).aT().c.a("Failed to send consent settings to service");
                    return;
                }
                try {
                    lcoVar3.s((lbg) this.a);
                    ((lff) obj3).A();
                    return;
                } catch (RemoteException e3) {
                    ((ldz) this.b).aT().c.b("Failed to send consent settings to the service", e3);
                    return;
                }
            case 3:
                Object obj4 = this.b;
                synchronized (obj4) {
                    ((lfe) obj4).a = false;
                    lff lffVar = ((lfe) obj4).c;
                    if (!lffVar.P()) {
                        lffVar.aT().k.a("Connected to service");
                        lffVar.O(this.a);
                    }
                    break;
                }
                return;
            case 4:
                ((lfe) this.b).c.x((ComponentName) this.a);
                return;
            case 5:
                lff lffVar2 = ((lfe) this.b).c;
                lffVar2.b = null;
                if (((klo) this.a).c != 7777) {
                    lffVar2.v();
                    return;
                }
                if (lffVar2.d == null) {
                    lffVar2.d = Executors.newScheduledThreadPool(1);
                }
                lffVar2.d.schedule(new lei(this, 6), ((Long) lcl.ak.b(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            case 6:
                JobParameters jobParameters = (JobParameters) this.a;
                jobParameters.getJobId();
                ((lfi) ((lqa) this.b).a).c(jobParameters);
                return;
            case 7:
                lfv lfvVar = (lfv) this.a;
                lfvVar.B();
                lfvVar.A();
                if (lfvVar.m == null) {
                    lfvVar.m = new ArrayList();
                }
                lfvVar.m.add(this.b);
                lfvVar.Z();
                return;
            case 8:
                lfv lfvVar2 = (lfv) this.a;
                lfp lfpVar = lfvVar2.h;
                Object obj5 = this.b;
                String str = (String) obj5;
                if (lfpVar.a(str)) {
                    lfvVar2.aT().k.b("[sgtm] bundling and queuing sgtm events on retrieving. appId", obj5);
                    int iC = lfvVar2.i().C(str, lcl.as);
                    for (int i2 = 0; i2 < iC && lfvVar2.ad(str, 0L); i2++) {
                    }
                    lfvVar2.aV();
                    lfvVar2.aa(str, System.currentTimeMillis());
                    return;
                }
                return;
            case 9:
                ((lfv) this.a).v().T((String) this.b, "event_dropped_count", "event_cardinality_exceeded", 1L, 0L);
                return;
            case 10:
                ?? r1 = this.a;
                r1.a(new kjk(((avlh) this.b).am(new jgq(r1, 12), new jgq(r1, 13), new hoi(r1, 4)), i));
                return;
            case 11:
                ?? r2 = this.a;
                tro troVar = (tro) r2;
                troVar.a.f(troVar.b);
                try {
                    this.b.run();
                    r2.close();
                    return;
                } catch (Throwable th) {
                    try {
                        r2.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 12:
                long id = Thread.currentThread().getId();
                mdo mdoVar = (mdo) this.a;
                mdoVar.a.d(id);
                try {
                    this.b.run();
                    return;
                } finally {
                    mdoVar.a.c(id);
                }
            case 13:
                Object obj6 = this.b;
                Object obj7 = this.a;
                agkj agkjVar = mgh.a;
                View viewB = ((nrv) obj7).b();
                agkj agkjVar2 = mgh.a;
                asqu asquVarA = asqu.a(((asqt) obj6).d);
                if (asquVarA == null) {
                    asquVarA = asqu.HAPTIC_TYPE_UNKNOWN;
                }
                mgg mggVar = (mgg) agkjVar2.get(asquVarA);
                if (viewB == null || mggVar == null) {
                    return;
                }
                viewB.performHapticFeedback(mggVar.a);
                return;
            case 14:
                Handler handler = mjc.a;
                Toast.makeText(((fhd) this.a).a, "Elements Error (check settings):\n".concat(String.valueOf(((Throwable) this.b).getMessage())), 1).show();
                return;
            case 15:
                int i3 = mjr.a;
                ((hee) this.a).a(this.b);
                return;
            case 16:
                Object obj8 = this.a;
                String str2 = mkh.a;
                View view = (View) obj8;
                if (view.hasWindowFocus() || (r8 = this.b) == 0) {
                    mkh.a(view);
                    return;
                } else {
                    ((mkg) r8).a = view;
                    view.getViewTreeObserver().addOnWindowFocusChangeListener(r8);
                    return;
                }
            case 17:
                ?? r0 = this.a;
                ((avmm) r0).dispose();
                ((avmm) this.b).h(r0);
                return;
            case 18:
                ((mmf) this.b).f((View) this.a);
                return;
            case 19:
                ((mmf) this.b).b((View) this.a);
                return;
            default:
                ((mny) this.b).g((RecyclerView) this.a, 2, -1);
                return;
        }
    }

    public /* synthetic */ lfa(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ lfa(Object obj, Object obj2, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public lfa(lfv lfvVar, Runnable runnable, int i) {
        this.$cid = i;
        this.a = lfvVar;
        this.b = runnable;
    }
}
