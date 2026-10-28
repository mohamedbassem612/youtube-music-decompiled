package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class uac extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubl aublVar = (aubl) obj;
        aihf aihfVarCreateBuilder = anan.a.createBuilder();
        if ((aublVar.b & 1) != 0) {
            aigu aiguVar = aublVar.c;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            anan ananVar = (anan) aihfVarCreateBuilder.instance;
            aiguVar.getClass();
            ananVar.c = aiguVar;
            ananVar.b |= 1;
        }
        if ((aublVar.b & 2) != 0) {
            boolean z = aublVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            anan ananVar2 = (anan) aihfVarCreateBuilder.instance;
            ananVar2.b |= 2;
            ananVar2.d = z;
        }
        return (anan) aihfVarCreateBuilder.build();
    }
}
