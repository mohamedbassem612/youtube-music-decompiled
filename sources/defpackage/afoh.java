package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class afoh implements bpl {
    final /* synthetic */ afoi a;
    private final affd b;

    public afoh(afoi afoiVar, affd affdVar) {
        this.a = afoiVar;
        this.b = affdVar;
    }

    @Override // defpackage.bpl
    public final /* synthetic */ bpi a(Class cls) {
        return bnz.h();
    }

    @Override // defpackage.bpl
    public final bpi b(Class cls, bpt bptVar) {
        if (!cls.equals(afog.class)) {
            throw new IllegalStateException();
        }
        boy boyVarA = bpd.a(bptVar);
        aupf aupfVar = (aupf) bptVar.a(afpc.a);
        if (aupfVar == null) {
            aupfVar = aupf.a;
        }
        aupf aupfVar2 = aupfVar;
        afoi afoiVar = this.a;
        affd affdVar = this.b;
        afpa afpaVar = afoiVar.a;
        if (afpaVar instanceof aupi) {
            return new afog(boyVarA, afoiVar.b, affdVar, ((auof) afpaVar.componentManager()).b(), aupfVar2);
        }
        throw new IllegalStateException("Host is not a Hilt activity or FragmentHost: ".concat(String.valueOf(String.valueOf(afpaVar))));
    }

    @Override // defpackage.bpl
    public final /* synthetic */ bpi c(awsd awsdVar, bpt bptVar) {
        return b(((awqv) awsdVar).b, bptVar);
    }
}
