package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hnw implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hnw(adcw adcwVar, AtomicBoolean atomicBoolean, String str, mba mbaVar, int i) {
        this.$cid = i;
        this.d = adcwVar;
        this.c = atomicBoolean;
        this.b = str;
        this.a = mbaVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0173  */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02ee, code lost:
    
        if (r12.a(defpackage.hna.d(r13, r10.c, r6, defpackage.afxw.t(r1)), defpackage.agpi.a, r0) == 0) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v7, types: [aaqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.CharSequence, java.lang.Object] */
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
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hnw.r(java.lang.Object):void");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ hnw(afwv afwvVar, apoq apoqVar, FrameLayout frameLayout, RecyclerView recyclerView, int i) {
        this.$cid = i;
        this.b = afwvVar;
        this.c = apoqVar;
        this.d = frameLayout;
        this.a = recyclerView;
    }

    public /* synthetic */ hnw(hhi hhiVar, Object obj, Object obj2, aihf aihfVar, int i) {
        this.$cid = i;
        this.a = hhiVar;
        this.b = obj;
        this.c = obj2;
        this.d = aihfVar;
    }

    public /* synthetic */ hnw(hnz hnzVar, agkj agkjVar, aaqn aaqnVar, Set set, int i) {
        this.$cid = i;
        this.a = hnzVar;
        this.b = agkjVar;
        this.d = aaqnVar;
        this.c = set;
    }

    public /* synthetic */ hnw(hsn hsnVar, int[] iArr, agkj agkjVar, Set set, int i) {
        this.$cid = i;
        this.a = hsnVar;
        this.c = iArr;
        this.d = agkjVar;
        this.b = set;
    }

    public /* synthetic */ hnw(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$cid = i;
        this.a = obj;
        this.d = obj2;
        this.b = obj3;
        this.c = obj4;
    }

    public /* synthetic */ hnw(xge xgeVar, xgz xgzVar, Object obj, xie xieVar, int i) {
        this.$cid = i;
        this.a = xgeVar;
        this.d = xgzVar;
        this.c = obj;
        this.b = xieVar;
    }

    public /* synthetic */ hnw(zvn zvnVar, zvm zvmVar, String str, Throwable th, int i) {
        this.$cid = i;
        this.d = zvnVar;
        this.a = zvmVar;
        this.b = str;
        this.c = th;
    }
}
