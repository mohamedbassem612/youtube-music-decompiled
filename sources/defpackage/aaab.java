package defpackage;

import android.os.Bundle;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aaab implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aaab(abqq abqqVar, int i, Bundle bundle, int i2) {
        this.$cid = i2;
        this.b = abqqVar;
        this.a = i;
        this.c = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10, types: [aclq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, xgn] */
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
    public final void r(Object obj) {
        int i;
        int i2 = this.$cid;
        if (i2 != 0) {
            if (i2 == 1) {
                ((agkh) this.c).e((String) this.b.get(this.a), (ansx) ((weh) obj));
                return;
            }
            ?? r5 = ((aciz) obj).a;
            apfp apfpVarAa = aecm.aa(((acqk) r5).a);
            if (apfpVarAa != null) {
                if (!((String) this.b).equals(apfpVarAa.o)) {
                    return;
                }
            }
            ((acqz) this.c).a.h(r5, this.a);
            return;
        }
        ajcs ajcsVar = (ajcs) obj;
        amud amudVar = ajcsVar.m;
        if (amudVar == null) {
            amudVar = amud.b;
        }
        if ((amudVar.c & 1) != 0) {
            Object obj2 = this.b;
            xgt xgtVarB = aabp.b((Bundle) this.c);
            Object obj3 = ((abqq) obj2).i;
            if (xgtVarB == null) {
                ((ahgb) obj3).e();
                return;
            }
            int i3 = this.a - 1;
            if (i3 == 1) {
                i = 262023;
            } else if (i3 != 2) {
                return;
            } else {
                i = 262024;
            }
            xgj xgjVar = new xgj(xhb.b(i));
            amud amudVar2 = ajcsVar.m;
            if (amudVar2 == null) {
                amudVar2 = amud.b;
            }
            xgj xgjVar2 = new xgj(amudVar2.d, (amud) null);
            ?? r6 = ((ahgb) obj3).b;
            r6.C(xgtVarB);
            r6.m(xgjVar, xgjVar2);
            r6.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgjVar, null);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ aaab(Object obj, Object obj2, int i, int i2) {
        this.$cid = i2;
        this.c = obj;
        this.b = obj2;
        this.a = i;
    }
}
