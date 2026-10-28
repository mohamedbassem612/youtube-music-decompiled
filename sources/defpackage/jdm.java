package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import androidx.car.app.model.Alert;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jdm extends admr {
    public final LinearLayout a;
    public final adku b;
    public final admo c;
    public final RecyclerView d;
    public final jcc e;
    public final Animation f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    private final admd k;
    private final View l;
    private final jak m;
    private final adlk n;

    public jdm(Context context, jer jerVar, ahek ahekVar, jcc jccVar) {
        jdw jdwVar = new jdw(context);
        this.k = jdwVar;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.music_expandable_shelf, (ViewGroup) null);
        this.a = linearLayout;
        jak jakVar = new jak();
        this.m = jakVar;
        jakVar.b(new jdk(this, 0));
        adku adkuVar = new adku(jakVar);
        this.b = adkuVar;
        this.e = jccVar;
        this.l = jccVar.a();
        RecyclerView recyclerView = (RecyclerView) linearLayout.findViewById(R.id.expandable_list);
        this.d = recyclerView;
        recyclerView.ah(new LinearLayoutManager(context));
        recyclerView.af(null);
        admo admoVarD = ahekVar.d(jerVar.a);
        this.c = admoVarD;
        adlk adlkVar = new adlk(xgn.l, 0);
        this.n = adlkVar;
        admoVarD.jR(adlkVar);
        admoVarD.D(adkuVar, null);
        recyclerView.ad(admoVarD);
        jba jbaVar = jerVar.a;
        this.g = false;
        jdl jdlVar = new jdl(this);
        jdlVar.setAnimationListener(new dfy(this, 4));
        this.f = jdlVar;
        jdwVar.c(linearLayout);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.k).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.m.clear();
        this.g = false;
        this.e.b(admhVar);
        this.a.removeView(this.l);
    }

    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        anoh anohVar = (anoh) obj;
        this.n.a = adlyVar.b;
        int i = (int) anohVar.e;
        RecyclerView recyclerView = this.d;
        recyclerView.setBackgroundColor(i);
        for (apji apjiVar : anohVar.d) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(anzj.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                jak jakVar = this.m;
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anzj.a);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                jakVar.add(objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        jak jakVar2 = this.m;
        jakVar2.i((tbk) jeo.b(adlyVar).orElse(null));
        adku adkuVar = this.b;
        adkuVar.b(Alert.DURATION_SHOW_INDEFINITELY);
        recyclerView.measure(-1, -2);
        this.i = recyclerView.getMeasuredHeight();
        int i2 = anohVar.c;
        if (i2 <= 0 || i2 >= jakVar2.size()) {
            this.j = Alert.DURATION_SHOW_INDEFINITELY;
            this.h = this.i;
        } else {
            int i3 = anohVar.c;
            this.j = i3;
            adkuVar.b(i3);
            recyclerView.measure(-1, -2);
            this.h = recyclerView.getMeasuredHeight();
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.h;
        }
        apji apjiVar2 = anohVar.f;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akwp.a);
        apjiVar2.c(aihlVarCheckIsLite3);
        if (apjiVar2.j.n(aihlVarCheckIsLite3.d)) {
            apji apjiVar3 = anohVar.f;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(akwp.a);
            apjiVar3.c(aihlVarCheckIsLite4);
            Object objK2 = apjiVar3.j.k(aihlVarCheckIsLite4.d);
            hee heeVar = new hee((akwo) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2)), null);
            heeVar.b = new ivp(this, 14);
            this.e.hU(adlyVar, heeVar);
            View view = this.l;
            view.setBackgroundColor((int) anohVar.e);
            this.a.addView(view);
        }
        this.k.e(adlyVar);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((anoh) obj).g.G();
    }

    @Override // defpackage.admr
    protected final boolean hT() {
        return true;
    }
}
