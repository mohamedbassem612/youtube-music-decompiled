package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hfy {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/mediabrowser/ConnectedClientController");
    public final aunn b;
    public final ahbw c;
    public final awku f;
    public final awku g;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    private final ConcurrentHashMap h = new ConcurrentHashMap();

    public hfy(aunn aunnVar, ahbw ahbwVar) {
        this.b = aunnVar;
        this.c = ahbwVar;
        zmz zmzVar = zmz.a;
        int i = awku.k;
        zmzVar.getClass();
        this.f = new awku(zmzVar);
        zmzVar.getClass();
        this.g = new awku(zmzVar);
    }

    public final zne a() {
        zne zneVar = (zne) this.g.aD();
        return zneVar == null ? zmz.a : zneVar;
    }

    final zne b() {
        zne zneVar = (zne) this.f.aD();
        return zneVar == null ? zmz.a : zneVar;
    }

    public final agkz c() {
        return (agkz) Collection.EL.stream(this.d.keySet()).filter(new gnh(this, 5)).collect(aghu.b);
    }

    public final String d(Context context, String str) {
        if (TextUtils.isEmpty(str) || zol.a.a(str)) {
            return "version_not_found";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (TextUtils.isEmpty(packageInfo.versionName)) {
                throw new PackageManager.NameNotFoundException();
            }
            this.h.put(str, packageInfo.versionName);
            ConcurrentHashMap concurrentHashMap = this.h;
            return concurrentHashMap.containsKey(str) ? (String) concurrentHashMap.get(str) : "version_not_found";
        } catch (PackageManager.NameNotFoundException unused) {
            this.h.put(str, "version_not_found");
        }
    }
}
