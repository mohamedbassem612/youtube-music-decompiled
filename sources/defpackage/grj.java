package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Pair;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class grj {
    public final Object a;

    public grj(int i, abcm abcmVar) {
        int i2;
        double d;
        double d2;
        double d3;
        this.a = new byte[i << 1];
        int i3 = 0;
        double dA = 0.0d;
        int i4 = 0;
        while (true) {
            i2 = i >> 2;
            d = i - 1;
            d2 = 65279.0d;
            d3 = 256.0d;
            if (i3 >= i2) {
                break;
            }
            dA = abcmVar.a(i3, d) * 65279.0d;
            int i5 = i4 + 1;
            byte[] bArr = (byte[]) this.a;
            bArr[i4] = (byte) (dA / 256.0d);
            i4 += 2;
            bArr[i5] = (byte) (dA % 256.0d);
            i3++;
        }
        int i6 = i2 + 3;
        while (i6 < i) {
            double dA2 = ((abcmVar.a(i6, d) * d2) - dA) / 4.0d;
            double d4 = dA + dA2;
            byte[] bArr2 = (byte[]) this.a;
            bArr2[i4] = (byte) (d4 / d3);
            double d5 = d3;
            bArr2[i4 + 1] = (byte) (d4 % d5);
            double d6 = d4 + dA2;
            bArr2[i4 + 2] = (byte) (d6 / d5);
            bArr2[i4 + 3] = (byte) (d6 % d5);
            double d7 = d6 + dA2;
            bArr2[i4 + 4] = (byte) (d7 / d5);
            bArr2[i4 + 5] = (byte) (d7 % d5);
            int i7 = i4 + 7;
            dA = d7 + dA2;
            bArr2[i4 + 6] = (byte) (dA / d5);
            i4 += 8;
            bArr2[i7] = (byte) (dA % d5);
            i6 += 4;
            d2 = d2;
            d3 = d5;
        }
        double d8 = d2;
        double d9 = d3;
        for (int i8 = i6 - 3; i8 < i; i8++) {
            double dA3 = abcmVar.a(i8, d) * d8;
            int i9 = i4 + 1;
            byte[] bArr3 = (byte[]) this.a;
            bArr3[i4] = (byte) (dA3 / d9);
            i4 += 2;
            bArr3[i9] = (byte) (dA3 % d9);
        }
    }

    public static void A(grj grjVar, grj grjVar2, grj grjVar3) {
        float[] fArr = (float[]) grjVar.a;
        float f = fArr[0];
        float[] fArr2 = (float[]) grjVar2.a;
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[3];
        float f5 = fArr[2];
        float f6 = fArr2[6];
        float f7 = f5 * f6;
        float f8 = fArr2[1];
        float f9 = fArr2[4];
        float f10 = fArr2[7];
        float f11 = f5 * f10;
        float f12 = fArr2[2];
        float f13 = fArr2[5];
        float f14 = fArr2[8];
        float f15 = fArr[3];
        float f16 = fArr[4];
        float f17 = fArr[5];
        float f18 = f17 * f6;
        float f19 = f17 * f10;
        float f20 = fArr[6];
        float f21 = fArr[7];
        float f22 = fArr[8];
        float f23 = f6 * f22;
        float f24 = f10 * f22;
        float f25 = (f * f12) + (f3 * f13);
        float f26 = (f15 * f12) + (f16 * f13);
        grjVar3.v((f * f2) + (f3 * f4) + f7, (f * f8) + (f3 * f9) + f11, f25 + (f5 * f14), (f15 * f2) + (f16 * f4) + f18, (f15 * f8) + (f16 * f9) + f19, f26 + (f17 * f14), (f2 * f20) + (f4 * f21) + f23, (f8 * f20) + (f9 * f21) + f24, (f20 * f12) + (f21 * f13) + (f22 * f14));
    }

    public static grj o(atr atrVar) {
        return new grj(atrVar.b());
    }

    public static boolean t(aoow aoowVar) {
        return aoowVar.c < 0 || aoowVar.d < 0;
    }

    public final void B(grj grjVar) {
        float fU = ((u(0, 0) * ((u(1, 1) * u(2, 2)) - (u(2, 1) * u(1, 2)))) - (u(0, 1) * ((u(1, 0) * u(2, 2)) - (u(1, 2) * u(2, 0))))) + (u(0, 2) * ((u(1, 0) * u(2, 1)) - (u(1, 1) * u(2, 0))));
        if (fU != 0.0d) {
            float f = 1.0f / fU;
            float[] fArr = (float[]) this.a;
            float f2 = fArr[4];
            float f3 = fArr[8];
            float f4 = fArr[7];
            float f5 = fArr[5];
            float f6 = fArr[1];
            float f7 = fArr[2];
            float f8 = fArr[3];
            float f9 = fArr[6];
            float f10 = fArr[0];
            grjVar.v(((f2 * f3) - (f4 * f5)) * f, (-((f6 * f3) - (f7 * f4))) * f, ((f6 * f5) - (f7 * f2)) * f, (-((f8 * f3) - (f5 * f9))) * f, ((f3 * f10) - (f7 * f9)) * f, (-((f5 * f10) - (f7 * f8))) * f, ((f8 * f4) - (f9 * f2)) * f, (-((f4 * f10) - (f9 * f6))) * f, ((f10 * f2) - (f8 * f6)) * f);
        }
    }

    public final grj C() {
        return new grj(this.a);
    }

    public final synchronized ajwo a(anzi anziVar) {
        ajwo ajwoVar;
        Object obj = this.a;
        ajwoVar = null;
        if (((IdentityHashMap) obj).containsKey(anziVar)) {
            ajwoVar = (ajwo) ((Optional) ((IdentityHashMap) obj).get(anziVar)).orElse(null);
        } else if ((anziVar.b & 64) != 0 && (ajwoVar = anziVar.i) == null) {
            ajwoVar = ajwo.a;
        }
        return ajwoVar;
    }

    public final synchronized void b() {
        ((IdentityHashMap) this.a).clear();
    }

    public final synchronized void c(anzi anziVar) {
        ((IdentityHashMap) this.a).put(anziVar, Optional.empty());
    }

    public final synchronized void d(anzi anziVar, ajwo ajwoVar) {
        ((IdentityHashMap) this.a).put(anziVar, Optional.ofNullable(ajwoVar));
    }

    public final synchronized boolean e(anzi anziVar) {
        return a(anziVar) != null;
    }

    public final void f() {
        dd ddVar = (dd) this.a;
        cc ccVarG = ddVar.g("STREAM_WIFI_ONLY_BOTTOM_SHEET_FRAGMENT");
        if (ccVarG == null) {
            ccVarG = new igo();
        }
        qnw qnwVar = (qnw) ccVarG;
        if (qnwVar.isAdded()) {
            return;
        }
        qnwVar.h(ddVar, "STREAM_WIFI_ONLY_BOTTOM_SHEET_FRAGMENT");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xgn] */
    public final void g(Dialog dialog, aaub aaubVar) {
        dialog.show();
        if (aaubVar.b == 1) {
            ?? r0 = this.a;
            r0.b(xhb.a(75240), null, null);
            r0.l(new xgj(xhb.b(75291)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(plx plxVar, awoq awoqVar) throws Throwable {
        pbn pbnVar;
        Exception e;
        pkx pkxVar;
        if (awoqVar instanceof pbn) {
            pbnVar = (pbn) awoqVar;
            int i = pbnVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbnVar.b = i - Integer.MIN_VALUE;
            } else {
                pbnVar = new pbn(this, awoqVar);
            }
        } else {
            pbnVar = new pbn(this, awoqVar);
        }
        Object obj = pbnVar.a;
        awox awoxVar = awox.a;
        int i2 = pbnVar.b;
        if (i2 == 0) {
            atqp.j(obj);
            pkx pkxVar2 = pkx.t;
            try {
                bec becVarAh = ((xsc) this.a).ah(plxVar);
                pbo pboVar = new pbo(null, 0);
                pbnVar.c = pkxVar2;
                pbnVar.b = 1;
                if (becVarAh.a(pboVar, pbnVar) == awoxVar) {
                    return awoxVar;
                }
                pkxVar = pkxVar2;
            } catch (Exception e2) {
                e = e2;
                pkxVar = pkxVar2;
                awro.A(pbnVar.getContext());
                return new pkv(e, pkxVar);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pkxVar = pbnVar.c;
            try {
                atqp.j(obj);
            } catch (Exception e3) {
                e = e3;
                awro.A(pbnVar.getContext());
                return new pkv(e, pkxVar);
            }
        }
        return new pla(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(plx plxVar, awoq awoqVar) throws Throwable {
        pbp pbpVar;
        Exception e;
        pkx pkxVar;
        if (awoqVar instanceof pbp) {
            pbpVar = (pbp) awoqVar;
            int i = pbpVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbpVar.b = i - Integer.MIN_VALUE;
            } else {
                pbpVar = new pbp(this, awoqVar);
            }
        } else {
            pbpVar = new pbp(this, awoqVar);
        }
        Object obj = pbpVar.a;
        awox awoxVar = awox.a;
        int i2 = pbpVar.b;
        if (i2 == 0) {
            atqp.j(obj);
            pkx pkxVar2 = pkx.t;
            try {
                awzc awzcVarB = ((xsc) this.a).ah(plxVar).b();
                pbpVar.c = pkxVar2;
                pbpVar.b = 1;
                Object objO = awqx.o(awzcVarB, pbpVar);
                if (objO == awoxVar) {
                    return awoxVar;
                }
                obj = objO;
                pkxVar = pkxVar2;
            } catch (Exception e2) {
                e = e2;
                pkxVar = pkxVar2;
                awro.A(pbpVar.getContext());
                return new pkv(e, pkxVar);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pkxVar = pbpVar.c;
            try {
                atqp.j(obj);
            } catch (Exception e3) {
                e = e3;
                awro.A(pbpVar.getContext());
                return new pkv(e, pkxVar);
            }
        }
        pbu pbuVar = (pbu) obj;
        pbv pbvVar = pbuVar.c;
        if (pbvVar == null) {
            pbvVar = pbv.a;
        }
        long j = pbvVar.c;
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(pbuVar.d);
        mapUnmodifiableMap.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(atqq.u(mapUnmodifiableMap.size()));
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            linkedHashMap.put(entry.getKey(), new Long(((pbv) entry.getValue()).c));
        }
        return new pla(new oze(j, linkedHashMap));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(plx plxVar, awoq awoqVar) throws Throwable {
        pbq pbqVar;
        if (awoqVar instanceof pbq) {
            pbqVar = (pbq) awoqVar;
            int i = pbqVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbqVar.b = i - Integer.MIN_VALUE;
            } else {
                pbqVar = new pbq(this, awoqVar);
            }
        } else {
            pbqVar = new pbq(this, awoqVar);
        }
        Object objI = pbqVar.a;
        Object obj = awox.a;
        int i2 = pbqVar.b;
        if (i2 == 0) {
            atqp.j(objI);
            pbqVar.b = 1;
            objI = i(plxVar, pbqVar);
            if (objI == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objI);
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085 A[Catch: Exception -> 0x00a2, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a2, blocks: (B:25:0x0081, B:27:0x0085, B:32:0x0097, B:23:0x0055), top: B:46:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097 A[Catch: Exception -> 0x00a2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a2, blocks: (B:25:0x0081, B:27:0x0085, B:32:0x0097, B:23:0x0055), top: B:46:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object k(plx plxVar, long j, long j2, Map map, awoq awoqVar) throws Throwable {
        pbr pbrVar;
        pkx pkxVar;
        pkx pkxVar2;
        awri awriVar;
        awmy awmyVar;
        plx plxVar2 = plxVar;
        if (awoqVar instanceof pbr) {
            pbrVar = (pbr) awoqVar;
            int i = pbrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbrVar.c = i - Integer.MIN_VALUE;
            } else {
                pbrVar = new pbr(this, awoqVar);
            }
        } else {
            pbrVar = new pbr(this, awoqVar);
        }
        Object obj = pbrVar.b;
        Object obj2 = awox.a;
        int i2 = pbrVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            pkxVar = pkx.t;
            try {
                awriVar = new awri();
                pbt pbtVar = new pbt(j, awriVar, map, j2);
                bec becVarAh = ((xsc) this.a).ah(plxVar2);
                pbs pbsVar = new pbs(pbtVar, (awoq) null, 0);
                pbrVar.a = plxVar2;
                pbrVar.d = pkxVar;
                pbrVar.e = awriVar;
                pbrVar.c = 1;
                if (becVarAh.a(pbsVar, pbrVar) == obj2) {
                    return obj2;
                }
                if (awriVar.a) {
                    pbrVar.a = pkxVar;
                    pbrVar.d = null;
                    pbrVar.e = null;
                    pbrVar.c = 2;
                    if (j(plxVar2, pbrVar) != obj2) {
                        return obj2;
                    }
                    pkxVar2 = pkxVar;
                    awmyVar = awmy.a;
                } else {
                    awmyVar = awmy.a;
                    pkxVar2 = pkxVar;
                }
            } catch (Exception e) {
                e = e;
                pkxVar2 = pkxVar;
                awro.A(pbrVar.getContext());
                return new pkv(e, pkxVar2);
            }
        } else if (i2 == 1) {
            awri awriVar2 = pbrVar.e;
            pkx pkxVar3 = pbrVar.d;
            plx plxVar3 = (plx) pbrVar.a;
            try {
                atqp.j(obj);
                awriVar = awriVar2;
                pkxVar = pkxVar3;
                plxVar2 = plxVar3;
                if (awriVar.a) {
                    pbrVar.a = pkxVar;
                    pbrVar.d = null;
                    pbrVar.e = null;
                    pbrVar.c = 2;
                    if (j(plxVar2, pbrVar) != obj2) {
                        return obj2;
                    }
                    pkxVar2 = pkxVar;
                    awmyVar = awmy.a;
                } else {
                    awmyVar = awmy.a;
                    pkxVar2 = pkxVar;
                }
            } catch (Exception e2) {
                e = e2;
                pkxVar2 = pkxVar3;
                awro.A(pbrVar.getContext());
                return new pkv(e, pkxVar2);
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pkxVar2 = (pkx) pbrVar.a;
            try {
                atqp.j(obj);
                awmyVar = awmy.a;
            } catch (Exception e3) {
                e = e3;
                awro.A(pbrVar.getContext());
                return new pkv(e, pkxVar2);
            }
        }
        return new pla(awmyVar);
    }

    public final int l() {
        return a.aS(((Bundle) this.a).getInt("chime.richCollapsedView"));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final osn m(String str) {
        osn osnVar;
        ?? r1 = this.a;
        synchronized (r1) {
            osnVar = (osn) r1.get(str);
            if (osnVar == null) {
                osnVar = new osn();
                r1.put(str, osnVar);
            }
        }
        return osnVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final asvc n(String str) {
        return (asvc) this.a.get(str);
    }

    public final agev p() {
        return (agev) ((Pair) this.a).second;
    }

    public final ListenableFuture q() {
        return (ListenableFuture) ((Pair) this.a).first;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    public final ablz r(int i) {
        if (i >= 0) {
            ?? r1 = this.a;
            if (i < r1.size()) {
                return (ablz) r1.get(i);
            }
        }
        return null;
    }

    public final aoow s(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajvq.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajvq.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                ajwo ajwoVar2 = ((ajvq) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                return s(ajwoVar2);
            }
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arik.a);
            ajwoVar.c(aihlVarCheckIsLite3);
            if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(arik.a);
                ajwoVar.c(aihlVarCheckIsLite4);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                arij arijVar = (arij) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                aril arilVar = arijVar.n;
                if (arilVar == null) {
                    arilVar = aril.a;
                }
                if ((arilVar.b & 1) != 0) {
                    aril arilVar2 = arijVar.n;
                    if (arilVar2 == null) {
                        arilVar2 = aril.a;
                    }
                    aoow aoowVar = arilVar2.c;
                    return aoowVar == null ? aoow.a : aoowVar;
                }
            }
        }
        return null;
    }

    public final float u(int i, int i2) {
        return ((float[]) this.a)[(i * 3) + i2];
    }

    public final void v(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float[] fArr = (float[]) this.a;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    public final agev w() {
        return agev.h(((aamc) ((aatj) this.a).a).a);
    }

    public final aare x(aaml aamlVar) {
        ArrayList arrayList = new ArrayList();
        if (wir.y().contains(Integer.valueOf(aamlVar.a()))) {
            return aagu.e(aamlVar, 0, arrayList, 2);
        }
        Object obj = this.a;
        if (!((yha) obj).e(aamlVar.g(), zik.co(aamlVar.a(), aamlVar.h()), 0L, 1, 1, 1)) {
            aagu.f(0L, aamlVar, arrayList);
        }
        return aagu.e(aamlVar, 0, arrayList, 2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zwb] */
    public final String y() {
        return this.a.e().i();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final ListenableFuture z(Class cls, Collection collection) {
        ?? r4 = this.a;
        if (!r4.containsKey(cls)) {
            throw new IllegalStateException(String.format("AppSearchDocument transformer binding missing from map for %s", cls.getCanonicalName()));
        }
        aajz aajzVar = (aajz) ((awmd) r4.get(cls)).io();
        if (cls.equals(aajzVar.b())) {
            return aajzVar.a(collection);
        }
        throw new IllegalStateException(String.format("Type mismatch for %s. Expected=%s, Actual=%s", aajzVar.getClass(), cls, aajzVar.b()));
    }

    public grj(Object obj) {
        this.a = obj;
    }

    public grj(Map map) {
        this.a = map;
    }

    public grj(opt optVar) {
        this.a = new rbm(optVar);
    }

    public grj(short[] sArr) {
        this.a = new float[9];
    }

    public grj() {
        this.a = new IdentityHashMap();
    }

    public grj(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = new float[]{f, f2, f3, f4, f5, f6, f7, f8, f9};
    }

    public grj(ListenableFuture listenableFuture, agev agevVar) {
        this.a = Pair.create(listenableFuture, agevVar);
    }

    public grj(xsc xscVar) {
        xscVar.getClass();
        this.a = xscVar;
    }

    public grj(awmd awmdVar, byte[] bArr) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public grj(byte[] bArr, byte[] bArr2) {
        this.a = new awkx();
    }

    public grj(awmd awmdVar) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public grj(byte[] bArr) {
        this.a = awku.aC(Boolean.FALSE);
    }

    public grj(xgm xgmVar) {
        this.a = xgmVar.hB();
    }

    public grj(hwc hwcVar) {
        hwcVar.getClass();
        this.a = hwcVar;
    }

    public grj(dd ddVar) {
        ddVar.getClass();
        this.a = ddVar;
    }

    public grj(final opq opqVar, AccessibilityManager accessibilityManager) {
        AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener = new AccessibilityManager$AccessibilityServicesStateChangeListener() { // from class: opp
            public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager2) {
                opq opqVar2 = opqVar;
                if (!opq.d() || (opqVar2.b && !opqVar2.c)) {
                    opqVar2.d = accessibilityManager2.getEnabledAccessibilityServiceList(-1);
                } else {
                    opqVar2.d = null;
                }
                opqVar2.b();
            }
        };
        this.a = accessibilityManager$AccessibilityServicesStateChangeListener;
        accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public grj(asvf asvfVar) {
        asvc asvcVar;
        this.a = new HashMap();
        int i = 0;
        while (true) {
            asvfVar.aR();
            if (i >= ((ArrayList) asvfVar.d.get()).size()) {
                return;
            }
            asvfVar.aR();
            asvh asvhVar = (asvh) ((ArrayList) asvfVar.d.get()).get(i);
            ?? r2 = this.a;
            if (asvhVar.e == null) {
                if ((Memory.peekByte(asvhVar.c + 8) & 1) != 0) {
                    asvhVar.e = asvhVar.cq(asvh.d.b);
                } else {
                    asvhVar.e = "";
                }
            }
            String str = asvhVar.e;
            if (asvhVar.f == null && (Memory.peekByte(asvhVar.c + 8) & 2) != 0) {
                asvhVar.f = new asvc(asvhVar.cp(true != asvh.a ? 12 : 32, asvb.a));
            }
            if (asvhVar.f == null) {
                asvcVar = asva.a;
            } else {
                asvcVar = asvhVar.f;
            }
            r2.put(str, asvcVar);
            i++;
        }
    }

    public grj(char[] cArr) {
        this.a = new HashMap();
    }
}
