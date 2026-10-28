package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.BidiFormatter;
import android.text.Editable;
import android.text.Layout;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.metadataeditor.elements.OverlayView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j$.util.OptionalInt;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zpr {
    public final Executor a;
    public final CoordinatorLayout b;
    public final EditText c;
    public final ViewGroup d;
    public final BottomSheetBehavior e;
    public final zpu f;
    public final boolean g;
    public zpq h;
    public zpm i;
    public int j;
    public final RecyclerView k;
    public final assz l;
    public avmn m;
    public final zpt n;
    public final vxz o;
    private final Context p;
    private final int q;
    private final float r;
    private final float s;
    private final int t;
    private final zrv u;
    private final boolean v;
    private final int w;
    private final int x;
    private boolean y;
    private final ahhp z;

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    public zpr(Context context, aeiy aeiyVar, isi isiVar, abuz abuzVar, Executor executor, avmb avmbVar, aeda aedaVar, elr elrVar, vxz vxzVar, CoordinatorLayout coordinatorLayout, EditText editText, zpt zptVar, assz asszVar, ViewGroup viewGroup, xgn xgnVar, zpu zpuVar, boolean z, ahhp ahhpVar, boolean z2) {
        BottomSheetBehavior bottomSheetBehavior;
        this.p = context;
        this.a = executor;
        this.u = (zrv) isiVar.b;
        byte[] bArr = null;
        this.v = TextUtils.equals((CharSequence) abuzVar.e(null).get("cplatform"), zru.TABLET.k);
        this.b = coordinatorLayout;
        this.c = editText;
        this.l = asszVar;
        this.z = ahhpVar;
        this.t = twm.c(editText.getResources().getDisplayMetrics(), 15);
        this.w = twm.c(context.getResources().getDisplayMetrics(), 12);
        this.x = twm.c(context.getResources().getDisplayMetrics(), 37);
        this.d = viewGroup;
        if (aedaVar.f()) {
            viewGroup.setBackgroundColor(tzk.i(context, R.attr.ytBaseBackground));
        }
        this.q = tzk.n(context, R.attr.ytBadgeChipBackground).orElse(0);
        this.n = zptVar;
        this.i = null;
        this.g = z2;
        this.o = vxzVar;
        coordinatorLayout.addOnLayoutChangeListener(new jfx(this, 11, null));
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.suggestions);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(1);
        recyclerView.ah(linearLayoutManager);
        this.k = recyclerView;
        OverlayView overlayView = (OverlayView) viewGroup.findViewById(R.id.social_suggestions_overlay);
        if (zpuVar != null) {
            this.f = zpuVar;
            if (k(asszVar.c) || vxzVar.m(13, 45703450L)) {
                overlayView.setVisibility(8);
                this.m = ((avlr) elrVar.a).O(avmbVar).af(new zgd(this, 6));
            } else {
                overlayView.a = recyclerView;
                overlayView.b = new xxj(this, bArr);
            }
        } else {
            ahek ahekVar = (ahek) aeiyVar.h.io();
            ahekVar.getClass();
            advb advbVar = (advb) aeiyVar.b.io();
            advbVar.getClass();
            ((vxe) aeiyVar.a.io()).getClass();
            xeu xeuVar = (xeu) aeiyVar.c.io();
            xeuVar.getClass();
            abte abteVar = (abte) aeiyVar.g.io();
            abteVar.getClass();
            dov dovVar = (dov) aeiyVar.e.io();
            dovVar.getClass();
            aaqf aaqfVar = (aaqf) aeiyVar.f.io();
            aaqfVar.getClass();
            vxz vxzVar2 = (vxz) aeiyVar.d.io();
            vxzVar2.getClass();
            recyclerView.getClass();
            zqa zqaVar = new zqa(ahekVar, advbVar, xeuVar, abteVar, dovVar, aaqfVar, vxzVar2, context, this, recyclerView, xgnVar);
            this.f = zqaVar;
            zqaVar.b();
            overlayView.a = recyclerView;
            overlayView.b = new xxj(this, bArr);
        }
        this.f.i(this, recyclerView);
        View viewFindViewById = viewGroup.findViewById(R.id.user_mention_suggestions_top_bar);
        OptionalInt optionalIntN = tzk.n(context, R.attr.yt10PercentLayer);
        if (optionalIntN.isPresent() && viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(optionalIntN.getAsInt());
        }
        asv asvVar = (asv) viewGroup.getLayoutParams();
        if (asvVar == null || asvVar.a == null) {
            this.e = null;
        } else {
            BottomSheetBehavior bottomSheetBehaviorX = BottomSheetBehavior.x(viewGroup);
            this.e = bottomSheetBehaviorX;
            bottomSheetBehaviorX.n = true;
            bottomSheetBehaviorX.H(true);
            bottomSheetBehaviorX.I(5);
            bottomSheetBehaviorX.Q(0);
        }
        if (z && (bottomSheetBehavior = this.e) != null) {
            bottomSheetBehavior.y(new zpn(this));
            editText.getViewTreeObserver().addOnGlobalLayoutListener(new zpo(this, getClass().getSimpleName()));
        }
        Resources resources = context.getResources();
        this.r = resources.getDimension(R.dimen.user_mention_chip_corner_radius);
        this.s = resources.getDimension(R.dimen.user_mention_chip_horizontal_padding);
        this.j = b(editText);
    }

    public static int b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect.bottom;
    }

    public static final boolean k(String str) {
        if (str == null) {
            return false;
        }
        return str.equals("@");
    }

    private final void m(int i, int i2) {
        zrv zrvVar = this.u;
        zrv zrvVar2 = zrv.ANDROID_CREATOR;
        zpt zptVar = this.n;
        if (zrvVar == zrvVar2) {
            zptVar.d(i, i2);
        } else {
            zptVar.b(i, i2);
        }
    }

    private final boolean n() {
        EditText editText = this.c;
        return editText.getSelectionStart() == editText.getSelectionEnd();
    }

    public final int a(int i) {
        return i / (true != this.v ? 2 : 4);
    }

    public final void c() {
        zpu zpuVar;
        if (this.h != null && (zpuVar = this.f) != null) {
            this.c.getText().removeSpan(this.h);
            zpuVar.f();
            if (this.i != null) {
                zpt zptVar = this.n;
                if (zptVar.e() == 3) {
                    zptVar.c();
                }
                ((zpb) this.i).h();
            }
        }
        this.h = null;
        d();
    }

    public final void d() {
        BottomSheetBehavior bottomSheetBehavior = this.e;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.I(5);
        }
        CoordinatorLayout coordinatorLayout = this.b;
        if (bottomSheetBehavior == null && !((zpa) coordinatorLayout).o()) {
            coordinatorLayout.setVisibility(8);
        }
        this.d.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e3, code lost:
    
        if (r2 == r6) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpr.e():void");
    }

    public final void f(boolean z) {
        int iA;
        boolean z2 = true;
        if (!this.g) {
            if (z) {
                d();
            } else {
                BottomSheetBehavior bottomSheetBehavior = this.e;
                if (bottomSheetBehavior != null && bottomSheetBehavior.F == 5) {
                    g();
                }
                CoordinatorLayout coordinatorLayout = this.b;
                if (bottomSheetBehavior == null && !((zpa) coordinatorLayout).o()) {
                    tym.h(coordinatorLayout, new tyl(twm.g(this.p) / (true != this.v ? 2 : 4), 1), ViewGroup.LayoutParams.class);
                    coordinatorLayout.setVisibility(0);
                }
                this.d.setVisibility(0);
                z2 = false;
            }
            this.y = z2;
            if (z2) {
                return;
            }
            if (this.n.e() == 2) {
                h();
                return;
            } else {
                i();
                return;
            }
        }
        this.y = z;
        if (z) {
            d();
            return;
        }
        BottomSheetBehavior bottomSheetBehavior2 = this.e;
        if (bottomSheetBehavior2 == null || bottomSheetBehavior2.F != 5) {
            if (this.n.e() != 1) {
                h();
                this.d.setVisibility(0);
                return;
            } else {
                i();
                this.d.setVisibility(0);
                return;
            }
        }
        zpt zptVar = this.n;
        int iE = zptVar.e() - 1;
        if (iE == 1) {
            h();
        } else if (iE == 2) {
            View viewC = this.z.c();
            if (viewC != null) {
                zpp zppVar = new zpp(this);
                NestedScrollView nestedScrollView = zptVar.a;
                if (nestedScrollView != null) {
                    iA = zpt.a(nestedScrollView);
                } else if (zptVar.b == null) {
                    return;
                } else {
                    iA = zpt.a(zptVar.b);
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(zpt.a(viewC), iA);
                valueAnimatorOfInt.addUpdateListener(new vmg(zptVar, viewC, 3));
                valueAnimatorOfInt.addListener(zppVar);
                valueAnimatorOfInt.start();
                return;
            }
            return;
        }
        g();
        this.d.setVisibility(0);
    }

    public final void g() {
        BottomSheetBehavior bottomSheetBehavior = this.e;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.I(4);
            j();
        }
    }

    public final void h() {
        int iC;
        Rect rect = new Rect();
        View viewC = this.z.c();
        if (viewC != null) {
            viewC.getGlobalVisibleRect(rect);
            Rect rect2 = new Rect();
            this.b.getGlobalVisibleRect(rect2);
            int i = rect2.bottom - rect.bottom;
            boolean z = this.g;
            if (z) {
                i -= this.t;
            } else {
                zpt zptVar = this.n;
                if (zptVar.e() == 2) {
                    iC = this.t;
                } else if (zptVar.e() == 3) {
                    iC = twm.c(this.c.getResources().getDisplayMetrics(), 2);
                }
                i += iC;
            }
            tym.h(this.d, new tyl(i, 1), ViewGroup.LayoutParams.class);
            BottomSheetBehavior bottomSheetBehavior = this.e;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.Q(i);
                if (z) {
                    bottomSheetBehavior.I(4);
                }
            }
        }
    }

    public final void i() {
        RecyclerView recyclerView;
        EditText editText = this.c;
        Layout layout = editText.getLayout();
        if (layout == null || (recyclerView = this.k) == null) {
            return;
        }
        Rect rect = new Rect();
        recyclerView.getGlobalVisibleRect(rect);
        int iA = (int) zoy.a(layout, editText);
        if (rect.top > iA || rect.top <= 10) {
            return;
        }
        m(iA, rect.top);
    }

    public final void j() {
        CoordinatorLayout coordinatorLayout;
        int height;
        if (this.g || (height = (coordinatorLayout = this.b).getHeight()) == 0) {
            return;
        }
        int iA = a(height) - this.w;
        Rect rect = new Rect();
        coordinatorLayout.getGlobalVisibleRect(rect);
        m(this.j + this.x, (rect.top + height) - iA);
    }

    public final void l(zpx zpxVar, boolean z) {
        zpq zpqVar = this.h;
        if (zpqVar == null || zpxVar == null) {
            return;
        }
        EditText editText = this.c;
        Editable text = editText.getText();
        int spanStart = text.getSpanStart(zpqVar);
        int spanEnd = text.getSpanEnd(zpqVar);
        c();
        if (z) {
            String strD = zpxVar.d();
            String strC = zpxVar.c();
            String strB = zpxVar.b();
            if (!strC.isEmpty()) {
                assz asszVar = this.l;
                strD = BidiFormatter.getInstance().unicodeWrap("\u2068" + asszVar.c + strC + (char) 8297);
            }
            String str = "\u200e" + strD + (char) 160;
            boolean z2 = ((StrikethroughSpan[]) editText.getText().getSpans(spanStart, spanStart, StrikethroughSpan.class)).length > 0;
            editText.getText().delete(spanStart, spanEnd);
            editText.getText().insert(spanStart, str);
            editText.getText().setSpan(new adta(strB, this.r, this.s, editText.getMeasuredWidth() * 0.9f, this.q, z2), spanStart, str.length() + spanStart, 33);
        } else {
            String strD2 = zpxVar.d();
            String strValueOf = String.valueOf(this.l.c);
            String strValueOf2 = String.valueOf(strD2);
            editText.getText().delete(spanStart, spanEnd);
            editText.getText().insert(spanStart, strValueOf.concat(strValueOf2));
        }
        editText.getText().insert(editText.getSelectionStart(), " ");
    }
}
