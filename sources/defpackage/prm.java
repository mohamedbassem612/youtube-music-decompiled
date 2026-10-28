package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class prm extends awpk implements awqk {
    /* synthetic */ Object a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ long d;
    final /* synthetic */ boolean e;
    final /* synthetic */ pqo f;
    final /* synthetic */ String g;
    final /* synthetic */ String h;
    final /* synthetic */ omm i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prm(int i, String str, long j, boolean z, pqo pqoVar, omm ommVar, String str2, String str3, awoq awoqVar) {
        super(2, awoqVar);
        this.b = i;
        this.c = str;
        this.d = j;
        this.e = z;
        this.f = pqoVar;
        this.i = ommVar;
        this.g = str2;
        this.h = str3;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        prm prmVar = new prm(this.b, this.c, this.d, this.e, this.f, this.i, this.g, this.h, awoqVar);
        prmVar.a = obj;
        return prmVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((prm) create((pym) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        aihf builder = ((pym) this.a).toBuilder();
        builder.getClass();
        qnl.O(this.b, builder);
        qnl.M(this.c, builder);
        qnl.P(this.d, builder);
        qnl.K(this.e, builder);
        pqo pqoVar = this.f;
        if (pqoVar != pqo.UNKNOWN) {
            pqk pqkVar = pqk.CHIME;
            int iOrdinal = pqoVar.ordinal();
            int i = 3;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    i = 4;
                } else if (iOrdinal != 3) {
                    i = iOrdinal != 4 ? 2 : 6;
                } else {
                    i = 5;
                }
            }
            qnl.Q(i, builder);
        }
        String str = this.g;
        if (str != null) {
            qnl.N(str, builder);
        }
        String str2 = this.h;
        if (str2 != null) {
            qnl.L(str2, builder);
        }
        return qnl.H(builder);
    }
}
