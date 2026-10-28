package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akzx extends tzk {
    public final aihh a;

    public akzx(aihh aihhVar) {
        super(null);
        this.a = aihhVar;
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return ao();
    }

    public final void am(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            aihh aihhVar = this.a;
            aihhVar.copyOnWrite();
            alab alabVar = (alab) aihhVar.instance;
            alab alabVar2 = alab.a;
            str.getClass();
            aiie aiieVar = alabVar.e;
            if (!aiieVar.c()) {
                alabVar.e = aihn.mutableCopy(aiieVar);
            }
            alabVar.e.add(str);
        }
    }

    public final void an(String str) {
        aihh aihhVar = this.a;
        aihhVar.copyOnWrite();
        alab alabVar = (alab) aihhVar.instance;
        alab alabVar2 = alab.a;
        str.getClass();
        alabVar.b |= 2;
        alabVar.d = str;
    }

    public final akzz ao() {
        return new akzz((alab) this.a.build());
    }
}
