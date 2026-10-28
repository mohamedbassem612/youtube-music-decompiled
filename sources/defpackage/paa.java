package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class paa implements qbh {
    private final pgs a;
    private final awou b;
    private final String c;

    static {
        agsn.h("GnpSdk");
    }

    public paa(pgs pgsVar, awou awouVar) {
        pgsVar.getClass();
        awouVar.getClass();
        this.a = pgsVar;
        this.b = awouVar;
        this.c = "restart_job_handler_key";
    }

    @Override // defpackage.qbh
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // defpackage.qbh
    public final pky b(Bundle bundle) {
        return (pky) awqx.l(this.b, new gmc(this, bundle, (awoq) null, 9));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.qbh
    public final Object c(Bundle bundle, awoq awoqVar) throws Throwable {
        ozz ozzVar;
        Object next;
        if (awoqVar instanceof ozz) {
            ozzVar = (ozz) awoqVar;
            int i = ozzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ozzVar.c = i - Integer.MIN_VALUE;
            } else {
                ozzVar = new ozz(this, awoqVar);
            }
        } else {
            ozzVar = new ozz(this, awoqVar);
        }
        Object obj = ozzVar.a;
        awox awoxVar = awox.a;
        int i2 = ozzVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            String string = bundle.getString("EXTRA_REFRESH_REASON_KEY");
            awnb awnbVar = new awnb((awne) phb.f);
            do {
                if (!awnbVar.hasNext()) {
                    next = null;
                    break;
                }
                next = awnbVar.next();
            } while (!awrc.c(((phb) next).name(), string));
            phb phbVar = (phb) next;
            if (phbVar == null) {
                phbVar = phb.a;
            }
            pgs pgsVar = this.a;
            plb plbVarC = plb.c();
            ozzVar.c = 1;
            if (pgsVar.b(plbVarC, phbVar, ozzVar) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return new pla(awmy.a);
    }

    @Override // defpackage.qbh
    public final String d() {
        return this.c;
    }

    @Override // defpackage.qbh
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.qbh
    public final /* synthetic */ int f() {
        return 3;
    }
}
