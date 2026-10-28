package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaRoute2Info;
import android.media.RoutingSessionInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class dht extends dhz {
    dhe a;
    final dhj b;

    public dht(dic dicVar) {
        super(dicVar);
        this.b = new dhw(this, 1);
    }

    @Override // defpackage.dhz
    public final IBinder a(Intent intent) {
        dic dicVar = this.d;
        dicVar.d();
        if (this.a == null) {
            this.a = new dhe(this);
            if (dicVar.getBaseContext() != null) {
                this.a.attachBaseContext(dicVar);
            }
        }
        IBinder iBinderA = super.a(intent);
        return iBinderA == null ? this.a.onBind(intent) : iBinderA;
    }

    @Override // defpackage.dhz
    public final dhx b(Messenger messenger, int i, String str) {
        return new dhs(this, messenger, i, str);
    }

    @Override // defpackage.dhz
    public final void c(Context context) {
        dhe dheVar = this.a;
        if (dheVar != null) {
            dheVar.attachBaseContext(context);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0260  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c6  */
    @Override // defpackage.dhz
    public final void d(dhq dhqVar) {
        ArrayList arrayList;
        MediaRoute2Info mediaRoute2InfoBuild;
        Bundle bundle;
        int i;
        super.d(dhqVar);
        dhe dheVar = this.a;
        dheVar.d = dhqVar;
        List<dhg> list = dhqVar == null ? Collections.EMPTY_LIST : dhqVar.b;
        afv afvVar = new afv();
        for (dhg dhgVar : list) {
            if (dhgVar != null) {
                dhg dhgVar2 = (dhg) afvVar.get(dhgVar.p());
                if (dhgVar2 != null && Math.max(dhgVar.d(), dhgVar2.d()) <= Math.min(dhgVar.c(), dhgVar2.c())) {
                    Log.w("AxMR2ProvdrSrvcAdapter", String.format(Locale.ROOT, "Found two route descriptors with matching id: '%s' and overlapping client versions: [%d, %d], [%d, %d]", dhgVar2.p(), Integer.valueOf(dhgVar2.d()), Integer.valueOf(dhgVar2.c()), Integer.valueOf(dhgVar.d()), Integer.valueOf(dhgVar.c())));
                }
                if (dhgVar2 == null || dhgVar.c() >= dhgVar2.c()) {
                    afvVar.put(dhgVar.p(), dhgVar);
                }
            }
        }
        Set setKeySet = afvVar.keySet();
        synchronized (dheVar.a) {
            arrayList = new ArrayList(dheVar.c.values());
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            dhd dhdVar = (dhd) arrayList.get(i2);
            RoutingSessionInfo routingSessionInfo = dhdVar.f;
            if ((dhdVar.c & 4) == 0) {
                String str = ((dhb) dhdVar.b).a;
                if (afvVar.containsKey(str)) {
                    dhdVar.c((dhg) afvVar.get(str), null);
                } else {
                    Log.w("AxMR2ProvdrSrvcAdapter", String.format(Locale.ROOT, "Session with id: '%s' has invalid route id: '%s'.", routingSessionInfo != null ? routingSessionInfo.getId() : "null", str));
                }
            } else if (routingSessionInfo != null) {
                dhe.d(setKeySet, routingSessionInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (dhg dhgVar3 : afvVar.values()) {
            if (dhgVar3 == null || TextUtils.isEmpty(dhgVar3.p()) || TextUtils.isEmpty(dhgVar3.q())) {
                mediaRoute2InfoBuild = null;
            } else {
                MediaRoute2Info.Builder volumeMax = new MediaRoute2Info.Builder(dhgVar3.p(), dhgVar3.q()).setDescription(dhgVar3.o()).setConnectionState(dhgVar3.a()).setVolumeHandling(dhgVar3.i()).setVolume(dhgVar3.h()).setVolumeMax(dhgVar3.j());
                List<IntentFilter> listR = dhgVar3.r();
                HashSet hashSet = new HashSet();
                for (IntentFilter intentFilter : listR) {
                    int iCountCategories = intentFilter.countCategories();
                    for (int i3 = 0; i3 < iCountCategories; i3++) {
                        hashSet.add(azt.i(intentFilter.getCategory(i3)));
                    }
                }
                MediaRoute2Info.Builder iconUri = volumeMax.addFeatures(hashSet).setIconUri(dhgVar3.l());
                if (Build.VERSION.SDK_INT >= 34) {
                    ArrayList<String> stringArrayList = dhgVar3.a.getStringArrayList("deduplicationIds");
                    iconUri.setDeduplicationIds(stringArrayList != null ? DesugarCollections.unmodifiableSet(new HashSet(stringArrayList)) : Collections.EMPTY_SET);
                    if (dhgVar3.z()) {
                        iconUri.setVisibilityPublic();
                    } else {
                        iconUri.setVisibilityRestricted(dhgVar3.t());
                    }
                    int iB = dhgVar3.b();
                    if (iB != 1000) {
                        switch (iB) {
                            case 1:
                                i = 1001;
                                break;
                            case 2:
                                i = 1002;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                i = 1003;
                                break;
                            case 5:
                                i = 1004;
                                break;
                            case 6:
                                i = 1005;
                                break;
                            case 7:
                                i = 1006;
                                break;
                            case 8:
                                i = 1007;
                                break;
                            case 9:
                                i = 1008;
                                break;
                            case 10:
                                i = 1009;
                                break;
                            case 11:
                                i = 1010;
                                break;
                            case 12:
                                i = 2;
                                break;
                            case 13:
                                i = 3;
                                break;
                            case 14:
                                i = 4;
                                break;
                            default:
                                switch (iB) {
                                    case 16:
                                        i = 9;
                                        break;
                                    case 17:
                                        i = 11;
                                        break;
                                    case 18:
                                        i = 12;
                                        break;
                                    case 19:
                                        i = 13;
                                        break;
                                    case 20:
                                        i = 22;
                                        break;
                                    case 21:
                                        i = 23;
                                        break;
                                    case 22:
                                        i = 26;
                                        break;
                                    case 23:
                                        i = 10;
                                        break;
                                    case 24:
                                        i = 29;
                                        break;
                                    default:
                                        i = 0;
                                        break;
                                }
                                break;
                        }
                    } else {
                        i = 2000;
                    }
                    iconUri.setType(i);
                }
                if (Build.VERSION.SDK_INT >= 36 && a.at() >= 3600001) {
                    iconUri.setRequiredPermissions(dhgVar3.c);
                }
                int iB2 = dhgVar3.b();
                if (iB2 != 1) {
                    if (iB2 == 2) {
                    }
                    if (dhgVar3.v()) {
                        iconUri.addFeature("android.media.route.feature.REMOTE_DYNAMIC_GROUP_ROUTE");
                    }
                    bundle = new Bundle();
                    bundle.putBundle("androidx.mediarouter.media.KEY_EXTRAS", dhgVar3.m());
                    bundle.putParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS", new ArrayList<>(dhgVar3.r()));
                    bundle.putInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", dhgVar3.b());
                    bundle.putInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", dhgVar3.f());
                    bundle.putString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID", dhgVar3.p());
                    if (!dhgVar3.s().isEmpty()) {
                        iconUri.addFeature("android.media.route.feature.REMOTE_GROUP_PLAYBACK");
                        bundle.putStringArrayList("androidx.mediarouter.media.KEY_GROUP_MEMBER_IDS", new ArrayList<>(dhgVar3.s()));
                    }
                    iconUri.setExtras(bundle);
                    if (dhgVar3.r().isEmpty()) {
                        iconUri.addFeature("android.media.route.feature.EMPTY");
                    }
                    mediaRoute2InfoBuild = iconUri.build();
                } else {
                    iconUri.addFeature("android.media.route.feature.REMOTE_VIDEO_PLAYBACK");
                }
                iconUri.addFeature("android.media.route.feature.REMOTE_AUDIO_PLAYBACK");
                if (dhgVar3.v()) {
                    iconUri.addFeature("android.media.route.feature.REMOTE_DYNAMIC_GROUP_ROUTE");
                }
                bundle = new Bundle();
                bundle.putBundle("androidx.mediarouter.media.KEY_EXTRAS", dhgVar3.m());
                bundle.putParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS", new ArrayList<>(dhgVar3.r()));
                bundle.putInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", dhgVar3.b());
                bundle.putInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", dhgVar3.f());
                bundle.putString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID", dhgVar3.p());
                if (!dhgVar3.s().isEmpty()) {
                    iconUri.addFeature("android.media.route.feature.REMOTE_GROUP_PLAYBACK");
                    bundle.putStringArrayList("androidx.mediarouter.media.KEY_GROUP_MEMBER_IDS", new ArrayList<>(dhgVar3.s()));
                }
                iconUri.setExtras(bundle);
                if (dhgVar3.r().isEmpty()) {
                    iconUri.addFeature("android.media.route.feature.EMPTY");
                }
                mediaRoute2InfoBuild = iconUri.build();
            }
            if (mediaRoute2InfoBuild != null) {
                arrayList2.add(mediaRoute2InfoBuild);
            }
        }
        dheVar.notifyRoutes(arrayList2);
    }
}
