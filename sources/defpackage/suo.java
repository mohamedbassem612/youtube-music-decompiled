package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.android.billingclient.api.SkuDetails;
import com.google.android.apps.youtube.music.R;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class suo extends stx {
    private static final agrf h = agrf.h("com/google/android/libraries/youtube/commerce/payment/PlayBillingController");
    private static final agkz i = new agqj(-2);
    private final vxz A;
    private final abte B;
    public final vxe b;
    enu c;
    public boolean d;
    String e;
    public aonv f;
    aroq g;
    private final cf j;
    private final xeu k;
    private final xit l;
    private xir m;
    private final zwb n;
    private final sud o;
    private final wbz p;
    private final avmb q;
    private final ahbw r;
    private final Object s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private Instant x;
    private final ExecutorService y;
    private final vxz z;

    public suo(cf cfVar, xeu xeuVar, tbt tbtVar, zwb zwbVar, vxe vxeVar, vxz vxzVar, wbz wbzVar, avmb avmbVar, ahbw ahbwVar, xit xitVar, abte abteVar, ScheduledExecutorService scheduledExecutorService, vxz vxzVar2, vxz vxzVar3) {
        super(vxzVar);
        this.s = new Object();
        this.t = 0;
        this.j = cfVar;
        this.k = xeuVar;
        this.n = zwbVar;
        this.b = vxeVar;
        this.p = wbzVar;
        this.u = false;
        this.v = false;
        this.d = true;
        this.w = true;
        this.q = avmbVar;
        this.r = ahbwVar;
        this.l = xitVar;
        this.B = abteVar;
        this.y = scheduledExecutorService;
        this.z = vxzVar2;
        this.A = vxzVar3;
        this.g = aroq.a;
        sud sudVar = new sud();
        this.o = sudVar;
        sudVar.j(new sun(this));
        tbtVar.f(this);
    }

    private final String l(String str) {
        if (this.f == null) {
            str = String.valueOf(str).concat("[Null PlayBillingCommand]");
        }
        return aroq.a.equals(this.g) ? String.valueOf(str).concat("[Empty YpcCujContext]") : str;
    }

    private final void m() {
        this.v = false;
        this.d = true;
        this.f = null;
        p();
    }

    private final void n() {
        this.e = null;
        enu enuVar = this.c;
        if (enuVar != null) {
            enuVar.h();
            this.c = null;
        }
    }

    private final synchronized void o() {
        boolean z;
        Object obj;
        Object obj2;
        this.v = false;
        aonv aonvVar = this.f;
        if (aonvVar == null) {
            ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "continueBillingFlow", 341, "PlayBillingController.java")).w("%s", "Continue billing flow failed because play billing command is null.");
            zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingControllerContinue billing flow failed because play billing command is null.");
            tuk.n(this.j, R.string.payment_wallet_processing_error, 1);
            return;
        }
        String strG = g();
        String str = this.e;
        if (str == null || !str.equals(strG)) {
            w(34, "Launch billing flow failed because email account mismatch.");
            if (e()) {
                nsh.e(this.B, this.g, 11, 6, "INVALID_ACCOUNT", l("Launch billing flow failed because email account mismatch."));
            }
            String str2 = true == ahno.aa(strG) ? "Launch billing flow failed because email account mismatch. And current account is null or empty." : "Launch billing flow failed because email account mismatch.";
            ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "continueBillingFlow", 363, "PlayBillingController.java")).w("%s", str2);
            zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingController".concat(str2));
            tuk.n(this.j, R.string.payment_wallet_processing_error, 1);
            h();
            return;
        }
        try {
            aonw aonwVar = aonvVar.d;
            if (aonwVar == null) {
                aonwVar = aonw.a;
            }
            if (aonwVar.d.size() == 0) {
                ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "buildBillingFlowParam", 755, "PlayBillingController.java")).w("%s", "Build BillingFlowParam fails because of invalid play cart payload, empty sku details");
                zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingControllerBuild BillingFlowParam fails because of invalid play cart payload, empty sku details");
                throw new IllegalArgumentException("Build BillingFlowParam fails because of invalid play cart payload, empty sku details");
            }
            ArrayList arrayList = new ArrayList();
            for (String str3 : aonwVar.d) {
                try {
                    arrayList.add(new SkuDetails(str3));
                } catch (IllegalArgumentException | JSONException e) {
                    String strConcat = "Build BillingFlowParam fails because of invalid SkuDetails json string: ".concat(String.valueOf(str3));
                    ((agrc) ((agrc) ((agrc) h.b()).j(e)).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "buildBillingFlowParam", (char) 768, "PlayBillingController.java")).w("%s", strConcat);
                    zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingController" + strConcat + ' ' + e.toString());
                    throw new IllegalArgumentException(strConcat, e);
                }
            }
            if ((aonwVar.b & 1) == 0 || aonwVar.c.isEmpty()) {
                z = true;
                obj = null;
                obj2 = null;
            } else {
                if ((aonwVar.b & 2) == 0) {
                    ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "buildBillingFlowParam", 781, "PlayBillingController.java")).w("%s", "Invalid play cart payload, empty SubscriptionConsistencyToken for update purchase");
                    zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingControllerInvalid play cart payload, empty SubscriptionConsistencyToken for update purchase");
                    throw new IllegalArgumentException("Invalid play cart payload, empty SubscriptionConsistencyToken for update purchase");
                }
                isw iswVarK = zi.k(aonwVar.e, aonwVar.c, false);
                obj2 = iswVarK.b;
                obj = iswVarK.a;
                z = false;
            }
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (arrayList.contains(null)) {
                throw new IllegalArgumentException("SKU cannot be null.");
            }
            if (arrayList.size() > 1) {
                SkuDetails skuDetails = (SkuDetails) arrayList.get(0);
                String strD = skuDetails.d();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    SkuDetails skuDetails2 = (SkuDetails) arrayList.get(i2);
                    if (!strD.equals("play_pass_subs") && !skuDetails2.d().equals("play_pass_subs") && !strD.equals(skuDetails2.d())) {
                        throw new IllegalArgumentException("SKUs should have the same type.");
                    }
                }
                String strA = skuDetails.a();
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    SkuDetails skuDetails3 = (SkuDetails) arrayList.get(i3);
                    if (!strD.equals("play_pass_subs") && !skuDetails3.d().equals("play_pass_subs") && !strA.equals(skuDetails3.a())) {
                        throw new IllegalArgumentException("All SKUs must have the same package name.");
                    }
                }
            }
            eob eobVar = new eob();
            eobVar.a = !((SkuDetails) arrayList.get(0)).a().isEmpty();
            eobVar.b = zi.k((String) obj2, (String) obj, z);
            eobVar.d = new ArrayList(arrayList);
            eobVar.c = agpi.a;
            if ((aonvVar.c & 4) != 0) {
                vxe vxeVar = this.b;
                ajwo ajwoVar = aonvVar.f;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.a(ajwoVar);
            }
            enu enuVar = this.c;
            if (enuVar != null) {
                cf cfVar = this.j;
                eoh eohVarE = enuVar.e(cfVar, eobVar);
                int i4 = eohVarE.a;
                String str4 = eohVarE.c;
                if (i4 != 0) {
                    String str5 = "Can not display the play cart, error code is: " + i4 + ", debug message is: " + str4;
                    ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "continueBillingFlow", 428, "PlayBillingController.java")).w("%s", str5);
                    zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingController".concat(str5));
                    tuk.n(cfVar, R.string.payment_wallet_processing_error, 1);
                    return;
                }
                acb acbVar = new acb((char[]) null);
                aonv aonvVar2 = this.f;
                if (aonvVar2 != null && (aonvVar2.c & 2) != 0) {
                    acbVar.d = aonvVar2.e;
                }
                xeu xeuVar = this.k;
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(acbVar.o(), alot.TRANSACTION_FLOW_SHOW_PAYMENT_DIALOG);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                } else {
                    alos alosVar = (alos) alou.a.createBuilder();
                    arob arobVarN = acbVar.n();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    arobVarN.getClass();
                    alouVar.d = arobVarN;
                    alouVar.c = 405;
                    xeuVar.b((alou) alosVar.build());
                }
                xir xirVar = this.m;
                if (xirVar != null) {
                    xirVar.n("ttc");
                }
            }
        } catch (IllegalArgumentException e2) {
            ((agrc) ((agrc) ((agrc) h.b()).j(e2)).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "continueBillingFlow", (char) 375, "PlayBillingController.java")).w("%s", "Can not display the play cart. Billing flow params is empty because ");
            zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingControllerCan not display the play cart. Billing flow params is empty because ".concat(String.valueOf(e2.getMessage())));
            tuk.n(this.j, R.string.payment_wallet_processing_error_without_retry, 1);
            w(29, e2.getMessage());
            if (e()) {
                nsh.e(this.B, this.g, 11, 6, "INVALID_PLAY_CART_PAYLOAD", l("Can not display the play cart. Billing flow params is empty because "));
            }
        }
    }

    private final void p() {
        synchronized (this.s) {
            if (this.u) {
                this.o.i();
                this.u = false;
            }
        }
    }

    private final void q(String str, String str2) {
        acb acbVar = new acb((char[]) null);
        acbVar.c = str;
        acbVar.b = str2;
        aonv aonvVar = this.f;
        if (aonvVar != null && (aonvVar.c & 2) != 0) {
            acbVar.d = aonvVar.e;
        }
        xeu xeuVar = this.k;
        if (!xeuVar.b) {
            xeuVar.b(acbVar.i());
            return;
        }
        xff xffVarA = xeuVar.a(acbVar.o(), alot.TRANSACTION_FLOW_PAYMENT_CALL_BACK_RECEIVED);
        ztf ztfVar = xffVarA.k.e;
        xffVarA.l = ztfVar.a();
        ztfVar.k(xffVarA);
    }

    private final void r() {
        this.t = 0;
        this.x = null;
    }

    private final synchronized void s() {
        enu enuVar = this.c;
        if (enuVar == null || enuVar.a() != 2) {
            if (this.v) {
                synchronized (this.s) {
                    try {
                        if (!this.u) {
                            if (this.A.m(14, 45616899L)) {
                                this.o.iR(false);
                            }
                            this.o.h(this.j.getSupportFragmentManager(), sud.k);
                            this.u = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            enu enuVar2 = this.c;
            if (enuVar2 == null || enuVar2.a() != 1) {
                if (!this.w) {
                    ((agrc) ((agrc) h.c()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "startConnection", 209, "PlayBillingController.java")).w("%s", "StartConnection() is already scheduled");
                    zvp.a(zvn.a, zvm.l, "playPayment::PlayBillingControllerStartConnection() is already scheduled");
                    return;
                }
                if (!t()) {
                    ((agrc) ((agrc) h.c()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "startConnection", 217, "PlayBillingController.java")).w("%s", "Reach the reconnection limit for the billing client in the current activity cycle.");
                    zvp.a(zvn.a, zvm.l, "playPayment::PlayBillingControllerReach the reconnection limit for the billing client in the current activity cycle.");
                    if (this.v) {
                        tuk.n(this.j, R.string.payment_wallet_processing_error, 1);
                    }
                    m();
                    return;
                }
                n();
                this.w = false;
                long jD = this.a.d(1, 45360657L);
                int i2 = this.t;
                if (i2 <= 1 || jD == 0) {
                    i();
                } else {
                    avmb avmbVar = this.q;
                    avlb.x((long) (jD * 1000000.0d * ((double) (i2 - 1))), TimeUnit.MICROSECONDS, avmbVar).j(new hoi(this, 16)).r(avmbVar).D();
                }
            }
        }
    }

    private final boolean t() {
        vxz vxzVar = this.a;
        if (this.t < (vxzVar.m(1, 45360655L) ? vxzVar.d(0, 45360656L) : 3L)) {
            return true;
        }
        Instant instant = this.x;
        if (instant == null || Duration.between(instant, this.r.a()).compareTo(Duration.ofMinutes(d())) <= 0 || d() == 0) {
            return false;
        }
        r();
        return true;
    }

    private static final String u(eoh eohVar) {
        String string = eohVar.toString();
        return string.substring(0, string.indexOf(", Debug Message"));
    }

    private final void v(int i2, String str) {
        acb acbVar = new acb((char[]) null);
        acbVar.a = i2;
        aonv aonvVar = this.f;
        if (aonvVar != null && (aonvVar.c & 2) != 0) {
            acbVar.d = aonvVar.e;
        }
        if (!str.isEmpty()) {
            acbVar.c = str;
        }
        xeu xeuVar = this.k;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(acbVar.o(), alot.TRANSACTION_FLOW_ERROR_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        arob arobVarN = acbVar.n();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        arobVarN.getClass();
        alouVar.d = arobVarN;
        alouVar.c = 411;
        xeuVar.b((alou) alosVar.build());
    }

    private final void w(int i2, String str) {
        acb acbVar = new acb((char[]) null);
        acbVar.a = i2;
        aonv aonvVar = this.f;
        if (aonvVar != null && (aonvVar.c & 2) != 0) {
            acbVar.d = aonvVar.e;
        }
        if (str != null && !str.isEmpty()) {
            acbVar.c = str;
        }
        xeu xeuVar = this.k;
        if (!xeuVar.b) {
            xeuVar.b(acbVar.h());
            return;
        }
        xff xffVarA = xeuVar.a(acbVar.o(), alot.TRANSACTION_FLOW_FAILED);
        ztf ztfVar = xffVarA.k.e;
        xffVarA.l = ztfVar.a();
        ztfVar.k(xffVarA);
    }

    private static final int x(eoh eohVar) {
        switch (eohVar.a) {
            case -3:
                return 24;
            case -2:
                return 25;
            case -1:
                return 26;
            case 0:
            case 1:
            case 9:
            case 10:
            default:
                return 1;
            case 2:
                return 27;
            case 3:
                return 28;
            case 4:
                return 38;
            case 5:
                return 30;
            case 6:
                return 31;
            case 7:
                return 32;
            case 8:
                return 50;
            case 11:
                return 33;
            case 12:
                return 49;
        }
    }

    @Override // defpackage.eny
    public final void a() {
        q("Play billing client disconnected", "onBillingServiceDisconnected");
        if (!f()) {
            s();
        }
        v(26, "Play billing client disconnected");
        if (e()) {
            nsh.e(this.B, this.g, 44, 5, "CLIENT_BILLING_CONNECTION_ERROR", l("Play billing client disconnected"));
        }
    }

    @Override // defpackage.eny
    public final void b(eoh eohVar) {
        q(eohVar.a == 0 ? "Billing Client is connected" : eohVar.c, "onBillingSetupFinished");
        int i2 = eohVar.a;
        if (i2 == 0) {
            if (this.v) {
                p();
                o();
            }
            r();
            return;
        }
        String str = "Connecting billing client fails, error code is : " + i2 + ", and error message is : " + eohVar.c;
        ((agrc) ((agrc) h.c()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "onBillingSetupFinished", 457, "PlayBillingController.java")).w("%s", str);
        zvp.a(zvn.a, zvm.l, "playPayment::PlayBillingController".concat(str));
        v(x(eohVar), "onBillingSetupFinished failed: ".concat(String.valueOf(eohVar.c)));
        if (e()) {
            nsh.e(this.B, this.g, 44, 5, u(eohVar), l(eohVar.c));
        }
        if (eohVar.a == 3) {
            if (this.v) {
                tuk.n(this.j, R.string.payment_wallet_processing_error_without_retry, 1);
                w(x(eohVar), "onBillingSetupFinished failed: ".concat(String.valueOf(eohVar.c)));
                if (e()) {
                    nsh.e(this.B, this.g, 11, 5, u(eohVar), l(eohVar.c));
                }
            }
            m();
            return;
        }
        if (!t()) {
            this.x = this.r.a();
            if (this.v) {
                w(x(eohVar), "onBillingSetupFinished failed: ".concat(String.valueOf(eohVar.c)));
                if (e()) {
                    nsh.e(this.B, this.g, 11, 5, u(eohVar), l(eohVar.c));
                }
            } else {
                v(37, "onBillingSetupFinished failed: ".concat(String.valueOf(eohVar.c)));
                if (e()) {
                    nsh.e(this.B, this.g, 44, 5, "CLIENT_BILLING_CONNECTION_ERROR", l(eohVar.c));
                }
            }
        }
        s();
    }

    @Override // defpackage.eom
    public final void c(eoh eohVar, List list) {
        String str = "Receive Play payment update: " + eohVar.a + ' ' + eohVar.c;
        q(eohVar.a == 0 ? "Successful payment" : str, "onPurchasesUpdated");
        int i2 = eohVar.a;
        if (i2 == -1) {
            s();
            w(x(eohVar), str);
            if (e()) {
                nsh.e(this.B, this.g, 11, 4, u(eohVar), l(eohVar.c));
            }
            zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingController".concat(str));
            tuk.n(this.j, R.string.payment_wallet_processing_error, 1);
            this.f = null;
            this.d = true;
            return;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                j("Payment Result");
                this.f = null;
                this.d = true;
                return;
            }
            aonv aonvVar = this.f;
            if (aonvVar == null) {
                ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "handlePaymentResultDefault", 635, "PlayBillingController.java")).w("%s", "Handle default payment result failed, because play billing command is empty.");
                zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingControllerHandle default payment result failed, because play billing command is empty.");
            } else if ((aonvVar.c & 16) != 0) {
                vxe vxeVar = this.b;
                ajwo ajwoVar = aonvVar.h;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.a(ajwoVar);
            }
            w(x(eohVar), str);
            if (e()) {
                nsh.e(this.B, this.g, 11, 4, u(eohVar), l(eohVar.c));
            }
            zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingController".concat(str));
            boolean zContains = i.contains(Integer.valueOf(eohVar.a));
            cf cfVar = this.j;
            if (zContains) {
                tuk.n(cfVar, R.string.payment_wallet_processing_error_without_retry, 1);
            } else {
                tuk.n(cfVar, R.string.payment_wallet_processing_error, 1);
            }
            this.f = null;
            this.d = true;
            return;
        }
        if (list == null || list.isEmpty()) {
            ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "onPurchasesUpdated", 666, "PlayBillingController.java")).w("%s", "FirstPartyPurchases value is null or empty");
            zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingControllerFirstPartyPurchases value is null or empty");
            tuk.n(this.j, R.string.payment_wallet_processing_error, 1);
            this.f = null;
            this.d = true;
            return;
        }
        acb acbVar = new acb((char[]) null);
        aonv aonvVar2 = this.f;
        if (aonvVar2 != null && (aonvVar2.c & 2) != 0) {
            acbVar.d = aonvVar2.e;
        }
        xeu xeuVar = this.k;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(acbVar.o(), alot.TRANSACTION_FLOW_PAYMENT_SUCCEEDED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } else {
            xeuVar.b(acbVar.j());
        }
        aonv aonvVar3 = this.f;
        if (aonvVar3 == null) {
            ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "handlePaymentResultOk", 596, "PlayBillingController.java")).w("%s", "PlayBillingCommand is null");
            zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingControllerPlayBillingCommand is null");
            tuk.n(this.j, R.string.payment_wallet_processing_error, 1);
            this.f = null;
            this.d = true;
            return;
        }
        if ((aonvVar3.c & 64) == 0) {
            ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "handlePaymentResultOk", 603, "PlayBillingController.java")).w("%s", "CommerceAcquisitionClientPayloadEntityKey is null in the PlayBillingCommand");
            zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingControllerCommerceAcquisitionClientPayloadEntityKey is null in the PlayBillingCommand");
            tuk.n(this.j, R.string.payment_wallet_processing_error, 1);
            this.f = null;
            this.d = true;
            return;
        }
        wby wbyVarB = this.p.b(this.n.e());
        aonv aonvVar4 = this.f;
        if (aonvVar4 == null || (aonvVar4.c & 64) == 0) {
            this.f = null;
            this.d = true;
            return;
        }
        ajzx ajzxVarE = ajzz.e(aonvVar4.j);
        aihf aihfVarCreateBuilder = akad.a.createBuilder();
        aihf aihfVarCreateBuilder2 = akag.a.createBuilder();
        List list2 = (List) Collection.EL.stream(list).map(new snm(3)).collect(aghu.a);
        aihfVarCreateBuilder2.copyOnWrite();
        akag akagVar = (akag) aihfVarCreateBuilder2.instance;
        aiie aiieVar = akagVar.b;
        if (!aiieVar.c()) {
            akagVar.b = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(list2, akagVar.b);
        aihfVarCreateBuilder.copyOnWrite();
        akad akadVar = (akad) aihfVarCreateBuilder.instance;
        akag akagVar2 = (akag) aihfVarCreateBuilder2.build();
        akagVar2.getClass();
        akadVar.c = akagVar2;
        akadVar.b = 1;
        ajzxVarE.am((akad) aihfVarCreateBuilder.build());
        ajzz ajzzVarAn = ajzxVarE.an();
        wer werVarE = wbyVarB.e();
        werVarE.e(ajzzVarAn);
        werVarE.b().r(this.q).j(new hoi(this, 15)).D();
    }

    final String g() {
        zwa zwaVarE = this.n.e();
        if (zwaVarE instanceof rlt) {
            return ((rlt) zwaVarE).b;
        }
        zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingControllerFailed to get buyer email: It is not an account identity.");
        return null;
    }

    public final void h() {
        m();
        r();
        n();
        this.w = true;
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        h();
    }

    public final synchronized void i() {
        enu eoaVar;
        String strG = g();
        if (ahno.aa(strG)) {
            this.e = null;
            ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "connectBillingClient", 254, "PlayBillingController.java")).w("%s", "Can not warm up billing client because there's no valid account name.");
            zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingControllerCan not warm up billing client because there's no valid account name.");
            if (this.v) {
                w(36, "Can not warm up billing client because there's no valid account name.");
                if (e()) {
                    nsh.e(this.B, this.g, 11, 6, "INVALID_ACCOUNT", l("Can not warm up billing client because there's no valid account name."));
                }
                tuk.n(this.j, R.string.payment_wallet_processing_error, 1);
            }
            m();
            return;
        }
        this.e = strG;
        ent entVar = new ent(this.j);
        entVar.d = this;
        entVar.q = new acih();
        entVar.a = strG;
        if (f()) {
            entVar.o = true;
        }
        if (this.z.l(68, 45410245L, false)) {
            entVar.g = this.y;
        }
        Context context = entVar.b;
        if (context == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        eop eopVar = entVar.c;
        eop eopVar2 = entVar.c;
        if (entVar.d == null) {
            eot eotVar = entVar.f;
            boolean z = entVar.n;
            boolean z2 = entVar.h;
            boolean z3 = entVar.i;
            boolean z4 = entVar.k;
            boolean z5 = entVar.l;
            boolean z6 = entVar.m;
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (entVar.q == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        boolean z7 = entVar.q.a;
        eop eopVar3 = entVar.c;
        String str = entVar.a;
        acih acihVar = entVar.q;
        eom eomVar = entVar.d;
        eod eodVar = entVar.e;
        ExecutorService executorService = entVar.g;
        boolean z8 = entVar.j;
        try {
            eoaVar = context.getPackageManager().getApplicationInfo(context.getPackageName(), SemanticState.Focused).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false) ? new eoa(str, acihVar, context, eomVar, executorService, entVar) : new enu(str, acihVar, context, eomVar, executorService, entVar);
        } catch (Exception e) {
            eov.f("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
        }
        this.c = eoaVar;
        this.t++;
        acb acbVar = new acb((char[]) null);
        acbVar.c = true != this.v ? "Not in pending billing flow" : "In pending billing flow";
        aonv aonvVar = this.f;
        if (aonvVar != null && (aonvVar.c & 2) != 0) {
            acbVar.d = aonvVar.e;
        }
        xeu xeuVar = this.k;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(acbVar.o(), alot.TRANSACTION_FLOW_PLAY_BILLING_CONNECTION_START_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } else {
            alos alosVar = (alos) alou.a.createBuilder();
            arob arobVarN = acbVar.n();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            arobVarN.getClass();
            alouVar.d = arobVarN;
            alouVar.c = 428;
            xeuVar.b((alou) alosVar.build());
        }
        enu enuVar = this.c;
        if (enuVar != null) {
            enuVar.o(this);
        }
        this.w = true;
    }

    public final void j(String str) {
        aonv aonvVar = this.f;
        if (aonvVar == null) {
            String strConcat = "Handle cancelled payment result failed, because play billing command is empty. Debug message: ".concat(str);
            ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "handlePaymentCancelled", 619, "PlayBillingController.java")).w("%s", strConcat);
            zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingController".concat(strConcat));
            return;
        }
        if ((aonvVar.c & 8) != 0) {
            vxe vxeVar = this.b;
            ajwo ajwoVar = aonvVar.g;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
        }
        acb acbVar = new acb((char[]) null);
        acbVar.c = str;
        aonv aonvVar2 = this.f;
        if (aonvVar2 != null && (aonvVar2.c & 2) != 0) {
            acbVar.d = aonvVar2.e;
        }
        xeu xeuVar = this.k;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(acbVar.o(), alot.TRANSACTION_FLOW_CANCELLED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } else {
            xeuVar.b(acbVar.g());
        }
        tuk.n(this.j, R.string.payment_purchase_cancelled, 1);
        m();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0068 A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:11:0x0015, B:12:0x0019, B:14:0x001f, B:16:0x003e, B:29:0x0068, B:31:0x0099, B:33:0x009d, B:37:0x00a6, B:34:0x00a0, B:36:0x00a4, B:38:0x00af, B:41:0x00b9, B:43:0x00bd, B:44:0x00bf, B:46:0x00c7, B:60:0x00f8, B:62:0x0128, B:64:0x012c, B:68:0x0135, B:65:0x012f, B:67:0x0133, B:69:0x013e, B:72:0x0148, B:74:0x0150, B:75:0x0152, B:77:0x015a, B:79:0x0160, B:81:0x0166, B:84:0x016b, B:47:0x00ce, B:49:0x00d2, B:50:0x00d4, B:51:0x00da, B:53:0x00e0, B:55:0x00ec, B:19:0x004f, B:21:0x0055, B:15:0x0037), top: B:91:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0099 A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:11:0x0015, B:12:0x0019, B:14:0x001f, B:16:0x003e, B:29:0x0068, B:31:0x0099, B:33:0x009d, B:37:0x00a6, B:34:0x00a0, B:36:0x00a4, B:38:0x00af, B:41:0x00b9, B:43:0x00bd, B:44:0x00bf, B:46:0x00c7, B:60:0x00f8, B:62:0x0128, B:64:0x012c, B:68:0x0135, B:65:0x012f, B:67:0x0133, B:69:0x013e, B:72:0x0148, B:74:0x0150, B:75:0x0152, B:77:0x015a, B:79:0x0160, B:81:0x0166, B:84:0x016b, B:47:0x00ce, B:49:0x00d2, B:50:0x00d4, B:51:0x00da, B:53:0x00e0, B:55:0x00ec, B:19:0x004f, B:21:0x0055, B:15:0x0037), top: B:91:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9 A[Catch: all -> 0x0172, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:11:0x0015, B:12:0x0019, B:14:0x001f, B:16:0x003e, B:29:0x0068, B:31:0x0099, B:33:0x009d, B:37:0x00a6, B:34:0x00a0, B:36:0x00a4, B:38:0x00af, B:41:0x00b9, B:43:0x00bd, B:44:0x00bf, B:46:0x00c7, B:60:0x00f8, B:62:0x0128, B:64:0x012c, B:68:0x0135, B:65:0x012f, B:67:0x0133, B:69:0x013e, B:72:0x0148, B:74:0x0150, B:75:0x0152, B:77:0x015a, B:79:0x0160, B:81:0x0166, B:84:0x016b, B:47:0x00ce, B:49:0x00d2, B:50:0x00d4, B:51:0x00da, B:53:0x00e0, B:55:0x00ec, B:19:0x004f, B:21:0x0055, B:15:0x0037), top: B:91:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:11:0x0015, B:12:0x0019, B:14:0x001f, B:16:0x003e, B:29:0x0068, B:31:0x0099, B:33:0x009d, B:37:0x00a6, B:34:0x00a0, B:36:0x00a4, B:38:0x00af, B:41:0x00b9, B:43:0x00bd, B:44:0x00bf, B:46:0x00c7, B:60:0x00f8, B:62:0x0128, B:64:0x012c, B:68:0x0135, B:65:0x012f, B:67:0x0133, B:69:0x013e, B:72:0x0148, B:74:0x0150, B:75:0x0152, B:77:0x015a, B:79:0x0160, B:81:0x0166, B:84:0x016b, B:47:0x00ce, B:49:0x00d2, B:50:0x00d4, B:51:0x00da, B:53:0x00e0, B:55:0x00ec, B:19:0x004f, B:21:0x0055, B:15:0x0037), top: B:91:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7 A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:11:0x0015, B:12:0x0019, B:14:0x001f, B:16:0x003e, B:29:0x0068, B:31:0x0099, B:33:0x009d, B:37:0x00a6, B:34:0x00a0, B:36:0x00a4, B:38:0x00af, B:41:0x00b9, B:43:0x00bd, B:44:0x00bf, B:46:0x00c7, B:60:0x00f8, B:62:0x0128, B:64:0x012c, B:68:0x0135, B:65:0x012f, B:67:0x0133, B:69:0x013e, B:72:0x0148, B:74:0x0150, B:75:0x0152, B:77:0x015a, B:79:0x0160, B:81:0x0166, B:84:0x016b, B:47:0x00ce, B:49:0x00d2, B:50:0x00d4, B:51:0x00da, B:53:0x00e0, B:55:0x00ec, B:19:0x004f, B:21:0x0055, B:15:0x0037), top: B:91:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:11:0x0015, B:12:0x0019, B:14:0x001f, B:16:0x003e, B:29:0x0068, B:31:0x0099, B:33:0x009d, B:37:0x00a6, B:34:0x00a0, B:36:0x00a4, B:38:0x00af, B:41:0x00b9, B:43:0x00bd, B:44:0x00bf, B:46:0x00c7, B:60:0x00f8, B:62:0x0128, B:64:0x012c, B:68:0x0135, B:65:0x012f, B:67:0x0133, B:69:0x013e, B:72:0x0148, B:74:0x0150, B:75:0x0152, B:77:0x015a, B:79:0x0160, B:81:0x0166, B:84:0x016b, B:47:0x00ce, B:49:0x00d2, B:50:0x00d4, B:51:0x00da, B:53:0x00e0, B:55:0x00ec, B:19:0x004f, B:21:0x0055, B:15:0x0037), top: B:91:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2 A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:11:0x0015, B:12:0x0019, B:14:0x001f, B:16:0x003e, B:29:0x0068, B:31:0x0099, B:33:0x009d, B:37:0x00a6, B:34:0x00a0, B:36:0x00a4, B:38:0x00af, B:41:0x00b9, B:43:0x00bd, B:44:0x00bf, B:46:0x00c7, B:60:0x00f8, B:62:0x0128, B:64:0x012c, B:68:0x0135, B:65:0x012f, B:67:0x0133, B:69:0x013e, B:72:0x0148, B:74:0x0150, B:75:0x0152, B:77:0x015a, B:79:0x0160, B:81:0x0166, B:84:0x016b, B:47:0x00ce, B:49:0x00d2, B:50:0x00d4, B:51:0x00da, B:53:0x00e0, B:55:0x00ec, B:19:0x004f, B:21:0x0055, B:15:0x0037), top: B:91:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0 A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:11:0x0015, B:12:0x0019, B:14:0x001f, B:16:0x003e, B:29:0x0068, B:31:0x0099, B:33:0x009d, B:37:0x00a6, B:34:0x00a0, B:36:0x00a4, B:38:0x00af, B:41:0x00b9, B:43:0x00bd, B:44:0x00bf, B:46:0x00c7, B:60:0x00f8, B:62:0x0128, B:64:0x012c, B:68:0x0135, B:65:0x012f, B:67:0x0133, B:69:0x013e, B:72:0x0148, B:74:0x0150, B:75:0x0152, B:77:0x015a, B:79:0x0160, B:81:0x0166, B:84:0x016b, B:47:0x00ce, B:49:0x00d2, B:50:0x00d4, B:51:0x00da, B:53:0x00e0, B:55:0x00ec, B:19:0x004f, B:21:0x0055, B:15:0x0037), top: B:91:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8 A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:11:0x0015, B:12:0x0019, B:14:0x001f, B:16:0x003e, B:29:0x0068, B:31:0x0099, B:33:0x009d, B:37:0x00a6, B:34:0x00a0, B:36:0x00a4, B:38:0x00af, B:41:0x00b9, B:43:0x00bd, B:44:0x00bf, B:46:0x00c7, B:60:0x00f8, B:62:0x0128, B:64:0x012c, B:68:0x0135, B:65:0x012f, B:67:0x0133, B:69:0x013e, B:72:0x0148, B:74:0x0150, B:75:0x0152, B:77:0x015a, B:79:0x0160, B:81:0x0166, B:84:0x016b, B:47:0x00ce, B:49:0x00d2, B:50:0x00d4, B:51:0x00da, B:53:0x00e0, B:55:0x00ec, B:19:0x004f, B:21:0x0055, B:15:0x0037), top: B:91:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0128 A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:11:0x0015, B:12:0x0019, B:14:0x001f, B:16:0x003e, B:29:0x0068, B:31:0x0099, B:33:0x009d, B:37:0x00a6, B:34:0x00a0, B:36:0x00a4, B:38:0x00af, B:41:0x00b9, B:43:0x00bd, B:44:0x00bf, B:46:0x00c7, B:60:0x00f8, B:62:0x0128, B:64:0x012c, B:68:0x0135, B:65:0x012f, B:67:0x0133, B:69:0x013e, B:72:0x0148, B:74:0x0150, B:75:0x0152, B:77:0x015a, B:79:0x0160, B:81:0x0166, B:84:0x016b, B:47:0x00ce, B:49:0x00d2, B:50:0x00d4, B:51:0x00da, B:53:0x00e0, B:55:0x00ec, B:19:0x004f, B:21:0x0055, B:15:0x0037), top: B:91:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x012c A[ADDED_TO_REGION, Catch: all -> 0x0172, REMOVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:11:0x0015, B:12:0x0019, B:14:0x001f, B:16:0x003e, B:29:0x0068, B:31:0x0099, B:33:0x009d, B:37:0x00a6, B:34:0x00a0, B:36:0x00a4, B:38:0x00af, B:41:0x00b9, B:43:0x00bd, B:44:0x00bf, B:46:0x00c7, B:60:0x00f8, B:62:0x0128, B:64:0x012c, B:68:0x0135, B:65:0x012f, B:67:0x0133, B:69:0x013e, B:72:0x0148, B:74:0x0150, B:75:0x0152, B:77:0x015a, B:79:0x0160, B:81:0x0166, B:84:0x016b, B:47:0x00ce, B:49:0x00d2, B:50:0x00d4, B:51:0x00da, B:53:0x00e0, B:55:0x00ec, B:19:0x004f, B:21:0x0055, B:15:0x0037), top: B:91:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x012f A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:11:0x0015, B:12:0x0019, B:14:0x001f, B:16:0x003e, B:29:0x0068, B:31:0x0099, B:33:0x009d, B:37:0x00a6, B:34:0x00a0, B:36:0x00a4, B:38:0x00af, B:41:0x00b9, B:43:0x00bd, B:44:0x00bf, B:46:0x00c7, B:60:0x00f8, B:62:0x0128, B:64:0x012c, B:68:0x0135, B:65:0x012f, B:67:0x0133, B:69:0x013e, B:72:0x0148, B:74:0x0150, B:75:0x0152, B:77:0x015a, B:79:0x0160, B:81:0x0166, B:84:0x016b, B:47:0x00ce, B:49:0x00d2, B:50:0x00d4, B:51:0x00da, B:53:0x00e0, B:55:0x00ec, B:19:0x004f, B:21:0x0055, B:15:0x0037), top: B:91:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0148 A[Catch: all -> 0x0172, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:11:0x0015, B:12:0x0019, B:14:0x001f, B:16:0x003e, B:29:0x0068, B:31:0x0099, B:33:0x009d, B:37:0x00a6, B:34:0x00a0, B:36:0x00a4, B:38:0x00af, B:41:0x00b9, B:43:0x00bd, B:44:0x00bf, B:46:0x00c7, B:60:0x00f8, B:62:0x0128, B:64:0x012c, B:68:0x0135, B:65:0x012f, B:67:0x0133, B:69:0x013e, B:72:0x0148, B:74:0x0150, B:75:0x0152, B:77:0x015a, B:79:0x0160, B:81:0x0166, B:84:0x016b, B:47:0x00ce, B:49:0x00d2, B:50:0x00d4, B:51:0x00da, B:53:0x00e0, B:55:0x00ec, B:19:0x004f, B:21:0x0055, B:15:0x0037), top: B:91:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0150 A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:11:0x0015, B:12:0x0019, B:14:0x001f, B:16:0x003e, B:29:0x0068, B:31:0x0099, B:33:0x009d, B:37:0x00a6, B:34:0x00a0, B:36:0x00a4, B:38:0x00af, B:41:0x00b9, B:43:0x00bd, B:44:0x00bf, B:46:0x00c7, B:60:0x00f8, B:62:0x0128, B:64:0x012c, B:68:0x0135, B:65:0x012f, B:67:0x0133, B:69:0x013e, B:72:0x0148, B:74:0x0150, B:75:0x0152, B:77:0x015a, B:79:0x0160, B:81:0x0166, B:84:0x016b, B:47:0x00ce, B:49:0x00d2, B:50:0x00d4, B:51:0x00da, B:53:0x00e0, B:55:0x00ec, B:19:0x004f, B:21:0x0055, B:15:0x0037), top: B:91:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x015a A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:11:0x0015, B:12:0x0019, B:14:0x001f, B:16:0x003e, B:29:0x0068, B:31:0x0099, B:33:0x009d, B:37:0x00a6, B:34:0x00a0, B:36:0x00a4, B:38:0x00af, B:41:0x00b9, B:43:0x00bd, B:44:0x00bf, B:46:0x00c7, B:60:0x00f8, B:62:0x0128, B:64:0x012c, B:68:0x0135, B:65:0x012f, B:67:0x0133, B:69:0x013e, B:72:0x0148, B:74:0x0150, B:75:0x0152, B:77:0x015a, B:79:0x0160, B:81:0x0166, B:84:0x016b, B:47:0x00ce, B:49:0x00d2, B:50:0x00d4, B:51:0x00da, B:53:0x00e0, B:55:0x00ec, B:19:0x004f, B:21:0x0055, B:15:0x0037), top: B:91:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[LOOP:0: B:51:0x00da->B:94:?, LOOP_END, SYNTHETIC] */
    public final synchronized void k(aonv aonvVar) {
        String str;
        String strConcat;
        boolean z;
        aonw aonwVar;
        aonw aonwVar2;
        Iterator it;
        boolean z2;
        String str2;
        aroq aroqVar;
        enu enuVar;
        aroq aroqVar2;
        if (this.d) {
            acb acbVar = new acb((char[]) null);
            if (aonvVar != null && (aonvVar.c & 2) != 0) {
                acbVar.d = aonvVar.e;
            }
            xeu xeuVar = this.k;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(acbVar.o(), alot.TRANSACTION_FLOW_STARTED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } else {
                xeuVar.b(acbVar.k());
            }
            this.m = this.l.n(185);
            if (aonvVar == null) {
                str = "Validate PlayBillingCommand: [Null PlayBillingCommand]";
            } else {
                int i2 = aonvVar.c;
                if ((i2 & 64) != 0) {
                    if ((i2 & 1) != 0) {
                        strConcat = "Validate PlayBillingCommand: ";
                        z = true;
                    } else {
                        str = "Validate PlayBillingCommand: play billing command doesn't have PlayCartPayload.";
                    }
                    if (!z) {
                        ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "validatePlayBillingCommand", 898, "PlayBillingController.java")).w("%s", strConcat);
                        zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingController".concat(strConcat));
                        w(35, strConcat);
                        if (e()) {
                            abte abteVar = this.B;
                            if (aonvVar != null || (aroqVar = aonvVar.k) == null) {
                            }
                            nsh.e(abteVar, aroqVar, 11, 6, "INVALID_CLIENT_BILLING_COMMAND", strConcat);
                        }
                        tuk.n(this.j, R.string.payment_wallet_processing_error, 1);
                        return;
                    }
                    aonwVar = aonvVar.d;
                    if (aonwVar == null) {
                        aonwVar = aonw.a;
                    }
                    if (aonwVar.d.isEmpty()) {
                        aonwVar2 = aonvVar.d;
                        if (aonwVar2 == null) {
                            aonwVar2 = aonw.a;
                        }
                        it = aonwVar2.d.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z2 = true;
                                break;
                            } else if (ahno.aa((String) it.next())) {
                                strConcat = strConcat.concat("playCartPayload has empty sku details string in the list.");
                            }
                        }
                        str2 = strConcat;
                        if (!z2) {
                            ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "validatePlayBillingCommand", 931, "PlayBillingController.java")).w("%s", str2);
                            zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingController".concat(str2));
                            w(6, str2);
                            if (e()) {
                                abte abteVar2 = this.B;
                                if (aonvVar != null || (aroqVar2 = aonvVar.k) == null) {
                                    aroqVar2 = aroq.a;
                                }
                                nsh.e(abteVar2, aroqVar2, 11, 6, "INVALID_PLAY_CART_PAYLOAD", str2);
                            }
                            tuk.n(this.j, R.string.payment_wallet_processing_error_without_retry, 1);
                            return;
                        }
                        this.d = false;
                        this.f = aonvVar;
                        aroqVar = aonvVar.k;
                        if (aroqVar == null) {
                            aroqVar = aroq.a;
                        }
                        this.g = aroqVar;
                        this.v = true;
                        enuVar = this.c;
                        if (enuVar == null && (enuVar.a() == 2 || f())) {
                            o();
                            return;
                        } else {
                            s();
                        }
                    }
                    strConcat = strConcat.concat("playCartPayload has empty sku details list.");
                    z2 = false;
                    str2 = strConcat;
                    if (!z2) {
                        ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "validatePlayBillingCommand", 931, "PlayBillingController.java")).w("%s", str2);
                        zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingController".concat(str2));
                        w(6, str2);
                        if (e()) {
                            abte abteVar3 = this.B;
                            if (aonvVar != null) {
                                aroqVar2 = aroq.a;
                            } else {
                                aroqVar2 = aroq.a;
                            }
                            nsh.e(abteVar3, aroqVar2, 11, 6, "INVALID_PLAY_CART_PAYLOAD", str2);
                        }
                        tuk.n(this.j, R.string.payment_wallet_processing_error_without_retry, 1);
                        return;
                    }
                    this.d = false;
                    this.f = aonvVar;
                    aroqVar = aonvVar.k;
                    if (aroqVar == null) {
                        aroqVar = aroq.a;
                    }
                    this.g = aroqVar;
                    this.v = true;
                    enuVar = this.c;
                    if (enuVar == null) {
                    }
                    s();
                }
                str = "Validate PlayBillingCommand: play billing command doesn't have CommerceAcquisitionClientPayloadEntityKey.";
            }
            strConcat = str;
            z = false;
            if (!z) {
                ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "validatePlayBillingCommand", 898, "PlayBillingController.java")).w("%s", strConcat);
                zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingController".concat(strConcat));
                w(35, strConcat);
                if (e()) {
                    abte abteVar4 = this.B;
                    aroq aroqVar3 = aonvVar != null ? aroq.a : aroq.a;
                    nsh.e(abteVar4, aroqVar3, 11, 6, "INVALID_CLIENT_BILLING_COMMAND", strConcat);
                }
                tuk.n(this.j, R.string.payment_wallet_processing_error, 1);
                return;
            }
            aonwVar = aonvVar.d;
            if (aonwVar == null) {
                aonwVar = aonw.a;
            }
            if (aonwVar.d.isEmpty()) {
                aonwVar2 = aonvVar.d;
                if (aonwVar2 == null) {
                    aonwVar2 = aonw.a;
                }
                it = aonwVar2.d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        z2 = true;
                        break;
                    } else if (ahno.aa((String) it.next())) {
                        strConcat = strConcat.concat("playCartPayload has empty sku details string in the list.");
                    }
                }
                str2 = strConcat;
                if (!z2) {
                    ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "validatePlayBillingCommand", 931, "PlayBillingController.java")).w("%s", str2);
                    zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingController".concat(str2));
                    w(6, str2);
                    if (e()) {
                        abte abteVar5 = this.B;
                        if (aonvVar != null) {
                            aroqVar2 = aroq.a;
                        } else {
                            aroqVar2 = aroq.a;
                        }
                        nsh.e(abteVar5, aroqVar2, 11, 6, "INVALID_PLAY_CART_PAYLOAD", str2);
                    }
                    tuk.n(this.j, R.string.payment_wallet_processing_error_without_retry, 1);
                    return;
                }
                this.d = false;
                this.f = aonvVar;
                aroqVar = aonvVar.k;
                if (aroqVar == null) {
                    aroqVar = aroq.a;
                }
                this.g = aroqVar;
                this.v = true;
                enuVar = this.c;
                if (enuVar == null) {
                }
                s();
            }
            strConcat = strConcat.concat("playCartPayload has empty sku details list.");
            z2 = false;
            str2 = strConcat;
            if (!z2) {
                ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/commerce/payment/PlayBillingController", "validatePlayBillingCommand", 931, "PlayBillingController.java")).w("%s", str2);
                zvp.a(zvn.b, zvm.l, "playPayment::PlayBillingController".concat(str2));
                w(6, str2);
                if (e()) {
                    abte abteVar6 = this.B;
                    if (aonvVar != null) {
                        aroqVar2 = aroq.a;
                    } else {
                        aroqVar2 = aroq.a;
                    }
                    nsh.e(abteVar6, aroqVar2, 11, 6, "INVALID_PLAY_CART_PAYLOAD", str2);
                }
                tuk.n(this.j, R.string.payment_wallet_processing_error_without_retry, 1);
                return;
            }
            this.d = false;
            this.f = aonvVar;
            aroqVar = aonvVar.k;
            if (aroqVar == null) {
                aroqVar = aroq.a;
            }
            this.g = aroqVar;
            this.v = true;
            enuVar = this.c;
            if (enuVar == null) {
            }
            s();
        }
    }
}
