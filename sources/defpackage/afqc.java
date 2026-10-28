package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afqc implements auph {
    private volatile Object a;
    private final Object b = new Object();
    private final View c;

    public afqc(View view) {
        this.c = view;
    }

    private final Context a(Class cls) {
        View view = this.c;
        Context contextB = b(view.getContext(), cls);
        ahno.R(contextB != b(contextB.getApplicationContext(), auph.class), "%s, Sting view cannot be created using the application context. Use a Sting Fragment or Activity context.", view.getClass());
        return contextB;
    }

    private static Context b(Context context, Class cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        Object gkmVar;
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    Context contextA = a(aupa.class);
                    if (contextA instanceof afpz) {
                        gjb gjbVarH = ((afqa) ((auph) ((aupa) contextA).a()).generatedComponent()).H();
                        gjbVarH.b = this.c;
                        atqq.b(gjbVarH.b, View.class);
                        gkmVar = new gki(gjbVarH.a, gjbVarH.c, gjbVarH.d, gjbVarH.b);
                    } else {
                        if (!(contextA instanceof aupa)) {
                            Context contextA2 = a(auph.class);
                            View view = this.c;
                            ahno.U(!(contextA2 instanceof auph), "%s, @WithFragmentBindings Sting view must be attached to an @Sting Fragment. Was attached to context: %s", view.getClass(), contextA2.getClass().getName());
                            throw new IllegalStateException(String.format("%s, Sting view must be attached to an @Sting Fragment or Activity. Was attached to context: %s", view.getClass(), contextA2.getClass().getName()));
                        }
                        View view2 = this.c;
                        ahno.R(false, "%s, Account views may only attach to account fragments.", view2.getClass());
                        aeu aeuVarS = ((afqb) ((auph) ((aupa) contextA).a()).generatedComponent()).s();
                        aeuVarS.a = view2;
                        atqq.b(aeuVarS.a, View.class);
                        gkmVar = new gkm();
                    }
                    this.a = gkmVar;
                }
            }
        }
        return this.a;
    }
}
