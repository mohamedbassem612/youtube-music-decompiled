package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aawl implements avni {
    private final /* synthetic */ int $cid;
    final /* synthetic */ avni a;
    final /* synthetic */ String b;

    public aawl(avni avniVar, String str, int i) {
        this.$cid = i;
        this.a = avniVar;
        this.b = str;
    }

    @Override // defpackage.avni
    public final /* synthetic */ void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aayt aaytVar = (aayt) obj;
            tym.af(this.a, tsa.HANDLE_RX_VIDEO_STAGE_EVENT, aawm.b(this.b, aaytVar != null ? aaytVar.b : null)).a(aaytVar);
        } else if (i != 1) {
            aazk aazkVar = (aazk) obj;
            tym.af(this.a, tsa.HANDLE_VIDEO_TIME_EVENT, aawm.b(this.b, aazkVar != null ? aazkVar.i : null)).a(aazkVar);
        } else {
            aazj aazjVar = (aazj) obj;
            tym.af(this.a, tsa.HANDLE_VIDEO_STAGE_EVENT, aawm.b(this.b, aazjVar != null ? aazjVar.g : null)).a(aazjVar);
        }
    }
}
