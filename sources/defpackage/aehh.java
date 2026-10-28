package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.net.URISyntaxException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aehh {
    public static final String a = "aehh";

    private aehh() {
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    public static aehm a(Uri uri, abte abteVar, arkf arkfVar, arjz arjzVar) {
        Intent uri2;
        aehm aehmVar;
        try {
            boolean z = arjzVar.d;
            if (uri == null) {
                aehmVar = new aehm(null, null, null, null);
            } else {
                String scheme = uri.getScheme();
                if (scheme != null) {
                    if (scheme.equals("intent")) {
                        uri2 = Intent.parseUri(uri.toString(), 1);
                    } else {
                        uri2 = scheme.equals("android-app") ? Intent.parseUri(uri.toString(), 2) : new Intent("android.intent.action.VIEW", uri);
                    }
                    Intent intent = new Intent(uri2);
                    intent.setSelector(null);
                    if (z) {
                        intent.setAction("android.intent.action.VIEW");
                        intent.replaceExtras((Bundle) null);
                    }
                    Intent intent2 = intent.addCategory("android.intent.category.BROWSABLE").setComponent(null).setPackage(null);
                    if (intent2 == null) {
                        scheme = "";
                    } else if (scheme.equals("intent") || scheme.equals("android-app")) {
                        Uri data = intent2.getData();
                        if (data == null) {
                            scheme = "";
                        } else if (data.getHost() != null) {
                            scheme = data.getHost();
                        } else {
                            Log.w("WebViewIntentBuilder", "Host not available from the data URI.");
                            scheme = "";
                        }
                    }
                    return new aehm(uri, uri2, intent2, scheme);
                }
                aehmVar = new aehm(uri, null, null, null);
            }
            return aehmVar;
        } catch (URISyntaxException e) {
            String str = " Could not open URL: " + String.valueOf(uri) + ", with exception: " + e.getMessage();
            zvp.b(zvn.a, zvm.z, "GenericWebView::" + a + str, e);
            c(ahno.Z(uri.getHost()), abteVar, 15, arkfVar);
            return null;
        }
    }

    public static void b(aehm aehmVar, Context context, abte abteVar, arkf arkfVar) {
        Intent intent = aehmVar.b;
        if (intent == null) {
            zvp.a(zvn.a, zvm.z, "GenericWebView::" + a + "Sanitized intent is null.");
            c(aehmVar.c, abteVar, 15, arkfVar);
            return;
        }
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                if (!(baseContext instanceof Activity)) {
                    intent.addFlags(268435456);
                    break;
                }
                break;
            } else if (baseContext instanceof Activity) {
                break;
            } else {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
        }
        try {
            afwl.m(context, intent);
            c(aehmVar.c, abteVar, 14, arkfVar);
        } catch (ActivityNotFoundException e) {
            String str = " Could not open URL: " + String.valueOf(aehmVar.a) + ", with exception: " + e.getMessage();
            zvp.a(zvn.a, zvm.z, "GenericWebView::" + a + str);
            c(aehmVar.c, abteVar, 15, arkfVar);
        }
    }

    public static void c(String str, abte abteVar, int i, arkf arkfVar) {
        if (abteVar != null) {
            aihf aihfVarCreateBuilder = arjy.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            arjy arjyVar = (arjy) aihfVarCreateBuilder.instance;
            arjyVar.b |= 8;
            arjyVar.f = true;
            aihfVarCreateBuilder.copyOnWrite();
            arjy arjyVar2 = (arjy) aihfVarCreateBuilder.instance;
            arjyVar2.d = arkfVar.z;
            arjyVar2.b |= 2;
            aihfVarCreateBuilder.copyOnWrite();
            arjy arjyVar3 = (arjy) aihfVarCreateBuilder.instance;
            arjyVar3.b |= 4;
            arjyVar3.e = false;
            String strZ = ahno.Z(str);
            aihfVarCreateBuilder.copyOnWrite();
            arjy arjyVar4 = (arjy) aihfVarCreateBuilder.instance;
            arjyVar4.b |= 1;
            arjyVar4.c = strZ;
            arjy arjyVar5 = (arjy) aihfVarCreateBuilder.build();
            xfh xfhVar = new xfh(i - 1, 32);
            aihf aihfVarCreateBuilder2 = akzk.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            akzk akzkVar = (akzk) aihfVarCreateBuilder2.instance;
            arjyVar5.getClass();
            akzkVar.k = arjyVar5;
            akzkVar.b |= 2097152;
            xfhVar.a = (akzk) aihfVarCreateBuilder2.build();
            abteVar.b(xfhVar, alai.FLOW_TYPE_WEB_VIEW);
        }
    }
}
