package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afwv {
    static Integer d;
    public final Object a;
    public Object b;
    public final Object c;

    public afwv(Context context) {
        this.a = new qqa();
        rmp.D(context != null, "Context cannot be null", new Object[0]);
        this.c = context.getApplicationContext();
    }

    public static final boolean m(int i, int i2) {
        return o(i) && o(i2);
    }

    private final int n(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        View view = (View) this.c;
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        Context context = view.getContext();
        Integer numValueOf = d;
        if (numValueOf == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                throw new NullPointerException("Argument must not be null");
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            numValueOf = Integer.valueOf(Math.max(point.x, point.y));
            d = numValueOf;
        }
        return numValueOf.intValue();
    }

    private static final boolean o(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public final void a() {
        ((vpt) this.c).o = true;
    }

    public final void b(akuj akujVar) {
        akuh akuhVar = akujVar.h;
        if (akuhVar == null) {
            akuhVar = akuh.a;
        }
        apom apomVar = (akuhVar.b == 49399797 ? (apoq) akuhVar.c : apoq.a).n;
        if (apomVar == null) {
            apomVar = apom.a;
        }
        int iAV = a.aV(apomVar.d);
        if (iAV == 0) {
            iAV = 1;
        }
        if (iAV == 3 || iAV == 4) {
            a();
        }
    }

    public final void c(akuj akujVar) {
        if (!e() || (akujVar.c & 4) == 0) {
            return;
        }
        akuh akuhVar = akujVar.h;
        if (akuhVar == null) {
            akuhVar = akuh.a;
        }
        if (akuhVar.b == 49399797) {
            akuh akuhVar2 = akujVar.h;
            if (akuhVar2 == null) {
                akuhVar2 = akuh.a;
            }
            apoq apoqVar = akuhVar2.b == 49399797 ? (apoq) akuhVar2.c : apoq.a;
            if (e()) {
                ((vqg) this.c).t(apoqVar);
                Object obj = this.b;
                urh urhVar = new urh(apoqVar, 18);
                Optional optional = (Optional) obj;
                if (true == optional.isPresent()) {
                    Object obj2 = optional.get();
                    apoq apoqVar2 = (apoq) urhVar.a;
                    ((avju) obj2).b((apoqVar2.c & 1048576) != 0 ? apoqVar2.q : 0.0f);
                }
            }
        }
    }

    public final void d() {
        if (e()) {
            ((vqg) this.c).u();
            Optional optional = (Optional) this.b;
            if (true == optional.isPresent()) {
                avju avjuVar = (avju) optional.get();
                avjuVar.c();
                avjuVar.b = 0;
            }
        }
    }

    public final boolean e() {
        return ((vpt) this.c).o;
    }

    public final cc f() {
        if (this.b == null) {
            this.b = ((dd) this.c).f(R.id.interstitials_container);
        }
        return (cc) this.b;
    }

    public final gid g() {
        atqq.b(this.b, Boolean.class);
        Boolean bool = (Boolean) this.b;
        return new gid((ght) this.a, (ghj) this.c, bool);
    }

    public final void h(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final synchronized void i(fpk fpkVar) {
        if (this.b != fpkVar) {
            this.b = fpkVar;
            Object obj = this.c;
            int i = fpj.K;
            if (((fhd) obj).c != null) {
                ((fhd) obj).x(new aero(0, new Object[]{fpkVar}), "updateState:RecyclerCollectionComponent.updateLoadingState");
            }
        }
    }

    public final int j() {
        View view = (View) this.c;
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return n(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    public final int k() {
        View view = (View) this.c;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return n(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void l() {
        ViewTreeObserver viewTreeObserver = ((View) this.c).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.b);
        }
        this.b = null;
        this.a.clear();
    }

    public afwv(fhd fhdVar, ftc ftcVar) {
        this.b = fpk.a;
        this.c = fhdVar;
        this.a = ftcVar;
    }

    public afwv(ght ghtVar, ghj ghjVar) {
        this.a = ghtVar;
        this.c = ghjVar;
    }

    public afwv(Object obj, Object obj2) {
        this.c = obj;
        this.a = obj2;
    }

    public afwv(View view) {
        this.a = new ArrayList();
        this.c = view;
    }

    public afwv(View view, dd ddVar) {
        view.getClass();
        this.a = view;
        ddVar.getClass();
        this.c = ddVar;
    }

    public afwv(Context context, ttm ttmVar) {
        this.c = context;
        this.a = ttmVar;
    }

    public afwv(vqg vqgVar, vxz vxzVar) {
        this.c = vqgVar;
        this.b = Optional.empty();
        this.a = vxzVar;
    }
}
