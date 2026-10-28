package defpackage;

import android.app.PendingIntent;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class phz extends awpk implements awqk {
    Object a;
    int b;
    final /* synthetic */ atr c;
    final /* synthetic */ pic d;
    final /* synthetic */ String e;
    final /* synthetic */ plx f;
    final /* synthetic */ List g;
    final /* synthetic */ pzn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phz(atr atrVar, pic picVar, String str, plx plxVar, List list, pzn pznVar, awoq awoqVar) {
        super(2, awoqVar);
        this.c = atrVar;
        this.d = picVar;
        this.e = str;
        this.f = plxVar;
        this.g = list;
        this.h = pznVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new phz(this.c, this.d, this.e, this.f, this.g, this.h, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((phz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000e A[PHI: r3 r11
      0x000e: PHI (r3v2 java.lang.Object) = (r3v1 java.lang.Object), (r3v3 java.lang.Object) binds: [B:11:0x0048, B:5:0x000c] A[DONT_GENERATE, DONT_INLINE]
      0x000e: PHI (r11v7 java.lang.Object) = (r11v6 java.lang.Object), (r11v0 java.lang.Object) binds: [B:11:0x0048, B:5:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        phz phzVar;
        Object obj3 = awox.a;
        int i = this.b;
        if (i != 0) {
            obj2 = this.a;
            atqp.j(obj);
            if (i != 1) {
                obj3 = obj2;
                ((atr) obj3).n((PendingIntent) obj);
            } else {
                phzVar = this;
            }
            return obj3;
        }
        atqp.j(obj);
        obj2 = this.c;
        pic picVar = this.d;
        String str = this.e;
        plx plxVar = this.f;
        List list = this.g;
        pzn pznVar = this.h;
        this.a = obj2;
        this.b = 1;
        phzVar = this;
        obj = piy.d(picVar.d, str, plxVar, list, pznVar, phzVar);
        if (obj != obj3) {
        }
        return obj3;
        ((atr) obj2).h = (PendingIntent) obj;
        pic picVar2 = phzVar.d;
        String str2 = phzVar.e;
        plx plxVar2 = phzVar.f;
        List list2 = phzVar.g;
        phzVar.a = obj2;
        phzVar.b = 2;
        obj = piy.e(picVar2.d, str2, plxVar2, list2, phzVar);
        if (obj != obj3) {
            obj3 = obj2;
            ((atr) obj3).n((PendingIntent) obj);
        }
        return obj3;
    }
}
