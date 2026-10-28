package defpackage;

import android.content.Context;
import com.google.protobuf.MessageLite;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abqf implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abqf(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        switch (this.$cid) {
            case 0:
                tnw tnwVar = (tnw) obj;
                tnwVar.getClass();
                abmw abmwVar = abmw.MEDIASESSION;
                this.a.getClass().getSimpleName();
                return awmy.a;
            case 1:
                tnw tnwVar2 = (tnw) obj;
                tnwVar2.getClass();
                alyi alyiVar = (alyi) tnwVar2.a;
                if (alyiVar != null && alyiVar.i) {
                    ((AtomicBoolean) this.a).set(true);
                }
                return awmy.a;
            case 2:
                alyi alyiVar2 = (alyi) obj;
                alyiVar2.getClass();
                aqdr aqdrVarA = aqdr.a(alyiVar2.h);
                if (aqdrVarA == null) {
                    aqdrVarA = aqdr.STREAMING_WATCH_RESPONSE_TYPE_UNKNOWN;
                }
                return Boolean.valueOf(((abqh) this.a).a.contains(aqdrVarA));
            case 3:
                tnw tnwVar3 = (tnw) obj;
                tnwVar3.getClass();
                return new tml(new tnw(((abqh) this.a).b.a((MessageLite) tnwVar3.a), tnwVar3.b, tnwVar3.c, tnwVar3.d)).a;
            case 4:
                alyi alyiVar3 = (alyi) obj;
                alyiVar3.getClass();
                if (alyiVar3.i) {
                    ((AtomicBoolean) this.a).set(true);
                }
                return awmy.a;
            case 5:
                alyi alyiVar4 = (alyi) obj;
                alyiVar4.getClass();
                abqh abqhVar = (abqh) this.a;
                MessageLite messageLiteA = abqhVar.b.a(alyiVar4);
                messageLiteA.getClass();
                return abqhVar.f(messageLiteA);
            case 6:
                return ((abws) aguu.aw((Context) ((acqf) this.a).c, abws.class, (affd) obj)).y();
            case 7:
                ((abwx) this.a).d();
                return awmy.a;
            case 8:
                aazn aaznVar = (aazn) obj;
                aaznVar.getClass();
                int i = aaznVar.a;
                Object obj2 = this.a;
                if (i == 3) {
                    ((abwx) obj2).d();
                } else if (i == 2) {
                    abwx abwxVar = (abwx) obj2;
                    mbc mbcVar = abwxVar.b;
                    vyo vyoVar = abwxVar.c;
                    long jB = mbcVar.b();
                    aoqs aoqsVar = vyoVar.b().k;
                    if (aoqsVar == null) {
                        aoqsVar = aoqs.a;
                    }
                    arbn arbnVar = aoqsVar.d;
                    if (arbnVar == null) {
                        arbnVar = arbn.a;
                    }
                    int i2 = arbnVar.b * 1000;
                    long j = abwxVar.d;
                    if (j != -1 && i2 > 0 && jB - j > i2) {
                        abwxVar.c();
                    }
                    abwxVar.d = -1L;
                }
                return awmy.a;
            case 9:
                aazk aazkVar = (aazk) obj;
                aazkVar.getClass();
                if (aazkVar.h) {
                    abwx abwxVar2 = (abwx) this.a;
                    if (abwxVar2.e) {
                        long j2 = aazkVar.a;
                        float f = abwxVar2.f.b;
                        if ((f > 1.0f && aazkVar.d - j2 < 500) || (f < 1.0f && j2 - aazkVar.c < 500)) {
                            abwxVar2.c();
                        }
                    }
                }
                return awmy.a;
            case 10:
                ((acjr) this.a).b.as().ki((aaxf) obj);
                return awmy.a;
            case 11:
                ((acjr) this.a).b.as().b((Throwable) obj);
                return awmy.a;
            case 12:
                ((acjr) this.a).b.az().kk((yvu) obj);
                return awmy.a;
            case 13:
                aazn aaznVar2 = (aazn) obj;
                aaznVar2.getClass();
                return new aazn(aaznVar2.a, ((acjr) this.a).b.au());
            case 14:
                ((acjr) this.a).b.ay().kk((yvu) obj);
                return awmy.a;
            case 15:
                ((acjr) this.a).b.aD().kk((zhz) obj);
                return awmy.a;
            case 16:
                ((acjr) this.a).b.aF().kk((aaxd) obj);
                return awmy.a;
            case 17:
                ((acjr) this.a).b.aJ().kk((aaxh) obj);
                return awmy.a;
            case 18:
                ((acjr) this.a).b.aY().kk((aayy) obj);
                return awmy.a;
            case 19:
                ((acjr) this.a).b.be().kk((aazd) obj);
                return awmy.a;
            default:
                ((acjr) this.a).b.bc().kk((aazb) obj);
                return awmy.a;
        }
    }
}
