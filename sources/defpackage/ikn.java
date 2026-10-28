package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import app.rive.semantics.SemanticState;
import com.google.cardboard.sdk.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ikn extends adtv implements advc, iyx, adwk {
    private boolean A;
    private final vxz B;
    private abh C;
    public List a;
    public final admu b;
    public final awmd c;
    public final avmb d;
    public adww e;
    public final avmm f;
    public Object g;
    public boolean h;
    public volatile afyh i;
    public volatile boolean j;
    public final vxz k;
    private final tbt l;
    private anuz m;
    private final wby n;
    private final adlq o;
    private final admu p;
    private final admu q;
    private final admu r;
    private final admu s;
    private final admu t;
    private final awmd u;
    private int v;
    private Object w;
    private final Executor x;
    private final Context y;
    private final AccessibilityManager z;

    public ikn(anuz anuzVar, wnf wnfVar, xgn xgnVar, adxd adxdVar, adww adwwVar, awmd awmdVar, tbt tbtVar, ttm ttmVar, Executor executor, avmb avmbVar, vxz vxzVar, awmd awmdVar2, Context context, AccessibilityManager accessibilityManager, wbz wbzVar, zwb zwbVar, vxz vxzVar2) {
        super(adxd.a(adxdVar), wnfVar, tbtVar, new Object(), ttmVar, xgnVar);
        this.A = false;
        avmm avmmVar = new avmm();
        this.f = avmmVar;
        this.l = tbtVar;
        this.m = anuzVar;
        adlq adlqVar = new adlq(false);
        this.o = adlqVar;
        admu admuVar = new admu();
        this.p = admuVar;
        admu admuVar2 = new admu();
        this.b = admuVar2;
        this.q = new admu();
        this.r = new admu();
        this.s = new admu();
        this.t = new admu();
        adlqVar.e(new hde(7));
        this.c = awmdVar;
        this.x = executor;
        this.d = avmbVar;
        this.B = vxzVar;
        this.k = vxzVar2;
        this.u = awmdVar2;
        this.y = context;
        this.z = accessibilityManager;
        this.e = adwwVar;
        wby wbyVarB = wbzVar.e(zwbVar.e());
        this.n = wbyVarB;
        tbtVar.f(this);
        u();
        int i = 2;
        if (adxdVar instanceof ikl) {
            ikl iklVar = (ikl) adxdVar;
            this.m = iklVar.a;
            this.a = iklVar.b;
            this.C = iklVar.g;
            this.v = iklVar.c;
            this.w = iklVar.d;
            this.g = iklVar.e;
            this.h = iklVar.f;
            apji apjiVar = this.m.e;
            y(apjiVar == null ? apji.a : apjiVar);
            admuVar2.addAll(this.a);
            v(this.m);
            w();
            A(this.a);
            if (this.a.isEmpty()) {
                admuVar.add(new ixn(2, 1, false));
            }
        } else {
            C(anuzVar);
        }
        taf.g(ahno.ar(ahno.ap(new huo(this, 5), executor), new iii(this, i), executor), new hvn(this, 9));
        if (TextUtils.equals(this.m.d, "LM")) {
            avmmVar.c(wbyVarB.i(amld.class).O(avmbVar).ag(new ifo(this, 10), new ido(6)));
        }
    }

    private final void A(List list) {
        this.t.add(list.isEmpty() ? new ixn(1, 2, true) : new ixn(3, 2, true));
    }

    private final void B() {
        this.p.clear();
        this.r.clear();
        this.s.clear();
        this.t.clear();
        this.q.clear();
    }

    private final void C(anuz anuzVar) {
        Object obj;
        anzi anziVarP;
        B();
        this.m = anuzVar;
        this.a = r(anuzVar, this.B.l(111, 45623844L, false));
        apji apjiVar = this.m.e;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        y(apjiVar);
        if (this.h && this.k.l(237, 45791851L, false) && !this.a.isEmpty() && (anziVarP = p((obj = this.a.get(0)))) != null && (anziVarP.b & 1) == 0) {
            this.g = obj;
            this.a.remove(0);
        }
        this.b.l(this.a);
        v(anuzVar);
        E(this.m, false);
        w();
        A(this.a);
        aI(q(anuzVar));
    }

    private final void D(Object obj, boolean z) {
        admu admuVar = this.b;
        if (z) {
            admuVar.add(0, obj);
        } else {
            admuVar.add(obj);
        }
        this.a.add(obj);
    }

    private final void E(anuz anuzVar, boolean z) {
        abh abhVar = new abh((byte[]) null);
        abh abhVar2 = this.C;
        int i = anuzVar.j;
        abhVar.a = i;
        if (z) {
            abhVar2.a += i;
            abhVar = abhVar2;
        }
        this.C = abhVar;
    }

    public static final anzi p(Object obj) {
        if (obj instanceof iko) {
            return ((iko) obj).a;
        }
        if (obj instanceof anzi) {
            return (anzi) obj;
        }
        return null;
    }

    private static List q(anuz anuzVar) {
        ArrayList arrayList = new ArrayList();
        for (anva anvaVar : anuzVar.k) {
            if ((anvaVar.b & 1) != 0) {
                aobx aobxVar = anvaVar.c;
                if (aobxVar == null) {
                    aobxVar = aobx.a;
                }
                acjx acjxVarAe = aawb.ae(aobxVar);
                if (acjxVarAe != null) {
                    arrayList.add(acjxVarAe);
                }
            }
        }
        return arrayList;
    }

    private static List r(anuz anuzVar, boolean z) {
        ArrayList arrayList;
        if (z) {
            arrayList = new ArrayList();
            for (apji apjiVar : anuzVar.f) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(anzj.a);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anzj.a);
                    apjiVar.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                    arrayList.add(new iko((anzi) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)), null));
                }
            }
        } else {
            arrayList = new ArrayList();
            for (apji apjiVar2 : anuzVar.f) {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(anzj.a);
                apjiVar2.c(aihlVarCheckIsLite3);
                if (apjiVar2.j.n(aihlVarCheckIsLite3.d)) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(anzj.a);
                    apjiVar2.c(aihlVarCheckIsLite4);
                    Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite4.d);
                    arrayList.add(objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                }
            }
        }
        return arrayList;
    }

    private final void u() {
        adlq adlqVar = this.o;
        adlqVar.m(-1, this.p, true);
        adlqVar.m(-1, this.b, true);
        adlqVar.m(-1, this.q, true);
        adlqVar.m(-1, this.r, true);
        adlqVar.m(-1, this.s, true);
        adlqVar.m(-1, this.t, true);
    }

    private final void v(anuz anuzVar) {
        if ((anuzVar.c & 4) != 0) {
            apji apjiVar = anuzVar.g;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(angu.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                admu admuVar = this.q;
                apji apjiVar2 = anuzVar.g;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(angu.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                admuVar.add(objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
    }

    private final void w() {
        admu admuVar = this.r;
        if (admuVar.isEmpty()) {
            anuz anuzVar = this.m;
            if ((anuzVar.c & 32) != 0) {
                apji apjiVar = anuzVar.h;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
                apjiVar.c(aihlVarCheckIsLite);
                boolean zN = apjiVar.j.n(aihlVarCheckIsLite.d);
                anuz anuzVar2 = this.m;
                if (zN) {
                    apji apjiVar2 = anuzVar2.h;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                    apjiVar2.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                    admuVar.add(objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    admuVar.e(new hde(2));
                } else {
                    apji apjiVar3 = anuzVar2.h;
                    if (apjiVar3 == null) {
                        apjiVar3 = apji.a;
                    }
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(anzj.a);
                    apjiVar3.c(aihlVarCheckIsLite3);
                    if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                        apji apjiVar4 = this.m.h;
                        if (apjiVar4 == null) {
                            apjiVar4 = apji.a;
                        }
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(anzj.a);
                        apjiVar4.c(aihlVarCheckIsLite4);
                        Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                        admuVar.add(objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                        admuVar.e(new hde(3));
                    }
                }
            }
        }
        admu admuVar2 = this.s;
        if (admuVar2.isEmpty()) {
            anuz anuzVar3 = this.m;
            if ((anuzVar3.c & 64) != 0) {
                apji apjiVar5 = anuzVar3.i;
                if (apjiVar5 == null) {
                    apjiVar5 = apji.a;
                }
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(angu.a);
                apjiVar5.c(aihlVarCheckIsLite5);
                if (apjiVar5.j.n(aihlVarCheckIsLite5.d)) {
                    apji apjiVar6 = this.m.i;
                    if (apjiVar6 == null) {
                        apjiVar6 = apji.a;
                    }
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(angu.a);
                    apjiVar6.c(aihlVarCheckIsLite6);
                    Object objK3 = apjiVar6.j.k(aihlVarCheckIsLite6.d);
                    admuVar2.add(objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3));
                }
            }
        }
    }

    private final void y(apji apjiVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anwz.b);
        apjiVar.c(aihlVarCheckIsLite);
        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
            admu admuVar = this.p;
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anwz.b);
            apjiVar.c(aihlVarCheckIsLite2);
            Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
            admuVar.l(agke.q((anwz) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))));
        }
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.o;
    }

    @Override // defpackage.adtv
    protected final /* bridge */ /* synthetic */ Object c(apjh apjhVar) {
        if (apjhVar == null) {
            return null;
        }
        aihl aihlVar = anuz.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        apjhVar.c(aihlVarCheckIsLite);
        if (apjhVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            apjhVar.c(aihlVarCheckIsLite2);
            Object objK = apjhVar.j.k(aihlVarCheckIsLite2.d);
            return (anuz) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        }
        aihl aihlVar2 = apoq.b;
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
        apjhVar.c(aihlVarCheckIsLite3);
        if (!apjhVar.j.n(aihlVarCheckIsLite3.d)) {
            return null;
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
        apjhVar.c(aihlVarCheckIsLite4);
        Object objK2 = apjhVar.j.k(aihlVarCheckIsLite4.d);
        aiie aiieVar = ((apoq) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).f;
        if (aiieVar.isEmpty() || (((apox) aiieVar.get(0)).e & 262144) == 0) {
            return null;
        }
        anuz anuzVar = ((apox) aiieVar.get(0)).br;
        return anuzVar == null ? anuz.a : anuzVar;
    }

    @Override // defpackage.iyx
    public final void e(int i, int i2) {
        if (i != i2) {
            adlq adlqVar = this.o;
            admu admuVar = this.b;
            int iL = adlqVar.l(admuVar);
            int size = admuVar.size() + iL;
            if (iL > i || i >= size || iL > i2 || i2 >= size) {
                return;
            }
            int i3 = i - iL;
            int i4 = i2 - iL;
            admuVar.j(i3, i4);
            this.a.add(i4, this.a.remove(i3));
        }
    }

    public final void f(Object obj) {
        if (obj != null) {
            if (!this.B.l(111, 45623844L, false)) {
                admu admuVar = this.b;
                if (admuVar.contains(obj)) {
                    this.v = this.a.indexOf(obj);
                    this.w = obj;
                    admuVar.remove(obj);
                    this.a.remove(obj);
                    return;
                }
                return;
            }
            for (int i = 0; i < this.a.size(); i++) {
                Object obj2 = this.a.get(i);
                if ((obj2 instanceof iko) && ((iko) obj2).a.equals(obj)) {
                    this.v = i;
                    this.w = obj2;
                    this.b.remove(obj2);
                    this.a.remove(this.w);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v17, types: [aeez, java.lang.Object] */
    public final void h(String str, int i, Optional optional) {
        anzi anziVar;
        int i2;
        boolean z;
        String quantityString;
        vxz vxzVar = this.B;
        if (!vxzVar.l(111, 45623844L, false) || str.isEmpty() || i == 0) {
            return;
        }
        admu admuVar = this.b;
        if (admuVar.isEmpty()) {
            return;
        }
        int size = ((((iko) admuVar.get(0)).a.b & 8388608) != 0 ? 1 : 0) ^ 1;
        int i3 = 0;
        while (true) {
            if (i3 >= admuVar.size()) {
                i3 = -1;
                break;
            }
            Object obj = admuVar.get(i3);
            if (obj instanceof iko) {
                anzh anzhVar = ((iko) obj).a.q;
                if (anzhVar == null) {
                    anzhVar = anzh.a;
                }
                if (anzhVar.c.equals(str)) {
                    break;
                }
            }
            i3++;
        }
        if (i3 >= size) {
            iko ikoVar = (iko) admuVar.get(i3);
            anzi anziVar2 = ikoVar.a;
            anzh anzhVar2 = anziVar2.q;
            if (anzhVar2 == null) {
                anzhVar2 = anzh.a;
            }
            int i4 = anzhVar2.d + i;
            if (optional.isPresent()) {
                long jLongValue = ((Long) optional.get()).longValue();
                aihh aihhVar = (aihh) anziVar2.toBuilder();
                anzh anzhVar3 = anziVar2.q;
                if (anzhVar3 == null) {
                    anzhVar3 = anzh.a;
                }
                aihf builder = anzhVar3.toBuilder();
                builder.copyOnWrite();
                anzh anzhVar4 = (anzh) builder.instance;
                anzhVar4.b |= 4;
                anzhVar4.d = i4;
                builder.copyOnWrite();
                anzh anzhVar5 = (anzh) builder.instance;
                anzhVar5.b |= 16;
                anzhVar5.e = jLongValue;
                anzh anzhVar6 = (anzh) builder.build();
                aihhVar.copyOnWrite();
                anzi anziVar3 = (anzi) aihhVar.instance;
                anzhVar6.getClass();
                anziVar3.q = anzhVar6;
                anziVar3.b |= 16384;
                anziVar = (anzi) aihhVar.build();
            } else {
                aihh aihhVar2 = (aihh) anziVar2.toBuilder();
                anzh anzhVar7 = anziVar2.q;
                if (anzhVar7 == null) {
                    anzhVar7 = anzh.a;
                }
                aihf builder2 = anzhVar7.toBuilder();
                builder2.copyOnWrite();
                anzh anzhVar8 = (anzh) builder2.instance;
                anzhVar8.b |= 4;
                anzhVar8.d = i4;
                anzh anzhVar9 = (anzh) builder2.build();
                aihhVar2.copyOnWrite();
                anzi anziVar4 = (anzi) aihhVar2.instance;
                anzhVar9.getClass();
                anziVar4.q = anzhVar9;
                anziVar4.b |= 16384;
                anziVar = (anzi) aihhVar2.build();
            }
            admuVar.hM(i3, new iko(anziVar, ikoVar.b));
            if (!vxzVar.l(R.styleable.AppCompatTheme_windowMinWidthMajor, 45630054L, false) || this.z.isTouchExplorationEnabled() || Settings.Global.getFloat(this.y.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                return;
            }
            anzh anzhVar10 = anziVar.q;
            if (anzhVar10 == null) {
                anzhVar10 = anzh.a;
            }
            long j = anzhVar10.e;
            if (i > 0) {
                i2 = i3 - 1;
                while (i2 >= size) {
                    Object obj2 = admuVar.get(i2);
                    if (obj2 instanceof iko) {
                        anzh anzhVar11 = ((iko) obj2).a.q;
                        if (anzhVar11 == null) {
                            anzhVar11 = anzh.a;
                        }
                        int i5 = anzhVar11.d;
                        if (i5 > i4 || (i5 == i4 && anzhVar11.e > j)) {
                            i2++;
                            break;
                        }
                    }
                    i2--;
                }
            } else {
                i2 = i3 + 1;
                while (i2 < admuVar.size()) {
                    Object obj3 = admuVar.get(i2);
                    if (obj3 instanceof iko) {
                        anzh anzhVar12 = ((iko) obj3).a.q;
                        if (anzhVar12 == null) {
                            anzhVar12 = anzh.a;
                        }
                        int i6 = anzhVar12.d;
                        if (i6 < i4 || (i6 == i4 && anzhVar12.e <= j)) {
                            i2--;
                            break;
                        }
                    }
                    i2++;
                }
            }
            int size2 = admuVar.size();
            if (i2 >= size) {
                size = i2;
            }
            if (size >= size2) {
                size = admuVar.size() - 1;
                z = true;
            } else {
                z = false;
            }
            this.A = z && o(acjw.b);
            admuVar.j(i3, size);
            aciz acizVar = (aciz) this.u.io();
            boolean z2 = this.A;
            Boolean.valueOf(!z2).getClass();
            if (!z2 && i3 != size) {
                aefb aefbVarA = acizVar.a.a();
                if (size < i3) {
                    int i7 = i3 - size;
                    quantityString = ((Context) acizVar.b).getResources().getQuantityString(com.google.android.apps.youtube.music.R.plurals.collaborative_playlist_voted_video_moved_up, i7, Integer.valueOf(i7));
                } else {
                    int i8 = size - i3;
                    quantityString = ((Context) acizVar.b).getResources().getQuantityString(com.google.android.apps.youtube.music.R.plurals.collaborative_playlist_voted_video_moved_down, i8, Integer.valueOf(i8));
                }
                aefbVarA.k(quantityString);
                aefbVarA.j();
                acizVar.a(aefbVarA.b());
            }
            if (this.A) {
                admuVar.remove(size);
            }
        }
    }

    @tcc
    public void handleDeletePlaylistEvent(gsd gsdVar) {
        f(((Optional) gsdVar.e).orElse(null));
    }

    @tcc
    public void handleHideEnclosingEvent(vvt vvtVar) {
        Object obj = vvtVar.a;
        if (obj == "MUSIC_SHELF_REMOVED_TAG") {
            this.o.w();
        } else if (this.m == obj) {
            this.o.t();
        } else {
            f(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    @tcc
    public void handleInsertShelfItemEvent(hcl hclVar) {
        anzi anziVar;
        String str = this.m.d;
        String str2 = hclVar.c;
        if (TextUtils.equals(str, str2)) {
            Object obj = hclVar.a;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(anzj.a);
            aihi aihiVar = (aihi) obj;
            aihiVar.c(aihlVarCheckIsLite);
            if (aihiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anzj.a);
                aihiVar.c(aihlVarCheckIsLite2);
                Object objK = aihiVar.j.k(aihlVarCheckIsLite2.d);
                anziVar = (anzi) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            } else {
                anziVar = null;
            }
        } else {
            anziVar = null;
        }
        if (anziVar != null) {
            this.q.clear();
            if ((anziVar.b & 2097152) == 0 || !anziVar.z) {
                aihh aihhVar = (aihh) anziVar.toBuilder();
                aihhVar.copyOnWrite();
                anzi anziVar2 = (anzi) aihhVar.instance;
                anziVar2.b |= 2097152;
                anziVar2.z = true;
                anziVar = (anzi) aihhVar.build();
            }
            if (this.B.l(111, 45623844L, false)) {
                iko ikoVar = new iko(anziVar, null);
                ijc ijcVarA = ijc.a(str2);
                String str3 = hclVar.b;
                if (!TextUtils.isEmpty(str3)) {
                    ijcVarA.a.put(str3, ikoVar);
                }
                D(ikoVar, hclVar.a());
                return;
            }
            ijb ijbVarA = ijb.a(str2);
            String str4 = hclVar.b;
            if (!TextUtils.isEmpty(str4) && anziVar != null) {
                ijbVarA.a.put(str4, anziVar);
            }
            D(anziVar, hclVar.a());
        }
    }

    @tcc
    public void handleReloadPlaylistEvent(wsp wspVar) {
        alvy alvyVar;
        if (!TextUtils.equals(this.m.d, wspVar.a) || (alvyVar = wspVar.b) == null) {
            return;
        }
        alwd alwdVar = alvyVar.f;
        if (alwdVar == null) {
            alwdVar = alwd.a;
        }
        if (alwdVar.b == 175617300) {
            alwd alwdVar2 = alvyVar.f;
            if (alwdVar2 == null) {
                alwdVar2 = alwd.a;
            }
            C(alwdVar2.b == 175617300 ? (anuz) alwdVar2.c : anuz.a);
            return;
        }
        if ((alvyVar.b & SemanticState.Modal) != 0) {
            apji apjiVar = alvyVar.k;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            y(apjiVar);
        }
    }

    @tcc
    public void handleServiceResponseRemoveEvent(wpx wpxVar) {
        throw null;
    }

    @tcc
    public void handleShowEnclosingEvent(gsj gsjVar) {
        int i;
        Optional optional = (Optional) gsjVar.e;
        if (this.m == optional.orElse(null)) {
            u();
            return;
        }
        Object objOrElse = optional.orElse(null);
        if (objOrElse == null || (i = this.v) < 0 || this.w != objOrElse) {
            return;
        }
        int iMin = Math.min(i, this.a.size());
        this.v = iMin;
        this.a.add(iMin, objOrElse);
        this.b.add(this.v, objOrElse);
    }

    @tcc
    public void handleVideoAddedToPlaylistEvent(wss wssVar) {
        alwc alwcVar;
        anzi anziVar;
        iko ikoVar;
        alvy alvyVar;
        String str = this.m.d;
        String str2 = wssVar.a;
        Object ikoVar2 = null;
        if (TextUtils.equals(str, str2) && wssVar.a() && (alvyVar = wssVar.b) != null && alvyVar.j.size() != 0 && ((alwb) alvyVar.j.get(0)).b == 138418859) {
            alwb alwbVar = (alwb) alvyVar.j.get(0);
            alwcVar = alwbVar.b == 138418859 ? (alwc) alwbVar.c : alwc.a;
        } else {
            alwcVar = null;
        }
        if (alwcVar != null) {
            if (!this.B.l(111, 45623844L, false)) {
                ijb ijbVarA = ijb.a(str2);
                String str3 = alwcVar.b;
                anzi anziVar2 = TextUtils.isEmpty(str3) ? null : (anzi) ijbVarA.a.get(str3);
                String str4 = alwcVar.b;
                String str5 = alwcVar.c;
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5) && (anziVar = (anzi) ijbVarA.a.remove(str4)) != null) {
                    aihh aihhVar = (aihh) anziVar.toBuilder();
                    anzh anzhVar = anziVar.q;
                    if (anzhVar == null) {
                        anzhVar = anzh.a;
                    }
                    if ((anzhVar.b & 1) == 0) {
                        anzh anzhVar2 = anziVar.q;
                        if (anzhVar2 == null) {
                            anzhVar2 = anzh.a;
                        }
                        aihf aihfVarCreateBuilder = anzh.a.createBuilder(anzhVar2);
                        aihfVarCreateBuilder.copyOnWrite();
                        anzh anzhVar3 = (anzh) aihfVarCreateBuilder.instance;
                        str5.getClass();
                        anzhVar3.b |= 1;
                        anzhVar3.c = str5;
                        anzh anzhVar4 = (anzh) aihfVarCreateBuilder.build();
                        aihhVar.copyOnWrite();
                        anzi anziVar3 = (anzi) aihhVar.instance;
                        anzhVar4.getClass();
                        anziVar3.q = anzhVar4;
                        anziVar3.b |= 16384;
                    }
                    apji apjiVar = anziVar.p;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    anfy anfyVar = (anfy) kro.H(apjiVar, angi.a).orElse(null);
                    if (anfyVar != null) {
                        aihf builder = anfyVar.toBuilder();
                        builder.copyOnWrite();
                        ((anfy) builder.instance).c = anfy.emptyProtobufList();
                        for (anfv anfvVar : anfyVar.c) {
                            if (((anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).b & 64) != 0) {
                                aihf builder2 = anfvVar.toBuilder();
                                aihf builder3 = (anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).toBuilder();
                                ajwo ajwoVar = (anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).e;
                                if (ajwoVar == null) {
                                    ajwoVar = ajwo.a;
                                }
                                ajwo ajwoVarC = iix.c(ajwoVar, str5);
                                builder3.copyOnWrite();
                                anga angaVar = (anga) builder3.instance;
                                ajwoVarC.getClass();
                                angaVar.e = ajwoVarC;
                                angaVar.b |= 64;
                                anga angaVar2 = (anga) builder3.build();
                                builder2.copyOnWrite();
                                anfv anfvVar2 = (anfv) builder2.instance;
                                angaVar2.getClass();
                                anfvVar2.c = angaVar2;
                                anfvVar2.b = 66441155;
                                builder.bI((anfv) builder2.build());
                            } else {
                                builder.bI(anfvVar);
                            }
                        }
                        apji apjiVar2 = anziVar.p;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        aihh aihhVar2 = (aihh) apjiVar2.toBuilder();
                        aihhVar2.e(angi.a, (anfy) builder.build());
                        aihhVar.copyOnWrite();
                        anzi anziVar4 = (anzi) aihhVar.instance;
                        apji apjiVar3 = (apji) aihhVar2.build();
                        apjiVar3.getClass();
                        anziVar4.p = apjiVar3;
                        anziVar4.b |= SemanticState.Multiline;
                    }
                    apji apjiVar4 = anziVar.l;
                    if (apjiVar4 == null) {
                        apjiVar4 = apji.a;
                    }
                    anxt anxtVar = (anxt) kro.H(apjiVar4, anxu.a).orElse(null);
                    if (anxtVar != null) {
                        aihf builder4 = anxtVar.toBuilder();
                        builder4.copyOnWrite();
                        ((anxt) builder4.instance).b = anxt.emptyProtobufList();
                        for (apji apjiVar5 : anxtVar.b) {
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
                            apjiVar5.c(aihlVarCheckIsLite);
                            if (apjiVar5.j.n(aihlVarCheckIsLite.d)) {
                                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                                apjiVar5.c(aihlVarCheckIsLite2);
                                Object objK = apjiVar5.j.k(aihlVarCheckIsLite2.d);
                                if ((((ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).b & SemanticState.Modal) != 0) {
                                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajnp.a);
                                    apjiVar5.c(aihlVarCheckIsLite3);
                                    Object objK2 = apjiVar5.j.k(aihlVarCheckIsLite3.d);
                                    ajnf ajnfVar = (ajnf) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                                    aihh aihhVar3 = (aihh) apjiVar5.toBuilder();
                                    aihl aihlVar = ajnp.a;
                                    aihh aihhVar4 = (aihh) ajnfVar.toBuilder();
                                    ajwo ajwoVar2 = ajnfVar.q;
                                    if (ajwoVar2 == null) {
                                        ajwoVar2 = ajwo.a;
                                    }
                                    ajwo ajwoVarC2 = iix.c(ajwoVar2, str5);
                                    aihhVar4.copyOnWrite();
                                    ajnf ajnfVar2 = (ajnf) aihhVar4.instance;
                                    ajwoVarC2.getClass();
                                    ajnfVar2.q = ajwoVarC2;
                                    ajnfVar2.b |= SemanticState.Modal;
                                    aihhVar3.e(aihlVar, (ajnf) aihhVar4.build());
                                    builder4.bT((apji) aihhVar3.build());
                                }
                            }
                            builder4.bT(apjiVar5);
                        }
                        apji apjiVar6 = anziVar.l;
                        if (apjiVar6 == null) {
                            apjiVar6 = apji.a;
                        }
                        aihh aihhVar5 = (aihh) apjiVar6.toBuilder();
                        aihhVar5.e(anxu.a, (anxt) builder4.build());
                        aihhVar.copyOnWrite();
                        anzi anziVar5 = (anzi) aihhVar.instance;
                        apji apjiVar7 = (apji) aihhVar5.build();
                        apjiVar7.getClass();
                        anziVar5.l = apjiVar7;
                        anziVar5.b |= SemanticState.Hidden;
                    }
                    ikoVar2 = (anzi) aihhVar.build();
                }
                if (ikoVar2 == null || anziVar2 == null) {
                    return;
                }
                this.b.k(anziVar2, ikoVar2);
                return;
            }
            ijc ijcVarA = ijc.a(str2);
            String str6 = alwcVar.b;
            iko ikoVar3 = TextUtils.isEmpty(str6) ? null : (iko) ijcVarA.a.get(str6);
            String str7 = alwcVar.b;
            String str8 = alwcVar.c;
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8) && (ikoVar = (iko) ijcVarA.a.remove(str7)) != null) {
                anzi anziVar6 = ikoVar.a;
                aihh aihhVar6 = (aihh) anziVar6.toBuilder();
                anzh anzhVar5 = anziVar6.q;
                if (anzhVar5 == null) {
                    anzhVar5 = anzh.a;
                }
                if ((anzhVar5.b & 1) == 0) {
                    anzh anzhVar6 = anziVar6.q;
                    if (anzhVar6 == null) {
                        anzhVar6 = anzh.a;
                    }
                    aihf aihfVarCreateBuilder2 = anzh.a.createBuilder(anzhVar6);
                    aihfVarCreateBuilder2.copyOnWrite();
                    anzh anzhVar7 = (anzh) aihfVarCreateBuilder2.instance;
                    str8.getClass();
                    anzhVar7.b |= 1;
                    anzhVar7.c = str8;
                    anzh anzhVar8 = (anzh) aihfVarCreateBuilder2.build();
                    aihhVar6.copyOnWrite();
                    anzi anziVar7 = (anzi) aihhVar6.instance;
                    anzhVar8.getClass();
                    anziVar7.q = anzhVar8;
                    anziVar7.b |= 16384;
                }
                apji apjiVar8 = anziVar6.p;
                if (apjiVar8 == null) {
                    apjiVar8 = apji.a;
                }
                anfy anfyVar2 = (anfy) kro.H(apjiVar8, angi.a).orElse(null);
                if (anfyVar2 != null) {
                    aihf builder5 = anfyVar2.toBuilder();
                    builder5.copyOnWrite();
                    ((anfy) builder5.instance).c = anfy.emptyProtobufList();
                    for (anfv anfvVar3 : anfyVar2.c) {
                        if (((anfvVar3.b == 66441155 ? (anga) anfvVar3.c : anga.a).b & 64) != 0) {
                            aihf builder6 = anfvVar3.toBuilder();
                            aihf builder7 = (anfvVar3.b == 66441155 ? (anga) anfvVar3.c : anga.a).toBuilder();
                            ajwo ajwoVar3 = (anfvVar3.b == 66441155 ? (anga) anfvVar3.c : anga.a).e;
                            if (ajwoVar3 == null) {
                                ajwoVar3 = ajwo.a;
                            }
                            ajwo ajwoVarC3 = iix.c(ajwoVar3, str8);
                            builder7.copyOnWrite();
                            anga angaVar3 = (anga) builder7.instance;
                            ajwoVarC3.getClass();
                            angaVar3.e = ajwoVarC3;
                            angaVar3.b |= 64;
                            anga angaVar4 = (anga) builder7.build();
                            builder6.copyOnWrite();
                            anfv anfvVar4 = (anfv) builder6.instance;
                            angaVar4.getClass();
                            anfvVar4.c = angaVar4;
                            anfvVar4.b = 66441155;
                            builder5.bI((anfv) builder6.build());
                        } else {
                            builder5.bI(anfvVar3);
                        }
                    }
                    apji apjiVar9 = anziVar6.p;
                    if (apjiVar9 == null) {
                        apjiVar9 = apji.a;
                    }
                    aihh aihhVar7 = (aihh) apjiVar9.toBuilder();
                    aihhVar7.e(angi.a, (anfy) builder5.build());
                    aihhVar6.copyOnWrite();
                    anzi anziVar8 = (anzi) aihhVar6.instance;
                    apji apjiVar10 = (apji) aihhVar7.build();
                    apjiVar10.getClass();
                    anziVar8.p = apjiVar10;
                    anziVar8.b |= SemanticState.Multiline;
                }
                apji apjiVar11 = anziVar6.m;
                if (apjiVar11 == null) {
                    apjiVar11 = apji.a;
                }
                anxx anxxVar = (anxx) kro.H(apjiVar11, anxz.a).orElse(null);
                if (anxxVar != null && (anxxVar.b & 2) != 0) {
                    anxy anxyVar = anxxVar.d;
                    if (anxyVar == null) {
                        anxyVar = anxy.a;
                    }
                    aihf builder8 = anxyVar.toBuilder();
                    anxy anxyVar2 = anxxVar.d;
                    if (((anxyVar2 == null ? anxy.a : anxyVar2).b & 1) != 0) {
                        if (anxyVar2 == null) {
                            anxyVar2 = anxy.a;
                        }
                        anxw anxwVar = anxyVar2.c;
                        if (anxwVar == null) {
                            anxwVar = anxw.a;
                        }
                        anxw anxwVarB = ijc.b(anxwVar, str8);
                        builder8.copyOnWrite();
                        anxy anxyVar3 = (anxy) builder8.instance;
                        anxwVarB.getClass();
                        anxyVar3.c = anxwVarB;
                        anxyVar3.b |= 1;
                    }
                    anxy anxyVar4 = anxxVar.d;
                    if (((anxyVar4 == null ? anxy.a : anxyVar4).b & 2) != 0) {
                        if (anxyVar4 == null) {
                            anxyVar4 = anxy.a;
                        }
                        anxw anxwVar2 = anxyVar4.d;
                        if (anxwVar2 == null) {
                            anxwVar2 = anxw.a;
                        }
                        anxw anxwVarB2 = ijc.b(anxwVar2, str8);
                        builder8.copyOnWrite();
                        anxy anxyVar5 = (anxy) builder8.instance;
                        anxwVarB2.getClass();
                        anxyVar5.d = anxwVarB2;
                        anxyVar5.b |= 2;
                    }
                    aihf builder9 = anxxVar.toBuilder();
                    anxy anxyVar6 = (anxy) builder8.build();
                    builder9.copyOnWrite();
                    anxx anxxVar2 = (anxx) builder9.instance;
                    anxyVar6.getClass();
                    anxxVar2.d = anxyVar6;
                    anxxVar2.b |= 2;
                    anxx anxxVar3 = (anxx) builder9.build();
                    apji apjiVar12 = anziVar6.m;
                    if (apjiVar12 == null) {
                        apjiVar12 = apji.a;
                    }
                    aihh aihhVar8 = (aihh) apjiVar12.toBuilder();
                    aihhVar8.e(anxz.a, anxxVar3);
                    aihhVar6.copyOnWrite();
                    anzi anziVar9 = (anzi) aihhVar6.instance;
                    apji apjiVar13 = (apji) aihhVar8.build();
                    apjiVar13.getClass();
                    anziVar9.m = apjiVar13;
                    anziVar9.b |= SemanticState.LiveRegion;
                }
                apji apjiVar14 = anziVar6.l;
                if (apjiVar14 == null) {
                    apjiVar14 = apji.a;
                }
                anxt anxtVar2 = (anxt) kro.H(apjiVar14, anxu.a).orElse(null);
                if (anxtVar2 != null) {
                    aihf builder10 = anxtVar2.toBuilder();
                    builder10.copyOnWrite();
                    ((anxt) builder10.instance).b = anxt.emptyProtobufList();
                    for (apji apjiVar15 : anxtVar2.b) {
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajnp.a);
                        apjiVar15.c(aihlVarCheckIsLite4);
                        if (apjiVar15.j.n(aihlVarCheckIsLite4.d)) {
                            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ajnp.a);
                            apjiVar15.c(aihlVarCheckIsLite5);
                            Object objK3 = apjiVar15.j.k(aihlVarCheckIsLite5.d);
                            if ((((ajnf) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3))).b & SemanticState.Modal) != 0) {
                                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(ajnp.a);
                                apjiVar15.c(aihlVarCheckIsLite6);
                                Object objK4 = apjiVar15.j.k(aihlVarCheckIsLite6.d);
                                ajnf ajnfVar3 = (ajnf) (objK4 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK4));
                                aihh aihhVar9 = (aihh) apjiVar15.toBuilder();
                                aihl aihlVar2 = ajnp.a;
                                aihh aihhVar10 = (aihh) ajnfVar3.toBuilder();
                                ajwo ajwoVar4 = ajnfVar3.q;
                                if (ajwoVar4 == null) {
                                    ajwoVar4 = ajwo.a;
                                }
                                ajwo ajwoVarC4 = iix.c(ajwoVar4, str8);
                                aihhVar10.copyOnWrite();
                                ajnf ajnfVar4 = (ajnf) aihhVar10.instance;
                                ajwoVarC4.getClass();
                                ajnfVar4.q = ajwoVarC4;
                                ajnfVar4.b |= SemanticState.Modal;
                                aihhVar9.e(aihlVar2, (ajnf) aihhVar10.build());
                                builder10.bT((apji) aihhVar9.build());
                            }
                        }
                        builder10.bT(apjiVar15);
                    }
                    apji apjiVar16 = anziVar6.l;
                    if (apjiVar16 == null) {
                        apjiVar16 = apji.a;
                    }
                    aihh aihhVar11 = (aihh) apjiVar16.toBuilder();
                    aihhVar11.e(anxu.a, (anxt) builder10.build());
                    aihhVar6.copyOnWrite();
                    anzi anziVar10 = (anzi) aihhVar6.instance;
                    apji apjiVar17 = (apji) aihhVar11.build();
                    apjiVar17.getClass();
                    anziVar10.l = apjiVar17;
                    anziVar10.b |= SemanticState.Hidden;
                }
                ikoVar2 = new iko((anzi) aihhVar6.build(), ikoVar.b);
            }
            if (ikoVar2 == null || ikoVar3 == null) {
                return;
            }
            this.b.k(ikoVar3, ikoVar2);
            this.a.remove(ikoVar3);
            this.a.add(ikoVar2);
        }
    }

    @tcc
    public void handleVideoRemovedFromPlaylistEvent(wsv wsvVar) {
        if (!TextUtils.equals(this.m.d, wsvVar.a)) {
            return;
        }
        String str = wsvVar.b;
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            for (int i = 0; i < this.a.size(); i++) {
                anzi anziVarP = p(this.a.get(i));
                if (anziVarP != null && (anziVarP.b & 16384) != 0) {
                    anzh anzhVar = anziVarP.q;
                    if (anzhVar == null) {
                        anzhVar = anzh.a;
                    }
                    if (TextUtils.equals(str, anzhVar.c)) {
                        f(anziVarP);
                        return;
                    }
                }
            }
            return;
        }
        String str2 = wsvVar.d;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str2)) {
            return;
        }
        int size = this.a.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Object objP = p(this.a.get(size));
            if (objP != null && TextUtils.equals(str2, fhz.ag(objP))) {
                f(objP);
            }
        }
    }

    @Override // defpackage.adtv, defpackage.advw
    public final adxd hq() {
        return new ikl(super.hq(), this.m, this.a, this.C, this.v, this.w, this.g, this.h);
    }

    @Override // defpackage.adtv
    protected final /* synthetic */ void hs(Object obj, acjx acjxVar) {
        anuz anuzVar = (anuz) obj;
        super.hs(anuzVar, acjxVar);
        if (anuzVar != null) {
            acjw acjwVarA = acjxVar.a();
            acjw acjwVar = acjw.b;
            if (acjwVarA == acjwVar && this.A) {
                jik jikVar = new jik();
                jikVar.c();
                jikVar.j();
                jikVar.i(0);
                Context context = this.y;
                jikVar.k(context.getString(com.google.android.apps.youtube.music.R.string.playlist_vote_to_refresh));
                jikVar.l(context.getString(com.google.android.apps.youtube.music.R.string.playlist_vote_to_refresh_action), new hdf(this, 11));
                ((aciz) this.u.io()).a(jikVar.b());
                this.A = false;
            }
            if (acjxVar.a() == acjw.d) {
                C(anuzVar);
            } else {
                aI(q(anuzVar));
                List listR = r(anuzVar, this.B.l(111, 45623844L, false));
                this.a.addAll(listR);
                this.b.addAll(listR);
                w();
            }
            E(anuzVar, acjxVar.a() == acjwVar);
            w();
        }
    }

    @Override // defpackage.adtv
    public final boolean hu() {
        return true;
    }

    @Override // defpackage.adtv, defpackage.twn
    public final void i() {
        this.j = true;
        synchronized (this) {
            if (this.i != null) {
                this.i.close();
                this.i = null;
            }
        }
        B();
        this.o.t();
        this.e = null;
        this.l.l(this);
        this.f.dispose();
        super.i();
    }

    @Override // defpackage.iyx
    public final void j(Object obj, int i) {
        int i2;
        if (i != 0) {
            admu admuVar = this.b;
            if (admuVar.contains(obj)) {
                for (int i3 = 0; i3 < admuVar.size(); i3++) {
                    if (admuVar.get(i3) == obj && (i2 = i3 + i) >= 0 && i2 < admuVar.size()) {
                        admuVar.j(i3, i2);
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.advc
    public final void k(Configuration configuration) {
        w();
    }

    @Override // defpackage.adwk
    public final void l(Object obj) {
        f(obj);
    }
}
