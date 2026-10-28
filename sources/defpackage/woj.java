package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class woj implements zza {
    final /* synthetic */ woo a;
    final /* synthetic */ zza b;
    final /* synthetic */ aaok c;

    public woj(aaok aaokVar, woo wooVar, zza zzaVar) {
        this.c = aaokVar;
        this.a = wooVar;
        this.b = zzaVar;
    }

    @Override // defpackage.tnh
    public final void a(Object obj) {
        if (obj instanceof wfy) {
            this.c.s(this.a, (wfy) obj);
        }
        this.b.a(obj);
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        this.b.jj(toeVar);
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
