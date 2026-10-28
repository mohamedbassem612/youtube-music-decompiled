package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.livechat.ui.view.VerticalShimmerLoadingFrameLayout;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class xbn implements wxr {
    private final awly A;
    public final Context a;
    public final advb b;
    public final xgn c;
    public final View.OnLayoutChangeListener d;
    public final xbm e;
    public adkz f;
    public int h;
    public adkz i;
    public xch j;
    public boolean k;
    public int l;
    public boolean m;
    public CharSequence o;
    public Runnable p;
    public advy q;
    public final awly r;
    public final tqj s;
    public wwn u;
    public final vxz v;
    public final vxz w;
    public final ahek x;
    public final xpl y;
    private boolean z;
    public boolean g = true;
    public int n = 0;
    private final Runnable B = new wvr(this, 13);
    public final adky t = new xbl(this, 0);

    public xbn(Context context, advb advbVar, ahek ahekVar, xgn xgnVar, xpl xplVar, vxz vxzVar, final vxz vxzVar2, tqj tqjVar) {
        this.a = context;
        this.b = advbVar;
        advbVar.b(amqm.class);
        this.x = ahekVar;
        xgnVar.getClass();
        this.c = xgnVar;
        this.w = vxzVar;
        this.v = vxzVar2;
        this.s = tqjVar;
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.live_chat_more_comments_button_icon_size);
        this.d = new View.OnLayoutChangeListener() { // from class: xbj
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = i4 - i2;
                int i10 = i8 - i6;
                xbn xbnVar = this.a;
                if (i9 != i10) {
                    if (vxzVar2.m(10, 45747041L)) {
                        xbnVar.s().setVisibility(i9 > (dimensionPixelSize << 1) ? 0 : 4);
                        if (xbnVar.g) {
                            xbnVar.a();
                        }
                    } else {
                        xbnVar.a();
                    }
                }
                int i11 = i7 - i5;
                if (i11 == 0 || i3 - i == i11) {
                    return;
                }
                xbnVar.x(true);
            }
        };
        this.e = new xbm(this);
        this.y = xplVar;
        new awlo();
        this.r = new awlo().az();
        this.A = new awlo().az();
    }

    private static void B(RecyclerView recyclerView, int i) {
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != null) {
                    adma admaVarD = adul.d(childAt);
                    if (admaVarD instanceof wxn) {
                        wxn wxnVar = (wxn) admaVarD;
                        if (i == 0) {
                            wxnVar.d();
                        } else if (i == 1) {
                            wxnVar.c();
                        } else if (i != 2) {
                            wxnVar.e();
                        } else {
                            wxnVar.b();
                        }
                    }
                }
            }
        }
    }

    private final void C(int i) {
        this.n = i;
        this.A.kk(Integer.valueOf(i));
    }

    public final boolean A() {
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerViewR = r();
        return (recyclerViewR == null || (linearLayoutManager = (LinearLayoutManager) recyclerViewR.n) == null || linearLayoutManager.findFirstVisibleItemPosition() != 0) ? false : true;
    }

    @Override // defpackage.wxp
    public final void a() {
        x(!y());
    }

    @Override // defpackage.wxn
    public final void b() {
        xby xbyVarP;
        if (this.w.m(26, 45629546L) && (xbyVarP = p()) != null) {
            xbyVarP.b();
        } else {
            w();
            B(r(), 2);
        }
    }

    @Override // defpackage.wxn
    public final void c() {
        xby xbyVarP;
        if (this.w.m(26, 45629546L) && (xbyVarP = p()) != null) {
            xbyVarP.e();
        } else {
            f();
            B(r(), 1);
        }
    }

    @Override // defpackage.wxn
    public final void d() {
        xby xbyVarP;
        if (this.w.m(26, 45629546L) && (xbyVarP = p()) != null) {
            xbyVarP.e();
        } else {
            f();
            B(r(), 0);
        }
    }

    @Override // defpackage.wxn
    public final void e() {
        xby xbyVarP;
        if (this.w.m(26, 45629546L) && (xbyVarP = p()) != null) {
            xbyVarP.b();
        } else {
            w();
            B(r(), 3);
        }
    }

    @Override // defpackage.wxp
    public final void f() {
        Object obj;
        if (this.w.m(26, 45629546L)) {
            xby xbyVarP = p();
            if (xbyVarP != null) {
                xbyVarP.d();
                return;
            }
            return;
        }
        RecyclerView recyclerViewR = r();
        if (recyclerViewR == null || (obj = this.i) == null || ((tbm) obj).size() <= 0) {
            return;
        }
        recyclerViewR.removeCallbacks(this.B);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerViewR.n;
        if (linearLayoutManager != null && linearLayoutManager.findFirstVisibleItemPosition() > 10) {
            recyclerViewR.ab(10);
        }
        this.k = true;
        recyclerViewR.aj(0);
    }

    @Override // defpackage.wxp
    public final boolean g() {
        return z() || this.g;
    }

    @Override // defpackage.wxp
    public final boolean h() {
        xby xbyVarP;
        if (!this.w.m(26, 45629546L) || (xbyVarP = p()) == null) {
            return this.k || A();
        }
        return xbyVarP.g();
    }

    @Override // defpackage.wxp
    public final boolean i() {
        return this.h == 1;
    }

    @Override // defpackage.wxp
    public final boolean j() {
        xby xbyVarP;
        if (!this.w.m(26, 45629546L) || (xbyVarP = p()) == null) {
            return this.l == 1;
        }
        return xbyVarP.h();
    }

    @Override // defpackage.wxr
    public final void k() {
        RecyclerView recyclerViewQ = q();
        advy advyVar = this.q;
        if (advyVar != null) {
            advyVar.b(recyclerViewQ);
            this.q = null;
        } else {
            recyclerViewQ.ad(null);
        }
        recyclerViewQ.ah(null);
        recyclerViewQ.removeOnLayoutChangeListener(this.d);
        xbm xbmVar = this.e;
        recyclerViewQ.aE(xbmVar);
        this.m = false;
        this.f = null;
        this.i = null;
        this.h = 0;
        if (this.w.m(26, 45629546L)) {
            xby xbyVarP = p();
            if (xbyVarP != null) {
                adkz adkzVar = xbyVarP.b;
                if (adkzVar != null) {
                    adkzVar.n(xbyVarP.m);
                }
                xbyVarP.b = null;
                ListenableFuture listenableFuture = xbyVarP.a;
                if (listenableFuture != null && !listenableFuture.isDone() && !xbyVarP.a.isCancelled()) {
                    xbyVarP.a.cancel(false);
                }
                xbyVarP.a = null;
                RecyclerView recyclerViewI = xbyVarP.i();
                if (recyclerViewI != null) {
                    xbyVarP.c();
                    recyclerViewI.ad(null);
                    recyclerViewI.ah(null);
                    recyclerViewI.aE(xbyVarP.k);
                }
                xbyVarP.c = false;
                xbyVarP.e = 0;
            }
        } else {
            RecyclerView recyclerViewR = r();
            if (recyclerViewR != null) {
                w();
                recyclerViewR.ad(null);
                recyclerViewR.ah(null);
                recyclerViewR.aE(xbmVar);
            }
        }
        u(false);
        this.l = 0;
        C(0);
    }

    @Override // defpackage.wxr
    public final void l() {
        xch xchVar = this.j;
        if (xchVar != null) {
            xchVar.b = -1;
            xchVar.m();
        }
    }

    @Override // defpackage.wxr
    public final void m() {
        if (this.w.m(37, 45661615L) && this.n == 2) {
            return;
        }
        ViewParent parent = q().getParent();
        if (parent instanceof LoadingFrameLayout) {
            ((LoadingFrameLayout) parent).a();
        }
        C(2);
    }

    @Override // defpackage.wxr
    public final void n(CharSequence charSequence, final Runnable runnable) {
        ViewParent parent = q().getParent();
        C(3);
        this.o = charSequence;
        this.p = runnable;
        if (parent instanceof LoadingFrameLayout) {
            final LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) parent;
            boolean z = runnable != null;
            if (z) {
                loadingFrameLayout.e(new aeja() { // from class: xbk
                    @Override // defpackage.aeja
                    public final void a() {
                        LoadingFrameLayout loadingFrameLayout2 = loadingFrameLayout;
                        if (loadingFrameLayout2 instanceof VerticalShimmerLoadingFrameLayout) {
                            loadingFrameLayout2.a();
                        }
                        Runnable runnable2 = runnable;
                        loadingFrameLayout2.c();
                        runnable2.run();
                    }
                });
            }
            loadingFrameLayout.b(charSequence, z);
        }
        l();
    }

    @Override // defpackage.wxr
    public final void o() {
        ViewParent parent = q().getParent();
        if (parent instanceof LoadingFrameLayout) {
            u(false);
            ((LoadingFrameLayout) parent).c();
        }
        C(1);
        l();
    }

    @Override // defpackage.wxr
    public xby p() {
        throw null;
    }

    public abstract RecyclerView q();

    public abstract RecyclerView r();

    public abstract View s();

    public abstract advz t();

    protected final void u(boolean z) {
        if (z != this.z) {
            this.z = z;
            View viewS = s();
            if (viewS != null) {
                if (z) {
                    viewS.setImportantForAccessibility(1);
                    viewS.animate().translationY(0.0f).setDuration(200L);
                } else {
                    viewS.animate().translationY(this.a.getResources().getDimensionPixelOffset(R.dimen.live_chat_more_comments_button_horizontal_offset)).setDuration(200L);
                    viewS.setImportantForAccessibility(2);
                }
            }
        }
    }

    public final void v(long j) {
        RecyclerView recyclerViewR = r();
        if (recyclerViewR != null) {
            recyclerViewR.postDelayed(this.B, j);
        }
    }

    public final void w() {
        RecyclerView recyclerViewR = r();
        if (recyclerViewR != null) {
            recyclerViewR.removeCallbacks(this.B);
        }
    }

    public final void x(boolean z) {
        int iA;
        int i;
        if (this.f != null) {
            if ((z || !(i() || z())) && (iA = this.f.a()) > 0) {
                RecyclerView recyclerViewQ = q();
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerViewQ.n;
                if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() < (i = iA - 10)) {
                    recyclerViewQ.ab(i);
                }
                this.g = true;
                recyclerViewQ.aj(iA - 1);
            }
        }
    }

    public final boolean y() {
        vxz vxzVar = this.v;
        return vxzVar != null && vxzVar.m(12, 45756228L);
    }

    public final boolean z() {
        LinearLayoutManager linearLayoutManager;
        int iFindLastCompletelyVisibleItemPosition;
        RecyclerView recyclerViewQ = q();
        return recyclerViewQ == null || (linearLayoutManager = (LinearLayoutManager) recyclerViewQ.n) == null || this.f == null || (iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition()) == -1 || iFindLastCompletelyVisibleItemPosition == this.f.a() + (-1);
    }
}
