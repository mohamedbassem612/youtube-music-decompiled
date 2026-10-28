package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.elements.interfaces.ComponentSharedResources;
import com.google.android.libraries.elements.interfaces.WasmEngineType;
import com.google.android.libraries.elements.interfaces.WasmTemplateEngineDelegate;
import com.google.android.libraries.elements.interfaces.WasmTemplateEngineDelegateFactory;
import com.google.android.libraries.elements.interfaces.WasmTemplateProvider;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.runtime.NativeLibraryInitializer;
import com.google.android.libraries.multiplatform.elements.runtime.ReaperThreadJniWrapper;
import com.google.android.libraries.multiplatform.elements.runtime.logging.PerformanceLoggerImpl;
import j$.util.Optional;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acgz implements aupn {
    public static void b(Context context, awku awkuVar) {
        context.getClass();
        awkuVar.getClass();
    }

    public static avlh c(awku awkuVar) {
        return awkuVar.r(new ablh(11)).P();
    }

    public static acjk d(List list, List list2) {
        list.getClass();
        list2.getClass();
        return new acjk(list, list2);
    }

    public static ackv e(aunn aunnVar, Optional optional) {
        aunnVar.getClass();
        ackv ackvVar = (ackv) awrc.f(optional);
        if (ackvVar != null) {
            return ackvVar;
        }
        Object objIo = aunnVar.io();
        objIo.getClass();
        return (ackv) objIo;
    }

    public static acoi f(cc ccVar) {
        acoi acoiVar = (acoi) ccVar;
        acoiVar.getClass();
        return acoiVar;
    }

    public static aefv g(awmd awmdVar) {
        aefv aefvVar = (aefv) awmdVar.io();
        aefvVar.getClass();
        return aefvVar;
    }

    public static aboi h(abvn abvnVar) {
        aboi aboiVarZ = abvnVar.Z();
        aboiVarZ.getClass();
        return aboiVarZ;
    }

    public static agbq i(awmd awmdVar) {
        return (agbq) ((Container) awmdVar.io()).a(new afyq(14));
    }

    public static WasmTemplateEngineDelegate j(agev agevVar, final agev agevVar2, agev agevVar3) {
        int i = adba.a;
        Boolean bool = Boolean.FALSE;
        if (!((Boolean) agevVar.e(bool)).booleanValue() && !((Boolean) agevVar3.e(bool)).booleanValue()) {
            throw new IllegalStateException("Creating Wasm template engine when Wasm is disabled.");
        }
        WasmTemplateEngineDelegate wasmTemplateEngineDelegate = (WasmTemplateEngineDelegate) adbb.b.a(new nwm() { // from class: aday
            @Override // defpackage.nwm
            public final Object a() {
                int i2 = adba.a;
                return WasmTemplateEngineDelegateFactory.create((WasmEngineType) agevVar2.e(WasmEngineType.GWASM_INTERPRETER));
            }
        });
        wasmTemplateEngineDelegate.getClass();
        return wasmTemplateEngineDelegate;
    }

    public static WasmTemplateProvider k(agev agevVar, agev agevVar2, awmd awmdVar) {
        int i = adba.a;
        Boolean bool = Boolean.FALSE;
        if (!((Boolean) agevVar.e(bool)).booleanValue() && !((Boolean) agevVar2.e(bool)).booleanValue()) {
            throw new IllegalStateException("Creating WasmTemplateProvider when Wasm is disabled");
        }
        WasmTemplateProvider wasmTemplateProvider = (WasmTemplateProvider) adbb.a.a(new adaw(awmdVar, agevVar, 0));
        wasmTemplateProvider.getClass();
        return wasmTemplateProvider;
    }

    public static ost l(mew mewVar, aga agaVar, aga agaVar2, ComponentConfig componentConfig, ComponentSharedResources componentSharedResources, opq opqVar, adgf adgfVar, awmd awmdVar) {
        int i = adgg.a;
        NativeLibraryInitializer.a();
        if (opqVar != null) {
            return new ost(mewVar, agaVar, agaVar2, componentConfig, componentSharedResources, opqVar, adgfVar, (ReaperThreadJniWrapper) awmdVar.io());
        }
        throw new NullPointerException("Null accessibilityManager");
    }

    public static Context m(Map map, awmd awmdVar, Activity activity) {
        Context context = (Context) ((awmd) agev.h((awmd) map.get(activity.getClass())).e(awmdVar)).io();
        context.getClass();
        return context;
    }

    public static Context n(Map map, awmd awmdVar, Activity activity) {
        Context context = (Context) ((awmd) agev.h((awmd) map.get(activity.getClass())).e(awmdVar)).io();
        context.getClass();
        return context;
    }

    public static qrx o(Context context, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("elements");
        qpqVar.d("elements_settings.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.e(atot.a);
        qrlVarA.f(uriA);
        qrx qrxVarC = rrqVar.c(qrlVarA.a());
        qrxVarC.getClass();
        return qrxVarC;
    }

    public static avlh p(avlh avlhVar, abfv abfvVar) {
        akef akefVar = aawd.a;
        return avlh.f(avlhVar.p(), ((avlh) abfvVar.b).p(), new jnx(20)).x(new yqz(7)).H(new aalc(4)).S();
    }

    public static abpd q(tbt tbtVar, abps abpsVar, abrg abrgVar, Executor executor, Executor executor2, Set set, mbc mbcVar, vyo vyoVar, abmt abmtVar, txp txpVar, abpk abpkVar, aaom aaomVar, hno hnoVar, abwj abwjVar) {
        abpd abpdVar = !((vxz) hnoVar.o).m(151, 45638653L) ? new abpd(tbtVar, abpsVar, abrgVar, executor, executor2, set, mbcVar, vyoVar, abmtVar, txpVar, abpkVar, abwjVar) : aaomVar;
        abpdVar.getClass();
        return abpdVar;
    }

    public static PerformanceLoggerImpl r(grj grjVar, ahey aheyVar, mbc mbcVar, adga adgaVar) {
        int i = adgg.a;
        PerformanceLoggerImpl performanceLoggerImpl = new PerformanceLoggerImpl(grjVar, aheyVar, mbcVar);
        avgj avgjVar = new avgj(performanceLoggerImpl);
        List list = adgaVar.a;
        if (list.isEmpty()) {
            adgaVar.b.a(adgaVar);
        }
        list.add(avgjVar);
        performanceLoggerImpl.a();
        return performanceLoggerImpl;
    }

    public static aavv s(acjk acjkVar) {
        acjkVar.getClass();
        return new aavv((char[]) null);
    }

    public static ElementsServices t(Activity activity, Context context, nry nryVar, ExecutorService executorService, mew mewVar, oui ouiVar, aga agaVar, aga agaVar2, aga agaVar3, ComponentConfig componentConfig, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, adgf adgfVar, aunn aunnVar, kjc kjcVar, Map map, aber aberVar, Optional optional, nrr nrrVar) {
        FlagServices.c(mewVar);
        awmdVar2.getClass();
        adge adgeVar = new adge(awmdVar2, 1);
        awmdVar.getClass();
        adge adgeVar2 = new adge(awmdVar, 0);
        awmdVar4.getClass();
        int i = 2;
        oow oowVarAH = qnl.aH(adgeVar, adgeVar2, executorService, context, osf.a(activity, executorService, new adge(awmdVar4, i)), nryVar);
        oowVarAH.e(ouiVar);
        oowVarAH.g(agaVar);
        oowVarAH.b(map);
        oowVarAH.f(agaVar2);
        oowVarAH.d(agaVar3);
        oowVarAH.c(componentConfig);
        awmdVar3.getClass();
        oowVarAH.n = new adge(awmdVar3, 3);
        oowVarAH.o = new adge(awmdVar4, i);
        awmdVar5.getClass();
        oowVarAH.q = new adge(awmdVar5, 4);
        oowVarAH.w = adgfVar;
        aunnVar.getClass();
        oowVarAH.u = new adge(aunnVar, 5);
        oowVarAH.z = kjcVar;
        oowVarAH.y = aberVar;
        optional.isPresent();
        oowVarAH.p = (agfr) optional.orElse(null);
        oowVarAH.m = nrrVar;
        awmdVar6.getClass();
        oowVarAH.r = new adge(awmdVar6, 6);
        return oowVarAH.a();
    }

    public static axlj u(aunn aunnVar, Optional optional) {
        aunnVar.getClass();
        axlj axljVar = (axlj) awrc.f(optional);
        if (axljVar != null) {
            return axljVar;
        }
        Object objIo = aunnVar.io();
        objIo.getClass();
        return (axlj) objIo;
    }

    public static ci v(afpa afpaVar) {
        ci ciVarCV = ((admi) atqp.a(afpaVar.a, admi.class)).cV();
        ciVarCV.getClass();
        return ciVarCV;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
