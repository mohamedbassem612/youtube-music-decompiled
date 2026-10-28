package defpackage;

import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tlf implements tlr {
    public final tku a;
    private final aha c = new aha(10);
    private final tlb d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [tla] */
    /* JADX WARN: Type inference failed for: r2v4, types: [tla] */
    public tlf(tku tkuVar, boolean z) {
        tla tlaVar;
        this.a = tkuVar;
        if (z) {
            final int i = 1;
            tlaVar = new tlb() { // from class: tla
                @Override // defpackage.tlb
                public final tlc a(String str, tns tnsVar) {
                    return i != 0 ? new tlc(str, tnsVar.ab()) : new tlc(str, null);
                }
            };
        } else {
            final int i2 = 0;
            tlaVar = new tlb() { // from class: tla
                @Override // defpackage.tlb
                public final tlc a(String str, tns tnsVar) {
                    return i2 != 0 ? new tlc(str, tnsVar.ab()) : new tlc(str, null);
                }
            };
        }
        this.d = tlaVar;
    }

    private final void e(tns tnsVar, tle tleVar) {
        String strF = f(tnsVar);
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        tlc tlcVarA = this.d.a(strF, tnsVar);
        aha ahaVar = this.c;
        synchronized (ahaVar) {
            int iC = ahaVar.c(tlcVarA);
            if (iC >= 0) {
                Queue queue = (Queue) ahaVar.g(iC);
                if (queue != null) {
                    while (!queue.isEmpty()) {
                        if (tleVar.a((tld) queue.poll())) {
                            return;
                        }
                    }
                }
                if (queue == null || queue.isEmpty()) {
                    ahaVar.e(iC);
                }
            }
        }
    }

    private static final String f(tns tnsVar) {
        if (tnsVar.G()) {
            return tnsVar.q();
        }
        return null;
    }

    @Override // defpackage.tlr
    public final void a(tns tnsVar) {
        e(tnsVar, new tkz(this, 1));
    }

    @Override // defpackage.tlr
    public final void b(tns tnsVar, tnx tnxVar) {
        e(tnsVar, new tkz(tnxVar, 0));
    }

    @Override // defpackage.tlr
    public final boolean c(tns tnsVar) {
        String strF = f(tnsVar);
        boolean z = false;
        if (!TextUtils.isEmpty(strF)) {
            tlc tlcVarA = this.d.a(strF, tnsVar);
            aha ahaVar = this.c;
            synchronized (ahaVar) {
                Queue queue = (Queue) ahaVar.get(tlcVarA);
                if (queue != null && !queue.isEmpty()) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.tlr
    public final boolean d(tns tnsVar, tks tksVar) {
        String strF = f(tnsVar);
        boolean zOffer = false;
        if (!TextUtils.isEmpty(strF)) {
            tlc tlcVarA = this.d.a(strF, tnsVar);
            aha ahaVar = this.c;
            synchronized (ahaVar) {
                int iC = ahaVar.c(tlcVarA);
                if (iC >= 0) {
                    Queue arrayDeque = (Queue) ahaVar.g(iC);
                    if (arrayDeque == null) {
                        arrayDeque = new ArrayDeque();
                        ahaVar.f(iC, arrayDeque);
                    }
                    zOffer = arrayDeque.offer(new tld(tksVar, tnsVar));
                } else {
                    ahaVar.put(tlcVarA, null);
                }
            }
        }
        return zOffer;
    }
}
