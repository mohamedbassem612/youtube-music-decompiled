package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.impl.HttpEngineNativeProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class thn implements thm {
    private static final List a = new CopyOnWriteArrayList();
    private final Context b;
    private final tho c;
    private final boolean d;
    private final int e;

    public thn(tao taoVar, tqj tqjVar, Context context, ExecutorService executorService, ExecutorService executorService2) {
        int iBh;
        this.b = context;
        int i = tqr.a;
        this.d = tqjVar.k(1073829243);
        if (tqjVar.k(1073813988)) {
            iBh = a.bh(tqjVar.a(1074010601));
            if (iBh == 0) {
                throw null;
            }
        } else {
            ajby ajbyVar = taoVar.a().e;
            iBh = a.bh((ajbyVar == null ? ajby.a : ajbyVar).f);
            if (iBh == 0) {
                iBh = 2;
            }
        }
        this.e = iBh == 2 ? 8 : iBh;
        if (tqjVar.k(1073813988) ? tqjVar.k(1073813989) : taoVar.d().g) {
            this.c = new tho(executorService2);
        } else {
            this.c = new tho(executorService);
        }
    }

    private static List b(CronetProvider cronetProvider, CronetProvider cronetProvider2, CronetProvider cronetProvider3) {
        ArrayList arrayList = new ArrayList(4);
        if (cronetProvider != null) {
            arrayList.add(cronetProvider);
        }
        if (cronetProvider2 != null) {
            arrayList.add(cronetProvider2);
        }
        if (cronetProvider3 != null) {
            arrayList.add(cronetProvider3);
        }
        return arrayList;
    }

    private final synchronized void c() {
        if (a.isEmpty()) {
            int i = this.e - 1;
            boolean z = false;
            boolean z2 = (i == 4 || i == 5 || i == 7) ? false : true;
            if (z2) {
                this.c.c(this.b);
            }
            boolean z3 = (i == 4 || i == 6) ? false : true;
            if (i != 5 && i != 6) {
                z = true;
            }
            try {
                CronetProvider httpEngineNativeProvider = null;
                CronetProvider cronetProvider = null;
                CronetProvider cronetProvider2 = null;
                CronetProvider cronetProvider3 = null;
                for (CronetProvider cronetProvider4 : CronetProvider.getAllProviders(this.b)) {
                    if (cronetProvider4 != null) {
                        String name = cronetProvider4.getName();
                        if (z3 && name.equals("App-Packaged-Cronet-Provider")) {
                            cronetProvider = cronetProvider4;
                        } else if (z && name.equals("Fallback-Cronet-Provider")) {
                            cronetProvider2 = cronetProvider4;
                        } else if (z2 && name.equals("Google-Play-Services-Cronet-Provider")) {
                            cronetProvider3 = cronetProvider4;
                        } else if (d() && name.equals(CronetProvider.PROVIDER_NAME_HTTPENGINE_NATIVE)) {
                            httpEngineNativeProvider = cronetProvider4;
                        }
                    }
                }
                if (d()) {
                    twu.d(twu.a, 4, "Cronet: will try to useHttpEngine", null);
                    if (httpEngineNativeProvider == null) {
                        try {
                            httpEngineNativeProvider = new HttpEngineNativeProvider(this.b);
                        } catch (Throwable th) {
                            twu.d(twu.a, 5, "Cronet: Failed to load HttpEngineNativeProvider", th);
                        }
                    }
                }
                if (httpEngineNativeProvider != null && httpEngineNativeProvider.isEnabled()) {
                    a.add(httpEngineNativeProvider);
                }
                int i2 = this.e - 1;
                if (i2 == 1 || i2 == 3 || i2 == 8) {
                    a.addAll(b(cronetProvider, cronetProvider3, cronetProvider2));
                } else {
                    a.addAll(b(cronetProvider3, cronetProvider, cronetProvider2));
                }
            } catch (Throwable th2) {
                twu.d(twu.a, 6, "Couldn't call CronetProvider.getAllProviders", th2);
            }
        }
    }

    private final boolean d() {
        return Build.VERSION.SDK_INT >= 31 && this.d && SdkExtensions.getExtensionVersion(31) >= 17;
    }

    @Override // defpackage.thm
    public final CronetEngine a(syb sybVar) {
        List<CronetProvider> list = a;
        if (list.isEmpty()) {
            c();
        }
        Object obj = null;
        if (!d() && this.e == 4) {
            Object objA = this.c.d() ? sybVar.a(new ExperimentalCronetEngine.Builder(this.b), "AutoSelect") : null;
            if (objA != null) {
                return (CronetEngine) objA;
            }
        }
        for (CronetProvider cronetProvider : list) {
            if (cronetProvider.getName().equals("Google-Play-Services-Cronet-Provider") ? this.c.d() : true) {
                Object objA2 = sybVar.a((ExperimentalCronetEngine.Builder) cronetProvider.createBuilder(), "CronetProvider: " + cronetProvider.getName() + ", " + cronetProvider.getVersion());
                if (objA2 != null) {
                    obj = objA2;
                    break;
                }
            }
        }
        return (CronetEngine) obj;
    }
}
