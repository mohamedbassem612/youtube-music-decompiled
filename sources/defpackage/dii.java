package defpackage;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dii {
    private int a;
    public final dih b;
    public final String c;
    public final String d;
    public String e;
    public String f;
    public Uri g;
    public boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public Bundle s;
    dhg t;
    private IntentSender v;
    public final ArrayList l = new ArrayList();
    public int r = -1;
    protected List u = new ArrayList();

    public dii(dih dihVar, String str, String str2, boolean z) {
        this.b = dihVar;
        this.c = str;
        this.d = str2;
        this.i = z;
    }

    public final int b() {
        if (!m() || dij.d()) {
            return this.a;
        }
        return 0;
    }

    final int c(dhg dhgVar) {
        int i;
        dii diiVar;
        int iCountActions;
        if (this.t == dhgVar) {
            return 0;
        }
        this.t = dhgVar;
        if (dhgVar == null) {
            return 0;
        }
        if (Objects.equals(this.e, dhgVar.q())) {
            i = 0;
        } else {
            this.e = dhgVar.q();
            i = 1;
        }
        if (!Objects.equals(this.f, dhgVar.o())) {
            this.f = dhgVar.o();
            i = 1;
        }
        if (!Objects.equals(this.g, dhgVar.l())) {
            this.g = dhgVar.l();
            i = 1;
        }
        if (this.h != dhgVar.w()) {
            this.h = dhgVar.w();
            i = 1;
        }
        if (this.j != dhgVar.a()) {
            this.j = dhgVar.a();
            i = 1;
        }
        ArrayList arrayList = this.l;
        List listR = dhgVar.r();
        if (arrayList != listR) {
            ListIterator listIterator = arrayList.listIterator();
            ListIterator listIterator2 = listR.listIterator();
            while (true) {
                if (listIterator.hasNext() && listIterator2.hasNext()) {
                    IntentFilter intentFilter = (IntentFilter) listIterator.next();
                    IntentFilter intentFilter2 = (IntentFilter) listIterator2.next();
                    if (intentFilter != intentFilter2) {
                        if (intentFilter != null && intentFilter2 != null && (iCountActions = intentFilter.countActions()) == intentFilter2.countActions()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= iCountActions) {
                                    int iCountCategories = intentFilter.countCategories();
                                    if (iCountCategories == intentFilter2.countCategories()) {
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 >= iCountCategories) {
                                                continue;
                                            } else if (intentFilter.getCategory(i3).equals(intentFilter2.getCategory(i3))) {
                                                i3++;
                                            }
                                        }
                                    }
                                } else if (intentFilter.getAction(i2).equals(intentFilter2.getAction(i2))) {
                                    i2++;
                                }
                            }
                        }
                    }
                } else if (listIterator.hasNext() || listIterator2.hasNext()) {
                }
                arrayList.clear();
                arrayList.addAll(dhgVar.r());
                i = 1;
            }
        }
        if (this.m != dhgVar.f()) {
            this.m = dhgVar.f();
            i = 1;
        }
        if (this.n != dhgVar.e()) {
            this.n = dhgVar.e();
            i = 1;
        }
        if (this.o != dhgVar.b()) {
            this.o = dhgVar.b();
            i = 1;
        }
        int i4 = 3;
        if (this.a != dhgVar.i()) {
            this.a = dhgVar.i();
            i = 3;
        }
        if (this.p != dhgVar.h()) {
            this.p = dhgVar.h();
            i = 3;
        }
        if (this.q != dhgVar.j()) {
            this.q = dhgVar.j();
        } else {
            i4 = i;
        }
        if (this.r != dhgVar.g()) {
            this.r = dhgVar.g();
            i4 |= 5;
        }
        if (!Objects.equals(this.s, dhgVar.m())) {
            this.s = dhgVar.m();
            i4 |= 1;
        }
        if (!Objects.equals(this.v, dhgVar.k())) {
            this.v = dhgVar.k();
            i4 |= 1;
        }
        if (this.k != dhgVar.u()) {
            this.k = dhgVar.u();
            i4 |= 5;
        }
        List listS = dhgVar.s();
        ArrayList arrayList2 = new ArrayList();
        boolean z = listS.size() != this.u.size();
        if (!listS.isEmpty()) {
            dgr dgrVarA = dij.a();
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                String str = (String) dgrVarA.l.get(new axq(this.b.a().flattenToShortString(), (String) it.next()));
                ArrayList arrayList3 = dgrVarA.j;
                int size = arrayList3.size();
                int i5 = 0;
                do {
                    if (i5 >= size) {
                        diiVar = null;
                        break;
                    }
                    diiVar = (dii) arrayList3.get(i5);
                    i5++;
                } while (!diiVar.d.equals(str));
                if (diiVar != null) {
                    arrayList2.add(diiVar);
                    if (!z && !this.u.contains(diiVar)) {
                        z = true;
                    }
                }
            }
        }
        if (!z) {
            return i4;
        }
        this.u = arrayList2;
        return i4 | 1;
    }

    public final dhp d() {
        return this.b.b();
    }

    public final dif e() {
        if (this instanceof dif) {
            return (dif) this;
        }
        return null;
    }

    public final List f() {
        return DesugarCollections.unmodifiableList(this.u);
    }

    public final void g(int i) {
        dij.c();
        dgr dgrVarA = dij.a();
        int iMin = Math.min(this.q, Math.max(0, i));
        dhn dhnVarB = dgrVarA.b(this);
        if (dhnVarB != null) {
            dhnVarB.d(iMin);
        }
    }

    public final void h(int i) {
        dhn dhnVarB;
        dij.c();
        if (i == 0 || (dhnVarB = dij.a().b(this)) == null) {
            return;
        }
        dhnVarB.f(i);
    }

    public final void i(boolean z) {
        dij.c();
        dij.a().m(this, 3, 1, z);
    }

    public final boolean j() {
        dij.c();
        return dij.a().s == this;
    }

    public final boolean k() {
        dij.c();
        return dij.a().e() == this;
    }

    public final boolean l() {
        if (k() || this.o == 3) {
            return true;
        }
        return TextUtils.equals(d().g.a(), "android") && q("android.media.intent.category.LIVE_AUDIO") && !q("android.media.intent.category.LIVE_VIDEO");
    }

    public final boolean m() {
        return !this.u.isEmpty();
    }

    final boolean n() {
        return this.t != null && this.h;
    }

    public final boolean o() {
        dij.c();
        return dij.a().f() == this;
    }

    public final boolean p(did didVar) {
        if (didVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        dij.c();
        ArrayList<IntentFilter> arrayList = this.l;
        didVar.c();
        if (didVar.c.isEmpty()) {
            return false;
        }
        for (IntentFilter intentFilter : arrayList) {
            if (intentFilter != null) {
                Iterator it = didVar.c.iterator();
                while (it.hasNext()) {
                    if (intentFilter.hasCategory((String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean q(String str) {
        dij.c();
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            boolean zHasCategory = ((IntentFilter) arrayList.get(i)).hasCategory(str);
            i++;
            if (zHasCategory) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.d);
        sb.append(", name=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", iconUri=");
        sb.append(this.g);
        sb.append(", enabled=");
        sb.append(this.h);
        sb.append(", isSystemRoute=");
        sb.append(this.i);
        sb.append(", connectionState=");
        sb.append(this.j);
        sb.append(", canDisconnect=");
        sb.append(this.k);
        sb.append(", playbackType=");
        sb.append(this.m);
        sb.append(", playbackStream=");
        sb.append(this.n);
        sb.append(", deviceType=");
        sb.append(this.o);
        sb.append(", volumeHandling=");
        sb.append(this.a);
        sb.append(", volume=");
        sb.append(this.p);
        sb.append(", volumeMax=");
        sb.append(this.q);
        sb.append(", presentationDisplayId=");
        sb.append(this.r);
        sb.append(", extras=");
        sb.append(this.s);
        sb.append(", settingsIntent=");
        sb.append(this.v);
        sb.append(", providerPackageName=");
        sb.append(this.b.d());
        if (m()) {
            sb.append(", members=[");
            int size = this.u.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.u.get(i) != this) {
                    sb.append(((dii) this.u.get(i)).d);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
