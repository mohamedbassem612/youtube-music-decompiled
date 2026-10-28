package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class abgf {
    public String a;
    private boolean b;
    private boolean c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;

    static abgf a() {
        abgf abgfVar = new abgf();
        abgfVar.o();
        return abgfVar;
    }

    public final abgg b() {
        if (this.m == 262143 && this.a != null) {
            return new abgg(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" name");
        }
        if ((this.m & 1) == 0) {
            sb.append(" alwaysHideControls");
        }
        if ((this.m & 2) == 0) {
            sb.append(" supportsTimeBar");
        }
        if ((this.m & 4) == 0) {
            sb.append(" progressColor");
        }
        if ((this.m & 8) == 0) {
            sb.append(" supportsBuffered");
        }
        if ((this.m & 16) == 0) {
            sb.append(" supportsScrubber");
        }
        if ((this.m & 32) == 0) {
            sb.append(" supportsPlayHQCC");
        }
        if ((this.m & 64) == 0) {
            sb.append(" supportsNextPrevious");
        }
        if ((this.m & SemanticState.Focused) == 0) {
            sb.append(" alwaysVisibleTimeBar");
        }
        if ((this.m & SemanticState.Hidden) == 0) {
            sb.append(" supportsShowTime");
        }
        if ((this.m & SemanticState.LiveRegion) == 0) {
            sb.append(" supportsAdMarkers");
        }
        if ((this.m & SemanticState.ReadOnly) == 0) {
            sb.append(" supportsMacroMarkers");
        }
        if ((this.m & SemanticState.Modal) == 0) {
            sb.append(" supportsShowRelativeScrubTimeOnly");
        }
        if ((this.m & SemanticState.Obscured) == 0) {
            sb.append(" showScrubTimeWhileScrubbing");
        }
        if ((this.m & SemanticState.Multiline) == 0) {
            sb.append(" supportsColorizedProgressBar");
        }
        if ((this.m & 16384) == 0) {
            sb.append(" enableAutohide");
        }
        if ((this.m & 32768) == 0) {
            sb.append(" supportsProgressBarVisibleDurationOverride");
        }
        if ((this.m & 65536) == 0) {
            sb.append(" supportsGradient");
        }
        if ((this.m & 131072) == 0) {
            sb.append(" isSeekableAd");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(boolean z) {
        this.b = z;
        this.m |= 1;
    }

    public final void d(boolean z) {
        this.i = z;
        this.m |= SemanticState.Focused;
    }

    public final void e(int i) {
        this.d = i;
        this.m |= 4;
    }

    public final void f(boolean z) {
        this.k = z;
        this.m |= SemanticState.LiveRegion;
    }

    public final void g(boolean z) {
        this.e = z;
        this.m |= 8;
    }

    public final void h(boolean z) {
        this.h = z;
        this.m |= 64;
    }

    public final void i(boolean z) {
        this.g = z;
        this.m |= 32;
    }

    public final void j(boolean z) {
        this.f = z;
        this.m |= 16;
    }

    public final void k(boolean z) {
        this.l = z;
        this.m |= SemanticState.Modal;
    }

    public final void l(boolean z) {
        this.j = z;
        this.m |= SemanticState.Hidden;
    }

    public final void m(boolean z) {
        this.c = z;
        this.m |= 2;
    }

    public final void n() {
        this.m |= 16384;
    }

    public final void o() {
        this.m |= 131072;
    }

    public final void p() {
        this.m |= SemanticState.Obscured;
    }

    public final void q() {
        this.m |= SemanticState.Multiline;
    }

    public final void r() {
        this.m |= 65536;
    }

    public final void s() {
        this.m |= SemanticState.ReadOnly;
    }

    public final void t() {
        this.m |= 32768;
    }
}
