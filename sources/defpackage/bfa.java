package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bfa extends awpk implements awqg {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ bfp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfa(bfp bfpVar, awoq awoqVar, int i) {
        super(1, awoqVar);
        this.$cid = i;
        this.b = bfpVar;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return this.$cid != 0 ? new bfa(this.b, awoqVar, 1, null) : new bfa(this.b, awoqVar, 0);
    }

    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.$cid != 0) {
            return ((bfa) create((awoq) obj)).invokeSuspend(awmy.a);
        }
        return ((bfa) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar;
        if (this.$cid != 0) {
            awoxVar = awox.a;
            int i = this.a;
            atqp.j(obj);
            if (i != 0) {
                return obj;
            }
            ayq ayqVarN = this.b.n();
            this.a = 1;
            Object objH = ayqVarN.h();
            if (objH != awoxVar) {
                return objH;
            }
        } else {
            awoxVar = awox.a;
            int i2 = this.a;
            atqp.j(obj);
            if (i2 != 0) {
                return obj;
            }
            bfy bfyVarJ = this.b.j();
            this.a = 1;
            Object objB = bfyVarJ.b(new bgm(null), this);
            if (objB != awoxVar) {
                return objB;
            }
        }
        return awoxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfa(bfp bfpVar, awoq awoqVar, int i, byte[] bArr) {
        super(1, awoqVar);
        this.$cid = i;
        this.b = bfpVar;
    }
}
