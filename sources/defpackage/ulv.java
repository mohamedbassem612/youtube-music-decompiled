package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ulv {
    public ulw a;
    public akhk b;
    public akhj c;
    public byte d;
    public int e;
    private boolean f;
    private float g;
    private boolean h;
    private Optional i;
    private Optional j;

    public ulv(ulx ulxVar) {
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.f = ulxVar.a;
        this.e = ulxVar.i;
        this.g = ulxVar.b;
        this.h = ulxVar.c;
        this.a = ulxVar.d;
        this.i = ulxVar.e;
        this.j = ulxVar.f;
        this.b = ulxVar.g;
        this.c = ulxVar.h;
        this.d = (byte) -1;
    }

    public final ulx a() {
        int i;
        ulw ulwVar;
        akhk akhkVar;
        akhj akhjVar;
        if (this.d == -1 && (i = this.e) != 0 && (ulwVar = this.a) != null && (akhkVar = this.b) != null && (akhjVar = this.c) != null) {
            return new ulx(this.f, i, this.g, this.h, ulwVar, this.i, this.j, akhkVar, akhjVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" isScrollingView");
        }
        if (this.e == 0) {
            sb.append(" contentScale");
        }
        if ((this.d & 2) == 0) {
            sb.append(" containerAspectRatio");
        }
        if ((this.d & 4) == 0) {
            sb.append(" useSurfaceView");
        }
        if ((this.d & 8) == 0) {
            sb.append(" isTapToPlayPauseEnabled");
        }
        if (this.a == null) {
            sb.append(" swipeConfig");
        }
        if ((this.d & 16) == 0) {
            sb.append(" isHorizontalCropEnabled");
        }
        if ((this.d & 32) == 0) {
            sb.append(" isBackgroundProtectionEnabled");
        }
        if ((this.d & 64) == 0) {
            sb.append(" enableLoadingSpinner");
        }
        if ((this.d & 128) == 0) {
            sb.append(" isCropGuidelineEnabled");
        }
        if (this.b == null) {
            sb.append(" gestureConfig");
        }
        if (this.c == null) {
            sb.append(" borderStyle");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(float f) {
        this.g = f;
        this.d = (byte) (this.d | 2);
    }

    public final void c(boolean z) {
        this.f = z;
        this.d = (byte) (this.d | 1);
    }

    public final void d(boolean z) {
        this.h = z;
        this.d = (byte) (this.d | 4);
    }

    public ulv() {
        this.i = Optional.empty();
        this.j = Optional.empty();
    }
}
