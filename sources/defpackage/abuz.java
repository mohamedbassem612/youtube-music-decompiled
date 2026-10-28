package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abuz {
    public Object a;
    public final Object b;

    public abuz(String str, String str2, zru zruVar, zrv zrvVar, boolean z, Context context) {
        this.a = zse.a;
        HashMap map = new HashMap();
        map.put("cplatform", zruVar.k);
        map.put("c", zrvVar.u);
        int i = typ.a;
        if (str2.isEmpty()) {
            throw new IllegalArgumentException();
        }
        map.put("cver", str2);
        map.put("cos", "Android");
        map.put("cosver", Build.VERSION.RELEASE);
        boolean zEquals = "REL".equals(Build.VERSION.CODENAME);
        int i2 = Build.VERSION.SDK_INT;
        map.put("csdk", Integer.toString(zEquals ? i2 : i2 + 1));
        if (str.isEmpty()) {
            throw new IllegalArgumentException();
        }
        map.put("cbr", str);
        map.put("cbrver", str2);
        map.put("cbrand", Build.MANUFACTURER);
        String str3 = Build.MODEL;
        str3.getClass();
        map.put("cmodel", str3);
        map.put("cff", tym.H(context, z).name());
        map.put("soc", tym.J().replace(';', ':'));
        this.b = agkj.h(map);
    }

    public final void a() {
        Object obj = this.a;
        if (obj != null) {
            ((abtn) obj).b();
            this.a = null;
        }
    }

    public final boolean b() {
        return this.a != null;
    }

    public final ValueAnimator c() {
        Object obj = this.a;
        if (obj != null) {
            return (ValueAnimator) obj;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(650L);
        ((ValueAnimator) this.a).setRepeatCount(0);
        ((ValueAnimator) this.a).addUpdateListener(new gga(this, 3));
        ((ValueAnimator) this.a).addListener(new abku(this));
        return (ValueAnimator) this.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zse] */
    public final agkj d(String str) {
        zsf zsfVarA = this.a.a(str);
        return zsfVarA == null ? agpn.b : agkj.j("cplayer", zsfVarA.name());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final agkj e(String str) {
        agkj agkjVarD = d(str);
        boolean zIsEmpty = agkjVarD.isEmpty();
        ?? r3 = this.b;
        if (zIsEmpty) {
            return agkj.h(r3);
        }
        HashMap map = new HashMap(r3.size() + ((agpn) agkjVarD).d);
        map.putAll(r3);
        map.putAll(agkjVarD);
        return agkj.h(map);
    }

    public final void f(tyt tytVar) {
        agqr it = ((agkj) this.b).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            tytVar.f((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final void g(String str, tyt tytVar) {
        agqr it = e(str).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            tytVar.f((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final wgg h() {
        if (!m()) {
            return null;
        }
        ?? r1 = this.b;
        return (wgg) r1.get(r1.size() - 1);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public final wgg i(int i, int i2) {
        wgg wggVar = null;
        if (m() && i >= 0 && i2 >= 0) {
            int i3 = 0;
            for (wgg wggVar2 : this.b) {
                int i4 = i - wggVar2.a;
                int i5 = i2 - wggVar2.b;
                int i6 = (i4 * i4) + (i5 * i5);
                if (wggVar == null || i6 < i3) {
                    wggVar = wggVar2;
                    i3 = i6;
                }
            }
        }
        return wggVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final wgg j(int i) {
        if (!m()) {
            return null;
        }
        if (i <= 0) {
            return k();
        }
        for (wgg wggVar : this.b) {
            if (wggVar.a >= i) {
                return wggVar;
            }
        }
        return h();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final wgg k() {
        if (m()) {
            return (wgg) this.b.get(0);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final aqmh l() {
        if (this.a == null) {
            aihh aihhVar = (aihh) aqmh.a.createBuilder();
            ?? r1 = this.b;
            int size = r1.size();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    aihf aihfVarCreateBuilder = aqmg.a.createBuilder();
                    int i2 = ((wgg) r1.get(i)).a;
                    aihfVarCreateBuilder.copyOnWrite();
                    aqmg aqmgVar = (aqmg) aihfVarCreateBuilder.instance;
                    aqmgVar.b |= 2;
                    aqmgVar.d = i2;
                    int i3 = ((wgg) r1.get(i)).b;
                    aihfVarCreateBuilder.copyOnWrite();
                    aqmg aqmgVar2 = (aqmg) aihfVarCreateBuilder.instance;
                    aqmgVar2.b |= 4;
                    aqmgVar2.e = i3;
                    String string = ((wgg) r1.get(i)).a().toString();
                    aihfVarCreateBuilder.copyOnWrite();
                    aqmg aqmgVar3 = (aqmg) aihfVarCreateBuilder.instance;
                    string.getClass();
                    aqmgVar3.b |= 1;
                    aqmgVar3.c = string;
                    aihhVar.x(aihfVarCreateBuilder);
                }
            }
            this.a = (aqmh) aihhVar.build();
        }
        return (aqmh) this.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final boolean m() {
        return !this.b.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [axsp, java.lang.Object] */
    public final acrx n(abtu abtuVar) {
        abnl abnlVarB;
        xir xirVar;
        taq.d();
        Object obj = this.a;
        if (obj == null) {
            return null;
        }
        abtn abtnVar = (abtn) obj;
        abtnVar.e();
        abtt abttVar = abtuVar.e;
        abmt abmtVar = abtnVar.a;
        abmg abmgVar = abttVar.g;
        aoqb aoqbVarCn = abmt.cn(abmtVar.c);
        if (aoqbVarCn == null || !aoqbVarCn.i) {
            abmg[] abmgVarArr = {abmg.b, abmg.c, abmg.d, abmg.e};
            for (int i = 0; i < 4; i++) {
                if (abmgVar == abmgVarArr[i]) {
                    abtnVar.e.c.kk(new aayf());
                    break;
                }
            }
        }
        abnp abnpVar = abtuVar.g;
        if (abnpVar != null && (xirVar = abnpVar.b) != null) {
            xirVar.k();
        }
        abtnVar.f(abmgVar);
        abnl abnlVar = abtuVar.f;
        if (abnlVar != null) {
            abtnVar.g(abnlVar.u());
        }
        boolean z = abttVar != abtt.AUTOPLAY;
        if (abmtVar.h.l(80, 45430041L, false)) {
            abnlVarB = acui.b(abtuVar);
            if (abnlVarB != null) {
                abnlVarB.z(abnlVar);
            }
        } else {
            abnl abnlVarB2 = acui.b(abtuVar);
            if (!abtnVar.c(abtuVar) || abnlVarB2 == null) {
                abnw abnwVar = abtnVar.c.h;
                abnlVarB = null;
            } else {
                abnlVarB2.z(abnlVar);
                abnlVarB = abnlVarB2;
            }
        }
        if (abnlVarB == null) {
            return null;
        }
        if (abnpVar == null) {
            abnpVar = abnp.a;
        }
        return new acrx(abnlVarB, abnpVar, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    public final void o(Object obj, ajbf ajbfVar) {
        if (obj != null) {
            if (ajbfVar != ajbf.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_ADS_DEBOUNCE) {
                ovo ovoVar = (ovo) this.b.io();
                Object obj2 = ovoVar.c;
                if (obj2 == null || ((agke) obj2).isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    aizq aizqVarD = ovoVar.d();
                    if (aizqVarD != null) {
                        Iterator<E> it = new aihx(aizqVarD.d, aizq.a).iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((ajbf) it.next()).f));
                        }
                    }
                    ovoVar.c = agke.n(arrayList);
                }
                if (!ovoVar.c.contains(Integer.valueOf(ajbfVar.f))) {
                    return;
                }
            }
            this.a = obj;
        }
    }

    public abuz(List list) {
        this.a = null;
        this.b = list;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [axso, java.lang.Object] */
    public abuz(ahto ahtoVar, abwk abwkVar, vuk vukVar, vog vogVar) {
        avlh avlhVarG = avlh.g(vukVar.m, vogVar.m, abwkVar.c, new vqp(1));
        int i = 14;
        int i2 = 8;
        this.b = avlhVarG.x(new jna(i)).H(new tfk(i2)).p().ac(((avlh) ahtoVar.b).x(new jna(i)).H(new tfk(i2)), new idi(5)).S();
    }

    public abuz(Uri... uriArr) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new wgg(uriArr[0], 0, 0));
        this.a = null;
    }

    public abuz(Object obj) {
        this.b = obj;
    }

    public abuz() {
        this.a = null;
        this.b = Collections.EMPTY_LIST;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    public abuz(aqmh aqmhVar) {
        this.a = aqmhVar;
        if (aqmhVar != null) {
            this.b = new ArrayList(aqmhVar.c.size());
            Iterator it = aqmhVar.c.iterator();
            while (it.hasNext()) {
                this.b.add(new wgg((aqmg) it.next()));
            }
            return;
        }
        this.b = Collections.EMPTY_LIST;
    }
}
