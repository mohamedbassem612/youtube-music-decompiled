package defpackage;

import android.os.Bundle;
import android.webkit.CookieManager;
import com.google.android.gms.cast.CastDevice;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tiy extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tiy(axlj axljVar, dvo dvoVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = axljVar;
        this.a = dvoVar;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        tiy tiyVar;
        int i = this.$cid;
        if (i == 0) {
            return new tiy((tiz) this.a, (toe) this.b, awoqVar, 0);
        }
        if (i == 1) {
            tiyVar = new tiy((teq) this.a, (tew) this.b, awoqVar, 1);
        } else if (i == 2) {
            tiyVar = new tiy((uzt) this.a, (ajhu) this.b, awoqVar, 2);
        } else if (i == 3) {
            tiyVar = new tiy((uzt) this.a, (Throwable) this.b, awoqVar, 3);
        } else if (i == 4) {
            tiyVar = new tiy((ycd) this.a, (List) this.b, awoqVar, 4);
        } else {
            if (i != 5) {
                return new tiy((axlj) this.b, (dvo) this.a, awoqVar, 6);
            }
            tiyVar = new tiy((ycd) this.a, (alpn) this.b, awoqVar, 5);
        }
        return tiyVar;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((tiy) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 1) {
            return ((tiy) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 2) {
            return ((tiy) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 3) {
            return ((tiy) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 4) {
            return ((tiy) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 5) {
            return ((tiy) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((tiy) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        aisk aiskVar;
        int iBt;
        String str2;
        Bundle bundle;
        String string;
        int i = this.$cid;
        if (i == 0) {
            atqp.j(obj);
            try {
                ((tiz) this.a).b((toe) this.b);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                twu.c(6, "Unexpected failure in async handleFailed", th);
                Object obj2 = this.a;
                toe toeVar = th instanceof toe ? th : null;
                if (toeVar == null) {
                    toeVar = new toe(th);
                }
                ((tiz) obj2).a(toeVar);
            }
            return awmy.a;
        }
        if (i == 1) {
            atqp.j(obj);
            ((teq) this.a).d((tew) this.b);
            return awmy.a;
        }
        if (i == 2) {
            atqp.j(obj);
            int iBt2 = a.bt(((ajhu) this.b).c);
            if (iBt2 == 0) {
                iBt2 = 1;
            }
            int i2 = iBt2 - 1;
            if (i2 == 0) {
                str = "UNKNOWN";
            } else if (i2 == 1) {
                str = "INVALID_ASSET_ID";
            } else if (i2 == 2) {
                str = "NOT_FOUND";
            } else if (i2 != 3) {
                str = i2 != 4 ? "INVALID_ARGUMENT" : "INVALID_SOURCE_ID";
            } else {
                str = "SERVER_FAILURE";
            }
            Object obj3 = this.a;
            new RuntimeException("GetAsset failed with error: ".concat(str));
            ((uzt) obj3).i.q();
            return awmy.a;
        }
        if (i == 3) {
            atqp.j(obj);
            ((uzt) this.a).i.q();
            return awmy.a;
        }
        if (i == 4) {
            atqp.j(obj);
            yco ycoVar = ((ycd) this.a).h().e;
            if (ycoVar != null && ycoVar.b() == 1) {
                ?? r7 = this.b;
                if (!(r7 instanceof Collection) || !r7.isEmpty()) {
                    for (xvp xvpVar : r7) {
                        agrf agrfVar = xqw.a;
                        if (ycoVar.n() == null || ycoVar.n().k != 6) {
                            String str3 = xvpVar.i;
                            if (!ahno.aa(str3) && (xqw.k(ycoVar, xvpVar.v()) || xqw.l(ycoVar, str3))) {
                                aiskVar = xvpVar.b.h;
                                if (aiskVar == null) {
                                    aiskVar = aisk.a;
                                }
                                iBt = a.bt(aiskVar.c);
                                if (iBt != 0 && iBt == 2) {
                                    ycoVar.J();
                                    break;
                                }
                            }
                        } else {
                            xvr xvrVarJ = ycoVar.j();
                            String str4 = (xvrVarJ == null || xvrVarJ.d() == null) ? null : xvrVarJ.d().b;
                            if (!ahno.aa(str4) && str4.equals(xvpVar.d().b)) {
                                aiskVar = xvpVar.b.h;
                                if (aiskVar == null) {
                                    aiskVar = aisk.a;
                                }
                                iBt = a.bt(aiskVar.c);
                                if (iBt != 0) {
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
            return awmy.a;
        }
        if (i != 5) {
            atqp.j(obj);
            if (!dvy.a("MULTI_PROFILE")) {
                return null;
            }
            dvo dvoVar = (dvo) this.a;
            if (Objects.equals(dvoVar.c(), "Default")) {
                return null;
            }
            Object obj4 = this.b;
            final CookieManager cookieManagerA = dvoVar.a();
            cookieManagerA.getClass();
            return new kyr(((axlj) obj4).b, (Object) new jyd() { // from class: aege
                @Override // defpackage.jyd
                public final void a(String str5, String str6) {
                    cookieManagerA.setCookie(str5, str6);
                }
            }, (byte[]) null);
        }
        atqp.j(obj);
        ycd ycdVar = (ycd) this.a;
        dij.b(ycdVar.b);
        List listI = dij.i();
        listI.getClass();
        ArrayList<dii> arrayList = new ArrayList();
        for (Object obj5 : listI) {
            String str5 = ((dii) obj5).e;
            str5.getClass();
            if (str5.length() > 0) {
                arrayList.add(obj5);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (dii diiVar : arrayList) {
            diiVar.getClass();
            if (xrx.n(diiVar)) {
                CastDevice castDeviceK = xrx.k(diiVar);
                if (castDeviceK != null) {
                    string = castDeviceK.n;
                } else {
                    string = null;
                }
            } else if (!xrx.h(diiVar) || (bundle = diiVar.s) == null) {
                string = null;
            } else {
                string = bundle.getString("lounge_device_id");
            }
            awml awmlVar = string != null ? new awml(string, diiVar.e) : null;
            if (awmlVar != null) {
                arrayList2.add(awmlVar);
            }
        }
        Map map = ycdVar.f;
        atqq.F(map, arrayList2);
        aisa aisaVar = ((alpn) this.b).d;
        if (aisaVar == null) {
            aisaVar = aisa.a;
        }
        aiie<airw> aiieVar = aisaVar.b;
        aiieVar.getClass();
        ArrayList arrayList3 = new ArrayList(atqq.N(aiieVar, 10));
        for (airw airwVar : aiieVar) {
            airwVar.getClass();
            airu airuVar = airwVar.e;
            if (airuVar == null) {
                airuVar = airu.a;
            }
            aisn aisnVar = airuVar.c;
            if (aisnVar == null) {
                aisnVar = aisn.a;
            }
            String str6 = (aisnVar.b == 1 ? (aiso) aisnVar.c : aiso.a).d;
            str6.getClass();
            if (str6.length() == 0) {
                str6 = null;
            }
            if (str6 == null || (str2 = (String) map.get(str6)) == null) {
                askp askpVar = airwVar.c;
                if (askpVar == null) {
                    askpVar = askp.a;
                }
                str2 = askpVar.c;
                str2.getClass();
            }
            arrayList3.add(new xvp(airwVar, str2));
        }
        return arrayList3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tiy(teq teqVar, tew tewVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = teqVar;
        this.b = tewVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tiy(tiz tizVar, toe toeVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = tizVar;
        this.b = toeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tiy(uzt uztVar, ajhu ajhuVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = uztVar;
        this.b = ajhuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tiy(uzt uztVar, Throwable th, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = uztVar;
        this.b = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tiy(ycd ycdVar, alpn alpnVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = ycdVar;
        this.b = alpnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tiy(ycd ycdVar, List list, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = ycdVar;
        this.b = list;
    }
}
