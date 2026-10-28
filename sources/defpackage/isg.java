package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class isg implements avnd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ isg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, tpq] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, zwj] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, nxa] */
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
    @Override // defpackage.avnd
    public final void a() {
        int i = 0;
        switch (this.$cid) {
            case 0:
                awlk awlkVar = (awlk) ((hef) this.a).b;
                AtomicReference atomicReference = awlkVar.c;
                Object obj = atomicReference.get();
                Object obj2 = awlk.b;
                if (obj != obj2 || awlkVar.e != null) {
                    if (atomicReference.get() != obj2 || awlkVar.e == null) {
                        awlkVar.kn();
                    }
                }
                break;
            case 1:
                ((gkt) this.a).b(null);
                break;
            case 2:
                this.a.a();
                break;
            case 3:
                Object obj3 = this.a;
                int i2 = bac.a;
                azs.c((View) obj3, null);
                break;
            case 4:
                Object obj4 = this.a;
                aado aadoVar = (aado) obj4;
                atpt atptVar = (atpt) ((aaqg) aadoVar.f.io()).g.b.c();
                String str = aadoVar.b;
                atps atpsVar = atps.a;
                str.getClass();
                atps atpsVar2 = (atps) atptVar.d.get(str);
                if (atpsVar2 != null) {
                    atpsVar = atpsVar2;
                }
                if (atpsVar.d) {
                    aadoVar.d.post(new aadm(obj4, i));
                }
                break;
            case 5:
                ((aawk) this.a).b.b();
                break;
            case 6:
                ((aczb) this.a).e().cacheResources();
                break;
            case 7:
                aeoc aeocVar = (aeoc) this.a;
                aeocVar.a(aeocVar.e, aeocVar.i, 196);
                break;
            case 8:
                aeoc aeocVar2 = (aeoc) this.a;
                aeocVar2.a(aeocVar2.f, aeocVar2.i, 197);
                break;
            case 9:
                aeoc aeocVar3 = (aeoc) this.a;
                aeocVar3.a(aeocVar3.c, aeocVar3.j, 198);
                break;
            default:
                ?? r6 = this.a;
                aeog aeogVar = (aeog) r6;
                aeogVar.c.f(r6);
                if (aeogVar.u.l(430, 45846622L, false)) {
                    aeogVar.l.l(r6);
                }
                break;
        }
    }
}
