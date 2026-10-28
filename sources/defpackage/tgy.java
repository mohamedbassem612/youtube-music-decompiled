package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tgy implements tha {
    private final /* synthetic */ int $cid;
    final /* synthetic */ avls a;

    public tgy(avls avlsVar, int i) {
        this.$cid = i;
        this.a = avlsVar;
    }

    @Override // defpackage.tha
    public final void a() {
        int i = this.$cid;
        avls avlsVar = this.a;
        if (i != 0) {
            avlsVar.a();
        } else {
            avlsVar.a();
        }
    }

    @Override // defpackage.tha
    public final void b(tnv tnvVar) {
        int i = this.$cid;
        avls avlsVar = this.a;
        toe toeVar = tnvVar.a;
        if (i != 0) {
            avlsVar.g(toeVar);
        } else {
            avlsVar.g(toeVar);
        }
    }

    @Override // defpackage.tha
    public final void c(tnw tnwVar) {
        if (this.$cid == 0) {
            this.a.c(tnwVar);
            return;
        }
        MessageLite messageLite = (MessageLite) tnwVar.a;
        messageLite.getClass();
        this.a.c(messageLite);
    }
}
