package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ijt {
    public final Object a;

    public ijt(qvc qvcVar, qvc qvcVar2) {
        this.a = new HashSet();
        if (!qvcVar.c.equals(qvcVar2.c)) {
            d(rjd.d);
        }
        if (!qvcVar.d.equals(qvcVar2.d) || !qvcVar.e.equals(qvcVar2.e)) {
            d(rjd.b);
        }
        if (qvcVar.f != qvcVar2.f) {
            d(rjd.a);
        }
    }

    public static ijt a(adly adlyVar) {
        Object objC = adlyVar != null ? adlyVar.c("VoteReorderCoordinatorKey") : null;
        return (ijt) (ijt.class.isInstance(objC) ? ijt.class.cast(objC) : null);
    }

    private static agke q(qva qvaVar) {
        float f = qvaVar.a;
        return agke.r(Float.valueOf(0.0f), qvaVar.b);
    }

    private static agke r(qvj qvjVar) {
        return agke.A(Double.valueOf(qvjVar.k()), Double.valueOf(qvjVar.l()), Double.valueOf(qvjVar.m()), Double.valueOf(qvjVar.o()), Double.valueOf(qvjVar.w()), Double.valueOf(qvjVar.i()), Double.valueOf(qvjVar.n()), Double.valueOf(qvjVar.v()), Double.valueOf(qvjVar.r()), Double.valueOf(qvjVar.q()), Double.valueOf(qvjVar.j()), Double.valueOf(qvjVar.p()), Double.valueOf(qvjVar.u()), Double.valueOf(qvjVar.s()), Double.valueOf(qvjVar.t()));
    }

    public final void b() {
        ((jin) this.a).b();
    }

    public final String c(int i) {
        return (String) ((SparseArray) this.a).get(i);
    }

    protected final void d(rjd rjdVar) {
        ((HashSet) this.a).add(rjdVar);
    }

    public final boolean e(rjd rjdVar) {
        return ((HashSet) this.a).contains(rjdVar);
    }

    public final String f(Uri uri, String str, String str2) {
        aha ahaVar;
        if (uri != null) {
            ahaVar = (aha) ((aha) this.a).get(uri.toString());
        } else {
            ahaVar = null;
        }
        if (ahaVar == null) {
            return null;
        }
        if (str != null) {
            str2 = str.concat(str2);
        }
        return (String) ahaVar.get(str2);
    }

    public final boolean g(String str) {
        Object pkvVar;
        Object obj;
        str.getClass();
        if (!auuw.a.io().h()) {
            return qou.a.a(str) || awrc.n(str, "https://www.gstatic.com/gnp_", false);
        }
        pkx pkxVar = pkx.d;
        try {
            Object obj2 = this.a;
            Uri uri = Uri.parse(str);
            uri.getClass();
            pkvVar = new pla(Boolean.valueOf(((aifk) obj2).b(uri) || awrc.n(str, "https://www.gstatic.com/gnp_", false)));
        } catch (Exception e) {
            pkvVar = new pkv(e, pkxVar);
        }
        int iD = a.D(pkvVar);
        if (iD == 0) {
            obj = ((pla) pkvVar).a;
        } else {
            if (iD != 1) {
                throw new awmj();
            }
            obj = Boolean.FALSE;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final pky h() {
        NetworkCapabilities networkCapabilities;
        pkx pkxVar = pkx.aO;
        try {
            Object systemService = ((Context) this.a).getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            boolean z = false;
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                z = true;
            }
            return new pla(Boolean.valueOf(z));
        } catch (Exception e) {
            return new pkv(e, pkxVar);
        }
    }

    public final Typeface i(int i, int i2, Typeface typeface) {
        return (Typeface) ((acla) this.a).a(aavv.t(i, i2, typeface));
    }

    public final void j(int i, int i2, Typeface typeface, Typeface typeface2) {
        ((acla) this.a).b(aavv.t(i, i2, typeface), typeface2);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Set] */
    public final acit k() {
        HashMap map = new HashMap();
        for (acii aciiVar : this.a) {
            Parcelable parcelableC = aciiVar.c();
            if (parcelableC != null) {
                map.put(aciiVar.getClass().toString(), parcelableC);
            }
        }
        return new acit(map);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable, java.lang.Object] */
    public final abyd l(abxz abxzVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            abyc abycVarA = ((abyf) it.next()).a(abxzVar);
            if (abycVarA != null) {
                arrayList.add(abycVarA);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            linkedHashMap.put(aasc.d(((abyc) obj).a()), obj);
        }
        linkedHashMap.toString();
        return new abyd(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final abyd m(String str) {
        str.getClass();
        return (abyd) this.a.get(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Set n() {
        return atqq.aw(this.a.keySet());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void o(String str, abyd abydVar) {
        str.getClass();
        this.a.put(str, abydVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void p(String str) {
        str.getClass();
        this.a.remove(str);
    }

    public ijt(Object obj) {
        this.a = obj;
    }

    public ijt(wek wekVar) {
        this.a = wekVar;
    }

    public ijt() {
        this.a = new SparseArray();
    }

    public ijt(Map map) {
        this.a = agkj.h(map);
    }

    public ijt(byte[] bArr) {
        this.a = new ConcurrentHashMap();
    }

    public ijt(Context context, byte[] bArr) {
        context.getClass();
        this.a = context;
    }

    public ijt(cf cfVar) {
        cfVar.getClass();
        this.a = cfVar;
    }

    public ijt(aifk aifkVar) {
        aifkVar.getClass();
        this.a = aifkVar;
        agsn.h("GnpSdk");
    }

    public ijt(pxv pxvVar) {
        pxvVar.getClass();
        this.a = pxvVar;
    }

    public ijt(Context context) {
        this.a = aguu.al(new ope(context, 13));
    }

    public ijt(byte[] bArr, byte[] bArr2) {
        aihf aihfVarCreateBuilder = ahxi.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ahxi ahxiVar = (ahxi) aihfVarCreateBuilder.instance;
        ahxiVar.c = 83;
        ahxiVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        ahxi ahxiVar2 = (ahxi) aihfVarCreateBuilder.instance;
        ahxiVar2.d = 2;
        ahxiVar2.b |= 4;
        this.a = (ahxi) aihfVarCreateBuilder.build();
    }

    public ijt(char[] cArr) {
        this.a = new HashMap();
    }

    public ijt(qva qvaVar, qva qvaVar2) {
        this((qvc) qvaVar, (qvc) qvaVar2);
        if (aguu.v(q(qvaVar), q(qvaVar2))) {
            return;
        }
        d(rjd.c);
    }

    public ijt(rby rbyVar, rby rbyVar2) {
        this((qvc) rbyVar, (qvc) rbyVar2);
        if (!Objects.equals(rbyVar.a, rbyVar2.a)) {
            d(rjd.d);
        }
        throw null;
    }

    public ijt(int i) {
        this.a = new acla(i);
    }

    public ijt(qvd qvdVar, qvd qvdVar2) {
        this((qvc) qvdVar, (qvc) qvdVar2);
        qve qveVar = qvdVar.a;
        qve qveVar2 = qvdVar2.a;
        if (qvdVar.i() != qvdVar2.i()) {
            d(rjd.c);
        }
    }

    public ijt(qvi qviVar, qvi qviVar2) {
        this((qvc) qviVar, (qvc) qviVar2);
        if (qviVar.a.d.equals(qviVar2.a.d)) {
            return;
        }
        d(rjd.d);
    }

    public ijt(qzl qzlVar, qzl qzlVar2) {
        this((qvi) qzlVar, (qvi) qzlVar2);
        if (Objects.equals(qzlVar.h, qzlVar2.h) && Objects.equals(qzlVar.i, qzlVar2.i)) {
            return;
        }
        d(rjd.c);
    }

    public ijt(qvj qvjVar, qvj qvjVar2) {
        this((qvc) qvjVar, (qvc) qvjVar2);
        if (aguu.v(r(qvjVar), r(qvjVar2))) {
            return;
        }
        d(rjd.c);
    }

    public ijt(qvk qvkVar, qvk qvkVar2) {
        this((qvc) qvkVar, (qvc) qvkVar2);
        if (Objects.equals(qvkVar.a, qvkVar2.a)) {
            return;
        }
        d(rjd.d);
    }

    public ijt(short[] sArr) {
        this.a = new ConcurrentHashMap();
    }

    public ijt(Set set, byte[] bArr) {
        set.getClass();
        this.a = set;
    }
}
