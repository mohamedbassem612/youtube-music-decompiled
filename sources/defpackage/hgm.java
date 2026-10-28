package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hgm {
    public static final agkz a;
    private static final agrf b = agrf.h("com/google/android/apps/youtube/music/mediabrowser/MusicBrowserUtils");

    static {
        agkz agkzVarR = agkz.r("", "MEDIA_BUTTON_PLACEMENT_SWAP_LIKE_FOR_SHUFFLE", "MEDIA_BUTTON_PLACEMENT_SEEK_FOCUSED_SWAP_SKIP");
        agkzVarR.getClass();
        a = agkzVarR;
    }

    public static final String a(PackageManager packageManager, zot zotVar) {
        CharSequence applicationLabel;
        packageManager.getClass();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(zotVar.b, 0);
            if (applicationInfo != null && (applicationLabel = packageManager.getApplicationLabel(applicationInfo)) != null) {
                return applicationLabel.toString();
            }
        } catch (Exception e) {
            ((agrc) ((agrc) b.c()).j(e).k("com/google/android/apps/youtube/music/mediabrowser/MusicBrowserUtils", "getAppName", 197, "MusicBrowserUtils.kt")).w("Failed to get app name for package: '%s'", zotVar);
        }
        return zotVar.b;
    }

    public static final boolean b(String str) {
        str.getClass();
        return !awrc.c(str, "") && a.contains(str);
    }

    public static final boolean c(amzo amzoVar) {
        amzoVar.getClass();
        return amzoVar == amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_CURRENT_BROWSER_INFO || amzoVar == amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_CURRENT_CONTROLLER_INFO || amzoVar == amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_GET_CALLING_PACKAGE;
    }

    public static final boolean d(boolean z, boolean z2, String str) {
        str.getClass();
        return z2 || !z;
    }

    public static final boolean e(boolean z, boolean z2, String str) {
        str.getClass();
        return z2 || !z;
    }

    public static final void f(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("[");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaDescriptionCompat mediaDescriptionCompat = ((MediaBrowserCompat$MediaItem) it.next()).a;
            if (mediaDescriptionCompat == null) {
                sb.append("<null description>, ");
            } else {
                CharSequence charSequence = mediaDescriptionCompat.b;
                if (charSequence == null) {
                    sb.append("<null title>, ");
                } else {
                    sb.append("'" + ((Object) charSequence) + "', ");
                }
            }
        }
        String string = sb.toString();
        if (string.length() >= 3) {
            string.substring(0, string.length() - 2).getClass();
        }
    }

    public static final amiu g(int i, zot zotVar, amzo amzoVar, zne zneVar, znf znfVar, String str) {
        amzoVar.getClass();
        aihf aihfVarCreateBuilder = amjb.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        if (zotVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            amjb amjbVar = (amjb) aihfVarCreateBuilder.instance;
            amjbVar.b |= 1;
            amjbVar.c = zotVar.b;
        }
        if (str != null && str.length() != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            amjb amjbVar2 = (amjb) aihfVarCreateBuilder.instance;
            amjbVar2.b |= 8;
            amjbVar2.f = str;
        }
        if (zneVar != null) {
            int i2 = zneVar.i();
            aihfVarCreateBuilder.copyOnWrite();
            amjb amjbVar3 = (amjb) aihfVarCreateBuilder.instance;
            amjbVar3.e = i2 - 1;
            amjbVar3.b |= 4;
        }
        if (znfVar != null && !znfVar.d()) {
            int i3 = agxm.b;
            String string = agxl.a.c(znfVar.l, awtd.a).toString();
            aihfVarCreateBuilder.copyOnWrite();
            amjb amjbVar4 = (amjb) aihfVarCreateBuilder.instance;
            amjbVar4.b |= 16;
            amjbVar4.g = string;
            boolean z = zneVar != null && awrc.c(zneVar.a(), znfVar);
            aihfVarCreateBuilder.copyOnWrite();
            amjb amjbVar5 = (amjb) aihfVarCreateBuilder.instance;
            amjbVar5.b |= 32;
            amjbVar5.h = z;
        }
        if (amzoVar != amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_UNKNOWN) {
            aihfVarCreateBuilder.copyOnWrite();
            amjb amjbVar6 = (amjb) aihfVarCreateBuilder.instance;
            amjbVar6.d = amzoVar.l;
            amjbVar6.b |= 2;
        }
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        aihf aihfVarCreateBuilder2 = amiu.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        agvp.ae(i, aihfVarCreateBuilder2);
        aihfVarCreateBuilder2.copyOnWrite();
        amiu amiuVar = (amiu) aihfVarCreateBuilder2.instance;
        amiuVar.U = (amjb) aihnVarBuild;
        amiuVar.d |= 1048576;
        return agvp.ab(aihfVarCreateBuilder2);
    }
}
