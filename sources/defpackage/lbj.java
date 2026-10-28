package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lbj {
    public boolean a;
    public lit b;
    public BitSet c;
    public BitSet d;
    final /* synthetic */ lbo e;
    private String f;
    private Map g;
    private Map h;

    public lbj(lbo lboVar, String str, lit litVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.e = lboVar;
        this.f = str;
        this.c = bitSet;
        this.d = bitSet2;
        this.g = map;
        this.h = new afv();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.h.put(num, arrayList);
        }
        this.a = false;
        this.b = litVar;
    }

    public final List a() {
        Object obj = this.g;
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(((aha) obj).d);
        for (Integer num : this.g.keySet()) {
            int iIntValue = num.intValue();
            Long l = (Long) this.g.get(num);
            if (l != null) {
                aihf aihfVarCreateBuilder = lim.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                lim limVar = (lim) aihfVarCreateBuilder.instance;
                limVar.b |= 1;
                limVar.c = iIntValue;
                long jLongValue = l.longValue();
                aihfVarCreateBuilder.copyOnWrite();
                lim limVar2 = (lim) aihfVarCreateBuilder.instance;
                limVar2.b |= 2;
                limVar2.d = jLongValue;
                arrayList.add((lim) aihfVarCreateBuilder.build());
            }
        }
        return arrayList;
    }

    public final List b() {
        Object obj = this.h;
        if (obj == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(((aha) obj).d);
        for (Integer num : this.h.keySet()) {
            aihf aihfVarCreateBuilder = liu.a.createBuilder();
            int iIntValue = num.intValue();
            aihfVarCreateBuilder.copyOnWrite();
            liu liuVar = (liu) aihfVarCreateBuilder.instance;
            liuVar.b |= 1;
            liuVar.c = iIntValue;
            List list = (List) this.h.get(num);
            if (list != null) {
                Collections.sort(list);
                aihfVarCreateBuilder.copyOnWrite();
                liu liuVar2 = (liu) aihfVarCreateBuilder.instance;
                aihy aihyVar = liuVar2.d;
                if (!aihyVar.c()) {
                    liuVar2.d = aihn.mutableCopy(aihyVar);
                }
                aifs.addAll(list, liuVar2.d);
            }
            arrayList.add((liu) aihfVarCreateBuilder.build());
        }
        return arrayList;
    }

    final void c(lbm lbmVar) {
        int iA = lbmVar.a();
        Boolean bool = lbmVar.d;
        if (bool != null) {
            BitSet bitSet = this.d;
            bool.booleanValue();
            bitSet.set(iA, true);
        }
        Boolean bool2 = lbmVar.e;
        if (bool2 != null) {
            this.c.set(iA, bool2.booleanValue());
        }
        if (lbmVar.f != null) {
            Map map = this.g;
            Integer numValueOf = Integer.valueOf(iA);
            Long l = (Long) map.get(numValueOf);
            long jLongValue = lbmVar.f.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                this.g.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (lbmVar.g != null) {
            Map map2 = this.h;
            Integer numValueOf2 = Integer.valueOf(iA);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.h.put(numValueOf2, arrayList);
            }
            if (lbmVar.c()) {
                arrayList.clear();
            }
            ausi.c();
            lbo lboVar = this.e;
            lbt lbtVarG = lboVar.G();
            String str = this.f;
            adam adamVar = lcl.aD;
            if (lbtVarG.F(str, adamVar) && lbmVar.b()) {
                arrayList.clear();
            }
            ausi.c();
            if (!lboVar.G().F(this.f, adamVar)) {
                arrayList.add(Long.valueOf(lbmVar.g.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(lbmVar.g.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public lbj(lbo lboVar, String str) {
        this.e = lboVar;
        this.f = str;
        this.a = true;
        this.c = new BitSet();
        this.d = new BitSet();
        this.g = new afv();
        this.h = new afv();
    }
}
