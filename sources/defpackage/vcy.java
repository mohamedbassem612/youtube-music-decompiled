package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vcy {
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    public Optional d = Optional.empty();
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private byte i;

    public final vcz a() {
        if (this.i == 15) {
            return new vcz(this.e, this.f, this.g, this.a, this.b, this.c, this.d, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.i & 1) == 0) {
            sb.append(" showDeselectItem");
        }
        if ((this.i & 2) == 0) {
            sb.append(" showMoreMediaItem");
        }
        if ((this.i & 4) == 0) {
            sb.append(" centerHorizontal");
        }
        if ((this.i & 8) == 0) {
            sb.append(" useGlideForGreenScreenPicker");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.g = z;
        this.i = (byte) (this.i | 4);
    }

    public final void c(boolean z) {
        this.e = z;
        this.i = (byte) (this.i | 1);
    }

    public final void d(boolean z) {
        this.f = z;
        this.i = (byte) (this.i | 2);
    }

    public final void e(boolean z) {
        this.h = z;
        this.i = (byte) (this.i | 8);
    }
}
