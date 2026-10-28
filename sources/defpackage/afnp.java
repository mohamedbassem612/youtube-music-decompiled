package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.UserManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afnp {
    public static final syn m;
    public final Context a;
    public final ExecutorService b;
    public final ahey c;
    public final int d;
    public final Map e;
    public final awmd f;
    public final awmd g;
    public final agrf h;
    public final boolean i;
    public final Map j;
    public final omr k;
    public final ahpu l;
    private final Map n;
    private final aunn o;
    private final awmd p;

    static {
        qss qssVar = new qss();
        qssVar.a("CREATE TABLE ListenerSuccessfulRuns (listener_key, version_code INTEGER NOT NULL);");
        qssVar.a("CREATE TABLE AllListenersSucceededVersionTable (version_code INTEGER PRIMARY KEY ON CONFLICT REPLACE);");
        m = qssVar.b();
    }

    public afnp(Context context, omr omrVar, ExecutorService executorService, ahey aheyVar, ahpu ahpuVar, int i, Map map, Map map2, awmd awmdVar, awmd awmdVar2, aunn aunnVar, awmd awmdVar3) {
        context.getClass();
        executorService.getClass();
        aheyVar.getClass();
        awmdVar.getClass();
        awmdVar2.getClass();
        aunnVar.getClass();
        awmdVar3.getClass();
        this.a = context;
        this.k = omrVar;
        this.b = executorService;
        this.c = aheyVar;
        this.l = ahpuVar;
        this.d = i;
        this.n = map;
        this.e = map2;
        this.f = awmdVar;
        this.g = awmdVar2;
        this.o = aunnVar;
        this.p = awmdVar3;
        if (!atqq.at(((agpn) map).keySet(), ((agpn) map2).keySet()).isEmpty()) {
            Set setAt = atqq.at(((agpn) map).keySet(), ((agpn) map2).keySet());
            Objects.toString(setAt);
            throw new IllegalStateException("Don't provide both an unannotated and @AllProcessesStartupAfterPackageReplacedListener StartupAfterPackageReplacedListener provider for keys ".concat(setAt.toString()));
        }
        this.h = agrf.h("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner");
        Boolean.FALSE.booleanValue();
        this.i = false;
        this.j = omrVar.m() ? atqq.A(map, map2) : map2;
    }

    public final File a() {
        String str;
        Object objIo = this.p.io();
        objIo.getClass();
        ApplicationInfo applicationInfo = ((PackageInfo) objIo).applicationInfo;
        if (applicationInfo == null || (str = applicationInfo.dataDir) == null) {
            return null;
        }
        File file = new File(new File(str, "files"), "tiktok");
        if (!file.exists()) {
            file.mkdirs();
        }
        Context context = this.a;
        omr omrVar = this.k;
        String strL = qnl.l(context);
        return new File(file, (omrVar.m() || strL == null) ? "878177909" : "878177909_".concat(new awtk("[^A-Za-z0-9\\-_:]").a(strL, "_")));
    }

    public final void b() {
        try {
            Context context = this.a;
            boolean zI = mef.i(context);
            UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
            if (zI) {
                if (userManager == null) {
                    ((agrc) this.h.c().k("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "checkDirectBootLockStateDiscrepancy", 162, "StartupAfterPackageReplacedWithRetryRunner.kt")).t("DirectBootUtils.isUserUnlocked() is true only because UserManager is null.");
                } else if (!userManager.isUserUnlocked()) {
                    ((agrc) this.h.b().k("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "checkDirectBootLockStateDiscrepancy", 167, "StartupAfterPackageReplacedWithRetryRunner.kt")).t("DirectBootUtils.isUserUnlocked() is true, but UserManager.isUserUnlocked() is false.");
                }
            }
        } catch (Exception e) {
            ((agrc) ((agrc) this.h.b()).j(e).k("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "checkDirectBootLockStateDiscrepancy", 174, "StartupAfterPackageReplacedWithRetryRunner.kt")).t("Failed to check DirectBootUtils.isUserUnlocked()");
        }
    }

    public final ListenableFuture c() {
        Object obj = ((aupo) this.g).b;
        obj.getClass();
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(atqq.N(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(ahno.aq(afwl.c(new afgi((afna) it.next(), 7)), this.c));
        }
        return ahno.au(arrayList).k(new afsh(1), this.b);
    }

    public final omj d() {
        Object objIo = this.o.io();
        objIo.getClass();
        return (omj) objIo;
    }
}
