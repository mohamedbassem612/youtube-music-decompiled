package defpackage;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import com.google.android.libraries.youtube.creation.common.ui.toolbelt.ToolbarView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uiv implements View.OnAttachStateChangeListener, uhn {
    public static final xhc a = xhb.b(128637);
    public final ToolbarView b;
    public final LinearLayout c;
    public final LinearLayout d;
    public final CreationButtonView e;
    public final CreationButtonView f;
    public final View g;
    public final View[] h;
    public final View[] i;
    public final ahey j;
    public ScheduledFuture k;
    public CreationButtonView m;
    public boolean o;
    public int p;
    public List q;
    public final View r;
    public final awmd s;
    public boolean t;
    public final roq u;
    public final aaok v;
    private final Map w;
    private boolean x;
    private final bog y;
    public final awku l = new awku();
    public int n = 0;

    public uiv(bog bogVar, roq roqVar, ahey aheyVar, awmd awmdVar, aaok aaokVar, View view, View view2, View[] viewArr, List list) {
        this.y = bogVar;
        this.u = roqVar;
        viewArr = viewArr == null ? new View[0] : viewArr;
        this.h = viewArr;
        this.i = new View[viewArr.length];
        this.q = list;
        this.j = aheyVar;
        this.b = (ToolbarView) view;
        this.r = view2;
        this.w = new HashMap();
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.toolbar_buttons);
        this.c = linearLayout;
        this.d = (LinearLayout) linearLayout.findViewById(R.id.toolbar_expanded_buttons);
        this.e = (CreationButtonView) linearLayout.findViewById(R.id.expandy_toolbar_more);
        this.f = (CreationButtonView) view.findViewById(R.id.expandy_toolbar_collapse);
        this.g = view.findViewById(R.id.expanded_toolbar_scrim);
        this.s = awmdVar;
        this.v = aaokVar;
    }

    private final void r(CreationButtonView creationButtonView) {
        xgz xgzVar = creationButtonView.c;
        if (xgzVar != null) {
            boolean zIsShown = creationButtonView.isShown();
            Map map = this.w;
            if (zIsShown != Boolean.TRUE.equals(map.get(creationButtonView))) {
                boolean zContainsKey = map.containsKey(creationButtonView);
                roq roqVar = this.u;
                if (zContainsKey) {
                    ugo ugoVar = new ugo(roqVar, xgzVar);
                    ugoVar.h(zIsShown);
                    ugoVar.g();
                } else {
                    ugo ugoVar2 = new ugo(roqVar, xgzVar);
                    ugoVar2.h(zIsShown);
                    ugoVar2.c();
                }
                map.put(creationButtonView, Boolean.valueOf(zIsShown));
            }
        }
    }

    private final boolean s(CreationButtonView creationButtonView) {
        return (creationButtonView == this.f || creationButtonView == this.e) ? false : true;
    }

    private final boolean t(String str, Map map, Map map2, boolean z) {
        if (!((ujd) this.s.io()).g.a) {
            return false;
        }
        j$.util.Map.EL.putIfAbsent(map, str, Integer.valueOf(true != z ? 0 : 3));
        int iIntValue = ((Integer) map.get(str)).intValue();
        if (iIntValue == 2 || iIntValue == 3) {
            return false;
        }
        j$.util.Map.EL.putIfAbsent(map2, str, 0);
        return ((Integer) map2.get(str)).intValue() < 2;
    }

    private static final void u(CreationButtonView creationButtonView) {
        nuo.t(8, creationButtonView.a);
    }

    @Override // defpackage.uhn
    public final void a(CreationButtonView creationButtonView) {
        if (creationButtonView != this.e) {
            n(1.0f);
        }
        r(creationButtonView);
        List listF = f();
        List listG = g();
        if (creationButtonView.getVisibility() == 0) {
            if (listF.contains(creationButtonView) || (listG.contains(creationButtonView) && this.n == 1)) {
                if (this.o && creationButtonView.a.getVisibility() != 0) {
                    l(creationButtonView);
                } else {
                    if (this.o || creationButtonView.a.getVisibility() != 0) {
                        return;
                    }
                    u(creationButtonView);
                }
            }
        }
    }

    @Override // defpackage.uhn
    public final void b(CreationButtonView creationButtonView, boolean z) {
        if (z) {
            h();
        }
    }

    @Override // defpackage.uhn
    public final void c(CreationButtonView creationButtonView) {
        Map map = ((ujd) this.s.io()).b;
        String str = creationButtonView.d;
        if (str != null && ((Integer) j$.util.Map.EL.getOrDefault(map, str, 0)).intValue() != 2) {
            map.put(creationButtonView.d, 2);
            creationButtonView.c(false);
        }
        if (s(creationButtonView) && this.n == 1) {
            p();
        }
        xgz xgzVar = creationButtonView.c;
        if (xgzVar != null) {
            new ugo(this.u, xgzVar).d();
        }
    }

    public final int d() {
        return this.c.getChildCount() - 2;
    }

    final int e() {
        int i = 0;
        for (int i2 = 0; i2 < d(); i2++) {
            CreationButtonView creationButtonView = (CreationButtonView) this.c.getChildAt(i2);
            if (s(creationButtonView) && creationButtonView.isShown() && creationButtonView.getAlpha() > 0.0f) {
                i++;
            }
        }
        return i;
    }

    public final List f() {
        LinearLayout linearLayout = this.c;
        int childCount = linearLayout.getChildCount() - 1;
        ArrayList arrayList = new ArrayList(childCount);
        for (int i = 0; i < childCount; i++) {
            if (linearLayout.getChildAt(i) != null) {
                arrayList.add((CreationButtonView) linearLayout.getChildAt(i));
            }
        }
        return arrayList;
    }

    public final List g() {
        LinearLayout linearLayout = this.d;
        int childCount = linearLayout.getChildCount();
        ArrayList arrayList = new ArrayList(childCount);
        for (int i = 0; i < childCount; i++) {
            if (linearLayout.getChildAt(i) != null) {
                arrayList.add((CreationButtonView) linearLayout.getChildAt(i));
            }
        }
        return arrayList;
    }

    public final void h() {
        if (this.x || this.p <= 0) {
            return;
        }
        ToolbarView toolbarView = this.b;
        if (toolbarView.isShown()) {
            int i = 1;
            this.x = true;
            int visibility = toolbarView.getVisibility();
            toolbarView.animate().cancel();
            if (visibility == 0) {
                toolbarView.setAlpha(1.0f);
            } else {
                toolbarView.setAlpha(0.0f);
            }
            List listF = f();
            while (e() > this.p) {
                int i2 = i + 1;
                CreationButtonView creationButtonView = (CreationButtonView) listF.get((listF.size() - i) - 1);
                creationButtonView.animate().cancel();
                this.c.removeView(creationButtonView);
                this.d.addView(creationButtonView, 0);
                i = i2;
            }
            List listG = g();
            int i3 = 0;
            while (e() < this.p && e() < this.q.size() && i3 < listG.size()) {
                int i4 = i3 + 1;
                CreationButtonView creationButtonView2 = (CreationButtonView) listG.get(i3);
                if (s(creationButtonView2)) {
                    creationButtonView2.animate().cancel();
                    this.d.removeView(creationButtonView2);
                    this.c.addView(creationButtonView2, d());
                }
                i3 = i4;
            }
            n(1.0f);
            this.x = false;
        }
    }

    public final void i() {
        this.o = false;
        List listF = f();
        for (int i = 0; i < listF.size(); i++) {
            CreationButtonView creationButtonView = (CreationButtonView) listF.get(i);
            if (creationButtonView.getVisibility() == 0) {
                u(creationButtonView);
            }
        }
    }

    public final void j(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof CreationButtonView) {
                CreationButtonView creationButtonView = (CreationButtonView) viewGroup.getChildAt(i);
                creationButtonView.f.h(this);
                xgz xgzVar = creationButtonView.c;
                if (xgzVar != null) {
                    boolean zIsShown = creationButtonView.isShown();
                    this.w.put(creationButtonView, Boolean.valueOf(zIsShown));
                    ugo ugoVar = new ugo(this.u, xgzVar);
                    ugoVar.h(zIsShown);
                    ugoVar.c();
                }
            } else if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                j((ViewGroup) viewGroup.getChildAt(i));
            }
        }
    }

    public final void k() {
        taf.k(this.y, ((ujd) this.s.io()).a(), new tvj(this, 10), new tvj(this, 11));
    }

    public final void l(CreationButtonView creationButtonView) {
        TextView textView = creationButtonView.a;
        if (textView != null) {
            nuo.s(textView);
        }
    }

    public final void m() {
        int i = this.n;
        View view = this.g;
        if (i == 1) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public final void n(float f) {
        CreationButtonView creationButtonView = this.e;
        creationButtonView.setAlpha(1.0f);
        int i = 8;
        if (this.n == 1) {
            creationButtonView.setVisibility(8);
            return;
        }
        for (CreationButtonView creationButtonView2 : g()) {
            if (creationButtonView2 != this.f && creationButtonView2.getVisibility() == 0) {
                creationButtonView.setAlpha(f);
                creationButtonView.setVisibility(0);
                taf.k(this.y, ((ujd) this.s.io()).a(), new tvj(this, i), new tvj(this, 9));
                return;
            }
        }
        creationButtonView.setVisibility(8);
    }

    public final void o() {
        awmd awmdVar = this.s;
        Map map = ((ujd) awmdVar.io()).b;
        ujd ujdVar = (ujd) awmdVar.io();
        Map map2 = (Map) ujdVar.a.get(ujdVar.e);
        map2.getClass();
        boolean zB = ((ujd) awmdVar.io()).b();
        for (CreationButtonView creationButtonView : f()) {
            String str = creationButtonView.d;
            if (str != null && creationButtonView.getVisibility() == 0) {
                creationButtonView.c(t(str, map, map2, zB));
            }
        }
        boolean z = false;
        for (CreationButtonView creationButtonView2 : g()) {
            String str2 = creationButtonView2.d;
            if (str2 != null && creationButtonView2.getVisibility() == 0) {
                boolean zT = t(str2, map, map2, zB);
                creationButtonView2.c(zT);
                if (zT) {
                    Integer num = (Integer) map.get(str2);
                    num.getClass();
                    if (num.intValue() == 0) {
                        z = true;
                    }
                }
            }
        }
        this.e.c(z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.r.removeOnLayoutChangeListener(new jfx(this, 8));
        for (CreationButtonView creationButtonView : this.q) {
            creationButtonView.animate().cancel();
            creationButtonView.f.i(this);
        }
    }

    final void p() {
        if (this.n != 0) {
            this.u.k(a).e();
            this.n = 0;
            i();
            int[] iArr = new int[2];
            this.f.getLocationOnScreen(iArr);
            n(0.0f);
            q(false, iArr[1]);
            m();
            nuo.s(this.i);
            afxw.z(new uis(), this.b);
        }
    }

    public final void q(boolean z, int i) {
        this.o = z;
        int i2 = this.n;
        List<CreationButtonView> listG = g();
        if (i2 != 0) {
            for (CreationButtonView creationButtonView : listG) {
                if (creationButtonView.getVisibility() == 0 && creationButtonView != this.f) {
                    creationButtonView.setAlpha(0.0f);
                }
            }
        }
        CreationButtonView creationButtonView2 = i2 != 0 ? this.f : this.e;
        float f = i;
        creationButtonView2.setAlpha(0.0f);
        int i3 = 1;
        this.d.setVisibility(1 != i2 ? 8 : 0);
        this.c.post(new vkd(this, creationButtonView2, f, i3));
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            r((CreationButtonView) it.next());
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            for (CreationButtonView creationButtonView3 : f()) {
                if (creationButtonView3.getVisibility() == 0) {
                    arrayList.add(new Pair(creationButtonView3, Boolean.FALSE));
                }
            }
        }
        for (CreationButtonView creationButtonView4 : g()) {
            if (creationButtonView4.getVisibility() == 0) {
                arrayList.add(new Pair(creationButtonView4, Boolean.valueOf(creationButtonView4 != this.f && z)));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (!z) {
            Collections.reverse(arrayList);
            this.e.a.setVisibility(8);
        }
        bnm bnmVar = new bnm();
        float size = arrayList.size();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            int iRound = Math.round(bnmVar.getInterpolation(i4 * (1.0f / size)) * 200.0f);
            boolean zBooleanValue = ((Boolean) ((Pair) arrayList.get(i4)).second).booleanValue();
            Object obj = ((Pair) arrayList.get(i4)).first;
            View view = zBooleanValue ? (View) obj : ((CreationButtonView) obj).a;
            if ((zBooleanValue || this.o) && ((!z || view.getAlpha() != 1.0f || view.getVisibility() != 0) && (z || view.getVisibility() != 8))) {
                view.setAlpha(true != z ? 1.0f : 0.0f);
                view.setVisibility(0);
                if (zBooleanValue) {
                    ((CreationButtonView) view).a.setVisibility(0);
                }
                view.animate().alpha(true != z ? 0.0f : 1.0f).setDuration(150L).setStartDelay(iRound).withEndAction(new csd(z, view, 5)).setListener(new uiu()).start();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
