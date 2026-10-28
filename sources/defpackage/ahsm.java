package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.view.View;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahsm {
    public final boolean a;
    public final Object b;
    public final Object c;

    public ahsm(abvn abvnVar, vxz vxzVar) {
        boolean zL = vxzVar.l(372, 45845013L, false);
        this.a = zL;
        avlh avlhVarQ = abvnVar.Q();
        avlh avlhVarP = avlhVarQ.H(new xee(18)).x(new xib(2)).H(new xee(19)).p();
        this.b = zL ? avlhVarP : avlhVarP.ax().c();
        avlh avlhVarP2 = avlhVarQ.H(new xee(20)).x(new xib(2)).H(new abld(1)).p();
        this.c = zL ? avlhVarP2 : avlhVarP2.ax().c();
    }

    public final synchronized boolean a() {
        return this.a;
    }

    public ahsm(xeu xeuVar, jsj jsjVar, boolean z) {
        this.b = xeuVar;
        this.c = jsjVar;
        this.a = z;
    }

    public ahsm(Intent intent, boolean z, agke agkeVar) {
        this.c = intent;
        this.a = z;
        this.b = agkeVar;
    }

    public ahsm(fwz fwzVar) {
        this.b = fwzVar.e;
        this.a = fwzVar.f;
        fxc fxcVar = fwzVar.h;
        this.c = fxcVar == null ? fxc.a : fxcVar;
        if (fwzVar.i == null) {
            fxf fxfVar = fxf.a;
        }
    }

    public ahsm(View view, boolean z) {
        this.b = view;
        this.c = new Rect();
        this.a = z;
    }

    public ahsm(Context context, String str) {
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        this.b = contextCreateDeviceProtectedStorageContext;
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(str), 0);
        this.c = sharedPreferences;
        boolean z = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                Context context2 = contextCreateDeviceProtectedStorageContext;
                PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                if (packageManager != null) {
                    Context context3 = contextCreateDeviceProtectedStorageContext;
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), SemanticState.Focused);
                    if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                        z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.a = z;
    }
}
