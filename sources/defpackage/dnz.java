package defpackage;

import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnz extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(CoroutineWorker coroutineWorker, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = coroutineWorker;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awuj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v34, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        switch (this.$cid) {
            case 0:
                return new dnz((awuj) this.b, awoqVar, 0);
            case 1:
                return new dnz((dlq) this.b, awoqVar, 1);
            case 2:
                return new dnz((CoroutineWorker) this.b, awoqVar, 2);
            case 3:
                return new dnz((CoroutineWorker) this.b, awoqVar, 3, (byte[]) null);
            case 4:
                return new dnz((ConstraintTrackingWorker) this.b, awoqVar, 4);
            case 5:
                return new dnz((goy) this.b, awoqVar, 5);
            case 6:
                return new dnz((awqg) this.b, awoqVar, 6);
            case 7:
                return new dnz((pmz) this.b, awoqVar, 7);
            case 8:
                return new dnz((pow) this.b, awoqVar, 8);
            case 9:
                return new dnz((ppv) this.b, awoqVar, 9);
            case 10:
                return new dnz((pqu) this.b, awoqVar, 10);
            case 11:
                return new dnz((pqu) this.b, awoqVar, 11, (byte[]) null);
            case 12:
                return new dnz((omm) this.b, awoqVar, 12);
            case 13:
                return new dnz((tld) this.b, awoqVar, 13);
            case 14:
                return new dnz((tkd) this.b, awoqVar, 14);
            case 15:
                return new dnz((tko) this.b, awoqVar, 15);
            case 16:
                return new dnz((tko) this.b, awoqVar, 16, (byte[]) null);
            case 17:
                return new dnz((ListenableFuture) this.b, awoqVar, 17);
            case 18:
                return new dnz((ListenableFuture) this.b, awoqVar, 18, (byte[]) null);
            case 19:
                return new dnz((xpl) this.b, awoqVar, 19);
            default:
                return new dnz((xnx) this.b, awoqVar, 20);
        }
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.$cid) {
            case 0:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 1:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 2:
                awoq awoqVarCreate = create((awut) obj, (awoq) obj2);
                awmy awmyVar = awmy.a;
                ((dnz) awoqVarCreate).invokeSuspend(awmyVar);
                return awmyVar;
            case 3:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 4:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 5:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 6:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 7:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 8:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 9:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 10:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 11:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 12:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 13:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 14:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 15:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 16:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 17:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 18:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 19:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            default:
                return ((dnz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0209, code lost:
    
        if (r8.a(r7) != r0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02c6, code lost:
    
        if (defpackage.avkz.j(r8, r7) == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
    
        if (((defpackage.tkd) r8).g(r7) != r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e6, code lost:
    
        if (r8 != r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012a, code lost:
    
        if (r8.a(r2, r7) != r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cc, code lost:
    
        if (r8 != r0) goto L92;
     */
    /* JADX WARN: Type inference failed for: r8v20, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v73, types: [java.lang.Object, pve] */
    /* JADX WARN: Type inference failed for: r8v86, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v88, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(CoroutineWorker coroutineWorker, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = coroutineWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(ConstraintTrackingWorker constraintTrackingWorker, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = constraintTrackingWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(awqg awqgVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awqgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(awuj awujVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awujVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(ListenableFuture listenableFuture, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = listenableFuture;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(ListenableFuture listenableFuture, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = listenableFuture;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(dlq dlqVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = dlqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(goy goyVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = goyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(omm ommVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ommVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(pmz pmzVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = pmzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(pow powVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = powVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(ppv ppvVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ppvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(pqu pquVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = pquVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(pqu pquVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = pquVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(tkd tkdVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = tkdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(tko tkoVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = tkoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(tko tkoVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = tkoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(tld tldVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = tldVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(xnx xnxVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = xnxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(xpl xplVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = xplVar;
    }
}
