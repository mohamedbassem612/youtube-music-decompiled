package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;
import com.google.android.libraries.youtube.share.ui.ActivityIndicatorFrameLayout;
import com.google.android.libraries.youtube.share.ui.AnchorableTopPeekingScrollView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aemn extends aemb implements View.OnClickListener, aeky, aekh, xgm {
    public static final long k;
    public Handler A;
    public Executor B;
    public xgn C;
    public ttm D;
    public tbt E;
    public ScheduledExecutorService F;
    public ahex G;
    public adhv H;
    public tmo I;
    public SharedPreferences J;
    public mbc K;
    public tza L;
    public vxu M;
    public ahek N;
    public abfv O;
    public aend P;
    public ci Q;
    public aepb R;
    private aekz S;
    private ActivityIndicatorFrameLayout T;
    private View U;
    private FloatingActionButton V;
    private Animation W;
    private Animation X;
    private ViewTreeObserver.OnGlobalLayoutListener Y;
    private int Z;
    private int aa;
    private Context ab;
    public cf l;
    public vxe m;
    public View n;
    public View o;
    public AnchorableTopPeekingScrollView p;
    public ViewGroup q;
    public RecyclerView r;
    public RecyclerView s;
    public Snackbar t;
    public aemm u;
    public aekq v;
    public final Runnable w = new aemk(this, 1, null);
    public aeng x;
    public aunn y;
    public aunn z;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        k = 2000L;
    }

    private static boolean n(View view) {
        return (view == null || view.getLayoutParams() == null) ? false : true;
    }

    @Override // defpackage.aeky
    public final void a(boolean z) {
        nh nhVar;
        nh nhVar2 = this.r.m;
        if ((nhVar2 == null || nhVar2.a() <= 0) && ((nhVar = this.s.m) == null || nhVar.a() <= 0)) {
            View view = this.U;
            if (z) {
                view.setVisibility(0);
                return;
            } else {
                view.setVisibility(8);
                return;
            }
        }
        ActivityIndicatorFrameLayout activityIndicatorFrameLayout = this.T;
        if (z) {
            activityIndicatorFrameLayout.b = true;
            activityIndicatorFrameLayout.a.setVisible(true, true);
            activityIndicatorFrameLayout.invalidate();
        } else {
            activityIndicatorFrameLayout.b = false;
            activityIndicatorFrameLayout.a.setVisible(false, false);
            activityIndicatorFrameLayout.invalidate();
        }
    }

    @Override // defpackage.aeky
    public final void b(boolean z) {
        if (z != this.p.n) {
            if (z) {
                this.Y = new aemc(this, String.valueOf(getClass().getSimpleName()).concat("-Anchor"));
                this.s.getViewTreeObserver().addOnGlobalLayoutListener(this.Y);
                this.p.g(true);
            } else {
                if (this.Y != null) {
                    this.s.getViewTreeObserver().removeOnGlobalLayoutListener(this.Y);
                }
                this.Y = null;
                this.p.g(false);
            }
        }
    }

    @Override // defpackage.aeky
    public final boolean c() {
        Context context = getContext();
        if (context == null) {
            return true;
        }
        int iK = twm.k(context);
        return (iK == 3 || iK == 4) ? false : true;
    }

    @Override // defpackage.bp
    public final void dismiss() {
        this.o.animate().alpha(0.0f).setDuration(250L).start();
        this.p.animate().translationY(this.n.getHeight()).setDuration(250L).setListener(new aemg(this)).start();
    }

    @Override // defpackage.xgm
    public final xgn hB() {
        return this.C;
    }

    public final void m(boolean z) {
        RecyclerView recyclerView;
        int height = this.r.getHeight();
        int childCount = this.s.getChildCount() - 1;
        int i = 0;
        int decoratedMeasuredHeight = 0;
        while (true) {
            recyclerView = this.s;
            if (i >= childCount) {
                break;
            }
            View childAt = recyclerView.getChildAt(i);
            if (n(childAt)) {
                decoratedMeasuredHeight += this.s.n.getDecoratedMeasuredHeight(childAt);
            }
            i++;
        }
        View childAt2 = recyclerView.getChildAt(childCount);
        int height2 = this.n.getHeight() - (((height + decoratedMeasuredHeight) + ((int) ((n(childAt2) ? this.s.n.getDecoratedMeasuredHeight(childAt2) : 0) * (true != c() ? 0.5f : 0.7f)))) + this.aa);
        int iMax = Math.max(height2, this.Z);
        AnchorableTopPeekingScrollView anchorableTopPeekingScrollView = this.p;
        if (z) {
            if (iMax < anchorableTopPeekingScrollView.k || !c()) {
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(this.p.k, iMax);
                valueAnimator.setInterpolator(new DecelerateInterpolator());
                valueAnimator.addUpdateListener(new adey(this, 7));
                valueAnimator.addListener(new aemj(this));
                valueAnimator.start();
            } else {
                this.u.a(aeml.d);
            }
        } else if (iMax < anchorableTopPeekingScrollView.k || !c()) {
            this.p.f(iMax, iMax, true);
        }
        if (height2 >= this.Z) {
            this.p.g(true);
        }
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, zwb] */
    @Override // defpackage.cc
    /* JADX INFO: renamed from: onActivityCreated */
    public final void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        super.m656lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
        ajwo ajwoVarB = vxg.b(getArguments().getByteArray("navigation_endpoint"));
        Resources resources = getResources();
        aend aendVar = this.P;
        xgn xgnVar = this.C;
        ttm ttmVar = this.D;
        ScheduledExecutorService scheduledExecutorService = this.F;
        tbt tbtVar = this.E;
        adhv adhvVar = this.H;
        anhb anhbVar = this.M.c().j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        ajdl ajdlVar = anhbVar.j;
        if (ajdlVar == null) {
            ajdlVar = ajdl.a;
        }
        this.S = new aekz(ajwoVarB, aendVar, xgnVar, ttmVar, scheduledExecutorService, tbtVar, adhvVar, ajdlVar, this.ab, this.m, this.x, this, this, this.R, this.I, this.O, this.v, this.J, this.N, this.Q, resources.getDimensionPixelSize(R.dimen.share_panel_row_horizontal_padding), resources.getDimensionPixelSize(R.dimen.share_panel_row_first_and_last_vertical_padding), this.B, this.G);
        aemm aemmVar = new aemm(this.S, this.A);
        this.u = aemmVar;
        aemmVar.a(aeml.a);
        aekz aekzVar = this.S;
        aekzVar.l = aekzVar.d.submit(new aegt(aekzVar, 3));
        aekzVar.s.d(aekzVar.k);
        tbt tbtVar2 = aekzVar.e;
        tbtVar2.f(aekzVar);
        aekzVar.q.m(aekzVar, "");
        ajwo ajwoVar = aekzVar.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apte.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        apte apteVar = (apte) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if (!apteVar.e.isEmpty()) {
            aekzVar.h.a(false);
            aekzVar.d(new wpd(apteVar.e));
            return;
        }
        if (apteVar.d.isEmpty()) {
            throw new IllegalArgumentException("Invalid share entity endpoint provided.");
        }
        String str = apteVar.d;
        tbtVar2.c(new aelc());
        aekzVar.h.a(true);
        aend aendVar2 = aekzVar.r;
        List listQ = adul.q(aekzVar.b(), aekzVar.f);
        gtg gtgVar = new gtg(aekzVar, 14);
        wpc wpcVar = new wpc(aendVar2.b, aendVar2.c.e());
        wpcVar.a = str;
        wpcVar.b = listQ;
        wpcVar.h = false;
        wpcVar.D = 2;
        new wpb(aendVar2).i(wpcVar, gtgVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.o) {
            dismiss();
        }
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.S.i.iterator();
        while (it.hasNext()) {
            ((aeks) it.next()).k(configuration);
        }
        aemm aemmVar = this.u;
        aeml aemlVar = aeml.a;
        aemmVar.b.removeAll(Arrays.asList(aemlVar));
        aemmVar.c = false;
        if (c()) {
            AnchorableTopPeekingScrollView anchorableTopPeekingScrollView = this.p;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.share_panel_peek_amount);
            anchorableTopPeekingScrollView.f(dimensionPixelSize, dimensionPixelSize, true);
        } else {
            this.n.addOnLayoutChangeListener(new aeab(this, this.n.getHeight(), 2));
        }
        this.u.a(aemlVar);
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.l = getActivity();
        iO(2, this.L.a);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ab = layoutInflater.getContext();
        View viewInflate = layoutInflater.inflate(R.layout.unified_share_panel_fragment, viewGroup, false);
        this.n = viewInflate;
        this.o = viewInflate.findViewById(R.id.overlay);
        this.p = (AnchorableTopPeekingScrollView) this.n.findViewById(R.id.top_peeking_scroll_view);
        this.T = (ActivityIndicatorFrameLayout) this.n.findViewById(R.id.progress_linear_bar);
        int dimensionPixelSize = this.n.getResources().getDimensionPixelSize(R.dimen.share_panel_contents_width);
        if (dimensionPixelSize > 0) {
            tym.h(this.p, new tyl(dimensionPixelSize, 0), ViewGroup.LayoutParams.class);
        }
        this.U = this.n.findViewById(R.id.progress_spinner);
        this.q = (ViewGroup) this.n.findViewById(R.id.content);
        this.r = (RecyclerView) this.n.findViewById(R.id.header);
        this.s = (RecyclerView) this.n.findViewById(R.id.list);
        this.V = (FloatingActionButton) this.n.findViewById(R.id.send_button);
        this.t = (Snackbar) this.n.findViewById(R.id.snackbar);
        this.v = new aekq(this.l, this.x, this.H, this.n.findViewById(R.id.select_message_view), this.n.findViewById(R.id.message_input_view));
        Resources resources = this.l.getResources();
        this.Z = 0;
        this.o.setOnClickListener(this);
        if (c()) {
            this.Z = resources.getDimensionPixelSize(R.dimen.share_panel_peek_amount);
            int iMax = Math.max(getContext().getResources().getDisplayMetrics().heightPixels - resources.getDimensionPixelSize(R.dimen.share_panel_default_visible_amount), 0);
            this.p.f(iMax, iMax, false);
        } else {
            AnchorableTopPeekingScrollView anchorableTopPeekingScrollView = this.p;
            int i = getContext().getResources().getDisplayMetrics().heightPixels;
            anchorableTopPeekingScrollView.f(i, i, false);
        }
        AnchorableTopPeekingScrollView anchorableTopPeekingScrollView2 = this.p;
        ((TopPeekingScrollView) anchorableTopPeekingScrollView2).l = this.o;
        ((TopPeekingScrollView) anchorableTopPeekingScrollView2).m = this.s;
        new ColorDrawable(tzk.n(this.ab, R.attr.ytSeparator).orElse(0)).setBounds(0, 0, 1, 1);
        this.r.ah(new LinearLayoutManager(this.l));
        aemd aemdVar = new aemd(this, this.l);
        aemdVar.setAutoMeasureEnabled(false);
        this.s.ah(aemdVar);
        this.V.setOnClickListener(this);
        this.W = AnimationUtils.loadAnimation(this.l, R.anim.fab_in);
        this.X = AnimationUtils.loadAnimation(this.l, R.anim.fab_out);
        this.n.getViewTreeObserver().addOnGlobalLayoutListener(new aemf(this, String.valueOf(getClass().getSimpleName()).concat("-Root")));
        this.q.setVisibility(4);
        cf cfVar = this.l;
        int identifier = cfVar.getResources().getIdentifier("status_bar_height", "dimen", "android");
        this.aa = identifier > 0 ? cfVar.getResources().getDimensionPixelSize(identifier) : 0;
        return this.n;
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onDestroyView() {
        super.onDestroyView();
        aekz aekzVar = this.S;
        aekzVar.m = true;
        aekzVar.q.o(aekzVar, "");
        aekzVar.s.e(aekzVar.k);
        Iterator it = aekzVar.i.iterator();
        while (it.hasNext()) {
            ((aeks) it.next()).i();
        }
        tbt tbtVar = aekzVar.e;
        tbtVar.l(aekzVar);
        tbtVar.c(new aelc());
        ajwo ajwoVar = aekzVar.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apte.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            tmo tmoVar = aekzVar.j;
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apte.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            tmoVar.i(wpc.e(((apte) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d, adul.q(aekzVar.b(), aekzVar.f), null, null, null));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.cc
    public final void onPause() {
        super.onPause();
        aepb aepbVar = this.R;
        taq.d();
        aepbVar.b.remove(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.cc
    public final void onResume() {
        super.onResume();
        aepb aepbVar = this.R;
        taq.d();
        aepbVar.b.add(this);
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStart() {
        super.onStart();
        Window window = this.f.getWindow();
        window.addFlags(2);
        window.setDimAmount(0.0f);
    }
}
