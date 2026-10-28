package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.multiplatform.elements.ElementsException;
import com.google.android.libraries.multiplatform.elements.ElementsRetainedState;
import com.google.android.libraries.multiplatform.elements.ElementsServices;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aczo {
    public static final /* synthetic */ int g = 0;
    private static final nsl h = nsl.b().a();
    private static final oph i = oph.a;
    public final awmd a;
    public final acxn b;
    public oso c;
    public acxt d;
    public maw e;
    public boolean f = false;
    private final nuc j;
    private final int k;
    private final boolean l;
    private final awmd m;
    private final awmd n;

    public aczo(aczn acznVar) {
        this.a = acznVar.a;
        this.b = acznVar.b;
        this.m = acznVar.f;
        this.n = acznVar.g;
        this.j = acznVar.c;
        this.k = acznVar.d;
        this.l = acznVar.e;
    }

    public final void a() {
        oso osoVar = this.c;
        if (osoVar != null) {
            osoVar.b();
        }
        acxt acxtVar = this.d;
        if (acxtVar != null) {
            acxtVar.b(null);
        }
    }

    public final void b(ViewGroup viewGroup, adly adlyVar, acxm acxmVar) {
        oph ophVar;
        ElementsServices elementsServices;
        try {
            if (acxmVar instanceof adai) {
                adai adaiVar = (adai) acxmVar;
                oso osoVar = this.c;
                if (osoVar == null) {
                    awmd awmdVar = this.m;
                    if (awmdVar == null) {
                        Object objC = adlyVar.c("RenderNextPresenter.ELEMENTS_SERVICES_KEY");
                        if (a$$ExternalSyntheticApiModelOutline0.m15m(objC)) {
                            Object obj = a$$ExternalSyntheticApiModelOutline0.m10m(objC).get();
                            if (obj instanceof ElementsServices) {
                                elementsServices = (ElementsServices) obj;
                            }
                        }
                        throw new ElementsException("HybridElementPresenter: ElementsServices not provided through builder or PresentContext.");
                    }
                    elementsServices = (ElementsServices) awmdVar.io();
                    int i2 = this.k;
                    if (i2 < 0) {
                        throw new ElementsException("HybridElementPresenter requires a known width to use RenderNext.");
                    }
                    oso osoVar2 = new oso(elementsServices, elementsServices.c(), i2);
                    osoVar2.d(new acnp(osoVar2, viewGroup, 11, null));
                    this.c = osoVar2;
                    osoVar = osoVar2;
                }
                byte[] bArr = adaiVar.c;
                ElementsRetainedState elementsRetainedState = adaiVar.e;
                awmd awmdVar2 = this.n;
                if (awmdVar2 != null) {
                    ophVar = (oph) awmdVar2.io();
                } else {
                    Object objC2 = adlyVar.c("RenderNextPresenter.LOCAL_ELEMENTS_SERVICES_KEY");
                    ophVar = objC2 instanceof oph ? (oph) objC2 : i;
                }
                osoVar.c(bArr, elementsRetainedState, ophVar);
                this.f = true;
                return;
            }
        } catch (ElementsException e) {
            this.j.f(aslh.LOG_TYPE_INTERNAL_ERROR, h, e, "Failed to present element with RenderNext", new Object[0]);
        }
        if (this.d == null) {
            acxt acxtVar = (acxt) this.a.io();
            this.d = acxtVar;
            acxtVar.d(this.e);
        }
        this.d.h(adlyVar, acxmVar, false, this.l);
        View viewA = this.d.a();
        if (viewA.getParent() != viewGroup) {
            viewGroup.removeAllViews();
            viewGroup.addView(viewA);
        }
        this.f = false;
    }
}
