package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.InputDevice;
import android.view.View;
import android.view.WindowInsets;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class azt {
    public static bbn a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        bbn bbnVar = new bbn(rootWindowInsets);
        bbnVar.s(bbnVar);
        bbnVar.p(view.getRootView());
        return bbnVar;
    }

    public static int b(Resources resources, int i, axv axvVar, int i2) {
        int dimensionPixelSize;
        if (i != -1) {
            return (i == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i)) < 0) ? i2 : dimensionPixelSize;
        }
        return ((Integer) axvVar.a()).intValue();
    }

    public static boolean c(int i, int i2, int i3) {
        InputDevice device = InputDevice.getDevice(i);
        return (device == null || device.getMotionRange(i2, i3) == null) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object d(awqg awqgVar, awoq awoqVar) throws Exception {
        bfq bfqVar;
        ahfi ahfiVar;
        ahfi ahfiVar2;
        if (awoqVar instanceof bfq) {
            bfqVar = (bfq) awoqVar;
            int i = bfqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bfqVar.c = i - Integer.MIN_VALUE;
            } else {
                bfqVar = new bfq(awoqVar);
            }
        } else {
            bfqVar = new bfq(awoqVar);
        }
        Object obj = bfqVar.b;
        awox awoxVar = awox.a;
        try {
            try {
                switch (bfqVar.c) {
                    case 0:
                        atqp.j(obj);
                        bfqVar.a = null;
                        bfqVar.c = 7;
                        Object objInvoke = awqgVar.invoke(bfqVar);
                        return objInvoke == awoxVar ? awoxVar : objInvoke;
                    case 1:
                        atqp.j(obj);
                        ahfi ahfiVar3 = (ahfi) obj;
                        Object obj2 = ahfiVar3.b;
                        ((dqy) ahfiVar3.c).a();
                        bfqVar.a = null;
                        bfqVar.d = null;
                        bfqVar.e = null;
                        bfqVar.f = null;
                        bfqVar.g = ahfiVar3;
                        bfqVar.c = 3;
                        throw null;
                    case 2:
                        ahfiVar = bfqVar.g;
                        atqp.j(obj);
                        afxw.v(ahfiVar.a);
                        return obj;
                    case 3:
                        ahfiVar = bfqVar.g;
                        atqp.j(obj);
                        afxw.v(ahfiVar.a);
                        return obj;
                    case 4:
                        atqp.j(obj);
                        ahfi ahfiVar4 = (ahfi) obj;
                        Object obj3 = ahfiVar4.b;
                        ((dqy) ahfiVar4.c).a();
                        bfqVar.a = null;
                        bfqVar.d = null;
                        bfqVar.e = null;
                        bfqVar.f = ahfiVar4;
                        bfqVar.c = 6;
                        throw null;
                    case 5:
                        ahfiVar2 = bfqVar.f;
                        atqp.j(obj);
                        afxw.v(ahfiVar2.a);
                        return obj;
                    case 6:
                        ahfiVar2 = bfqVar.f;
                        atqp.j(obj);
                        afxw.v(ahfiVar2.a);
                        return obj;
                    case 7:
                        atqp.j(obj);
                        return obj;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th) {
                try {
                    wg.d(null, th);
                    throw new awmh();
                } catch (Throwable th2) {
                    afxw.v(awqgVar.a);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                wg.d(null, th3);
                throw new awmh();
            } catch (Throwable th4) {
                afxw.v(awqgVar.a);
                throw th4;
            }
        }
    }

    public static bec e(bgh bghVar, bgr bgrVar, List list, awut awutVar, Function0 function0) {
        beb bebVar = new beb(new bfv(bghVar, function0), awutVar.b().get(awwd.d) == null ? awutVar.b().plus(new awwf(null)) : awutVar.b());
        if (bgrVar != null) {
            bebVar.a = bgrVar;
        }
        bebVar.b(list);
        return bebVar.a();
    }

    public static dmo g(Context context, Class cls, String str) {
        if (awrc.v(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (awrc.c(str, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new dmo(context, cls, str);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    public static dhg h(MediaRoute2Info mediaRoute2Info) {
        int i;
        if (mediaRoute2Info != null) {
            dhf dhfVar = new dhf(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
            dhfVar.e(mediaRoute2Info.getConnectionState());
            dhfVar.m(mediaRoute2Info.getVolumeHandling());
            dhfVar.n(mediaRoute2Info.getVolumeMax());
            dhfVar.l(mediaRoute2Info.getVolume());
            dhfVar.i(mediaRoute2Info.getExtras());
            dhfVar.h(true);
            Bundle bundle = (Bundle) dhfVar.b;
            bundle.putBoolean("canDisconnect", false);
            if (Build.VERSION.SDK_INT >= 34) {
                bundle.putStringArrayList("deduplicationIds", new ArrayList<>(mediaRoute2Info.getDeduplicationIds()));
                int type = mediaRoute2Info.getType();
                i = 2;
                if (type == 2) {
                    i = 12;
                } else if (type == 3) {
                    i = 13;
                } else if (type == 4) {
                    i = 14;
                } else if (type == 22) {
                    i = 20;
                } else if (type == 23) {
                    i = 21;
                } else if (type == 26) {
                    i = 22;
                } else if (type == 29) {
                    i = 24;
                } else if (type != 2000) {
                    switch (type) {
                        case 8:
                            i = 3;
                            break;
                        case 9:
                            i = 16;
                            break;
                        case 10:
                            i = 23;
                            break;
                        case 11:
                            i = 17;
                            break;
                        case 12:
                            i = 18;
                            break;
                        case 13:
                            i = 19;
                            break;
                        default:
                            switch (type) {
                                case 1001:
                                    i = 1;
                                    break;
                                case 1002:
                                    break;
                                case 1003:
                                    i = 4;
                                    break;
                                case 1004:
                                    i = 5;
                                    break;
                                case 1005:
                                    i = 6;
                                    break;
                                case 1006:
                                    i = 7;
                                    break;
                                case 1007:
                                    i = 8;
                                    break;
                                case 1008:
                                    i = 9;
                                    break;
                                case 1009:
                                    i = 10;
                                    break;
                                case 1010:
                                    i = 11;
                                    break;
                                default:
                                    i = 0;
                                    break;
                            }
                            break;
                    }
                } else {
                    i = 1000;
                }
            } else {
                i = 0;
            }
            if (Build.VERSION.SDK_INT >= 36 && a.at() >= 3600001) {
                List<Set> requiredPermissions = mediaRoute2Info.getRequiredPermissions();
                dhfVar.a = new ArrayList();
                for (Set set : requiredPermissions) {
                    List list = dhfVar.a;
                    HashSet hashSet = new HashSet(set.size());
                    for (Object obj : set) {
                        obj.getClass();
                        hashSet.add(obj);
                    }
                    list.add(DesugarCollections.unmodifiableSet(hashSet));
                }
            }
            CharSequence description = mediaRoute2Info.getDescription();
            if (description != null) {
                dhfVar.f(description.toString());
            }
            Uri iconUri = mediaRoute2Info.getIconUri();
            if (iconUri != null) {
                bundle.putString("iconUri", iconUri.toString());
            }
            Bundle extras = mediaRoute2Info.getExtras();
            if (extras != null && extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") && extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") && extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
                dhfVar.i(extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
                if (i == 0) {
                    i = extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0);
                }
                dhfVar.g(i);
                dhfVar.j(extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
                ArrayList arrayListJ = aie.j(extras, "androidx.mediarouter.media.KEY_CONTROL_FILTERS", IntentFilter.class);
                if (arrayListJ != null) {
                    dhfVar.c(arrayListJ);
                }
                List features = mediaRoute2Info.getFeatures();
                if (features.contains("android.media.route.feature.REMOTE_DYNAMIC_GROUP_ROUTE")) {
                    bundle.putBoolean("isDynamicGroupRoute", true);
                }
                if (features.contains("android.media.route.feature.REMOTE_GROUP_PLAYBACK")) {
                    ArrayList<String> stringArrayList = extras.getStringArrayList("androidx.mediarouter.media.KEY_GROUP_MEMBER_IDS");
                    if (stringArrayList == null || stringArrayList.isEmpty()) {
                        Log.w("MediaRouter2Utils", "Invalid feature of a group without members");
                    } else {
                        dhfVar.d(stringArrayList);
                    }
                }
                return dhfVar.a();
            }
        }
        return null;
    }

    public static String i(String str) {
        switch (str.hashCode()) {
            case -2065577523:
                return str.equals("android.media.intent.category.REMOTE_PLAYBACK") ? "android.media.route.feature.REMOTE_PLAYBACK" : str;
            case 956939050:
                return str.equals("android.media.intent.category.LIVE_AUDIO") ? "android.media.route.feature.LIVE_AUDIO" : str;
            case 975975375:
                return str.equals("android.media.intent.category.LIVE_VIDEO") ? "android.media.route.feature.LIVE_VIDEO" : str;
            case 1601181366:
                return str.equals("android.media.intent.category.REMOTE_AUDIO_PLAYBACK") ? "android.media.route.feature.REMOTE_AUDIO_PLAYBACK" : str;
            case 1693091761:
                return str.equals("android.media.intent.category.REMOTE_VIDEO_PLAYBACK") ? "android.media.route.feature.REMOTE_VIDEO_PLAYBACK" : str;
            default:
                return str;
        }
    }

    public static List j(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM28m = aaj$$ExternalSyntheticApiModelOutline0.m28m(it.next());
            if (mediaRoute2InfoM28m != null) {
                arrayList.add(mediaRoute2InfoM28m.getId());
            }
        }
        return arrayList;
    }

    public void f(dpd dpdVar) {
    }
}
