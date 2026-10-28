package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acfo extends acii {
    private final abwk a;
    private final afip b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acfo(abwk abwkVar, afip afipVar) {
        super(0);
        abwkVar.getClass();
        afipVar.getClass();
        this.a = abwkVar;
        this.b = afipVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [acey, java.lang.Object] */
    @Override // defpackage.acii
    public final void h(aazn aaznVar) {
        String str;
        ?? r0;
        acfw acfwVarK;
        acjb acjbVarD;
        if (aaznVar.a != 7 || (str = aaznVar.b) == null || (r0 = this.a.d) == 0 || (acfwVarK = r0.k()) == null || (acjbVarD = acfwVarK.d()) == null) {
            return;
        }
        acjd acjdVarA = acjbVarD.A(str);
        if (acjdVarA instanceof aciv) {
            r0.e();
            this.b.k(((aciv) acjdVarA).a);
        }
    }
}
