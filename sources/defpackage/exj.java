package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exj extends ffo implements exk {
    public aerj a;

    @Override // defpackage.ffo
    protected final /* bridge */ /* synthetic */ int a(Object obj) {
        ewf ewfVar = (ewf) obj;
        if (ewfVar == null) {
            return 1;
        }
        return ewfVar.a();
    }

    @Override // defpackage.exk
    public final /* bridge */ /* synthetic */ ewf b(ett ettVar) {
        return (ewf) super.i(ettVar);
    }

    @Override // defpackage.ffo
    protected final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ewf ewfVar = (ewf) obj2;
        aerj aerjVar = this.a;
        if (aerjVar == null || ewfVar == null) {
            return;
        }
        ((aerz) aerjVar.g).g(ewfVar, true);
    }

    @Override // defpackage.exk
    public final /* bridge */ /* synthetic */ void d(ett ettVar, ewf ewfVar) {
    }
}
