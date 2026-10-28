package defpackage;

import com.google.android.libraries.elements.interfaces.ClientErrorLoggerAdapter;
import com.google.android.libraries.elements.interfaces.ControllerModuleLoader;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.ExecutorRegistry;
import com.google.android.libraries.elements.interfaces.JSController;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.elements.interfaces.JSModuleBytesProvider;
import com.google.android.libraries.elements.interfaces.JSModuleCache;
import com.google.android.libraries.elements.interfaces.PerformanceLogger;
import com.google.android.libraries.youtube.client.mobile.executor.JsExecutor;
import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mho extends JSEnvironment {
    private volatile JSController a;
    private volatile ControllerModuleLoader b;
    private volatile JSModuleBytesProvider c;
    private final mhn d;
    private final awmd e;
    private final Optional f;
    private final Map g;
    private final boolean h;
    private final ClientErrorLoggerAdapter i;
    private final boolean j;
    private final Optional k;
    private final nzm l;

    public mho(mhn mhnVar, awmd awmdVar, Optional optional, Map map, boolean z, Optional optional2, boolean z2, Optional optional3, awmd awmdVar2) {
        this.d = mhnVar;
        this.e = awmdVar;
        this.f = optional;
        this.g = map;
        this.h = z;
        this.i = (ClientErrorLoggerAdapter) optional2.orElse(new mfl());
        this.j = z2;
        this.k = optional3;
        this.l = (nzm) awmdVar2.io();
    }

    @Override // com.google.android.libraries.elements.interfaces.JSEnvironment
    public final JSModuleBytesProvider getBytesProvider() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = ((JSModuleCache) this.e.io()).getBytesProvider();
                }
            }
        }
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v27, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [awmd, java.lang.Object] */
    @Override // com.google.android.libraries.elements.interfaces.JSEnvironment
    public final JSController getController() {
        JSController jSController = this.a;
        if (jSController != null) {
            return jSController;
        }
        synchronized (this) {
            if (this.a == null) {
                meg.a();
                mhn mhnVar = this.d;
                JSControllerConfig jSControllerConfig = new JSControllerConfig(mhnVar.a, mhnVar.b, mhnVar.c, mhnVar.d, mhnVar.e, mhnVar.f, mhnVar.g, 0, mhnVar.h, mhnVar.i, mhnVar.j, mhnVar.k, mhnVar.l, mhnVar.m, mhnVar.n, mhnVar.o, (String) mhnVar.p.orElse(null), mhnVar.q, mhnVar.r, mhnVar.s, mhnVar.t, mhnVar.u, mhnVar.v, mhnVar.w, mhnVar.x, mhnVar.y, mhnVar.z, mhnVar.A, mhnVar.B, mhnVar.C, mhnVar.D, mhnVar.F, mhnVar.E);
                JSModuleCache jSModuleCache = (JSModuleCache) this.e.io();
                Optional optional = this.f;
                PerformanceLogger performanceLogger = this.l.a;
                ClientErrorLoggerAdapter clientErrorLoggerAdapter = this.i;
                optional.isPresent();
                JSController jSControllerCreate = JSController.create(performanceLogger, clientErrorLoggerAdapter, jSModuleCache, (ExecutorRegistry) optional.get().io(), jSControllerConfig);
                if (jSControllerCreate != null) {
                    agqs agqsVarListIterator = ((agke) ((agpn) this.g).values()).listIterator(0);
                    while (agqsVarListIterator.hasNext()) {
                        mhp mhpVar = (mhp) agqsVarListIterator.next();
                        jSControllerCreate.registerFunctionBinding(mhpVar.a().a(), mhpVar);
                    }
                    if (this.j) {
                        Optional optional2 = this.k;
                        optional2.isPresent();
                        jSControllerCreate.setDebuggerClient((DebuggerClient) optional2.get().io());
                    }
                }
                this.a = jSControllerCreate;
            }
        }
        return this.a;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSEnvironment
    public final JsExecutor getExecutor() {
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSEnvironment
    public final JSModuleCache getModuleCache() {
        return (JSModuleCache) this.e.io();
    }

    @Override // com.google.android.libraries.elements.interfaces.JSEnvironment
    public final ControllerModuleLoader getModuleLoader() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = ((JSModuleCache) this.e.io()).getLoader();
                }
            }
        }
        return this.b;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSEnvironment
    public final void prewarmEnvironment() {
        if (this.a != null) {
            this.a.prewarmExecutor(this.h);
        }
    }
}
