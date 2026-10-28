package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tou implements tmo {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/common/network/volley/cache/GlideVolleyDiskCache");
    public volatile tot b;
    public final agfr c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    private final File e;
    private final Executor f;
    private final tqj g;

    public tou(File file, Executor executor, vxz vxzVar, tqj tqjVar) {
        this.e = new File(String.valueOf(file.getAbsolutePath()).concat("/volleyCache"));
        this.f = executor;
        vxzVar.getClass();
        this.c = aguu.al(new tpc(vxzVar, 1));
        this.g = tqjVar;
    }

    @Override // defpackage.tmo
    public final int b() {
        if (this.b == null) {
            return 0;
        }
        return ahng.P(this.b.a());
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00bd: MOVE (r5 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:190), block:B:44:0x00bd */
    @Override // defpackage.tmo
    public final tmr d(String str) {
        InputStream inputStreamA;
        InputStream inputStream;
        agru agruVarB;
        InputStream inputStream2 = null;
        tmrVarC = null;
        tmrVarC = null;
        tmrVarC = null;
        tmrVarC = null;
        tmrVarC = null;
        tmrVarC = null;
        tmr tmrVarC = null;
        if (this.b == null) {
            return null;
        }
        afvx afvxVarAd = tym.ad(tsb.GLIDE_VOLLEY_DISK_CACHE_GET);
        try {
            tmr tmrVar = (tmr) this.d.get(str);
            if (tmrVar != null) {
                afvxVarAd.close();
                return tmrVar;
            }
            try {
                try {
                    tos tosVarD = this.b.d(String.valueOf(str.hashCode()));
                    if (tosVarD != null) {
                        inputStreamA = tosVarD.a();
                        try {
                            if (((Boolean) this.c.io()).booleanValue()) {
                                inputStreamA = new BufferedInputStream(inputStreamA, SemanticState.Modal);
                            }
                            tol tolVarD = tol.d(inputStreamA);
                            if (tolVarD.b.equals(str)) {
                                tmrVarC = tolVarD.c(tol.i(inputStreamA, tolVarD.a));
                                if (inputStreamA != null) {
                                    try {
                                        inputStreamA.close();
                                    } catch (IOException e) {
                                        e = e;
                                        agruVarB = a.b();
                                        ((agrc) ((agrc) ((agrc) agruVarB).j(e)).k("com/google/android/libraries/youtube/common/network/volley/cache/GlideVolleyDiskCache", "get", 220, "GlideVolleyDiskCache.java")).t("VolleyDiskCache.get");
                                    }
                                }
                            } else if (inputStreamA != null) {
                                try {
                                    inputStreamA.close();
                                } catch (IOException e2) {
                                    e = e2;
                                    agruVarB = a.b();
                                    ((agrc) ((agrc) ((agrc) agruVarB).j(e)).k("com/google/android/libraries/youtube/common/network/volley/cache/GlideVolleyDiskCache", "get", 220, "GlideVolleyDiskCache.java")).t("VolleyDiskCache.get");
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/common/network/volley/cache/GlideVolleyDiskCache", "get", 213, "GlideVolleyDiskCache.java")).t("VolleyDiskCache.get");
                            if (inputStreamA != null) {
                                try {
                                    inputStreamA.close();
                                } catch (IOException e4) {
                                    e = e4;
                                    agruVarB = a.b();
                                    ((agrc) ((agrc) ((agrc) agruVarB).j(e)).k("com/google/android/libraries/youtube/common/network/volley/cache/GlideVolleyDiskCache", "get", 220, "GlideVolleyDiskCache.java")).t("VolleyDiskCache.get");
                                }
                            }
                            afvxVarAd.close();
                            return tmrVarC;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e5) {
                            ((agrc) ((agrc) ((agrc) a.b()).j(e5)).k("com/google/android/libraries/youtube/common/network/volley/cache/GlideVolleyDiskCache", "get", 220, "GlideVolleyDiskCache.java")).t("VolleyDiskCache.get");
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                inputStreamA = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
            afvxVarAd.close();
            return tmrVarC;
        } catch (Throwable th3) {
            try {
                afvxVarAd.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.tmo
    public final synchronized void e() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tmo
    public final synchronized void f() {
        if (this.b != null) {
            return;
        }
        try {
            afvx afvxVarAd = tym.ad(tsb.GLIDE_VOLLEY_DISK_CACHE_INITIALIZE);
            try {
                tqj tqjVar = this.g;
                int i = tqr.a;
                boolean zK = tqjVar.k(1073830505);
                File file = this.e;
                if (zK) {
                    this.b = tpb.n(file, ((Boolean) this.c.io()).booleanValue(), this.f, 262144000L);
                } else {
                    this.b = toq.l(file, ((Boolean) this.c.io()).booleanValue(), this.f, 262144000L);
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
            throw new agfz("Couldn't initialize volley disk cache", e);
        }
    }

    @Override // defpackage.tmo
    public final void g(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tmo
    public final void h(String str, tmr tmrVar) {
        if (this.b != null) {
            this.d.put(str, tmrVar);
            this.f.execute(afwl.i(new sxk(this, str, 12)));
        }
    }

    @Override // defpackage.tmo
    public final void i(String str) {
        throw new UnsupportedOperationException();
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
