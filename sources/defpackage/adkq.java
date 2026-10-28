package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class adkq implements adma {
    private final admd a;
    private final adkv b;
    private final ViewGroup c;

    public adkq(Context context, admd admdVar, admh admhVar) {
        this.a = admdVar;
        ViewGroup viewGroupD = d(context);
        this.c = viewGroupD;
        this.b = e(context, admhVar);
        admdVar.c(viewGroupD);
    }

    private final void i(List list) {
        View viewA = a();
        viewA.getClass();
        viewA.setTag(R.id.grid_row_cells_tag, list);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a.a();
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.b.c(this.c);
        i(null);
    }

    protected abstract ViewGroup d(Context context);

    protected abstract adkv e(Context context, admh admhVar);

    protected void g(adly adlyVar, adla adlaVar) {
        throw null;
    }

    protected abstract void h(View view, adla adlaVar, int i);

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        adla adlaVar = (adla) obj;
        ViewGroup viewGroup = this.c;
        viewGroup.removeAllViews();
        int i = adlaVar.a;
        f(i, adlyVar, adlaVar);
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            Object objA = adlaVar.a(i2);
            adkv adkvVar = this.b;
            adly adlyVarB = adkvVar.b(adlyVar);
            adlyVarB.f("rowData", new adlh(i2, i, adlyVar.b("grid_row_presenter_horizontal_row_padding", adlaVar.c), adlyVar.b("grid_row_presenter_horizontal_row_padding", adlaVar.d), adlaVar.e));
            View viewD = adkvVar.d(adlyVarB, objA, viewGroup);
            h(viewD, adlaVar, i2);
            ViewGroup viewGroup2 = (ViewGroup) viewD;
            if (viewGroup2.getChildCount() > 0) {
                viewD = viewGroup2.getChildAt(0);
            }
            arrayList.add(viewD);
        }
        g(adlyVar, adlaVar);
        i(arrayList);
        this.a.e(adlyVar);
    }

    protected void f(int i, adly adlyVar, adla adlaVar) {
    }
}
