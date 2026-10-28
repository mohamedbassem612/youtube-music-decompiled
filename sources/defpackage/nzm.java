package defpackage;

import com.google.android.libraries.elements.interfaces.JsPerformanceEventInfo;
import com.google.android.libraries.elements.interfaces.PerformanceEventInfo;
import com.google.android.libraries.elements.interfaces.PerformanceLogger;
import com.google.android.libraries.elements.interfaces.PerformanceSpan;
import io.grpc.Status;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nzm {
    public final PerformanceLogger a;
    private final nzw b;
    private final String c;
    private volatile ScheduledExecutorService d;
    private final adam e;

    public nzm(boolean z, nzw nzwVar, boolean z2, adam adamVar) {
        this.b = nzwVar;
        String strB = nzwVar.b();
        this.c = strB;
        this.e = adamVar;
        nzwVar.c(strB);
        nzl nzlVar = new nzl(z, this);
        meg.a();
        this.a = PerformanceLogger.create(nzlVar, z2);
        if (z) {
            this.d = Executors.newSingleThreadScheduledExecutor();
            if (z2) {
                return;
            }
            this.d.scheduleAtFixedRate(new mga(this, 13), 30L, 30L, TimeUnit.SECONDS);
        }
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PerformanceSpan performanceSpan = (PerformanceSpan) it.next();
            String strNameForPerformanceSpanType = PerformanceLogger.nameForPerformanceSpanType(performanceSpan.getType());
            adam adamVar = this.e;
            boolean zA = true;
            if (adamVar != null) {
                nzs nzsVar = nzs.WASM_TEMPLATE_LOADING;
                if (strNameForPerformanceSpanType.equals(nzsVar.x)) {
                    zA = adamVar.a(nzsVar);
                }
            }
            if (zA) {
                nzq nzqVarA = nzr.a();
                nzqVarA.b = new nzo(performanceSpan.getIsMainThread(), performanceSpan.getBeginThreadIdentifier());
                if (performanceSpan.getInfo() != null) {
                    PerformanceEventInfo info = performanceSpan.getInfo();
                    if (info.getNodeIdentifier() != null) {
                        nzqVarA.c = info.getNodeIdentifier();
                    }
                    if (info.getMaterializationCount() != null) {
                        nzqVarA.b(info.getMaterializationCount().intValue());
                    }
                    if (info.getCommandExtensionId() != null) {
                        nzqVarA.d = Integer.valueOf(info.getCommandExtensionId().intValue());
                    }
                    if (info.getTemplateUri() != null) {
                        nzqVarA.c(new agqj(info.getTemplateUri()));
                    } else {
                        nzqVarA.c(agpr.a);
                    }
                    JsPerformanceEventInfo jsPerformanceEventInfo = info.getJsPerformanceEventInfo();
                    if (jsPerformanceEventInfo != null) {
                        nzqVarA.e = Status.fromCodeValue(jsPerformanceEventInfo.getStatusCode()).withDescription(jsPerformanceEventInfo.getStatusMessage());
                        nzqVarA.f = jsPerformanceEventInfo.getModuleIdentifier();
                        nzqVarA.g = jsPerformanceEventInfo.getFunctionName();
                        nzqVarA.i = Boolean.valueOf(jsPerformanceEventInfo.getIsSynchronous());
                        Integer bindingExtensionId = jsPerformanceEventInfo.getBindingExtensionId();
                        if (bindingExtensionId != null) {
                            nzqVarA.h = bindingExtensionId;
                        }
                    }
                }
                Long lValueOf = null;
                if (performanceSpan.getBegin() != null && performanceSpan.getEnd() != null) {
                    lValueOf = Long.valueOf(performanceSpan.getEnd().longValue() - performanceSpan.getBegin().longValue());
                }
                nzp nzpVar = new nzp();
                nzpVar.b(strNameForPerformanceSpanType);
                nzpVar.d = performanceSpan.getParentNonce();
                nzpVar.a = performanceSpan.getBegin();
                nzpVar.b = performanceSpan.getEnd();
                nzpVar.c = lValueOf;
                nzpVar.e = nzqVarA.a();
                this.b.e(this.c, nzpVar.a());
            }
        }
    }
}
