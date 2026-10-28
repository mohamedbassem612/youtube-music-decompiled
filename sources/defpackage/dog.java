package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dog extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ dmq b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ awqg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dog(awoq awoqVar, dmq dmqVar, boolean z, boolean z2, awqg awqgVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = dmqVar;
        this.c = z;
        this.d = z2;
        this.e = awqgVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return this.$cid != 0 ? new dog(this.b, this.d, this.c, this.e, awoqVar, 1) : new dog(awoqVar, this.b, this.c, this.d, this.e, 0);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((dog) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((dog) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
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
            dmq dmqVar = this.b;
            doi doiVar = new doi(!(dmqVar.q() && dmqVar.r()) && this.d, this.c, dmqVar, null, this.e, 1, null);
            this.a = 1;
            Object objV = dmqVar.v(doiVar, this);
            if (objV != awoxVar) {
                return objV;
            }
        } else {
            awoxVar = awox.a;
            int i2 = this.a;
            atqp.j(obj);
            if (i2 != 0) {
                return obj;
            }
            dmq dmqVar2 = this.b;
            doi doiVar2 = new doi(this.d, this.c, dmqVar2, null, this.e, 0);
            this.a = 1;
            Object objV2 = dmqVar2.v(doiVar2, this);
            if (objV2 != awoxVar) {
                return objV2;
            }
        }
        return awoxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dog(dmq dmqVar, boolean z, boolean z2, awqg awqgVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = dmqVar;
        this.d = z;
        this.c = z2;
        this.e = awqgVar;
    }
}
