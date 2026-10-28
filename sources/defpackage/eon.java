package defpackage;

import android.content.ClipData;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.android.billingclient.api.ProxyBillingActivityV2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eon implements rb {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ eon(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    @Override // defpackage.rb
    public final void a(Object obj) {
        ?? H;
        int i = -1;
        uriArr = null;
        uriArr = null;
        Uri[] uriArr = null;
        switch (this.$cid) {
            case 0:
                ra raVar = (ra) obj;
                Intent intent = raVar.b;
                int iB = eov.b(intent, "ProxyBillingActivityV2");
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.b;
                if (resultReceiver != null) {
                    resultReceiver.send(iB, intent != null ? intent.getExtras() : null);
                }
                int i2 = raVar.a;
                if (i2 == -1) {
                    if (iB != 0) {
                    }
                    proxyBillingActivityV2.finish();
                } else {
                    i = i2;
                }
                eov.e("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(i), Integer.valueOf(iB)));
                proxyBillingActivityV2.finish();
                break;
            case 1:
                ra raVar2 = (ra) obj;
                Intent intent2 = raVar2.b;
                int iB2 = eov.b(intent2, "ProxyBillingActivityV2");
                ProxyBillingActivityV2 proxyBillingActivityV3 = (ProxyBillingActivityV2) this.a;
                ResultReceiver resultReceiver2 = proxyBillingActivityV3.a;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(iB2, intent2 != null ? intent2.getExtras() : null);
                }
                int i3 = raVar2.a;
                if (i3 == -1) {
                    if (iB2 != 0) {
                    }
                    proxyBillingActivityV3.finish();
                } else {
                    i = i3;
                }
                eov.e("ProxyBillingActivityV2", a.bQ(iB2, i, "Alternative billing only dialog finished with resultCode ", " and billing's responseCode: "));
                proxyBillingActivityV3.finish();
                break;
            case 2:
                ra raVar3 = (ra) obj;
                Intent intent3 = raVar3.b;
                Bundle extras = intent3 != null ? intent3.getExtras() : null;
                int i4 = raVar3.a;
                if (i4 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    Integer numValueOf = Integer.valueOf(i4);
                    eov.e("ProxyBillingActivityV2", String.format("External offer flow finished with resultCode: %s", numValueOf));
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("External offer flow finished with error resultCode: %s", numValueOf));
                }
                Object obj2 = this.a;
                int iB3 = eov.b(intent3, "ProxyBillingActivityV2");
                ProxyBillingActivityV2 proxyBillingActivityV4 = (ProxyBillingActivityV2) obj2;
                ResultReceiver resultReceiver3 = proxyBillingActivityV4.c;
                if (resultReceiver3 != null) {
                    resultReceiver3.send(iB3, extras);
                } else {
                    eov.e("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (iB3 != 0) {
                    eov.e("ProxyBillingActivityV2", String.format("External offer flow finished with billing responseCode: %s", Integer.valueOf(iB3)));
                }
                proxyBillingActivityV4.finish();
                break;
            case 3:
                ra raVar4 = (ra) obj;
                Intent intent4 = raVar4.b;
                Bundle extras2 = intent4 != null ? intent4.getExtras() : null;
                int i5 = raVar4.a;
                if (i5 != -1) {
                    if (extras2 == null) {
                        extras2 = new Bundle();
                    }
                    Integer numValueOf2 = Integer.valueOf(i5);
                    eov.e("ProxyBillingActivityV2", String.format("Launch external link flow finished with resultCode: %s", numValueOf2));
                    extras2.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("Launch external link flow finished with error resultCode: %s", numValueOf2));
                }
                Object obj3 = this.a;
                int iB4 = eov.b(intent4, "ProxyBillingActivityV2");
                ProxyBillingActivityV2 proxyBillingActivityV5 = (ProxyBillingActivityV2) obj3;
                ResultReceiver resultReceiver4 = proxyBillingActivityV5.d;
                if (resultReceiver4 != null) {
                    resultReceiver4.send(iB4, extras2);
                } else {
                    eov.e("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                }
                if (iB4 != 0) {
                    eov.e("ProxyBillingActivityV2", String.format("Launch external link flow finished with billing responseCode: %s", Integer.valueOf(iB4)));
                }
                proxyBillingActivityV5.finish();
                break;
            case 4:
                ra raVar5 = (ra) obj;
                Intent intent5 = raVar5.b;
                int iB5 = eov.b(intent5, "ProxyBillingActivityV2");
                ProxyBillingActivityV2 proxyBillingActivityV6 = (ProxyBillingActivityV2) this.a;
                ResultReceiver resultReceiver5 = proxyBillingActivityV6.e;
                if (resultReceiver5 != null) {
                    resultReceiver5.send(iB5, intent5 != null ? intent5.getExtras() : null);
                }
                int i6 = raVar5.a;
                if (i6 == -1) {
                    if (iB5 != 0) {
                    }
                    proxyBillingActivityV6.finish();
                } else {
                    i = i6;
                }
                eov.e("ProxyBillingActivityV2", a.bQ(iB5, i, "Billing program info dialog finished with resultCode ", " and billing's responseCode: "));
                proxyBillingActivityV6.finish();
                break;
            case 5:
                ra raVar6 = (ra) obj;
                Intent intent6 = raVar6.b;
                int iB6 = eov.b(intent6, "ProxyBillingActivityV2");
                ProxyBillingActivityV2 proxyBillingActivityV7 = (ProxyBillingActivityV2) this.a;
                ResultReceiver resultReceiver6 = proxyBillingActivityV7.f;
                if (resultReceiver6 != null) {
                    resultReceiver6.send(iB6, intent6 != null ? intent6.getExtras() : null);
                }
                int i7 = raVar6.a;
                if (i7 == -1) {
                    if (iB6 != 0) {
                    }
                    proxyBillingActivityV7.finish();
                } else {
                    i = i7;
                }
                eov.e("ProxyBillingActivityV2", String.format("Subscription management action finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(i), Integer.valueOf(iB6)));
                proxyBillingActivityV7.finish();
                break;
            case 6:
                Uri uri = (Uri) obj;
                if (uri != null && !uri.equals(Uri.EMPTY)) {
                    rnf rnfVar = (rnf) this.a;
                    rnfVar.m = uri;
                    rnfVar.c();
                    break;
                }
                break;
            case 7:
                Uri uri2 = (Uri) obj;
                Object obj4 = this.a;
                if (uri2 == null || uri2.equals(Uri.EMPTY)) {
                    ((vea) obj4).f();
                } else {
                    vea veaVar = (vea) obj4;
                    veaVar.h = uri2;
                    veaVar.i(3);
                }
                break;
            case 8:
                ra raVar7 = (ra) obj;
                vsh vshVar = (vsh) this.a;
                if (!vshVar.isAdded() || vshVar.isRemoving() || vshVar.getActivity() == null) {
                    vsi vsiVar = vshVar.c;
                    if (vsiVar != null) {
                        vsiVar.a();
                        vshVar.c = null;
                    }
                } else {
                    ValueCallback valueCallback = vshVar.a;
                    if (valueCallback != null) {
                        Intent intent7 = raVar7.b;
                        valueCallback.onReceiveValue((raVar7.a != -1 || intent7 == null) ? null : WebChromeClient.FileChooserParams.parseResult(-1, intent7));
                        vshVar.a = null;
                    }
                    vsi vsiVar2 = vshVar.c;
                    if (vsiVar2 != null) {
                        vsiVar2.a();
                        vshVar.c = null;
                    }
                }
                break;
            default:
                ra raVar8 = (ra) obj;
                raVar8.getClass();
                aehj aehjVar = (aehj) this.a;
                if (aehjVar.b != null) {
                    Intent intent8 = raVar8.b;
                    if (raVar8.a == -1 && intent8 != null) {
                        ClipData clipData = intent8.getClipData();
                        if (clipData == null || clipData.getItemCount() <= 0) {
                            H = atqq.H(intent8.getData());
                        } else {
                            int itemCount = clipData.getItemCount();
                            H = new ArrayList(itemCount);
                            for (int i8 = 0; i8 < itemCount; i8++) {
                                H.add(clipData.getItemAt(i8).getUri());
                            }
                        }
                        List listAi = atqq.ai(H);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : listAi) {
                            Uri uri3 = (Uri) obj5;
                            if (awrc.c(uri3.getScheme(), "content")) {
                                String authority = uri3.getAuthority();
                                String strT = authority != null ? awrc.t(authority, '@', authority) : null;
                                if (strT != null && strT.length() != 0) {
                                    qe qeVar = aehjVar.a;
                                    String packageName = qeVar.getPackageName();
                                    if (!awrc.c(strT, packageName) && !awrc.n(strT, String.valueOf(packageName).concat("."), false)) {
                                        ProviderInfo providerInfoResolveContentProvider = qeVar.getPackageManager().resolveContentProvider(strT, 0);
                                        if (!awrc.c(providerInfoResolveContentProvider != null ? providerInfoResolveContentProvider.packageName : null, packageName)) {
                                            arrayList.add(obj5);
                                        }
                                    }
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
                        }
                    }
                    aehjVar.a(uriArr);
                }
                break;
        }
    }
}
