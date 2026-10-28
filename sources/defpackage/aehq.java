package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aehq extends awpk implements awqk {
    Object a;
    int b;
    final /* synthetic */ aehr c;
    final /* synthetic */ aehd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aehq(aehr aehrVar, aehd aehdVar, awoq awoqVar) {
        super(2, awoqVar);
        this.c = aehrVar;
        this.d = aehdVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new aehq(this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aehq) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0086 A[Catch: Exception -> 0x0146, TryCatch #1 {Exception -> 0x0146, blocks: (B:8:0x0018, B:39:0x00e2, B:11:0x0021, B:36:0x00bc, B:12:0x0026, B:32:0x008f, B:13:0x002a, B:28:0x007f, B:30:0x0086, B:34:0x0092, B:14:0x002e, B:26:0x0070, B:15:0x0032, B:22:0x0056, B:18:0x0039, B:20:0x004d, B:24:0x0059, B:47:0x011b, B:49:0x0120, B:50:0x0145, B:5:0x000f, B:43:0x0116, B:41:0x00fe), top: B:60:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[Catch: Exception -> 0x0146, TryCatch #1 {Exception -> 0x0146, blocks: (B:8:0x0018, B:39:0x00e2, B:11:0x0021, B:36:0x00bc, B:12:0x0026, B:32:0x008f, B:13:0x002a, B:28:0x007f, B:30:0x0086, B:34:0x0092, B:14:0x002e, B:26:0x0070, B:15:0x0032, B:22:0x0056, B:18:0x0039, B:20:0x004d, B:24:0x0059, B:47:0x011b, B:49:0x0120, B:50:0x0145, B:5:0x000f, B:43:0x0116, B:41:0x00fe), top: B:60:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe A[Catch: Exception -> 0x0119, TRY_ENTER, TryCatch #0 {Exception -> 0x0119, blocks: (B:5:0x000f, B:43:0x0116, B:41:0x00fe), top: B:60:0x0007, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Exception {
        dvo dvoVar;
        aehr aehrVar;
        aegg aeggVar;
        Object objIo;
        aehp aehpVar;
        aegg aeggVar2;
        aehr aehrVar2;
        aunn aunnVar;
        zwa zwaVar;
        awox awoxVar = awox.a;
        try {
            try {
                switch (this.b) {
                    case 0:
                        atqp.j(obj);
                        aehr aehrVar3 = this.c;
                        if (!aeho.f(aehrVar3.w(), (agkz) aehrVar3.j.a())) {
                            this.b = 1;
                            if (aehrVar3.v(this) == awoxVar) {
                                return awoxVar;
                            }
                            return awmy.a;
                        }
                        ListenableFuture listenableFutureK = ((axlj) aehrVar3.d.io()).k(aehrVar3.g);
                        this.b = 2;
                        obj = awrc.ad(listenableFutureK, this);
                        if (obj == awoxVar) {
                            return awoxVar;
                        }
                        ListenableFuture listenableFutureB = ((aeiy) obj).b();
                        this.b = 3;
                        obj = awrc.ad(listenableFutureB, this);
                        if (obj == awoxVar) {
                            return awoxVar;
                        }
                        dvoVar = (dvo) obj;
                        aehrVar = this.c;
                        if (dvoVar == null) {
                            this.b = 4;
                            if (aehrVar.v(this) == awoxVar) {
                                return awoxVar;
                            }
                            return awmy.a;
                        }
                        ListenableFuture listenableFutureD = ((aegh) aehrVar.c.io()).d(aguu.V(atqq.o(aehrVar.w())), aehrVar.g, aehrVar.h);
                        listenableFutureD.getClass();
                        this.a = dvoVar;
                        this.b = 5;
                        obj = awrc.ad(listenableFutureD, this);
                        if (obj == awoxVar) {
                            return awoxVar;
                        }
                        aeggVar = (aegg) obj;
                        aehr aehrVar4 = this.c;
                        objIo = aehrVar4.a.io();
                        objIo.getClass();
                        aehpVar = new aehp(aehrVar4, aeggVar, dvoVar, this.d, (awoq) null, 0);
                        this.a = aeggVar;
                        this.b = 6;
                        if (awro.p((awou) objIo, aehpVar, this) != awoxVar) {
                            return awoxVar;
                        }
                        aeggVar2 = aeggVar;
                        aehrVar2 = this.c;
                        aunnVar = aehrVar2.c;
                        aegh aeghVar = (aegh) aunnVar.io();
                        zwaVar = aehrVar2.g;
                        aeghVar.l(aeggVar2, zwaVar);
                        if (aehrVar2.k.m(13, 45838837L)) {
                            ListenableFuture listenableFutureF = ((aegh) aunnVar.io()).f(aeggVar2, zwaVar);
                            listenableFutureF.getClass();
                            this.a = null;
                            this.b = 7;
                            obj = awrc.ad(listenableFutureF, this);
                            if (obj == awoxVar) {
                                return awoxVar;
                            }
                            break;
                        }
                        return awmy.a;
                    case 1:
                        atqp.j(obj);
                        return awmy.a;
                    case 2:
                        atqp.j(obj);
                        ListenableFuture listenableFutureB2 = ((aeiy) obj).b();
                        this.b = 3;
                        obj = awrc.ad(listenableFutureB2, this);
                        if (obj == awoxVar) {
                            return awoxVar;
                        }
                        dvoVar = (dvo) obj;
                        aehrVar = this.c;
                        if (dvoVar == null) {
                            this.b = 4;
                            if (aehrVar.v(this) == awoxVar) {
                                return awoxVar;
                            }
                            return awmy.a;
                        }
                        ListenableFuture listenableFutureD2 = ((aegh) aehrVar.c.io()).d(aguu.V(atqq.o(aehrVar.w())), aehrVar.g, aehrVar.h);
                        listenableFutureD2.getClass();
                        this.a = dvoVar;
                        this.b = 5;
                        obj = awrc.ad(listenableFutureD2, this);
                        if (obj == awoxVar) {
                            return awoxVar;
                        }
                        aeggVar = (aegg) obj;
                        aehr aehrVar5 = this.c;
                        objIo = aehrVar5.a.io();
                        objIo.getClass();
                        aehpVar = new aehp(aehrVar5, aeggVar, dvoVar, this.d, (awoq) null, 0);
                        this.a = aeggVar;
                        this.b = 6;
                        if (awro.p((awou) objIo, aehpVar, this) != awoxVar) {
                            return awoxVar;
                        }
                        aeggVar2 = aeggVar;
                        aehrVar2 = this.c;
                        aunnVar = aehrVar2.c;
                        aegh aeghVar2 = (aegh) aunnVar.io();
                        zwaVar = aehrVar2.g;
                        aeghVar2.l(aeggVar2, zwaVar);
                        if (aehrVar2.k.m(13, 45838837L)) {
                            ListenableFuture listenableFutureF2 = ((aegh) aunnVar.io()).f(aeggVar2, zwaVar);
                            listenableFutureF2.getClass();
                            this.a = null;
                            this.b = 7;
                            obj = awrc.ad(listenableFutureF2, this);
                            if (obj == awoxVar) {
                                return awoxVar;
                            }
                            break;
                        }
                        return awmy.a;
                    case 3:
                        atqp.j(obj);
                        dvoVar = (dvo) obj;
                        aehrVar = this.c;
                        if (dvoVar == null) {
                            this.b = 4;
                            if (aehrVar.v(this) == awoxVar) {
                                return awoxVar;
                            }
                            return awmy.a;
                        }
                        ListenableFuture listenableFutureD3 = ((aegh) aehrVar.c.io()).d(aguu.V(atqq.o(aehrVar.w())), aehrVar.g, aehrVar.h);
                        listenableFutureD3.getClass();
                        this.a = dvoVar;
                        this.b = 5;
                        obj = awrc.ad(listenableFutureD3, this);
                        if (obj == awoxVar) {
                            return awoxVar;
                        }
                        aeggVar = (aegg) obj;
                        aehr aehrVar6 = this.c;
                        objIo = aehrVar6.a.io();
                        objIo.getClass();
                        aehpVar = new aehp(aehrVar6, aeggVar, dvoVar, this.d, (awoq) null, 0);
                        this.a = aeggVar;
                        this.b = 6;
                        if (awro.p((awou) objIo, aehpVar, this) != awoxVar) {
                            return awoxVar;
                        }
                        aeggVar2 = aeggVar;
                        aehrVar2 = this.c;
                        aunnVar = aehrVar2.c;
                        aegh aeghVar3 = (aegh) aunnVar.io();
                        zwaVar = aehrVar2.g;
                        aeghVar3.l(aeggVar2, zwaVar);
                        if (aehrVar2.k.m(13, 45838837L)) {
                            ListenableFuture listenableFutureF3 = ((aegh) aunnVar.io()).f(aeggVar2, zwaVar);
                            listenableFutureF3.getClass();
                            this.a = null;
                            this.b = 7;
                            obj = awrc.ad(listenableFutureF3, this);
                            if (obj == awoxVar) {
                                return awoxVar;
                            }
                            break;
                        }
                        return awmy.a;
                    case 4:
                        atqp.j(obj);
                        return awmy.a;
                    case 5:
                        dvoVar = (dvo) this.a;
                        atqp.j(obj);
                        aeggVar = (aegg) obj;
                        aehr aehrVar7 = this.c;
                        objIo = aehrVar7.a.io();
                        objIo.getClass();
                        aehpVar = new aehp(aehrVar7, aeggVar, dvoVar, this.d, (awoq) null, 0);
                        this.a = aeggVar;
                        this.b = 6;
                        if (awro.p((awou) objIo, aehpVar, this) != awoxVar) {
                            return awoxVar;
                        }
                        aeggVar2 = aeggVar;
                        aehrVar2 = this.c;
                        aunnVar = aehrVar2.c;
                        aegh aeghVar4 = (aegh) aunnVar.io();
                        zwaVar = aehrVar2.g;
                        aeghVar4.l(aeggVar2, zwaVar);
                        if (aehrVar2.k.m(13, 45838837L)) {
                            ListenableFuture listenableFutureF4 = ((aegh) aunnVar.io()).f(aeggVar2, zwaVar);
                            listenableFutureF4.getClass();
                            this.a = null;
                            this.b = 7;
                            obj = awrc.ad(listenableFutureF4, this);
                            if (obj == awoxVar) {
                                return awoxVar;
                            }
                            break;
                        }
                        return awmy.a;
                    case 6:
                        aeggVar2 = (aegg) this.a;
                        atqp.j(obj);
                        aehrVar2 = this.c;
                        aunnVar = aehrVar2.c;
                        aegh aeghVar5 = (aegh) aunnVar.io();
                        zwaVar = aehrVar2.g;
                        aeghVar5.l(aeggVar2, zwaVar);
                        if (aehrVar2.k.m(13, 45838837L)) {
                            ListenableFuture listenableFutureF5 = ((aegh) aunnVar.io()).f(aeggVar2, zwaVar);
                            listenableFutureF5.getClass();
                            this.a = null;
                            this.b = 7;
                            obj = awrc.ad(listenableFutureF5, this);
                            if (obj == awoxVar) {
                                return awoxVar;
                            }
                            break;
                        }
                        return awmy.a;
                    case 7:
                        atqp.j(obj);
                        return awmy.a;
                    default:
                        atqp.j(obj);
                        return awmy.a;
                }
            } catch (Exception e) {
                if (e instanceof CancellationException) {
                    throw e;
                }
                zvl zvlVar = (zvl) this.c.e.io();
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
                zvjVarA.j = 58;
                zvjVarA.d("Failed to save cookies to disk");
                zvjVarA.f(e);
                zvlVar.a(zvjVarA.a());
            }
        } catch (Exception e2) {
            if (e2 instanceof CancellationException) {
                throw e2;
            }
            aehr aehrVar8 = this.c;
            zvl zvlVar2 = (zvl) aehrVar8.e.io();
            zvj zvjVarA2 = zvk.a();
            zvjVarA2.c(ajtv.ERROR_LEVEL_WARNING);
            zvjVarA2.j = 58;
            zvjVarA2.d("WebView reauthentication and reload failed");
            zvjVarA2.f(e2);
            zvlVar2.a(zvjVarA2.a());
            this.a = null;
            this.b = 8;
            if (aehrVar8.v(this) == awoxVar) {
                return awoxVar;
            }
        }
    }
}
