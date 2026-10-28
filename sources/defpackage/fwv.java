package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class fwv implements ahql {
    static final fwv a = new fwv();
    private static final ahqk b;

    static {
        ahqj ahqjVar = new ahqj("messagingClientEvent");
        ahqjVar.b(new ahqn(1, ahqq.a));
        b = ahqjVar.a();
    }

    @Override // defpackage.ahqh
    public final /* synthetic */ void a(Object obj, Object obj2) {
        ahqs ahqsVar = (ahqs) obj2;
        ahqsVar.c(b, ((ahub) obj).a, true);
    }
}
