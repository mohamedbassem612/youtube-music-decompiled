package defpackage;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import internal.org.jni_zero.JniZero;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ci {
    private static ci b;
    public final Object a;

    public ci(yef yefVar, adws adwsVar) {
        this.a = yefVar;
        avmm avmmVar = new avmm();
        avlh avlhVarB = adwsVar.b();
        avmb avmbVar = avmh.a;
        JniZero.a(avmbVar);
        avmmVar.c(avlhVarB.L(avmbVar).al(new acae(this, 12), new achk(2)));
    }

    public static int D(djl djlVar, Object obj, Object obj2) {
        return bin.a((bkl) djlVar.c, 1, obj) + bin.a((bkl) djlVar.a, 2, obj2);
    }

    public static void E(bih bihVar, djl djlVar, Object obj, Object obj2) {
        bin.d(bihVar, (bkl) djlVar.c, 1, obj);
        bin.d(bihVar, (bkl) djlVar.a, 2, obj2);
    }

    public static synchronized void I(Configuration configuration) {
        ci ciVar = b;
        if (ciVar == null || !((Configuration) ciVar.a).equals(configuration)) {
            b = new ci(new Configuration(configuration));
        }
    }

    public static boolean Z(Object obj) {
        return (obj instanceof adla) || (obj instanceof apog) || (obj instanceof ajjk) || (obj instanceof aduo) || (obj instanceof advl);
    }

    private static String aG(String str) {
        return "imageprefetch_".concat(String.valueOf(str));
    }

    public static ajng am(String str) {
        aihf aihfVarCreateBuilder = ajng.a.createBuilder();
        aihh aihhVar = (aihh) ajnf.a.createBuilder();
        alay alayVarC = ackj.c(str);
        aihhVar.copyOnWrite();
        ajnf ajnfVar = (ajnf) aihhVar.instance;
        alayVarC.getClass();
        ajnfVar.m = alayVarC;
        ajnfVar.b |= 64;
        ajnf ajnfVar2 = (ajnf) aihhVar.build();
        aihfVarCreateBuilder.copyOnWrite();
        ajng ajngVar = (ajng) aihfVarCreateBuilder.instance;
        ajnfVar2.getClass();
        ajngVar.c = ajnfVar2;
        ajngVar.b |= 1;
        return (ajng) aihfVarCreateBuilder.build();
    }

    public static void m(View view, bam bamVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(new bar(bamVar));
            return;
        }
        Interpolator interpolator = baq.a;
        View.OnApplyWindowInsetsListener bapVar = new bap(view, bamVar);
        view.setTag(R.id.tag_window_insets_animation_callback, bapVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(bapVar);
        }
    }

    public final void A(final int i, final long j, final long j2) {
        for (final qp qpVar : (CopyOnWriteArrayList) this.a) {
            if (!qpVar.b) {
                ((Handler) qpVar.a).post(new Runnable() { // from class: crb
                    /* JADX WARN: Type inference failed for: r0v1, types: [crc, java.lang.Object] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        qpVar.c.G(i, j, j2);
                    }
                });
            }
        }
    }

    public final void B(crc crcVar) {
        CopyOnWriteArrayList<qp> copyOnWriteArrayList = (CopyOnWriteArrayList) this.a;
        for (qp qpVar : copyOnWriteArrayList) {
            if (qpVar.c == crcVar) {
                qpVar.b = true;
                copyOnWriteArrayList.remove(qpVar);
            }
        }
    }

    public final Object C() {
        return ((WeakReference) this.a).get();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    public final void F(fod fodVar) {
        ((dov) this.a).a.add(fodVar.a());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final boolean G(String str) {
        ?? r1 = this.a;
        String strAG = aG(str);
        return r1.containsKey(strAG) && ((Integer) r1.get(strAG)).intValue() == 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void H(String str, int i) {
        this.a.put(aG(str), Integer.valueOf(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void J(fhd fhdVar, fiu fiuVar, String str) {
        if (str != null) {
            aerz aerzVar = (aerz) this.a.get(str);
            if (aerzVar != null) {
                aerzVar.a = true;
                Object obj = aerzVar.b;
                int iC = ((ahb) obj).c();
                for (int i = 0; i < iC; i++) {
                    fip fipVar = (fip) ((ahb) obj).d(i);
                    fipVar.b = fiuVar;
                    Object[] objArr = fipVar.d;
                    if (objArr != null) {
                        objArr[0] = fhdVar;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized void K() {
        ?? r0 = this.a;
        Iterator it = r0.keySet().iterator();
        while (it.hasNext()) {
            aerz aerzVar = (aerz) r0.get(it.next());
            if (aerzVar == null || !aerzVar.a) {
                it.remove();
            } else {
                aerzVar.a = false;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void L(String str, fip fipVar) {
        fip fipVar2;
        if (str != null) {
            ?? r0 = this.a;
            aerz aerzVar = (aerz) r0.get(str);
            if (aerzVar == null) {
                aerzVar = new aerz();
                r0.put(str, aerzVar);
                fipVar2 = null;
            } else {
                fipVar2 = (fip) ahc.a((ahb) aerzVar.b, fipVar.c);
            }
            if (!fipVar.a(fipVar2)) {
                ((ahb) aerzVar.b).f(fipVar.c, fipVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [eub, java.lang.Object] */
    public final synchronized eub M(Class cls) {
        ?? r0 = this.a;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            gev gevVar = (gev) r0.get(i);
            if (((Class) gevVar.b).isAssignableFrom(cls)) {
                return gevVar.a;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void N(Class cls, eub eubVar) {
        this.a.add(new gev(cls, (eth) eubVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized List O() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void P(etj etjVar) {
        this.a.add(etjVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [eth, java.lang.Object] */
    public final synchronized eth Q(Class cls) {
        for (gev gevVar : this.a) {
            if (((Class) gevVar.b).isAssignableFrom(cls)) {
                return gevVar.a;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void R(Class cls, eth ethVar) {
        this.a.add(new gev(cls, ethVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [fco] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final synchronized fco S(Class cls, Class cls2) {
        ?? r4;
        if (!cls2.isAssignableFrom(cls)) {
            for (ayq ayqVar : this.a) {
                if (ayqVar.D(cls, cls2)) {
                    r4 = ayqVar.b;
                }
            }
            throw new IllegalArgumentException(a.bX(cls2, cls, "No transcoder registered to transcode from ", " to "));
        }
        r4 = fcp.a;
        return r4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final synchronized List T(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
        } else {
            for (ayq ayqVar : this.a) {
                if (ayqVar.D(cls, cls2)) {
                    Object obj = ayqVar.c;
                    if (!arrayList.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void U(Class cls, Class cls2, fco fcoVar) {
        this.a.add(new ayq(cls, cls2, fcoVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final synchronized etd V(ByteBuffer byteBuffer) {
        etd etdVar;
        etdVar = (etd) this.a.poll();
        if (etdVar == null) {
            etdVar = new etd();
        }
        etdVar.b = null;
        Arrays.fill(etdVar.a, (byte) 0);
        etdVar.c = new etc();
        etdVar.d = 0;
        etdVar.b = byteBuffer.asReadOnlyBuffer();
        etdVar.b.position(0);
        etdVar.b.order(ByteOrder.LITTLE_ENDIAN);
        return etdVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void W(etd etdVar) {
        etdVar.b = null;
        etdVar.c = null;
        this.a.offer(etdVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void X() {
        this.a.clear();
    }

    public final Object Y(Object obj, int i, int i2) {
        Object obj2 = this.a;
        eyu eyuVarA = eyu.a(obj, i, i2);
        Object objG = ((ffo) obj2).g(eyuVarA);
        eyuVarA.b();
        return objG;
    }

    public final dd a() {
        return ((ck) this.a).e;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aati, java.lang.Object] */
    public final void aA(String str) {
        aasa aasaVarC = this.a.c();
        aasi aasiVarA = aasj.a(3);
        aasiVarA.f(str);
        aasiVarA.e(SemanticState.LiveRegion);
        ((aask) aasaVarC).f(aasiVarA.a());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public final void aB(aaca aacaVar) {
        ((qtf) ((aerv) this.a.io()).o.io()).b(1L, aacaVar.g);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final void aC(int i) {
        ((abte) this.a.io()).b(new xfh(i - 1, 10), alai.FLOW_TYPE_CHIME_REGISTRATION);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.SharedPreferences, java.lang.Object] */
    public final String aD(zwa zwaVar) {
        return ((hxh) this.a).a.getString(true != zwaVar.m() ? "visitor_id" : "incognito_visitor_id", null);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void aE(zwa zwaVar, String str) {
        ((hxh) this.a).a.edit().putString(true != zwaVar.m() ? "visitor_id" : "incognito_visitor_id", str).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void aF(qcb qcbVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setUpdateListener(qcbVar != null ? new pr(qcbVar, 2, 0 == true ? 1 : 0) : null);
        }
    }

    public final boolean aa(Object obj) {
        boolean z;
        if (obj instanceof acxm) {
            akro akroVarB = ((acxm) obj).b();
            aihl aihlVar = apku.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            akroVarB.c(aihlVarCheckIsLite);
            if (!akroVarB.j.n(aihlVarCheckIsLite.d)) {
                return true;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            akroVarB.c(aihlVarCheckIsLite2);
            Object objK = akroVarB.j.k(aihlVarCheckIsLite2.d);
            int iAS = a.aS(((apku) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d);
            if (iAS == 0 || iAS != 3) {
                return true;
            }
        } else {
            if (Z(obj)) {
                return true;
            }
            if ((obj instanceof aocp) && ((vxz) this.a).l(89, 45741810L, false)) {
                return true;
            }
            if (obj instanceof ajzb) {
                z = ((ajzb) obj).b;
            } else if (obj instanceof ajka) {
                z = ((ajka) obj).b;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final adzd ab() {
        return (adzd) atqq.ac(this.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void ac(adzd adzdVar) {
        this.a.add(adzdVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void ad(adzd adzdVar) {
        this.a.remove(adzdVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    public final void ae(Object obj, View view) {
        ?? r3 = this.a;
        if (r3.isEmpty()) {
            return;
        }
        for (abxv abxvVar : r3) {
            String strO = kro.O(obj);
            if (strO != null && !strO.isEmpty()) {
                abxvVar.J(strO, view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    public final void af(Object obj, View view) {
        ?? r3 = this.a;
        if (r3.isEmpty()) {
            return;
        }
        for (abxv abxvVar : r3) {
            String strO = kro.O(obj);
            if (strO != null && !strO.isEmpty()) {
                abxvVar.J(strO, view);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [adme, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final void ag(admh admhVar) {
        for (abfv abfvVar : this.a) {
            Object obj = abfvVar.b;
            if (admhVar.a(obj) == -1) {
                admhVar.d((Class) obj, abfvVar.a);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void ah(Class cls, awmd awmdVar) {
        this.a.add(new abfv(cls, (adme) new admj(awmdVar)));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final adln ai(admh admhVar) {
        ci ciVar = (ci) this.a.io();
        ciVar.getClass();
        admhVar.getClass();
        return new adln(ciVar, admhVar);
    }

    public final void aj(RecyclerView recyclerView) {
        ((aepz) this.a).o(recyclerView);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aunn, java.lang.Object] */
    public final nzk ak() {
        xks xksVarA = ((xkq) this.a.io()).a(3);
        List list = xksVarA.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(Integer.valueOf(((ajwc) list.get(i)).f));
        }
        return new nzk(xksVarA.a, xksVarA.c, agke.j(arrayList));
    }

    public final void al(int i, aigj aigjVar, boolean z, float f, int i2, nwf nwfVar) {
        int i3;
        xgn xgnVar = (xgn) aecm.A(nwfVar).f();
        if (xgnVar != null) {
            if (!z) {
                int i4 = i - 1;
                if (i4 == 1) {
                    xgnVar.w(new xgj(aigjVar, (amud) null), null);
                    return;
                } else {
                    if (i4 == 2) {
                        xgnVar.p(new xgj(aigjVar, (amud) null), null);
                        return;
                    }
                    return;
                }
            }
            xgt xgtVarA = xgnVar.a();
            if (xgtVarA != null) {
                int i5 = i - 1;
                if (i5 != 1) {
                    i3 = i5 != 2 ? 1 : 3;
                } else {
                    i3 = 2;
                }
                if (i3 != 1) {
                    aihf aihfVarCreateBuilder = aoxg.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aoxg aoxgVar = (aoxg) aihfVarCreateBuilder.instance;
                    String str = xgtVarA.a;
                    str.getClass();
                    aoxgVar.b |= 1;
                    aoxgVar.c = str;
                    aihf aihfVarCreateBuilder2 = argn.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    argn argnVar = (argn) aihfVarCreateBuilder2.instance;
                    aigjVar.getClass();
                    argnVar.b |= 1;
                    argnVar.c = aigjVar;
                    argn argnVar2 = (argn) aihfVarCreateBuilder2.build();
                    aihfVarCreateBuilder.copyOnWrite();
                    aoxg aoxgVar2 = (aoxg) aihfVarCreateBuilder.instance;
                    argnVar2.getClass();
                    aoxgVar2.d = argnVar2;
                    aoxgVar2.b |= 2;
                    aihfVarCreateBuilder.copyOnWrite();
                    aoxg aoxgVar3 = (aoxg) aihfVarCreateBuilder.instance;
                    aoxgVar3.e = i3 - 1;
                    aoxgVar3.b |= 4;
                    aihfVarCreateBuilder.copyOnWrite();
                    aoxg aoxgVar4 = (aoxg) aihfVarCreateBuilder.instance;
                    aoxgVar4.b |= 8;
                    aoxgVar4.f = f;
                    aihfVarCreateBuilder.copyOnWrite();
                    aoxg aoxgVar5 = (aoxg) aihfVarCreateBuilder.instance;
                    aoxgVar5.b |= 16;
                    aoxgVar5.g = i2;
                    xeu xeuVar = (xeu) this.a;
                    if (xeuVar.b) {
                        xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.POST_IMPRESSION_EVENT);
                        ztf ztfVar = xffVarA.k.e;
                        xffVarA.l = ztfVar.a();
                        ztfVar.k(xffVarA);
                        return;
                    }
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    aoxg aoxgVar6 = (aoxg) aihfVarCreateBuilder.build();
                    aoxgVar6.getClass();
                    alouVar.d = aoxgVar6;
                    alouVar.c = 346;
                    xeuVar.b((alou) alosVar.build());
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final agcg an(may mayVar) {
        aclk aclkVar = (aclk) this.a.io();
        aclkVar.getClass();
        return new agcg(aclkVar);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    public final Optional ao(abup abupVar, abul abulVar, abun abunVar, boolean z) {
        abulVar.getClass();
        abun abunVar2 = abupVar.b;
        abuo abuoVar = (abuo) this.a.get(abunVar2.d());
        ListenableFuture listenableFutureA = null;
        if (abuoVar != null) {
            abnt abntVar = abug.a;
            abuf abufVar = new abuf();
            abufVar.f(false);
            abufVar.c(new abul(0, null));
            abufVar.e(abul.a);
            abnt abntVar2 = abug.a;
            abufVar.g(abntVar2);
            abufVar.i(abug.l);
            abufVar.b(abug.b);
            abufVar.d(true);
            abufVar.h();
            abufVar.c(abulVar);
            if (abunVar == null) {
                abunVar = abun.d;
            }
            abufVar.a = abunVar;
            abufVar.e(abupVar.a);
            abufVar.b = abunVar2;
            abufVar.f(abupVar.c);
            ahsk ahskVarB = abnt.b(abntVar2);
            ahskVarB.d(2);
            abufVar.g(ahskVarB.c());
            abufVar.d(z);
            listenableFutureA = abuoVar.a(abunVar2, abufVar.a());
        }
        return Optional.ofNullable(listenableFutureA);
    }

    public final String ap() {
        String str = (String) ((awku) this.a).aD();
        return str == null ? "" : str;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final xgn aq() {
        return (xgn) this.a.io();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [abvn, java.lang.Object] */
    public final abvn ar() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aati, java.lang.Object] */
    public final String as() {
        return this.a.e();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aati, java.lang.Object] */
    public final Map at(String str) {
        ?? r1 = this.a;
        return !str.equals(((aask) r1.c()).h) ? Collections.EMPTY_MAP : r1.f();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [aati, java.lang.Object] */
    public final void au(String str, String str2, int i, aamb aambVar) {
        aasa aasaVarC = this.a.c();
        long j = aarq.a;
        aambVar.p();
        aaro aaroVar = new aaro(str, str2, i, aambVar, 0);
        aasi aasiVarA = aasj.a(2);
        aasiVarA.b = agev.i(aaroVar);
        ((aask) aasaVarC).f(aasiVarA.a());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aati, java.lang.Object] */
    public final void av(String str, Bundle bundle) {
        String string;
        aasa aasaVarC = this.a.c();
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == 1134224607) {
                if (str.equals("com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup")) {
                    ((aask) aasaVarC).f(aasj.a(4).a());
                }
            } else if (iHashCode == 1897312741 && str.equals("com.google.android.libraries.youtube.offline.transfer.service.ActionDelayedMessage") && bundle != null && bundle.getInt("messageId") == 10 && (string = bundle.getString("messageData")) != null) {
                aasi aasiVarA = aasj.a(11);
                aasiVarA.f(string);
                ((aask) aasaVarC).f(aasiVarA.a());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aati, java.lang.Object] */
    public final void aw(String str) {
        aasa aasaVarC = this.a.c();
        aasi aasiVarA = aasj.a(22);
        aasiVarA.f(str);
        ((aask) aasaVarC).f(aasiVarA.a());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aati, java.lang.Object] */
    public final void ax(String str) {
        aasa aasaVarC = this.a.c();
        aasi aasiVarA = aasj.a(19);
        aasiVarA.f(str);
        ((aask) aasaVarC).f(aasiVarA.a());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aati, java.lang.Object] */
    public final void ay(String str) {
        aasa aasaVarC = this.a.c();
        aasi aasiVarA = aasj.a(20);
        aasiVarA.f(str);
        ((aask) aasaVarC).f(aasiVarA.a());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aati, java.lang.Object] */
    public final void az(String str) {
        aasa aasaVarC = this.a.c();
        aasi aasiVarA = aasj.a(5);
        aasiVarA.f(str);
        ((aask) aasaVarC).f(aasiVarA.a());
    }

    public final void b() {
        ((ck) this.a).e.noteStateNotSaved();
    }

    public final void c() {
        ((ck) this.a).e.am(true);
    }

    public final Object d(Object obj, Object obj2) {
        return ((LinkedHashMap) this.a).put(obj, obj2);
    }

    public final Object e(Object obj) {
        obj.getClass();
        return ((LinkedHashMap) this.a).remove(obj);
    }

    public final Set f() {
        Set setEntrySet = ((LinkedHashMap) this.a).entrySet();
        setEntrySet.getClass();
        return setEntrySet;
    }

    public final boolean g() {
        return ((LinkedHashMap) this.a).isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [axaf, java.lang.Object] */
    public final bgk h() {
        return (bgk) this.a.c();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [axaf, java.lang.Object] */
    public final bgk i(bgk bgkVar) {
        ?? r0;
        Object objC;
        bgk bgkVar2;
        bgkVar.getClass();
        do {
            r0 = this.a;
            objC = r0.c();
            bgkVar2 = (bgk) objC;
            if ((bgkVar2 instanceof bge) || awrc.c(bgkVar2, bgn.a)) {
                bgkVar2 = bgkVar;
            } else if (bgkVar2 instanceof bdw) {
                if (bgkVar.c > ((bdw) bgkVar2).c) {
                    bgkVar2 = bgkVar;
                }
            } else if (!(bgkVar2 instanceof bgb)) {
                if (bgkVar2 instanceof bgc) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                throw new awmj();
            }
        } while (!r0.e(objC, bgkVar2));
        return bgkVar2;
    }

    public final int j() {
        return ((AtomicInteger) this.a).get();
    }

    public final float k() {
        return ((bat) this.a).h();
    }

    public final int l() {
        return ((bat) this.a).i();
    }

    public final void n(float f) {
        ((bat) this.a).k(f);
    }

    public final void o() {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void p() {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final void q(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void r(long j) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void s(Interpolator interpolator) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
    }

    public final void t(baj bajVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            if (bajVar != null) {
                view.animate().setListener(new bai(bajVar, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void u(long j) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
    }

    public final void v(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().translationX(f);
        }
    }

    public final void w(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final void x() {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().withLayer();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [axaf, java.lang.Object] */
    public final Object y(awzd awzdVar, awoq awoqVar) throws Throwable {
        dmk dmkVar;
        if (awoqVar instanceof dmk) {
            dmkVar = (dmk) awoqVar;
            int i = dmkVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dmkVar.b = i - Integer.MIN_VALUE;
            } else {
                dmkVar = new dmk(this, awoqVar);
            }
        } else {
            dmkVar = new dmk(this, awoqVar);
        }
        Object obj = dmkVar.a;
        awox awoxVar = awox.a;
        int i2 = dmkVar.b;
        if (i2 == 0) {
            atqp.j(obj);
            ?? r4 = this.a;
            dmkVar.b = 1;
            if (r4.collect(awzdVar, dmkVar) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        throw new awmh();
    }

    public final void z(Handler handler, crc crcVar) {
        handler.getClass();
        crcVar.getClass();
        B(crcVar);
        ((CopyOnWriteArrayList) this.a).add(new qp(handler, crcVar));
    }

    public ci(bkl bklVar, bkl bklVar2, Object obj) {
        this.a = new djl(bklVar, bklVar2, obj);
    }

    public ci(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ci(Object obj, char[] cArr) {
        this.a = obj;
    }

    public ci() {
        this.a = new LinkedHashMap(0, 0.75f, true);
    }

    public ci(char[] cArr, byte[] bArr) {
        this.a = new AtomicReference(null);
    }

    public ci(short[] sArr, char[] cArr) {
        this.a = DesugarCollections.synchronizedMap(new addq());
    }

    public ci(View view) {
        this.a = new WeakReference(view);
    }

    public ci(Object obj) {
        this.a = new WeakReference(obj);
    }

    public ci(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new bas(new WindowInsetsAnimation(i, interpolator, j));
        } else {
            this.a = new baq(i, interpolator, j);
        }
    }

    public ci(int i, byte[] bArr) {
        this.a = new adjq(new exj(i), new adjp(), new adjo());
    }

    public ci(byte[] bArr, char[] cArr) {
        this.a = agkz.q(1, 5);
    }

    public ci(char[] cArr) {
        this.a = new CopyOnWriteArrayList();
    }

    public ci(int i) {
        this.a = new axav(new int[i]);
    }

    public ci(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, (Interpolator) null, 0L);
        this.a = new bas(windowInsetsAnimation);
    }

    public ci(awmd awmdVar, byte[] bArr) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public ci(long j) {
        this.a = new eyt(j);
    }

    public ci(byte[] bArr, byte[] bArr2) {
        this.a = new AtomicInteger(0);
    }

    public ci(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = new ArrayList();
    }

    public ci(byte[] bArr) {
        this.a = new axav(bgn.a);
    }

    public ci(char[] cArr, short[] sArr) {
        this.a = new HashSet();
    }

    public ci(short[] sArr, byte[] bArr, byte[] bArr2) {
        this.a = new HashMap();
    }

    public ci(boolean z) {
        this.a = new AtomicBoolean(z);
    }

    public ci(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        char[] cArr = ffs.a;
        this.a = new ArrayDeque(0);
    }

    public ci(byte[] bArr, int[] iArr) {
        this.a = new HashSet();
    }

    public ci(int[] iArr) {
        this.a = new ArrayList();
    }

    public ci(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public ci(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public ci(short[] sArr, byte[] bArr) {
        this.a = new ArrayList();
    }

    public ci(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new ArrayList();
    }

    public ci(char[] cArr, char[] cArr2) {
        this.a = new HashMap();
    }

    public ci(fjw fjwVar) {
        this.a = new WeakReference(fjwVar);
    }

    public ci(Configuration configuration) {
        this.a = configuration;
        new agm(500);
    }

    public ci(byte[] bArr, short[] sArr) {
        this.a = new HashMap();
    }

    public ci(short[] sArr) {
        this.a = new dov(null, null, null, null, null);
    }

    public ci(awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        this((byte[]) null, (byte[]) null, (char[]) null);
        ah(anfv.class, awmdVar);
        ah(anrv.class, awmdVar2);
        ah(anrn.class, awmdVar3);
    }

    public ci(awmd awmdVar) {
        this((byte[]) null, (byte[]) null, (char[]) null);
        ah(anrp.class, awmdVar);
    }

    public ci(awmd awmdVar, awmd awmdVar2) {
        this((byte[]) null, (byte[]) null, (char[]) null);
        ah(heg.class, awmdVar);
        ah(ajnf.class, awmdVar2);
    }

    public ci(abvm abvmVar) {
        this.a = new gil(((gim) abvmVar).a);
    }

    public ci(abbd abbdVar) {
        abbdVar.getClass();
        this.a = abbdVar;
    }

    public ci(byte[] bArr, char[] cArr, char[] cArr2) {
        this.a = new awku();
    }

    public ci(abfs abfsVar) {
        abfsVar.getClass();
        this.a = abfsVar;
    }

    public ci(ytv ytvVar, abww abwwVar, avmb avmbVar) {
        this.a = ytvVar;
        abwwVar.e().P().L(avmbVar).p().ak(new abwz(this, 11));
    }

    public ci(int[] iArr, byte[] bArr) {
        new CopyOnWriteArraySet();
        this.a = new awli(Boolean.FALSE).az();
    }

    public ci(TextView textView) {
        this.a = new bmm();
    }

    public ci(awmd awmdVar, char[] cArr) {
        awmdVar.getClass();
        this.a = awmdVar;
    }
}
