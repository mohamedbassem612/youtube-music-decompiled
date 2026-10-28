package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class vtg implements vul {
    private final avmb a;
    private final awkv b;
    private avmn c = null;
    private avmn d = null;
    public final awkv e;
    public final awkv f;
    public final awkv g;
    public final avlh h;
    public int i;
    private final vwt j;

    public vtg(avmb avmbVar, vwt vwtVar) {
        this.a = avmbVar;
        this.j = vwtVar;
        avmm avmmVar = new avmm();
        awku awkuVar = new awku(0);
        this.e = awkuVar;
        awku awkuVar2 = new awku(new Rect(0, 0, 0, 0));
        this.b = awkuVar2;
        awkv awkvVarAI = new awku(0).aI();
        this.f = awkvVarAI;
        awku awkuVar3 = new awku(0);
        this.g = awkuVar3;
        this.h = avlh.h(awkuVar, awkuVar2, awkvVarAI, awkuVar3, new vtf()).i(new tyc(new rtn(avmmVar, 19), 1)).i(new tyc(vwtVar.y(), 2));
    }

    @Override // defpackage.vul
    public /* synthetic */ int b() {
        throw null;
    }

    public abstract avlh e();

    @Override // defpackage.vul
    public /* synthetic */ avlh i() {
        throw null;
    }

    @Override // defpackage.vul
    public void j(View view, View view2, View view3) {
        tsp tspVar = new tsp(this, 12);
        vwt vwtVar = this.j;
        vwtVar.D(tspVar);
        vwtVar.D(new tsp(this, 13));
        vwtVar.D(new tsp(this, 14));
    }

    @Override // defpackage.vul
    public final int k() {
        return this.i;
    }

    public avlh l() {
        return avlh.G(0);
    }

    @Override // defpackage.vul
    public final avlh m() {
        return this.h;
    }

    @Override // defpackage.vul
    public final void n(View view) {
        Object obj = this.c;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
        View viewFindViewById = view.findViewById(R.id.engagement_panel_content);
        if (viewFindViewById != null) {
            avlh avlhVarG = tuk.g(viewFindViewById, this.a).g(avla.e);
            awkv awkvVar = this.b;
            this.c = avlhVarG.ak(new vpi(awkvVar, 8));
            awkvVar.kk(new Rect(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom()));
        }
    }

    @Override // defpackage.vul
    public final void o(View view) {
        Object obj = this.d;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
        avlh avlhVarG = tuk.g(view, this.a).g(avla.e);
        final int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.panel_header_non_content_height);
        this.d = avlhVarG.ak(new avni() { // from class: vte
            @Override // defpackage.avni
            public final void a(Object obj2) {
                this.a.e.kk(Integer.valueOf(((Rect) obj2).height() + dimensionPixelSize));
            }
        });
        this.e.kk(Integer.valueOf(view.getHeight() + dimensionPixelSize));
    }
}
