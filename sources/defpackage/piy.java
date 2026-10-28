package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class piy {
    private final Context a;
    private final pls b;
    private final pcn c;
    private final nwo d;

    static {
        agsn.h("GnpSdk");
    }

    public piy(Context context, pls plsVar, nwo nwoVar, pcn pcnVar) {
        context.getClass();
        plsVar.getClass();
        this.a = context;
        this.b = plsVar;
        this.d = nwoVar;
        this.c = pcnVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0295  */
    /* JADX WARN: Code duplicated, block: B:101:0x0298  */
    /* JADX WARN: Code duplicated, block: B:104:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[LOOP:0: B:85:0x025b->B:106:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:84:0x024d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0261  */
    /* JADX WARN: Code duplicated, block: B:90:0x0273  */
    /* JADX WARN: Code duplicated, block: B:92:0x027d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0283  */
    /* JADX WARN: Type inference failed for: r3v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, tqj] */
    static /* synthetic */ Object c(piy piyVar, String str, plx plxVar, pot potVar, pos posVar, pzn pznVar, awoq awoqVar) throws Throwable {
        piu piuVar;
        int i;
        pzr pzrVar;
        int i2;
        pzn pznVar2;
        String str2;
        piy piyVar2;
        pot potVar2;
        plx plxVar2;
        String str3;
        pot potVar3;
        Object objB;
        pzr pzrVar2;
        pzn pznVar3;
        String str4;
        Object obj;
        String str5;
        plx plxVar3;
        pos posVar2;
        int i3;
        int length;
        String strA;
        int iB;
        boolean z;
        Iterator it;
        Object next;
        piy piyVar3 = piyVar;
        pos posVar3 = posVar;
        if (awoqVar instanceof piu) {
            piuVar = (piu) awoqVar;
            int i4 = piuVar.d;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                piuVar.d = i4 - Integer.MIN_VALUE;
            } else {
                piuVar = new piu(piyVar3, awoqVar);
            }
        } else {
            piuVar = new piu(piyVar3, awoqVar);
        }
        Object obj2 = piuVar.b;
        awox awoxVar = awox.a;
        int i5 = piuVar.d;
        if (i5 == 0) {
            atqp.j(obj2);
            int i6 = posVar3.i;
            if (i6 == 0) {
                i = 0;
            } else {
                int i7 = i6 - 1;
                if (i7 == 1) {
                    i = 2;
                } else if (i7 == 2) {
                    i = 4;
                } else if (i7 != 3) {
                    String str6 = posVar3.a;
                    str6.getClass();
                    if (str6.length() == 0) {
                        throw new IllegalStateException("ChimeNotificationAction must have an action id or builtInActionType");
                    }
                    i = 1;
                } else {
                    i = 5;
                }
            }
            String strValueOf = String.valueOf(posVar3.a);
            ozj ozjVarB = nvj.b(potVar);
            agev agevVarA = nvt.a(piyVar3.c, ozjVarB);
            String strConcat = "com.google.android.libraries.notifications.ACTION_ID:".concat(strValueOf);
            if (i == 1 && agevVarA.g()) {
                aczl aczlVar = (aczl) agevVarA.c();
                ozi oziVarA = nvj.a(posVar3);
                piuVar.e = piyVar3;
                piuVar.f = str;
                piuVar.j = plxVar;
                potVar3 = potVar;
                piuVar.g = potVar3;
                piuVar.k = posVar3;
                piuVar.h = pznVar;
                piuVar.i = strConcat;
                piuVar.a = 1;
                piuVar.d = 1;
                ?? r3 = aczlVar.d;
                if (r3 == 0) {
                    throw new IllegalStateException("The intent provider for opening the YouTube app is absent.");
                }
                Intent intent = new Intent((Intent) r3.io());
                ?? r4 = aczlVar.b;
                int i8 = tqr.a;
                if (r4.k(1073828559)) {
                    intent.putExtra("notification_arrival_timestamp", aczlVar.a.f().toEpochMilli());
                }
                Optional optionalR = ((elr) aczlVar.g).r(oziVarA);
                if (optionalR.isEmpty()) {
                    pzrVar2 = nra.b(agke.q(intent), null);
                } else {
                    Optional optionalF = aczlVar.f(ozjVarB.a);
                    Bundle bundleG = aczl.g(optionalF);
                    int iAS = a.aS(((ajcp) optionalR.get()).e);
                    if (iAS == 0) {
                        iAS = 1;
                    }
                    int i9 = iAS - 1;
                    if (i9 == 1) {
                        qze qzeVar = new qze(aczlVar, intent, optionalF, 9);
                        if (true == optionalR.isPresent()) {
                            Object obj3 = optionalR.get();
                            Object obj4 = qzeVar.a;
                            Object obj5 = qzeVar.b;
                            Object obj6 = qzeVar.c;
                            ajcp ajcpVar = (ajcp) obj3;
                            if ((ajcpVar.b & 1) != 0) {
                                ajwo ajwoVar = ajcpVar.c;
                                if (ajwoVar == null) {
                                    ajwoVar = ajwo.a;
                                }
                                Optional optional = (Optional) obj6;
                                Intent intent2 = (Intent) obj5;
                                zik.be(intent2, ajwoVar, optional.isPresent() ? ((xgt) optional.get()).a : null);
                                yno.U(intent2, "ytnchime");
                                optionalR = Optional.of(obj5);
                            } else {
                                ((aaap) ((aczl) obj4).e).a("Payload does not have the required navigation endpoint.");
                                optionalR = Optional.empty();
                            }
                        }
                        vre vreVar = new vre(bundleG, 5);
                        if (true == optionalR.isPresent()) {
                            optionalR = Optional.ofNullable(nra.b(agke.q(optionalR.get()), (Bundle) vreVar.a));
                        }
                        yyj yyjVar = new yyj(intent, bundleG, 3, null);
                        if (true != optionalR.isPresent()) {
                            objB = nra.b(agke.q(yyjVar.b), (Bundle) yyjVar.a);
                        } else {
                            objB = optionalR.get();
                        }
                        pzrVar2 = (pzr) objB;
                    } else if (i9 != 2) {
                        ((aaap) aczlVar.e).a("Tray behavior was not specified.");
                        pzrVar2 = nra.b(agke.q(intent), bundleG);
                    } else {
                        pzrVar2 = new pzr(2, null, bundleG);
                    }
                }
                if (pzrVar2 == awoxVar) {
                    return awoxVar;
                }
                pznVar3 = pznVar;
                str4 = str;
                obj = pzrVar2;
                str5 = strConcat;
                plxVar3 = plxVar;
            } else {
                i2 = 2;
                pzrVar = new pzr(2, null, null);
                pznVar2 = pznVar;
                str2 = strConcat;
                piyVar2 = piyVar3;
                potVar2 = potVar;
                plxVar2 = plxVar;
                str3 = str;
            }
            posVar2 = posVar3;
            i3 = i;
            agke agkeVarA = pzrVar.a();
            if (pzrVar.b != 1 && agkeVarA != null) {
                List listH = atqq.H(potVar2);
                aiff aiffVar = posVar2.d;
                aiffVar.getClass();
                return piyVar2.a(str3, i3, str2, plxVar2, listH, aiffVar, atqq.ap(agkeVarA), pznVar2, ahza.ACTION_CLICK_IN_SYSTEM_TRAY, pzrVar.a);
            }
            String str7 = posVar2.c;
            str7.getClass();
            length = str7.length();
            strA = auvv.a.io().a();
            if (strA.length() > 0) {
                it = agfm.c(",").f(strA).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        next.getClass();
                        if (awrc.c((String) next, posVar2.a)) {
                        }
                    } else {
                        iB = aiep.b(posVar2.d.c);
                        if (iB == 0) {
                            iB = aiep.a;
                        }
                        if (iB == aiep.c && !a.aL()) {
                        }
                    }
                    i2 = 1;
                }
            } else {
                iB = aiep.b(posVar2.d.c);
                if (iB == 0) {
                    iB = aiep.a;
                }
                if (iB == aiep.c) {
                    i2 = 1;
                }
            }
            List listH2 = atqq.H(potVar2);
            aiff aiffVar2 = posVar2.d;
            aiffVar2.getClass();
            if (length > 0) {
                z = true;
            } else {
                z = false;
            }
            return piyVar2.g(str3, i3, str2, i2, plxVar2, listH2, aiffVar2, pznVar2, posVar2, ahza.ACTION_CLICK_IN_SYSTEM_TRAY, z, pzrVar.a);
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i10 = piuVar.a;
        String str8 = piuVar.i;
        pznVar3 = piuVar.h;
        pos posVar4 = piuVar.k;
        potVar3 = piuVar.g;
        plxVar3 = piuVar.j;
        str4 = piuVar.f;
        piy piyVar4 = piuVar.e;
        atqp.j(obj2);
        i = i10;
        piyVar3 = piyVar4;
        str5 = str8;
        posVar3 = posVar4;
        obj = obj2;
        str2 = str5;
        pznVar2 = pznVar3;
        pzrVar = (pzr) obj;
        str3 = str4;
        i2 = 2;
        piyVar2 = piyVar3;
        potVar2 = potVar3;
        plxVar2 = plxVar3;
        posVar2 = posVar3;
        i3 = i;
        agke agkeVarA2 = pzrVar.a();
        if (pzrVar.b != 1) {
        }
        String str9 = posVar2.c;
        str9.getClass();
        length = str9.length();
        strA = auvv.a.io().a();
        if (strA.length() > 0) {
            it = agfm.c(",").f(strA).iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    next.getClass();
                    if (awrc.c((String) next, posVar2.a)) {
                    }
                } else {
                    iB = aiep.b(posVar2.d.c);
                    if (iB == 0) {
                        iB = aiep.a;
                    }
                    if (iB == aiep.c) {
                    }
                }
                i2 = 1;
            }
        } else {
            iB = aiep.b(posVar2.d.c);
            if (iB == 0) {
                iB = aiep.a;
            }
            if (iB == aiep.c) {
                i2 = 1;
            }
        }
        List listH3 = atqq.H(potVar2);
        aiff aiffVar3 = posVar2.d;
        aiffVar3.getClass();
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        return piyVar2.g(str3, i3, str2, i2, plxVar2, listH3, aiffVar3, pznVar2, posVar2, ahza.ACTION_CLICK_IN_SYSTEM_TRAY, z, pzrVar.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [piy] */
    static /* synthetic */ Object d(piy piyVar, String str, plx plxVar, List list, pzn pznVar, awoq awoqVar) throws Throwable {
        piv pivVar;
        pzr pzrVar;
        plx plxVar2;
        ?? r12;
        pzn pznVar2;
        String str2;
        String str3;
        pzn pznVar3;
        plx plxVar3;
        Object obj;
        ?? r7;
        int length;
        boolean z;
        piy piyVar2 = piyVar;
        if (awoqVar instanceof piv) {
            pivVar = (piv) awoqVar;
            int i = pivVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pivVar.d = i - Integer.MIN_VALUE;
            } else {
                pivVar = new piv(piyVar2, awoqVar);
            }
        } else {
            pivVar = new piv(piyVar2, awoqVar);
        }
        Object objH = pivVar.b;
        Object obj2 = awox.a;
        int i2 = pivVar.d;
        if (i2 == 0) {
            atqp.j(objH);
            List listC = nvj.c(list);
            agev agevVar = ((pco) piyVar2.c).a;
            if (agevVar.g()) {
                aczl aczlVar = (aczl) agevVar.c();
                pivVar.e = piyVar2;
                str3 = str;
                pivVar.f = str3;
                pivVar.h = plxVar;
                pivVar.a = list;
                pznVar3 = pznVar;
                pivVar.g = pznVar3;
                pivVar.d = 1;
                objH = aczlVar.h(listC);
                if (objH == obj2) {
                    return obj2;
                }
                plxVar3 = plxVar;
                obj = list;
            } else {
                pzrVar = new pzr(2, null, null);
                plxVar2 = plxVar;
                r12 = list;
                pznVar2 = pznVar;
                str2 = str;
            }
            r7 = piyVar2;
            agke agkeVarA = pzrVar.a();
            if (pzrVar.b != 1 && agkeVarA != null) {
                nwo nwoVar = ((piy) r7).d;
                aiff aiffVarA = nwo.a(r12);
                aiffVarA.getClass();
                return r7.a(str2, 1, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED", plxVar2, r12, aiffVarA, atqq.ap(agkeVarA), pznVar2, ahza.CLICKED_IN_SYSTEM_TRAY, pzrVar.a);
            }
            String str4 = ((pot) r12.get(0)).o.i;
            str4.getClass();
            length = str4.length();
            int i3 = true != a.aL() ? 1 : 2;
            nwo nwoVar2 = ((piy) r7).d;
            aiff aiffVarA2 = nwo.a(r12);
            aiffVarA2.getClass();
            if (length > 0) {
                z = true;
            } else {
                z = false;
            }
            return r7.g(str2, 1, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED", i3, plxVar2, r12, aiffVarA2, pznVar2, null, ahza.CLICKED_IN_SYSTEM_TRAY, z, pzrVar.a);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pzn pznVar4 = pivVar.g;
        obj = pivVar.a;
        plxVar3 = pivVar.h;
        str3 = pivVar.f;
        piy piyVar3 = pivVar.e;
        atqp.j(objH);
        pznVar3 = pznVar4;
        piyVar2 = piyVar3;
        pzrVar = (pzr) objH;
        r12 = obj;
        plxVar2 = plxVar3;
        str2 = str3;
        pznVar2 = pznVar3;
        r7 = piyVar2;
        agke agkeVarA2 = pzrVar.a();
        if (pzrVar.b != 1) {
        }
        String str5 = ((pot) r12.get(0)).o.i;
        str5.getClass();
        length = str5.length();
        if (true != a.aL()) {
        }
        nwo nwoVar3 = ((piy) r7).d;
        aiff aiffVarA3 = nwo.a(r12);
        aiffVarA3.getClass();
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        return r7.g(str2, 1, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED", i3, plxVar2, r12, aiffVarA3, pznVar2, null, ahza.CLICKED_IN_SYSTEM_TRAY, z, pzrVar.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [piy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    static /* synthetic */ Object e(piy piyVar, String str, plx plxVar, List list, awoq awoqVar) throws Throwable {
        piw piwVar;
        Bundle bundle;
        Object obj;
        if (awoqVar instanceof piw) {
            piwVar = (piw) awoqVar;
            int i = piwVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                piwVar.d = i - Integer.MIN_VALUE;
            } else {
                piwVar = new piw(piyVar, awoqVar);
            }
        } else {
            piwVar = new piw(piyVar, awoqVar);
        }
        Object objE = piwVar.b;
        awox awoxVar = awox.a;
        int i2 = piwVar.d;
        if (i2 == 0) {
            atqp.j(objE);
            List listC = nvj.c(list);
            agev agevVar = ((pco) piyVar.c).a;
            bundle = null;
            if (agevVar.g()) {
                aczl aczlVar = (aczl) agevVar.c();
                piwVar.e = piyVar;
                piwVar.f = str;
                piwVar.g = plxVar;
                obj = list;
                piwVar.a = obj;
                piwVar.d = 1;
                Optional optionalT = ((elr) aczlVar.g).t(listC);
                objE = optionalT.isEmpty() ? null : aczlVar.e((ozj) optionalT.get());
                if (objE == awoxVar) {
                    return awoxVar;
                }
            } else {
                obj = list;
            }
            Bundle bundle2 = bundle;
            ?? r6 = obj;
            aihf aihfVarCreateBuilder = aiff.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            aext.E(aihfVarCreateBuilder);
            aext.C(aihfVarCreateBuilder);
            return piyVar.g(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_DISMISSED", 2, plxVar, r6, aext.B(aihfVarCreateBuilder), null, null, ahza.DISMISSED_IN_SYSTEM_TRAY, false, bundle2);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object obj2 = piwVar.a;
        plx plxVar2 = piwVar.g;
        String str2 = piwVar.f;
        piy piyVar2 = piwVar.e;
        atqp.j(objE);
        plxVar = plxVar2;
        str = str2;
        obj = obj2;
        piyVar = piyVar2;
        bundle = (Bundle) objE;
        Bundle bundle3 = bundle;
        ?? r7 = obj;
        aihf aihfVarCreateBuilder2 = aiff.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        aext.E(aihfVarCreateBuilder2);
        aext.C(aihfVarCreateBuilder2);
        return piyVar.g(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_DISMISSED", 2, plxVar, r7, aext.B(aihfVarCreateBuilder2), null, null, ahza.DISMISSED_IN_SYSTEM_TRAY, false, bundle3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    static /* synthetic */ Object f(piy piyVar, String str, plx plxVar, pot potVar, awoq awoqVar) throws Throwable {
        pix pixVar;
        pot potVar2;
        Bundle bundle;
        if (awoqVar instanceof pix) {
            pixVar = (pix) awoqVar;
            int i = pixVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pixVar.c = i - Integer.MIN_VALUE;
            } else {
                pixVar = new pix(piyVar, awoqVar);
            }
        } else {
            pixVar = new pix(piyVar, awoqVar);
        }
        Object objE = pixVar.a;
        Object obj = awox.a;
        int i2 = pixVar.c;
        if (i2 == 0) {
            atqp.j(objE);
            ozj ozjVarB = nvj.b(potVar);
            agev agevVarA = nvt.a(piyVar.c, ozjVarB);
            if (agevVarA.g()) {
                aczl aczlVar = (aczl) agevVarA.c();
                pixVar.d = piyVar;
                pixVar.e = str;
                pixVar.g = plxVar;
                potVar2 = potVar;
                pixVar.f = potVar2;
                pixVar.c = 1;
                objE = aczlVar.e(ozjVarB);
                if (objE == obj) {
                    return obj;
                }
            } else {
                potVar2 = potVar;
                bundle = null;
            }
            Bundle bundle2 = bundle;
            piy piyVar2 = piyVar;
            List listH = atqq.H(potVar2);
            aihf aihfVarCreateBuilder = aiff.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            aext.E(aihfVarCreateBuilder);
            aext.C(aihfVarCreateBuilder);
            return piyVar2.g(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_EXPIRED", 2, plxVar, listH, aext.B(aihfVarCreateBuilder), null, null, ahza.EXPIRED, false, bundle2);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pot potVar3 = pixVar.f;
        plx plxVar2 = pixVar.g;
        String str2 = pixVar.e;
        piy piyVar3 = pixVar.d;
        atqp.j(objE);
        plxVar = plxVar2;
        str = str2;
        potVar2 = potVar3;
        piyVar = piyVar3;
        bundle = (Bundle) objE;
        Bundle bundle3 = bundle;
        piy piyVar4 = piyVar;
        List listH2 = atqq.H(potVar2);
        aihf aihfVarCreateBuilder2 = aiff.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        aext.E(aihfVarCreateBuilder2);
        aext.C(aihfVarCreateBuilder2);
        return piyVar4.g(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_EXPIRED", 2, plxVar, listH2, aext.B(aihfVarCreateBuilder2), null, null, ahza.EXPIRED, false, bundle3);
    }

    private final PendingIntent g(String str, int i, String str2, int i2, plx plxVar, List list, aiff aiffVar, pzn pznVar, pos posVar, ahza ahzaVar, boolean z, Bundle bundle) {
        Intent intentB = b();
        pho.i(intentB, plxVar);
        pho.l(intentB, i);
        pho.j(intentB, str2);
        pho.q(intentB, aiffVar);
        pho.n(intentB, pznVar);
        if (posVar != null) {
            intentB.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_CHIME_ACTION", posVar.b().toByteArray());
        }
        pho.o(intentB, ahzaVar);
        pho.k(intentB, bundle);
        if (z) {
            intentB.putExtra("com.google.android.libraries.notifications.HANDLE_IN_FOREGROUND", true);
            i2 = 1;
        }
        if (list.size() == 1) {
            pho.p(intentB, (pot) list.get(0));
        } else {
            pho.m(intentB, (pot) list.get(0));
        }
        if (i2 != 1) {
            int iB = aiep.b(aiffVar.c);
            if (iB == 0) {
                iB = aiep.a;
            }
            if (iB == aiep.c) {
                intentB.addFlags(268435456);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(this.a, pjx.b(str, str2, i), intentB, nwk.a(posVar) | 134217728);
            broadcast.getClass();
            return broadcast;
        }
        Context context = this.a;
        plt pltVar = this.b.c;
        String str3 = pltVar != null ? pltVar.h : null;
        if (str3 == null) {
            throw new IllegalStateException("SystemTrayNotificationConfig.notificationClickedActivity is null");
        }
        intentB.setClassName(context, str3);
        PendingIntent activity = PendingIntent.getActivity(context, pjx.b(str, str2, i), intentB, nwk.a(posVar) | 134217728);
        activity.getClass();
        return activity;
    }

    public final PendingIntent a(String str, int i, String str2, plx plxVar, List list, aiff aiffVar, List list2, pzn pznVar, ahza ahzaVar, Bundle bundle) {
        str.getClass();
        str2.getClass();
        list.getClass();
        if (list2.isEmpty()) {
            throw new IllegalArgumentException("Collaborator intents should not be empty");
        }
        Intent intent = (Intent) atqq.ab(list2);
        if (a.aL()) {
            String identifier = intent.getIdentifier();
            if (identifier == null || identifier.length() == 0) {
                intent.setIdentifier("chime://" + str.hashCode());
            }
        } else if (intent.getData() == null || awrc.c(intent.getData(), Uri.EMPTY)) {
            Uri uri = Uri.parse("chime://" + str.hashCode());
            uri.getClass();
            intent.setData(uri);
        }
        pho.i(intent, plxVar);
        pho.l(intent, i);
        pho.j(intent, str2);
        pho.q(intent, aiffVar);
        pho.n(intent, pznVar);
        pho.o(intent, ahzaVar);
        pho.k(intent, bundle);
        if (list.size() == 1) {
            pho.p(intent, (pot) list.get(0));
        } else {
            pho.m(intent, (pot) list.get(0));
        }
        PendingIntent activities = PendingIntent.getActivities(this.a, pjx.b(str, str2, i), (Intent[]) list2.toArray(new Intent[0]), nwk.a(null) | 134217728);
        activities.getClass();
        return activities;
    }

    public final Intent b() {
        Intent intent = new Intent("com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT");
        plt pltVar = this.b.c;
        String str = pltVar != null ? pltVar.i : null;
        if (str == null) {
            throw new IllegalStateException("SystemTrayNotificationConfig.notificationRemovedReceiver is null");
        }
        intent.setClassName(this.a, str);
        return intent;
    }
}
