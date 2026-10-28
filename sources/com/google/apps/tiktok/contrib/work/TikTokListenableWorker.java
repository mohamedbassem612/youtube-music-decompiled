package com.google.apps.tiktok.contrib.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.cardboard.sdk.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import defpackage.abzk;
import defpackage.afln;
import defpackage.afly;
import defpackage.afuu;
import defpackage.afuy;
import defpackage.afvn;
import defpackage.afvq;
import defpackage.afwl;
import defpackage.afwt;
import defpackage.agrc;
import defpackage.agrf;
import defpackage.agrq;
import defpackage.ahng;
import defpackage.ahno;
import defpackage.awmd;
import defpackage.dze;
import defpackage.qds;
import defpackage.qdv;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class TikTokListenableWorker extends dze {
    private final afvq f;
    private final Map g;
    private final awmd h;
    private final WorkerParameters i;
    private final afuy j;
    private afln k;
    private boolean l;
    private static final agrf e = agrf.h("com/google/apps/tiktok/contrib/work/TikTokListenableWorker");
    public static final qds d = new qdv("UNKNOWN");

    public TikTokListenableWorker(Context context, afvq afvqVar, Map map, awmd awmdVar, WorkerParameters workerParameters, afuy afuyVar) {
        super(context, workerParameters);
        this.k = null;
        this.l = false;
        this.g = map;
        this.h = awmdVar;
        this.f = afvqVar;
        this.i = workerParameters;
        this.j = afuyVar;
    }

    public static /* synthetic */ void c(ListenableFuture listenableFuture, qds qdsVar) {
        try {
            ahng.v(listenableFuture);
        } catch (CancellationException unused) {
            ((agrc) ((agrc) e.c()).k("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "logOnCancellationOrFailure", 194, "TikTokListenableWorker.java")).w("TikTokListenableWorker was cancelled while running client worker: %s", qdsVar);
        } catch (ExecutionException e2) {
            ((agrc) ((agrc) ((agrc) e.b()).j(e2.getCause())).k("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "logOnCancellationOrFailure", (char) 189, "TikTokListenableWorker.java")).w("TikTokListenableWorker encountered an exception while running client worker: %s", qdsVar);
        }
    }

    @Override // defpackage.dze
    public final ListenableFuture a() {
        afvq afvqVar = this.f;
        WorkerParameters workerParameters = this.i;
        String strB = afly.b(workerParameters);
        afvn afvnVarC = afvqVar.c(123, "WorkManager:TikTokListenableWorker getForegroundInfoAsync()");
        try {
            afuu afuuVarD = afwt.d(R.styleable.AppCompatTheme_windowMinWidthMajor, strB + " getForegroundInfoAsync()", this.j, true);
            try {
                ahno.P(this.k == null, "A TikTokListenableWorker's worker was null during getForegroundInfoAsync(), which should always be called before `startWork()`. Please report any instance of this Exception at go/tiktok-bug.");
                afln aflnVar = (afln) this.h.io();
                this.k = aflnVar;
                ListenableFuture listenableFutureB = aflnVar.b(workerParameters);
                afuuVarD.a(listenableFutureB);
                afuuVarD.close();
                afvnVarC.close();
                return listenableFutureB;
            } catch (Throwable th) {
                try {
                    afuuVarD.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                afvnVarC.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.dze
    public final ListenableFuture b() {
        afvq afvqVar = this.f;
        WorkerParameters workerParameters = this.i;
        String strB = afly.b(workerParameters);
        afvn afvnVarC = afvqVar.c(R.styleable.AppCompatTheme_windowMinWidthMinor, "WorkManager:TikTokListenableWorker startWork");
        try {
            int i = 1;
            afuu afuuVarD = afwt.d(R.styleable.AppCompatTheme_windowNoTitle, strB + " startWork()", this.j, true);
            try {
                String strB2 = afly.b(workerParameters);
                afuu afuuVarF = afwt.f(127, String.valueOf(strB2).concat(" startWork()"));
                try {
                    ahno.P(!this.l, "A TikTokListenableWorker started twice. Please report any instance of this Exception at go/tiktok-bug.");
                    this.l = true;
                    afln aflnVar = this.k;
                    if (aflnVar == null) {
                        aflnVar = (afln) this.h.io();
                        this.k = aflnVar;
                    }
                    aflnVar.d();
                    this.k.c(new abzk(this, 9));
                    ListenableFuture listenableFutureA = this.k.a(workerParameters);
                    listenableFutureA.addListener(afwl.i(new agrq(listenableFutureA, (qds) j$.util.Map.EL.getOrDefault(this.g, strB2, d), i, (byte[]) null)), MoreExecutors.directExecutor());
                    afuuVarF.a(listenableFutureA);
                    afuuVarF.close();
                    afuuVarD.a(listenableFutureA);
                    afuuVarD.close();
                    afvnVarC.close();
                    return listenableFutureA;
                } catch (Throwable th) {
                    try {
                        afuuVarF.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    afuuVarD.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                afvnVarC.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }
}
