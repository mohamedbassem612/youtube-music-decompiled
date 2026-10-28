package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jfe extends admr {
    private final Context a;
    private final admd b;
    private final LinearLayout c;
    private final RecyclerView d;
    private final jak e;
    private final admo f;
    private final adlk g;
    private jal h;

    public jfe(Context context, admh admhVar, ahek ahekVar) {
        this.a = context;
        jdw jdwVar = new jdw(context);
        this.b = jdwVar;
        jak jakVar = new jak();
        this.e = jakVar;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.music_spotlight_shelf, (ViewGroup) null);
        this.c = linearLayout;
        RecyclerView recyclerView = (RecyclerView) linearLayout.findViewById(R.id.spotlight_content);
        this.d = recyclerView;
        recyclerView.ah(new LinearLayoutManager(context, 0, false));
        recyclerView.setNestedScrollingEnabled(false);
        if (admhVar instanceof admq) {
            recyclerView.aI(((admq) admhVar).c);
        }
        admo admoVarD = ahekVar.d(admhVar);
        this.f = admoVarD;
        adlk adlkVar = new adlk(xgn.l, 0);
        this.g = adlkVar;
        admoVarD.jR(adlkVar);
        admoVarD.D(jakVar, null);
        jdwVar.c(linearLayout);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.b).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        kro.Z(this.c, 0, 0);
        jal jalVar = this.h;
        if (jalVar != null) {
            jalVar.c();
        }
        this.e.clear();
        this.d.ad(null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        adly adlyVarT;
        aiqe aiqeVar;
        RecyclerView recyclerView = this.d;
        anxs anxsVar = (anxs) obj;
        admo admoVar = this.f;
        recyclerView.ad(admoVar);
        jal jalVarD = jeo.d(adlyVar);
        this.h = jalVarD;
        if (jalVarD != null) {
            jalVarD.b(recyclerView.n);
        }
        if (adlyVar.b("pagePadding", -1) > 0) {
            Context context = this.a;
            int iB = hfn.F(context) ? ((context.getResources().getDisplayMetrics().widthPixels << 2) / 12) / 2 : adlyVar.b("pagePadding", -1);
            adlyVar.f("pagePadding", Integer.valueOf(iB));
            LinearLayout linearLayout = this.c;
            linearLayout.setPadding(iB, 0, iB, 0);
            adlyVarT = kro.T(linearLayout, adlyVar);
        } else {
            adlyVarT = adlyVar;
        }
        this.g.a = adlyVar.b;
        jak jakVar = this.e;
        jakVar.clear();
        LinearLayout linearLayout2 = this.c;
        if ((anxsVar.b & 4) != 0) {
            aiqeVar = anxsVar.e;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
        } else {
            aiqeVar = null;
        }
        kro.aa(linearLayout2, aiqeVar);
        for (apji apjiVar : anxsVar.c) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(anxr.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anxr.a);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                jakVar.add(objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        admoVar.D(jakVar, adlyVarT);
        this.b.e(adlyVar);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((anxs) obj).d.G();
    }
}
