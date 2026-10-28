package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class okn implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ okn(Object obj, aihn aihnVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = aihnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r7v57, types: [ahcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v81, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, java.util.concurrent.Future] */
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
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        int i = 5;
        int i2 = 3;
        int i3 = 2;
        switch (this.$cid) {
            case 0:
                aihf builder = ((aihn) this.b).toBuilder();
                builder.copyOnWrite();
                oiw oiwVar = (oiw) builder.instance;
                oiwVar.b |= 8;
                oiwVar.f = false;
                return ((xgg) this.a).m.l((oiw) builder.build(), (oip) obj);
            case 1:
                onb.d("%s: Encountered SharedFileMissingException for group: %s", "FileGroupManager", ((oip) this.b).d);
                return ahng.n(oiv.NONE);
            case 2:
                oip oipVar = (oip) this.b;
                onb.j((oig) obj, "%s: Unable to correct isolated structure, returning null instead of group %s", "FileGroupManager", oipVar.d);
                ((ong) ((xgg) this.a).d).n(xgg.x(oipVar), 5);
                return aher.a;
            case 3:
                ((ong) ((xgg) this.a).d).n(xgg.x((oip) this.b), 4);
                return aher.a;
            case 4:
                if (((oip) obj) == null) {
                    return aher.a;
                }
                Object obj2 = this.b;
                Object obj3 = this.a;
                oiw oiwVar2 = (oiw) obj2;
                String str = oiwVar2.c;
                String str2 = oiwVar2.d;
                int i4 = onb.a;
                xgg xggVar = (xgg) obj3;
                ((ong) xggVar.d).j(1049);
                return xggVar.s(xggVar.m.i(oiwVar2), new ods(obj3, i));
            case 5:
                oip oipVar2 = (oip) ahng.v(this.a);
                if (oipVar2 == null) {
                    return aher.a;
                }
                Object obj4 = this.b;
                ahai ahaiVarX = xgg.x(oipVar2);
                oio oioVar = oipVar2.c;
                if (oioVar == null) {
                    oioVar = oio.a;
                }
                ((ong) ((xgg) obj4).d).h(ahaiVarX, oioVar.g);
                agke.q(oipVar2);
                return aher.a;
            case 6:
                oip oipVar3 = (oip) obj;
                if (oipVar3 != null) {
                    ((AtomicReference) this.a).set(oipVar3);
                    return ahng.n(oipVar3);
                }
                Object obj5 = this.b;
                acb acbVarA = oig.a();
                acbVarA.b = oif.GROUP_NOT_FOUND_ERROR;
                acbVarA.c = "Nothing to download for file group: ".concat(String.valueOf(((oiw) obj5).c));
                return ahng.m(acbVarA.a());
            case 7:
                oip oipVar4 = (oip) this.b;
                return nsp.i(oipVar4) ? ((xgg) this.a).f(oipVar4) : aher.a;
            case 8:
                Object obj6 = this.a;
                xgg xggVar2 = (xgg) obj6;
                return xggVar2.r(xggVar2.m.i((oiw) this.b), new kjh(obj6, (agev) obj, i2, null));
            case 9:
                if (((Boolean) obj).booleanValue()) {
                    acb acbVarA2 = oig.a();
                    oif oifVar = oif.CUSTOM_FILEGROUP_VALIDATION_FAILED;
                    acbVarA2.b = oifVar;
                    acbVarA2.c = oifVar.name();
                    return ahng.m(acbVarA2.a());
                }
                Object obj7 = this.b;
                Object obj8 = this.a;
                oiw oiwVar3 = (oiw) obj7;
                onb.e("%s: Failed to remove pending version for group: '%s'; account: '%s'", "FileGroupManager", oiwVar3.c, oiwVar3.e);
                ((ong) ((xgg) obj8).d).j(1036);
                return ahng.m(new IOException("Failed to remove pending group: ".concat(String.valueOf(oiwVar3.c))));
            case 10:
                oip oipVar5 = (oip) obj;
                return oipVar5 != null ? this.a.a(new omh((oiw) this.b, oipVar5)) : aher.a;
            case 11:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj9 = this.b;
                Object obj10 = this.a;
                if (zBooleanValue) {
                    ((ong) ((xgg) obj10).d).n(xgg.x((oip) obj9), 3);
                    return aher.a;
                }
                ooi ooiVarD = ooi.d(((xgg) obj10).f((oip) obj9));
                aihn aihnVar = (aihn) obj9;
                return ooiVarD.c(oig.class, new okn(obj10, aihnVar, i3), MoreExecutors.directExecutor()).f(new okn(obj10, aihnVar, i2), MoreExecutors.directExecutor());
            case 12:
                return ((olc) this.b).o((onu) this.a, (onu) obj, 1087);
            case 13:
                Object obj11 = this.b;
                olc olcVar = (olc) obj11;
                return ahno.as(olcVar.n(olcVar.a.c()), new okx(obj11, (onu) obj, this.a, i3), olcVar.b);
            case 14:
                return ((olc) this.b).o((onu) this.a, (onu) obj, 1094);
            case 15:
                return ((olc) this.b).o((onu) this.a, (onu) obj, 1098);
            case 16:
                return ((olc) this.b).o((onu) this.a, (onu) obj, 1096);
            case 17:
                Object obj12 = this.b;
                olc olcVar2 = (olc) obj12;
                return ahno.as(olcVar2.n(olcVar2.a.m(this.a)), new okn(obj12, (onu) obj, 20), olcVar2.b);
            case 18:
                return ((olc) this.b).o((onu) this.a, (onu) obj, 1095);
            case 19:
                return ((olc) this.b).o((onu) this.a, (onu) obj, 1088);
            default:
                return ((olc) this.b).o((onu) this.a, (onu) obj, 1097);
        }
    }

    public /* synthetic */ okn(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
