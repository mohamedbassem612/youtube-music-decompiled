package com.google.vr.cardboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.a;
import defpackage.agzk;
import defpackage.aihf;
import defpackage.aihn;
import defpackage.aiik;
import defpackage.auix;
import defpackage.aujl;
import defpackage.auju;
import defpackage.aujy;
import defpackage.aujz;
import defpackage.auka;
import defpackage.aukb;
import internal.org.jni_zero.CommonApis;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class VrParamsProviderJni {
    private static void a(long j, DisplayMetrics displayMetrics, float f, int i) {
        nativeUpdateNativeDisplayParamsPointer(j, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.xdpi, displayMetrics.ydpi, f, i);
    }

    private static native void nativeUpdateNativeDisplayParamsPointer(long j, int i, int i2, float f, float f2, float f3, int i3);

    private static byte[] readDeviceParams(Context context) {
        aujl aujlVarV = CommonApis.v(context);
        aujy aujyVarB = aujlVarV.b();
        aujlVarV.e();
        if (aujyVarB == null) {
            return null;
        }
        return aujyVarB.toByteArray();
    }

    private static void readDisplayParams(Context context, long j) {
        int iA;
        int iA2;
        int i = 0;
        auix auixVar = null;
        if (context == null) {
            Log.w("VrParamsProviderJni", "Missing context for phone params lookup. Results may be invalid.");
            a(j, Resources.getSystem().getDisplayMetrics(), CommonApis.w(null), 0);
            return;
        }
        aujl aujlVarV = CommonApis.v(context);
        aujz aujzVarC = aujlVarV.c();
        aujlVarV.e();
        Display displayY = CommonApis.y(context);
        DisplayMetrics displayMetricsX = CommonApis.x(displayY);
        if (aujzVarC != null) {
            if ((aujzVarC.b & 1) != 0) {
                displayMetricsX.xdpi = aujzVarC.c;
            }
            if ((aujzVarC.b & 2) != 0) {
                displayMetricsX.ydpi = aujzVarC.d;
            }
        }
        float fW = CommonApis.w(aujzVarC);
        if (a.aL()) {
            auixVar = new auix(displayY.getCutout());
        } else if (a.aK()) {
            try {
                Class<?> cls = Class.forName("android.view.DisplayInfo");
                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                Display.class.getDeclaredMethod("getDisplayInfo", cls).invoke(displayY, objNewInstance);
                Field declaredField = cls.getDeclaredField("displayCutout");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objNewInstance);
                Class cls2 = auix.a;
                if (obj != null && auix.a != null) {
                    auixVar = new auix(obj);
                }
            } catch (Exception e) {
                Log.e("AndroidPCompat", "Failed to fetch DisplayCutout from Display: ".concat(e.toString()));
            }
        }
        if (auixVar != null) {
            if (context.getResources().getConfiguration().orientation == 1) {
                iA = auixVar.a("getSafeInsetTop");
                iA2 = auixVar.a("getSafeInsetBottom");
            } else {
                iA = auixVar.a("getSafeInsetLeft");
                iA2 = auixVar.a("getSafeInsetRight");
            }
            i = iA2 + iA;
        }
        a(j, displayMetricsX, fW, i);
    }

    private static byte[] readSdkConfigurationParams(Context context) {
        agzk agzkVar;
        agzk agzkVar2 = auju.a;
        synchronized (auju.class) {
            agzkVar = auju.b;
            if (agzkVar == null) {
                aujl aujlVarV = CommonApis.v(context);
                aihf aihfVarCreateBuilder = aukb.a.createBuilder();
                agzk agzkVar3 = auju.a;
                aihfVarCreateBuilder.copyOnWrite();
                aukb aukbVar = (aukb) aihfVarCreateBuilder.instance;
                agzkVar3.getClass();
                aukbVar.d = agzkVar3;
                aukbVar.b |= 2;
                aihfVarCreateBuilder.copyOnWrite();
                aukb aukbVar2 = (aukb) aihfVarCreateBuilder.instance;
                aukbVar2.b |= 1;
                aukbVar2.c = "1.229.0";
                agzk agzkVarA = aujlVarV.a((aukb) aihfVarCreateBuilder.build());
                if (agzkVarA == null) {
                    Log.w("SdkConfigurationReader", "VrParamsProvider returned null params, using defaults.");
                    agzkVarA = auju.c;
                } else {
                    agzkVarA.toString();
                }
                synchronized (auju.class) {
                    auju.b = agzkVarA;
                }
                aujlVarV.e();
                agzkVar = auju.b;
            }
        }
        return agzkVar.toByteArray();
    }

    private static byte[] readUserPrefs(Context context) {
        aujl aujlVarV = CommonApis.v(context);
        auka aukaVarD = aujlVarV.d();
        aujlVarV.e();
        if (aukaVarD == null) {
            return null;
        }
        return aukaVarD.toByteArray();
    }

    private static boolean writeDeviceParams(Context context, byte[] bArr) {
        aujy aujyVar;
        boolean zF;
        aujl aujlVarV = CommonApis.v(context);
        if (bArr != null) {
            try {
                try {
                    aujyVar = (aujy) aihn.parseFrom(aujy.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
                } catch (aiik e) {
                    Log.w("VrParamsProviderJni", a.co(e, "Error parsing protocol buffer: "));
                    zF = false;
                }
            } finally {
                aujlVarV.e();
            }
        } else {
            aujyVar = null;
        }
        zF = aujlVarV.f(aujyVar);
        return zF;
    }
}
