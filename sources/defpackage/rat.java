package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rat extends rar {
    public rat(qup qupVar, int i, raq raqVar) {
        super(qupVar, i, raqVar);
    }

    @Override // defpackage.rar
    protected final atqv a(qup qupVar) {
        aihf aihfVarCreateBuilder = atqv.a.createBuilder();
        aihf aihfVarCreateBuilder2 = atrn.a.createBuilder();
        int i = ((quw) qupVar.b).c;
        aihfVarCreateBuilder2.copyOnWrite();
        atrn atrnVar = (atrn) aihfVarCreateBuilder2.instance;
        atrnVar.b |= 2;
        atrnVar.d = i;
        aihfVarCreateBuilder2.copyOnWrite();
        atrn atrnVar2 = (atrn) aihfVarCreateBuilder2.instance;
        atrnVar2.c = 1;
        atrnVar2.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        atqv atqvVar = (atqv) aihfVarCreateBuilder.instance;
        atrn atrnVar3 = (atrn) aihfVarCreateBuilder2.build();
        atrnVar3.getClass();
        atqvVar.c = atrnVar3;
        atqvVar.b = 4;
        return (atqv) aihfVarCreateBuilder.build();
    }
}
