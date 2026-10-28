package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yag implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yag(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:252:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0168  */
    /* JADX WARN: Code duplicated, block: B:63:0x016c  */
    /* JADX WARN: Code duplicated, block: B:64:0x016f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v58, types: [android.view.SurfaceHolder$Callback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v25, types: [android.view.SurfaceHolder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v29, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r15v34, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.view.SurfaceHolder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v19 aopy, still in use, count: 2, list:
          (r10v19 aopy) from 0x0130: IGET (r10v19 aopy) A[WRAPPED] (LINE:305) aopy.e java.lang.String
          (r10v19 aopy) from 0x0146: PHI (r10 I:??) = (r10v16 aopy), (r10v19 aopy) binds: [B:57:0x0145, B:257:0x0146] A[DONT_GENERATE, DONT_INLINE]
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
            Method dump skipped, instruction units count: 1498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.run():void");
    }

    public /* synthetic */ yag(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ yag(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ yag(Object obj, Object obj2, Object obj3, int i, int[] iArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ yag(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ yag(yar yarVar, xvn xvnVar, Uri uri, int i) {
        this.$cid = i;
        this.c = yarVar;
        this.a = xvnVar;
        this.b = uri;
    }

    public yag(zxt zxtVar, Object obj, sxu sxuVar, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = sxuVar;
        this.a = zxtVar;
    }
}
