package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import com.google.android.libraries.elements.interfaces.ProminenceAlgorithm;
import com.google.android.libraries.elements.interfaces.WasmTemplateEngineDelegate;
import com.google.android.libraries.elements.interfaces.WasmTemplateProvider;
import com.google.android.libraries.elements.interfaces.WasmTemplateProviderFactory;
import com.youtube.android.libraries.elements.StatusOr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adaw implements nwm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ awmd a;
    public final /* synthetic */ Object b;

    public /* synthetic */ adaw(awmd awmdVar, Object obj, int i) {
        this.$cid = i;
        this.a = awmdVar;
        this.b = obj;
    }

    @Override // defpackage.nwm
    public final Object a() {
        if (this.$cid == 0) {
            int i = adba.a;
            StatusOr statusOrCreate = WasmTemplateProviderFactory.create((WasmTemplateEngineDelegate) this.a.io(), null, ((Boolean) ((agev) this.b).e(Boolean.FALSE)).booleanValue());
            if (statusOrCreate.hasValue) {
                return (WasmTemplateProvider) statusOrCreate.value;
            }
            throw new IllegalStateException("Failed to create WasmTemplateProvider: ".concat(String.valueOf(String.valueOf(statusOrCreate.status))));
        }
        meg.a();
        IntersectionEngine intersectionEngineCreate = IntersectionEngine.create();
        if (intersectionEngineCreate == null) {
            ((nuc) this.a.io()).c(aslh.LOG_TYPE_INTERNAL_ERROR, nsl.a, "Failed to create IntersectionEngine.", new Object[0]);
            return new mnp();
        }
        Object obj = this.b;
        intersectionEngineCreate.setEnableProminence(true, ProminenceAlgorithm.DEFAULT_ALGORITHM);
        intersectionEngineCreate.setRtl(qnl.bs(((Context) obj).getResources()));
        return intersectionEngineCreate;
    }
}
