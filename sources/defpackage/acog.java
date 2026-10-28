package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acog implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ acog(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17, types: [aclq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object, nry] */
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
        ajwo ajwoVar;
        amiu amiuVarC;
        int i = this.$cid;
        if (i == 0) {
            long j = ((acra) this.b).b + 1;
            List list = ((acra) obj).o;
            int i2 = (int) j;
            if (i2 >= list.size() || (ajwoVar = ((acra) list.get(i2)).f) == null || aecm.aa(ajwoVar) == null) {
                return;
            }
            ((acoh) this.a).b.v.f(ajwoVar);
            return;
        }
        if (i == 1) {
            ((abmq) this.a).b.put((String) obj, this.b);
            return;
        }
        if (i == 2) {
            if (((aclu) obj).a) {
                Object obj2 = this.a;
                Object obj3 = this.b;
                aazn aaznVar = (aazn) obj2;
                if (aaznVar.b()) {
                    acph acphVar = (acph) obj3;
                    acphVar.a(Optional.empty());
                    acphVar.e();
                    return;
                } else {
                    if (aaznVar.c()) {
                        ((acph) obj3).l.c();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i == 3) {
            ajwo ajwoVar2 = ((acra) ((Optional) this.b).get()).f;
            acqz acqzVar = (acqz) this.a;
            acqzVar.B.a();
            ((acpp) obj).c();
            if (acqzVar.S(ajwoVar2) && acqzVar.E.isPresent() && ((acra) ((aciz) acqzVar.E.get()).b).f.equals(ajwoVar2)) {
                ((acqk) ((aciz) acqzVar.E.get()).a).a();
                acqzVar.a.e(((aciz) acqzVar.E.get()).a);
                return;
            }
            return;
        }
        if (i == 4) {
            Object obj4 = this.b;
            nrt nrtVarD = nrv.d();
            nrtVarD.b((nsl) obj4);
            this.a.a((CommandOuterClass$Command) obj, nrtVarD.a()).D();
            return;
        }
        xje xjeVar = (xje) obj;
        boolean zC = xjeVar.c();
        Object obj5 = this.b;
        if (zC) {
            xii xiiVarG = ((xit) xjeVar.a.io()).g();
            xis xisVar = xis.a;
            xiiVarG.a(269, new xis((String) obj5, false)).k();
        }
        Object obj6 = this.a;
        int i3 = adex.a;
        if (obj6 == null) {
            amiuVarC = adex.c(null, null, null, null);
        } else {
            asnq asnqVar = (asnq) obj6;
            int i4 = asnqVar.b;
            amiuVarC = adex.c((i4 & 1) != 0 ? asnqVar.c : null, (i4 & 2) != 0 ? Boolean.valueOf(asnqVar.d) : null, (asnqVar.b & 4) != 0 ? Boolean.valueOf(asnqVar.e) : null, (asnqVar.b & 8) != 0 ? asnqVar.f : null);
        }
        if (xjeVar.c()) {
            Optional optionalB = ((xit) xjeVar.a.io()).g().b(269, (String) obj5);
            xdd xddVar = new xdd(amiuVarC, 3);
            if (true == optionalB.isPresent()) {
                ((xir) optionalB.get()).h((amiu) xddVar.a);
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.$cid;
        if (i == 0) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        if (i == 1) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        if (i == 2) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        if (i != 3) {
            return i != 4 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ acog(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
