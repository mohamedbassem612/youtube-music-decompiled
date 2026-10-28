package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import j$.util.Optional;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class oom extends ElementsServices {
    private final Optional A;
    private final agfr B;
    private final adgf C;
    private final qpu D;
    private final aber E;
    private final kjc F;
    private final qnl G;
    private final qnl H;
    private final qnl I;
    private final qnl J;
    private final ExecutorService c;
    private final Context d;
    private final float e;
    private final agfr f;
    private final agfr g;
    private final DisplayMetrics h;
    private final Resources i;
    private final aga j;
    private final aga k;
    private final ComponentConfig l;
    private final oui m;
    private final int n;
    private final osd o;
    private final orq p;
    private final ool q;
    private final agfr r;
    private final nrr s;
    private final agfr t;
    private final agfr u;
    private final agfr v;
    private final agfr w;
    private final agfr x;
    private final agfr y;
    private final oos z;

    public oom(ExecutorService executorService, Context context, qnl qnlVar, qnl qnlVar2, qnl qnlVar3, qnl qnlVar4, float f, agfr agfrVar, agfr agfrVar2, DisplayMetrics displayMetrics, Resources resources, qpu qpuVar, aga agaVar, aga agaVar2, ComponentConfig componentConfig, oui ouiVar, int i, osd osdVar, orq orqVar, ool oolVar, agfr agfrVar3, nrr nrrVar, agfr agfrVar4, agfr agfrVar5, agfr agfrVar6, kjc kjcVar, adgf adgfVar, agfr agfrVar7, agfr agfrVar8, agfr agfrVar9, oos oosVar, Optional optional, agfr agfrVar10, aber aberVar) {
        this.c = executorService;
        this.d = context;
        this.G = qnlVar;
        this.J = qnlVar2;
        this.I = qnlVar3;
        this.H = qnlVar4;
        this.e = f;
        this.f = agfrVar;
        this.g = agfrVar2;
        this.h = displayMetrics;
        this.i = resources;
        this.D = qpuVar;
        this.j = agaVar;
        this.k = agaVar2;
        this.l = componentConfig;
        this.m = ouiVar;
        this.n = i;
        this.o = osdVar;
        this.p = orqVar;
        this.q = oolVar;
        this.r = agfrVar3;
        this.s = nrrVar;
        this.t = agfrVar4;
        this.u = agfrVar5;
        this.v = agfrVar6;
        this.F = kjcVar;
        this.C = adgfVar;
        this.w = agfrVar7;
        this.x = agfrVar8;
        this.y = agfrVar9;
        this.z = oosVar;
        this.A = optional;
        this.B = agfrVar10;
        this.E = aberVar;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final adgf A() {
        return this.C;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final qpu B() {
        return this.D;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final aber C() {
        return this.E;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final kjc D() {
        return this.F;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final qnl E() {
        return this.G;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final qnl F() {
        return this.H;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final qnl G() {
        return this.I;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final qnl H() {
        return this.J;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final float a() {
        return this.e;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final int b() {
        return this.n;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final Context c() {
        return this.d;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final Resources d() {
        return this.i;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final DisplayMetrics e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        agfr agfrVar;
        agfr agfrVar2;
        agfr agfrVar3;
        kjc kjcVar;
        adgf adgfVar;
        agfr agfrVar4;
        agfr agfrVar5;
        agfr agfrVar6;
        oos oosVar;
        agfr agfrVar7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ElementsServices) {
            ElementsServices elementsServices = (ElementsServices) obj;
            if (this.c.equals(elementsServices.z()) && this.d.equals(elementsServices.c()) && this.G.equals(elementsServices.E()) && this.J.equals(elementsServices.H()) && this.I.equals(elementsServices.G()) && this.H.equals(elementsServices.F()) && Float.floatToIntBits(this.e) == Float.floatToIntBits(elementsServices.a()) && this.f.equals(elementsServices.p()) && this.g.equals(elementsServices.q()) && this.h.equals(elementsServices.e()) && this.i.equals(elementsServices.d()) && this.D.equals(elementsServices.B()) && this.j.equals(elementsServices.g()) && this.k.equals(elementsServices.f()) && this.l.equals(elementsServices.i()) && this.m.equals(elementsServices.n()) && this.n == elementsServices.b() && this.o.equals(elementsServices.m()) && this.p.equals(elementsServices.l()) && this.q.equals(elementsServices.j()) && this.r.equals(elementsServices.w()) && this.s.equals(elementsServices.h()) && ((agfrVar = this.t) != null ? agfrVar.equals(elementsServices.v()) : elementsServices.v() == null) && ((agfrVar2 = this.u) != null ? agfrVar2.equals(elementsServices.o()) : elementsServices.o() == null) && ((agfrVar3 = this.v) != null ? agfrVar3.equals(elementsServices.s()) : elementsServices.s() == null) && ((kjcVar = this.F) != null ? kjcVar.equals(elementsServices.D()) : elementsServices.D() == null) && ((adgfVar = this.C) != null ? adgfVar.equals(elementsServices.A()) : elementsServices.A() == null) && ((agfrVar4 = this.w) != null ? agfrVar4.equals(elementsServices.x()) : elementsServices.x() == null) && ((agfrVar5 = this.x) != null ? agfrVar5.equals(elementsServices.r()) : elementsServices.r() == null) && ((agfrVar6 = this.y) != null ? agfrVar6.equals(elementsServices.t()) : elementsServices.t() == null) && ((oosVar = this.z) != null ? oosVar.equals(elementsServices.k()) : elementsServices.k() == null) && this.A.equals(elementsServices.y()) && ((agfrVar7 = this.B) != null ? agfrVar7.equals(elementsServices.u()) : elementsServices.u() == null)) {
                aber aberVar = this.E;
                if (aberVar == null) {
                    if (elementsServices.C() == null) {
                        return true;
                    }
                } else if (aberVar.equals(elementsServices.C())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final aga f() {
        return this.k;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final aga g() {
        return this.j;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final nrr h() {
        return this.s;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.G.hashCode()) * 1000003) ^ this.J.hashCode()) * 1000003) ^ this.I.hashCode()) * 1000003) ^ this.H.hashCode()) * 1000003) ^ Float.floatToIntBits(this.e)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.D.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode();
        agfr agfrVar = this.t;
        int iHashCode2 = ((iHashCode * 1000003) ^ (agfrVar == null ? 0 : agfrVar.hashCode())) * 1000003;
        agfr agfrVar2 = this.u;
        int iHashCode3 = (iHashCode2 ^ (agfrVar2 == null ? 0 : agfrVar2.hashCode())) * 1000003;
        agfr agfrVar3 = this.v;
        int iHashCode4 = (iHashCode3 ^ (agfrVar3 == null ? 0 : agfrVar3.hashCode())) * 1000003;
        kjc kjcVar = this.F;
        int iHashCode5 = (iHashCode4 ^ (kjcVar == null ? 0 : kjcVar.hashCode())) * 1000003;
        adgf adgfVar = this.C;
        int iHashCode6 = (iHashCode5 ^ (adgfVar == null ? 0 : adgfVar.hashCode())) * 1000003;
        agfr agfrVar4 = this.w;
        int iHashCode7 = (iHashCode6 ^ (agfrVar4 == null ? 0 : agfrVar4.hashCode())) * 1000003;
        agfr agfrVar5 = this.x;
        int iHashCode8 = (iHashCode7 ^ (agfrVar5 == null ? 0 : agfrVar5.hashCode())) * 1000003;
        agfr agfrVar6 = this.y;
        int iHashCode9 = (iHashCode8 ^ (agfrVar6 == null ? 0 : agfrVar6.hashCode())) * 1000003;
        oos oosVar = this.z;
        int iHashCode10 = (((iHashCode9 ^ (oosVar == null ? 0 : oosVar.hashCode())) * 1000003) ^ this.A.hashCode()) * 1000003;
        agfr agfrVar7 = this.B;
        int iHashCode11 = (iHashCode10 ^ (agfrVar7 == null ? 0 : agfrVar7.hashCode())) * 1000003;
        aber aberVar = this.E;
        return iHashCode11 ^ (aberVar != null ? aberVar.hashCode() : 0);
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final ComponentConfig i() {
        return this.l;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final ool j() {
        return this.q;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final oos k() {
        return this.z;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final orq l() {
        return this.p;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final osd m() {
        return this.o;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final oui n() {
        return this.m;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final agfr o() {
        return this.u;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final agfr p() {
        return this.f;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final agfr q() {
        return this.g;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final agfr r() {
        return this.x;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final agfr s() {
        return this.v;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final agfr t() {
        return this.y;
    }

    public final String toString() {
        aber aberVar = this.E;
        agfr agfrVar = this.B;
        Optional optional = this.A;
        oos oosVar = this.z;
        agfr agfrVar2 = this.y;
        agfr agfrVar3 = this.x;
        agfr agfrVar4 = this.w;
        adgf adgfVar = this.C;
        kjc kjcVar = this.F;
        agfr agfrVar5 = this.v;
        agfr agfrVar6 = this.u;
        agfr agfrVar7 = this.t;
        nrr nrrVar = this.s;
        agfr agfrVar8 = this.r;
        ool oolVar = this.q;
        orq orqVar = this.p;
        osd osdVar = this.o;
        oui ouiVar = this.m;
        ComponentConfig componentConfig = this.l;
        aga agaVar = this.k;
        aga agaVar2 = this.j;
        qpu qpuVar = this.D;
        Resources resources = this.i;
        DisplayMetrics displayMetrics = this.h;
        agfr agfrVar9 = this.g;
        agfr agfrVar10 = this.f;
        qnl qnlVar = this.H;
        qnl qnlVar2 = this.I;
        qnl qnlVar3 = this.J;
        qnl qnlVar4 = this.G;
        Context context = this.d;
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(context);
        String strValueOf3 = String.valueOf(qnlVar4);
        String strValueOf4 = String.valueOf(qnlVar3);
        String strValueOf5 = String.valueOf(qnlVar2);
        String strValueOf6 = String.valueOf(qnlVar);
        String strValueOf7 = String.valueOf(agfrVar10);
        String strValueOf8 = String.valueOf(agfrVar9);
        String strValueOf9 = String.valueOf(displayMetrics);
        String strValueOf10 = String.valueOf(resources);
        String strValueOf11 = String.valueOf(qpuVar);
        String strValueOf12 = String.valueOf(agaVar2);
        String strValueOf13 = String.valueOf(agaVar);
        String strValueOf14 = String.valueOf(componentConfig);
        String strValueOf15 = String.valueOf(ouiVar);
        String strValueOf16 = String.valueOf(osdVar);
        String strValueOf17 = String.valueOf(orqVar);
        String strValueOf18 = String.valueOf(oolVar);
        String strValueOf19 = String.valueOf(agfrVar8);
        String strValueOf20 = String.valueOf(nrrVar);
        String strValueOf21 = String.valueOf(agfrVar7);
        String strValueOf22 = String.valueOf(agfrVar6);
        String strValueOf23 = String.valueOf(agfrVar5);
        String strValueOf24 = String.valueOf(kjcVar);
        String strValueOf25 = String.valueOf(adgfVar);
        String strValueOf26 = String.valueOf(agfrVar4);
        String strValueOf27 = String.valueOf(agfrVar3);
        String strValueOf28 = String.valueOf(agfrVar2);
        String strValueOf29 = String.valueOf(oosVar);
        String strValueOf30 = String.valueOf(optional);
        String strValueOf31 = String.valueOf(agfrVar);
        String strValueOf32 = String.valueOf(aberVar);
        StringBuilder sb = new StringBuilder("ElementsServices{backgroundExecutorService=");
        sb.append(strValueOf);
        sb.append(", context=");
        sb.append(strValueOf2);
        sb.append(", viewProcessorContextFactory=");
        sb.append(strValueOf3);
        sb.append(", measureFunctionFactory=");
        sb.append(strValueOf4);
        sb.append(", elementsRuntimeFactory=");
        sb.append(strValueOf5);
        sb.append(", uiBuilderCallbackFactory=");
        sb.append(strValueOf6);
        sb.append(", displayDensity=");
        sb.append(this.e);
        sb.append(", byteStore=");
        sb.append(strValueOf7);
        sb.append(", componentSharedResources=");
        sb.append(strValueOf8);
        sb.append(", displayMetrics=");
        sb.append(strValueOf9);
        sb.append(", resources=");
        int i = this.n;
        sb.append(strValueOf10);
        sb.append(", typeExtensionHandlers=");
        sb.append(strValueOf11);
        sb.append(", propertiesExtensionHandlers=");
        sb.append(strValueOf12);
        sb.append(", imageProcessorHandlers=");
        sb.append(strValueOf13);
        sb.append(", componentConfig=");
        sb.append(strValueOf14);
        sb.append(", logger=");
        sb.append(strValueOf15);
        sb.append(", layoutDirection=");
        sb.append(i);
        sb.append(", environmentDataProvider=");
        sb.append(strValueOf16);
        sb.append(", commandResolver=");
        sb.append(strValueOf17);
        sb.append(", clock=");
        sb.append(strValueOf18);
        sb.append(", textPaint=");
        sb.append(strValueOf19);
        sb.append(", collectionScrollerRegistry=");
        sb.append(strValueOf20);
        sb.append(", subscriptionProcessorRegistrar=");
        sb.append(strValueOf21);
        sb.append(", accessibilityManager=");
        sb.append(strValueOf22);
        sb.append(", imagePerfLogger=");
        sb.append(strValueOf23);
        sb.append(", legacyStylePropertiesExtensionsHandler=");
        sb.append(strValueOf24);
        sb.append(", onRuntimeCreatedCallback=");
        sb.append(strValueOf25);
        sb.append(", unifiedTemplateResolver=");
        sb.append(strValueOf26);
        sb.append(", directUpdateDataRelay=");
        sb.append(strValueOf27);
        sb.append(", interactionCoordinator=");
        sb.append(strValueOf28);
        sb.append(", choreographer=");
        sb.append(strValueOf29);
        sb.append(", lottieDynamicAssetDownloader=");
        sb.append(strValueOf30);
        sb.append(", reaperThreadJniWrapper=");
        sb.append(strValueOf31);
        sb.append(", viewPoolFactory=");
        sb.append(strValueOf32);
        sb.append('}');
        return sb.toString();
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final agfr u() {
        return this.B;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final agfr v() {
        return this.t;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final agfr w() {
        return this.r;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final agfr x() {
        return this.w;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final Optional y() {
        return this.A;
    }

    @Override // com.google.android.libraries.multiplatform.elements.ElementsServices
    public final ExecutorService z() {
        return this.c;
    }
}
