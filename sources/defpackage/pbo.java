package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbo extends awpk implements awqk {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbo(awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return this.$cid != 0 ? new pbo(awoqVar, 1, null) : new pbo(awoqVar, 0);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return new pbo((awoq) obj2, 1, null).invokeSuspend(awmy.a);
        }
        return new pbo((awoq) obj2, 0).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.$cid != 0) {
            atqp.j(obj);
            return Choreographer.getInstance();
        }
        atqp.j(obj);
        aihf aihfVarCreateBuilder = pbu.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        return nvl.a(aihfVarCreateBuilder);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbo(awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
    }
}
