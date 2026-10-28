package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.protos.youtube.api.innertube.AssetDetail;
import com.google.research.xeno.effect.Effect;
import internal.org.jni_zero.CommonApis;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class van extends uhv implements vam {
    public final val b;
    public final vbf c;
    public final Object d;
    public final ArrayList e;
    public final HashMap f;
    public final zf g;
    private final zvl h;
    private final uys i;
    private final vxe j;
    private avmn k;
    private final awku l;
    private final ahgb m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public van(zvl zvlVar, cc ccVar, uys uysVar, vxe vxeVar, ahgb ahgbVar, val valVar, vbf vbfVar, zf zfVar) {
        super(ccVar, false);
        zvlVar.getClass();
        ccVar.getClass();
        vxeVar.getClass();
        valVar.getClass();
        zfVar.getClass();
        this.h = zvlVar;
        this.i = uysVar;
        this.j = vxeVar;
        this.m = ahgbVar;
        this.b = valVar;
        this.c = vbfVar;
        this.g = zfVar;
        this.d = new Object();
        this.l = new awku();
        this.e = new ArrayList();
        this.f = new HashMap();
    }

    private static final ajwo m(String str, uzz uzzVar) {
        String str2;
        aihf aihfVarCreateBuilder = ajfx.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        if (uzzVar != null && (str2 = uzzVar.f) != null && str2.length() > 0) {
            aihfVarCreateBuilder.copyOnWrite();
            ajfx ajfxVar = (ajfx) aihfVarCreateBuilder.instance;
            ajfxVar.c |= 1;
            ajfxVar.e = str2;
        }
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = ajfx.b;
        aihfVarCreateBuilder.aM(str);
        aihhVar.e(aihlVar, aihfVarCreateBuilder.build());
        aihn aihnVarBuild = aihhVar.build();
        aihnVarBuild.getClass();
        return (ajwo) aihnVarBuild;
    }

    @Override // defpackage.uzk
    public final avlh a() {
        return this.l.p();
    }

    @Override // defpackage.uzx
    public final void b() {
        awri awriVar = new awri();
        synchronized (this.d) {
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                awriVar.a = true;
            }
            arrayList.clear();
            this.f.clear();
        }
        this.b.c(new efi(awriVar, this, 5, null));
    }

    @Override // defpackage.uzx
    public final void c(String str) {
        agke agkeVarT;
        agkj agkjVarU;
        str.getClass();
        synchronized (this.d) {
            ArrayList arrayList = this.e;
            Iterator it = arrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                String str2 = (String) next;
                HashMap map = this.f;
                uzz uzzVar = (uzz) map.get(str2);
                if (uzzVar != null && TextUtils.equals(uzzVar.f, str)) {
                    map.remove(str2);
                    it.remove();
                }
            }
            agkeVarT = aguu.T(arrayList);
            agkjVarU = aguu.U(this.f);
        }
        this.b.d(str, agkeVarT, agkjVarU, new pbm(this, 8));
    }

    @Override // defpackage.uhv
    public final void d() {
        Object obj = this.k;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
        this.b.e();
        uys uysVar = this.i;
        Iterator it = uysVar.h.values().iterator();
        while (it.hasNext()) {
            Effect effect = ((uyr) it.next()).a;
            ReentrantReadWriteLock reentrantReadWriteLock = effect.c;
            reentrantReadWriteLock.writeLock().lock();
            try {
                long j = effect.a;
                if (j != 0) {
                    Effect.d.v(Effect.nativeGetEffectAddress(j));
                    effect.nativeRelease(effect.a);
                }
                effect.a = 0L;
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                effect.c.writeLock().unlock();
                throw th;
            }
        }
        uysVar.h.clear();
    }

    @Override // defpackage.uzx
    public final void e(String str) {
        Object obj;
        agke agkeVarT;
        agkj agkjVarU;
        str.getClass();
        synchronized (this.d) {
            obj = this.f.get(str);
        }
        if (obj == null) {
            zvl zvlVar = this.h;
            zvj zvjVarA = zvk.a();
            zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
            zvjVarA.j = 40;
            zvjVarA.i = 397;
            zvjVarA.d("[Creation][Android][Effects]Skipping deselectEffectAsset with unknown asset ID: ".concat(str));
            zvlVar.a(zvjVarA.a());
            return;
        }
        synchronized (this.d) {
            uys uysVar = this.i;
            uyr uyrVarA = uysVar.a(str);
            arlj arljVarFA = uyrVarA != null ? yno.fA(uyrVarA) : null;
            if (arljVarFA == null) {
                this.e.remove(str);
                this.f.remove(str);
            } else {
                aldh aldhVarFz = yno.fz(arljVarFA);
                aldi aldiVarA = aldi.a(arljVarFA.f);
                if (aldiVarA == null) {
                    aldiVarA = aldi.XENO_EFFECT_RENDERING_PRIORITY_UNKNOWN;
                }
                Iterator it = this.e.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    String str2 = (String) next;
                    uyr uyrVarA2 = uysVar.a(str2);
                    arlj arljVarFA2 = uyrVarA2 != null ? yno.fA(uyrVarA2) : null;
                    if (arljVarFA2 != null && yno.fz(arljVarFA2) == aldhVarFz) {
                        aldi aldiVarA2 = aldi.a(arljVarFA2.f);
                        if (aldiVarA2 == null) {
                            aldiVarA2 = aldi.XENO_EFFECT_RENDERING_PRIORITY_UNKNOWN;
                        }
                        if (aldiVarA2 == aldiVarA) {
                            it.remove();
                            this.f.remove(str2);
                        }
                    }
                    if (TextUtils.equals(str2, str)) {
                        break;
                    }
                }
            }
            agkeVarT = aguu.T(this.e);
            agkjVarU = aguu.U(this.f);
        }
        this.b.a(str, agkeVarT, agkjVarU, new pbm(this, 9));
    }

    @Override // defpackage.uzx
    public final void f(uzz uzzVar) {
        ArrayList arrayList;
        agke agkeVarT;
        agkj agkjVarU;
        Object next;
        String str = uzzVar.a;
        if (TextUtils.isEmpty(str)) {
            zvl zvlVar = this.h;
            zvj zvjVarA = zvk.a();
            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA.j = 40;
            zvjVarA.i = 397;
            zvjVarA.d("[Creation][Android][Effects]selectEffectAsset with null/empty id");
            zvlVar.a(zvjVarA.a());
            return;
        }
        synchronized (this.d) {
            ArrayList arrayList2 = this.e;
            arrayList2.remove(str);
            arrayList2.add(str);
            HashMap map = this.f;
            map.put(str, uzzVar);
            arrayList = new ArrayList();
            ahgb ahgbVar = this.m;
            String strT = ahgbVar.t(uzzVar);
            uys uysVar = this.i;
            uyr uyrVarA = uysVar.a(str);
            arlj arljVarFA = uyrVarA != null ? yno.fA(uyrVarA) : null;
            aldh aldhVarFz = arljVarFA != null ? yno.fz(arljVarFA) : null;
            str.getClass();
            uzw uzwVar = new uzw(str, strT, aldhVarFz);
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next2 = it.next();
                next2.getClass();
                String str2 = (String) next2;
                if (!awrc.c(str2, str)) {
                    uyr uyrVarA2 = uysVar.a(str2);
                    arlj arljVarFA2 = uyrVarA2 != null ? yno.fA(uyrVarA2) : null;
                    arrayList3.add(new uzw(str2, ahgbVar.t((uzz) map.get(str2)), arljVarFA2 != null ? yno.fz(arljVarFA2) : null));
                    str = str;
                }
            }
            for (String str3 : ahgbVar.u(arrayList3, uzwVar)) {
                arrayList2.remove(str3);
                uzz uzzVar2 = (uzz) map.remove(str3);
                Iterator it2 = arrayList3.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!awrc.c(((uzw) next).a, str3));
                uzw uzwVar2 = (uzw) next;
                if (ahgbVar.y(uzwVar2 != null ? uzwVar2.b : null, strT)) {
                    arrayList.add(m(str3, uzzVar2));
                }
            }
            if (!arrayList.isEmpty()) {
                ahgbVar.z(strT);
            }
            agkeVarT = aguu.T(arrayList2);
            agkjVarU = aguu.U(map);
        }
        if (!arrayList.isEmpty()) {
            this.j.b(arrayList);
        }
        this.b.b(uzzVar, agkeVarT, agkjVarU, new pbm(this, 7));
    }

    @Override // defpackage.uhv
    public final void j(View view) {
        this.k = this.i.b().ak(new usn(new uwk(this, 6), 18));
        this.b.g(this);
    }

    public final void l(List list) {
        boolean z;
        Object next;
        Object arrayList = new ArrayList();
        agke agkeVarG = agpi.a;
        agkeVarG.getClass();
        Object obj = this.d;
        synchronized (obj) {
            if (!list.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                if (list.isEmpty()) {
                    z = false;
                } else {
                    Object objK = aguu.K(list);
                    objK.getClass();
                    String str = (String) objK;
                    ahgb ahgbVar = this.m;
                    HashMap map = this.f;
                    String strT = ahgbVar.t((uzz) map.get(str));
                    z = ahgbVar.z(strT);
                    uys uysVar = this.i;
                    uyr uyrVarA = uysVar.a(str);
                    arlj arljVarFA = uyrVarA != null ? yno.fA(uyrVarA) : null;
                    uzw uzwVar = new uzw(str, strT, arljVarFA != null ? yno.fz(arljVarFA) : null);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (!awrc.c(str2, str)) {
                            uyr uyrVarA2 = uysVar.a(str2);
                            arlj arljVarFA2 = uyrVarA2 != null ? yno.fA(uyrVarA2) : null;
                            arrayList3.add(new uzw(str2, ahgbVar.t((uzz) map.get(str2)), arljVarFA2 != null ? yno.fz(arljVarFA2) : null));
                        }
                    }
                    for (String str3 : ahgbVar.u(arrayList3, uzwVar)) {
                        list.remove(str3);
                        uzz uzzVar = (uzz) map.remove(str3);
                        Iterator it2 = arrayList3.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!awrc.c(((uzw) next).a, str3));
                        uzw uzwVar2 = (uzw) next;
                        if (ahgbVar.y(uzwVar2 != null ? uzwVar2.b : null, strT)) {
                            arrayList2.add(m(str3, uzzVar));
                        }
                    }
                }
                awml awmlVar = new awml(arrayList2, Boolean.valueOf(z));
                arrayList = awmlVar.a;
                ((Boolean) awmlVar.b).booleanValue();
                agjz agjzVar = new agjz(4);
                synchronized (obj) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        String str4 = (String) it3.next();
                        uzz uzzVar2 = (uzz) this.f.get(str4);
                        uyr uyrVarA3 = this.i.a(str4);
                        if (uyrVarA3 == null) {
                            avbm avbmVarA = uzj.a();
                            avbmVarA.g = null;
                            agjzVar.h(avbmVarA.a());
                        } else {
                            ajhv ajhvVar = uyrVarA3.b;
                            if (ajhvVar != null && uzzVar2 != null) {
                                String str5 = ajhvVar.e;
                                str5.getClass();
                                AssetDetail defaultInstance = ajhvVar.d;
                                if (defaultInstance == null) {
                                    defaultInstance = AssetDetail.getDefaultInstance();
                                }
                                int iG = CommonApis.g(defaultInstance.d);
                                if (iG == 0) {
                                    iG = 1;
                                }
                                atte atteVar = uyrVarA3.e;
                                if (atteVar == null) {
                                    atteVar = atte.a;
                                    atteVar.getClass();
                                }
                                avbm avbmVarA2 = uzj.a();
                                avbmVarA2.g = uyrVarA3.a;
                                avbmVarA2.c(yno.fR(str4, str5, iG));
                                avbmVarA2.f = yno.fK(str5, iG);
                                avbmVarA2.i = ajhvVar;
                                avbmVarA2.d = uyrVarA3.c;
                                avbmVarA2.b(uyrVarA3.d);
                                avbmVarA2.d(atteVar);
                                avbmVarA2.a = uyrVarA3.f;
                                avbmVarA2.b = uzzVar2.g;
                                agjzVar.h(avbmVarA2.a());
                            }
                        }
                    }
                    agkeVarG = agjzVar.g();
                    agkeVarG.getClass();
                }
            }
        }
        if (!((Collection) arrayList).isEmpty()) {
            this.j.b((List) arrayList);
        }
        agke agkeVarFE = yno.fE(agkeVarG);
        agkeVarFE.getClass();
        this.l.kk(agkeVarFE);
    }
}
