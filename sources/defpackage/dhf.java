package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dhf {
    public List a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    private Object f;

    public dhf(dhg dhgVar) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = new HashSet();
        this.a = new ArrayList();
        if (dhgVar == null) {
            throw new IllegalArgumentException("descriptor must not be null");
        }
        this.b = new Bundle(dhgVar.a);
        this.c = dhgVar.s();
        this.d = dhgVar.r();
        this.f = dhgVar.t();
        this.a = dhgVar.c;
        this.e = dhgVar.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (s(r4, r5, r10.H(), r10.j(), r10.k(), r9) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.cnm p(defpackage.bth r10, defpackage.agke r11, defpackage.cnm r12, defpackage.btl r13) {
        /*
            btn r0 = r10.w()
            int r1 = r10.m()
            boolean r2 = r0.n()
            r3 = 0
            if (r2 == 0) goto L11
            r5 = r3
            goto L16
        L11:
            java.lang.Object r2 = r0.f(r1)
            r5 = r2
        L16:
            boolean r2 = r10.H()
            r4 = 0
            r6 = -1
            if (r2 != 0) goto L37
            boolean r2 = r0.n()
            if (r2 != 0) goto L37
            btl r0 = r0.d(r1, r13, r4)
            long r1 = r10.r()
            long r1 = defpackage.bwp.y(r1)
            long r6 = r13.f
            long r1 = r1 - r6
            int r6 = r0.b(r1)
        L37:
            r9 = r6
            r13 = r4
        L39:
            int r0 = r11.size()
            if (r13 >= r0) goto L5b
            java.lang.Object r0 = r11.get(r13)
            r4 = r0
            cnm r4 = (defpackage.cnm) r4
            boolean r6 = r10.H()
            int r7 = r10.j()
            int r8 = r10.k()
            boolean r0 = s(r4, r5, r6, r7, r8, r9)
            if (r0 != 0) goto L76
            int r13 = r13 + 1
            goto L39
        L5b:
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L78
            if (r12 == 0) goto L78
            boolean r6 = r10.H()
            int r7 = r10.j()
            int r8 = r10.k()
            r4 = r12
            boolean r10 = s(r4, r5, r6, r7, r8, r9)
            if (r10 == 0) goto L78
        L76:
            r12 = r4
            goto L79
        L78:
            r12 = r3
        L79:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhf.p(bth, agke, cnm, btl):cnm");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r6.c < r0.a(r1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r1 >= 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void r(defpackage.agkh r5, defpackage.cnm r6, defpackage.btn r7) {
        /*
            r4 = this;
            if (r6 == 0) goto L45
            java.lang.Object r0 = r4.b
            java.lang.Object r1 = r6.a
            int r1 = r7.a(r1)
            r2 = -1
            if (r1 == r2) goto L32
            btl r0 = (defpackage.btl) r0
            r3 = 0
            r7.d(r1, r0, r3)
            boolean r1 = r6.c()
            if (r1 == 0) goto L29
            int r1 = r6.b
            r0.k()
            if (r1 >= 0) goto L32
            int r2 = r6.c
            int r0 = r0.a(r1)
            if (r2 >= r0) goto L32
            goto L42
        L29:
            int r1 = r6.e
            if (r1 == r2) goto L42
            r0.k()
            if (r1 < 0) goto L42
        L32:
            java.lang.Object r4 = r4.f
            agkj r4 = (defpackage.agkj) r4
            java.lang.Object r4 = r4.get(r6)
            btn r4 = (defpackage.btn) r4
            if (r4 == 0) goto L45
            r5.e(r6, r4)
            goto L45
        L42:
            r5.e(r6, r7)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhf.r(agkh, cnm, btn):void");
    }

    private static boolean s(cnm cnmVar, Object obj, boolean z, int i, int i2, int i3) {
        if (!cnmVar.a.equals(obj)) {
            return false;
        }
        if (z) {
            if (cnmVar.b != i || cnmVar.c != i2) {
                return false;
            }
        } else if (cnmVar.b != -1 || cnmVar.e != i3) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection] */
    public final dhg a() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>((Collection<? extends Object>) this.d);
        Bundle bundle = (Bundle) this.b;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>((Collection) this.c));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>((Collection) this.f));
        return new dhg(bundle, (String) this.e, this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    public final void b(IntentFilter intentFilter) {
        if (intentFilter == null) {
            throw new IllegalArgumentException("filter must not be null");
        }
        if (this.d.contains(intentFilter)) {
            return;
        }
        this.d.add(intentFilter);
    }

    public final void c(Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("filters must not be null");
        }
        if (collection.isEmpty()) {
            return;
        }
        for (Object obj : collection) {
            if (obj instanceof IntentFilter) {
                b((IntentFilter) obj);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    public final void d(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("groupMemberId must not be empty");
            }
            if (!this.c.contains(str)) {
                this.c.add(str);
            }
        }
    }

    public final void e(int i) {
        ((Bundle) this.b).putInt("connectionState", i);
    }

    public final void f(String str) {
        ((Bundle) this.b).putString("status", str);
    }

    public final void g(int i) {
        ((Bundle) this.b).putInt("deviceType", i);
    }

    public final void h(boolean z) {
        ((Bundle) this.b).putBoolean("enabled", z);
    }

    public final void i(Bundle bundle) {
        Object obj = this.b;
        if (bundle == null) {
            ((Bundle) obj).putBundle("extras", null);
        } else {
            ((Bundle) obj).putBundle("extras", new Bundle(bundle));
        }
    }

    public final void j(int i) {
        ((Bundle) this.b).putInt("playbackType", i);
    }

    public final void k(int i) {
        ((Bundle) this.b).putInt("presentationDisplayId", i);
    }

    public final void l(int i) {
        ((Bundle) this.b).putInt("volume", i);
    }

    public final void m(int i) {
        ((Bundle) this.b).putInt("volumeHandling", i);
    }

    public final void n(int i) {
        ((Bundle) this.b).putInt("volumeMax", i);
    }

    public final btn o(cnm cnmVar) {
        return (btn) ((agkj) this.f).get(cnmVar);
    }

    public final void q(btn btnVar) {
        List list;
        agkh agkhVar = new agkh(4);
        if (((agke) this.a).isEmpty()) {
            r(agkhVar, (cnm) this.d, btnVar);
            if (!Objects.equals(this.c, this.d)) {
                r(agkhVar, (cnm) this.c, btnVar);
            }
            if (!Objects.equals(this.e, this.d) && !Objects.equals(this.e, this.c)) {
                r(agkhVar, (cnm) this.e, btnVar);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((agke) this.a).size();
                list = this.a;
                if (i >= size) {
                    break;
                }
                r(agkhVar, (cnm) ((agke) list).get(i), btnVar);
                i++;
            }
            if (!((agke) list).contains(this.e)) {
                r(agkhVar, (cnm) this.e, btnVar);
            }
        }
        this.f = agkhVar.d(true);
    }

    public dhf(btl btlVar) {
        this.b = btlVar;
        this.a = agpi.a;
        this.f = agpn.b;
    }

    public dhf(String str, String str2) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = new HashSet();
        this.a = new ArrayList();
        Bundle bundle = new Bundle();
        this.b = bundle;
        if (str != null) {
            bundle.putString("id", str);
            if (str2 != null) {
                bundle.putString("name", str2);
                return;
            }
            throw new NullPointerException("name must not be null");
        }
        throw new NullPointerException("id must not be null");
    }
}
