package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axbv implements awou {
    public final Throwable a;
    private final /* synthetic */ awou b;

    public axbv(Throwable th, awou awouVar) {
        this.b = awouVar;
        this.a = th;
    }

    @Override // defpackage.awou
    public final Object fold(Object obj, awqk awqkVar) {
        return this.b.fold(obj, awqkVar);
    }

    @Override // defpackage.awou
    public final awos get(awot awotVar) {
        return this.b.get(awotVar);
    }

    @Override // defpackage.awou
    public final awou minusKey(awot awotVar) {
        return this.b.minusKey(awotVar);
    }

    @Override // defpackage.awou
    public final awou plus(awou awouVar) {
        return this.b.plus(awouVar);
    }
}
