package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class olb implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ olb(Object obj, aihn aihnVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = aihnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object, java.util.concurrent.Future] */
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
        int i = 16;
        switch (this.$cid) {
            case 0:
                Object obj2 = this.a;
                olc olcVar = (olc) obj2;
                return ahno.as(olcVar.n(olcVar.a.h((oiw) this.b)), new olb(obj2, (onu) obj, 8), olcVar.b);
            case 1:
                Object obj3 = this.a;
                olc olcVar2 = (olc) obj3;
                return ahno.as(olcVar2.n(olcVar2.a.i((oiw) this.b)), new olb(obj3, (onu) obj, 5), olcVar2.b);
            case 2:
                return ((olc) this.b).o((onu) this.a, (onu) obj, 1099);
            case 3:
                Object obj4 = this.b;
                olc olcVar3 = (olc) obj4;
                return ahno.as(olcVar3.n(olcVar3.a.d()), new okx(obj4, (onu) obj, this.a, 4), olcVar3.b);
            case 4:
                Object obj5 = this.b;
                olc olcVar4 = (olc) obj5;
                return ahno.as(olcVar4.n(olcVar4.a.j(this.a)), new okn(obj5, (onu) obj, 14), olcVar4.b);
            case 5:
                return ((olc) this.b).o((onu) this.a, (onu) obj, 1089);
            case 6:
                Object obj6 = this.a;
                olc olcVar5 = (olc) obj6;
                return ahno.as(olcVar5.n(olcVar5.a.g((oiw) this.b)), new okn(obj6, (onu) obj, 12), olcVar5.b);
            case 7:
                Object obj7 = this.a;
                olc olcVar6 = (olc) obj7;
                return ahno.as(olcVar6.n(olcVar6.a.a((oip) this.b)), new okn(obj7, (onu) obj, i), olcVar6.b);
            case 8:
                return ((olc) this.b).o((onu) this.a, (onu) obj, 1090);
            case 9:
                return ((ole) this.b).i((onu) this.a, (onu) obj, 1101);
            case 10:
                return ((ole) this.b).i((onu) this.a, (onu) obj, 1102);
            case 11:
                Object obj8 = this.a;
                ole oleVar = (ole) obj8;
                return ahno.as(oleVar.b(oleVar.b.e((oiz) this.b)), new olb(obj8, (onu) obj, i), oleVar.c);
            case 12:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    Object obj9 = this.b;
                    if (!it.hasNext()) {
                        ole oleVar2 = (ole) obj9;
                        return qnl.aJ(arrayList).O(new ojj(oleVar2, list, arrayList, (Boolean) this.a, 4), oleVar2.c);
                    }
                    arrayList.add(((ole) obj9).a.e((oiz) it.next()));
                }
                break;
            case 13:
                Object obj10 = this.b;
                ole oleVar3 = (ole) obj10;
                return ahno.as(oleVar3.b(oleVar3.b.f((agkz) this.a)), new olb(obj10, (onu) obj, 18), oleVar3.c);
            case 14:
                return ((ole) this.b).i((onu) this.a, (onu) obj, 1104);
            case 15:
                Object obj11 = this.a;
                ole oleVar4 = (ole) obj11;
                return ahno.as(oleVar4.b(oleVar4.b.g((oiz) this.b)), new olb(obj11, (onu) obj, 10), oleVar4.c);
            case 16:
                return ((ole) this.b).i((onu) this.a, (onu) obj, 1100);
            case 17:
                Object obj12 = this.b;
                ole oleVar5 = (ole) obj12;
                return ahno.as(oleVar5.b(oleVar5.b.c()), new okx(obj12, (onu) obj, this.a, 6), oleVar5.c);
            case 18:
                return ((ole) this.b).i((onu) this.a, (onu) obj, 1100);
            case 19:
                if (((okz) obj) == okz.b) {
                    ?? r8 = this.a;
                    Object obj13 = this.b;
                    oip oipVar = (oip) ahng.v(r8);
                    oipVar.getClass();
                    ((olp) obj13).k.k(1034, oipVar.d, oipVar.f, oipVar.s, oipVar.t);
                }
                return aher.a;
            default:
                omh omhVar = (omh) this.a;
                oip oipVar2 = omhVar.b;
                oio oioVar = oipVar2.c;
                if (oioVar == null) {
                    oioVar = oio.a;
                }
                Object obj14 = this.b;
                aihf builder = oioVar.toBuilder();
                builder.copyOnWrite();
                oio oioVar2 = (oio) builder.instance;
                oioVar2.b |= 32;
                oioVar2.h = true;
                oio oioVar3 = (oio) builder.build();
                aihf builder2 = oipVar2.toBuilder();
                builder2.copyOnWrite();
                oip oipVar3 = (oip) builder2.instance;
                oioVar3.getClass();
                oipVar3.c = oioVar3;
                oipVar3.b |= 1;
                olp olpVar = (olp) obj14;
                return ahno.ar(olpVar.c.l(omhVar.a, (oip) builder2.build()), new olk(0), olpVar.g);
        }
    }

    public /* synthetic */ olb(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
