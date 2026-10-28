package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bq implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ bq(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:114:0x0208  */
    @Override // java.lang.Runnable
    public final void run() {
        int iJ;
        int iJ2;
        int i = 0;
        switch (this.$cid) {
            case 0:
                ((cc) this.a).m657lambda$performAttach$2$androidsupportv4appFragment();
                return;
            case 1:
                bp bpVar = (bp) this.a;
                bpVar.a.onDismiss(bpVar.f);
                return;
            case 2:
                ((cc) this.a).onStart();
                return;
            case 3:
                ((cc) this.a).m670lambda$performStart$9$androidsupportv4appFragment();
                return;
            case 4:
                ((cc) this.a).m669lambda$performStart$10$androidsupportv4appFragment();
                return;
            case 5:
                ((cc) this.a).m660lambda$performCreateView$5$androidsupportv4appFragment();
                return;
            case 6:
                ((cc) this.a).onResume();
                return;
            case 7:
                ((cc) this.a).m666lambda$performResume$11$androidsupportv4appFragment();
                return;
            case 8:
                ((cc) this.a).m667lambda$performResume$12$androidsupportv4appFragment();
                return;
            case 9:
                ((cc) this.a).m675lambda$restoreViewState$1$androidsupportv4appFragment();
                return;
            case 10:
                ((cc) this.a).m659lambda$performCreate$4$androidsupportv4appFragment();
                return;
            case 11:
                ((cc) this.a).startPostponedEnterTransition();
                return;
            case 12:
                ((dd) this.a).am(true);
                return;
            case 13:
                gp gpVar = (gp) this.a;
                if ((gpVar.E & 1) != 0) {
                    gpVar.M(0);
                }
                if ((gpVar.E & SemanticState.Obscured) != 0) {
                    gpVar.M(108);
                }
                gpVar.D = false;
                gpVar.E = 0;
                return;
            case 14:
                Object obj = this.a;
                Menu menuA = ((gx) obj).A();
                Menu menu = true != (menuA instanceof iq) ? null : menuA;
                if (menu != null) {
                    ((iq) menu).s();
                }
                try {
                    menuA.clear();
                    Window.Callback callback = ((gx) obj).a;
                    if (!callback.onCreatePanelMenu(0, menuA) || !callback.onPreparePanel(0, null, menuA)) {
                        menuA.clear();
                    }
                    if (menu != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (menu != null) {
                        ((iq) menu).r();
                    }
                }
                break;
            case 15:
                ((RecyclerView) this.a).t = false;
                return;
            case 16:
                RecyclerView recyclerView = (RecyclerView) this.a;
                if (!recyclerView.s || recyclerView.isLayoutRequested()) {
                    return;
                }
                if (!recyclerView.q) {
                    recyclerView.requestLayout();
                    return;
                } else if (recyclerView.v) {
                    recyclerView.u = true;
                    return;
                } else {
                    recyclerView.C();
                    return;
                }
            case 17:
                RecyclerView recyclerView2 = (RecyclerView) this.a;
                nl nlVar = recyclerView2.E;
                if (nlVar != null) {
                    nlVar.d();
                }
                recyclerView2.R = false;
                return;
            case 18:
                Toolbar toolbar = (Toolbar) this.a;
                ArrayList arrayList = toolbar.v;
                int size = arrayList.size();
                while (i < size) {
                    toolbar.f().removeItem(((MenuItem) arrayList.get(i)).getItemId());
                    i++;
                }
                Menu menuF = toolbar.f();
                ArrayList arrayListI = toolbar.i();
                toolbar.u.b(menuF, toolbar.g());
                ArrayList arrayListI2 = toolbar.i();
                arrayListI2.removeAll(arrayListI);
                toolbar.v = arrayListI2;
                return;
            case 19:
                ((Toolbar) this.a).z();
                return;
            default:
                pv pvVar = (pv) this.a;
                if (pvVar.b != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = pvVar.s;
                    long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
                    np npVar = pvVar.m.n;
                    if (pvVar.r == null) {
                        pvVar.r = new Rect();
                    }
                    npVar.calculateItemDecorationsForChild(pvVar.b.a, pvVar.r);
                    if (npVar.canScrollHorizontally()) {
                        int i2 = (int) (pvVar.g + pvVar.e);
                        int paddingLeft = (i2 - pvVar.r.left) - pvVar.m.getPaddingLeft();
                        float f = pvVar.e;
                        if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((i2 + pvVar.b.a.getWidth()) + pvVar.r.right) - (pvVar.m.getWidth() - pvVar.m.getPaddingRight())) <= 0)) {
                            iJ = 0;
                        } else {
                            iJ = paddingLeft;
                        }
                    } else {
                        iJ = 0;
                    }
                    if (npVar.canScrollVertically()) {
                        int i3 = (int) (pvVar.h + pvVar.f);
                        iJ2 = (i3 - pvVar.r.top) - pvVar.m.getPaddingTop();
                        float f2 = pvVar.f;
                        if ((f2 >= 0.0f || iJ2 >= 0) && (f2 <= 0.0f || (iJ2 = ((i3 + pvVar.b.a.getHeight()) + pvVar.r.bottom) - (pvVar.m.getHeight() - pvVar.m.getPaddingBottom())) <= 0)) {
                            iJ2 = 0;
                        }
                    } else {
                        iJ2 = 0;
                    }
                    if (iJ != 0) {
                        pp ppVar = pvVar.j;
                        RecyclerView recyclerView3 = pvVar.m;
                        int width = pvVar.b.a.getWidth();
                        pvVar.m.getWidth();
                        iJ = ppVar.j(recyclerView3, width, iJ, j2);
                    }
                    int i4 = iJ;
                    if (iJ2 != 0) {
                        pp ppVar2 = pvVar.j;
                        RecyclerView recyclerView4 = pvVar.m;
                        int height = pvVar.b.a.getHeight();
                        pvVar.m.getHeight();
                        iJ2 = ppVar2.j(recyclerView4, height, iJ2, j2);
                    }
                    if (i4 != 0) {
                        i = i4;
                    } else if (iJ2 == 0) {
                        pvVar.s = Long.MIN_VALUE;
                        return;
                    }
                    if (pvVar.s == Long.MIN_VALUE) {
                        pvVar.s = jCurrentTimeMillis;
                    }
                    pvVar.m.scrollBy(i, iJ2);
                    oh ohVar = pvVar.b;
                    if (ohVar != null) {
                        pvVar.r(ohVar);
                    }
                    pvVar.m.removeCallbacks(pvVar.n);
                    RecyclerView recyclerView5 = pvVar.m;
                    int i5 = bac.a;
                    recyclerView5.postOnAnimation(this);
                    return;
                }
                return;
        }
    }

    public bq(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
