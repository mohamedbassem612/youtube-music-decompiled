package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aear implements advb {
    private final /* synthetic */ int $cid;
    private final awmd a;
    private final awmd b;
    private final admh c = new adlg();

    public aear(awmd awmdVar, awmd awmdVar2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = awmdVar;
        this.a = awmdVar2;
    }

    private static void c(admh admhVar, Class cls, awmd awmdVar) {
        admhVar.d(cls, new admj(awmdVar));
    }

    @Override // defpackage.advb
    public final void b(Class cls) {
        if (this.$cid != 0) {
            if (amqm.class.isAssignableFrom(cls)) {
                admh admhVar = this.c;
                c(admhVar, ampd.class, this.b);
                c(admhVar, acxm.class, this.a);
                return;
            }
            return;
        }
        if (aeam.class.isAssignableFrom(cls)) {
            admh admhVar2 = this.c;
            admhVar2.d(aktk.class, new admj(this.a));
            admhVar2.d(akto.class, new admj(this.b));
        }
    }

    @Override // defpackage.agfr
    public final /* synthetic */ Object io() {
        return this.c;
    }

    public aear(awmd awmdVar, awmd awmdVar2, int i) {
        this.$cid = i;
        this.a = awmdVar;
        this.b = awmdVar2;
    }
}
