package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hmk implements aaui {
    final /* synthetic */ String a;
    public final /* synthetic */ hmm b;

    public hmk(hmm hmmVar, String str) {
        this.a = str;
        this.b = hmmVar;
    }

    @Override // defpackage.aaui
    public final void a() {
        hmm hmmVar = this.b;
        hpb hpbVar = hmmVar.c;
        hpy hpyVar = hmmVar.b;
        String str = this.a;
        taf.k(hmmVar.a, hpbVar.j(hpyVar, str), new gnx(13), new glm(this, 15));
        hmmVar.h.j(str, aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE, hmmVar.i.intValue());
    }
}
