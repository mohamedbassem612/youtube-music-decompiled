package defpackage;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dhg {
    final Bundle a;
    final String b;
    final List c;

    public dhg(Bundle bundle, String str, List list) {
        this.a = bundle;
        this.b = str;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            obj.getClass();
            arrayList.add(obj);
        }
        this.c = DesugarCollections.unmodifiableList(arrayList);
    }

    public static dhg n(Bundle bundle) {
        if (bundle != null) {
            return new dhg(bundle, null, Collections.EMPTY_LIST);
        }
        return null;
    }

    public final int a() {
        return this.a.getInt("connectionState", 0);
    }

    public final int b() {
        return this.a.getInt("deviceType");
    }

    public final int c() {
        return this.a.getInt("maxClientVersion", Alert.DURATION_SHOW_INDEFINITELY);
    }

    public final int d() {
        return this.a.getInt("minClientVersion", 1);
    }

    public final int e() {
        return this.a.getInt("playbackStream", -1);
    }

    public final int f() {
        return this.a.getInt("playbackType", 1);
    }

    public final int g() {
        return this.a.getInt("presentationDisplayId", -1);
    }

    public final int h() {
        return this.a.getInt("volume");
    }

    public final int i() {
        return this.a.getInt("volumeHandling", 0);
    }

    public final int j() {
        return this.a.getInt("volumeMax");
    }

    public final IntentSender k() {
        return (IntentSender) aie.i(this.a, "settingsIntent", IntentSender.class);
    }

    public final Uri l() {
        String string = this.a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Bundle m() {
        return this.a.getBundle("extras");
    }

    public final String o() {
        return this.a.getString("status");
    }

    public final String p() {
        return this.a.getString("id");
    }

    public final String q() {
        return this.a.getString("name");
    }

    public final List r() {
        ArrayList arrayListJ = aie.j(this.a, "controlFilters", IntentFilter.class);
        return arrayListJ != null ? new ArrayList(arrayListJ) : new ArrayList();
    }

    public final List s() {
        ArrayList<String> stringArrayList = this.a.getStringArrayList("groupMemberIds");
        return stringArrayList != null ? new ArrayList(stringArrayList) : new ArrayList();
    }

    public final Set t() {
        ArrayList<String> stringArrayList = this.a.getStringArrayList("allowedPackages");
        return stringArrayList != null ? new HashSet(stringArrayList) : new HashSet();
    }

    public final String toString() {
        return "MediaRouteDescriptor{ id=" + p() + ", groupMemberIds=" + s() + ", name=" + q() + ", descr  iption=" + o() + ", iconUri=" + l() + ", isEnabled=" + w() + ", isSystemRoute=" + x() + ", isDynamicGroupRoute=" + v() + ", connectionState=" + a() + ", controlFilters=" + Arrays.toString(r().toArray()) + ", playbackType=" + f() + ", playbackStream=" + e() + ", deviceType=" + b() + ", volume=" + h() + ", volumeMax=" + j() + ", volumeHandling=" + i() + ", presentationDisplayId=" + g() + ", extras=" + m() + ", isValid=" + y() + ", minClientVersion=" + d() + ", maxClientVersion=" + c() + ", isVisibilityPublic=" + z() + ", allowedPackages=" + Arrays.toString(t().toArray()) + ", requiredPermissions=" + this.c + ", routingControllerId=" + this.b + " }";
    }

    public final boolean u() {
        return this.a.getBoolean("canDisconnect", false);
    }

    public final boolean v() {
        return this.a.getBoolean("isDynamicGroupRoute", false);
    }

    public final boolean w() {
        return this.a.getBoolean("enabled", true);
    }

    public final boolean x() {
        return this.a.getBoolean("isSystemRoute", false);
    }

    public final boolean y() {
        return (TextUtils.isEmpty(p()) || TextUtils.isEmpty(q()) || r().contains(null)) ? false : true;
    }

    public final boolean z() {
        return this.a.getBoolean("isVisibilityPublic", true);
    }
}
