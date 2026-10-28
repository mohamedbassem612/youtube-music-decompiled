package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qss {
    public aero c;
    public agev b = agdf.a;
    public final agjz a = new agjz(4);
    private final agjz d = new agjz(4);

    public final void a(String str) {
        this.a.h(new qst(str));
    }

    public final syn b() {
        if (this.c == null) {
            this.c = new aero();
        }
        return new syn(this.b, this.a.g(), this.d.g(), this.c);
    }
}
