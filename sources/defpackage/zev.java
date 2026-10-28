package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zev {
    public final long a;
    public final ywk b;

    public zev(ywk ywkVar, long j) {
        this.b = ywkVar;
        this.a = j;
    }

    public final zev a(ywj ywjVar) {
        ywk ywkVar = this.b;
        ywk ywkVar2 = new ywk(ywkVar);
        ywkVar2.b = ywjVar;
        ywkVar2.a = ywkVar.a.c(ywjVar);
        return new zev(ywkVar2, this.a);
    }

    public final String toString() {
        ywk ywkVar = this.b;
        return "QueuedVideo(cpn=" + ywkVar.h + " position=" + String.valueOf(ywkVar.e) + ' ' + String.valueOf(ywkVar.d) + " transitionPositionMs=" + this.a + ')';
    }
}
