package defpackage;

import android.content.Intent;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vsj extends WebChromeClient {
    public final /* synthetic */ vsk a;

    public vsj(vsk vskVar) {
        this.a = vskVar;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        List<String> listAsList = Arrays.asList(permissionRequest.getResources());
        vsk vskVar = this.a;
        if (!((vxz) vskVar.c.io()).l(2, 45754041L, false)) {
            if (listAsList.contains("android.webkit.resource.VIDEO_CAPTURE")) {
                cf cfVar = vskVar.b;
                dd supportFragmentManager = cfVar.getSupportFragmentManager();
                if (!vskVar.a(supportFragmentManager)) {
                    permissionRequest.deny();
                    return;
                }
                if (supportFragmentManager.g("com.google.android.libraries.youtube.engagementpanel.content.strategy.CameraPermissionRequestFragment") != null) {
                    permissionRequest.deny();
                    return;
                }
                vsd vsdVar = new vsd();
                av avVar = new av(cfVar.getSupportFragmentManager());
                avVar.g(0, vsdVar, "com.google.android.libraries.youtube.engagementpanel.content.strategy.CameraPermissionRequestFragment", 1);
                avVar.e();
                yhi yhiVar = new yhi(vskVar, vsdVar, (byte[]) null);
                if (avg.c(vsdVar.a, "android.permission.CAMERA") == 0) {
                    permissionRequest.grant(permissionRequest.getResources());
                    yhiVar.a();
                    return;
                } else {
                    vsdVar.b = permissionRequest;
                    vsdVar.c = yhiVar;
                    vsdVar.requestPermissions(new String[]{"android.permission.CAMERA"}, 0);
                    return;
                }
            }
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str : listAsList) {
            agkj agkjVar = vsk.a;
            if (agkjVar.containsKey(str)) {
                arrayList.add((String) agkjVar.get(str));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        cf cfVar2 = vskVar.b;
        dd supportFragmentManager2 = cfVar2.getSupportFragmentManager();
        if (!vskVar.a(supportFragmentManager2)) {
            permissionRequest.deny();
            return;
        }
        String str2 = vso.a;
        if (supportFragmentManager2.g(str2) != null) {
            permissionRequest.deny();
            return;
        }
        vso vsoVar = new vso();
        av avVar2 = new av(cfVar2.getSupportFragmentManager());
        avVar2.g(0, vsoVar, str2, 1);
        avVar2.e();
        ahhp ahhpVar = new ahhp(vskVar, vsoVar);
        permissionRequest.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (String str3 : arrayList) {
            if (avg.c(vsoVar.b, str3) != 0) {
                arrayList2.add(str3);
            }
        }
        if (arrayList2.isEmpty()) {
            permissionRequest.grant(permissionRequest.getResources());
            ahhpVar.e();
        } else {
            vsoVar.c = permissionRequest;
            vsoVar.d = ahhpVar;
            vsoVar.requestPermissions((String[]) arrayList2.toArray(new String[0]), 251);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent intentCreateIntent = fileChooserParams.createIntent();
        dd supportFragmentManager = this.a.b.getSupportFragmentManager();
        vsh vshVar = (vsh) supportFragmentManager.g("com.google.android.libraries.youtube.engagementpanel.content.strategy.IdentityVerificationFileChooserFragment");
        if (vshVar == null) {
            vshVar = new vsh();
            av avVar = new av(supportFragmentManager);
            avVar.g(0, vshVar, "com.google.android.libraries.youtube.engagementpanel.content.strategy.IdentityVerificationFileChooserFragment", 1);
            avVar.e();
        }
        vsi vsiVar = new vsi(this, webView, vshVar);
        vshVar.a = valueCallback;
        vshVar.c = vsiVar;
        rc rcVar = vshVar.b;
        if (rcVar != null) {
            rcVar.b(intentCreateIntent, null);
        }
        return true;
    }
}
