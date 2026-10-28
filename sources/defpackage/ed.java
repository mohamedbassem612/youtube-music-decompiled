package defpackage;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.flagging.AconfigPackage;
import android.os.flagging.AconfigStorageReadException;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ed {
    public static final boolean a() {
        AconfigPackage aconfigPackageM;
        if (Build.VERSION.SDK_INT < 36) {
            return false;
        }
        Map map = ef.a;
        map.getClass();
        Set set = ef.b;
        set.getClass();
        if (map.containsKey("com.android.media.flags")) {
            aconfigPackageM = a$$ExternalSyntheticApiModelOutline1.m(map.get("com.android.media.flags"));
        } else if (set.contains("com.android.media.flags")) {
            aconfigPackageM = null;
        } else {
            try {
                AconfigPackage aconfigPackageLoad = AconfigPackage.load("com.android.media.flags");
                map.put("com.android.media.flags", aconfigPackageLoad);
                aconfigPackageM = aconfigPackageLoad;
            } catch (AconfigStorageReadException unused) {
                set.add("com.android.media.flags");
                aconfigPackageM = null;
            }
        }
        if (aconfigPackageM != null) {
            return aconfigPackageM.getBooleanFlagValue("enable_suggested_device_api", false);
        }
        return false;
    }

    public static Object b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static uv c(Map map, String str) {
        uv uvVar = (uv) map.get(str);
        if (uvVar != null) {
            return uvVar;
        }
        uv uvVar2 = new uv(str);
        map.put(str, uvVar2);
        return uvVar2;
    }

    public static String d(String str, String str2) {
        return str + '$' + str2 + '/';
    }

    public static String e(String str) {
        int iIndexOf = str.indexOf(36);
        if (iIndexOf == -1) {
            Log.e("AppSearchPrefixUtil", "Malformed prefix doesn't contain package delimiter: ".concat(String.valueOf(str)));
            return "";
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(47, i);
        if (iIndexOf2 != -1) {
            return str.substring(i, iIndexOf2);
        }
        Log.e("AppSearchPrefixUtil", "Malformed prefix doesn't contain database delimiter: ".concat(String.valueOf(str)));
        return "";
    }

    public static String f(String str) {
        int iIndexOf = str.indexOf(36);
        if (iIndexOf != -1) {
            return str.substring(0, iIndexOf);
        }
        Log.e("AppSearchPrefixUtil", "Malformed prefix doesn't contain package delimiter: ".concat(String.valueOf(str)));
        return "";
    }

    public static String g(String str) throws ts {
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            return str.substring(0, iIndexOf + 1);
        }
        throw new ts(2, a.bT(str, "The prefixed value \"", "\" doesn't contain a valid database name"), null);
    }

    public static String h(String str) throws ts {
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            return str.substring(iIndexOf + 1);
        }
        throw new ts(2, a.bT(str, "The prefixed value \"", "\" doesn't contain a valid database name"), null);
    }

    public static void i(lvp lvpVar) throws ts {
        String strG = g(lvpVar.g());
        lvpVar.i(lvpVar.g().substring(strG.length()));
        for (int i = 0; i < lvpVar.b(); i++) {
            if (!lvpVar.e(i).schemaType_.isEmpty()) {
                lxq lxqVarV = lvpVar.e(i).v();
                lxqVarV.y(lxqVarV.g().substring(strG.length()));
                lvpVar.j(i, lxqVarV);
            }
        }
        for (int i2 = 0; i2 < lvpVar.d(); i2++) {
            lvpVar.h(i2, lvpVar.f(i2).substring(strG.length()));
        }
    }

    public static void j(lxq lxqVar, String str) {
        lxqVar.x(str.concat(String.valueOf(((ltt) lxqVar.a).schema_)));
        lxqVar.w(str.concat(String.valueOf(((ltt) lxqVar.a).namespace_)));
        for (int i = 0; i < ((ltt) lxqVar.a).b(); i++) {
            int iE = lxqVar.c(i).e();
            if (iE > 0) {
                lxq lxqVarV = lxqVar.c(i).v();
                for (int i2 = 0; i2 < iE; i2++) {
                    lxq lxqVarV2 = ((luz) lxqVarV.a).j(i2).v();
                    j(lxqVarV2, str);
                    lxqVarV.s();
                    luz luzVar = (luz) lxqVarV.a;
                    ltt lttVar = (ltt) lxqVarV2.o();
                    lttVar.getClass();
                    luzVar.k();
                    luzVar.documentValues_.set(i2, lttVar);
                }
                lxqVar.s();
                ltt lttVar2 = (ltt) lxqVar.a;
                luz luzVar2 = (luz) lxqVarV.o();
                luzVar2.getClass();
                lttVar2.d();
                lttVar2.properties_.set(i, luzVar2);
            }
        }
    }

    public static Object k(Map map, Object obj, Object obj2) {
        Object obj3 = map.get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public static ListenableFuture l(Executor executor, Callable callable) {
        aqo aqoVar = new aqo();
        executor.execute(new bg((Object) aqoVar, (Object) callable, 13, (byte[]) null));
        return aqoVar;
    }
}
