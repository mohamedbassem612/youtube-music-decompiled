package defpackage;

import android.os.Bundle;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acrj implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acrj(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [aclq, java.lang.Object] */
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
        switch (this.$cid) {
            case 0:
                ((Bundle) this.a).putByteArray("ReelSequenceController.LATEST_TRACKING_PARAMS_KEY", ((aigj) obj).G());
                break;
            case 1:
                ?? r4 = ((aciz) obj).a;
                boolean z = ((acqk) r4).c;
                Object obj2 = this.a;
                if (!z) {
                    ((acqz) obj2).g.c(32, "reelAdsClientDelegate.onPageExit called but onPageEnter was never called.");
                }
                ((acqz) obj2).a.f(r4, 4);
                break;
            case 2:
                ((wkf) this.a).n((aigj) obj);
                break;
            case 3:
                ((acuv) this.a).e = (alqg) obj;
                break;
            case 4:
                awli awliVar = ((ilx) obj).a;
                Object obj3 = this.a;
                ((actw) obj3).c.c(awliVar.af(new acte(obj3, 9)));
                break;
            case 5:
                ((acwq) obj).d((acwv) this.a);
                break;
            case 6:
                ((nrt) this.a).a.e("sectionListController", obj);
                break;
            case 7:
                ((adyw) this.a).K = ((Integer) obj).intValue();
                break;
            case 8:
                ((adyw) this.a).J = (assl) obj;
                break;
            default:
                ((ntg) this.a).s((mpt) obj);
                break;
        }
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
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
