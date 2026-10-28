package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aupc implements auph {
    private static final agrf a = agrf.h("dagger/hilt/android/internal/managers/ViewComponentManager");
    private volatile Object b;
    private final Object c = new Object();
    private final View d;

    public aupc(View view) {
        this.d = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.auph
    public final Object generatedComponent() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    View view = this.d;
                    Context context = view.getContext();
                    while ((context instanceof ContextWrapper) && !auph.class.isInstance(context)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (context == a.aJ(context.getApplicationContext())) {
                        throw new IllegalStateException(String.format("%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", view.getClass()));
                    }
                    if (!(context instanceof auph)) {
                        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", view.getClass()));
                    }
                    auph auphVar = (auph) context;
                    if (!(auphVar instanceof aupi)) {
                        agrf agrfVar = a;
                        ((agrc) ((agrc) agrfVar.b()).k("dagger/hilt/android/internal/managers/ViewComponentManager", "logNonHiltActivity", 127, "ViewComponentManager.java")).B("%s not attached to an @AndroidEntryPoint Activity. componentManager: %s", new qdv(view.getClass()), auphVar == null ? new qdv("null") : new qdv(auphVar.getClass()));
                        Context context2 = view.getContext();
                        int i = 0;
                        while (context2 instanceof ContextWrapper) {
                            ((agrc) ((agrc) agrfVar.b()).k("dagger/hilt/android/internal/managers/ViewComponentManager", "logNonHiltActivity", 136, "ViewComponentManager.java")).B("context[%s]: %s", new qdq(i), new qdv(context2.getClass()));
                            context2 = ((ContextWrapper) context2).getBaseContext();
                            i++;
                            if (i >= 100) {
                                ((agrc) ((agrc) agrfVar.b()).k("dagger/hilt/android/internal/managers/ViewComponentManager", "logNonHiltActivity", 143, "ViewComponentManager.java")).t("Reached max context depth");
                                break;
                            }
                        }
                    }
                    atqq.c(auphVar instanceof aupi, "%s, Hilt view must be attached to an @AndroidEntryPoint Activity.", view.getClass());
                    auph auphVarComponentManager = ((aupi) auphVar).componentManager();
                    atqq.c(auphVarComponentManager instanceof auof, "%s, Hilt view must be attached to an @AndroidEntryPoint Activity.", view.getClass());
                    afwv afwvVarM = ((aupb) atqp.a(((auof) auphVarComponentManager).f(), aupb.class)).m();
                    afwvVarM.b = view;
                    atqq.b(afwvVarM.b, View.class);
                    this.b = new gkj((ght) afwvVarM.a, (ghj) afwvVarM.c);
                }
            }
        }
        return this.b;
    }
}
