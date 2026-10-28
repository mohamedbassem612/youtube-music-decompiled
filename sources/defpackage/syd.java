package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class syd implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ syd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x020c  */
    /* JADX WARN: Type inference failed for: r15v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r15v28, types: [avmn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v8, types: [avls, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v14 java.lang.Object, still in use, count: 2, list:
          (r5v14 java.lang.Object) from 0x004a: PHI (r5 I:??) = (r5v11 java.lang.Object), (r5v14 java.lang.Object) binds: [B:14:0x0049, B:125:0x004a] A[DONT_GENERATE, DONT_INLINE]
          (r5v14 java.lang.Object) from 0x003a: CHECK_CAST (tgt) (r5v14 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instruction units count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.syd.run():void");
    }

    public syd(xfn xfnVar, int i) {
        this.$cid = i;
        this.a = xfnVar;
    }
}
