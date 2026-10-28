package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ubn extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aued auedVar = (aued) obj;
        aihf aihfVarCreateBuilder = andk.a.createBuilder();
        if ((auedVar.b & 1) != 0) {
            int i = auedVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            andk andkVar = (andk) aihfVarCreateBuilder.instance;
            andkVar.b |= 1;
            andkVar.c = i;
        }
        if ((auedVar.b & 2) != 0) {
            int i2 = auedVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            andk andkVar2 = (andk) aihfVarCreateBuilder.instance;
            andkVar2.b |= 2;
            andkVar2.d = i2;
        }
        if ((auedVar.b & 4) != 0) {
            int i3 = auedVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            andk andkVar3 = (andk) aihfVarCreateBuilder.instance;
            andkVar3.b |= 4;
            andkVar3.e = i3;
        }
        if ((auedVar.b & 8) != 0) {
            int i4 = auedVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            andk andkVar4 = (andk) aihfVarCreateBuilder.instance;
            andkVar4.b |= 8;
            andkVar4.f = i4;
        }
        return (andk) aihfVarCreateBuilder.build();
    }
}
