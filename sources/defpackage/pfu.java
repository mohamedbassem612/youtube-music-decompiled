package defpackage;

import com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pfu implements pfl {
    public static final agsn a = agsn.h("GnpSdk");
    public final ChimePerAccountRoomDatabase b;
    public final mbc c;
    private final awou d;

    public pfu(ChimePerAccountRoomDatabase chimePerAccountRoomDatabase, awou awouVar, mbc mbcVar) {
        this.b = chimePerAccountRoomDatabase;
        this.d = awouVar;
        this.c = mbcVar;
    }

    @Override // defpackage.pfl
    public final Object a(List list, awoq awoqVar) {
        return awro.p(this.d, new pvn(this, list, (awoq) null, 1), awoqVar);
    }

    @Override // defpackage.pfl
    public final Object b(pgc pgcVar, awoq awoqVar) {
        return awro.p(this.d, new pvl(this, pgcVar, (awoq) null, 1), awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pfl
    public final Object c(long j, awoq awoqVar) throws Throwable {
        pfs pfsVar;
        if (awoqVar instanceof pfs) {
            pfsVar = (pfs) awoqVar;
            int i = pfsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pfsVar.c = i - Integer.MIN_VALUE;
            } else {
                pfsVar = new pfs(this, awoqVar);
            }
        } else {
            pfsVar = new pfs(this, awoqVar);
        }
        Object obj = pfsVar.a;
        awox awoxVar = awox.a;
        int i2 = pfsVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            awou awouVar = this.d;
            pft pftVar = new pft(this, j, null);
            pfsVar.c = 1;
            if (awro.p(awouVar, pftVar, pfsVar) == awoxVar) {
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
}
