package defpackage;

import app.rive.semantics.SemanticState;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tpd implements tmo {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/common/network/volley/cache/VolleyDiskCache");
    private tot b;
    private final File c;
    private final int d;
    private final Executor e;
    private final agfr f;
    private final tqj g;

    public tpd(File file, int i, Executor executor, vxz vxzVar, tqj tqjVar) {
        this.c = new File(String.valueOf(file.getAbsolutePath()).concat("/volleyCache"));
        this.d = i;
        this.e = executor;
        this.f = aguu.al(new tpc(vxzVar, 0));
        this.g = tqjVar;
    }

    @Override // defpackage.tmo
    public final synchronized int b() {
        tot totVar = this.b;
        if (totVar == null) {
            return 0;
        }
        return ahng.P(totVar.a());
    }

    /* JADX WARN: Code duplicated, block: B:87:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00e3: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:228), block:B:60:0x00e2 */
    @Override // defpackage.tmo
    public final synchronized tmr d(String str) {
        Throwable th;
        InputStream inputStream;
        IOException iOException;
        Throwable th2;
        InputStream inputStream2 = null;
        try {
            if (this.b != null) {
                try {
                    try {
                        afvx afvxVarAd = tym.ad(tsb.VOLLEY_DISK_CACHE_GET);
                        try {
                            tos tosVarD = this.b.d(String.valueOf(str.hashCode()));
                            if (tosVarD != null) {
                                InputStream inputStreamA = tosVarD.a();
                                try {
                                    if (((Boolean) this.f.io()).booleanValue()) {
                                        inputStreamA = new BufferedInputStream(inputStreamA, SemanticState.Modal);
                                    }
                                    tol tolVarD = tol.d(inputStreamA);
                                    if (!tolVarD.b.equals(str)) {
                                        afvxVarAd.close();
                                        if (inputStreamA != null) {
                                            try {
                                                inputStreamA.close();
                                            } catch (IOException e) {
                                                ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/common/network/volley/cache/VolleyDiskCache", "get", (char) 239, "VolleyDiskCache.java")).t("VolleyDiskCache.get");
                                            }
                                        }
                                        return null;
                                    }
                                    tmr tmrVarC = tolVarD.c(tol.i(inputStreamA, tolVarD.a));
                                    afvxVarAd.close();
                                    if (inputStreamA != null) {
                                        try {
                                            inputStreamA.close();
                                        } catch (IOException e2) {
                                            ((agrc) ((agrc) ((agrc) a.b()).j(e2)).k("com/google/android/libraries/youtube/common/network/volley/cache/VolleyDiskCache", "get", (char) 239, "VolleyDiskCache.java")).t("VolleyDiskCache.get");
                                        }
                                    }
                                    return tmrVarC;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                }
                                throw th;
                            }
                            afvxVarAd.close();
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                        try {
                            afvxVarAd.close();
                            throw th2;
                        } catch (Throwable th5) {
                            th2.addSuppressed(th5);
                            throw th2;
                        }
                    } catch (IOException e3) {
                        iOException = e3;
                        ((agrc) ((agrc) ((agrc) a.b()).j(iOException)).k("com/google/android/libraries/youtube/common/network/volley/cache/VolleyDiskCache", "get", 232, "VolleyDiskCache.java")).t("VolleyDiskCache.get");
                        if (0 != 0) {
                            try {
                                inputStream2.close();
                            } catch (IOException e4) {
                                ((agrc) ((agrc) ((agrc) a.b()).j(e4)).k("com/google/android/libraries/youtube/common/network/volley/cache/VolleyDiskCache", "get", (char) 239, "VolleyDiskCache.java")).t("VolleyDiskCache.get");
                            }
                        }
                    }
                } catch (IOException e5) {
                    iOException = e5;
                    ((agrc) ((agrc) ((agrc) a.b()).j(iOException)).k("com/google/android/libraries/youtube/common/network/volley/cache/VolleyDiskCache", "get", 232, "VolleyDiskCache.java")).t("VolleyDiskCache.get");
                    if (0 != 0) {
                        inputStream2.close();
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (inputStream2 == null) {
                        throw th;
                    }
                    try {
                        inputStream2.close();
                        throw th;
                    } catch (IOException e6) {
                        ((agrc) ((agrc) ((agrc) a.b()).j(e6)).k("com/google/android/libraries/youtube/common/network/volley/cache/VolleyDiskCache", "get", (char) 239, "VolleyDiskCache.java")).t("VolleyDiskCache.get");
                        throw th;
                    }
                }
            }
            return null;
        } catch (Throwable th7) {
            th = th7;
            inputStream2 = inputStream;
        }
    }

    @Override // defpackage.tmo
    public final synchronized void e() {
        tot totVar = this.b;
        if (totVar != null) {
            try {
                try {
                    totVar.g();
                    this.b = null;
                } catch (IOException e) {
                    ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/common/network/volley/cache/VolleyDiskCache", "clear", 110, "VolleyDiskCache.java")).t("VolleyDiskCache.clear");
                    this.b = null;
                }
            } catch (Throwable th) {
                this.b = null;
                throw th;
            }
        }
    }

    @Override // defpackage.tmo
    public final synchronized void f() {
        if (this.b != null) {
            return;
        }
        try {
            afvx afvxVarAd = tym.ad(tsb.VOLLEY_DISK_CACHE_INITIALIZE);
            try {
                tqj tqjVar = this.g;
                int i = tqr.a;
                boolean zK = tqjVar.k(1073830505);
                File file = this.c;
                if (zK) {
                    this.b = tpb.n(file, ((Boolean) this.f.io()).booleanValue(), this.e, this.d);
                } else {
                    this.b = toq.l(file, ((Boolean) this.f.io()).booleanValue(), this.e, this.d);
                }
                afvxVarAd.close();
            } catch (Throwable th) {
                try {
                    afvxVarAd.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new RuntimeException("Couldn't initialize volley disk cache", e);
        }
    }

    @Override // defpackage.tmo
    public final synchronized void g(String str, boolean z) {
        tmr tmrVarD = d(str);
        if (tmrVarD != null) {
            tms tmsVar = new tms(tmrVarD.b);
            tmsVar.f(0L);
            if (z) {
                tmsVar.g(0L);
            }
            aftj aftjVar = new aftj(tmrVarD);
            aftjVar.j(tmsVar.a());
            h(str, aftjVar.i());
        }
    }

    @Override // defpackage.tmo
    public final synchronized void h(String str, tmr tmrVar) {
        if (this.b != null) {
            OutputStream outputStreamD = null;
            try {
                try {
                    tor torVarC = this.b.c(tol.e(str));
                    if (torVarC == null) {
                        ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/common/network/volley/cache/VolleyDiskCache", "put", 176, "VolleyDiskCache.java")).t("VolleyDiskCache.put failed -- could not edit cache file");
                        return;
                    }
                    outputStreamD = torVarC.d();
                    agfr agfrVar = this.f;
                    if (((Boolean) agfrVar.io()).booleanValue()) {
                        outputStreamD = new BufferedOutputStream(outputStreamD, SemanticState.Modal);
                    }
                    new tol(str, tmrVar).l(outputStreamD);
                    outputStreamD.write(tmrVar.a.a());
                    if (((Boolean) agfrVar.io()).booleanValue()) {
                        outputStreamD.flush();
                    }
                    torVarC.b();
                    if (outputStreamD != null) {
                        try {
                            outputStreamD.close();
                        } catch (IOException e) {
                            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/common/network/volley/cache/VolleyDiskCache", "put", (char) 199, "VolleyDiskCache.java")).t("VolleyDiskCache.put");
                        }
                    }
                } catch (IOException e2) {
                    ((agrc) ((agrc) ((agrc) a.b()).j(e2)).k("com/google/android/libraries/youtube/common/network/volley/cache/VolleyDiskCache", "put", 192, "VolleyDiskCache.java")).t("VolleyDiskCache.put");
                }
            } catch (Throwable th) {
                if (0 == 0) {
                    throw th;
                }
                try {
                    outputStreamD.close();
                    throw th;
                } catch (IOException e3) {
                    ((agrc) ((agrc) ((agrc) a.b()).j(e3)).k("com/google/android/libraries/youtube/common/network/volley/cache/VolleyDiskCache", "put", (char) 199, "VolleyDiskCache.java")).t("VolleyDiskCache.put");
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.tmo
    public final synchronized void i(String str) {
        if (this.b == null) {
            return;
        }
        try {
            this.b.m(tol.e(str));
        } catch (IOException e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/common/network/volley/cache/VolleyDiskCache", "remove", (char) 255, "VolleyDiskCache.java")).t("VolleyDiskCache.remove");
        }
    }

    @Override // defpackage.tmo
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // defpackage.tmo
    public final synchronized void k(String str, Function function) {
        tmr tmrVarD = d(str);
        if (tmrVarD == null) {
            return;
        }
        tmt tmtVar = (tmt) function.apply(tmrVarD.b);
        aftj aftjVar = new aftj(tmrVarD);
        aftjVar.j(tmtVar);
        h(str, aftjVar.i());
    }
}
