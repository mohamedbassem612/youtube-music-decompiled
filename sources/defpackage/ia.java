package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ia {
    axy A;
    public CharSequence B;
    public CharSequence C;
    public ColorStateList D = null;
    public PorterDuff.Mode E = null;
    final /* synthetic */ ib F;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public String z;

    public ia(ib ibVar, Menu menu) {
        this.F = ibVar;
        this.a = menu;
        c();
    }

    public final SubMenu a() {
        this.h = true;
        SubMenu subMenuAddSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
        d(subMenuAddSubMenu.getItem());
        return subMenuAddSubMenu;
    }

    public final Object b(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.F.e.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: ".concat(str), e);
            return null;
        }
    }

    public final void c() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final void d(MenuItem menuItem) {
        boolean z;
        boolean z2 = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r > 0).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.z != null) {
            ib ibVar = this.F;
            Context context = ibVar.e;
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (ibVar.f == null) {
                ibVar.f = ibVar.a(context);
            }
            menuItem.setOnMenuItemClickListener(new hz(ibVar.f, this.z));
        }
        if (this.r >= 2) {
            if (menuItem instanceof is) {
                ((is) menuItem).j(true);
            } else if (menuItem instanceof ix) {
                ix ixVar = (ix) menuItem;
                try {
                    if (ixVar.d == null) {
                        ixVar.d = ixVar.c.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    ixVar.d.invoke(ixVar.c, Boolean.TRUE);
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        String str = this.x;
        if (str != null) {
            menuItem.setActionView((View) b(str, ib.a, this.F.c));
            z = true;
        } else {
            z = false;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        axy axyVar = this.A;
        if (axyVar != null) {
            azs.d(menuItem, axyVar);
        }
        CharSequence charSequence = this.B;
        boolean z3 = menuItem instanceof awj;
        if (z3) {
            ((awj) menuItem).b(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.C;
        if (z3) {
            ((awj) menuItem).c(charSequence2);
            z2 = true;
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((awj) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((awj) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.E;
        if (mode != null) {
            if (z2) {
                ((awj) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.D;
        if (colorStateList != null) {
            if (z2) {
                ((awj) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
