package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aetd {
    public final awku a = awku.aC(Boolean.FALSE);
    public final acxt b;
    public final acxn c;
    public final xgm d;
    public final abvk e;
    public final aetn f;
    public aoqm g;
    public ViewGroup h;
    private final Executor i;

    public aetd(acxt acxtVar, acxn acxnVar, xgm xgmVar, Executor executor, abvk abvkVar, aetn aetnVar) {
        this.b = acxtVar;
        this.c = acxnVar;
        this.d = xgmVar;
        this.i = executor;
        this.e = abvkVar;
        this.f = aetnVar;
    }

    public final void a() {
        this.b.b(null);
        this.f.a();
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.h.setVisibility(8);
            this.h = null;
        }
        this.a.kk(Boolean.FALSE);
        this.g = null;
    }

    public final void b() {
        ViewGroup viewGroup;
        aoqm aoqmVar = this.g;
        if (aoqmVar == null || (viewGroup = this.h) == null) {
            return;
        }
        this.i.execute(new adab(this, aoqmVar, viewGroup, 10));
    }
}
