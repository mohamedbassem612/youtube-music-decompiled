package com.google.android.libraries.youtube.media.player.exo2.platypus;

import android.os.Handler;
import com.google.android.libraries.youtube.media.interfaces.FallbackConfig;
import com.google.android.libraries.youtube.media.interfaces.QoeError;
import com.google.android.libraries.youtube.media.player.exo2.platypus.event.PlatypusException;
import defpackage.a;
import defpackage.ager;
import defpackage.agke;
import defpackage.ajtv;
import defpackage.alot;
import defpackage.xeu;
import defpackage.xff;
import defpackage.yno;
import defpackage.ypz;
import defpackage.ywj;
import defpackage.zcf;
import defpackage.zhq;
import defpackage.zhr;
import defpackage.zhv;
import defpackage.zhz;
import defpackage.zjr;
import defpackage.zkf;
import defpackage.ztf;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class ErrorHandler {
    public final Callbacks a;
    private final Handler b;
    private final xeu c;
    private final zjr d;

    /* JADX INFO: compiled from: PG */
    public interface Callbacks {
        long a();

        long b(zcf zcfVar);

        void c(zcf zcfVar, ywj ywjVar, zhz zhzVar);

        void d(String str, PlatypusException platypusException);

        void e(zcf zcfVar);
    }

    public ErrorHandler(Callbacks callbacks, zjr zjrVar, Handler handler, xeu xeuVar) {
        this.a = callbacks;
        this.b = handler;
        this.c = xeuVar;
        this.d = zjrVar;
    }

    private final void g(final zhz zhzVar, final FallbackConfig fallbackConfig, final zcf zcfVar) {
        ypz ypzVar;
        try {
            zhq zhqVar = zhq.ABR;
            zhzVar.n();
            if (zhzVar.f) {
                zcfVar.Z.l("pcmp", "f");
                String str = zcfVar.a;
                LinkedHashMap linkedHashMap = ypz.a;
                synchronized (ypz.class) {
                    try {
                        LinkedHashMap linkedHashMap2 = ypz.a;
                        ypzVar = (ypz) linkedHashMap2.get(str + ":true");
                        if (ypzVar == null) {
                            ypzVar = (ypz) linkedHashMap2.get(str + ":false");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (ypzVar != null) {
                    ypzVar.d(fallbackConfig.getFirstRequestNumber());
                }
            }
            this.b.post(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.ErrorHandler$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ErrorHandler errorHandler = this.a;
                    zhz zhzVarA = zhzVar;
                    zcf zcfVar2 = zcfVar;
                    FallbackConfig fallbackConfig2 = fallbackConfig;
                    boolean disableRetry = fallbackConfig2.getDisableRetry();
                    boolean disableSsdai = fallbackConfig2.getDisableSsdai();
                    try {
                        if (!zhzVarA.g()) {
                            zhv zhvVar = new zhv(zhzVarA);
                            zhvVar.e(errorHandler.a.b(zcfVar2));
                            zhzVarA = zhvVar.a();
                        }
                        if (!zhzVarA.f) {
                            errorHandler.a.c(zcfVar2, zcfVar2.b, zhzVarA);
                            return;
                        }
                        ErrorHandler.Callbacks callbacks = errorHandler.a;
                        callbacks.e(zcfVar2);
                        if (disableRetry) {
                            zhzVarA.f = true;
                            zhzVarA.g = true;
                        }
                        if (disableSsdai && !disableRetry) {
                            ErrorHandler$$ExternalSyntheticLambda1 errorHandler$$ExternalSyntheticLambda1 = new ErrorHandler$$ExternalSyntheticLambda1();
                            zhv zhvVar2 = new zhv(zhzVarA);
                            zhvVar2.b(errorHandler$$ExternalSyntheticLambda1);
                            zhzVarA = zhvVar2.a();
                        }
                        callbacks.c(zcfVar2, zcfVar2.b, zhzVarA);
                    } catch (RuntimeException e) {
                        errorHandler.a(e, zcfVar2.b);
                    }
                }
            });
        } catch (RuntimeException e) {
            a(e, zcfVar.b);
        }
    }

    final void a(RuntimeException runtimeException, final ywj ywjVar) {
        try {
            xeu xeuVar = this.c;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(yno.cx(runtimeException, 6, ajtv.ERROR_LEVEL_ERROR, "Platypus ErrorHandler error"), alot.CLIENT_ERROR);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } else {
                xeuVar.b(yno.cy(runtimeException, 6, ajtv.ERROR_LEVEL_ERROR, "Platypus ErrorHandler error"));
            }
            zhr.a(zhq.PLATYPUS, a.co(runtimeException, "Error when failing to handle error: "));
            zhv zhvVar = new zhv("player.fatalexception");
            zhvVar.c = "c.error_when_handling_errorhandler_error";
            zhvVar.e = true;
            final zhz zhzVarA = zhvVar.a();
            this.b.post(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.ErrorHandler$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ywjVar.h(zhzVarA);
                }
            });
        } catch (RuntimeException e) {
            zhr.a(zhq.PLATYPUS, "All attempts to disable Platypus failed: ".concat(e.toString()));
        }
    }

    public final void b(Throwable th, String str) {
        yno.Q(this.c, th, str);
    }

    final void c(zhz zhzVar, zcf zcfVar) {
        try {
            g(zhzVar, new FallbackConfig(100000, false, false, false), zcfVar);
        } catch (RuntimeException e) {
            a(e, zcfVar.b);
        }
    }

    public final void d(PlatypusException platypusException, zcf zcfVar) {
        String str;
        try {
            if (this.d.aZ() && platypusException.a == PlatypusException.ErrorType.c) {
                this.a.d(zcfVar.a, platypusException);
                return;
            }
            long jA = this.a.a();
            int iOrdinal = platypusException.a.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                str = "fmt.unplayable";
            } else if (iOrdinal == 2) {
                str = "fmt.unparseable";
            } else if (iOrdinal == 3 || iOrdinal == 4) {
                str = "player.fatalexception";
            } else {
                if (iOrdinal != 5) {
                    throw new RuntimeException(null, null);
                }
                str = "buffer.mismatch";
            }
            zkf.d(str);
            zhv zhvVar = new zhv(str);
            zhvVar.e(jA);
            zhvVar.e = true;
            agke agkeVar = platypusException.b;
            zhvVar.c = agkeVar.isEmpty() ? null : new ager(";").b(agkeVar);
            zhvVar.d = platypusException;
            g(zhvVar.a(), new FallbackConfig(100000, false, false, false), zcfVar);
        } catch (RuntimeException e) {
            a(e, zcfVar.b);
        }
    }

    public final void e(QoeError qoeError, zcf zcfVar) {
        try {
            f(qoeError, new FallbackConfig(100000, false, false, false), zcfVar);
        } catch (RuntimeException e) {
            a(e, zcfVar.b);
        }
    }

    public final void f(QoeError qoeError, FallbackConfig fallbackConfig, zcf zcfVar) {
        try {
            g(zhz.d(qoeError, true), fallbackConfig, zcfVar);
        } catch (RuntimeException e) {
            a(e, zcfVar.b);
        }
    }
}
