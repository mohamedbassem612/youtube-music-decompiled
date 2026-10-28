package com.google.android.libraries.youtube.mdx.mediaroute.providerservice;

import android.content.Context;
import defpackage.aavj;
import defpackage.afnb;
import defpackage.afov;
import defpackage.afty;
import defpackage.afun;
import defpackage.afuo;
import defpackage.afuq;
import defpackage.afuu;
import defpackage.afuw;
import defpackage.afuy;
import defpackage.afvf;
import defpackage.afvl;
import defpackage.afvn;
import defpackage.afwt;
import defpackage.aguu;
import defpackage.ahno;
import defpackage.ahqj;
import defpackage.ahub;
import defpackage.dhp;
import defpackage.qpj;
import defpackage.vxz;
import defpackage.xuq;
import defpackage.xur;
import defpackage.xus;
import j$.lang.Iterable$EL;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class MdxMediaRouteProviderService extends xuq implements afnb {
    public ahub e;
    private xur f;
    private boolean g;
    private boolean h;
    private final ahqj i = new ahqj(this);

    @Deprecated
    public MdxMediaRouteProviderService() {
        qpj.c();
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [awmd, java.lang.Object] */
    @Override // defpackage.dic
    public final dhp b() {
        ahqj ahqjVar = this.i;
        afuy afuyVarC = ahqjVar.c();
        afuo afuoVar = new afuo(afwt.d(174, ahqjVar.e("onCreateMediaRouteProvider"), afuyVarC, true), ahqjVar.d("onCreateMediaRouteProvider"), afty.b());
        try {
            xur xurVarPeer = peer();
            dhp dhpVar = ((vxz) xurVarPeer.b).l(160, 45662068L, false) ? (dhp) xurVarPeer.a.io() : null;
            afuoVar.close();
            return dhpVar;
        } catch (Throwable th) {
            try {
                afuoVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.afnb
    public final Class getPeerClass() {
        return xur.class;
    }

    @Override // defpackage.afnb
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final xur peer() {
        xur xurVar = this.f;
        if (xurVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.h) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return xurVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xuq, android.app.Service
    public final void onCreate() {
        final ahqj ahqjVar = this.i;
        afuy afuyVarC = ahqjVar.c();
        final afvl afvlVarB = afty.b();
        final afun afunVarB = null;
        afvl afvlVar = null;
        if (!afty.o()) {
            afvl afvlVar2 = afty.k;
            if (afvlVar2 != null) {
                afty.k = null;
                afvlVar = afvlVar2;
            }
            if (afvlVar != null) {
                afuq afuqVar = new afuq();
                afty.d(afvlVar);
                afuw afuwVarB = afuy.b();
                afuwVarB.a(afvf.c, afuqVar);
                ahqjVar.b = afwt.d(172, "Creating ".concat(String.valueOf(ahqjVar.a.getClass().getSimpleName())), ((afuy) afuwVarB).f(), true);
                afunVarB = afvlVar;
            } else {
                Object obj = ahqjVar.a;
                afunVarB = ahno.aC((Context) obj).b(171, "Creating ".concat(String.valueOf(obj.getClass().getSimpleName())), afvf.a);
            }
        }
        final afuu afuuVarD = afwt.d(173, ahqjVar.e("onCreate"), afuyVarC, true);
        afvn afvnVar = new afvn() { // from class: afup
            /* JADX WARN: Type inference failed for: r0v2, types: [afvn, java.lang.Object] */
            @Override // defpackage.afvn, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                afuuVarD.close();
                ?? r0 = ahqjVar.b;
                if (r0 != 0) {
                    r0.close();
                }
                afvn afvnVar2 = afunVarB;
                if (afvnVar2 != null) {
                    afvnVar2.close();
                }
                afty.d(afvlVarB);
            }
        };
        try {
            this.g = true;
            ahno.O(getApplication() instanceof afov);
            if (this.f == null) {
                if (!this.g) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                }
                if (this.h) {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
                afuu afuuVarC = afwt.c(86, "CreateComponent");
                try {
                    generatedComponent();
                    afuuVarC.close();
                    afuu afuuVarC2 = afwt.c(87, "CreatePeer");
                    try {
                        this.f = ((xus) aguu.as(this, xus.class)).a();
                        afuuVarC2.close();
                    } catch (Throwable th) {
                        try {
                            afuuVarC2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        afuuVarC.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            super.onCreate();
            this.g = false;
            afvnVar.close();
        } catch (Throwable th5) {
            try {
                afvnVar.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [aunn, java.lang.Object] */
    @Override // defpackage.dic, android.app.Service
    public final void onDestroy() {
        ahqj ahqjVar = this.i;
        afuy afuyVarC = ahqjVar.c();
        afvl afvlVarB = afty.b();
        afuo afuoVar = new afuo(afwt.d(175, ahqjVar.e("onDestroy"), afuyVarC, true), ahqjVar.d("Destroying"), afvlVarB);
        try {
            ahub ahubVar = this.e;
            if (ahubVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onDestroy called before onCreate.");
            }
            Iterable$EL.forEach((Set) ahubVar.a.io(), new aavj(10));
            super.onDestroy();
            this.h = true;
            afuoVar.close();
        } catch (Throwable th) {
            try {
                afuoVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
