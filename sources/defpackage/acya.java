package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.PopupWindow;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acya implements PopupWindow.OnDismissListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public acya(iz izVar, int i) {
        this.$cid = i;
        this.a = izVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [adzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [adzd, java.lang.Object] */
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
    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        int i = this.$cid;
        if (i == 0) {
            acyb acybVar = (acyb) this.a;
            if (acybVar.i) {
                return;
            }
            PopupWindow.OnDismissListener onDismissListener = acybVar.k;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
            avmm avmmVar = acybVar.l;
            if (avmmVar != null) {
                avmmVar.dispose();
                acybVar.l = null;
            }
            aebp aebpVar = acybVar.g;
            RecyclerView recyclerView = acybVar.f;
            if (aebpVar != null && recyclerView != null) {
                aebpVar.b(recyclerView);
                if (acybVar.m.l(301, 45702412L, false)) {
                    aebpVar.f();
                }
                acybVar.g = null;
            }
            acybVar.f = null;
            return;
        }
        if (i == 1) {
            ((iz) this.a).c();
            return;
        }
        if (i == 2) {
            acyj acyjVar = (acyj) this.a;
            if (acyjVar.c != null) {
                acyjVar.c = null;
                acyjVar.a.b();
                return;
            }
            return;
        }
        if (i == 3) {
            ?? r7 = this.a;
            adzb adzbVar = (adzb) r7;
            adzbVar.d = null;
            ci ciVar = adzbVar.g;
            if (ciVar != 0) {
                ciVar.ad(r7);
            }
            PopupWindow.OnDismissListener onDismissListener2 = adzbVar.f;
            if (onDismissListener2 != null) {
                onDismissListener2.onDismiss();
            }
            Iterator it = adzbVar.a.iterator();
            while (it.hasNext()) {
                ((adzr) it.next()).c();
            }
            return;
        }
        ?? r8 = this.a;
        if (i != 4) {
            ((aefr) r8).b(0);
            return;
        }
        adze adzeVar = (adze) r8;
        adzeVar.h();
        adzeVar.c = null;
        adzeVar.d = null;
        adzeVar.n.ad(r8);
        PopupWindow.OnDismissListener onDismissListener3 = adzeVar.b;
        if (onDismissListener3 != null) {
            onDismissListener3.onDismiss();
        }
        CopyOnWriteArraySet copyOnWriteArraySet = adzeVar.a;
        Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            ((adzr) it2.next()).c();
        }
        copyOnWriteArraySet.clear();
    }

    public /* synthetic */ acya(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
