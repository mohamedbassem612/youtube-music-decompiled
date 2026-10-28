package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class auom implements auph {
    private volatile Object a;
    private final Object b = new Object();
    private final cc c;
    private final auoq d;

    public auom(cc ccVar) {
        this.c = ccVar;
        this.d = new auoq(ccVar);
    }

    public static final Context d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static final void f(cc ccVar) {
        if (ccVar.getArguments() == null) {
            ccVar.setArguments(new Bundle());
        }
    }

    protected Object a() {
        gkd gkdVarF;
        cc ccVar = this.c;
        if (ccVar.getHost() == null) {
            throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
        }
        atqq.c(ccVar.getHost() instanceof aupi, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", ccVar.getHost().getClass());
        c(ccVar);
        for (cc parentFragment = ccVar; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof aupi) {
                auph auphVarComponentManager = ((aupi) parentFragment).componentManager();
                if (auphVarComponentManager instanceof auof) {
                    gkdVarF = ((auof) auphVarComponentManager).f();
                    gig gigVarK = ((auol) atqp.a(gkdVarF, auol.class)).k();
                    gigVarK.d = this.d.generatedComponent();
                    gigVarK.c = ccVar;
                    atqq.b(gigVarK.c, cc.class);
                    atqq.b(gigVarK.d, aunu.class);
                    return new gjz(gigVarK.a, gigVarK.b, gigVarK.f, gigVarK.c);
                }
            }
        }
        atqq.c(ccVar.getHost() instanceof aupi, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", ccVar.getHost().getClass());
        gkdVarF = ((auof) ((aupi) ccVar.getHost()).componentManager()).f();
        gig gigVarK2 = ((auol) atqp.a(gkdVarF, auol.class)).k();
        gigVarK2.d = this.d.generatedComponent();
        gigVarK2.c = ccVar;
        atqq.b(gigVarK2.c, cc.class);
        atqq.b(gigVarK2.d, aunu.class);
        return new gjz(gigVarK2.a, gigVarK2.b, gigVarK2.f, gigVarK2.c);
    }

    public final void e() {
        cc ccVar = this.c;
        if (ccVar.getHost() == null) {
            throw new NullPointerException("Hilt Fragments must be attached before initializing saved state.");
        }
        atqq.c(ccVar.getHost() instanceof auph, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", ccVar.getHost().getClass());
        cc ccVar2 = this.d.a;
        auor auorVar = ((auoo) new bpn(ccVar2, new auoa(ccVar2, 3)).a(auoo.class)).b;
        if (auorVar.c()) {
            auorVar.b(ccVar.getDefaultViewModelCreationExtras());
        }
        ccVar.getLifecycle().b(new afns(auorVar, 3));
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = a();
                }
            }
        }
        return this.a;
    }

    protected void c(cc ccVar) {
    }
}
