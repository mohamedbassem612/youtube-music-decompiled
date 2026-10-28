package app.rive;

import app.rive.core.RiveSurface;
import defpackage.ahz;
import defpackage.aia;
import defpackage.aib;
import defpackage.aid;
import defpackage.aii;
import defpackage.akt;
import defpackage.akz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveSurfaceState {
    private akt entryDirection;
    private final akz focusRequester;
    private final aia focused$delegate;
    private final ahz height$delegate;
    private final aia surface$delegate;
    private final aia textureView$delegate;
    private final ahz width$delegate;

    public RiveSurfaceState() {
        aii aiiVar = aii.c;
        this.surface$delegate = new aid(null, aiiVar);
        this.width$delegate = new aib(0);
        this.height$delegate = new aib(0);
        this.textureView$delegate = new aid(null, aiiVar);
        this.focused$delegate = new aid(Boolean.FALSE, aiiVar);
        this.focusRequester = new akz();
    }

    /* JADX INFO: renamed from: getEntryDirection-6Ue6xsY, reason: not valid java name */
    public final akt m315getEntryDirection6Ue6xsY() {
        return this.entryDirection;
    }

    public final akz getFocusRequester() {
        return this.focusRequester;
    }

    public final boolean getFocused() {
        return ((Boolean) this.focused$delegate.e()).booleanValue();
    }

    public final int getHeight() {
        return this.height$delegate.a();
    }

    public final RiveSurface getSurface() {
        return (RiveSurface) this.surface$delegate.e();
    }

    public final RiveTextureView getTextureView() {
        return (RiveTextureView) this.textureView$delegate.e();
    }

    public final int getWidth() {
        return this.width$delegate.a();
    }

    /* JADX INFO: renamed from: setEntryDirection-RvHMakY, reason: not valid java name */
    public final void m316setEntryDirectionRvHMakY(akt aktVar) {
        this.entryDirection = aktVar;
    }

    public final void setFocused(boolean z) {
        this.focused$delegate.f(Boolean.valueOf(z));
    }

    public final void setHeight(int i) {
        this.height$delegate.c(i);
    }

    public final void setSurface(RiveSurface riveSurface) {
        this.surface$delegate.f(riveSurface);
    }

    public final void setTextureView(RiveTextureView riveTextureView) {
        this.textureView$delegate.f(riveTextureView);
    }

    public final void setWidth(int i) {
        this.width$delegate.c(i);
    }
}
