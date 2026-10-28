package defpackage;

import app.rive.core.CommandQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yby extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yby(adrf adrfVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = adrfVar;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [avlu, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            yby ybyVar = new yby((ycd) this.c, awoqVar, 0);
            ybyVar.b = obj;
            return ybyVar;
        }
        if (i == 1) {
            yby ybyVar2 = new yby((tir) this.c, awoqVar, 1);
            ybyVar2.b = obj;
            return ybyVar2;
        }
        if (i == 2) {
            yby ybyVar3 = new yby((ycd) this.c, awoqVar, 2, null);
            ybyVar3.b = obj;
            return ybyVar3;
        }
        if (i != 3) {
            yby ybyVar4 = new yby((avlu) this.c, awoqVar, 4);
            ybyVar4.b = obj;
            return ybyVar4;
        }
        yby ybyVar5 = new yby((adrf) this.c, awoqVar, 3);
        ybyVar5.b = obj;
        return ybyVar5;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((yby) create((ybt) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 1) {
            return ((yby) create((tns) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 2) {
            return ((yby) create((ybq) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 3) {
            return ((yby) create((awyp) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((yby) create((CommandQueue) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (defpackage.awqx.z(r12, r2, r11) != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (defpackage.adpi.a(((defpackage.adrf) r1).j, r12, r11) != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        if (r12.collect(r1, r11) != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0135, code lost:
    
        if (r12.collect(r1, r11) == r0) goto L53;
     */
    /* JADX WARN: Type inference failed for: r5v15, types: [avlu, java.lang.Object] */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yby.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yby(avlu avluVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = avluVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yby(tir tirVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = tirVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yby(ycd ycdVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = ycdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yby(ycd ycdVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = ycdVar;
    }
}
