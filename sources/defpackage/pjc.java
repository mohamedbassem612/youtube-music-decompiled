package defpackage;

import android.app.Notification;
import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pjc extends awpk implements awqg {
    int a;
    int b;
    final /* synthetic */ pjv c;
    final /* synthetic */ pax d;
    final /* synthetic */ Context e;
    final /* synthetic */ boolean f;
    final /* synthetic */ String g;
    final /* synthetic */ Notification h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjc(pjv pjvVar, pax paxVar, Context context, boolean z, String str, Notification notification, awoq awoqVar) {
        super(1, awoqVar);
        this.c = pjvVar;
        this.d = paxVar;
        this.e = context;
        this.f = z;
        this.g = str;
        this.h = notification;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new pjc(this.c, this.d, this.e, this.f, this.g, this.h, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((pjc) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f5  */
    /* JADX WARN: Type inference failed for: r5v10, types: [agfr, java.lang.Object] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCeil;
        int i;
        boolean z;
        long epochMilli;
        piz pizVar;
        awox awoxVar = awox.a;
        if (this.b == 0) {
            atqp.j(obj);
            float fA = (float) auvy.a.io().a();
            pjv pjvVar = this.c;
            long epochMilli2 = pjvVar.d.f().toEpochMilli();
            piz pizVar2 = pjvVar.f;
            if (pizVar2.b(epochMilli2) < fA) {
                z = false;
            } else {
                Long l = pizVar2.b;
                if (l != null) {
                    long jLongValue = l.longValue();
                    if (pizVar2.b(epochMilli2) > fA) {
                        double d = ((((1.0d / ((double) fA)) - (pizVar2.a * 0.7d)) * 1000.0d) / 0.30000000000000004d) - (epochMilli2 - jLongValue);
                        if (d > 0.0d) {
                            jCeil = (long) Math.ceil(d);
                        } else {
                            jCeil = 0;
                        }
                    } else {
                        jCeil = 0;
                    }
                } else {
                    jCeil = 0;
                }
                pax paxVar = this.d;
                if (paxVar != null) {
                    paxVar.h = new Long(jCeil);
                }
                this.a = 1;
                this.b = 1;
                if (avkz.y(jCeil, this) == awoxVar) {
                    return awoxVar;
                }
                i = 1;
            }
            pjv pjvVar2 = this.c;
            pwf pwfVar = (pwf) pjvVar2.e.io();
            Context context = this.e;
            ((qtf) pwfVar.v.io()).b(1L, context.getPackageName(), pjvVar2.c.a, Boolean.valueOf(this.f), Boolean.valueOf(z));
            new auy(context).b(this.g, 0, this.h);
            epochMilli = pjvVar2.d.f().toEpochMilli();
            pizVar = pjvVar2.f;
            if (pizVar.b != null) {
                pizVar.a = pizVar.a(epochMilli);
            }
            pizVar.b = Long.valueOf(epochMilli);
            return awmy.a;
        }
        i = this.a;
        atqp.j(obj);
        agsn agsnVar = pjv.a;
        pjv pjvVar3 = this.c;
        new Float(pjvVar3.f.b(pjvVar3.d.f().toEpochMilli()));
        if (1 == i) {
            z = true;
        } else {
            z = false;
        }
        pjv pjvVar4 = this.c;
        pwf pwfVar2 = (pwf) pjvVar4.e.io();
        Context context2 = this.e;
        ((qtf) pwfVar2.v.io()).b(1L, context2.getPackageName(), pjvVar4.c.a, Boolean.valueOf(this.f), Boolean.valueOf(z));
        new auy(context2).b(this.g, 0, this.h);
        epochMilli = pjvVar4.d.f().toEpochMilli();
        pizVar = pjvVar4.f;
        if (pizVar.b != null) {
            pizVar.a = pizVar.a(epochMilli);
        }
        pizVar.b = Long.valueOf(epochMilli);
        return awmy.a;
    }
}
