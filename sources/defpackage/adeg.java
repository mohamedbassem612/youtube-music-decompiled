package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adeg implements nwq {
    @Override // defpackage.nwq
    public final aigw a() {
        return aqos.b;
    }

    @Override // defpackage.nwq
    public final /* bridge */ /* synthetic */ void b(fhd fhdVar, Object obj, nwp nwpVar) {
        aqos aqosVar = (aqos) obj;
        if (aqosVar.d) {
            aedg aedgVarA = aedg.a(fhdVar.a);
            aedgVarA.b = nwpVar.d;
            int i = aqosVar.c;
            if ((i & 2) != 0) {
                aedgVarA.a = aqosVar.e;
            }
            if ((i & 4) != 0) {
                aedgVarA.c(aqosVar.f);
            }
            nwpVar.d = aedgVarA.b();
        }
    }
}
