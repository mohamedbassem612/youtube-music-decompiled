package defpackage;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cru implements Comparator {
    private final /* synthetic */ int $cid;

    public /* synthetic */ cru(int i) {
        this.$cid = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num = 0;
        switch (this.$cid) {
            case 0:
                int i = crv.e;
                return Float.compare(((duk) obj).b, ((duk) obj2).b);
            case 1:
                int i2 = ((aoy) obj).a;
                int i3 = ((aoy) obj2).a;
                return num.compareTo(num);
            case 2:
                return atqq.f((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 3:
                return atqq.f((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 4:
                agke agkeVar = mpy.a;
                return agkeVar.indexOf(((nvr) obj).getClass()) - agkeVar.indexOf(((nvr) obj2).getClass());
            case 5:
                return qnl.aP((oiw) obj).compareTo(qnl.aP((oiw) obj2));
            case 6:
                return qnl.aP(((omh) obj).a).compareTo(qnl.aP(((omh) obj2).a));
            case 7:
                return qnl.aP((oiz) obj).compareTo(qnl.aP((oiz) obj2));
            case 8:
                return atqq.f(Integer.valueOf(((aiay) obj).hashCode()), Integer.valueOf(((aiay) obj2).hashCode()));
            case 9:
                return Integer.compare(((vwn) obj).f, ((vwn) obj2).f);
            case 10:
                Map.Entry entry = (Map.Entry) obj2;
                int i4 = xnp.h;
                atoz atozVar = ((atoy) ((Map.Entry) obj).getValue()).d;
                if (atozVar == null) {
                    atozVar = atoz.a;
                }
                long j = atozVar.h;
                atoz atozVar2 = ((atoy) entry.getValue()).d;
                if (atozVar2 == null) {
                    atozVar2 = atoz.a;
                }
                return j >= atozVar2.h ? -1 : 1;
            case 11:
                return Integer.compare(aaus.a((aohx) obj, 0), aaus.a((aohx) obj2, 0));
            case 12:
                return aaus.a.compare(((aame) obj).a, ((aame) obj2).a);
            case 13:
                adhu adhuVar = (adhu) obj;
                adhu adhuVar2 = (adhu) obj2;
                if (adhuVar.equals(adhuVar2)) {
                    return 0;
                }
                int iCompare = Integer.compare(adhuVar2.h(), adhuVar.h());
                return iCompare == 0 ? Integer.compare(adhuVar2.hashCode(), adhuVar.hashCode()) : iCompare;
            case 14:
                aguz aguzVarA = aguz.a(obj);
                aguz aguzVarA2 = aguz.a(obj2);
                if (aguzVarA != aguzVarA2) {
                    return aguzVarA.compareTo(aguzVarA2);
                }
                int iOrdinal = aguzVarA.ordinal();
                if (iOrdinal == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (iOrdinal == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (iOrdinal == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (iOrdinal == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            default:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
        }
    }
}
