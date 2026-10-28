package defpackage;

import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vfl extends veo {
    static final Function a = new vfk();

    @Override // defpackage.veo
    public final void a(auha auhaVar, aihf aihfVar) {
        aqad aqadVar = auhaVar.e;
        if (aqadVar == null) {
            aqadVar = aqad.a;
        }
        if ((aqadVar.c & 1) == 0) {
            aihfVar.copyOnWrite();
            akqj akqjVar = (akqj) aihfVar.instance;
            akqj akqjVar2 = akqj.a;
            akqjVar.e = 4;
            akqjVar.b |= 4;
            return;
        }
        aqad aqadVar2 = auhaVar.e;
        if (aqadVar2 == null) {
            aqadVar2 = aqad.a;
        }
        int iBc = a.bc(aqadVar2.d);
        int i = iBc != 0 ? iBc : 1;
        aihfVar.copyOnWrite();
        akqj akqjVar3 = (akqj) aihfVar.instance;
        akqj akqjVar4 = akqj.a;
        akqjVar3.e = i - 1;
        akqjVar3.b |= 4;
    }

    @Override // defpackage.veo
    public final aihf b() {
        aihf aihfVarCreateBuilder = akqj.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akqj akqjVar = (akqj) aihfVarCreateBuilder.instance;
        akqjVar.d = 1;
        akqjVar.b |= 2;
        return aihfVarCreateBuilder;
    }
}
