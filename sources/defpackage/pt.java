package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class pt extends pp {
    private final int a;

    public pt(int i) {
        this.a = i;
    }

    @Override // defpackage.pp
    public final int i(oh ohVar) {
        int i = this.a;
        return i | (i << 16);
    }
}
