package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sou {
    private boolean a;
    private agev b;
    private agev c;
    private agev d;
    private byte e;

    public sou() {
        agdf agdfVar = agdf.a;
        this.b = agdfVar;
        this.c = agdfVar;
        this.d = agdfVar;
    }

    public final sov a() {
        if (this.e == 1) {
            return new sov(this.a, this.b, this.c, this.d);
        }
        throw new IllegalStateException("Missing required properties: isFullscreen");
    }

    public final void b(agev agevVar) {
        if (agevVar == null) {
            throw new NullPointerException("Null actionText");
        }
        this.c = agevVar;
    }

    public final void c(agev agevVar) {
        if (agevVar == null) {
            throw new NullPointerException("Null icon");
        }
        this.d = agevVar;
    }

    public final void d(boolean z) {
        this.a = z;
        this.e = (byte) 1;
    }

    public final void e(agev agevVar) {
        if (agevVar == null) {
            throw new NullPointerException("Null titleText");
        }
        this.b = agevVar;
    }
}
