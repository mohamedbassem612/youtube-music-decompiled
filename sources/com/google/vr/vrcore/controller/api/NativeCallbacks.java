package com.google.vr.vrcore.controller.api;

import defpackage.aukj;
import defpackage.aukk;
import defpackage.aukl;
import defpackage.aukn;
import defpackage.auko;
import defpackage.aukp;
import defpackage.aukr;
import defpackage.auks;
import defpackage.aukv;
import defpackage.aukw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class NativeCallbacks implements ControllerServiceBridge.Callbacks {
    private final long a;
    private boolean b;

    public NativeCallbacks(long j) {
        this.a = j;
    }

    private native void handleAccelEvent(long j, int i, long j2, float f, float f2, float f3);

    private native void handleBatteryEvent(long j, int i, long j2, boolean z, int i2);

    private native void handleButtonEvent(long j, int i, long j2, int i2, boolean z);

    private native void handleControllerRecentered(long j, int i, long j2, float f, float f2, float f3, float f4);

    private native void handleGyroEvent(long j, int i, long j2, float f, float f2, float f3);

    private native void handleOrientationEvent(long j, int i, long j2, float f, float f2, float f3, float f4);

    private native void handlePositionEvent(long j, int i, long j2, float f, float f2, float f3);

    private native void handleServiceConnected(long j, int i);

    private native void handleServiceDisconnected(long j);

    private native void handleServiceFailed(long j);

    private native void handleServiceInitFailed(long j, int i);

    private native void handleServiceUnavailable(long j);

    private native void handleStateChanged(long j, int i, int i2);

    private native void handleTouchEvent(long j, int i, long j2, int i2, float f, float f2);

    private native void handleTrackingStatusEvent(long j, int i, long j2, int i2);

    private final void j(auko aukoVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        while (!this.b && i6 < (i5 = aukoVar.l)) {
            if (i6 >= i5) {
                throw new IndexOutOfBoundsException();
            }
            aukj aukjVar = aukoVar.m[i6];
            NativeCallbacks nativeCallbacks = this;
            nativeCallbacks.handleAccelEvent(this.a, aukjVar.e, aukjVar.d, aukjVar.a, aukjVar.b, aukjVar.c);
            i6++;
            this = nativeCallbacks;
        }
        NativeCallbacks nativeCallbacks2 = this;
        for (int i7 = 0; !nativeCallbacks2.b && i7 < (i4 = aukoVar.n); i7++) {
            if (i7 >= i4) {
                throw new IndexOutOfBoundsException();
            }
            aukl auklVar = aukoVar.o[i7];
            nativeCallbacks2.handleButtonEvent(nativeCallbacks2.a, auklVar.e, auklVar.d, auklVar.a, auklVar.b);
        }
        for (int i8 = 0; !nativeCallbacks2.b && i8 < (i3 = aukoVar.p); i8++) {
            if (i8 >= i3) {
                throw new IndexOutOfBoundsException();
            }
            aukp aukpVar = aukoVar.q[i8];
            nativeCallbacks2.handleGyroEvent(nativeCallbacks2.a, aukpVar.e, aukpVar.d, aukpVar.a, aukpVar.b, aukpVar.c);
        }
        for (int i9 = 0; !nativeCallbacks2.b && i9 < (i2 = aukoVar.r); i9++) {
            if (i9 >= i2) {
                throw new IndexOutOfBoundsException();
            }
            aukr aukrVar = aukoVar.s[i9];
            nativeCallbacks2.handleOrientationEvent(nativeCallbacks2.a, aukrVar.e, aukrVar.d, aukrVar.a, aukrVar.b, aukrVar.c, aukrVar.f);
        }
        for (int i10 = 0; !nativeCallbacks2.b && i10 < (i = aukoVar.t); i10++) {
            if (i10 >= i) {
                throw new IndexOutOfBoundsException();
            }
            aukv aukvVar = aukoVar.u[i10];
            nativeCallbacks2.handleTouchEvent(nativeCallbacks2.a, aukvVar.e, aukvVar.d, aukvVar.b, aukvVar.c, aukvVar.f);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void a(auko aukoVar) {
        if (!this.b) {
            j(aukoVar);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void b(aukn auknVar) throws Throwable {
        NativeCallbacks nativeCallbacks;
        NativeCallbacks nativeCallbacks2;
        int i;
        try {
            try {
                if (!this.b) {
                    j(auknVar);
                    int i2 = 0;
                    int i3 = 0;
                    while (!this.b && i3 < (i = auknVar.c)) {
                        if (i3 >= i) {
                            throw new IndexOutOfBoundsException();
                        }
                        auks auksVar = auknVar.d[i3];
                        NativeCallbacks nativeCallbacks3 = this;
                        try {
                            nativeCallbacks3.handlePositionEvent(this.a, auksVar.e, auksVar.d, auksVar.a, auksVar.b, auksVar.c);
                            i3++;
                            this = nativeCallbacks3;
                        } catch (Throwable th) {
                            th = th;
                            nativeCallbacks = nativeCallbacks3;
                        }
                        Throwable th2 = th;
                        throw th2;
                    }
                    nativeCallbacks2 = this;
                    while (!nativeCallbacks2.b) {
                        int i4 = auknVar.h;
                        if (i2 >= i4) {
                            if (!auknVar.e) {
                                break;
                            }
                            aukk aukkVar = auknVar.f;
                            nativeCallbacks2.handleBatteryEvent(nativeCallbacks2.a, aukkVar.e, aukkVar.d, aukkVar.b, aukkVar.a);
                            return;
                        }
                        if (i2 >= i4) {
                            throw new IndexOutOfBoundsException();
                        }
                        aukw aukwVar = auknVar.i[i2];
                        nativeCallbacks2.handleTrackingStatusEvent(nativeCallbacks2.a, aukwVar.e, aukwVar.d, aukwVar.a);
                        i2++;
                    }
                } else {
                    nativeCallbacks2 = this;
                }
            } catch (Throwable th3) {
                th = th3;
                nativeCallbacks = this;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void c(aukr aukrVar) throws Throwable {
        NativeCallbacks nativeCallbacks;
        try {
            try {
                if (this.b) {
                    nativeCallbacks = this;
                } else {
                    nativeCallbacks = this;
                    nativeCallbacks.handleControllerRecentered(this.a, aukrVar.e, aukrVar.d, aukrVar.a, aukrVar.b, aukrVar.c, aukrVar.f);
                }
                return;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
        throw th;
    }

    public synchronized void close() {
        this.b = true;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void d(int i, int i2) {
        if (!this.b) {
            handleStateChanged(this.a, i, i2);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void e() {
        if (!this.b) {
            handleServiceDisconnected(this.a);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void f() {
        if (!this.b) {
            handleServiceFailed(this.a);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void g(int i) {
        if (!this.b) {
            handleServiceInitFailed(this.a, i);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void h() {
        if (!this.b) {
            handleServiceUnavailable(this.a);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void i() {
        if (!this.b) {
            handleServiceConnected(this.a, 1);
        }
    }
}
