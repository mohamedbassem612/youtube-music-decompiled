package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class uaq extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auby aubyVar = (auby) obj;
        aihf aihfVarCreateBuilder = anba.a.createBuilder();
        if ((aubyVar.b & 1) != 0) {
            int i = aubyVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            anba anbaVar = (anba) aihfVarCreateBuilder.instance;
            anbaVar.b |= 1;
            anbaVar.c = i;
        }
        if ((aubyVar.b & 2) != 0) {
            int i2 = aubyVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            anba anbaVar2 = (anba) aihfVarCreateBuilder.instance;
            anbaVar2.b |= 2;
            anbaVar2.d = i2;
        }
        if ((aubyVar.b & 4) != 0) {
            int i3 = aubyVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            anba anbaVar3 = (anba) aihfVarCreateBuilder.instance;
            anbaVar3.b |= 4;
            anbaVar3.e = i3;
        }
        if ((aubyVar.b & 8) != 0) {
            int i4 = aubyVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            anba anbaVar4 = (anba) aihfVarCreateBuilder.instance;
            anbaVar4.b |= 8;
            anbaVar4.f = i4;
        }
        if ((aubyVar.b & 16) != 0) {
            int i5 = aubyVar.g;
            aihfVarCreateBuilder.copyOnWrite();
            anba anbaVar5 = (anba) aihfVarCreateBuilder.instance;
            anbaVar5.b |= 16;
            anbaVar5.g = i5;
        }
        if ((aubyVar.b & 32) != 0) {
            aigu aiguVar = aubyVar.h;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            anba anbaVar6 = (anba) aihfVarCreateBuilder.instance;
            aiguVar.getClass();
            anbaVar6.h = aiguVar;
            anbaVar6.b |= 32;
        }
        return (anba) aihfVarCreateBuilder.build();
    }
}
