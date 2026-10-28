package androidx.car.app.utils;

import android.graphics.Rect;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;
import defpackage.aag;
import defpackage.aek;
import defpackage.aex;
import defpackage.afh;
import defpackage.boc;
import defpackage.ye;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class RemoteUtils$SurfaceCallbackStub extends ISurfaceCallback.Stub {
    private final boc mLifecycle;
    private ye mSurfaceCallback;

    RemoteUtils$SurfaceCallbackStub(boc bocVar, ye yeVar) {
        this.mLifecycle = bocVar;
        this.mSurfaceCallback = yeVar;
        bocVar.b(new afh(this));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public int getInterfaceVersion() {
        return 1;
    }

    /* JADX INFO: renamed from: lambda$onClick$7$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ Object m184xa15b6dc7(float f, float f2) {
        ye yeVar = this.mSurfaceCallback;
        if (yeVar == null) {
            return null;
        }
        yeVar.a();
        return null;
    }

    /* JADX INFO: renamed from: lambda$onFling$5$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ Object m185xdfc586b5(float f, float f2) {
        ye yeVar = this.mSurfaceCallback;
        if (yeVar == null) {
            return null;
        }
        yeVar.b();
        return null;
    }

    /* JADX INFO: renamed from: lambda$onScale$6$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ Object m186x6ea0bd66(float f, float f2, float f3) {
        ye yeVar = this.mSurfaceCallback;
        if (yeVar == null) {
            return null;
        }
        yeVar.c();
        return null;
    }

    /* JADX INFO: renamed from: lambda$onScroll$4$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ Object m187x3d2f790d(float f, float f2) {
        ye yeVar = this.mSurfaceCallback;
        if (yeVar == null) {
            return null;
        }
        yeVar.d();
        return null;
    }

    /* JADX INFO: renamed from: lambda$onStableAreaChanged$2$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ Object m188x93973048(Rect rect) {
        ye yeVar = this.mSurfaceCallback;
        if (yeVar == null) {
            return null;
        }
        yeVar.e();
        return null;
    }

    /* JADX INFO: renamed from: lambda$onSurfaceAvailable$0$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ Object m189x37c861a2(aek aekVar) {
        ye yeVar = this.mSurfaceCallback;
        if (yeVar == null) {
            return null;
        }
        yeVar.f();
        return null;
    }

    /* JADX INFO: renamed from: lambda$onSurfaceDestroyed$3$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ Object m190xde96e8ef(aek aekVar) {
        ye yeVar = this.mSurfaceCallback;
        if (yeVar == null) {
            return null;
        }
        yeVar.g();
        return null;
    }

    /* JADX INFO: renamed from: lambda$onVisibleAreaChanged$1$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ Object m191xaf1354a8(Rect rect) {
        ye yeVar = this.mSurfaceCallback;
        if (yeVar == null) {
            return null;
        }
        yeVar.h();
        return null;
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onClick(final float f, final float f2) {
        aag.c(this.mLifecycle, "onClick", new aex() { // from class: afa
            @Override // defpackage.aex
            public final Object a() {
                return this.a.m184xa15b6dc7(f, f2);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onFling(final float f, final float f2) {
        aag.c(this.mLifecycle, "onFling", new aex() { // from class: afe
            @Override // defpackage.aex
            public final Object a() {
                return this.a.m185xdfc586b5(f, f2);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScale(final float f, final float f2, final float f3) {
        aag.c(this.mLifecycle, "onScale", new aex() { // from class: aff
            @Override // defpackage.aex
            public final Object a() {
                return this.a.m186x6ea0bd66(f, f2, f3);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScroll(final float f, final float f2) {
        aag.c(this.mLifecycle, "onScroll", new aex() { // from class: afd
            @Override // defpackage.aex
            public final Object a() {
                return this.a.m187x3d2f790d(f, f2);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onStableAreaChanged(final Rect rect, IOnDoneCallback iOnDoneCallback) {
        aag.d(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new aex() { // from class: afg
            @Override // defpackage.aex
            public final Object a() {
                return this.a.m188x93973048(rect);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceAvailable(final aek aekVar, IOnDoneCallback iOnDoneCallback) {
        aag.d(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new aex() { // from class: afc
            @Override // defpackage.aex
            public final Object a() {
                return this.a.m189x37c861a2(aekVar);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceDestroyed(final aek aekVar, IOnDoneCallback iOnDoneCallback) {
        aag.d(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new aex() { // from class: aez
            @Override // defpackage.aex
            public final Object a() {
                return this.a.m190xde96e8ef(aekVar);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onVisibleAreaChanged(final Rect rect, IOnDoneCallback iOnDoneCallback) {
        aag.d(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new aex() { // from class: afb
            @Override // defpackage.aex
            public final Object a() {
                return this.a.m191xaf1354a8(rect);
            }
        });
    }
}
