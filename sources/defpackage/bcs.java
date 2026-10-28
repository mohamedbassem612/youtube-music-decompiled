package defpackage;

import android.R;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.search.ui.SearchToolbarView;
import com.google.android.apps.youtube.music.ui.appchrome.insets.InsetAdjustingToolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bcs implements ayx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ bcs(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.ayx
    public final bbn a(View view, bbn bbnVar) {
        ast astVar;
        aevw aevwVar;
        Window window;
        switch (this.$cid) {
            case 0:
                avw avwVarA = bcv.a(bbnVar);
                avw avwVarC = avw.c(bbnVar.g(519), bbnVar.g(64));
                bcv bcvVar = (bcv) this.a;
                if (!avwVarA.equals(bcvVar.c) || !avwVarC.equals(bcvVar.d)) {
                    bcvVar.c = avwVarA;
                    bcvVar.d = avwVarC;
                    ArrayList arrayList = bcvVar.b;
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            ((acik) arrayList.get(size)).b();
                        }
                    }
                }
                return bbnVar;
            case 1:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a;
                if (!Objects.equals(coordinatorLayout.e, bbnVar)) {
                    coordinatorLayout.e = bbnVar;
                    boolean z = bbnVar.d() > 0;
                    coordinatorLayout.f = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    if (!bbnVar.w()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            int i2 = bac.a;
                            if (childAt.getFitsSystemWindows() && (astVar = ((asv) childAt.getLayoutParams()).a) != null) {
                                bbnVar = astVar.onApplyWindowInsets(coordinatorLayout, childAt, bbnVar);
                                if (!bbnVar.w()) {
                                }
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return bbnVar;
            case 2:
                hdj hdjVar = (hdj) this.a;
                View view2 = hdjVar.k;
                if (view2 != null) {
                    view2.setPadding(0, bbnVar.f(519).c, 0, 0);
                }
                ViewGroup viewGroup = hdjVar.p;
                if (viewGroup != null) {
                    viewGroup.setPadding(0, 0, 0, bbnVar.f(2).e);
                    return bbnVar;
                }
                return bbnVar;
            case 3:
                ((Window) this.a).getDecorView().setPadding(0, 0, 0, bbnVar.a());
                return bbnVar;
            case 4:
                boolean zX = bbnVar.x();
                ioc iocVar = (ioc) this.a;
                SearchToolbarView searchToolbarView = iocVar.u;
                if (searchToolbarView != null) {
                    if (!zX && searchToolbarView.b.hasFocus()) {
                        iocVar.u.f();
                    }
                    if (zX && !iocVar.u.b.hasFocus()) {
                        iocVar.u.e();
                    }
                    if (zX && iocVar.F.l(8, 45764180L, false)) {
                        iocVar.u.k = false;
                        return bbnVar;
                    }
                }
                return bbnVar;
            case 5:
                avw avwVarF = bbnVar.f(18);
                int i3 = avwVarF.b;
                cf cfVar = ((iov) this.a).a;
                view.setPadding(jnj.w(cfVar) + i3, 0, jnj.w(cfVar) + avwVarF.d, 0);
                return bbnVar;
            case 6:
                InsetAdjustingToolbar.C.set(bbnVar.d());
                ((InsetAdjustingToolbar) this.a).G();
                return bbnVar;
            case 7:
                avw avwVarG = bbnVar.g(519);
                ((View) this.a).setPadding(avwVarG.b, avwVarG.c, avwVarG.d, avwVarG.e);
                return bbnVar;
            case 8:
                view.getClass();
                adzm adzmVar = (adzm) this.a;
                adyw adywVar = adzmVar.a;
                Dialog dialog = adywVar.O;
                if (true != (dialog instanceof aevw)) {
                    dialog = null;
                }
                if (dialog != null && (window = (aevwVar = (aevw) dialog).getWindow()) != null) {
                    View decorView = window.getDecorView();
                    decorView.getClass();
                    View viewFindViewById = decorView.findViewById(R.id.content);
                    if (viewFindViewById != null) {
                        int i4 = bbnVar.f(8).e;
                        int i5 = bbnVar.f(519).e;
                        boolean z2 = adzmVar.b;
                        boolean z3 = i4 > 0;
                        adzmVar.b = z3;
                        tym.h(viewFindViewById, new tyi(z3 ? i4 - i5 : 0, 1), ViewGroup.MarginLayoutParams.class);
                        view.setPadding(0, bbnVar.f(519).c, 0, i5);
                        adzj adzjVar = adzmVar.d;
                        if (adzjVar != null) {
                            adzjVar.c();
                        }
                        cf activity = adywVar.getActivity();
                        if (activity != null) {
                            BottomSheetBehavior bottomSheetBehaviorA = aevwVar.a();
                            bottomSheetBehaviorA.getClass();
                            boolean zD = adzmVar.d();
                            adzj adzjVar2 = adzmVar.d;
                            if (adzjVar2 != null) {
                                adzjVar2.b = zD;
                            }
                            bottomSheetBehaviorA.D = !zD || adywVar.I;
                            if (!zD || z2) {
                                bottomSheetBehaviorA.I(3);
                            } else if (adzmVar.c) {
                                bottomSheetBehaviorA.I(4);
                            }
                            adzmVar.c = false;
                            int iV = adywVar.v(activity);
                            if (adzmVar.b) {
                                iV = Math.max((iV - i4) + i5, 0);
                            }
                            adzmVar.g = iV;
                            bottomSheetBehaviorA.l = iV;
                            adzh adzhVar = adzmVar.f;
                            if (adzhVar != null) {
                                int iC = adyw.C(activity);
                                adzhVar.d = iV;
                                adzhVar.c = iC;
                                adzhVar.e = true;
                            }
                            View viewW = adyw.w(view);
                            if (viewW != null) {
                                viewW.requestLayout();
                                return bbnVar;
                            }
                        }
                    }
                }
                return bbnVar;
            default:
                aevw aevwVar2 = (aevw) this.a;
                aevv aevvVar = aevwVar2.g;
                if (aevvVar != null) {
                    aevwVar2.a.D(aevvVar);
                }
                aevwVar2.g = new aevv(aevwVar2.b, bbnVar);
                aevwVar2.g.c(aevwVar2.getWindow());
                aevwVar2.a.y(aevwVar2.g);
                return bbnVar;
        }
    }

    public bcs(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
