package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zqe implements Function0 {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ zqe(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r11v29, types: [awmd, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object dovVar;
        tqj tqjVar;
        boolean zK = false;
        switch (this.$cid) {
            case 0:
                return Boolean.valueOf(((vxz) this.a.io()).l(75, 45759639L, false));
            case 1:
                return (Set) ((aupo) this.a).b;
            case 2:
                return Boolean.valueOf(((vxz) this.a.io()).l(94, 45768814L, false));
            case 3:
                dovVar = new dov((Collection) ((zqj) this.a).a.io());
                break;
            case 4:
                dovVar = new dov((Collection) ((aupo) ((zqj) this.a).b).b);
                break;
            case 5:
                int i = tqr.a;
                return Boolean.valueOf(this.a.k(1073830260));
            case 6:
                ?? r11 = this.a;
                if (r11 != 0 && (tqjVar = (tqj) r11.io()) != null) {
                    int i2 = tqr.a;
                    zK = tqjVar.k(1073830260);
                }
                return Boolean.valueOf(zK);
            case 7:
                try {
                    Object obj = ((aupo) ((xsc) this.a).a).b;
                    obj.getClass();
                    return (Set) obj;
                } catch (Exception e) {
                    twu.d("NetEventNotifierImpl", 6, "Failed to instantiate static RequestFinishedListeners from Provider", e);
                    return awnq.a;
                }
            case 8:
                return elq.H((elq) this.a);
            case 9:
                UrlResponseInfo responseInfo = ((RequestFinishedInfo) ((elq) this.a).a).getResponseInfo();
                if (responseInfo == null) {
                    return null;
                }
                dovVar = new elq(responseInfo);
                break;
                break;
            case 10:
                List allHeadersAsList = ((UrlResponseInfo) ((elq) this.a).a).getAllHeadersAsList();
                if (allHeadersAsList == null) {
                    return awnp.a;
                }
                ArrayList<Map.Entry> arrayList = new ArrayList();
                for (Object obj2 : allHeadersAsList) {
                    if (((Map.Entry) obj2).getKey() != null) {
                        arrayList.add(obj2);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : arrayList) {
                    Object key = entry.getKey();
                    key.getClass();
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = ((String) key).toLowerCase(locale);
                    lowerCase.getClass();
                    Object arrayList2 = linkedHashMap.get(lowerCase);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(lowerCase, arrayList2);
                    }
                    ((List) arrayList2).add((String) entry.getValue());
                }
                return linkedHashMap;
            case 11:
                return ((UrlResponseInfo) ((elq) this.a).a).getAllHeadersAsList();
            case 12:
                return (alvt) wjr.F(((aoop) this.a).getPlayerResponseBytes().G(), alvt.a);
            case 13:
                return ((abqh) this.a).a();
            case 14:
                abql abqlVar = (abql) this.a;
                abqk abqkVar = new abqk(abqlVar, abqlVar.l, abqlVar.d, abqlVar.k);
                abqkVar.o(abqlVar.e);
                xir xirVar = abqlVar.h;
                abqkVar.x = new acsa(xirVar, 1);
                abmt abmtVar = abqlVar.c;
                agev agevVarA = abmtVar.bh() ? abqx.a(abqlVar.b) : abrg.f(abqlVar.b);
                ypp yppVarE = abqlVar.a.e();
                yppVarE.h = abqkVar;
                yppVarE.l(alyi.a);
                yppVarE.g = new ablq(3);
                yppVarE.f = new wvb(13);
                agke agkeVar = abqlVar.g;
                ArrayList arrayList3 = new ArrayList(atqq.N(agkeVar, 10));
                Iterator<E> it = agkeVar.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((abqh) it.next()).b);
                }
                yppVarE.m(aguu.V(arrayList3));
                if (agevVarA.g()) {
                    yppVarE.i = agevVarA.c();
                }
                wlo wloVarK = yppVarE.k();
                if (abmtVar.g.l(372, 45772645L, false)) {
                    wloVarK.V();
                }
                return new abqj(abqlVar, abqlVar.f, yppVarE, wloVarK, xirVar);
            case 15:
                return ((aclf) this.a).d(700);
            case 16:
                return ((aclf) this.a).d(300);
            case 17:
                return ((aclf) this.a).d(400);
            case 18:
                return ((aclf) this.a).d(500);
            case 19:
                return ((aclf) this.a).d(600);
            default:
                return ((aclf) this.a).d(800);
        }
        return dovVar;
    }
}
