package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class tzz extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubi aubiVar = (aubi) obj;
        aihf aihfVarCreateBuilder = anak.a.createBuilder();
        if ((aubiVar.b & 1) != 0) {
            boolean z = aubiVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            anak anakVar = (anak) aihfVarCreateBuilder.instance;
            anakVar.b |= 1;
            anakVar.c = z;
        }
        return (anak) aihfVarCreateBuilder.build();
    }
}
