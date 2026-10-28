package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hx implements hu {
    final ActionMode.Callback a;
    final Context b;
    final ArrayList c = new ArrayList();
    final aha d = new aha(0);

    public hx(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    private final Menu f(Menu menu) {
        aha ahaVar = this.d;
        Menu menu2 = (Menu) ahaVar.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        je jeVar = new je(this.b, menu);
        ahaVar.put(menu, jeVar);
        return jeVar;
    }

    @Override // defpackage.hu
    public final void a(hv hvVar) {
        this.a.onDestroyActionMode(e(hvVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hu
    public final boolean b(hv hvVar, MenuItem menuItem) {
        return this.a.onActionItemClicked(e(hvVar), new ix(this.b, menuItem));
    }

    @Override // defpackage.hu
    public final boolean c(hv hvVar, Menu menu) {
        return this.a.onCreateActionMode(e(hvVar), f(menu));
    }

    @Override // defpackage.hu
    public final boolean d(hv hvVar, Menu menu) {
        return this.a.onPrepareActionMode(e(hvVar), f(menu));
    }

    public final ActionMode e(hv hvVar) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hy hyVar = (hy) arrayList.get(i);
            if (hyVar != null && hyVar.b == hvVar) {
                return hyVar;
            }
        }
        hy hyVar2 = new hy(this.b, hvVar);
        arrayList.add(hyVar2);
        return hyVar2;
    }
}
