package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elr {
    public final Object a;

    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    public elr(double[] dArr) {
        this.a = new LinkedHashMap(dArr.length);
        int i = 0;
        double d = -1.0d;
        while (i < dArr.length) {
            double d2 = dArr[i];
            ahno.F(((d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1)) ^ (-1)) >>> 31);
            if (i > 0) {
                ahno.F((d2 > d ? 1 : (d2 == d ? 0 : -1)) >>> 31);
            }
            ((LinkedHashMap) this.a).put(Double.valueOf(d2), new oge());
            i++;
            d = d2;
        }
    }

    public static elr J(cuz cuzVar) {
        if (cuzVar != null) {
            return new elr(cuzVar.b, cuzVar.c, cuzVar.d, cuzVar.e);
        }
        return null;
    }

    private final oge K(double d) {
        for (Map.Entry entry : ((LinkedHashMap) this.a).entrySet()) {
            if (d >= ((Double) entry.getKey()).doubleValue()) {
                return (oge) entry.getValue();
            }
        }
        throw new IllegalArgumentException(String.format("No matching bucket for value %s", Double.valueOf(d)));
    }

    private static int L(DisplayMetrics displayMetrics, int i) {
        return (int) Math.ceil(i / displayMetrics.density);
    }

    public static List a(int i, List list) {
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            fsz fszVar = (fsz) it.next();
            int i3 = i2 + 1;
            if (i2 == i) {
                break;
            }
            arrayList.add(fszVar.b);
            i2 = i3;
        }
        return arrayList;
    }

    public static List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((fif) it.next()).b);
        }
        return arrayList;
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((fif) it.next()).a);
        }
        return arrayList;
    }

    public final void A(zpx zpxVar) {
        ((awlo) this.a).kk(zpxVar);
    }

    public final Long B(String str) {
        String strC = C(str);
        if (strC == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strC));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final String C(String str) {
        List list = (List) this.a.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public final int D(long j) {
        return ((cuz) this.a).e(j);
    }

    public final int E() {
        return ((cuz) this.a).a;
    }

    public final int[] F() {
        return ((cuz) this.a).b;
    }

    public final long[] G() {
        return ((cuz) this.a).d;
    }

    public final long[] H() {
        return ((cuz) this.a).c;
    }

    public final long[] I() {
        return ((cuz) this.a).e;
    }

    public final ftg d(Object obj, int i) {
        int i2 = fot.s;
        zh zhVar = new zh((byte[]) null);
        zhVar.a = i;
        zhVar.b = obj;
        fip fipVar = (fip) this.a;
        ftg ftgVarR = (ftg) fipVar.b.n().z(fipVar, zhVar);
        if (ftgVarR == null) {
            gzj.br(2, "RenderInfo has returned null. Returning ComponentRenderInfo.createEmpty() as default.");
            ftgVarR = fqe.r();
        }
        boolean z = fna.a;
        return ftgVarR;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void e(String str, Callable callable) {
        this.a.put(str, callable);
    }

    public final void f(int i, oip oipVar) {
        ((ong) this.a).k(i, oipVar.d, oipVar.f, oipVar.s, oipVar.t);
    }

    public final long g(double d) {
        return K(d).c();
    }

    public final long h(int i, double d) {
        return K(d).b(i);
    }

    public final void i(double d, long j) {
        for (Map.Entry entry : ((LinkedHashMap) this.a).entrySet()) {
            double dDoubleValue = ((Double) entry.getKey()).doubleValue();
            oge ogeVar = (oge) entry.getValue();
            if (d <= 0.0d || d < dDoubleValue) {
                ogeVar.e();
            } else {
                ogeVar.d(j);
            }
        }
    }

    public final void j() {
        Iterator it = ((LinkedHashMap) this.a).entrySet().iterator();
        while (it.hasNext()) {
            ((oge) ((Map.Entry) it.next()).getValue()).e();
        }
    }

    public final void k() {
        Iterator it = ((LinkedHashMap) this.a).entrySet().iterator();
        while (it.hasNext()) {
            ((oge) ((Map.Entry) it.next()).getValue()).f();
        }
    }

    public final Long[] l(int i, boolean z) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        int size = linkedHashMap.size();
        Long[] lArr = new Long[size];
        Iterator it = linkedHashMap.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            lArr[i2] = Long.valueOf(((oge) ((Map.Entry) it.next()).getValue()).b(i));
            i2++;
        }
        if (!z) {
            int i3 = size - 1;
            while (i3 > 0) {
                int i4 = i3 - 1;
                lArr[i3] = Long.valueOf(lArr[i3].longValue() - lArr[i4].longValue());
                i3 = i4;
            }
        }
        return lArr;
    }

    public final ofl m(ofk ofkVar) {
        if (!ofkVar.i() || !ofkVar.g()) {
            return new ofl(0.0d, 0.0d, null, null, null, null);
        }
        DisplayMetrics displayMetricsD = ofkVar.d();
        Rect rect = new Rect(0, 0, L(displayMetricsD, displayMetricsD.widthPixels), L(displayMetricsD, displayMetricsD.heightPixels));
        DisplayMetrics displayMetricsL = ofkVar.l((oml) this.a);
        Rect rect2 = new Rect(0, 0, L(displayMetricsL, displayMetricsL.widthPixels), L(displayMetricsL, displayMetricsL.heightPixels));
        int iB = ofkVar.b();
        int iA = ofkVar.a();
        Pair pairE = ofkVar.e();
        int iL = L(displayMetricsD, ((Integer) pairE.first).intValue());
        int iL2 = L(displayMetricsD, ((Integer) pairE.second).intValue());
        Rect rect3 = new Rect(iL, iL2, L(displayMetricsD, iB) + iL, L(displayMetricsD, iA) + iL2);
        if (ofkVar.a || !ofkVar.k() || !ofkVar.h()) {
            return new ofl(0.0d, 0.0d, rect3, rect3, rect, rect2);
        }
        int iHeight = rect2.height() * rect2.width();
        int iHeight2 = rect3.height() * rect3.width();
        Rect rect4 = new Rect();
        Rect rectC = ofkVar.c();
        rect4.setIntersect(new Rect(rect3.left + L(displayMetricsD, rectC.left), rect3.top + L(displayMetricsD, rectC.top), rect3.left + L(displayMetricsD, rectC.right), rect3.top + L(displayMetricsD, rectC.bottom)), rect3);
        double d = iHeight2;
        double dHeight = rect4.height() * rect4.width();
        double d2 = iHeight;
        return new ofl(d > 0.0d ? dHeight / d : 0.0d, d2 > 0.0d ? dHeight / d2 : 0.0d, rect3, rect3, rect, rect2);
    }

    public final void n(aamo aamoVar) {
        Object obj = aamoVar.b;
        if (obj != null) {
            v((aaok) obj);
        }
    }

    public final void o(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n((aamo) it.next());
        }
    }

    public final void p(aaao aaaoVar, boolean z) {
        ((aerv) this.a).k(aaaoVar.name(), true, z);
    }

    public final void q(aaan aaanVar) {
        ((qtf) ((aerv) this.a).k.io()).b(1L, aaanVar.name());
    }

    public final Optional r(ozi oziVar) {
        return u(oziVar.e, ajcq.a);
    }

    public final Optional s(ozj ozjVar) {
        return u(ozjVar.c, ajct.a);
    }

    public final Optional t(List list) {
        if (list.isEmpty()) {
            ((aaap) this.a).a("There are no ChimeThreads to get the payload from.");
            return Optional.empty();
        }
        if (list.size() <= 1) {
            return Optional.of((ozj) aguu.M(list));
        }
        ((aaap) this.a).a("There is more than one ChimeThread, must be a group summary (not supported).");
        return Optional.empty();
    }

    public final Optional u(aifv aifvVar, aikc aikcVar) {
        if (aifvVar == null) {
            ((aaap) this.a).a("The custom payload is absent.");
            return Optional.empty();
        }
        try {
            MessageLite messageLite = (MessageLite) (((aikd) aikcVar).a == aike.c(aifvVar.b) ? agev.i(((aikd) aikcVar).b.e(aifvVar.c, ExtensionRegistryLite.getGeneratedRegistry())) : agdf.a).f();
            if (messageLite == null) {
                ((aaap) this.a).a("The custom payload could not be unpacked.");
            }
            return Optional.ofNullable(messageLite);
        } catch (aiik unused) {
            ((aaap) this.a).a("The custom payload has wrong format/type.");
            return Optional.empty();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final void v(aaok aaokVar) {
        taq.c();
        aaew aaewVar = (aaew) this.a.io();
        if (aaewVar.av((String) aaokVar.b) == null) {
            aaewVar.ab(aaokVar);
        } else {
            aaewVar.ac(aaokVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized Optional w(String str) {
        return Optional.ofNullable((xgt) this.a.get(str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void x(String str, xgt xgtVar) {
        if (this.a.containsKey(str)) {
            return;
        }
        y(str, xgtVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void y(String str, xgt xgtVar) {
        this.a.put(str, xgtVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final zyo z(akxc akxcVar) {
        SecureRandom secureRandom = (SecureRandom) this.a.io();
        secureRandom.getClass();
        akxcVar.getClass();
        return new zyo(secureRandom, akxcVar);
    }

    public elr(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public elr() {
        this.a = new HashMap();
    }

    public elr(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = new cuz(iArr, jArr, jArr2, jArr3);
    }

    public elr(View view) {
        this.a = view;
        view.getVisibility();
    }

    public elr(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new awlo();
    }

    public elr(awmd awmdVar) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public elr(awmd awmdVar, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public elr(byte[] bArr) {
        this(new double[]{ofs.FULL.f, ofs.THREE_QUARTER.f, ofs.HALF.f, ofs.QUARTER.f, ofs.NONE.f});
    }

    public elr(byte[] bArr, byte[] bArr2) {
        this.a = DesugarCollections.synchronizedMap(new afv());
    }

    public elr(vxu vxuVar, awmd awmdVar, awmd awmdVar2) {
        aaah aaahVar;
        if (vxuVar == null) {
            aaahVar = null;
        } else {
            amvc amvcVar = vxuVar.c().f;
            aaahVar = (aaah) ((amvcVar == null ? amvc.a : amvcVar).c ? awmdVar.io() : awmdVar2.io());
        }
        this.a = aaahVar;
    }

    public elr(Object obj) {
        this.a = obj;
    }

    public elr(char[] cArr) {
        this.a = new ArrayDeque();
    }
}
