package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class oh {
    private static final List s = Collections.EMPTY_LIST;
    public final View a;
    public WeakReference b;
    int j;
    RecyclerView q;
    nh r;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    int g = -1;
    public oh h = null;
    public oh i = null;
    List k = null;
    List l = null;
    private int t = 0;
    nv m = null;
    boolean n = false;
    public int o = 0;
    public int p = -1;

    public oh(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    public final boolean A() {
        return (this.j & SemanticState.Focused) != 0;
    }

    final boolean B() {
        return (this.j & 32) != 0;
    }

    public final int a() {
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.b(this);
    }

    public final int b() {
        RecyclerView recyclerView;
        nh nhVar;
        int iB;
        if (this.r == null || (recyclerView = this.q) == null || (nhVar = recyclerView.m) == null || (iB = recyclerView.b(this)) == -1 || this.r != nhVar) {
            return -1;
        }
        return iB;
    }

    public final int c() {
        int i = this.g;
        return i == -1 ? this.c : i;
    }

    public final List d() {
        List list;
        return ((this.j & SemanticState.ReadOnly) != 0 || (list = this.k) == null || list.size() == 0) ? s : this.l;
    }

    public final void e(Object obj) {
        if (obj == null) {
            f(SemanticState.ReadOnly);
            return;
        }
        if ((this.j & SemanticState.ReadOnly) == 0) {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = DesugarCollections.unmodifiableList(arrayList);
            }
            this.k.add(obj);
        }
    }

    public final void f(int i) {
        this.j |= i;
    }

    public final void g() {
        this.d = -1;
        this.g = -1;
    }

    final void h() {
        List list = this.k;
        if (list != null) {
            list.clear();
        }
        this.j &= -1025;
    }

    final void i() {
        this.j &= -33;
    }

    public final void j() {
        this.j &= -257;
    }

    public final void k(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        int i2 = this.g;
        if (i2 == -1) {
            i2 = this.c;
            this.g = i2;
        }
        if (z) {
            this.g = i2 + i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((nq) view.getLayoutParams()).e = true;
        }
    }

    public final void l() {
        int i = RecyclerView.ad;
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.t = 0;
        this.h = null;
        this.i = null;
        h();
        this.o = 0;
        this.p = -1;
        RecyclerView.y(this);
    }

    public final void m(int i, int i2) {
        this.j = (this.j & (~i2)) | (i & i2);
    }

    public final void n(boolean z) {
        int i;
        int i2 = this.t;
        int i3 = z ? i2 - 1 : i2 + 1;
        this.t = i3;
        if (i3 < 0) {
            this.t = 0;
            int i4 = RecyclerView.ad;
            toString();
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(toString()));
        } else if (z) {
            if (i3 == 0) {
                i = this.j & (-17);
                this.j = i;
            }
        } else if (i3 == 1) {
            i = this.j | 16;
            this.j = i;
        }
        int i5 = RecyclerView.ad;
    }

    final void o(nv nvVar, boolean z) {
        this.m = nvVar;
        this.n = z;
    }

    final void p() {
        this.m.l(this);
    }

    public final boolean q(int i) {
        return (this.j & i) != 0;
    }

    public final boolean r() {
        View view = this.a;
        return (view.getParent() == null || view.getParent() == this.q) ? false : true;
    }

    public final boolean s() {
        return (this.j & 1) != 0;
    }

    public final boolean t() {
        return (this.j & 4) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + '{' + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (w()) {
            sb.append(" scrap ");
            sb.append(true != this.n ? "[attachedScrap]" : "[changeScrap]");
        }
        if (t()) {
            sb.append(" invalid");
        }
        if (!s()) {
            sb.append(" unbound");
        }
        if (z()) {
            sb.append(" update");
        }
        if (v()) {
            sb.append(" removed");
        }
        if (A()) {
            sb.append(" ignored");
        }
        if (x()) {
            sb.append(" tmpDetached");
        }
        if (!u()) {
            sb.append(" not recyclable(" + this.t + ')');
        }
        if ((this.j & SemanticState.LiveRegion) != 0 || t()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean u() {
        if ((this.j & 16) == 0) {
            View view = this.a;
            int i = bac.a;
            if (!view.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        return (this.j & 8) != 0;
    }

    final boolean w() {
        return this.m != null;
    }

    public final boolean x() {
        return (this.j & SemanticState.Hidden) != 0;
    }

    public final boolean y() {
        return (this.j & 2) != 0;
    }

    final boolean z() {
        return (this.j & 2) != 0;
    }
}
