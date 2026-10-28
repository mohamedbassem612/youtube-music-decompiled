package defpackage;

import android.text.TextUtils;
import com.google.protobuf.MessageLite;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wwv extends adks {
    private int i;
    private final acyx j;
    private final awmd k;
    private final Optional l;
    public final ArrayList a = new ArrayList();
    private final ArrayList d = new ArrayList();
    private final Map e = new HashMap();
    private final Map f = new HashMap();
    private final Map g = new HashMap();
    private final Map h = new HashMap();
    public int b = -1;
    public final adlz c = new gob(this, 16);

    public wwv(acyx acyxVar, awmd awmdVar, xgn xgnVar, vxz vxzVar) {
        this.i = 50;
        this.j = acyxVar;
        this.k = awmdVar;
        this.l = Optional.of(xgnVar);
        if (vxzVar.m(19, 45783166L)) {
            this.i = 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, xgn] */
    private final synchronized void D(String str, Object obj) {
        if (obj instanceof akrn) {
            akrn akrnVar = (akrn) obj;
            Optional optional = this.l;
            vrl vrlVar = new vrl(akrnVar, 18);
            optional.isPresent();
            optional.get().d(new xgj(((akrn) vrlVar.a).d, (amud) null));
            obj = this.j.c(akrnVar);
        }
        this.e.put(str, obj);
    }

    private final synchronized void E(String str, ajwo ajwoVar, alay alayVar, alay alayVar2, alay alayVar3, wer werVar, boolean z) {
        apji apjiVar;
        Object obj = this.e.get(str);
        if (obj instanceof amox) {
            r(str, z);
            return;
        }
        if (obj instanceof amou) {
            amou amouVar = (amou) obj;
            if ((amouVar.b & 8) != 0) {
                apjiVar = amouVar.d;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
            } else {
                apjiVar = null;
            }
            if (apjiVar != null) {
                MessageLite messageLiteR = aavv.r(apjiVar);
                if (!(messageLiteR instanceof ampd) && !(messageLiteR instanceof amoz) && !(messageLiteR instanceof ampe) && !(messageLiteR instanceof amox) && !(messageLiteR instanceof amoy) && !(messageLiteR instanceof ampq) && !(messageLiteR instanceof amou) && !(messageLiteR instanceof ampc) && !(messageLiteR instanceof ampa) && !(messageLiteR instanceof ampr) && !(messageLiteR instanceof amov) && !(messageLiteR instanceof akrn)) {
                    messageLiteR = null;
                }
                G(str, messageLiteR, z);
            }
        }
        int iIndexOf = this.a.indexOf(str);
        if (iIndexOf >= 0) {
            if (obj instanceof acxm) {
                String string = ackj.k(null, alayVar, null, false).toString();
                String string2 = ackj.k(null, alayVar2, null, false).toString();
                String string3 = ackj.k(null, alayVar3, null, false).toString();
                String strG = wfs.g(176, str);
                this.d.add(strG);
                aqzn aqznVarE = aqzp.e(strG);
                aqznVarE.am(string);
                aqznVarE.an(Integer.valueOf(string.length()));
                aqznVarE.aq(Boolean.FALSE);
                if (!string2.isEmpty()) {
                    aqznVarE.ar(string2);
                    aqznVarE.as(Integer.valueOf(string2.length()));
                }
                if (!string3.isEmpty()) {
                    aqznVarE.ao(string3);
                    aqznVarE.ap(Integer.valueOf(string3.length()));
                }
                this.k.io();
                werVar.e(aqznVarE.at());
            } else {
                this.f.put(str, ajwoVar);
            }
            if (z) {
                y(iIndexOf, 1);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, wek] */
    private final synchronized void F(int i, boolean z) {
        ArrayList arrayList = this.a;
        if (i > arrayList.size()) {
            i = arrayList.size();
        }
        if (i > 0) {
            ?? Io = this.k.io();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                String str = (String) arrayList.get(i2);
                Map map = this.e;
                v(map.get(str), Io.e());
                map.remove(str);
                this.f.remove(str);
            }
            arrayList.subList(0, i).clear();
            if (z) {
                A(0, i);
            }
        }
    }

    private final synchronized boolean G(String str, Object obj, boolean z) {
        boolean z2;
        String strDP;
        z2 = false;
        if (obj != null) {
            ArrayList arrayList = this.a;
            int iIndexOf = arrayList.indexOf(str);
            Map map = this.e;
            if (map.containsKey(str) && iIndexOf >= 0 && (strDP = yno.dP(obj)) != null) {
                map.remove(str);
                this.f.remove(str);
                D(strDP, obj);
                arrayList.set(iIndexOf, strDP);
                z2 = true;
                if (z) {
                    y(iIndexOf, 1);
                }
            }
        }
        return z2;
    }

    public static final void v(Object obj, wer werVar) {
        if (obj instanceof acxm) {
            akro akroVar = ((acxm) obj).a.c;
            if (akroVar == null) {
                akroVar = akro.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aomj.b);
            akroVar.c(aihlVarCheckIsLite);
            Object objK = akroVar.j.k(aihlVarCheckIsLite.d);
            Iterable$EL.forEach(((aomj) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c, new vnm(werVar, 7));
            werVar.b();
        }
    }

    @Override // defpackage.adkz
    public final synchronized int a() {
        return this.a.size();
    }

    public final synchronized int b(int i) {
        String str = (String) this.a.get(i);
        if (str == null) {
            return 0;
        }
        return ((Integer) this.g.get(str)).intValue();
    }

    @Override // defpackage.adkz
    public final long c(int i) {
        return i;
    }

    @Override // defpackage.adkz
    public final synchronized boolean contains(Object obj) {
        return this.e.containsValue(obj);
    }

    @Override // defpackage.adkz
    public final synchronized Object d(int i) {
        return this.e.get((String) this.a.get(i));
    }

    public final synchronized ajwo g(String str) {
        return (ajwo) this.f.get(str);
    }

    public final synchronized Object i(String str) {
        return this.e.get(str);
    }

    @Override // defpackage.adkz
    public final synchronized boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final synchronized void k(amow amowVar, boolean z) {
        Object objDM = yno.dM(amowVar);
        String strDP = yno.dP(objDM);
        if (strDP != null && !this.e.containsKey(strDP)) {
            if (objDM != null) {
                D(strDP, objDM);
                this.a.add(strDP);
                if (z) {
                    x(a() - 1);
                }
            }
            if (this.b > 0) {
                int iA = a();
                int i = this.b;
                int i2 = this.i;
                if (iA >= i + i2) {
                    F(i2, z);
                }
            }
        }
    }

    public final synchronized void l(String str, String str2) {
        this.h.put(str, str2);
    }

    public final synchronized void m(amow amowVar, int i) {
        String strDP = yno.dP(yno.dM(amowVar));
        if (strDP != null) {
            Map map = this.g;
            if (!map.containsKey(strDP)) {
                map.put(strDP, Integer.valueOf(i));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, wek] */
    public final synchronized void n(ajwo ajwoVar, boolean z) throws Throwable {
        Throwable th;
        wwv wwvVar;
        Object objC;
        try {
            try {
                wer werVarE = this.k.io().e();
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ammr.b);
                ajwoVar.c(aihlVarCheckIsLite);
                if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    wwvVar = this;
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amms.b);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(amms.b);
                        ajwoVar.c(aihlVarCheckIsLite3);
                        Object objK = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                        amms ammsVar = (amms) (objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK));
                        String str = ammsVar.g;
                        int i = 0;
                        while (true) {
                            ArrayList arrayList = wwvVar.a;
                            if (i >= arrayList.size()) {
                                break;
                            }
                            String str2 = (String) arrayList.get(i);
                            if (TextUtils.equals(str, yno.dN(wwvVar.e.get(str2)))) {
                                alay alayVar = ammsVar.d;
                                if (alayVar == null) {
                                    alayVar = alay.a;
                                }
                                alay alayVar2 = alayVar;
                                alay alayVar3 = ammsVar.e;
                                if (alayVar3 == null) {
                                    alayVar3 = alay.a;
                                }
                                alay alayVar4 = alayVar3;
                                alay alayVar5 = ammsVar.f;
                                if (alayVar5 == null) {
                                    alayVar5 = alay.a;
                                }
                                wwvVar.E(str2, ajwoVar, alayVar2, alayVar4, alayVar5, werVarE, z);
                            }
                            i++;
                        }
                    }
                } else {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ammr.b);
                    ajwoVar.c(aihlVarCheckIsLite4);
                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                    if (objK2 == null) {
                        try {
                            objC = aihlVarCheckIsLite4.b;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        objC = aihlVarCheckIsLite4.c(objK2);
                    }
                    ammr ammrVar = (ammr) objC;
                    String str3 = ammrVar.g;
                    alay alayVar6 = ammrVar.d;
                    if (alayVar6 == null) {
                        alayVar6 = alay.a;
                    }
                    alay alayVar7 = alayVar6;
                    alay alayVar8 = ammrVar.e;
                    if (alayVar8 == null) {
                        alayVar8 = alay.a;
                    }
                    alay alayVar9 = alayVar8;
                    alay alayVar10 = ammrVar.f;
                    if (alayVar10 == null) {
                        alayVar10 = alay.a;
                    }
                    wwvVar = this;
                    wwvVar.E(str3, ajwoVar, alayVar7, alayVar9, alayVar10, werVarE, z);
                }
                werVarE.b().G();
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    public final synchronized void o() {
        w();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, wek] */
    public final synchronized void p() {
        this.a.clear();
        awmd awmdVar = this.k;
        Object objIo = awmdVar.io();
        Map map = this.e;
        Iterable$EL.forEach(map.values(), new vnm(objIo, 6));
        map.clear();
        this.f.clear();
        this.g.clear();
        wer werVarE = awmdVar.io().e();
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            aqzn aqznVarE = aqzp.e(str);
            aqznVarE.aq(Boolean.TRUE);
            werVarE.e(aqznVarE.at());
            werVarE.j(str);
        }
        werVarE.b().G();
        arrayList.clear();
        w();
    }

    public final synchronized void q(String str, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                String str2 = (String) arrayList.get(size);
                Map map = this.e;
                if (TextUtils.equals(str, yno.dN(map.get(str2)))) {
                    map.remove(str2);
                    arrayList.remove(str2);
                    this.f.remove(str2);
                    if (z) {
                        B(size);
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public final synchronized void r(String str, boolean z) {
        ArrayList arrayList = this.a;
        int iIndexOf = arrayList.indexOf(str);
        if (iIndexOf >= 0) {
            this.e.remove(str);
            arrayList.remove(str);
            this.f.remove(str);
            if (z) {
                B(iIndexOf);
            }
        }
    }

    public final synchronized boolean s(int i) {
        ArrayList arrayList = this.a;
        if (i >= arrayList.size()) {
            return false;
        }
        return this.g.containsKey((String) arrayList.get(i));
    }

    public final boolean t(String str, amow amowVar, boolean z) {
        return G(str, yno.dM(amowVar), z);
    }

    public final synchronized void u(String str, ajwo ajwoVar, boolean z) {
        int iIndexOf;
        String str2 = (String) j$.util.Map.EL.getOrDefault(this.h, str, str);
        if (this.e.containsKey(str2) && G(str2, i(str2), z) && (iIndexOf = this.a.indexOf(str2)) >= 0) {
            this.f.put(str2, ajwoVar);
            if (z) {
                y(iIndexOf, 1);
            }
        }
    }
}
