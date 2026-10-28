package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class is implements awj {
    private View B;
    private MenuItem.OnActionExpandListener C;
    public final int a;
    public final int b;
    public final int c;
    public CharSequence d;
    public Intent e;
    public char f;
    public char h;
    public final iq j;
    public jj k;
    public CharSequence l;
    public CharSequence m;
    public int n;
    public axy o;
    private final int q;
    private CharSequence r;
    private Drawable s;
    private MenuItem.OnMenuItemClickListener u;
    public int g = SemanticState.Obscured;
    public int i = SemanticState.Obscured;
    private int t = 0;
    private ColorStateList v = null;
    private PorterDuff.Mode w = null;
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;
    private int A = 16;
    public boolean p = false;

    public is(iq iqVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.j = iqVar;
        this.a = i2;
        this.b = i;
        this.q = i3;
        this.c = i4;
        this.d = charSequence;
        this.n = i5;
    }

    public static void g(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    private final Drawable v(Drawable drawable) {
        if (drawable != null && this.z && (this.x || this.y)) {
            drawable = drawable.mutate();
            if (this.x) {
                drawable.setTintList(this.v);
            }
            if (this.y) {
                drawable.setTintMode(this.w);
            }
            this.z = false;
        }
        return drawable;
    }

    @Override // defpackage.awj
    public final axy a() {
        return this.o;
    }

    @Override // defpackage.awj
    public final void b(CharSequence charSequence) {
        this.l = charSequence;
        this.j.l(false);
    }

    @Override // defpackage.awj
    public final void c(CharSequence charSequence) {
        this.m = charSequence;
        this.j.l(false);
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.n & 8) == 0) {
            return false;
        }
        if (this.B == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.j.t(this);
        }
        return false;
    }

    @Override // defpackage.awj
    public final void d(axy axyVar) {
        axy axyVar2 = this.o;
        if (axyVar2 != null) {
            axyVar2.d = null;
        }
        this.B = null;
        this.o = axyVar;
        this.j.l(true);
        axy axyVar3 = this.o;
        if (axyVar3 != null) {
            axyVar3.h(new hhb(this));
        }
    }

    public final char e() {
        return this.j.x() ? this.h : this.f;
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final boolean expandActionView() {
        MenuItem.OnActionExpandListener onActionExpandListener;
        if (m() && ((onActionExpandListener = this.C) == null || onActionExpandListener.onMenuItemActionExpand(this))) {
            return this.j.v(this);
        }
        return false;
    }

    public final CharSequence f(jc jcVar) {
        return jcVar.e() ? getTitleCondensed() : this.d;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final View getActionView() {
        View view = this.B;
        if (view != null) {
            return view;
        }
        axy axyVar = this.o;
        if (axyVar == null) {
            return null;
        }
        View viewB = axyVar.b(this);
        this.B = viewB;
        return viewB;
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.h;
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.l;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return v(drawable);
        }
        int i = this.t;
        if (i == 0) {
            return null;
        }
        Drawable drawableD = dl.d(this.j.a, i);
        this.t = 0;
        this.s = drawableD;
        return v(drawableD);
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.v;
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.w;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.e;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.k;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.r;
        return charSequence == null ? this.d : charSequence;
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.m;
    }

    public final void h(boolean z) {
        this.p = z;
        this.j.l(false);
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.k != null;
    }

    final void i(boolean z) {
        int i = this.A;
        int i2 = (i & (-3)) | (true != z ? 0 : 2);
        this.A = i2;
        if (i != i2) {
            this.j.l(false);
        }
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.p;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.A & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.A & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.A & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        axy axyVar = this.o;
        if (axyVar == null || !axyVar.g()) {
            if ((this.A & 8) == 0) {
                return true;
            }
        } else if ((this.A & 8) == 0 && this.o.e()) {
            return true;
        }
        return false;
    }

    public final void j(boolean z) {
        this.A = (this.A & (-5)) | (true != z ? 0 : 4);
    }

    public final void k(boolean z) {
        int i = this.A;
        this.A = z ? i | 32 : i & (-33);
    }

    public final void l(jj jjVar) {
        this.k = jjVar;
        jjVar.setHeaderTitle(this.d);
    }

    public final boolean m() {
        axy axyVar;
        if ((this.n & 8) == 0) {
            return false;
        }
        View viewB = this.B;
        if (viewB == null && (axyVar = this.o) != null) {
            viewB = axyVar.b(this);
            this.B = viewB;
        }
        return viewB != null;
    }

    public final boolean n() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.u;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        iq iqVar = this.j;
        if (iqVar.u(iqVar, this)) {
            return true;
        }
        Intent intent = this.e;
        if (intent != null) {
            try {
                iqVar.a.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        axy axyVar = this.o;
        return axyVar != null && axyVar.f();
    }

    public final boolean o() {
        return (this.A & 32) == 32;
    }

    public final boolean p() {
        return (this.A & 4) != 0;
    }

    public final boolean q() {
        return (this.n & 1) == 1;
    }

    public final boolean r() {
        return (this.n & 2) == 2;
    }

    final boolean s(boolean z) {
        int i = this.A;
        int i2 = (i & (-9)) | (true != z ? 8 : 0);
        this.A = i2;
        return i != i2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.j.a;
        u(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.h != c || this.i != i) {
            this.h = Character.toLowerCase(c);
            this.i = KeyEvent.normalizeMetaState(i);
            this.j.l(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.A;
        int i2 = (i & (-2)) | (z ? 1 : 0);
        this.A = i2 == true ? 1 : 0;
        if (i != i2) {
            this.j.l(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.A & 4) != 0) {
            iq iqVar = this.j;
            int i = this.b;
            ArrayList arrayList = iqVar.c;
            int size = arrayList.size();
            iqVar.s();
            for (int i2 = 0; i2 < size; i2++) {
                is isVar = (is) arrayList.get(i2);
                if (isVar.b == i && isVar.p() && isVar.isCheckable()) {
                    isVar.i(isVar == this);
                }
            }
            iqVar.r();
        } else {
            i(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        b(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.A;
        this.A = z ? i | 16 : i & (-17);
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.s = null;
        this.t = i;
        this.z = true;
        this.j.l(false);
        return this;
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.v = colorStateList;
        this.x = true;
        this.z = true;
        this.j.l(false);
        return this;
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.w = mode;
        this.y = true;
        this.z = true;
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.e = intent;
        return this;
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f != c || this.g != i) {
            this.f = c;
            this.g = KeyEvent.normalizeMetaState(i);
            this.j.l(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.u = onMenuItemClickListener;
        return this;
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f = c;
        this.g = KeyEvent.normalizeMetaState(i);
        this.h = Character.toLowerCase(c2);
        this.i = KeyEvent.normalizeMetaState(i2);
        this.j.l(false);
        return this;
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.n = i;
        this.j.A();
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        this.j.l(false);
        jj jjVar = this.k;
        if (jjVar != null) {
            jjVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.r = charSequence;
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        c(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (s(z)) {
            this.j.B();
        }
        return this;
    }

    public final boolean t() {
        return this.j.y() && e() != 0;
    }

    public final String toString() {
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final void u(View view) {
        int i;
        this.B = view;
        this.o = null;
        if (view != null && view.getId() == -1 && (i = this.a) > 0) {
            view.setId(i);
        }
        this.j.A();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.t = 0;
        this.s = drawable;
        this.z = true;
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.j.a.getString(i));
        return this;
    }

    @Override // defpackage.awj, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        u(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f != c) {
            this.f = c;
            this.j.l(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.h != c) {
            this.h = Character.toLowerCase(c);
            this.j.l(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f = c;
        this.h = Character.toLowerCase(c2);
        this.j.l(false);
        return this;
    }
}
