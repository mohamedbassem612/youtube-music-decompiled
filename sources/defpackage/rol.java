package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rol implements View.OnClickListener, adma {
    private final View a;
    private final RecyclerView b;
    private final rok c;
    private final rnp d;

    public rol(Context context, rnp rnpVar, ViewGroup viewGroup) {
        this.d = rnpVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.modal_other_methods_layout, viewGroup, false);
        this.a = viewInflate;
        rok rokVar = new rok(context, rnpVar);
        this.c = rokVar;
        viewInflate.findViewById(R.id.close_button).setOnClickListener(this);
        viewInflate.findViewById(R.id.cancel_button).setOnClickListener(this);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.methods_list);
        this.b = recyclerView;
        recyclerView.ad(rokVar);
        recyclerView.ah(new LinearLayoutManager(context));
        recyclerView.aJ(new lv(context, 1));
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        rok rokVar = this.c;
        rokVar.a = null;
        rokVar.jW();
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        Object obj2 = ((roq) obj).a;
        rok rokVar = this.c;
        rokVar.a = (int[]) obj2;
        rokVar.jW();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.d.b();
    }
}
