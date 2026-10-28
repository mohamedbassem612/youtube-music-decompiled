package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.Log;
import app.rive.semantics.SemanticState;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jwo implements agfr {
    public final /* synthetic */ Context a;

    public /* synthetic */ jwo(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x007d A[Catch: all -> 0x01d9, TryCatch #5 {all -> 0x01d9, blocks: (B:19:0x004e, B:30:0x0067, B:31:0x006b, B:37:0x007d, B:38:0x0087, B:40:0x008d, B:42:0x009d, B:44:0x00b4, B:47:0x00be, B:49:0x00c2, B:51:0x00d2, B:53:0x00e9, B:56:0x00f2, B:58:0x0102, B:60:0x0110, B:62:0x0118, B:63:0x0125, B:71:0x013f, B:72:0x0143, B:76:0x0153, B:78:0x0159, B:80:0x0167, B:81:0x016f, B:102:0x01b1, B:105:0x01b4, B:107:0x01c2, B:109:0x01c6, B:110:0x01c9, B:75:0x014b, B:65:0x0132, B:34:0x0073, B:22:0x0054, B:26:0x005e, B:82:0x0170, B:84:0x0174, B:86:0x0176, B:88:0x017c, B:89:0x0180, B:90:0x0182, B:94:0x0192, B:96:0x01a7, B:98:0x01ab, B:99:0x01ae, B:93:0x018a), top: B:131:0x004e, outer: #3, inners: #0, #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x008d A[Catch: all -> 0x01d9, TryCatch #5 {all -> 0x01d9, blocks: (B:19:0x004e, B:30:0x0067, B:31:0x006b, B:37:0x007d, B:38:0x0087, B:40:0x008d, B:42:0x009d, B:44:0x00b4, B:47:0x00be, B:49:0x00c2, B:51:0x00d2, B:53:0x00e9, B:56:0x00f2, B:58:0x0102, B:60:0x0110, B:62:0x0118, B:63:0x0125, B:71:0x013f, B:72:0x0143, B:76:0x0153, B:78:0x0159, B:80:0x0167, B:81:0x016f, B:102:0x01b1, B:105:0x01b4, B:107:0x01c2, B:109:0x01c6, B:110:0x01c9, B:75:0x014b, B:65:0x0132, B:34:0x0073, B:22:0x0054, B:26:0x005e, B:82:0x0170, B:84:0x0174, B:86:0x0176, B:88:0x017c, B:89:0x0180, B:90:0x0182, B:94:0x0192, B:96:0x01a7, B:98:0x01ab, B:99:0x01ae, B:93:0x018a), top: B:131:0x004e, outer: #3, inners: #0, #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2 A[Catch: all -> 0x01d9, TryCatch #5 {all -> 0x01d9, blocks: (B:19:0x004e, B:30:0x0067, B:31:0x006b, B:37:0x007d, B:38:0x0087, B:40:0x008d, B:42:0x009d, B:44:0x00b4, B:47:0x00be, B:49:0x00c2, B:51:0x00d2, B:53:0x00e9, B:56:0x00f2, B:58:0x0102, B:60:0x0110, B:62:0x0118, B:63:0x0125, B:71:0x013f, B:72:0x0143, B:76:0x0153, B:78:0x0159, B:80:0x0167, B:81:0x016f, B:102:0x01b1, B:105:0x01b4, B:107:0x01c2, B:109:0x01c6, B:110:0x01c9, B:75:0x014b, B:65:0x0132, B:34:0x0073, B:22:0x0054, B:26:0x005e, B:82:0x0170, B:84:0x0174, B:86:0x0176, B:88:0x017c, B:89:0x0180, B:90:0x0182, B:94:0x0192, B:96:0x01a7, B:98:0x01ab, B:99:0x01ae, B:93:0x018a), top: B:131:0x004e, outer: #3, inners: #0, #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0102 A[Catch: all -> 0x01d9, TryCatch #5 {all -> 0x01d9, blocks: (B:19:0x004e, B:30:0x0067, B:31:0x006b, B:37:0x007d, B:38:0x0087, B:40:0x008d, B:42:0x009d, B:44:0x00b4, B:47:0x00be, B:49:0x00c2, B:51:0x00d2, B:53:0x00e9, B:56:0x00f2, B:58:0x0102, B:60:0x0110, B:62:0x0118, B:63:0x0125, B:71:0x013f, B:72:0x0143, B:76:0x0153, B:78:0x0159, B:80:0x0167, B:81:0x016f, B:102:0x01b1, B:105:0x01b4, B:107:0x01c2, B:109:0x01c6, B:110:0x01c9, B:75:0x014b, B:65:0x0132, B:34:0x0073, B:22:0x0054, B:26:0x005e, B:82:0x0170, B:84:0x0174, B:86:0x0176, B:88:0x017c, B:89:0x0180, B:90:0x0182, B:94:0x0192, B:96:0x01a7, B:98:0x01ab, B:99:0x01ae, B:93:0x018a), top: B:131:0x004e, outer: #3, inners: #0, #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0132 A[Catch: all -> 0x01d9, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x01d9, blocks: (B:19:0x004e, B:30:0x0067, B:31:0x006b, B:37:0x007d, B:38:0x0087, B:40:0x008d, B:42:0x009d, B:44:0x00b4, B:47:0x00be, B:49:0x00c2, B:51:0x00d2, B:53:0x00e9, B:56:0x00f2, B:58:0x0102, B:60:0x0110, B:62:0x0118, B:63:0x0125, B:71:0x013f, B:72:0x0143, B:76:0x0153, B:78:0x0159, B:80:0x0167, B:81:0x016f, B:102:0x01b1, B:105:0x01b4, B:107:0x01c2, B:109:0x01c6, B:110:0x01c9, B:75:0x014b, B:65:0x0132, B:34:0x0073, B:22:0x0054, B:26:0x005e, B:82:0x0170, B:84:0x0174, B:86:0x0176, B:88:0x017c, B:89:0x0180, B:90:0x0182, B:94:0x0192, B:96:0x01a7, B:98:0x01ab, B:99:0x01ae, B:93:0x018a), top: B:131:0x004e, outer: #3, inners: #0, #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0136 A[Catch: all -> 0x01e4, TRY_ENTER, TryCatch #3 {, blocks: (B:6:0x0010, B:8:0x0014, B:10:0x0016, B:12:0x001b, B:13:0x001d, B:15:0x002f, B:16:0x0033, B:17:0x0035, B:45:0x00b8, B:68:0x013a, B:69:0x013d, B:54:0x00ed, B:67:0x0136, B:111:0x01d0, B:112:0x01d7, B:115:0x01da, B:116:0x01e1, B:19:0x004e, B:30:0x0067, B:31:0x006b, B:37:0x007d, B:38:0x0087, B:40:0x008d, B:42:0x009d, B:44:0x00b4, B:47:0x00be, B:49:0x00c2, B:51:0x00d2, B:53:0x00e9, B:56:0x00f2, B:58:0x0102, B:60:0x0110, B:62:0x0118, B:63:0x0125, B:71:0x013f, B:72:0x0143, B:76:0x0153, B:78:0x0159, B:80:0x0167, B:81:0x016f, B:102:0x01b1, B:105:0x01b4, B:107:0x01c2, B:109:0x01c6, B:110:0x01c9, B:75:0x014b, B:65:0x0132, B:34:0x0073, B:22:0x0054, B:26:0x005e), top: B:128:0x0010, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x013f A[Catch: all -> 0x01d9, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x01d9, blocks: (B:19:0x004e, B:30:0x0067, B:31:0x006b, B:37:0x007d, B:38:0x0087, B:40:0x008d, B:42:0x009d, B:44:0x00b4, B:47:0x00be, B:49:0x00c2, B:51:0x00d2, B:53:0x00e9, B:56:0x00f2, B:58:0x0102, B:60:0x0110, B:62:0x0118, B:63:0x0125, B:71:0x013f, B:72:0x0143, B:76:0x0153, B:78:0x0159, B:80:0x0167, B:81:0x016f, B:102:0x01b1, B:105:0x01b4, B:107:0x01c2, B:109:0x01c6, B:110:0x01c9, B:75:0x014b, B:65:0x0132, B:34:0x0073, B:22:0x0054, B:26:0x005e, B:82:0x0170, B:84:0x0174, B:86:0x0176, B:88:0x017c, B:89:0x0180, B:90:0x0182, B:94:0x0192, B:96:0x01a7, B:98:0x01ab, B:99:0x01ae, B:93:0x018a), top: B:131:0x004e, outer: #3, inners: #0, #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0174 A[Catch: all -> 0x01b2, DONT_GENERATE, TryCatch #0 {all -> 0x01b2, blocks: (B:82:0x0170, B:84:0x0174, B:86:0x0176, B:88:0x017c, B:89:0x0180, B:90:0x0182, B:94:0x0192, B:96:0x01a7, B:98:0x01ab, B:99:0x01ae, B:93:0x018a), top: B:123:0x0170, outer: #5, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0176 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:82:0x0170, B:84:0x0174, B:86:0x0176, B:88:0x017c, B:89:0x0180, B:90:0x0182, B:94:0x0192, B:96:0x01a7, B:98:0x01ab, B:99:0x01ae, B:93:0x018a), top: B:123:0x0170, outer: #5, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x017c A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:82:0x0170, B:84:0x0174, B:86:0x0176, B:88:0x017c, B:89:0x0180, B:90:0x0182, B:94:0x0192, B:96:0x01a7, B:98:0x01ab, B:99:0x01ae, B:93:0x018a), top: B:123:0x0170, outer: #5, inners: #6 }] */
    @Override // defpackage.agfr
    public final Object io() {
        Context applicationContext;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        jwf jwfVar;
        jwg jwgVar;
        Context applicationContext2;
        SharedPreferences sharedPreferences4;
        SharedPreferences sharedPreferences5;
        ConditionVariable conditionVariable;
        SharedPreferences sharedPreferences6;
        xgl xglVar;
        xgl xglVar2;
        jwm jwmVar = jwp.a;
        jwn jwnVar = jwf.a.b;
        boolean z = jwnVar.c;
        Context applicationContext3 = this.a;
        if (!z) {
            synchronized (jwnVar.a) {
                if (jwnVar.c) {
                    return null;
                }
                if (!jwnVar.d) {
                    jwnVar.d = true;
                }
                jwnVar.i = TextUtils.equals(applicationContext3.getPackageName(), "com.google.android.gms");
                if (applicationContext3.getApplicationContext() != null) {
                    applicationContext3 = applicationContext3.getApplicationContext();
                }
                jwnVar.g = applicationContext3;
                try {
                    jwnVar.f = kte.a.a(jwnVar.g).f(jwnVar.g.getPackageName(), SemanticState.Focused).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context context = jwnVar.g;
                    if (context == null) {
                        context = null;
                    } else {
                        try {
                            applicationContext = context.createPackageContext("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            applicationContext = null;
                        }
                        if (applicationContext != null || (applicationContext = context.getApplicationContext()) != null) {
                            context = applicationContext;
                        }
                    }
                    if (context != null) {
                        kro kroVar = jwf.a.e;
                        try {
                            sharedPreferences = context.getSharedPreferences("google_ads_flags", 0);
                        } catch (IllegalStateException e) {
                            Log.w("Ads", "", e);
                            sharedPreferences = null;
                        }
                        if (sharedPreferences != null) {
                            jwv.a.set(new jni(sharedPreferences));
                        }
                        if (!jwnVar.i) {
                            xglVar2 = jwq.a;
                            if (((Long) xglVar2.d()).longValue() <= 0 && hna.U(jwnVar.g, "crash_without_write") >= ((Long) xglVar2.d()).longValue()) {
                                jwnVar.j = true;
                                jwnVar.c = true;
                                jwnVar.d = false;
                                conditionVariable = jwnVar.b;
                            }
                            conditionVariable.open();
                            return null;
                        }
                        if (!jwnVar.i) {
                            xglVar = jwq.b;
                            if (((Long) xglVar.d()).longValue() <= 0 && hna.U(jwnVar.g, "init_without_write") >= ((Long) xglVar.d()).longValue()) {
                                jwnVar.j = true;
                                jwnVar.c = true;
                                jwnVar.d = false;
                                conditionVariable = jwnVar.b;
                            }
                            conditionVariable.open();
                            return null;
                        }
                        Context context2 = jwnVar.g;
                        if (((Boolean) jwr.d.d()).booleanValue()) {
                            context = jwnVar.g;
                        } else if (((Boolean) jwr.e.d()).booleanValue() && (sharedPreferences6 = context2.getSharedPreferences("admob", 0)) != null) {
                            try {
                                if (new JSONObject((String) kro.E(new cbq(sharedPreferences6, 16))).optBoolean("local_flags_enabled")) {
                                    context = jwnVar.g;
                                }
                            } catch (JSONException unused3) {
                            }
                        }
                        if (context == null) {
                            jwnVar.d = false;
                            conditionVariable = jwnVar.b;
                            conditionVariable.open();
                            return null;
                        }
                        kro kroVar2 = jwf.a.e;
                        try {
                            sharedPreferences2 = context.getSharedPreferences("google_ads_flags", 0);
                        } catch (IllegalStateException e2) {
                            Log.w("Ads", "", e2);
                            sharedPreferences2 = null;
                        }
                        jwnVar.e = sharedPreferences2;
                        if (!jwnVar.i && ((Boolean) jwr.c.d()).booleanValue()) {
                            jwfVar = jwf.a;
                            jwgVar = jwfVar.c;
                            applicationContext2 = jwnVar.g;
                            synchronized (jwgVar.a) {
                                try {
                                    if (jwgVar.b != null) {
                                        if (applicationContext2.getApplicationContext() != null) {
                                            applicationContext2 = applicationContext2.getApplicationContext();
                                        }
                                        kro kroVar3 = jwfVar.e;
                                        try {
                                            sharedPreferences4 = applicationContext2.getSharedPreferences("google_adapter_flags", 0);
                                        } catch (IllegalStateException e3) {
                                            Log.w("Ads", "", e3);
                                            sharedPreferences4 = null;
                                        }
                                        jwgVar.b = sharedPreferences4;
                                        jwg.a(jwgVar.b);
                                        if (!((Boolean) jwr.a.d()).booleanValue() && (sharedPreferences5 = jwgVar.b) != null) {
                                            sharedPreferences5.registerOnSharedPreferenceChangeListener(jwgVar);
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        if (!((Boolean) jwr.b.d()).booleanValue() && (sharedPreferences3 = jwnVar.e) != null) {
                            sharedPreferences3.registerOnSharedPreferenceChangeListener(jwnVar);
                        }
                        jwnVar.a(jwnVar.e);
                        jwnVar.c = true;
                        jwnVar.d = false;
                        jwnVar.b.open();
                    }
                    sharedPreferences = null;
                    if (sharedPreferences != null) {
                        jwv.a.set(new jni(sharedPreferences));
                    }
                    if (!jwnVar.i) {
                        xglVar2 = jwq.a;
                        if (((Long) xglVar2.d()).longValue() <= 0) {
                        }
                    }
                    if (!jwnVar.i) {
                        xglVar = jwq.b;
                        if (((Long) xglVar.d()).longValue() <= 0) {
                        }
                    }
                    Context context3 = jwnVar.g;
                    if (((Boolean) jwr.d.d()).booleanValue()) {
                        context = jwnVar.g;
                    } else if (((Boolean) jwr.e.d()).booleanValue()) {
                        if (new JSONObject((String) kro.E(new cbq(sharedPreferences6, 16))).optBoolean("local_flags_enabled")) {
                            context = jwnVar.g;
                        }
                    }
                    if (context == null) {
                        jwnVar.d = false;
                        conditionVariable = jwnVar.b;
                        conditionVariable.open();
                        return null;
                    }
                    kro kroVar4 = jwf.a.e;
                    sharedPreferences2 = context.getSharedPreferences("google_ads_flags", 0);
                    jwnVar.e = sharedPreferences2;
                    if (!jwnVar.i) {
                        jwfVar = jwf.a;
                        jwgVar = jwfVar.c;
                        applicationContext2 = jwnVar.g;
                        synchronized (jwgVar.a) {
                            if (jwgVar.b != null) {
                                if (applicationContext2.getApplicationContext() != null) {
                                    applicationContext2 = applicationContext2.getApplicationContext();
                                }
                                kro kroVar5 = jwfVar.e;
                                sharedPreferences4 = applicationContext2.getSharedPreferences("google_adapter_flags", 0);
                                jwgVar.b = sharedPreferences4;
                                jwg.a(jwgVar.b);
                                if (!((Boolean) jwr.a.d()).booleanValue()) {
                                    sharedPreferences5.registerOnSharedPreferenceChangeListener(jwgVar);
                                }
                            }
                        }
                    }
                    if (!((Boolean) jwr.b.d()).booleanValue()) {
                        sharedPreferences3.registerOnSharedPreferenceChangeListener(jwnVar);
                    }
                    jwnVar.a(jwnVar.e);
                    jwnVar.c = true;
                    jwnVar.d = false;
                    jwnVar.b.open();
                } catch (Throwable th2) {
                    jwnVar.d = false;
                    jwnVar.b.open();
                    throw th2;
                }
            }
        }
        return null;
    }
}
