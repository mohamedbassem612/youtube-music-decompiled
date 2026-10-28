package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aupa extends ContextWrapper {
    public cc a;
    public LayoutInflater b;
    public LayoutInflater c;
    private final boe d;

    /* JADX WARN: Illegal instructions before constructor call */
    public aupa(LayoutInflater layoutInflater, cc ccVar) {
        Context context;
        if (layoutInflater == null || (context = layoutInflater.getContext()) == null) {
            throw null;
        }
        super(context);
        pz pzVar = new pz(this, 6, null);
        this.d = pzVar;
        this.b = layoutInflater;
        this.a = ccVar;
        ccVar.getLifecycle().b(pzVar);
    }

    public final cc a() {
        a.aP(this.a, "The fragment has already been destroyed.");
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflaterCloneInContext = this.c;
        if (layoutInflaterCloneInContext == null) {
            LayoutInflater layoutInflater = this.b;
            if (layoutInflater == null) {
                layoutInflater = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                this.b = layoutInflater;
            }
            layoutInflaterCloneInContext = layoutInflater.cloneInContext(this);
            this.c = layoutInflaterCloneInContext;
        }
        return layoutInflaterCloneInContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aupa(Context context, cc ccVar) {
        super(context);
        context.getClass();
        pz pzVar = new pz(this, 6, null);
        this.d = pzVar;
        this.b = null;
        this.a = ccVar;
        ccVar.getLifecycle().b(pzVar);
    }
}
