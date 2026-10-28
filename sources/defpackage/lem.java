package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import j$.util.Objects;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lem extends lbw {
    final /* synthetic */ ler b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lem(ler lerVar, leb lebVar) {
        super(lebVar);
        this.b = lerVar;
    }

    @Override // defpackage.lbw
    public final void b() {
        ler lerVar = this.b;
        if (!lerVar.G().F(null, lcl.bn) || lerVar.t.p == null) {
            final ldr ldrVar = lerVar.t;
            ldrVar.r();
            ldr.A(ldrVar.j());
            String strV = ldrVar.e().v();
            if (!ldrVar.c.m()) {
                ldrVar.aT().k.a("ADID collection is disabled from Manifest. Skipping");
                return;
            }
            Pair pairC = ldrVar.g().c(strV);
            if (((Boolean) pairC.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairC.first)) {
                ldrVar.aT().k.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                return;
            }
            if (!ldrVar.j().a()) {
                ldrVar.aT().f.a("Network is not available for Deferred Deep Link request. Skipping");
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (ldrVar.k().R()) {
                lbu lbuVarS = ldrVar.i().s();
                Bundle bundle = lbuVarS != null ? lbuVarS.a : null;
                if (bundle == null) {
                    int i = ldrVar.t;
                    ldrVar.t = i + 1;
                    lcx lcxVar = ldrVar.aT().j;
                    StringBuilder sb2 = new StringBuilder("Failed to retrieve DMA consent from the service, ");
                    sb2.append(i >= 10 ? "Skipping." : "Retrying.");
                    sb2.append(" retryCount");
                    lcxVar.b(sb2.toString(), Integer.valueOf(ldrVar.t));
                    if (i < 10) {
                        lerVar.d.c(2000L);
                        return;
                    }
                    return;
                }
                lgh lghVarF = lgh.f(bundle, 100);
                sb.append("&gcs=");
                sb.append(lghVarF.k());
                lgd lgdVarA = lgd.a(bundle, 100);
                sb.append("&dma=");
                sb.append(!Objects.equals(lgdVarA.d, Boolean.FALSE) ? 1 : 0);
                String str = lgdVarA.e;
                if (!TextUtils.isEmpty(str)) {
                    sb.append("&dma_cps=");
                    sb.append(str);
                }
                int i2 = !Objects.equals(lgd.d(bundle), Boolean.TRUE) ? 1 : 0;
                sb.append("&npa=");
                sb.append(i2);
                ldrVar.aT().k.b("Consent query parameters to Bow", sb);
            }
            lga lgaVarL = ldrVar.l();
            ldrVar.e();
            URL urlAw = lgaVarL.aw(strV, (String) pairC.first, ldrVar.g().o.a() - 1, sb.toString());
            if (urlAw != null) {
                final int i3 = 0;
                ldrVar.j().c(strV, urlAw, new let() { // from class: ldp
                    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
                    @Override // defpackage.let
                    public final void a(int i4, Throwable th, byte[] bArr) {
                        int i5;
                        ldz ldzVar;
                        int i6 = i4;
                        int i7 = i3;
                        Object obj = ldrVar;
                        if (i7 == 0) {
                            if (i6 != 200 && i6 != 204) {
                                i5 = 304;
                                if (i6 != 304) {
                                    i5 = i6;
                                }
                                ((ldr) obj).aT().f.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i5), th);
                                return;
                            }
                            i5 = i6;
                            if (th == null) {
                                ldr ldrVar2 = (ldr) obj;
                                ldrVar2.g().n.a(true);
                                if (bArr == null || bArr.length == 0) {
                                    ldrVar2.aT().j.a("Deferred Deep Link response empty.");
                                    return;
                                }
                                try {
                                    JSONObject jSONObject = new JSONObject(new String(bArr));
                                    String strOptString = jSONObject.optString("deeplink", "");
                                    if (TextUtils.isEmpty(strOptString)) {
                                        ((ldr) obj).aT().j.a("Deferred Deep Link is empty.");
                                        return;
                                    }
                                    String strOptString2 = jSONObject.optString("gclid", "");
                                    String strOptString3 = jSONObject.optString("gbraid", "");
                                    String strOptString4 = jSONObject.optString("gad_source", "");
                                    try {
                                        double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                                        Bundle bundle2 = new Bundle();
                                        if (!((ldr) obj).l().ap(strOptString)) {
                                            ((ldr) obj).aT().f.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                                            aurt.c();
                                            if (((ldr) obj).c.F(null, lcl.aF) && ((ldr) obj).l().aj(((ldr) obj).e().v())) {
                                                ((ldr) obj).l().E(bundle2, Uri.parse(strOptString), false);
                                                bundle2.putString("_cis", "ddp");
                                                ((ldr) obj).i.N("auto", "_cmp", bundle2);
                                                return;
                                            }
                                            return;
                                        }
                                        if (!TextUtils.isEmpty(strOptString3)) {
                                            bundle2.putString("gbraid", strOptString3);
                                        }
                                        if (!TextUtils.isEmpty(strOptString4)) {
                                            bundle2.putString("gad_source", strOptString4);
                                        }
                                        bundle2.putString("gclid", strOptString2);
                                        bundle2.putString("_cis", "ddp");
                                        aurt.c();
                                        if (((ldr) obj).c.F(null, lcl.aF) && ((ldr) obj).l().aj(((ldr) obj).e().v())) {
                                            ((ldr) obj).l().E(bundle2, Uri.parse(strOptString), true);
                                        }
                                        ((ldr) obj).i.N("auto", "_cmp", bundle2);
                                        ((ldr) obj).l().P(strOptString, dOptDouble);
                                        return;
                                    } catch (JSONException e) {
                                        e = e;
                                        ldrVar2.aT().c.b("Failed to parse the Deferred Deep Link response. exception", e);
                                        return;
                                    }
                                } catch (JSONException e2) {
                                    e = e2;
                                }
                            }
                            ((ldr) obj).aT().f.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i5), th);
                            return;
                        }
                        if (i6 == 200 || i6 == 204) {
                            if (th == null) {
                                ldzVar = (ldz) obj;
                                ldzVar.J().n.a(true);
                                if (bArr != null || bArr.length == 0) {
                                    ldzVar.aT().j.a("Deferred Deep Link response empty.");
                                    return;
                                }
                                try {
                                    JSONObject jSONObject2 = new JSONObject(new String(bArr));
                                    String strOptString5 = jSONObject2.optString("deeplink", "");
                                    if (TextUtils.isEmpty(strOptString5)) {
                                        ((ldz) obj).aT().j.a("Deferred Deep Link is empty.");
                                        return;
                                    }
                                    String strOptString6 = jSONObject2.optString("gclid", "");
                                    String strOptString7 = jSONObject2.optString("gbraid", "");
                                    String strOptString8 = jSONObject2.optString("gad_source", "");
                                    try {
                                        double dOptDouble2 = jSONObject2.optDouble("timestamp", 0.0d);
                                        Bundle bundle3 = new Bundle();
                                        if (!((ldz) obj).L().ap(strOptString5)) {
                                            ((ldz) obj).aT().f.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString6, strOptString7, strOptString5);
                                            aurt.c();
                                            if (((ldz) obj).G().F(null, lcl.aF) && ((ldz) obj).L().aj(((lbb) obj).h().v())) {
                                                ((ldz) obj).L().E(bundle3, Uri.parse(strOptString5), false);
                                                bundle3.putString("_cis", "ddp");
                                                ((lbb) obj).i().N("auto", "_cmp", bundle3);
                                                return;
                                            }
                                            return;
                                        }
                                        if (!TextUtils.isEmpty(strOptString7)) {
                                            bundle3.putString("gbraid", strOptString7);
                                        }
                                        if (!TextUtils.isEmpty(strOptString8)) {
                                            bundle3.putString("gad_source", strOptString8);
                                        }
                                        bundle3.putString("gclid", strOptString6);
                                        bundle3.putString("_cis", "ddp");
                                        aurt.c();
                                        if (((ldz) obj).G().F(null, lcl.aF) && ((ldz) obj).L().aj(((lbb) obj).h().v())) {
                                            ((ldz) obj).L().E(bundle3, Uri.parse(strOptString5), true);
                                        }
                                        ((lbb) obj).i().N("auto", "_cmp", bundle3);
                                        ((ldz) obj).L().P(strOptString5, dOptDouble2);
                                        return;
                                    } catch (JSONException e3) {
                                        e = e3;
                                        ldzVar.aT().c.b("Failed to parse the Deferred Deep Link response. exception", e);
                                        return;
                                    }
                                } catch (JSONException e4) {
                                    e = e4;
                                }
                            }
                        } else if (i6 == 304) {
                            i6 = 304;
                            if (th == null) {
                                ldzVar = (ldz) obj;
                                ldzVar.J().n.a(true);
                                if (bArr != null) {
                                }
                                ldzVar.aT().j.a("Deferred Deep Link response empty.");
                                return;
                            }
                        }
                        ((ldz) obj).aT().f.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i6), th);
                    }
                });
                return;
            }
            return;
        }
        ldr ldrVar2 = lerVar.t;
        final int i4 = 1;
        kro.l(ldrVar2.p);
        final lbv lbvVar = ldrVar2.p;
        kro.l(lbvVar);
        lbvVar.o();
        String strV2 = lbvVar.h().v();
        if (!lbvVar.G().m()) {
            lbvVar.aT().k.a("ADID collection is disabled from Manifest. Skipping");
            return;
        }
        Pair pairC2 = lbvVar.J().c(strV2);
        if (((Boolean) pairC2.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairC2.first)) {
            lbvVar.aT().k.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        if (!lbvVar.K().a()) {
            lbvVar.aT().f.a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        if (lbvVar.j().R()) {
            lbu lbuVarS2 = lbvVar.i().s();
            Bundle bundle2 = lbuVarS2 != null ? lbuVarS2.a : null;
            if (bundle2 == null) {
                int i5 = lbvVar.a;
                lbvVar.a = i5 + 1;
                lcx lcxVar2 = lbvVar.aT().j;
                StringBuilder sb4 = new StringBuilder("Failed to retrieve DMA consent from the service, ");
                sb4.append(i5 >= 10 ? "Skipping." : "Retrying.");
                sb4.append(" retryCount");
                lcxVar2.b(sb4.toString(), Integer.valueOf(lbvVar.a));
                if (i5 < 10) {
                    lerVar.d.c(2000L);
                    return;
                }
                return;
            }
            lgh lghVarF2 = lgh.f(bundle2, 100);
            sb3.append("&gcs=");
            sb3.append(lghVarF2.k());
            lgd lgdVarA2 = lgd.a(bundle2, 100);
            sb3.append("&dma=");
            sb3.append(!Objects.equals(lgdVarA2.d, Boolean.FALSE) ? 1 : 0);
            String str2 = lgdVarA2.e;
            if (!TextUtils.isEmpty(str2)) {
                sb3.append("&dma_cps=");
                sb3.append(str2);
            }
            int i6 = !Objects.equals(lgd.d(bundle2), Boolean.TRUE) ? 1 : 0;
            sb3.append("&npa=");
            sb3.append(i6);
            lbvVar.aT().k.b("Consent query parameters to Bow", sb3);
        }
        lga lgaVarL2 = lbvVar.L();
        lbvVar.h();
        URL urlAw2 = lgaVarL2.aw(strV2, (String) pairC2.first, lbvVar.J().o.a() - 1, sb3.toString());
        if (urlAw2 != null) {
            lbvVar.K().c(strV2, urlAw2, new let() { // from class: ldp
                /* JADX WARN: Code duplicated, block: B:12:0x0042  */
                @Override // defpackage.let
                public final void a(int i7, Throwable th, byte[] bArr) {
                    int i8;
                    ldz ldzVar;
                    int i9 = i7;
                    int i10 = i4;
                    Object obj = lbvVar;
                    if (i10 == 0) {
                        if (i9 != 200 && i9 != 204) {
                            i8 = 304;
                            if (i9 != 304) {
                                i8 = i9;
                            }
                            ((ldr) obj).aT().f.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i8), th);
                            return;
                        }
                        i8 = i9;
                        if (th == null) {
                            ldr ldrVar3 = (ldr) obj;
                            ldrVar3.g().n.a(true);
                            if (bArr == null || bArr.length == 0) {
                                ldrVar3.aT().j.a("Deferred Deep Link response empty.");
                                return;
                            }
                            try {
                                JSONObject jSONObject = new JSONObject(new String(bArr));
                                String strOptString = jSONObject.optString("deeplink", "");
                                if (TextUtils.isEmpty(strOptString)) {
                                    ((ldr) obj).aT().j.a("Deferred Deep Link is empty.");
                                    return;
                                }
                                String strOptString2 = jSONObject.optString("gclid", "");
                                String strOptString3 = jSONObject.optString("gbraid", "");
                                String strOptString4 = jSONObject.optString("gad_source", "");
                                try {
                                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                                    Bundle bundle3 = new Bundle();
                                    if (!((ldr) obj).l().ap(strOptString)) {
                                        ((ldr) obj).aT().f.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                                        aurt.c();
                                        if (((ldr) obj).c.F(null, lcl.aF) && ((ldr) obj).l().aj(((ldr) obj).e().v())) {
                                            ((ldr) obj).l().E(bundle3, Uri.parse(strOptString), false);
                                            bundle3.putString("_cis", "ddp");
                                            ((ldr) obj).i.N("auto", "_cmp", bundle3);
                                            return;
                                        }
                                        return;
                                    }
                                    if (!TextUtils.isEmpty(strOptString3)) {
                                        bundle3.putString("gbraid", strOptString3);
                                    }
                                    if (!TextUtils.isEmpty(strOptString4)) {
                                        bundle3.putString("gad_source", strOptString4);
                                    }
                                    bundle3.putString("gclid", strOptString2);
                                    bundle3.putString("_cis", "ddp");
                                    aurt.c();
                                    if (((ldr) obj).c.F(null, lcl.aF) && ((ldr) obj).l().aj(((ldr) obj).e().v())) {
                                        ((ldr) obj).l().E(bundle3, Uri.parse(strOptString), true);
                                    }
                                    ((ldr) obj).i.N("auto", "_cmp", bundle3);
                                    ((ldr) obj).l().P(strOptString, dOptDouble);
                                    return;
                                } catch (JSONException e) {
                                    e = e;
                                    ldrVar3.aT().c.b("Failed to parse the Deferred Deep Link response. exception", e);
                                    return;
                                }
                            } catch (JSONException e2) {
                                e = e2;
                            }
                        }
                        ((ldr) obj).aT().f.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i8), th);
                        return;
                    }
                    if (i9 == 200 || i9 == 204) {
                        if (th == null) {
                            ldzVar = (ldz) obj;
                            ldzVar.J().n.a(true);
                            if (bArr != null || bArr.length == 0) {
                                ldzVar.aT().j.a("Deferred Deep Link response empty.");
                                return;
                            }
                            try {
                                JSONObject jSONObject2 = new JSONObject(new String(bArr));
                                String strOptString5 = jSONObject2.optString("deeplink", "");
                                if (TextUtils.isEmpty(strOptString5)) {
                                    ((ldz) obj).aT().j.a("Deferred Deep Link is empty.");
                                    return;
                                }
                                String strOptString6 = jSONObject2.optString("gclid", "");
                                String strOptString7 = jSONObject2.optString("gbraid", "");
                                String strOptString8 = jSONObject2.optString("gad_source", "");
                                try {
                                    double dOptDouble2 = jSONObject2.optDouble("timestamp", 0.0d);
                                    Bundle bundle4 = new Bundle();
                                    if (!((ldz) obj).L().ap(strOptString5)) {
                                        ((ldz) obj).aT().f.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString6, strOptString7, strOptString5);
                                        aurt.c();
                                        if (((ldz) obj).G().F(null, lcl.aF) && ((ldz) obj).L().aj(((lbb) obj).h().v())) {
                                            ((ldz) obj).L().E(bundle4, Uri.parse(strOptString5), false);
                                            bundle4.putString("_cis", "ddp");
                                            ((lbb) obj).i().N("auto", "_cmp", bundle4);
                                            return;
                                        }
                                        return;
                                    }
                                    if (!TextUtils.isEmpty(strOptString7)) {
                                        bundle4.putString("gbraid", strOptString7);
                                    }
                                    if (!TextUtils.isEmpty(strOptString8)) {
                                        bundle4.putString("gad_source", strOptString8);
                                    }
                                    bundle4.putString("gclid", strOptString6);
                                    bundle4.putString("_cis", "ddp");
                                    aurt.c();
                                    if (((ldz) obj).G().F(null, lcl.aF) && ((ldz) obj).L().aj(((lbb) obj).h().v())) {
                                        ((ldz) obj).L().E(bundle4, Uri.parse(strOptString5), true);
                                    }
                                    ((lbb) obj).i().N("auto", "_cmp", bundle4);
                                    ((ldz) obj).L().P(strOptString5, dOptDouble2);
                                    return;
                                } catch (JSONException e3) {
                                    e = e3;
                                    ldzVar.aT().c.b("Failed to parse the Deferred Deep Link response. exception", e);
                                    return;
                                }
                            } catch (JSONException e4) {
                                e = e4;
                            }
                        }
                    } else if (i9 == 304) {
                        i9 = 304;
                        if (th == null) {
                            ldzVar = (ldz) obj;
                            ldzVar.J().n.a(true);
                            if (bArr != null) {
                            }
                            ldzVar.aT().j.a("Deferred Deep Link response empty.");
                            return;
                        }
                    }
                    ((ldz) obj).aT().f.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i9), th);
                }
            });
        }
    }
}
