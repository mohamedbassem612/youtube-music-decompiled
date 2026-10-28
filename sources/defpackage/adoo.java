package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adoo extends awpk implements awql {
    /* synthetic */ Object a;

    public adoo(awoq awoqVar) {
        super(3, awoqVar);
    }

    @Override // defpackage.awql
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        adoo adooVar = new adoo((awoq) obj3);
        adooVar.a = (Throwable) obj2;
        return adooVar.invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        ((agrc) ((agrc) adoq.b.c()).j((Throwable) this.a).k("com/google/android/libraries/youtube/rendering/rive/RiveCompletionSignal", "completionFlow$<anonymous>$<anonymous>", 68, "RiveCompletionSignal.kt")).t("Error observing Rive completion property");
        return awmy.a;
    }
}
