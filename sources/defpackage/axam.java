package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axam extends axbg {
    public long a = -1;
    public awoq b;

    @Override // defpackage.axbg
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        axak axakVar = (axak) obj;
        if (this.a >= 0) {
            return false;
        }
        long j = axakVar.b;
        if (j < axakVar.c) {
            axakVar.c = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.axbg
    public final /* bridge */ /* synthetic */ awoq[] b(Object obj) {
        boolean z = awuv.a;
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((axak) obj).i(j);
    }
}
