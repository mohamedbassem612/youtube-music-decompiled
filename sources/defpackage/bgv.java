package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgv extends awpk implements awqk {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgv(awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return this.$cid != 0 ? new bgv(awoqVar, 1, null) : new bgv(awoqVar, 0);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid == 0) {
            return new bgv((awoq) obj2, 0).invokeSuspend(awmy.a);
        }
        return new bgv((awoq) obj2, 1, null).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.$cid != 0) {
            atqp.j(obj);
            return awmy.a;
        }
        atqp.j(obj);
        return Boolean.TRUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgv(awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
    }
}
