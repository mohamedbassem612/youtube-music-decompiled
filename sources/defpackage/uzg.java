package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uzg implements axp {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ uzg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.axp
    public final Object a(Object obj) {
        if (this.$cid != 0) {
            aihf builder = ((ails) obj).toBuilder();
            builder.copyOnWrite();
            ails ailsVar = (ails) builder.instance;
            Object obj2 = this.a;
            obj2.getClass();
            ailsVar.c = (ajwo) obj2;
            ailsVar.b |= 1;
            return (ails) builder.build();
        }
        uzd uzdVar = (uzd) obj;
        uzc uzcVar = uzc.a;
        aihf aihfVarCreateBuilder = uzcVar.createBuilder();
        uzf uzfVar = (uzf) this.a;
        aihfVarCreateBuilder.ac(uzfVar.a);
        apji apjiVar = uzfVar.c;
        if (apjiVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            uzc uzcVar2 = (uzc) aihfVarCreateBuilder.instance;
            uzcVar2.d = apjiVar;
            uzcVar2.b |= 1;
        }
        aihf aihfVarCreateBuilder2 = uzcVar.createBuilder();
        aihfVarCreateBuilder2.ac(uzfVar.b);
        apji apjiVar2 = uzfVar.d;
        if (apjiVar2 != null) {
            aihfVarCreateBuilder2.copyOnWrite();
            uzc uzcVar3 = (uzc) aihfVarCreateBuilder2.instance;
            uzcVar3.d = apjiVar2;
            uzcVar3.b |= 1;
        }
        aihf builder2 = uzdVar.toBuilder();
        builder2.copyOnWrite();
        uzd uzdVar2 = (uzd) builder2.instance;
        uzc uzcVar4 = (uzc) aihfVarCreateBuilder.build();
        uzcVar4.getClass();
        uzdVar2.d = uzcVar4;
        uzdVar2.b |= 2;
        builder2.copyOnWrite();
        uzd uzdVar3 = (uzd) builder2.instance;
        uzc uzcVar5 = (uzc) aihfVarCreateBuilder2.build();
        uzcVar5.getClass();
        uzdVar3.c = uzcVar5;
        uzdVar3.b |= 1;
        return (uzd) builder2.build();
    }
}
