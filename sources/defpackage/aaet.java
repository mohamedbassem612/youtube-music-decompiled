package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaet implements aagh {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public aaet(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.aagh
    public final void a(aamo aamoVar) {
        if (this.$cid == 0) {
            Object obj = aamoVar.b;
            if (obj != null) {
                ((aaeu) this.a).a((String) ((aaok) obj).b);
            }
            Object obj2 = this.a;
            String strD = aamoVar.d();
            aalf aalfVar = ((aaeu) obj2).b;
            aalfVar.l(aalfVar.f(strD));
            return;
        }
        String strD2 = aamoVar.d();
        aihf aihfVarCreateBuilder = aogy.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar = (aogy) aihfVarCreateBuilder.instance;
        strD2.getClass();
        aogyVar.b |= 1;
        aogyVar.d = strD2;
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar2 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar2.h = 11;
        aogyVar2.b |= 16;
        ((aalv) ((aady) this.a).d.io()).d((aogy) aihfVarCreateBuilder.build());
    }
}
