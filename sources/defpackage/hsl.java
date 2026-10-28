package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hsl implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hsl(hhi hhiVar, Object obj, Object obj2, allt alltVar, aihf aihfVar, int i) {
        this.$cid = i;
        this.a = hhiVar;
        this.b = obj;
        this.c = obj2;
        this.d = alltVar;
        this.e = aihfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, xgz] */
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
        int i = this.$cid;
        if (i == 0) {
            aohc aohcVar = (aohc) obj;
            aohb aohbVar = aohcVar.c;
            if (aohbVar == null) {
                aohbVar = aohb.a;
            }
            ?? r1 = this.c;
            ?? r2 = this.b;
            String str = aohbVar.c;
            boolean zContains = r2.contains(str);
            boolean zAdd = r1.add(str);
            if (zContains || !zAdd) {
                return;
            }
            Object obj2 = this.d;
            Object obj3 = this.a;
            allt alltVar = (allt) obj2;
            if (((hsn) ((hhi) obj3).a).f(alltVar.e, alltVar.d)) {
                ((aihf) this.e).bX(aohcVar);
                return;
            }
            return;
        }
        if (i != 1) {
            Object obj4 = this.c;
            xgt xgtVar = (xgt) obj;
            Optional optionalOfNullable = Optional.ofNullable(obj4);
            if (true == optionalOfNullable.isPresent()) {
                atqd atqdVar = ((atqe) optionalOfNullable.get()).c;
                if (atqdVar == null) {
                    atqdVar = atqd.a;
                }
                optionalOfNullable = Optional.ofNullable(atqdVar);
            }
            Optional optional = optionalOfNullable;
            Optional optionalOfNullable2 = Optional.ofNullable(obj4);
            if (true == optionalOfNullable2.isPresent()) {
                optionalOfNullable2 = Optional.ofNullable(Integer.valueOf(((atqe) optionalOfNullable2.get()).d));
            }
            Optional optional2 = optionalOfNullable2;
            Object obj5 = this.a;
            Object obj6 = this.d;
            Object obj7 = this.b;
            ((xge) obj5).e.a(this.e, optional, optional2, (amdd) obj7, xgtVar, (xie) obj6);
            return;
        }
        aohc aohcVar2 = (aohc) obj;
        aohb aohbVar2 = aohcVar2.c;
        if (aohbVar2 == null) {
            aohbVar2 = aohb.a;
        }
        ?? r3 = this.c;
        ?? r4 = this.b;
        String str2 = aohbVar2.c;
        boolean zContains2 = r4.contains(str2);
        boolean zAdd2 = r3.add(str2);
        if (zContains2 || !zAdd2) {
            return;
        }
        Object obj8 = this.d;
        Object obj9 = this.a;
        allt alltVar2 = (allt) obj8;
        if (((hnz) ((hhi) obj9).a).h(alltVar2.e, alltVar2.d)) {
            ((aihf) this.e).bX(aohcVar2);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ hsl(xge xgeVar, xgz xgzVar, atqe atqeVar, amdd amddVar, xie xieVar, int i) {
        this.$cid = i;
        this.a = xgeVar;
        this.e = xgzVar;
        this.c = atqeVar;
        this.b = amddVar;
        this.d = xieVar;
    }
}
