package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ies implements abji {
    final /* synthetic */ iet a;

    public ies(iet ietVar) {
        this.a = ietVar;
    }

    @Override // defpackage.abji
    public final /* synthetic */ void hp(Object obj, abjm abjmVar) {
        hyz hyzVar = (hyz) obj;
        agrx agrxVar = agso.a;
        if (hyzVar != null) {
            hyzVar.t();
            hyzVar.r();
        }
        iet ietVar = this.a;
        if (!ietVar.e.isEmpty()) {
            ietVar.e.get();
        }
        if (hyzVar != null && !ahno.aa(hyzVar.r())) {
            if (!ietVar.e.isPresent()) {
                return;
            }
            if (((String) ietVar.e.get()).equals(hyzVar.r())) {
                return;
            }
        }
        ietVar.c();
    }
}
