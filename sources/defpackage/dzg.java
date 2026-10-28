package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzg extends dzu {
    @Override // defpackage.dzu
    public final /* bridge */ /* synthetic */ ayq a() {
        if (this.a && this.c.l.d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        return new ayq(this);
    }
}
