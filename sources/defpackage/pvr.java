package defpackage;

import com.google.android.libraries.notifications.platform.internal.room.GnpPerAccountRoomDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pvr implements pvf {
    public static final agsn a = agsn.h("GnpSdk");
    public final GnpPerAccountRoomDatabase b;
    public final mbc c;
    private final awou d;

    public pvr(GnpPerAccountRoomDatabase gnpPerAccountRoomDatabase, awou awouVar, mbc mbcVar) {
        this.b = gnpPerAccountRoomDatabase;
        this.d = awouVar;
        this.c = mbcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pvf
    public final Object a(long j, awoq awoqVar) throws Throwable {
        pvp pvpVar;
        Exception e;
        pkx pkxVar;
        if (awoqVar instanceof pvp) {
            pvpVar = (pvp) awoqVar;
            int i = pvpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pvpVar.c = i - Integer.MIN_VALUE;
            } else {
                pvpVar = new pvp(this, awoqVar);
            }
        } else {
            pvpVar = new pvp(this, awoqVar);
        }
        Object obj = pvpVar.a;
        awox awoxVar = awox.a;
        int i2 = pvpVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            pkx pkxVar2 = pkx.e;
            try {
                GnpPerAccountRoomDatabase gnpPerAccountRoomDatabase = this.b;
                pvq pvqVar = new pvq(this, j, null);
                pvpVar.d = pkxVar2;
                pvpVar.c = 1;
                if (awro.p(this.d, new gmc(gnpPerAccountRoomDatabase, pvqVar, (awoq) null, 20), pvpVar) == awoxVar) {
                    return awoxVar;
                }
            } catch (Exception e2) {
                e = e2;
                pkxVar = pkxVar2;
                awro.A(pvpVar.getContext());
                new pkv(e, pkxVar);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pkxVar = pvpVar.d;
            try {
                atqp.j(obj);
            } catch (Exception e3) {
                e = e3;
                awro.A(pvpVar.getContext());
                new pkv(e, pkxVar);
            }
        }
        return awmy.a;
    }
}
