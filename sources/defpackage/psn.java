package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class psn extends awpk implements awql {
    private final /* synthetic */ int $cid;
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psn(awoq awoqVar, int i) {
        super(3, awoqVar);
        this.$cid = i;
    }

    @Override // defpackage.awql
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.$cid != 0) {
            psn psnVar = new psn((awoq) obj3, 1, null);
            psnVar.a = (eol) obj;
            psnVar.b = (bhj) obj2;
            return psnVar.invokeSuspend(awmy.a);
        }
        psn psnVar2 = new psn((awoq) obj3, 0);
        psnVar2.a = (eol) obj;
        psnVar2.b = (pym) obj2;
        return psnVar2.invokeSuspend(awmy.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x025b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0260  */
    /* JADX WARN: Code duplicated, block: B:106:0x0265  */
    /* JADX WARN: Code duplicated, block: B:110:0x0273  */
    /* JADX WARN: Code duplicated, block: B:113:0x027a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0282  */
    /* JADX WARN: Code duplicated, block: B:116:0x0284  */
    /* JADX WARN: Code duplicated, block: B:118:0x028c  */
    /* JADX WARN: Code duplicated, block: B:119:0x028e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0296  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:174:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0227  */
    /* JADX WARN: Code duplicated, block: B:94:0x0233  */
    /* JADX WARN: Code duplicated, block: B:98:0x0248  */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0277, code lost:
    
        if (r0.equals("UNRECOGNIZED") != false) goto L122;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v7, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psn(awoq awoqVar, int i, byte[] bArr) {
        super(3, awoqVar);
        this.$cid = i;
    }
}
