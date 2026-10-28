package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.akl;
import defpackage.atqp;
import defpackage.atqq;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awrc;
import defpackage.awro;
import defpackage.awuq;
import defpackage.awuw;
import defpackage.bbl;
import defpackage.dnz;
import defpackage.dov;
import defpackage.dzb;
import defpackage.dzc;
import defpackage.dze;
import defpackage.dzf;
import defpackage.dzv;
import defpackage.ebm;
import defpackage.ecu;
import defpackage.ecy;
import defpackage.ees;
import defpackage.eet;
import defpackage.egf;
import defpackage.egg;
import defpackage.egh;
import defpackage.egi;
import defpackage.egj;
import defpackage.egn;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    private final WorkerParameters d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.d = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(awoq awoqVar) {
        return awro.p(awuw.f(h()), new dnz(this, (awoq) null, 4), awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final Object k(awoq awoqVar) {
        egj egjVar;
        int iE;
        if (awoqVar instanceof egj) {
            egjVar = (egj) awoqVar;
            int i = egjVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                egjVar.d = i - Integer.MIN_VALUE;
            } else {
                egjVar = new egj(this, awoqVar);
            }
        } else {
            egjVar = new egj(this, awoqVar);
        }
        egj egjVar2 = egjVar;
        Object objP = egjVar2.b;
        awox awoxVar = awox.a;
        ?? r2 = egjVar2.d;
        try {
            if (r2 == 0) {
                atqp.j(objP);
                String strA = f().a("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (strA == null || strA.length() == 0) {
                    String str = egn.a;
                    dzf.b();
                    Log.e(str, "No worker to delegate to.");
                    return new dzb();
                }
                ebm ebmVarJ = ebm.j(this.a);
                eet eetVarC = ebmVarJ.d.C();
                String string = g().toString();
                string.getClass();
                ees eesVarC = eetVarC.c(string);
                if (eesVarC == null) {
                    return new dzb();
                }
                dov dovVar = new dov(ebmVarJ.l);
                ?? r3 = dovVar.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : r3) {
                    if (((ecy) obj).c(eesVarC)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    dzf.b();
                    String str2 = ecu.a;
                    atqq.aD(arrayList, null, null, null, new akl(18), 31);
                }
                if (!arrayList.isEmpty()) {
                    String str3 = egn.a;
                    dzf.b();
                    return new dzc();
                }
                String str4 = egn.a;
                dzf.b();
                try {
                    dzv dzvVar = this.b.g;
                    Context context = this.a;
                    context.getClass();
                    dze dzeVarB = dzvVar.b(context, strA, this.d);
                    ?? r0 = this.d.i.d;
                    r0.getClass();
                    awuq awuqVarF = awuw.f(r0);
                    egh eghVar = new egh(this, dzeVarB, dovVar, eesVarC, (awoq) null, 2);
                    egjVar2.a = dzeVarB;
                    egjVar2.d = 1;
                    objP = awro.p(awuqVarF, eghVar, egjVar2);
                    r2 = dzeVarB;
                    if (objP == awoxVar) {
                        return awoxVar;
                    }
                } catch (Throwable unused) {
                    dzf.b();
                    return new dzb();
                }
            } else {
                if (r2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = egjVar2.a;
                atqp.j(objP);
                r2 = obj2;
            }
            return (bbl) objP;
        } catch (CancellationException e) {
            if (j() || (e instanceof egf)) {
                if (Build.VERSION.SDK_INT < 31) {
                    iE = -512;
                } else if (j()) {
                    iE = e();
                } else {
                    if (!(e instanceof egf)) {
                        throw new IllegalStateException("Unreachable");
                    }
                    iE = ((egf) e).a;
                }
                ((dze) r2).i(iE);
            }
            if (e instanceof egf) {
                return new dzc();
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(dze dzeVar, dov dovVar, ees eesVar, awoq awoqVar) {
        egg eggVar;
        if (awoqVar instanceof egg) {
            eggVar = (egg) awoqVar;
            int i = eggVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eggVar.c = i - Integer.MIN_VALUE;
            } else {
                eggVar = new egg(this, awoqVar);
            }
        } else {
            eggVar = new egg(this, awoqVar);
        }
        Object objJ = eggVar.a;
        awox awoxVar = awox.a;
        int i2 = eggVar.c;
        if (i2 == 0) {
            atqp.j(objJ);
            egi egiVar = new egi(dzeVar, dovVar, eesVar, null);
            eggVar.c = 1;
            objJ = awrc.J(egiVar, eggVar);
            if (objJ == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objJ);
        }
        objJ.getClass();
        return objJ;
    }
}
