package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ucb extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auer auerVar = (auer) obj;
        aihf aihfVarCreateBuilder = aneb.a.createBuilder();
        if ((auerVar.b & 1) != 0) {
            int i = auerVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            aneb anebVar = (aneb) aihfVarCreateBuilder.instance;
            anebVar.b |= 1;
            anebVar.c = i;
        }
        if ((auerVar.b & 2) != 0) {
            int i2 = auerVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            aneb anebVar2 = (aneb) aihfVarCreateBuilder.instance;
            anebVar2.b |= 2;
            anebVar2.d = i2;
        }
        if ((auerVar.b & 4) != 0) {
            float f = auerVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            aneb anebVar3 = (aneb) aihfVarCreateBuilder.instance;
            anebVar3.b |= 4;
            anebVar3.e = f;
        }
        if ((auerVar.b & 8) != 0) {
            long j = auerVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            aneb anebVar4 = (aneb) aihfVarCreateBuilder.instance;
            anebVar4.b |= 8;
            anebVar4.f = j;
        }
        if ((auerVar.b & 16) != 0) {
            long j2 = auerVar.g;
            aihfVarCreateBuilder.copyOnWrite();
            aneb anebVar5 = (aneb) aihfVarCreateBuilder.instance;
            anebVar5.b |= 16;
            anebVar5.g = j2;
        }
        return (aneb) aihfVarCreateBuilder.build();
    }
}
