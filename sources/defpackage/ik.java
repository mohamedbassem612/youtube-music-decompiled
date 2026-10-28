package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ik extends iy implements View.OnKeyListener, PopupWindow.OnDismissListener, jb {
    public final Handler a;
    View d;
    ViewTreeObserver e;
    public boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private ja y;
    private PopupWindow.OnDismissListener z;
    private final List l = new ArrayList();
    public final List b = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new jg(this, 1);
    private final View.OnAttachStateChangeListener m = new jh(this, 1);
    private final my n = new ij(this);
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = y();

    public ik(Context context, View view, int i, boolean z) {
        this.h = context;
        this.q = view;
        this.j = i;
        this.k = z;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    private final int y() {
        return this.q.getLayoutDirection() == 1 ? 0 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0143 A[PHI: r4
      0x0143: PHI (r4v15 int) = (r4v5 int), (r4v17 int) binds: [B:61:0x0145, B:59:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0147  */
    /* JADX WARN: Code duplicated, block: B:64:0x0155  */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:69:0x0161  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final void z(iq iqVar) {
        aae aaeVar;
        View childAt;
        int i;
        Method method;
        MenuItem item;
        in inVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.h;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        in inVar2 = new in(iqVar, layoutInflaterFrom, this.k, R.layout.abc_cascading_menu_item_layout);
        if (!u() && this.w) {
            inVar2.b = true;
        } else if (u()) {
            inVar2.b = iy.w(iqVar);
        }
        int iX = x(inVar2, context, this.i);
        na naVar = new na(context, this.j);
        naVar.b = this.n;
        naVar.l = this;
        naVar.v(this);
        naVar.k = this.q;
        naVar.j = this.p;
        naVar.z();
        naVar.y();
        naVar.e(inVar2);
        naVar.r(iX);
        naVar.j = this.p;
        List list = this.b;
        if (list.size() > 0) {
            aaeVar = (aae) list.get(list.size() - 1);
            iq iqVar2 = (iq) aaeVar.c;
            int size = iqVar2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    item = null;
                    break;
                }
                item = iqVar2.getItem(i2);
                if (item.hasSubMenu() && iqVar == item.getSubMenu()) {
                    break;
                } else {
                    i2++;
                }
            }
            if (item != null) {
                ListView listViewA = aaeVar.a();
                ListAdapter adapter = listViewA.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    inVar = (in) headerViewListAdapter.getWrappedAdapter();
                } else {
                    inVar = (in) adapter;
                    headersCount = 0;
                }
                int count = inVar.getCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= count) {
                        i3 = -1;
                        break;
                    } else if (item == inVar.getItem(i3)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1 && (firstVisiblePosition = (i3 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
                    childAt = listViewA.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                if (Build.VERSION.SDK_INT <= 28) {
                    method = na.a;
                    if (method != null) {
                        try {
                            method.invoke(naVar.p, Boolean.FALSE);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    naVar.p.setTouchModal(false);
                }
                naVar.p.setEnterTransition(null);
                List list2 = this.b;
                ListView listViewA2 = ((aae) list2.get(list2.size() - 1)).a();
                int[] iArr = new int[2];
                listViewA2.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.d.getWindowVisibleDisplayFrame(rect);
                i = (this.r == 1 ? iArr[0] - iX >= 0 : (iArr[0] + listViewA2.getWidth()) + iX > rect.right) ? 0 : 1;
                this.r = i;
                naVar.k = childAt;
                if ((this.p & 5) == 5) {
                    if (i == 0) {
                        iX = childAt.getWidth();
                        iX = -iX;
                    }
                } else if (i != 0) {
                    iX = childAt.getWidth();
                } else {
                    iX = -iX;
                }
                naVar.g = iX;
                naVar.i = true;
                naVar.h = true;
                naVar.j(0);
            } else {
                if (this.s) {
                    naVar.g = this.u;
                }
                if (this.t) {
                    naVar.j(this.v);
                }
                naVar.t(this.g);
            }
            this.b.add(new aae(naVar, iqVar, this.r));
            naVar.s();
            mb mbVar = naVar.e;
            mbVar.setOnKeyListener(this);
            if (aaeVar == null || !this.x || iqVar.e == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) mbVar, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(iqVar.e);
            mbVar.addHeaderView(frameLayout, null, false);
            naVar.s();
            return;
        }
        aaeVar = null;
        childAt = null;
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                method = na.a;
                if (method != null) {
                    method.invoke(naVar.p, Boolean.FALSE);
                }
            } else {
                naVar.p.setTouchModal(false);
            }
            naVar.p.setEnterTransition(null);
            List list3 = this.b;
            ListView listViewA3 = ((aae) list3.get(list3.size() - 1)).a();
            int[] iArr2 = new int[2];
            listViewA3.getLocationOnScreen(iArr2);
            Rect rect2 = new Rect();
            this.d.getWindowVisibleDisplayFrame(rect2);
            if (this.r == 1) {
            }
            this.r = i;
            naVar.k = childAt;
            if ((this.p & 5) == 5) {
                if (i == 0) {
                    iX = childAt.getWidth();
                    iX = -iX;
                }
            } else if (i != 0) {
                iX = childAt.getWidth();
            } else {
                iX = -iX;
            }
            naVar.g = iX;
            naVar.i = true;
            naVar.h = true;
            naVar.j(0);
        } else {
            if (this.s) {
                naVar.g = this.u;
            }
            if (this.t) {
                naVar.j(this.v);
            }
            naVar.t(this.g);
        }
        this.b.add(new aae(naVar, iqVar, this.r));
        naVar.s();
        mb mbVar2 = naVar.e;
        mbVar2.setOnKeyListener(this);
        if (aaeVar == null) {
        }
    }

    @Override // defpackage.jb
    public final void c(iq iqVar, boolean z) {
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (iqVar == ((aae) list.get(i)).c) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < list.size()) {
                ((iq) ((aae) list.get(i2)).c).i(false);
            }
            aae aaeVar = (aae) list.remove(i);
            ((iq) aaeVar.c).m(this);
            if (this.f) {
                Object obj = aaeVar.b;
                ((na) obj).p.setExitTransition(null);
                ((mx) obj).p.setAnimationStyle(0);
            }
            ((mx) aaeVar.b).k();
            int size2 = list.size();
            if (size2 > 0) {
                this.r = ((aae) list.get(size2 - 1)).a;
            } else {
                this.r = y();
            }
            if (size2 != 0) {
                if (z) {
                    ((iq) ((aae) list.get(0)).c).i(false);
                    return;
                }
                return;
            }
            k();
            ja jaVar = this.y;
            if (jaVar != null) {
                jaVar.a(iqVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.e;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.e.removeGlobalOnLayoutListener(this.c);
                }
                this.e = null;
            }
            this.d.removeOnAttachStateChangeListener(this.m);
            this.z.onDismiss();
        }
    }

    @Override // defpackage.jb
    public final void d(ja jaVar) {
        this.y = jaVar;
    }

    @Override // defpackage.jb
    public final boolean e() {
        return false;
    }

    @Override // defpackage.jb
    public final boolean f(jj jjVar) {
        for (aae aaeVar : this.b) {
            if (jjVar == aaeVar.c) {
                aaeVar.a().requestFocus();
                return true;
            }
        }
        if (!jjVar.hasVisibleItems()) {
            return false;
        }
        j(jjVar);
        ja jaVar = this.y;
        if (jaVar == null) {
            return true;
        }
        jaVar.b(jjVar);
        return true;
    }

    @Override // defpackage.jf
    public final ListView fN() {
        List list = this.b;
        if (list.isEmpty()) {
            return null;
        }
        return ((aae) list.get(list.size() - 1)).a();
    }

    @Override // defpackage.jb
    public final void i() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            v(((aae) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.iy
    public final void j(iq iqVar) {
        iqVar.h(this, this.h);
        if (u()) {
            z(iqVar);
        } else {
            this.l.add(iqVar);
        }
    }

    @Override // defpackage.jf
    public final void k() {
        List list = this.b;
        int size = list.size();
        if (size <= 0) {
            return;
        }
        aae[] aaeVarArr = (aae[]) list.toArray(new aae[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            mx mxVar = (mx) aaeVarArr[size].b;
            if (mxVar.u()) {
                mxVar.k();
            }
        }
    }

    @Override // defpackage.iy
    public final void l(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity(this.o, view.getLayoutDirection());
        }
    }

    @Override // defpackage.iy
    public final void m(boolean z) {
        this.w = z;
    }

    @Override // defpackage.iy
    public final void n(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = Gravity.getAbsoluteGravity(i, this.q.getLayoutDirection());
        }
    }

    @Override // defpackage.iy
    public final void o(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        aae aaeVar;
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aaeVar = null;
                break;
            }
            aaeVar = (aae) list.get(i);
            if (!((mx) aaeVar.b).u()) {
                break;
            } else {
                i++;
            }
        }
        if (aaeVar != null) {
            ((iq) aaeVar.c).i(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        k();
        return true;
    }

    @Override // defpackage.iy
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // defpackage.iy
    public final void q(boolean z) {
        this.x = z;
    }

    @Override // defpackage.iy
    public final void r(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.jf
    public final void s() {
        if (u()) {
            return;
        }
        List list = this.l;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z((iq) it.next());
        }
        list.clear();
        View view = this.q;
        this.d = view;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = this.e;
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            this.e = viewTreeObserver2;
            if (viewTreeObserver == null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.c);
            }
            this.d.addOnAttachStateChangeListener(this.m);
        }
    }

    @Override // defpackage.iy
    protected final boolean t() {
        return false;
    }

    @Override // defpackage.jf
    public final boolean u() {
        List list = this.b;
        return list.size() > 0 && ((mx) ((aae) list.get(0)).b).u();
    }
}
