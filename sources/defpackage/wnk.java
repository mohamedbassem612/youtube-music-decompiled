package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class wnk implements zza {
    final /* synthetic */ wni a;
    final /* synthetic */ wlu b;
    final /* synthetic */ zza c;
    final /* synthetic */ wnl d;

    public wnk(wnl wnlVar, wni wniVar, wlu wluVar, zza zzaVar) {
        this.a = wniVar;
        this.b = wluVar;
        this.c = zzaVar;
        this.d = wnlVar;
    }

    @Override // defpackage.tnh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        MessageLite messageLite = (MessageLite) obj;
        try {
            wnl wnlVar = this.d;
            wnlVar.l(messageLite);
            Object objH = wnlVar.h(messageLite);
            this.a.b(objH);
            wnlVar.m(this.b, objH);
            this.c.a(objH);
        } catch (Exception e) {
            jj(new toe(e));
        }
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        this.d.n(this.b);
        this.c.jj(toeVar);
    }

    @Override // defpackage.zza
    public final void jk() {
        this.c.jk();
    }
}
