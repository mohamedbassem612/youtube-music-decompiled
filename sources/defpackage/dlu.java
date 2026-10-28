package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dlu extends dls {
    private final MeasurementManager a;

    public dlu(MeasurementManager measurementManager) {
        this.a = measurementManager;
    }

    static /* synthetic */ Object c(dlu dluVar, awoq awoqVar) {
        awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        dluVar.a.getMeasurementApiStatus(cte.a, new awm(awudVar));
        return awudVar.j();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object d(dlu dluVar, Uri uri, InputEvent inputEvent, awoq awoqVar) throws Throwable {
        dlt dltVar;
        if (awoqVar instanceof dlt) {
            dltVar = (dlt) awoqVar;
            int i = dltVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dltVar.c = i - Integer.MIN_VALUE;
            } else {
                dltVar = new dlt(dluVar, awoqVar);
            }
        } else {
            dltVar = new dlt(dluVar, awoqVar);
        }
        Object obj = dltVar.a;
        awox awoxVar = awox.a;
        int i2 = dltVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            dltVar.c = 1;
            awud awudVar = new awud(JniZero.q(dltVar), 1);
            awudVar.w();
            dluVar.a.registerSource(uri, null, cte.b, new awm(awudVar));
            if (awudVar.j() == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }

    @Override // defpackage.dls
    public Object a(awoq awoqVar) {
        return c(this, awoqVar);
    }

    @Override // defpackage.dls
    public Object b(Uri uri, InputEvent inputEvent, awoq awoqVar) {
        return d(this, uri, null, awoqVar);
    }
}
