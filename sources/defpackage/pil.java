package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pil extends awpk implements awqg {
    int a;
    final /* synthetic */ awqg b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pil(awqg awqgVar, boolean z, awoq awoqVar) {
        super(1, awoqVar);
        this.b = awqgVar;
        this.c = z;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new pil(this.b, this.c, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((pil) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i != 0) {
            if (i == 1) {
            }
            return (pky) obj;
        }
        awqg awqgVar = this.b;
        this.a = 1;
        obj = awqgVar.invoke(this);
        if (obj == awoxVar) {
            return awoxVar;
        }
        pky pkyVar = (pky) obj;
        if (!this.c || pkyVar.i()) {
            return pkyVar;
        }
        ((agsj) ((agsj) pit.a.c()).j(pkyVar.f())).t("Failed to download image on first attempt, retrying.");
        awqg awqgVar2 = this.b;
        this.a = 2;
        obj = awqgVar2.invoke(this);
        if (obj == awoxVar) {
            return awoxVar;
        }
        return (pky) obj;
    }
}
