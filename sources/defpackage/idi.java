package defpackage;

import android.graphics.Rect;
import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class idi implements avnf {
    private final /* synthetic */ int $cid;

    public /* synthetic */ idi(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnf
    public final Object a(Object obj, Object obj2) {
        Object vqqVar;
        switch (this.$cid) {
            case 0:
                return a.F((Boolean) obj, (Boolean) obj2);
            case 1:
                return new gfj((hzc) obj, (aazn) obj2);
            case 2:
                Integer num = (Integer) obj;
                return Integer.valueOf((((Boolean) obj2).booleanValue() && num.intValue() == 6) ? 12 : num.intValue());
            case 3:
                return Integer.valueOf(((vob) obj2).o(((Boolean) obj).booleanValue()));
            case 4:
                float fIntValue = ((Integer) obj).intValue();
                Rect rect = (Rect) obj2;
                float fHeight = rect.height();
                return Float.valueOf(fHeight > 0.001f ? afxw.H(1.0f - (Math.abs(fIntValue - rect.top) / fHeight), 0.0f, 1.0f) : 0.0f);
            case 5:
                return new agew((vob) obj, (vob) obj2);
            case 6:
                vqqVar = new vqq((vtl) obj, ((Integer) obj2).intValue());
                break;
            case 7:
                return Boolean.valueOf(!((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
            case 8:
                vui vuiVar = (vui) obj2;
                int iIntValue = ((Integer) obj).intValue();
                int i = vuiVar.a;
                int i2 = vuiVar.b;
                return Integer.valueOf(vuk.b(iIntValue, i, i2, i2));
            case 9:
                agev agevVar = (agev) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (agevVar.g()) {
                    iIntValue2 = ((Integer) agevVar.c()).intValue();
                }
                return Integer.valueOf(iIntValue2);
            case 10:
                vqqVar = new vui(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                break;
            case 11:
                vux vuxVar = (vux) obj;
                vux vuxVar2 = (vux) obj2;
                vux vuxVar3 = vux.b;
                return (vuxVar == vuxVar3 || vuxVar2 == vuxVar3) ? vuxVar3 : vux.a;
            case 12:
                return Boolean.valueOf(((Boolean) obj2).booleanValue() && !((agev) obj).g());
            case 13:
                vui vuiVar2 = (vui) obj2;
                return Integer.valueOf(vuk.b(((Integer) obj).intValue(), vuiVar2.a, vuiVar2.b, 0));
            case 14:
                return ((vus) obj2).a;
            case 15:
                return Integer.valueOf(((Integer) obj).intValue() + ((Integer) obj2).intValue());
            case 16:
                return Integer.valueOf(((Integer) obj).intValue() + ((Integer) obj2).intValue());
            case 17:
                return new vuj(((Integer) obj).intValue(), (Rect) obj2);
            case 18:
                return Integer.valueOf(vuk.a(((Integer) obj).intValue(), 0, 0, 0, (vun) obj2));
            case 19:
                return axfd.K(((Boolean) obj).booleanValue(), (agkz) obj2);
            default:
                agev agevVar2 = (agev) obj;
                Pair pair = (Pair) obj2;
                vuz vuzVar = (vuz) pair.first;
                boolean zBooleanValue = ((Boolean) pair.second).booleanValue();
                if (agevVar2.g()) {
                    return (!vuzVar.equals(agevVar2.c()) || zBooleanValue) ? agevVar2 : agdf.a;
                }
                if (!zBooleanValue) {
                    return agevVar2;
                }
                vuzVar.getClass();
                return new agfa(vuzVar);
        }
        return vqqVar;
    }
}
