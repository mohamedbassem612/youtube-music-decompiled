package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acwu {
    public acwm a;
    public Object b;
    public xgn c;
    public ajwo d;
    public byte e;
    private akdd f;
    private boolean g;
    private boolean h;
    private boolean i;

    public final acwv a() {
        akdd akddVar;
        if (this.e == 31 && (akddVar = this.f) != null) {
            return new acwv(akddVar, this.g, this.h, this.i, this.a, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" confirmDialogRenderer");
        }
        if ((this.e & 1) == 0) {
            sb.append(" cancelOnBackPress");
        }
        if ((this.e & 2) == 0) {
            sb.append(" cancelOnTouchOutside");
        }
        if ((this.e & 4) == 0) {
            sb.append(" useSubtitleIfAvailable");
        }
        if ((this.e & 8) == 0) {
            sb.append(" enableMonoStyleButtons");
        }
        if ((this.e & 16) == 0) {
            sb.append(" useRendererButtonStyles");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.g = z;
        this.e = (byte) (this.e | 1);
    }

    public final void c(boolean z) {
        this.h = z;
        this.e = (byte) (this.e | 2);
    }

    public final void d(akdd akddVar) {
        if (akddVar == null) {
            throw new NullPointerException("Null confirmDialogRenderer");
        }
        this.f = akddVar;
    }

    public final void e(boolean z) {
        this.i = z;
        this.e = (byte) (this.e | 8);
    }

    public final void f() {
        this.e = (byte) (this.e | 4);
    }
}
