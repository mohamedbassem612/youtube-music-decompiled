package defpackage;

import android.app.PendingIntent;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class phx extends awpk implements awqk {
    Object a;
    int b;
    final /* synthetic */ atr c;
    final /* synthetic */ pic d;
    final /* synthetic */ String e;
    final /* synthetic */ plx f;
    final /* synthetic */ pot g;
    final /* synthetic */ pzn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phx(atr atrVar, pic picVar, String str, plx plxVar, pot potVar, pzn pznVar, awoq awoqVar) {
        super(2, awoqVar);
        this.c = atrVar;
        this.d = picVar;
        this.e = str;
        this.f = plxVar;
        this.g = potVar;
        this.h = pznVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new phx(this.c, this.d, this.e, this.f, this.g, this.h, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((phx) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        phx phxVar;
        Object obj3 = awox.a;
        int i = this.b;
        if (i != 0) {
            obj2 = this.a;
            atqp.j(obj);
            if (i != 1) {
                obj3 = obj2;
            } else {
                phxVar = this;
            }
            ((atr) obj3).n((PendingIntent) obj);
            return obj3;
        }
        atqp.j(obj);
        obj2 = this.c;
        pic picVar = this.d;
        String str = this.e;
        plx plxVar = this.f;
        pot potVar = this.g;
        pzn pznVar = this.h;
        List listH = atqq.H(potVar);
        this.a = obj2;
        this.b = 1;
        phxVar = this;
        obj = piy.d(picVar.d, str, plxVar, listH, pznVar, phxVar);
        if (obj != obj3) {
        }
        return obj3;
        ((atr) obj2).h = (PendingIntent) obj;
        atr atrVar = phxVar.c;
        pic picVar2 = phxVar.d;
        String str2 = phxVar.e;
        plx plxVar2 = phxVar.f;
        List listH2 = atqq.H(phxVar.g);
        phxVar.a = atrVar;
        phxVar.b = 2;
        obj = piy.e(picVar2.d, str2, plxVar2, listH2, phxVar);
        if (obj != obj3) {
            obj3 = atrVar;
            ((atr) obj3).n((PendingIntent) obj);
        }
        return obj3;
    }
}
