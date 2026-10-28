package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pij extends awpk implements awqg {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pij(pit pitVar, pig pigVar, String str, int i, int i2, awoq awoqVar, int i3) {
        super(1, awoqVar);
        this.$cid = i3;
        this.f = pitVar;
        this.e = pigVar;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        pij pijVar;
        int i = this.$cid;
        if (i == 0) {
            Object obj = this.e;
            pit pitVar = (pit) obj;
            pijVar = new pij(pitVar, (plx) this.f, this.b, this.c, this.d, awoqVar, 0);
        } else {
            if (i != 1) {
                Object obj2 = this.e;
                return new pij((pit) obj2, (plx) this.f, this.b, this.c, this.d, awoqVar, 2, null);
            }
            Object obj3 = this.f;
            pit pitVar2 = (pit) obj3;
            pijVar = new pij(pitVar2, (pig) this.e, this.b, this.c, this.d, awoqVar, 1);
        }
        return pijVar;
    }

    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ((pij) create((awoq) obj)).invokeSuspend(awmy.a);
        }
        if (i != 1) {
            return ((pij) create((awoq) obj)).invokeSuspend(awmy.a);
        }
        return ((pij) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar;
        int i = this.$cid;
        if (i == 0) {
            awoxVar = awox.a;
            int i2 = this.a;
            atqp.j(obj);
            if (i2 != 0) {
                return obj;
            }
            pxd pxdVar = (pxd) ((pit) this.e).d.io();
            String str = this.b;
            this.a = 1;
            Object objB = pxdVar.b(str, this);
            if (objB != awoxVar) {
                return objB;
            }
        } else {
            if (i != 1) {
                awox awoxVar2 = awox.a;
                int i3 = this.a;
                atqp.j(obj);
                if (i3 != 0) {
                    return obj;
                }
                pxe pxeVar = (pxe) ((pit) this.e).c.io();
                Object obj2 = this.f;
                String str2 = obj2 != null ? ((plx) obj2).b : null;
                String str3 = this.b;
                int i4 = this.c;
                int i5 = this.d;
                this.a = 1;
                Object objA = pxeVar.a(str2, str3, i4, i5, this);
                return objA == awoxVar2 ? awoxVar2 : objA;
            }
            awoxVar = awox.a;
            int i6 = this.a;
            atqp.j(obj);
            if (i6 != 0) {
                return obj;
            }
            pxd pxdVar2 = (pxd) ((pit) this.f).d.io();
            String str4 = this.b;
            this.a = 1;
            Object objB2 = pxdVar2.b(str4, this);
            if (objB2 != awoxVar) {
                return objB2;
            }
        }
        return awoxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pij(pit pitVar, plx plxVar, String str, int i, int i2, awoq awoqVar, int i3) {
        super(1, awoqVar);
        this.$cid = i3;
        this.e = pitVar;
        this.f = plxVar;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pij(pit pitVar, plx plxVar, String str, int i, int i2, awoq awoqVar, int i3, byte[] bArr) {
        super(1, awoqVar);
        this.$cid = i3;
        this.e = pitVar;
        this.f = plxVar;
        this.b = str;
        this.c = i;
        this.d = i2;
    }
}
