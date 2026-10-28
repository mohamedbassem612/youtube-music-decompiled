package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jx extends ih {
    ju g;
    public int h;
    public jv i;
    public js j;
    final jw k;
    public koa l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private boolean q;
    private final SparseBooleanArray r;
    private qcb s;

    public jx(Context context) {
        super(context);
        this.r = new SparseBooleanArray();
        this.k = new jw(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ih
    public final View a(is isVar, View view, ViewGroup viewGroup) {
        View actionView = isVar.getActionView();
        if (actionView == null || isVar.m()) {
            jc jcVar = view instanceof jc ? (jc) view : (jc) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            jcVar.f(isVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) jcVar;
            actionMenuItemView.b = (ActionMenuView) this.f;
            qcb qcbVar = this.s;
            if (qcbVar == null) {
                qcbVar = new qcb(this);
                this.s = qcbVar;
            }
            actionMenuItemView.c = qcbVar;
            actionView = (View) jcVar;
        }
        actionView.setVisibility(true == isVar.p ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof ka)) {
            actionView.setLayoutParams(ActionMenuView.o(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.ih, defpackage.jb
    public final void b(Context context, iq iqVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = iqVar;
        Resources resources = context.getResources();
        if (!this.n) {
            this.m = true;
        }
        this.o = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.h = qa.B(context);
        int measuredWidth = this.o;
        if (this.m) {
            if (this.g == null) {
                ju juVar = new ju(this, this.a);
                this.g = juVar;
                juVar.measure(0, 0);
            }
            measuredWidth -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.p = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.ih, defpackage.jb
    public final void c(iq iqVar, boolean z) {
        n();
        ja jaVar = this.e;
        if (jaVar != null) {
            jaVar.a(iqVar, z);
        }
    }

    @Override // defpackage.ih, defpackage.jb
    public final boolean e() {
        ArrayList arrayListF;
        int size;
        boolean z;
        boolean z2;
        iq iqVar = this.c;
        View view = null;
        if (iqVar != null) {
            arrayListF = iqVar.f();
            size = arrayListF.size();
        } else {
            arrayListF = null;
            size = 0;
        }
        int i = this.h;
        int i2 = this.p;
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            z = true;
            if (i3 >= size) {
                break;
            }
            is isVar = (is) arrayListF.get(i3);
            if (isVar.r()) {
                i4++;
            } else if (isVar.q()) {
                i5++;
            } else {
                z3 = true;
            }
            if (this.q && isVar.p) {
                i = 0;
            }
            i3++;
        }
        if (this.m && (z3 || i5 + i4 > i)) {
            i--;
        }
        int i6 = i - i4;
        SparseBooleanArray sparseBooleanArray = this.r;
        sparseBooleanArray.clear();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            is isVar2 = (is) arrayListF.get(i7);
            if (isVar2.r()) {
                View viewA = a(isVar2, view, viewGroup);
                viewA.measure(0, 0);
                int measuredWidth = viewA.getMeasuredWidth();
                i2 -= measuredWidth;
                if (i8 == 0) {
                    i8 = measuredWidth;
                }
                int i9 = isVar2.b;
                if (i9 != 0) {
                    sparseBooleanArray.put(i9, z);
                }
                isVar2.k(z);
                z2 = z;
            } else if (isVar2.q()) {
                int i10 = isVar2.b;
                boolean z4 = sparseBooleanArray.get(i10);
                boolean z5 = ((i6 > 0 || z4) && i2 > 0) ? z : false;
                if (z5) {
                    View viewA2 = a(isVar2, view, viewGroup);
                    viewA2.measure(0, 0);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i2 -= measuredWidth2;
                    if (i8 == 0) {
                        i8 = measuredWidth2;
                    }
                    z5 = i2 + i8 > 0 ? z : false;
                }
                if (z5 && i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                } else if (z4) {
                    sparseBooleanArray.put(i10, false);
                    int i11 = 0;
                    while (i11 < i7) {
                        is isVar3 = (is) arrayListF.get(i11);
                        boolean z6 = z;
                        if (isVar3.b == i10) {
                            if (isVar3.o()) {
                                i6++;
                            }
                            isVar3.k(false);
                        }
                        i11++;
                        z = z6;
                    }
                }
                z2 = z;
                if (z5) {
                    i6--;
                }
                isVar2.k(z5);
            } else {
                z2 = z;
                isVar2.k(false);
            }
            i7++;
            z = z2;
            view = null;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ih, defpackage.jb
    public final boolean f(jj jjVar) {
        iq iqVar;
        boolean z = false;
        if (!jjVar.hasVisibleItems()) {
            return false;
        }
        jj jjVar2 = jjVar;
        while (true) {
            iq iqVar2 = jjVar2.k;
            if (iqVar2 == this.c) {
                break;
            }
            jjVar2 = (jj) iqVar2;
        }
        is isVar = jjVar2.l;
        ViewGroup viewGroup = (ViewGroup) this.f;
        ?? r3 = 0;
        r3 = 0;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                KeyEvent.Callback childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof jc) && ((jc) childAt).a() == isVar) {
                    r3 = childAt;
                    break;
                }
            }
        }
        if (r3 == 0) {
            return false;
        }
        is isVar2 = jjVar.l;
        int size = jjVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = jjVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        js jsVar = new js(this, this.b, jjVar, r3);
        this.j = jsVar;
        jsVar.d(z);
        if (!this.j.h()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        ja jaVar = this.e;
        if (jaVar != null) {
            if (jjVar == null) {
                iqVar = this.c;
            }
            jaVar.b(iqVar);
        }
        iqVar = jjVar;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fc  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ih, defpackage.jb
    public final void i() {
        ju juVar;
        Object parent;
        Object obj;
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f;
        boolean z = false;
        if (viewGroup != null) {
            iq iqVar = this.c;
            if (iqVar != null) {
                iqVar.k();
                ArrayList arrayListF = this.c.f();
                int size = arrayListF.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    is isVar = (is) arrayListF.get(i2);
                    if (isVar.o()) {
                        View childAt = viewGroup.getChildAt(i);
                        is isVarA = childAt instanceof jc ? ((jc) childAt).a() : null;
                        View viewA = a(isVar, childAt, viewGroup);
                        if (isVar != isVarA) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.g) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f).requestLayout();
        iq iqVar2 = this.c;
        if (iqVar2 != null) {
            iqVar2.k();
            ArrayList arrayList = iqVar2.d;
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                axy axyVar = ((is) arrayList.get(i3)).o;
            }
        }
        iq iqVar3 = this.c;
        ArrayList arrayListE = iqVar3 != null ? iqVar3.e() : null;
        if (!this.m || arrayListE == null) {
            juVar = this.g;
            if (juVar != null) {
                parent = juVar.getParent();
                obj = this.f;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.g);
                }
            }
        } else {
            int size3 = arrayListE.size();
            if (size3 == 1) {
                z = !((is) arrayListE.get(0)).p;
            } else if (size3 > 0) {
                z = true;
            }
            if (z) {
                ju juVar2 = this.g;
                if (juVar2 == null) {
                    ju juVar3 = new ju(this, this.a);
                    this.g = juVar3;
                    juVar2 = juVar3;
                }
                ViewGroup viewGroup3 = (ViewGroup) juVar2.getParent();
                if (viewGroup3 != this.f) {
                    if (viewGroup3 != null) {
                        viewGroup3.removeView(this.g);
                    }
                    ActionMenuView actionMenuView = (ActionMenuView) this.f;
                    ju juVar4 = this.g;
                    ka kaVar = new ka();
                    kaVar.gravity = 16;
                    kaVar.a = true;
                    actionMenuView.addView(juVar4, kaVar);
                }
            } else {
                juVar = this.g;
                if (juVar != null) {
                    parent = juVar.getParent();
                    obj = this.f;
                    if (parent == obj) {
                        ((ViewGroup) obj).removeView(this.g);
                    }
                }
            }
        }
        ((ActionMenuView) this.f).b = this.m;
    }

    public final void j(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean k() {
        Object obj;
        koa koaVar = this.l;
        if (koaVar != null && (obj = this.f) != null) {
            ((View) obj).removeCallbacks(koaVar);
            this.l = null;
            return true;
        }
        jv jvVar = this.i;
        if (jvVar == null) {
            return false;
        }
        jvVar.b();
        return true;
    }

    public final boolean l() {
        jv jvVar = this.i;
        return jvVar != null && jvVar.g();
    }

    public final boolean m() {
        iq iqVar;
        if (!this.m || l() || (iqVar = this.c) == null || this.f == null || this.l != null || iqVar.e().isEmpty()) {
            return false;
        }
        this.l = new koa(this, new jv(this, this.b, this.c, this.g), 1);
        ((View) this.f).post(this.l);
        return true;
    }

    public final void n() {
        k();
        q();
    }

    public final void o() {
        this.q = true;
    }

    public final void p() {
        this.m = true;
        this.n = true;
    }

    public final void q() {
        js jsVar = this.j;
        if (jsVar != null) {
            jsVar.b();
        }
    }
}
