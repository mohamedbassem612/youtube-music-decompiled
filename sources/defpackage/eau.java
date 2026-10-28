package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eau extends awpk implements awqm {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ long c;

    public eau(awoq awoqVar) {
        super(4, awoqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.awqm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        eau eauVar = new eau(obj4);
        eauVar.b = obj2;
        eauVar.c = jLongValue;
        return eauVar.invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = this.b;
        long j = this.c;
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i == 0) {
            dzf.b();
            Log.e(eaw.a, "Cannot check for unfinished work", (Throwable) obj2);
            long jMin = Math.min(30000 * j, eaw.b);
            this.b = null;
            this.c = j;
            this.a = 1;
            if (avkz.y(jMin, this) == awoxVar) {
                return awoxVar;
            }
        }
        return Boolean.TRUE;
    }
}
