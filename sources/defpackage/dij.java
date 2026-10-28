package defpackage;

import android.content.Context;
import android.media.RouteListingPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dij {
    static dgr a;
    final Context b;
    final ArrayList c = new ArrayList();

    public dij(Context context) {
        this.b = context;
    }

    public static dgr a() {
        dgr dgrVar = a;
        if (dgrVar != null) {
            return dgrVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static dij b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        c();
        dgr dgrVar = a;
        if (dgrVar == null) {
            dgrVar = new dgr(context.getApplicationContext());
            a = dgrVar;
        }
        ArrayList arrayList = dgrVar.i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                dij dijVar = new dij(context);
                arrayList.add(new WeakReference(dijVar));
                return dijVar;
            }
            dij dijVar2 = (dij) ((WeakReference) arrayList.get(size)).get();
            if (dijVar2 == null) {
                arrayList.remove(size);
            } else if (dijVar2.b == context) {
                return dijVar2;
            }
        }
    }

    public static void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static boolean d() {
        Bundle bundle;
        if (a == null) {
            return false;
        }
        dim dimVar = a().q;
        return dimVar == null || (bundle = dimVar.g) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    public static boolean e() {
        if (a == null) {
            return false;
        }
        return a().s();
    }

    public static final dii f() {
        c();
        return a().e();
    }

    public static final MediaSessionCompat$Token g() {
        fg fgVar;
        dgr dgrVar = a;
        if (dgrVar == null) {
            return null;
        }
        dgn dgnVar = dgrVar.y;
        if (dgnVar != null) {
            fgVar = dgnVar.a;
        } else {
            fgVar = dgrVar.z;
            if (fgVar == null) {
                return null;
            }
        }
        return fgVar.c();
    }

    public static final dim h() {
        c();
        return a().q;
    }

    public static final List i() {
        c();
        return a().j;
    }

    public static final dii j() {
        c();
        return a().f();
    }

    public static final boolean k(did didVar, int i) {
        if (didVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        c();
        dgr dgrVarA = a();
        if (didVar.d()) {
            return false;
        }
        if ((i & 2) != 0 || !dgrVarA.n) {
            dim dimVar = dgrVarA.q;
            boolean z = dimVar != null && dimVar.d && dgrVarA.s();
            ArrayList arrayList = dgrVarA.j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                dii diiVar = (dii) arrayList.get(i2);
                if (((i & 1) != 0 && diiVar.l()) || ((z && !diiVar.l() && diiVar.d() != dgrVarA.o) || !diiVar.p(didVar))) {
                }
            }
            return false;
        }
        return true;
    }

    public static final void l(fg fgVar) {
        c();
        dgr dgrVarA = a();
        dgrVarA.z = fgVar;
        dgn dgnVar = fgVar != null ? new dgn(dgrVarA, fgVar) : null;
        dgn dgnVar2 = dgrVarA.y;
        if (dgnVar2 != null) {
            dgnVar2.a();
        }
        dgrVarA.y = dgnVar;
        if (dgnVar != null) {
            dgrVarA.p();
        }
    }

    public static final void m(djh djhVar) {
        c();
        dgz dgzVar = a().o;
        if (dgzVar == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        RouteListingPreference routeListingPreferenceBuild = null;
        if (djhVar != null) {
            ArrayList arrayList = new ArrayList();
            for (djg djgVar : djhVar.a) {
                arrayList.add(new RouteListingPreference.Item.Builder(djgVar.a).setFlags(0).setSubText(0).setCustomSubtextMessage(null).setSelectionBehavior(djgVar.b).build());
            }
            routeListingPreferenceBuild = new RouteListingPreference.Builder().setItems(arrayList).setLinkedItemComponentName(null).setUseSystemOrdering(true).build();
        }
        dgzVar.a.setRouteListingPreference(routeListingPreferenceBuild);
    }

    public static final void n(dim dimVar) {
        c();
        dgr dgrVarA = a();
        Context context = dgrVarA.h;
        context.getPackageName();
        if (dimVar != null) {
            int i = dimVar.a;
            if (i != 1) {
                a.ci((byte) 41, i, "UNKNOWN(");
            }
            boolean z = dimVar.b;
            boolean z2 = dimVar.c;
            boolean z3 = dimVar.d;
            boolean z4 = dimVar.e;
            boolean z5 = dimVar.f;
            Objects.toString(dimVar.g);
        }
        dim dimVar2 = dgrVarA.q;
        dgrVarA.q = dimVar;
        if (dgrVarA.s()) {
            if (dgrVarA.o == null) {
                dgrVarA.o = new dgz(context, new hhb(dgrVarA));
                dgrVarA.i(dgrVarA.o, true);
                dgrVarA.o();
            }
            boolean z6 = dimVar != null && dimVar.f;
            dgz dgzVar = dgrVarA.o;
            dgzVar.c = z6;
            dgzVar.f();
            dje djeVar = dgrVarA.d;
            djeVar.a = z6;
            djeVar.a();
            if ((dimVar2 != null && dimVar2.e) != (dimVar != null && dimVar.e)) {
                dgrVarA.o.gB(dgrVarA.w);
            }
        } else {
            dgz dgzVar2 = dgrVarA.o;
            if (dgzVar2 != null) {
                dgrVarA.l(dgzVar2);
                dgrVarA.o = null;
                dgrVarA.w = null;
                dgrVarA.d.a();
            }
        }
        dgrVarA.b.a(769, dimVar);
    }

    public static final void o(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        c();
        dgr dgrVarA = a();
        dii diiVarD = dgrVarA.d();
        if (dgrVarA.f() != diiVarD) {
            dgrVarA.m(diiVarD, i, 1, true);
        }
    }

    private final int r(azs azsVar) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((die) arrayList.get(i)).e == azsVar) {
                return i;
            }
        }
        return -1;
    }

    public final void p(did didVar, azs azsVar, int i) {
        die dieVar;
        int i2;
        if (didVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (azsVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        c();
        int iR = r(azsVar);
        if (iR < 0) {
            dieVar = new die(this, azsVar);
            this.c.add(dieVar);
        } else {
            dieVar = (die) this.c.get(iR);
        }
        if (i != dieVar.c) {
            dieVar.c = i;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i3 = i & 1;
        dieVar.d = SystemClock.elapsedRealtime();
        did didVar2 = dieVar.b;
        didVar2.c();
        didVar.c();
        if (!didVar2.c.containsAll(didVar.c)) {
            heg hegVar = new heg(dieVar.b);
            hegVar.n(didVar);
            dieVar.b = hegVar.k();
        } else if ((i3 | i2) == 0) {
            return;
        }
        a().o();
    }

    public final void q(azs azsVar) {
        if (azsVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        c();
        int iR = r(azsVar);
        if (iR >= 0) {
            this.c.remove(iR);
            a().o();
        }
    }
}
