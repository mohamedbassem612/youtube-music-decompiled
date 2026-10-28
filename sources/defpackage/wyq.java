package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import com.airbnb.lottie.LottieAnimationView;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wyq implements wxq {
    private static final agke i = agke.r(wyp.a, wyp.b);
    public final Handler a;
    public final acyx d;
    public String f;
    public LottieAnimationView g;
    public final zs h;
    private final avmb j;
    private avmn k;
    private String l;
    private xby m;
    final ArrayList e = new ArrayList();
    public final admu b = new admu();
    public final Map c = new HashMap();
    private final gob n = new gob(this, 17);

    public wyq(Handler handler, zs zsVar, acyx acyxVar, avmb avmbVar) {
        this.a = handler;
        this.h = zsVar;
        this.d = acyxVar;
        this.j = avmbVar;
    }

    public static final Optional u(Object obj) {
        obj.getClass();
        Objects.checkIndex(0, 4);
        if (obj instanceof amrc) {
            return Optional.of(((amrc) obj).c);
        }
        if (obj instanceof amrd) {
            return Optional.of(((amrd) obj).c);
        }
        return obj instanceof amra ? Optional.of(((amra) obj).b) : Optional.empty();
    }

    @Override // defpackage.wxq
    public final /* synthetic */ adkz a() {
        return this.b;
    }

    @Override // defpackage.wxq
    public final adlz b() {
        return this.n;
    }

    @Override // defpackage.wxq
    public final void c(amrb amrbVar, Duration duration) {
        this.a.postDelayed(new vwh(this, amrbVar, duration, 4, (char[]) null), 100L);
    }

    @Override // defpackage.wxq
    public final void d(LottieAnimationView lottieAnimationView) {
        this.g = lottieAnimationView;
    }

    @Override // defpackage.wxq
    public final void e() {
        taq.d();
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            this.a.removeCallbacks((wyo) it.next());
        }
    }

    @Override // defpackage.wxq
    public final void f(ajwo ajwoVar) {
        this.a.post(new wtg(this, ajwoVar, 18));
    }

    @Override // defpackage.wxq
    public final void g(String str) {
        if (this.e.contains(wyp.a) && str.equals(this.f)) {
            this.a.post(new wvr(this, 9));
        }
    }

    @Override // defpackage.wxq
    public final void h() {
        if (this.e.contains(wyp.b)) {
            this.a.post(new wvr(this, 10));
        }
    }

    @Override // defpackage.wxq
    public final void i(String str) {
        wyo wyoVar = (wyo) this.c.get(str);
        if (wyoVar != null) {
            Handler handler = this.a;
            handler.removeCallbacks(wyoVar);
            handler.post(wyoVar);
        }
    }

    @Override // defpackage.wxq
    public final void j(String str) {
        ArrayList arrayList = new ArrayList();
        for (wyo wyoVar : this.c.values()) {
            if (TextUtils.equals(str, yno.dN(wyoVar))) {
                arrayList.add(wyoVar);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            wyo wyoVar2 = (wyo) arrayList.get(i2);
            this.a.removeCallbacks(wyoVar2);
            i(wyoVar2.a);
        }
    }

    @Override // defpackage.wxq
    public final void k() {
        taq.d();
        for (wyo wyoVar : this.c.values()) {
            long jCurrentTimeMillis = (wyoVar.d + wyoVar.c) - System.currentTimeMillis();
            Handler handler = this.a;
            if (jCurrentTimeMillis <= 0) {
                handler.post(wyoVar);
            } else {
                handler.postDelayed(wyoVar, jCurrentTimeMillis);
            }
        }
    }

    @Override // defpackage.wxq
    public final void l() {
        taq.d();
        Map map = this.c;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            this.a.removeCallbacks((wyo) it.next());
        }
        map.clear();
        this.b.clear();
        this.e.clear();
        t();
    }

    @Override // defpackage.wxq
    public final void m(apji apjiVar) {
        if (this.m != null) {
            this.a.post(new wtg(this, apjiVar, 17));
        }
    }

    @Override // defpackage.wxq
    public final void n(apji apjiVar) {
        if (this.m != null) {
            this.a.post(new wtg(this, apjiVar, 16));
        }
    }

    @Override // defpackage.wxq
    public final void o(String str, wek wekVar) {
        if (ahno.aa(str)) {
            this.l = null;
            return;
        }
        String str2 = this.l;
        if (str2 != null) {
            wer werVarE = wekVar.e();
            werVarE.j(str2);
            werVarE.b();
        }
        Object obj = this.k;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
        this.l = str;
        this.k = wekVar.j(str, true).O(this.j).af(new vva(this, 16));
    }

    @Override // defpackage.wxq
    public final void p(xby xbyVar) {
        this.m = xbyVar;
    }

    public final void q(Object obj, Duration duration) {
        taq.d();
        Optional optionalU = u(obj);
        if (optionalU.isEmpty()) {
            return;
        }
        Map map = this.c;
        if (map.containsKey(optionalU.get())) {
            return;
        }
        long millis = duration.toMillis();
        wyo wyoVar = new wyo(this, (String) optionalU.get(), obj, millis, System.currentTimeMillis());
        map.put(optionalU.get(), wyoVar);
        this.b.add(this.e.size(), obj);
        this.a.postDelayed(wyoVar, millis);
    }

    public final void r(wyp wypVar, Object obj) {
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(wypVar);
        if (iIndexOf != -1) {
            this.b.hM(iIndexOf, obj);
            return;
        }
        agke agkeVar = i;
        int iIndexOf2 = agkeVar.indexOf(wypVar);
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (agkeVar.indexOf((wyp) arrayList.get(i3)) <= iIndexOf2) {
                i2++;
            }
        }
        arrayList.add(i2, wypVar);
        this.b.add(i2, obj);
    }

    public final void s(wyp wypVar) {
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(wypVar);
        if (iIndexOf != -1) {
            this.b.remove(iIndexOf);
            arrayList.remove(iIndexOf);
        }
    }

    public final void t() {
        this.f = null;
    }
}
