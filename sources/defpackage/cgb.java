package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgb extends Exception {
    public final boolean a;
    public final bse b;

    public cgb(int i, int i2, int i3, int i4, bse bseVar, boolean z, Exception exc) {
        String strValueOf = String.valueOf(bseVar);
        StringBuilder sb = new StringBuilder("AudioTrack init failed 0 Config(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append(true != z ? "" : " (recoverable)");
        super(sb.toString(), exc);
        this.a = z;
        this.b = bseVar;
    }
}
