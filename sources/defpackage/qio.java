package defpackage;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Process;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qio extends qnl implements qdy, qfh {
    public static final long a;
    public final qfg b;
    public final Context c;
    public final aunn d;
    public final qja e;
    private final qeb f;
    private final Executor g;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        a = 43200000L;
    }

    public qio(axfd axfdVar, Context context, qeb qebVar, Executor executor, aunn aunnVar, qja qjaVar, awmd awmdVar) {
        super((short[]) null);
        this.b = axfdVar.V(executor, aunnVar, awmdVar);
        this.g = executor;
        this.c = context;
        this.d = aunnVar;
        this.e = qjaVar;
        this.f = qebVar;
    }

    @Override // defpackage.qdy
    public final void g(qci qciVar) {
        this.f.b(this);
        ahng.s(new ahcx() { // from class: qin
            @Override // defpackage.ahcx
            public final ListenableFuture a() {
                UUID uuidFromString;
                qio qioVar = this.a;
                Context context = qioVar.c;
                if (!mef.i(context)) {
                    return aher.a;
                }
                qpj.b();
                qja qjaVar = qioVar.e;
                long j = qio.a;
                qpj.b();
                Context context2 = qjaVar.a;
                if (mef.i(context2)) {
                    long j2 = mef.i(context2) ? ((SharedPreferences) qjaVar.c.io()).getLong("primes.packageMetric.lastSendTime", -1L) : -1L;
                    long jB = qjaVar.b.b();
                    if (jB < j2) {
                        ((SharedPreferences) qjaVar.c.io()).edit().remove("primes.packageMetric.lastSendTime").commit();
                        j2 = -1;
                    }
                    if (j2 != -1 && jB <= j2 + j) {
                        return aher.a;
                    }
                }
                PackageStats packageStats = null;
                if (!qioVar.b.b(null)) {
                    return aher.a;
                }
                qpj.b();
                qpj.b();
                StorageManager storageManager = (StorageManager) context.getSystemService(StorageManager.class);
                if (storageManager == null) {
                    ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getPackageStats", 30, "PackageStatsCaptureO.java")).t("StorageManager is not available");
                } else {
                    StorageStatsManager storageStatsManagerM807m = gp$$ExternalSyntheticApiModelOutline2.m807m(context.getSystemService(gp$$ExternalSyntheticApiModelOutline2.m$1()));
                    if (storageStatsManagerM807m == null) {
                        ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getPackageStats", 35, "PackageStatsCaptureO.java")).t("StorageStatsManager is not available");
                    } else {
                        String packageName = context.getPackageName();
                        PackageStats packageStats2 = new PackageStats(packageName);
                        Iterator it = storageManager.getStorageVolumes().iterator();
                        while (it.hasNext()) {
                            StorageVolume storageVolumeM828m = ie$$ExternalSyntheticApiModelOutline0.m828m(it.next());
                            if (storageVolumeM828m.getState().equals("mounted")) {
                                String uuid = storageVolumeM828m.getUuid();
                                if ("1AEF-1A1E".equals(uuid)) {
                                    uuidFromString = null;
                                } else if (uuid == null) {
                                    try {
                                        uuidFromString = StorageManager.UUID_DEFAULT;
                                    } catch (IllegalArgumentException e) {
                                        ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getUuid", 'L', "PackageStatsCaptureO.java")).w("Invalid UUID format: '%s'", uuid);
                                        uuidFromString = null;
                                    }
                                } else {
                                    uuidFromString = UUID.fromString(uuid);
                                }
                                if (uuidFromString != null) {
                                    try {
                                        StorageStats storageStatsQueryStatsForPackage = storageStatsManagerM807m.queryStatsForPackage(uuidFromString, packageName, Process.myUserHandle());
                                        if (StorageManager.UUID_DEFAULT.equals(uuidFromString)) {
                                            packageStats2.codeSize += storageStatsQueryStatsForPackage.getAppBytes();
                                            packageStats2.dataSize += storageStatsQueryStatsForPackage.getDataBytes() - storageStatsQueryStatsForPackage.getCacheBytes();
                                            packageStats2.cacheSize += storageStatsQueryStatsForPackage.getCacheBytes();
                                        } else {
                                            packageStats2.externalCodeSize += storageStatsQueryStatsForPackage.getAppBytes();
                                            packageStats2.externalDataSize += storageStatsQueryStatsForPackage.getDataBytes() - storageStatsQueryStatsForPackage.getCacheBytes();
                                            packageStats2.externalCacheSize += storageStatsQueryStatsForPackage.getCacheBytes();
                                        }
                                    } catch (PackageManager.NameNotFoundException | IOException | RuntimeException e2) {
                                        ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e2)).k("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getPackageStats", '3', "PackageStatsCaptureO.java")).t("queryStatsForPackage() call failed");
                                    }
                                }
                            }
                        }
                        packageStats = packageStats2;
                    }
                }
                if (packageStats == null) {
                    return ahng.m(new IllegalStateException("PackageStats capture failed."));
                }
                aihf aihfVarCreateBuilder = axhz.a.createBuilder();
                aihf aihfVarCreateBuilder2 = axhv.a.createBuilder();
                long j3 = packageStats.cacheSize;
                aihfVarCreateBuilder2.copyOnWrite();
                axhv axhvVar = (axhv) aihfVarCreateBuilder2.instance;
                axhvVar.b |= 1;
                axhvVar.c = j3;
                long j4 = packageStats.codeSize;
                aihfVarCreateBuilder2.copyOnWrite();
                axhv axhvVar2 = (axhv) aihfVarCreateBuilder2.instance;
                axhvVar2.b |= 2;
                axhvVar2.d = j4;
                long j5 = packageStats.dataSize;
                aihfVarCreateBuilder2.copyOnWrite();
                axhv axhvVar3 = (axhv) aihfVarCreateBuilder2.instance;
                axhvVar3.b |= 4;
                axhvVar3.e = j5;
                long j6 = packageStats.externalCacheSize;
                aihfVarCreateBuilder2.copyOnWrite();
                axhv axhvVar4 = (axhv) aihfVarCreateBuilder2.instance;
                axhvVar4.b |= 8;
                axhvVar4.f = j6;
                long j7 = packageStats.externalCodeSize;
                aihfVarCreateBuilder2.copyOnWrite();
                axhv axhvVar5 = (axhv) aihfVarCreateBuilder2.instance;
                axhvVar5.b |= 16;
                axhvVar5.g = j7;
                long j8 = packageStats.externalDataSize;
                aihfVarCreateBuilder2.copyOnWrite();
                axhv axhvVar6 = (axhv) aihfVarCreateBuilder2.instance;
                axhvVar6.b |= 32;
                axhvVar6.h = j8;
                long j9 = packageStats.externalMediaSize;
                aihfVarCreateBuilder2.copyOnWrite();
                axhv axhvVar7 = (axhv) aihfVarCreateBuilder2.instance;
                axhvVar7.b |= 64;
                axhvVar7.i = j9;
                long j10 = packageStats.externalObbSize;
                aihfVarCreateBuilder2.copyOnWrite();
                axhv axhvVar8 = (axhv) aihfVarCreateBuilder2.instance;
                axhvVar8.b |= SemanticState.Focused;
                axhvVar8.j = j10;
                aihf builder = ((axhv) aihfVarCreateBuilder2.build()).toBuilder();
                agev agevVar = ((qim) qioVar.d.io()).a;
                aihfVarCreateBuilder.copyOnWrite();
                axhz axhzVar = (axhz) aihfVarCreateBuilder.instance;
                axhv axhvVar9 = (axhv) builder.build();
                axhvVar9.getClass();
                axhzVar.i = axhvVar9;
                axhzVar.b |= SemanticState.Focused;
                qja qjaVar2 = qioVar.e;
                if (mef.i(qjaVar2.a)) {
                    ((SharedPreferences) qjaVar2.c.io()).edit().putLong("primes.packageMetric.lastSendTime", qjaVar2.b.b()).commit();
                }
                qfg qfgVar = qioVar.b;
                qfc qfcVarA = qfd.a();
                qfcVarA.g((axhz) aihfVarCreateBuilder.build());
                return qfgVar.a(qfcVarA.a());
            }
        }, this.g);
    }

    @Override // defpackage.qfh
    public final void k() {
        this.f.a(this);
    }

    @Override // defpackage.qdy
    public final /* synthetic */ void j(qci qciVar) {
    }
}
