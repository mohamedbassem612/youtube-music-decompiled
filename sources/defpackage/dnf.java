package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnf extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnf(aesp aespVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = aespVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            dnf dnfVar = new dnf((dnl) this.b, awoqVar, 0);
            dnfVar.c = obj;
            return dnfVar;
        }
        if (i == 1) {
            dnf dnfVar2 = new dnf((bfp) this.b, awoqVar, 1);
            dnfVar2.c = obj;
            return dnfVar2;
        }
        if (i == 2) {
            dnf dnfVar3 = new dnf((dnl) this.b, awoqVar, 2, null);
            dnfVar3.c = obj;
            return dnfVar3;
        }
        Object obj2 = this.b;
        if (i != 3) {
            dnf dnfVar4 = new dnf((aesp) obj2, awoqVar, 4);
            dnfVar4.c = obj;
            return dnfVar4;
        }
        dnf dnfVar5 = new dnf((ecv) obj2, awoqVar, 3);
        dnfVar5.c = obj;
        return dnfVar5;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((dnf) create((dnq) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 1) {
            return ((dnf) create((axfd) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 2) {
            return ((dnf) create((dnv) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 3) {
            return ((dnf) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((dnf) create((awyp) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r1.l(r11) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
    
        if (defpackage.awqx.z(r0, r6, r11) != r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
    
        if (r12 != r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013b, code lost:
    
        if (((defpackage.bfp) r12).o(r0, r11) == r3) goto L61;
     */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnf(bfp bfpVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = bfpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnf(dnl dnlVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = dnlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnf(dnl dnlVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = dnlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnf(ecv ecvVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ecvVar;
    }
}
