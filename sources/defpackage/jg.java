package defpackage;

import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import com.google.android.apps.youtube.music.voice.views.NestedScrollListeningFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jg implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public jg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        wnq wnqVar;
        RelativeLayout relativeLayout;
        NestedScrollListeningFrameLayout nestedScrollListeningFrameLayout;
        switch (this.$cid) {
            case 0:
                ji jiVar = (ji) this.a;
                if (jiVar.u()) {
                    na naVar = jiVar.a;
                    if (naVar.o) {
                        return;
                    }
                    View view = jiVar.c;
                    if (view == null || !view.isShown()) {
                        jiVar.k();
                        return;
                    } else {
                        naVar.s();
                        return;
                    }
                }
                return;
            case 1:
                ik ikVar = (ik) this.a;
                if (ikVar.u()) {
                    List list = ikVar.b;
                    if (list.size() <= 0 || ((mx) ((aae) list.get(0)).b).o) {
                        return;
                    }
                    View view2 = ikVar.d;
                    if (view2 == null || !view2.isShown()) {
                        ikVar.k();
                        return;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((mx) ((aae) it.next()).b).s();
                    }
                    return;
                }
                return;
            case 2:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) this.a;
                if (!appCompatSpinner.b.u()) {
                    appCompatSpinner.b();
                }
                ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            case 3:
                Object obj = this.a;
                kw kwVar = (kw) obj;
                AppCompatSpinner appCompatSpinner2 = kwVar.d;
                if (!appCompatSpinner2.isAttachedToWindow() || !appCompatSpinner2.getGlobalVisibleRect(kwVar.c)) {
                    ((mx) obj).k();
                    return;
                } else {
                    kwVar.n();
                    super/*mx*/.s();
                    return;
                }
            case 4:
                Object obj2 = this.a;
                dge dgeVar = (dge) obj2;
                dgeVar.n.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                Set set = dgeVar.q;
                if (set == null || set.size() == 0) {
                    dgeVar.n(true);
                    return;
                }
                dfy dfyVar = new dfy(obj2, 1);
                int firstVisiblePosition = dgeVar.n.getFirstVisiblePosition();
                boolean z = false;
                for (int i = 0; i < dgeVar.n.getChildCount(); i++) {
                    View childAt = dgeVar.n.getChildAt(i);
                    if (dgeVar.q.contains((dii) dgeVar.o.getItem(firstVisiblePosition + i))) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setDuration(dgeVar.Q);
                        alphaAnimation.setFillEnabled(true);
                        alphaAnimation.setFillAfter(true);
                        if (!z) {
                            alphaAnimation.setAnimationListener(dfyVar);
                        }
                        childAt.clearAnimation();
                        childAt.startAnimation(alphaAnimation);
                        z = true;
                    }
                }
                return;
            case 5:
                rpg rpgVar = (rpg) this.a;
                View view3 = rpgVar.a;
                if (view3.getVisibility() != 0 || rpgVar.c || (wnqVar = rpgVar.b) == null || !wnqVar.n()) {
                    return;
                }
                view3.requestFocus();
                view3.sendAccessibilityEvent(8);
                rpgVar.c = true;
                return;
            case 6:
                gms gmsVar = (gms) this.a;
                CollapsingToolbarLayout collapsingToolbarLayout = gmsVar.v;
                if (collapsingToolbarLayout == null || gmsVar.y == null) {
                    return;
                }
                if (collapsingToolbarLayout.getMeasuredHeight() == gmsVar.ab.K() + gmsVar.y.getMeasuredHeight()) {
                    gmsVar.t();
                    return;
                } else {
                    gmsVar.v.forceLayout();
                    gmsVar.v.requestLayout();
                    return;
                }
            case 7:
                final grf grfVar = (grf) this.a;
                ViewGroup viewGroup = grfVar.an;
                if (viewGroup == null || viewGroup.getHeight() == 0) {
                    return;
                }
                grfVar.aB = grfVar.an.getHeight();
                jbw jbwVar = grfVar.as;
                if (jbwVar != null && (relativeLayout = jbwVar.e) != null) {
                    jbwVar.f(relativeLayout.getHeight());
                }
                if (grfVar.aI == null) {
                    grfVar.aI = new twp(grfVar.aB, 0, grfVar.an, new aeav() { // from class: grc
                        @Override // defpackage.aeav
                        public final void a() {
                            grf grfVar2 = grfVar;
                            if (grfVar2.an != null) {
                                jhh jhhVar = grfVar2.aq;
                                if (jhhVar != null) {
                                    jhhVar.b(3);
                                }
                                grfVar2.az = new aeax(grfVar2.an, grfVar2.aB, new qcb(grfVar2, null));
                                List list2 = grfVar2.ao;
                                if (!list2.isEmpty()) {
                                    ((RecyclerView) list2.get(0)).w(grfVar2.az);
                                }
                                grfVar2.aA = new aeaw(new qcb(grfVar2));
                                if (list2.isEmpty() || grfVar2.A == null) {
                                    return;
                                }
                                aeaw aeawVar = grfVar2.aA;
                                RecyclerView recyclerView = (RecyclerView) list2.get(0);
                                AppBarLayout appBarLayout = grfVar2.A;
                                if (recyclerView == null || appBarLayout == null) {
                                    ((agrc) ((agrc) aeaw.a.b()).k("com/google/android/libraries/youtube/rendering/ui/filterchipbar/PartialPullListener", "attachToTargetViews", 64, "PartialPullListener.java")).t("Could not attach PartialPullListener listener as one or more target views was null.");
                                } else {
                                    recyclerView.aC(aeawVar);
                                    appBarLayout.h(aeawVar);
                                }
                            }
                        }
                    }, (int) grfVar.H.c(10, 45677218L, 0L));
                }
                grfVar.aI.e();
                grfVar.an.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            case 8:
                iog iogVar = (iog) this.a;
                TabbedView tabbedView = iogVar.E;
                if (tabbedView != null) {
                    tabbedView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    iogVar.c.c(new haq());
                    return;
                }
                return;
            case 9:
                jfw jfwVar = (jfw) this.a;
                alay alayVar = jfwVar.f.c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                if (alayVar.c.size() == 1) {
                    tuk.u(jfwVar.c, ackj.k(null, alayVar, null, false));
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (alba albaVar : alayVar.c) {
                        aihh aihhVar = (aihh) alay.a.createBuilder();
                        aihhVar.f(albaVar);
                        arrayList.add((alay) aihhVar.build());
                    }
                    if (arrayList.size() < 2) {
                        throw new IllegalArgumentException("Server did not return two runs for two-line header");
                    }
                    alay alayVar2 = (alay) arrayList.get(0);
                    alay alayVar3 = (alay) arrayList.get(1);
                    TextView textView = jfwVar.c;
                    boolean zH = jfw.h(alayVar2, textView);
                    boolean zH2 = jfw.h(alayVar3, textView);
                    if (zH && zH2) {
                        alay alayVarG = jfw.g(alayVar, '\n');
                        textView.setMaxLines(2);
                        tuk.u(textView, ackj.k(null, alayVarG, null, false));
                    } else {
                        alay alayVarG2 = jfw.g(alayVar, ' ');
                        textView.setMaxLines(2);
                        tuk.u(textView, ackj.k(null, alayVarG2, null, false));
                    }
                }
                TextView textView2 = jfwVar.c;
                View view4 = jfwVar.b;
                textView2.setPadding(0, (view4.findViewById(R.id.toolbar) != null ? view4.findViewById(R.id.toolbar).getHeight() : 0) + jfwVar.a.getResources().getDimensionPixelSize(R.dimen.two_line_header_top_padding), 0, 0);
                textView2.setTextAppearance(R.style.TextAppearance_YouTubeMusic_MassiveTitleModern);
                if (jfwVar.g) {
                    alay alayVar4 = jfwVar.f.c;
                    if (alayVar4 == null) {
                        alayVar4 = alay.a;
                    }
                    jfwVar.e.setText(ackj.k(null, jfw.g(alayVar4, ' '), null, false));
                }
                textView2.getViewTreeObserver().removeOnGlobalLayoutListener(jfwVar.h);
                return;
            case 10:
                jmg jmgVar = (jmg) this.a;
                if (jmgVar.R == null || (nestedScrollListeningFrameLayout = jmgVar.Q) == null || nestedScrollListeningFrameLayout.getHeight() == 0) {
                    return;
                }
                aevw aevwVar = jmgVar.E;
                if (aevwVar != null && aevwVar.a().F == 4) {
                    jmgVar.E.a().Q(jmgVar.k());
                    jmgVar.E.a().I(4);
                }
                jmgVar.R.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                jmgVar.G = null;
                return;
            default:
                ((afcd) this.a).k();
                return;
        }
    }

    public /* synthetic */ jg(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
