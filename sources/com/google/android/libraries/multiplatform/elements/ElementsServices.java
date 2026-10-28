package com.google.android.libraries.multiplatform.elements;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.multiplatform.elements.runtime.MeasureFunctionJniWrapper;
import com.google.android.libraries.multiplatform.elements.runtime.ViewProcessorContextImpl;
import com.google.android.libraries.multiplatform.elements.uibuilder.UiBuilderCallbackImpl;
import defpackage.aber;
import defpackage.acqy;
import defpackage.adgf;
import defpackage.adgg;
import defpackage.aga;
import defpackage.agfr;
import defpackage.awmd;
import defpackage.kjc;
import defpackage.nrr;
import defpackage.nsy;
import defpackage.ool;
import defpackage.oos;
import defpackage.oov;
import defpackage.ope;
import defpackage.opm;
import defpackage.opn;
import defpackage.opo;
import defpackage.opq;
import defpackage.orq;
import defpackage.osd;
import defpackage.oui;
import defpackage.oyo;
import defpackage.oyp;
import defpackage.qnl;
import defpackage.qpu;
import defpackage.vxz;
import j$.util.Optional;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ElementsServices implements AutoCloseable {
    public static final aga a = new aga(6);
    public oov b;
    private opn c;
    private opo d;
    private MeasureFunctionJniWrapper e;
    private ViewProcessorContextImpl f;
    private acqy g;

    public abstract adgf A();

    public abstract qpu B();

    public abstract aber C();

    public abstract kjc D();

    public abstract qnl E();

    public abstract qnl F();

    public abstract qnl G();

    public abstract qnl H();

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final opm I(int i) {
        awmd awmdVar;
        qpu qpuVarB = B();
        Object objA = ((aga) qpuVarB.b).a(i);
        if (objA == null) {
            ?? r1 = qpuVarB.a;
            objA = null;
            if (r1 != 0 && (awmdVar = (awmd) r1.get(Integer.valueOf(i))) != null) {
                objA = awmdVar.io();
            }
        }
        return (opm) objA;
    }

    public final synchronized opn J() {
        if (this.c == null) {
            UiBuilderCallbackImpl uiBuilderCallbackImpl = new UiBuilderCallbackImpl(this);
            opo opoVarK = K();
            if (opoVarK != null) {
                uiBuilderCallbackImpl.c = opoVarK;
            }
            this.c = uiBuilderCallbackImpl;
        }
        return this.c;
    }

    public final synchronized opo K() {
        aber aberVarC;
        opo oyoVar;
        if (this.d == null && (aberVarC = C()) != null) {
            int i = adgg.a;
            Object obj = aberVarC.a;
            int iC = (int) ((vxz) obj).c(0, 45720780L, 0L);
            if (iC > 0) {
                oyoVar = new oyp(iC);
            } else {
                int iC2 = (int) ((vxz) obj).c(1, 45720781L, 0L);
                oyoVar = iC2 > 0 ? new oyo(iC2) : null;
            }
            this.d = oyoVar;
        }
        return this.d;
    }

    public final agfr L() {
        agfr agfrVarO = o();
        if (agfrVarO != null) {
            ((opq) agfrVarO.io()).c();
        }
        return new ope(this, 1);
    }

    public final synchronized MeasureFunctionJniWrapper M() {
        MeasureFunctionJniWrapper measureFunctionJniWrapper;
        measureFunctionJniWrapper = this.e;
        if (measureFunctionJniWrapper == null) {
            measureFunctionJniWrapper = new MeasureFunctionJniWrapper(this);
            this.e = measureFunctionJniWrapper;
        }
        return measureFunctionJniWrapper;
    }

    public final synchronized ViewProcessorContextImpl N() {
        ViewProcessorContextImpl viewProcessorContextImpl;
        viewProcessorContextImpl = this.f;
        if (viewProcessorContextImpl == null) {
            viewProcessorContextImpl = new ViewProcessorContextImpl(this);
            this.f = viewProcessorContextImpl;
        }
        return viewProcessorContextImpl;
    }

    public final synchronized acqy O() {
        acqy acqyVar;
        acqyVar = this.g;
        if (acqyVar == null) {
            acqyVar = new acqy(c(), m());
            this.g = acqyVar;
        }
        return acqyVar;
    }

    public abstract float a();

    public abstract int b();

    public abstract Context c();

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            oov oovVar = this.b;
            if (oovVar != null) {
                nsy.a(oovVar);
            }
            ViewProcessorContextImpl viewProcessorContextImpl = this.f;
            if (viewProcessorContextImpl != null) {
                nsy.a(viewProcessorContextImpl);
            }
            MeasureFunctionJniWrapper measureFunctionJniWrapper = this.e;
            if (measureFunctionJniWrapper != null) {
                nsy.a(measureFunctionJniWrapper);
            }
            opn opnVar = this.c;
            if (opnVar != null) {
                opnVar.close();
            }
            nsy.a(j());
        }
    }

    public abstract Resources d();

    public abstract DisplayMetrics e();

    public abstract aga f();

    public abstract aga g();

    public abstract nrr h();

    public abstract ComponentConfig i();

    public abstract ool j();

    public abstract oos k();

    public abstract orq l();

    public abstract osd m();

    public abstract oui n();

    public abstract agfr o();

    public abstract agfr p();

    public abstract agfr q();

    public abstract agfr r();

    public abstract agfr s();

    public abstract agfr t();

    public abstract agfr u();

    public abstract agfr v();

    public abstract agfr w();

    public abstract agfr x();

    public abstract Optional y();

    public abstract ExecutorService z();
}
