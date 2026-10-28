package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uav extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        audl audlVar = (audl) obj;
        aihf aihfVarCreateBuilder = ancr.a.createBuilder();
        if ((audlVar.b & 1) != 0) {
            String str = audlVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            ancr ancrVar = (ancr) aihfVarCreateBuilder.instance;
            str.getClass();
            ancrVar.b |= 1;
            ancrVar.c = str;
        }
        if ((audlVar.b & 2) != 0) {
            int i = audlVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            ancr ancrVar2 = (ancr) aihfVarCreateBuilder.instance;
            ancrVar2.b |= 2;
            ancrVar2.d = i;
        }
        if ((audlVar.b & 4) != 0) {
            int i2 = audlVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            ancr ancrVar3 = (ancr) aihfVarCreateBuilder.instance;
            ancrVar3.b |= 4;
            ancrVar3.e = i2;
        }
        Iterator it = audlVar.f.iterator();
        while (it.hasNext()) {
            ancv ancvVar = (ancv) udz.a.b((audp) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            ancr ancrVar4 = (ancr) aihfVarCreateBuilder.instance;
            ancvVar.getClass();
            aiie aiieVar = ancrVar4.f;
            if (!aiieVar.c()) {
                ancrVar4.f = aihn.mutableCopy(aiieVar);
            }
            ancrVar4.f.add(ancvVar);
        }
        if ((audlVar.b & 8) != 0) {
            int i3 = audlVar.g;
            aihfVarCreateBuilder.copyOnWrite();
            ancr ancrVar5 = (ancr) aihfVarCreateBuilder.instance;
            ancrVar5.b |= 8;
            ancrVar5.g = i3;
        }
        if ((audlVar.b & 16) != 0) {
            int i4 = audlVar.h;
            aihfVarCreateBuilder.copyOnWrite();
            ancr ancrVar6 = (ancr) aihfVarCreateBuilder.instance;
            ancrVar6.b |= 16;
            ancrVar6.h = i4;
        }
        return (ancr) aihfVarCreateBuilder.build();
    }
}
