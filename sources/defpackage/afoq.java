package defpackage;

import java.util.function.BiConsumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afoq implements bpl {
    private final BiConsumer a;
    private final hil b;

    public afoq(hil hilVar, BiConsumer biConsumer) {
        this.b = hilVar;
        this.a = biConsumer;
    }

    @Override // defpackage.bpl
    public final /* synthetic */ bpi a(Class cls) {
        return bnz.h();
    }

    @Override // defpackage.bpl
    public final bpi b(Class cls, bpt bptVar) {
        this.a.accept(cls, bptVar);
        boy boyVarA = bpd.a(bptVar);
        final auod auodVar = new auod();
        aupe aupeVar = (aupe) bptVar.a(aupe.b);
        if (aupeVar == null) {
            aupeVar = aupe.a;
        }
        aupf aupfVar = (aupf) bptVar.a(afpc.d);
        if (aupfVar == null) {
            aupfVar = aupf.a;
        }
        hil hilVar = this.b;
        hilVar.a = boyVarA;
        hilVar.d = auodVar;
        aupeVar.getClass();
        hilVar.c = aupeVar;
        hilVar.b = aupfVar;
        atqq.b(hilVar.a, boy.class);
        atqq.b(hilVar.d, auns.class);
        atqq.b(hilVar.c, aupe.class);
        atqq.b(hilVar.b, aupf.class);
        awmd awmdVar = (awmd) ((afom) atqp.a(new gkk(), afom.class)).a().get(cls.getName());
        if (awmdVar != null) {
            bpi bpiVar = (bpi) awmdVar.io();
            bpiVar.s(new AutoCloseable() { // from class: afop
                @Override // java.lang.AutoCloseable
                public final void close() {
                    auodVar.a();
                }
            });
            return bpiVar;
        }
        throw new IllegalStateException("Expected the @AccountViewModel-annotated class '" + cls.getName() + "' to be available in the multi-binding of @AccountViewModelMap but none was found.");
    }

    @Override // defpackage.bpl
    public final /* synthetic */ bpi c(awsd awsdVar, bpt bptVar) {
        return bnz.g(this, awsdVar, bptVar);
    }
}
