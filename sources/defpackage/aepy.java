package defpackage;

import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aepy {
    public final awmd a;
    public volatile String b;
    public final vxz d;
    private final tqj e;
    public volatile agke c = agpi.a;
    private final List g = new ArrayList();
    private final Set f = Collections.newSetFromMap(new ConcurrentHashMap());

    public aepy(tqj tqjVar, awmd awmdVar, vxz vxzVar) {
        this.e = tqjVar;
        this.a = awmdVar;
        this.d = vxzVar;
    }

    public final akgr a() {
        boolean zB = b();
        int i = tqr.a;
        if (!this.e.k(1073808257) || !zB) {
            return null;
        }
        aihf aihfVarCreateBuilder = akgr.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akgr akgrVar = (akgr) aihfVarCreateBuilder.instance;
        akgrVar.b |= 2;
        akgrVar.c = true;
        String str = this.b;
        agke agkeVar = this.c;
        if (!agkeVar.isEmpty()) {
            int size = agkeVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                apsr apsrVar = (apsr) agkeVar.get(i2);
                aihfVarCreateBuilder.copyOnWrite();
                akgr akgrVar2 = (akgr) aihfVarCreateBuilder.instance;
                apsrVar.getClass();
                aiie aiieVar = akgrVar2.f;
                if (!aiieVar.c()) {
                    akgrVar2.f = aihn.mutableCopy(aiieVar);
                }
                akgrVar2.f.add(apsrVar);
            }
            agke agkeVar2 = (agke) Collection.EL.stream(agkeVar).filter(new acwb(6)).map(new aegf(3)).collect(aghu.a);
            aihfVarCreateBuilder.copyOnWrite();
            akgr akgrVar3 = (akgr) aihfVarCreateBuilder.instance;
            aiie aiieVar2 = akgrVar3.d;
            if (!aiieVar2.c()) {
                akgrVar3.d = aihn.mutableCopy(aiieVar2);
            }
            aifs.addAll(agkeVar2, akgrVar3.d);
        }
        List list = this.g;
        if (!list.isEmpty()) {
            aihfVarCreateBuilder.copyOnWrite();
            akgr akgrVar4 = (akgr) aihfVarCreateBuilder.instance;
            aihv aihvVar = akgrVar4.e;
            if (!aihvVar.c()) {
                akgrVar4.e = aihn.mutableCopy(aihvVar);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                akgrVar4.e.h(((akgp) it.next()).f);
            }
        }
        return (akgr) aihfVarCreateBuilder.build();
    }

    public final boolean b() {
        return !this.f.isEmpty();
    }
}
