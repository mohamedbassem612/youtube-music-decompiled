package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class tas extends tcd {
    public String d;

    public tas(String str) {
        this.d = str;
    }

    public final void b(String str) {
        int i = typ.a;
        if (str.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.d = str;
    }

    public tas() {
    }

    @Override // defpackage.tcd
    public final void c() {
    }
}
