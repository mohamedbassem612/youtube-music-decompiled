package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bom extends bon implements boe {
    final bog a;
    final /* synthetic */ boo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bom(boo booVar, bog bogVar, boq boqVar) {
        super(booVar, boqVar);
        this.b = booVar;
        this.a = bogVar;
    }

    @Override // defpackage.boe
    public final void a(bog bogVar, boa boaVar) {
        bog bogVar2 = this.a;
        bob bobVarA = bogVar2.getLifecycle().a();
        if (bobVarA == bob.a) {
            this.b.g(this.c);
            return;
        }
        bob bobVar = null;
        while (bobVar != bobVarA) {
            d(fY());
            bobVar = bobVarA;
            bobVarA = bogVar2.getLifecycle().a();
        }
    }

    @Override // defpackage.bon
    public final void b() {
        this.a.getLifecycle().c(this);
    }

    @Override // defpackage.bon
    public final boolean c(bog bogVar) {
        return this.a == bogVar;
    }

    @Override // defpackage.bon
    public final boolean fY() {
        return this.a.getLifecycle().a().a(bob.d);
    }
}
