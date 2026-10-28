package com.google.android.libraries.youtube.player.background.service;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import defpackage.aavw;
import defpackage.aavx;
import defpackage.aavy;
import defpackage.abnc;
import defpackage.abrp;
import defpackage.abvk;
import defpackage.agkz;
import defpackage.agqj;
import defpackage.agrx;
import defpackage.agso;
import defpackage.ahhp;
import defpackage.axsp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class BackgroundPlayerService extends aavy {
    private static final agkz g = new agqj("androidx.core.pip.contentpip.ContentPipInternalActivity");
    public abvk a;
    public abrp b;
    public abnc c;
    public axsp d;
    public axsp e;
    public ahhp f;
    private final IBinder h = new aavx();
    private boolean i;
    private boolean j;

    private final void c() {
        if (this.i) {
            return;
        }
        this.i = true;
        abvk abvkVar = this.a;
        if (abvkVar != null) {
            abvkVar.B();
        }
        abrp abrpVar = this.b;
        if (abrpVar != null) {
            abrpVar.f(this);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        agrx agrxVar = agso.a;
        if (!this.j) {
            b();
            this.j = true;
        }
        c();
        return this.h;
    }

    @Override // defpackage.aavy, android.app.Service
    public final void onCreate() {
        agrx agrxVar = agso.a;
        super.onCreate();
        this.j = true;
        c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        agrx agrxVar = agso.a;
        axsp axspVar = this.d;
        if (axspVar != null) {
            axspVar.kk(aavw.a);
        }
        abvk abvkVar = this.a;
        boolean z = abvkVar != null && abvkVar.W();
        abvk abvkVar2 = this.a;
        if (abvkVar2 != null && z) {
            abvkVar2.r();
        }
        abrp abrpVar = this.b;
        if (abrpVar != null) {
            abrpVar.g(this);
            this.b.d(z);
        }
        abnc abncVar = this.c;
        if (abncVar != null) {
            abncVar.l(false);
        }
        this.i = false;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        agrx agrxVar = agso.a;
        abrp abrpVar = this.b;
        if (abrpVar == null) {
            return 2;
        }
        abrpVar.e(this);
        return 2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [abtj, java.lang.Object] */
    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        ComponentName component;
        agrx agrxVar = agso.a;
        if (intent != null && (component = intent.getComponent()) != null) {
            if (g.contains(component.getClassName())) {
                return;
            }
        }
        axsp axspVar = this.e;
        if (axspVar != null) {
            axspVar.kk(aavw.b);
        }
        ahhp ahhpVar = this.f;
        if (ahhpVar == null || !ahhpVar.a.d()) {
            return;
        }
        ((abvk) ahhpVar.b).r();
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        agrx agrxVar = agso.a;
        return false;
    }
}
