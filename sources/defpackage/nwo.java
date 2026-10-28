package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nwo {
    public static final aiff a(List list) {
        aihf aihfVarCreateBuilder = aiff.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aiff aiffVar = (aiff) aihfVarCreateBuilder.instance;
        aiffVar.e = 2;
        aiffVar.b |= 4;
        int i = aiep.c;
        aihfVarCreateBuilder.copyOnWrite();
        aiff aiffVar2 = (aiff) aihfVarCreateBuilder.instance;
        aiffVar2.c = i - 1;
        aiffVar2.b |= 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aido aidoVar = ((pot) it.next()).o.k;
            if (aidoVar == null) {
                aidoVar = aido.a;
            }
            if (aidoVar.f) {
                return (aiff) aihfVarCreateBuilder.build();
            }
        }
        aihfVarCreateBuilder.copyOnWrite();
        aiff aiffVar3 = (aiff) aihfVarCreateBuilder.instance;
        aiffVar3.f = 2;
        aiffVar3.b |= 8;
        return (aiff) aihfVarCreateBuilder.build();
    }
}
