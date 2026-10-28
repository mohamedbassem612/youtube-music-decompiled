package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class tww implements twy {
    public final int a;

    public tww(int i) {
        this.a = i;
    }

    @Override // defpackage.twy
    public final int a() {
        if (this.a == 4) {
            return 0;
        }
        return b();
    }

    public int b() {
        return e().size();
    }

    @Override // defpackage.twy
    public final int c() {
        return this.a;
    }
}
