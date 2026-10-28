package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.ElementsRetainedState;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeProcessorImpl;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adgl implements adma {
    private static final oph a = oph.a().a();
    private final Context b;
    private final oui c;
    private ooy d;
    private final vxz e;

    public adgl(Context context, oui ouiVar, vxz vxzVar) {
        this.b = context;
        this.c = ouiVar;
        this.e = vxzVar;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        ooy ooyVar = this.d;
        if (ooyVar != null) {
            ooyVar.n();
        }
    }

    @Override // defpackage.adma
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ooy a() {
        ooy ooyVar = this.d;
        if (ooyVar != null) {
            return ooyVar;
        }
        ooy ooyVar2 = new ooy(this.b, 1);
        this.d = ooyVar2;
        return ooyVar2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, oov] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Object, oov] */
    /* JADX WARN: Type inference failed for: r12v20, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.Object] */
    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        ElementsServices elementsServices;
        Object objC;
        xgn xgnVar;
        adai adaiVar = (adai) obj;
        Object objC2 = adlyVar.c("RenderNextPresenter.ELEMENTS_SERVICES_KEY");
        if (objC2 instanceof agfr) {
            Object objIo = ((agfr) objC2).io();
            if (objIo instanceof ElementsServices) {
                elementsServices = (ElementsServices) objIo;
            } else {
                elementsServices = null;
            }
        } else {
            elementsServices = null;
        }
        if (elementsServices == null) {
            this.c.b("ElementsServices not provided in PresentContext so ElementsView cannot be initialized. Either provide it inside the PresentContext or call present with ElementsServices.", new Exception());
            return;
        }
        Object objC3 = adlyVar.c("RenderNextPresenter.LOCAL_ELEMENTS_SERVICES_KEY");
        oph ophVar = objC3 instanceof oph ? (oph) objC3 : null;
        if (ophVar == null) {
            ophVar = a;
        }
        ooy ooyVarA = a();
        if (adaiVar.d == null) {
            opg opgVar = ophVar == null ? null : ophVar.b;
            if (opgVar != null) {
                vxz vxzVar = this.e;
                int iA = opgVar.a();
                if (vxzVar != null && vxzVar.l(29, 45839327L, false)) {
                    adlh adlhVarD = adlh.d(adlyVar);
                    int i = adlhVarD.a;
                    int i2 = adlhVarD.b;
                    int i3 = adlhVarD.c;
                    int i4 = adlhVarD.d;
                    int i5 = adlhVarD.e;
                    if (i2 > 0) {
                        int iMax = Math.max(0, (iA - i3) - i4);
                        int iMin = Math.min(Math.max(0, i), i2 - 1);
                        iA = Math.max(0, (adlh.a(iMin + 1, i2, iMax) - adlh.b(iMin, i2, i5)) - (adlh.a(iMin, i2, iMax) + adlh.c(iMin, i2, i5)));
                    }
                }
                ?? Io = elementsServices.L().io();
                byte[] bArr = adaiVar.c;
                if (adaiVar.d == null) {
                    agfr agfrVar = ophVar.e;
                    if (agfrVar != null) {
                        adfs adfsVar = (adfs) agfrVar.io();
                        if (adfsVar instanceof adfs) {
                            xgnVar = adfsVar.a;
                        } else {
                            xgnVar = null;
                        }
                    } else {
                        xgnVar = null;
                    }
                    opf opfVar = new opf(ophVar);
                    opfVar.b = new adaq(adaiVar, null, xgnVar, null);
                    adaiVar.d = opl.a(Io.b(opfVar.a()));
                }
                adaiVar.d.c().s(bArr, View.MeasureSpec.makeMeasureSpec(iA, 1073741824), 0, adaiVar.e);
            }
        }
        opl oplVar = adaiVar.d;
        if (oplVar != null) {
            if (Memory.peekByte(FlagServices.b().c + 62) != 0) {
                ooyVarA.k = 2;
            }
            ooyVarA.z(oplVar.b());
            return;
        }
        byte[] bArr2 = adaiVar.c;
        ElementsRetainedState elementsRetainedState = adaiVar.e;
        if (ooyVarA.k == 2) {
            ooyVarA.o();
            ooyVarA.t(false, false);
            ooyVarA.k = 1;
        }
        ooyVarA.i = false;
        ooyVarA.y(elementsServices, ophVar);
        opl oplVar2 = ooyVarA.b;
        if (oplVar2 == null) {
            NodeTreeProcessor nodeTreeProcessorB = elementsServices.L().io().b(ophVar);
            ooyVarA.b = opl.a(nodeTreeProcessorB);
            ooyVarA.d = true;
            ooyVarA.h = true;
            nodeTreeProcessorB.t(ooyVarA);
            objC = nodeTreeProcessorB;
        } else {
            objC = oplVar2.c();
        }
        ?? r7 = objC;
        int iC = ooyVarA.c(ooyVarA.e);
        int iB = ooyVarA.b(ooyVarA.f);
        if (ooyVarA.g) {
            r7.s(bArr2, iC, iB, elementsRetainedState);
            return;
        }
        NodeTreeProcessorImpl nodeTreeProcessorImpl = (NodeTreeProcessorImpl) r7;
        nodeTreeProcessorImpl.f.set(-1L);
        nodeTreeProcessorImpl.a.z().execute(new lez((Object) r7, bArr2, elementsRetainedState, 13, (int[]) null));
    }
}
