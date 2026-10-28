package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wns {
    public final boolean a;
    public final boolean b;
    private final airg c;
    private List d;

    private wns(String str, wnr wnrVar) {
        this.c = null;
        aihf aihfVarCreateBuilder = airc.a.createBuilder();
        alay alayVarC = ackj.c(str);
        aihfVarCreateBuilder.copyOnWrite();
        airc aircVar = (airc) aihfVarCreateBuilder.instance;
        alayVarC.getClass();
        aircVar.c = alayVarC;
        aircVar.b |= 1;
        airc aircVar2 = (airc) aihfVarCreateBuilder.build();
        ArrayList arrayList = new ArrayList(2);
        this.d = arrayList;
        arrayList.add(aircVar2);
        this.d.add(wnrVar);
        this.a = true;
        this.b = true;
    }

    public static wns b(String str, wnr wnrVar) {
        typ.f(str);
        return new wns(str, wnrVar);
    }

    public final wnr a() {
        for (Object obj : d()) {
            if (obj instanceof wnr) {
                wnr wnrVar = (wnr) obj;
                if (!wnrVar.a()) {
                    return wnrVar;
                }
            }
        }
        return null;
    }

    public final List c() {
        airg airgVar = this.c;
        return airgVar != null ? airgVar.d : agpi.a;
    }

    public final List d() {
        List list = this.d;
        if (list != null) {
            return list;
        }
        airg airgVar = this.c;
        this.d = new ArrayList(airgVar.c.size() + 1);
        aird airdVar = airgVar.e;
        if (airdVar == null) {
            airdVar = aird.a;
        }
        if ((airdVar.b & 1) != 0) {
            List list2 = this.d;
            aird airdVar2 = airgVar.e;
            if (airdVar2 == null) {
                airdVar2 = aird.a;
            }
            airc aircVar = airdVar2.c;
            if (aircVar == null) {
                aircVar = airc.a;
            }
            list2.add(aircVar);
        }
        for (airf airfVar : airgVar.c) {
            int i = airfVar.b;
            if (i == 62381864) {
                this.d.add(new wnq(i == 62381864 ? (airb) airfVar.c : airb.a));
            }
        }
        List list3 = this.d;
        if (list3 != null) {
            return list3;
        }
        List list4 = Collections.EMPTY_LIST;
        this.d = list4;
        return list4;
    }

    public wns(airg airgVar) {
        airgVar.getClass();
        this.c = airgVar;
        this.a = false;
        aird airdVar = airgVar.e;
        this.b = 1 == ((airdVar == null ? aird.a : airdVar).b & 1);
    }
}
