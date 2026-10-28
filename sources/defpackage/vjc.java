package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vjc implements View.OnClickListener {
    public final RecyclerView a;
    private final vje b;
    private vjb c;

    public vjc(vje vjeVar, RecyclerView recyclerView) {
        this.b = vjeVar;
        this.a = recyclerView;
    }

    public static void c(RecyclerView recyclerView, Context context) {
        recyclerView.r = true;
        recyclerView.ah(new LinearLayoutManager(context, 0, false));
        new vjd().f(recyclerView);
    }

    public final void a() {
        vis visVarB = this.b.b();
        visVarB.a = this;
        RecyclerView recyclerView = this.a;
        recyclerView.ad(visVarB);
        recyclerView.setVisibility(0);
    }

    public final void b(vjb vjbVar) {
        if (vjbVar != null) {
            vjbVar.setScaleX(1.33f);
            vjbVar.setScaleY(1.33f);
            if (!vjbVar.equals(this.c)) {
                this.b.c(vjbVar);
                vjb vjbVar2 = this.c;
                if (vjbVar2 != null) {
                    vjbVar2.setScaleX(1.0f);
                    this.c.setScaleY(1.0f);
                }
            }
            this.c = vjbVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view instanceof vjb) {
            b((vjb) view);
        }
    }
}
