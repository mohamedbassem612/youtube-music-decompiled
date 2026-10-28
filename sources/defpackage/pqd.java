package defpackage;

import android.os.Bundle;
import com.google.protobuf.MessageLite;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pqd extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqd(phk phkVar, pxk pxkVar, String str, aifv aifvVar, plb plbVar, phb phbVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = phkVar;
        this.c = pxkVar;
        this.e = str;
        this.g = aifvVar;
        this.b = plbVar;
        this.f = phbVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ppw] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, pxk] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        pqd pqdVar;
        int i = this.$cid;
        if (i != 0) {
            Object obj2 = this.d;
            if (i != 1) {
                Object obj3 = this.g;
                return new pqd((qbf) obj2, (String) obj3, (plx) this.f, (MessageLite) this.b, (MessageLite) this.c, (Map) this.e, awoqVar, 2);
            }
            ?? r3 = this.c;
            Object obj4 = this.e;
            Object obj5 = this.g;
            aifv aifvVar = (aifv) obj5;
            String str = (String) obj4;
            phk phkVar = (phk) obj2;
            pqdVar = new pqd(phkVar, (pxk) r3, str, aifvVar, (plb) this.b, (phb) this.f, awoqVar, 1);
        } else {
            ?? r2 = this.b;
            Object obj6 = this.c;
            Object obj7 = this.d;
            Object obj8 = this.e;
            Bundle bundle = (Bundle) this.f;
            plx plxVar = (plx) obj7;
            pqe pqeVar = (pqe) obj6;
            pqdVar = new pqd((ppw) r2, pqeVar, plxVar, (String) obj8, bundle, (Long) this.g, awoqVar, 0);
        }
        return pqdVar;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((pqd) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 1) {
            return ((pqd) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((pqd) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r15 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0112, code lost:
    
        if (r15 != r14) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, pxk] */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v9, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, ppw] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, ppw] */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.google.protobuf.MessageLite, java.lang.Object] */
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
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqd(ppw ppwVar, pqe pqeVar, plx plxVar, String str, Bundle bundle, Long l, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ppwVar;
        this.c = pqeVar;
        this.d = plxVar;
        this.e = str;
        this.f = bundle;
        this.g = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqd(qbf qbfVar, String str, plx plxVar, MessageLite messageLite, MessageLite messageLite2, Map map, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = qbfVar;
        this.g = str;
        this.f = plxVar;
        this.b = messageLite;
        this.c = messageLite2;
        this.e = map;
    }
}
