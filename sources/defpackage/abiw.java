package defpackage;

import android.graphics.Rect;
import android.util.Pair;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abiw implements avnf {
    private final /* synthetic */ int $cid;

    public /* synthetic */ abiw(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnf
    public final Object a(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                return ((Boolean) obj2).booleanValue() ? Optional.of((Boolean) obj) : Optional.empty();
            case 1:
                aazt aaztVar = (aazt) obj;
                aazt aaztVar2 = (aazt) obj2;
                if (aaztVar.c == aaztVar2.c) {
                    zdk zdkVar = aaztVar.b;
                    zdk zdkVar2 = aaztVar2.b;
                    if (zdkVar != null && zdkVar2 != null) {
                        Float.valueOf(0.05f).getClass();
                        Rect rectV = xsc.v(zdkVar);
                        Rect rectV2 = xsc.v(zdkVar2);
                        Rect rect = new Rect();
                        if (rect.setIntersect(rectV, rectV2)) {
                            int iWidth = rectV.width() * rectV.height();
                            int iWidth2 = rectV2.width() * rectV2.height();
                            int iWidth3 = rect.width() * rect.height();
                            if (iWidth > 0 && iWidth2 > 0 && iWidth3 > 0) {
                                if (iWidth3 / Math.max(iWidth, iWidth2) > 0.95f) {
                                    return aaztVar;
                                }
                            }
                        }
                    }
                }
                return aaztVar2;
            case 2:
                List list = (List) obj;
                vun vunVar = (vun) obj2;
                agev agevVar = (agev) aguu.K(list);
                if (agevVar.g()) {
                    return Boolean.valueOf(((vob) agevVar.c()).K());
                }
                if (list.size() == 2) {
                    agev agevVar2 = (agev) list.get(0);
                    if (agevVar2.g() && ((vob) agevVar2.c()).K()) {
                        return Boolean.valueOf(vunVar != vun.d);
                    }
                }
                return Boolean.FALSE;
            case 3:
                return new Pair((Boolean) obj, (Integer) obj2);
            case 4:
                return a.G((Boolean) obj, (Boolean) obj2);
            case 5:
                String str = acoi.g;
                return a.F((Boolean) obj, (Boolean) obj2);
            case 6:
                String str2 = acoi.g;
                return a.G((Boolean) obj, (Boolean) obj2);
            default:
                return new agew((weo) obj, obj2);
        }
    }
}
