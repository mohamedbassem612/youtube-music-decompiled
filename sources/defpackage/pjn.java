package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pjn extends awpk implements awqg {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ pjv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjn(Context context, String str, int i, pjv pjvVar, awoq awoqVar) {
        super(1, awoqVar);
        this.a = context;
        this.b = str;
        this.c = i;
        this.d = pjvVar;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new pjn(this.a, this.b, this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((pjn) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        new auy(this.a).a(this.b, this.c);
        agsn agsnVar = pjv.a;
        return awmy.a;
    }
}
