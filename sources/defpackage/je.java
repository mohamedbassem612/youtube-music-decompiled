package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class je extends ii implements Menu {
    private final awi c;

    public je(Context context, awi awiVar) {
        super(context);
        this.c = awiVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(((iq) this.c).c(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.c.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            for (int i5 = 0; i5 < menuItemArr2.length; i5++) {
                menuItemArr[i5] = a(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return ((iq) this.c).addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        aha ahaVar = this.b;
        if (ahaVar != null) {
            ahaVar.clear();
        }
        this.c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        ((iq) this.c).i(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return a(this.c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return a(this.c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.c.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.c.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (this.b != null) {
            int i2 = 0;
            while (true) {
                aha ahaVar = this.b;
                if (i2 >= ahaVar.d) {
                    break;
                }
                if (((awj) ahaVar.d(i2)).getGroupId() == i) {
                    this.b.e(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (this.b != null) {
            int i2 = 0;
            while (true) {
                aha ahaVar = this.b;
                if (i2 >= ahaVar.d) {
                    break;
                }
                if (((awj) ahaVar.d(i2)).getItemId() == i) {
                    this.b.e(i2);
                    break;
                }
                i2++;
            }
        }
        this.c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.c.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.c.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.c.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.c.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.c.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.c.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(this.c.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(((iq) this.c).c(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(this.c.add(i));
    }
}
