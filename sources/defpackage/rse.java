package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rse implements vxc, sxt {
    private static final Pattern a = Pattern.compile("(?i)android-app://([^/]+)/?(?:([^/]+)/([^/?#]*)(.+)?)?");
    private static final Pattern b = Pattern.compile("(?i)https://play.google.com/apps/launch\\?id=([^/]+)/?(?:([^/]+)/([^/?#]*)(.+)?)?");
    private final vxe c;
    private final PackageManager d;
    private final soc e;
    private final Context f;
    private final mgk g;
    private final abuz h;

    public rse(abuz abuzVar, soc socVar, mgk mgkVar, vxe vxeVar, Context context) {
        abuzVar.getClass();
        this.h = abuzVar;
        socVar.getClass();
        this.e = socVar;
        mgkVar.getClass();
        this.g = mgkVar;
        vxeVar.getClass();
        this.c = vxeVar;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        this.d = packageManager;
        this.f = context;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x018e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0198  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ac  */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        Intent launchIntentForPackage;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajel.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajel.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            ajek ajekVar = (ajek) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            this.h.o(tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), ajbf.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_DEEP_LINK);
            HashMap map2 = new HashMap();
            Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
            if (objS != null) {
                map2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", objS);
            }
            soc socVar = this.e;
            ajtq ajtqVar = ajtq.TERMINATION_EVENT_TYPE_RETURNED_TO_APP;
            aiie aiieVar = ajekVar.g;
            if (aiieVar != null && !aiieVar.isEmpty()) {
                Map map3 = socVar.a;
                List arrayList = (List) map3.get(ajtqVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map3.put(ajtqVar, arrayList);
                }
                HashMap map4 = new HashMap(map2);
                xgn xgnVar = (xgn) tym.S(map2, "com.google.android.libraries.youtube.logging.interaction_logger");
                map4.put("TerminationEventPingController.csn", xgnVar != null ? xgnVar.i() : socVar.c.hB().i());
                arrayList.add(new acrx(aiieVar, map4));
            }
            ApplicationInfo applicationInfo = null;
            Uri uri = (ajekVar.b & 2) != 0 ? Uri.parse(ajekVar.d) : null;
            if (!ajekVar.c.isEmpty() && uri != null && b.matcher(uri.toString()).matches()) {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.setPackage("com.android.vending");
                intent.addFlags(268435456);
                intent.addFlags(262144);
                try {
                    this.f.startActivity(intent);
                    return;
                } catch (ActivityNotFoundException unused) {
                    vxe vxeVar = this.c;
                    vxeVar.b(ajekVar.f);
                    if ((ajekVar.b & 8) != 0) {
                        ajwo ajwoVar2 = ajekVar.e;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                        vxeVar.a(ajwoVar2);
                        return;
                    }
                    return;
                }
            }
            boolean z = false;
            if (!ajekVar.c.isEmpty()) {
                try {
                    applicationInfo = this.d.getApplicationInfo(ajekVar.c, 0);
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if (applicationInfo != null && applicationInfo.enabled) {
                    z = true;
                }
            }
            if (Build.VERSION.SDK_INT >= 30) {
                if (ajekVar.c.isEmpty() || uri == null) {
                    if ((ajekVar.b & 8) != 0) {
                        vxe vxeVar2 = this.c;
                        ajwo ajwoVar3 = ajekVar.e;
                        if (ajwoVar3 == null) {
                            ajwoVar3 = ajwo.a;
                        }
                        vxeVar2.c(ajwoVar3, map);
                        return;
                    }
                    return;
                }
                Intent intent2 = new Intent("android.intent.action.VIEW", uri);
                intent2.setPackage(ajekVar.c);
                intent2.addFlags(268435456);
                intent2.addFlags(262144);
                try {
                    this.f.startActivity(intent2);
                    return;
                } catch (ActivityNotFoundException unused3) {
                    vxe vxeVar3 = this.c;
                    vxeVar3.d(ajekVar.f, map);
                    if ((ajekVar.b & 8) != 0) {
                        ajwo ajwoVar4 = ajekVar.e;
                        if (ajwoVar4 == null) {
                            ajwoVar4 = ajwo.a;
                        }
                        vxeVar3.c(ajwoVar4, map);
                        return;
                    }
                    return;
                }
            }
            if (z) {
                if (uri == null || a.matcher(uri.toString()).matches()) {
                    launchIntentForPackage = this.d.getLaunchIntentForPackage(ajekVar.c);
                    if (launchIntentForPackage != null) {
                        launchIntentForPackage.addFlags(268435456);
                        launchIntentForPackage.addFlags(262144);
                        try {
                            this.f.startActivity(launchIntentForPackage);
                            if (z) {
                                return;
                            }
                        } catch (ActivityNotFoundException unused4) {
                            this.c.d(ajekVar.f, map);
                        }
                    } else {
                        this.c.d(ajekVar.f, map);
                    }
                } else {
                    Intent intent3 = new Intent("android.intent.action.VIEW", uri);
                    intent3.setPackage(ajekVar.c);
                    intent3.addFlags(268435456);
                    intent3.addFlags(262144);
                    if (this.d.resolveActivity(intent3, 65536) != null) {
                        this.g.b(intent3, 908, this);
                    } else {
                        launchIntentForPackage = this.d.getLaunchIntentForPackage(ajekVar.c);
                        if (launchIntentForPackage != null) {
                            launchIntentForPackage.addFlags(268435456);
                            launchIntentForPackage.addFlags(262144);
                            this.f.startActivity(launchIntentForPackage);
                        } else {
                            this.c.d(ajekVar.f, map);
                        }
                    }
                    if (z) {
                        return;
                    }
                }
            } else if (z) {
                return;
            }
            if ((ajekVar.b & 8) != 0) {
                vxe vxeVar4 = this.c;
                ajwo ajwoVar5 = ajekVar.e;
                if (ajwoVar5 == null) {
                    ajwoVar5 = ajwo.a;
                }
                vxeVar4.c(ajwoVar5, map);
            }
        }
    }

    @Override // defpackage.sxt
    public final boolean d(int i, int i2, Intent intent) {
        return i == 908;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
