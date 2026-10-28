package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dab implements cwd {
    public static final dab a = new dab(true);
    public static final dab b = new dab(false);
    public final boolean c;

    private dab(boolean z) {
        this.c = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncorrectFragmentation{expected=");
        sb.append(!this.c);
        sb.append('}');
        return sb.toString();
    }
}
