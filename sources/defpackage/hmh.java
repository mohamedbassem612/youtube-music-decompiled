package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hmh implements aaui {
    final /* synthetic */ String a;
    final /* synthetic */ twi b;
    final /* synthetic */ hmi c;

    public hmh(hmi hmiVar, String str, twi twiVar) {
        this.a = str;
        this.b = twiVar;
        this.c = hmiVar;
    }

    @Override // defpackage.aaui
    public final void a() {
        hmi hmiVar = this.c;
        huf hufVar = hmiVar.f;
        String str = this.a;
        hufVar.j(str, aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE, 24);
        hmiVar.i.k(hmiVar.h.e()).c(new hbn(str, 9)).F(new hmg(hmiVar, this.b, 0), new hmd(2));
    }
}
