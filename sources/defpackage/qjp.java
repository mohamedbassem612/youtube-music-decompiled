package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qjp implements qjq {
    private final /* synthetic */ int $cid;

    public qjp(int i) {
        this.$cid = i;
    }

    @Override // defpackage.qjq
    public final /* synthetic */ String a(aiir aiirVar) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? ((axgx) ((aihh) aiirVar).instance).c : ((axhz) ((aihf) aiirVar).instance).e;
        }
        return ((axfv) ((aihf) aiirVar).instance).f;
    }

    @Override // defpackage.qjq
    public final /* synthetic */ String b(aiir aiirVar) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? ((axgx) ((aihh) aiirVar).instance).e : ((axhz) ((aihf) aiirVar).instance).d;
        }
        return ((axfv) ((aihf) aiirVar).instance).e;
    }

    @Override // defpackage.qjq
    public final /* synthetic */ void c(aiir aiirVar, Long l) {
        int i = this.$cid;
        if (i == 0) {
            if (l == null) {
                aihf aihfVar = (aihf) aiirVar;
                aihfVar.copyOnWrite();
                axfv axfvVar = (axfv) aihfVar.instance;
                axfv axfvVar2 = axfv.a;
                axfvVar.b &= -3;
                axfvVar.d = 0L;
                return;
            }
            long jLongValue = l.longValue();
            aihf aihfVar2 = (aihf) aiirVar;
            aihfVar2.copyOnWrite();
            axfv axfvVar3 = (axfv) aihfVar2.instance;
            axfv axfvVar4 = axfv.a;
            axfvVar3.b |= 2;
            axfvVar3.d = jLongValue;
            return;
        }
        if (i != 1) {
            aihh aihhVar = (aihh) aiirVar;
            if (l == null) {
                aihhVar.copyOnWrite();
                axgx axgxVar = (axgx) aihhVar.instance;
                axgx axgxVar2 = axgx.a;
                axgxVar.b &= -3;
                axgxVar.d = 0L;
                return;
            }
            long jLongValue2 = l.longValue();
            aihhVar.copyOnWrite();
            axgx axgxVar3 = (axgx) aihhVar.instance;
            axgx axgxVar4 = axgx.a;
            axgxVar3.b |= 2;
            axgxVar3.d = jLongValue2;
            return;
        }
        if (l == null) {
            aihf aihfVar3 = (aihf) aiirVar;
            aihfVar3.copyOnWrite();
            axhz axhzVar = (axhz) aihfVar3.instance;
            axhz axhzVar2 = axhz.a;
            axhzVar.b &= -2;
            axhzVar.c = 0L;
            return;
        }
        long jLongValue3 = l.longValue();
        aihf aihfVar4 = (aihf) aiirVar;
        aihfVar4.copyOnWrite();
        axhz axhzVar3 = (axhz) aihfVar4.instance;
        axhz axhzVar4 = axhz.a;
        axhzVar3.b |= 1;
        axhzVar3.c = jLongValue3;
    }

    @Override // defpackage.qjq
    public final /* synthetic */ void d(aiir aiirVar) {
        int i = this.$cid;
        if (i == 0) {
            aihf aihfVar = (aihf) aiirVar;
            aihfVar.copyOnWrite();
            axfv axfvVar = (axfv) aihfVar.instance;
            axfv axfvVar2 = axfv.a;
            axfvVar.b &= -5;
            axfvVar.e = axfv.a.e;
            return;
        }
        if (i != 1) {
            aihh aihhVar = (aihh) aiirVar;
            aihhVar.copyOnWrite();
            axgx axgxVar = (axgx) aihhVar.instance;
            axgx axgxVar2 = axgx.a;
            axgxVar.b &= -5;
            axgxVar.e = axgx.a.e;
            return;
        }
        aihf aihfVar2 = (aihf) aiirVar;
        aihfVar2.copyOnWrite();
        axhz axhzVar = (axhz) aihfVar2.instance;
        axhz axhzVar2 = axhz.a;
        axhzVar.b &= -3;
        axhzVar.d = axhz.a.d;
    }
}
