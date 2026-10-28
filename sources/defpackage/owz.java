package defpackage;

import android.app.Activity;
import android.app.RemoteAction;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class owz extends ActionMode.Callback2 {
    private final oxa a;

    public owz(oxa oxaVar) {
        this.a = oxaVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        Context contextL;
        int itemId = menuItem.getItemId();
        if (Build.VERSION.SDK_INT >= 28 && nuu.a(this.a, menuItem, actionMode)) {
            return true;
        }
        if (itemId >= 20000 && itemId < 21000) {
            Intent intent = menuItem.getIntent();
            if (intent != null && (contextL = this.a.l()) != null) {
                try {
                    contextL.startActivity(intent);
                } catch (RuntimeException unused) {
                }
            }
            actionMode.finish();
            return true;
        }
        if (itemId == 16908321) {
            this.a.n();
            actionMode.finish();
            return true;
        }
        if (itemId == 16908341) {
            this.a.p();
            actionMode.finish();
            return true;
        }
        if (itemId == 16908319) {
            this.a.o();
            return true;
        }
        if (itemId != R.id.elements_text_web_search) {
            return false;
        }
        this.a.q();
        actionMode.finish();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        menu.add(0, android.R.id.copy, 5, android.R.string.copy).setAlphabeticShortcut('c').setShowAsAction(2);
        menu.add(0, android.R.id.shareText, 7, R.string.elements_text_share).setShowAsAction(2);
        menu.add(0, android.R.id.selectAll, 8, android.R.string.selectAll).setShowAsAction(1);
        menu.add(0, R.id.elements_text_web_search, 13, R.string.elements_text_web_search).setShowAsAction(1);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        oxa oxaVar = this.a;
        boolean z = oxaVar instanceof oxe ? ((oxe) oxaVar).l : false;
        oxe oxeVar = (oxe) oxaVar;
        oxeVar.k = null;
        oxeVar.l = false;
        if (oxeVar.B != 1 || z) {
            return;
        }
        oxaVar.b();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        RectF rectF;
        oxe oxeVar = (oxe) this.a;
        owy owyVar = oxeVar.d;
        Layout layout = owyVar.m;
        if (layout == null || oxeVar.e == oxeVar.f) {
            rectF = oxeVar.j;
            if (rectF.isEmpty()) {
                rectF = null;
            }
        } else {
            if (oxeVar.i) {
                Path path = oxeVar.a;
                path.reset();
                layout.getSelectionPath(oxeVar.e, oxeVar.f, path);
                RectF rectF2 = oxeVar.b;
                rectF2.setEmpty();
                path.computeBounds(rectF2, true);
            } else {
                oxeVar.b.set(oxeVar.j);
            }
            rectF = oxeVar.b;
        }
        if (rectF != null) {
            int iA = (int) (owyVar.s + owyVar.a());
            int iD = (int) (owyVar.t + owyVar.d());
            rect.set(Math.round(rectF.left) + iA, Math.round(rectF.top) + iD, Math.round(rectF.right) + iA, Math.round(rectF.bottom) + iD);
        } else {
            rect.setEmpty();
        }
        Object obj = owyVar.q;
        if (obj instanceof View) {
            View view2 = (View) obj;
            if (Objects.equals(view2, view) || !(view instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
                if (parent.equals(viewGroup)) {
                    viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                    return;
                }
            }
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        menu.removeGroup(999);
        if (Build.VERSION.SDK_INT >= 28) {
            menu.removeItem(android.R.id.textAssist);
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            oxa oxaVar = this.a;
            Object obj = ((oxe) oxaVar).o;
            if (gp$$ExternalSyntheticApiModelOutline2.m821m(obj)) {
                List actions = gp$$ExternalSyntheticApiModelOutline2.m809m(obj).getActions();
                Context contextL = oxaVar.l();
                if (contextL != null) {
                    for (int i = 0; i < actions.size(); i++) {
                        RemoteAction remoteActionM806m = gp$$ExternalSyntheticApiModelOutline2.m806m(actions.get(i));
                        if (remoteActionM806m.isEnabled()) {
                            if (i == 0) {
                                MenuItem menuItemAdd = menu.add(0, android.R.id.textAssist, 0, remoteActionM806m.getTitle());
                                try {
                                    menuItemAdd.setIcon(remoteActionM806m.getIcon().loadDrawable(contextL));
                                } catch (RuntimeException unused) {
                                }
                                menuItemAdd.setShowAsAction(2);
                            } else {
                                MenuItem menuItemAdd2 = menu.add(999, i + 10000, i + 49, remoteActionM806m.getTitle());
                                try {
                                    menuItemAdd2.setIcon(remoteActionM806m.getIcon().loadDrawable(contextL));
                                } catch (RuntimeException unused2) {
                                }
                                menuItemAdd2.setShowAsAction(0);
                            }
                        }
                    }
                }
            }
        }
        menu.removeGroup(998);
        oxa oxaVar2 = this.a;
        Context contextL2 = oxaVar2.l();
        boolean z2 = true;
        if (contextL2 != null) {
            Context baseContext = contextL2;
            while (baseContext instanceof ContextWrapper) {
                if (baseContext instanceof Activity) {
                    PackageManager packageManager = contextL2.getPackageManager();
                    if (packageManager == null) {
                        break;
                    }
                    CharSequence charSequenceM = oxaVar2.m();
                    oxe oxeVar = (oxe) oxaVar2;
                    int i2 = oxeVar.e;
                    int i3 = oxeVar.f;
                    if (charSequenceM != null && i2 != i3) {
                        String string = charSequenceM.subSequence(Math.min(i2, i3), Math.max(i2, i3)).toString();
                        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                        String packageName = contextL2.getPackageName();
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < listQueryIntentActivities.size()) {
                            ResolveInfo resolveInfo = listQueryIntentActivities.get(i4);
                            if (packageName.equals(resolveInfo.activityInfo.packageName) || (resolveInfo.activityInfo.exported && (resolveInfo.activityInfo.permission == null || avg.c(contextL2, resolveInfo.activityInfo.permission) == 0))) {
                                CharSequence charSequenceLoadLabel = resolveInfo.loadLabel(packageManager);
                                Intent className = new Intent("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT", string).putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
                                MenuItem menuItemAdd3 = menu.add(998, i5 + 20000, i5 + 100, charSequenceLoadLabel);
                                z = false;
                                menuItemAdd3.setShowAsAction(0);
                                menuItemAdd3.setIntent(className);
                                try {
                                    Drawable drawableLoadIcon = resolveInfo.loadIcon(packageManager);
                                    if (drawableLoadIcon != null) {
                                        menuItemAdd3.setIcon(drawableLoadIcon);
                                    }
                                } catch (RuntimeException unused3) {
                                }
                                i5++;
                            }
                            i4++;
                            z2 = z2;
                            string = string;
                        }
                        break;
                    }
                    break;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                oxaVar2 = oxaVar2;
                z2 = z2;
            }
        }
        boolean z3 = z2;
        MenuItem menuItemFindItem = menu.findItem(android.R.id.selectAll);
        if (menuItemFindItem != null) {
            oxa oxaVar3 = this.a;
            CharSequence charSequenceM2 = oxaVar3.m();
            oxe oxeVar2 = (oxe) oxaVar3;
            int i6 = oxeVar2.e;
            int i7 = oxeVar2.f;
            if (charSequenceM2 == null || Math.min(i6, i7) != 0 || Math.max(i6, i7) != charSequenceM2.length()) {
                z = z3;
            }
            menuItemFindItem.setVisible(z);
        }
        return z3;
    }
}
