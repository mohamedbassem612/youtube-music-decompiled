package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eby {
    public final ees a;
    public final Context b;
    public final String c;
    public final dyl d;
    public final WorkDatabase e;
    public final eet f;
    public final edw g;
    public final String h;
    public final List i;
    public final awwf j;
    public final axfd k;
    private final eds l;
    private final List m;
    private final List n;

    /* JADX WARN: Type inference failed for: r2v4, types: [eds, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public eby(aerj aerjVar) {
        ees eesVar = (ees) aerjVar.c;
        this.a = eesVar;
        this.b = (Context) aerjVar.a;
        String str = eesVar.c;
        this.c = str;
        this.k = (axfd) aerjVar.g;
        this.d = (dyl) aerjVar.e;
        this.l = aerjVar.b;
        WorkDatabase workDatabase = (WorkDatabase) aerjVar.f;
        this.e = workDatabase;
        this.f = workDatabase.C();
        this.g = workDatabase.w();
        ?? r2 = aerjVar.d;
        this.m = r2;
        this.h = "Work [ id=" + str + ", class=" + eesVar.e + ", tags={ " + atqq.aD(r2, ",", null, null, null, 62) + " } ]";
        this.j = new awwf(null);
        this.i = new ArrayList();
        this.n = new ArrayList();
    }

    public final eek a() {
        return bou.e(this.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final Object b(awoq awoqVar) throws Throwable {
        ebx ebxVar;
        dyp dypVarA;
        if (awoqVar instanceof ebx) {
            ebxVar = (ebx) awoqVar;
            int i = ebxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ebxVar.c = i - Integer.MIN_VALUE;
            } else {
                ebxVar = new ebx(this, awoqVar);
            }
        } else {
            ebxVar = new ebx(this, awoqVar);
        }
        ebx ebxVar2 = ebxVar;
        Object objP = ebxVar2.a;
        awox awoxVar = awox.a;
        int i2 = ebxVar2.c;
        int i3 = 1;
        try {
            if (i2 == 0) {
                atqp.j(objP);
                ees eesVar = this.a;
                final boolean zA = drb.a();
                final String str = eesVar.x;
                if (zA && str != null) {
                    eesVar.hashCode();
                }
                if (!((Boolean) this.e.e(new ebs(this, i3))).booleanValue()) {
                    if (eesVar.e()) {
                        dypVarA = eesVar.g;
                    } else {
                        String str2 = eesVar.f;
                        str2.getClass();
                        String str3 = dyy.a;
                        dyx dyxVar = null;
                        try {
                            Object objNewInstance = Class.forName(str2).getDeclaredConstructor(null).newInstance(null);
                            objNewInstance.getClass();
                            dyxVar = (dyx) objNewInstance;
                        } catch (Exception e) {
                            dzf.b();
                            Log.e(dyy.a, "Trouble instantiating ".concat(str2), e);
                        }
                        if (dyxVar == null) {
                            String str4 = eca.a;
                            dzf.b();
                            Log.e(str4, "Could not create Input Merger ".concat(String.valueOf(this.a.f)));
                            return new ebw(false);
                        }
                        List listSingletonList = Collections.singletonList(this.a.g);
                        listSingletonList.getClass();
                        dypVarA = dyxVar.a(atqq.aj(listSingletonList, this.f.e(this.c)));
                    }
                    dyp dypVar = dypVarA;
                    String str5 = this.c;
                    List list = this.m;
                    ees eesVar2 = this.a;
                    dyl dylVar = this.d;
                    axfd axfdVar = this.k;
                    UUID uuidFromString = UUID.fromString(str5);
                    int i4 = eesVar2.m;
                    int i5 = egc.a;
                    egb egbVar = new egb(this.e, this.l, axfdVar);
                    Executor executor = dylVar.a;
                    awou awouVar = dylVar.b;
                    dzv dzvVar = dylVar.d;
                    WorkerParameters workerParameters = new WorkerParameters(uuidFromString, dypVar, list, i4, executor, awouVar, axfdVar, dzvVar, egbVar);
                    try {
                        final dze dzeVarB = dzvVar.b(this.b, eesVar2.e, workerParameters);
                        dzeVarB.c = true;
                        awos awosVar = ebxVar2.getContext().get(awwd.d);
                        awosVar.getClass();
                        awwd awwdVar = (awwd) awosVar;
                        awwdVar.kJ(new awqg() { // from class: ebr
                            @Override // defpackage.awqg
                            public final Object invoke(Object obj) {
                                Throwable th = (Throwable) obj;
                                if (th instanceof ebo) {
                                    dzeVarB.i(((ebo) th).a);
                                }
                                if (zA && str != null) {
                                    this.a.hashCode();
                                }
                                return awmy.a;
                            }
                        });
                        Object objE = this.e.e(new ebs(this, 0));
                        objE.getClass();
                        if (((Boolean) objE).booleanValue() && !awwdVar.r()) {
                            dyw dywVar = workerParameters.h;
                            ?? r2 = this.k.d;
                            r2.getClass();
                            awuq awuqVarF = awuw.f(r2);
                            beh behVar = new beh(this, dzeVarB, dywVar, (awoq) null, 3);
                            ebxVar2.c = 1;
                            objP = awro.p(awuqVarF, behVar, ebxVar2);
                            if (objP == awoxVar) {
                                return awoxVar;
                            }
                        }
                    } catch (Throwable unused) {
                        String str6 = eca.a;
                        dzf.b();
                        Log.e(str6, "Could not create Worker ".concat(String.valueOf(this.a.e)));
                        return new ebw(false);
                    }
                }
                return new ebw(true);
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objP);
            bbl bblVar = (bbl) objP;
            bblVar.getClass();
            return new ebu(bblVar);
        } catch (CancellationException e2) {
            String str7 = eca.a;
            dzf.b();
            throw e2;
        } catch (Throwable th) {
            String str8 = eca.a;
            dzf.b();
            Log.e(str8, this.h.concat(" failed because it threw an exception/error"), th);
            return new ebt();
        }
    }

    public final boolean c(int i) {
        eet eetVar = this.f;
        String str = this.c;
        dzr dzrVarB = eetVar.b(str);
        if (dzrVarB == null || dzrVarB.a()) {
            String str2 = eca.a;
            dzf.b();
            Objects.toString(dzrVarB);
            return false;
        }
        if (awrc.c(this.a.y, Boolean.TRUE)) {
            String str3 = eca.a;
            dzf.b();
            d(i);
            return true;
        }
        String str4 = eca.a;
        dzf.b();
        Objects.toString(dzrVarB);
        eetVar.A(dzr.a, str);
        eetVar.r(str, i);
        eetVar.w(str, -1L);
        return true;
    }

    public final void d(int i) {
        eet eetVar = this.f;
        dzr dzrVar = dzr.a;
        String str = this.c;
        eetVar.A(dzrVar, str);
        eetVar.p(str, System.currentTimeMillis());
        eetVar.o(str, this.a.v);
        eetVar.w(str, -1L);
        eetVar.r(str, i);
    }

    public final void e() {
        eet eetVar = this.f;
        String str = this.c;
        eetVar.p(str, System.currentTimeMillis());
        eetVar.A(dzr.a, str);
        eetVar.y(str);
        eetVar.o(str, this.a.v);
        eetVar.m(str);
        eetVar.w(str, -1L);
    }

    public final void f(bbl bblVar) {
        String str = eca.a;
        dzf.b();
        if (this.a.e()) {
            e();
        } else {
            g(bblVar);
        }
    }

    public final void g(bbl bblVar) {
        String str = this.c;
        List<String> listJ = atqq.J(str);
        listJ.addAll(bou.g(this.g, str));
        for (String str2 : listJ) {
            eet eetVar = this.f;
            if (eetVar.b(str2) != dzr.f) {
                eetVar.A(dzr.d, str2);
                if (!awrc.c(str2, str)) {
                    this.n.add(str2);
                }
            }
        }
        dyp dypVar = ((dzb) bblVar).a;
        dypVar.getClass();
        eet eetVar2 = this.f;
        eetVar2.o(str, this.a.v);
        eetVar2.q(str, dypVar);
    }
}
