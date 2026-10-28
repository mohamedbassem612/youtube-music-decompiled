package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfz implements nrw {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
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
    public static boolean d(String str, View view) {
        ooo oooVar;
        int iA;
        opl oplVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(view);
        while (true) {
            if (arrayDeque.isEmpty()) {
                return false;
            }
            View view2 = (View) arrayDeque.pollFirst();
            if (view2 != null) {
                if (view2 instanceof ooy) {
                    ooy ooyVar = (ooy) view2;
                    opa opaVar = ooyVar.j;
                    if (opaVar != 0 && (oplVar = ooyVar.b) != null) {
                        ?? C = oplVar.c();
                        ElementsServices elementsServices = ooyVar.a;
                        if (opaVar.d) {
                            opaVar.a.removeCallbacks(opaVar.c);
                            opaVar.d = false;
                            opaVar.b = SystemClock.uptimeMillis();
                            if (rbm.i(elementsServices) != null) {
                                opaVar.b(C);
                            }
                        }
                    }
                    axx axxVarC = bac.c(ooyVar);
                    if ((axxVarC instanceof ooo) && (iA = (oooVar = (ooo) axxVarC).a(str)) != -1) {
                        return oooVar.b(iA);
                    }
                }
                if (str.equals(view2.getTag(R.id.elements_accessibility_view_tag_id))) {
                    view2.performAccessibilityAction(64, null);
                    return true;
                }
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        arrayDeque.add(viewGroup.getChildAt(i));
                    }
                }
            }
        }
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return asqn.b;
    }

    @Override // defpackage.nrx
    public final aslz b() {
        return rpi.A();
    }

    @Override // defpackage.nrw
    public final /* bridge */ /* synthetic */ avlb c(Object obj, nrv nrvVar) {
        asqn asqnVar = (asqn) obj;
        View viewC = nrvVar.c();
        if (viewC == null) {
            return avlb.m(new IllegalStateException("Unable to locate the component's view."));
        }
        if ((asqnVar.c & 1) == 0 || asqnVar.d.isEmpty()) {
            return avlb.m(new IllegalArgumentException("No accessibility identifier has been provided."));
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) viewC.getContext().getApplicationContext().getSystemService("accessibility");
        return (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) ? avlb.e() : avlb.n(new hmg(asqnVar, viewC, 4, null));
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb e(mew mewVar, nrv nrvVar) {
        return nqw.a(this, mewVar, nrvVar);
    }
}
