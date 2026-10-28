package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nwd {
    public static final Boolean b(List list, List list2) {
        list.getClass();
        list2.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return Boolean.valueOf(list2.size() == list.size());
    }

    public static final Boolean c(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        if (map.isEmpty()) {
            return null;
        }
        return Boolean.valueOf(map2.size() == map.size());
    }

    public static final List d(List list) {
        Bitmap bitmap;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pky pkyVar = (pky) it.next();
            if (pkyVar.g()) {
                ((agsj) ((agsj) pit.a.c()).j(pkyVar.f())).t("Failed to download image");
                bitmap = null;
            } else {
                bitmap = (Bitmap) pkyVar.d();
            }
            if (bitmap != null) {
                arrayList.add(bitmap);
            }
        }
        return arrayList;
    }

    public static final boolean e(aidq aidqVar) {
        int iAS = a.aS((aidqVar.c == 7 ? (aidg) aidqVar.d : aidg.a).f);
        return iAS != 0 && iAS == 2;
    }

    public static final boolean f(aidq aidqVar) {
        aidm aidmVar = (aidqVar.c == 27 ? (aidn) aidqVar.d : aidn.a).e;
        if (aidmVar == null) {
            aidmVar = aidm.a;
        }
        aieg aiegVar = aidmVar.d;
        if (aiegVar == null) {
            aiegVar = aieg.a;
        }
        String str = aiegVar.b;
        str.getClass();
        return str.length() > 0;
    }

    public static final boolean g(pky pkyVar) {
        pkyVar.getClass();
        return (pkyVar instanceof pku) && ((pku) pkyVar).a() == pkx.K;
    }

    public static final boolean h(aieg aiegVar) {
        aiegVar.getClass();
        String str = aiegVar.b;
        str.getClass();
        if (str.length() <= 0) {
            String str2 = aiegVar.d;
            str2.getClass();
            if (str2.length() <= 0) {
                return false;
            }
        }
        return true;
    }

    public static final boolean i(aidq aidqVar) {
        aidqVar.getClass();
        return auuw.i() || aidqVar.B;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(plb plbVar, awqg awqgVar, awoq awoqVar) throws Throwable {
        pif pifVar;
        Object pkvVar;
        if (awoqVar instanceof pif) {
            pifVar = (pif) awoqVar;
            int i = pifVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pifVar.b = i - Integer.MIN_VALUE;
            } else {
                pifVar = new pif(this, awoqVar);
            }
        } else {
            pifVar = new pif(this, awoqVar);
        }
        Object objP = pifVar.a;
        Object obj = awox.a;
        int i2 = pifVar.b;
        String str = "";
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    plb plbVar2 = pifVar.c;
                    atqp.j(objP);
                    return (pky) objP;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                plb plbVar3 = pifVar.c;
                atqp.j(objP);
                return (pky) objP;
            }
            atqp.j(objP);
            if (plbVar.f()) {
                pifVar.c = plbVar;
                pifVar.b = 1;
                objP = awqgVar.invoke(pifVar);
                if (objP == obj) {
                    return obj;
                }
                return (pky) objP;
            }
            long jA = plbVar.a();
            dnz dnzVar = new dnz(awqgVar, (awoq) null, 6);
            pifVar.c = plbVar;
            pifVar.b = 2;
            objP = avkz.p(jA, dnzVar, pifVar);
            if (objP == obj) {
                return obj;
            }
            return (pky) objP;
        } catch (awxi e) {
            agsj agsjVar = (agsj) ((agsj) pit.a.c()).j(e);
            if (!plbVar.f()) {
                str = " Remaining time: " + plbVar.a() + " ms";
            }
            agsjVar.w("Failed to download image due to timeout for thread.%s", str);
            pkvVar = new plc(e, pkx.K);
            return pkvVar;
        } catch (Exception e2) {
            agsj agsjVar2 = (agsj) ((agsj) pit.a.c()).j(e2);
            if (!plbVar.f()) {
                str = " Remaining time: " + plbVar.a() + " ms";
            }
            agsjVar2.w("Failed to download image for thread.%s", str);
            pkvVar = new pkv(e2, pkx.w);
            return pkvVar;
        }
    }
}
