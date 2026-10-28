package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import j$.util.OptionalInt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.chromium.base.version_info.VersionConstantsBridge;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acwe implements acwd {
    private static final int[] a = {R.attr.homeAsUpIndicator};
    private final Context b;
    private final String c;
    private final vyo d;

    /* JADX WARN: Code duplicated, block: B:43:0x00d5 A[Catch: IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, TryCatch #1 {IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, blocks: (B:3:0x0011, B:4:0x0017, B:6:0x001b, B:8:0x0033, B:10:0x0039, B:11:0x0046, B:13:0x004c, B:15:0x0069, B:16:0x0071, B:18:0x0077, B:53:0x00f2, B:53:0x00f2, B:53:0x00f2, B:53:0x00f2, B:19:0x007b, B:21:0x0082, B:22:0x008b, B:41:0x00cf, B:41:0x00cf, B:41:0x00cf, B:41:0x00cf, B:43:0x00d5, B:43:0x00d5, B:43:0x00d5, B:43:0x00d5, B:44:0x00d8, B:44:0x00d8, B:44:0x00d8, B:44:0x00d8, B:46:0x00de, B:46:0x00de, B:46:0x00de, B:46:0x00de, B:47:0x00e1, B:47:0x00e1, B:47:0x00e1, B:47:0x00e1, B:49:0x00e7, B:49:0x00e7, B:49:0x00e7, B:49:0x00e7, B:50:0x00ea, B:50:0x00ea, B:50:0x00ea, B:50:0x00ea, B:52:0x00f0, B:52:0x00f0, B:52:0x00f0, B:52:0x00f0, B:40:0x00c8, B:40:0x00c8, B:40:0x00c8, B:40:0x00c8, B:55:0x00f6, B:55:0x00f6, B:55:0x00f6, B:55:0x00f6), top: B:63:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8 A[Catch: IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, TryCatch #1 {IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, blocks: (B:3:0x0011, B:4:0x0017, B:6:0x001b, B:8:0x0033, B:10:0x0039, B:11:0x0046, B:13:0x004c, B:15:0x0069, B:16:0x0071, B:18:0x0077, B:53:0x00f2, B:53:0x00f2, B:53:0x00f2, B:53:0x00f2, B:19:0x007b, B:21:0x0082, B:22:0x008b, B:41:0x00cf, B:41:0x00cf, B:41:0x00cf, B:41:0x00cf, B:43:0x00d5, B:43:0x00d5, B:43:0x00d5, B:43:0x00d5, B:44:0x00d8, B:44:0x00d8, B:44:0x00d8, B:44:0x00d8, B:46:0x00de, B:46:0x00de, B:46:0x00de, B:46:0x00de, B:47:0x00e1, B:47:0x00e1, B:47:0x00e1, B:47:0x00e1, B:49:0x00e7, B:49:0x00e7, B:49:0x00e7, B:49:0x00e7, B:50:0x00ea, B:50:0x00ea, B:50:0x00ea, B:50:0x00ea, B:52:0x00f0, B:52:0x00f0, B:52:0x00f0, B:52:0x00f0, B:40:0x00c8, B:40:0x00c8, B:40:0x00c8, B:40:0x00c8, B:55:0x00f6, B:55:0x00f6, B:55:0x00f6, B:55:0x00f6), top: B:63:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00de A[Catch: IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, TryCatch #1 {IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, blocks: (B:3:0x0011, B:4:0x0017, B:6:0x001b, B:8:0x0033, B:10:0x0039, B:11:0x0046, B:13:0x004c, B:15:0x0069, B:16:0x0071, B:18:0x0077, B:53:0x00f2, B:53:0x00f2, B:53:0x00f2, B:53:0x00f2, B:19:0x007b, B:21:0x0082, B:22:0x008b, B:41:0x00cf, B:41:0x00cf, B:41:0x00cf, B:41:0x00cf, B:43:0x00d5, B:43:0x00d5, B:43:0x00d5, B:43:0x00d5, B:44:0x00d8, B:44:0x00d8, B:44:0x00d8, B:44:0x00d8, B:46:0x00de, B:46:0x00de, B:46:0x00de, B:46:0x00de, B:47:0x00e1, B:47:0x00e1, B:47:0x00e1, B:47:0x00e1, B:49:0x00e7, B:49:0x00e7, B:49:0x00e7, B:49:0x00e7, B:50:0x00ea, B:50:0x00ea, B:50:0x00ea, B:50:0x00ea, B:52:0x00f0, B:52:0x00f0, B:52:0x00f0, B:52:0x00f0, B:40:0x00c8, B:40:0x00c8, B:40:0x00c8, B:40:0x00c8, B:55:0x00f6, B:55:0x00f6, B:55:0x00f6, B:55:0x00f6), top: B:63:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e1 A[Catch: IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, TryCatch #1 {IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, blocks: (B:3:0x0011, B:4:0x0017, B:6:0x001b, B:8:0x0033, B:10:0x0039, B:11:0x0046, B:13:0x004c, B:15:0x0069, B:16:0x0071, B:18:0x0077, B:53:0x00f2, B:53:0x00f2, B:53:0x00f2, B:53:0x00f2, B:19:0x007b, B:21:0x0082, B:22:0x008b, B:41:0x00cf, B:41:0x00cf, B:41:0x00cf, B:41:0x00cf, B:43:0x00d5, B:43:0x00d5, B:43:0x00d5, B:43:0x00d5, B:44:0x00d8, B:44:0x00d8, B:44:0x00d8, B:44:0x00d8, B:46:0x00de, B:46:0x00de, B:46:0x00de, B:46:0x00de, B:47:0x00e1, B:47:0x00e1, B:47:0x00e1, B:47:0x00e1, B:49:0x00e7, B:49:0x00e7, B:49:0x00e7, B:49:0x00e7, B:50:0x00ea, B:50:0x00ea, B:50:0x00ea, B:50:0x00ea, B:52:0x00f0, B:52:0x00f0, B:52:0x00f0, B:52:0x00f0, B:40:0x00c8, B:40:0x00c8, B:40:0x00c8, B:40:0x00c8, B:55:0x00f6, B:55:0x00f6, B:55:0x00f6, B:55:0x00f6), top: B:63:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7 A[Catch: IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, TryCatch #1 {IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, blocks: (B:3:0x0011, B:4:0x0017, B:6:0x001b, B:8:0x0033, B:10:0x0039, B:11:0x0046, B:13:0x004c, B:15:0x0069, B:16:0x0071, B:18:0x0077, B:53:0x00f2, B:53:0x00f2, B:53:0x00f2, B:53:0x00f2, B:19:0x007b, B:21:0x0082, B:22:0x008b, B:41:0x00cf, B:41:0x00cf, B:41:0x00cf, B:41:0x00cf, B:43:0x00d5, B:43:0x00d5, B:43:0x00d5, B:43:0x00d5, B:44:0x00d8, B:44:0x00d8, B:44:0x00d8, B:44:0x00d8, B:46:0x00de, B:46:0x00de, B:46:0x00de, B:46:0x00de, B:47:0x00e1, B:47:0x00e1, B:47:0x00e1, B:47:0x00e1, B:49:0x00e7, B:49:0x00e7, B:49:0x00e7, B:49:0x00e7, B:50:0x00ea, B:50:0x00ea, B:50:0x00ea, B:50:0x00ea, B:52:0x00f0, B:52:0x00f0, B:52:0x00f0, B:52:0x00f0, B:40:0x00c8, B:40:0x00c8, B:40:0x00c8, B:40:0x00c8, B:55:0x00f6, B:55:0x00f6, B:55:0x00f6, B:55:0x00f6), top: B:63:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea A[Catch: IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, TryCatch #1 {IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, blocks: (B:3:0x0011, B:4:0x0017, B:6:0x001b, B:8:0x0033, B:10:0x0039, B:11:0x0046, B:13:0x004c, B:15:0x0069, B:16:0x0071, B:18:0x0077, B:53:0x00f2, B:53:0x00f2, B:53:0x00f2, B:53:0x00f2, B:19:0x007b, B:21:0x0082, B:22:0x008b, B:41:0x00cf, B:41:0x00cf, B:41:0x00cf, B:41:0x00cf, B:43:0x00d5, B:43:0x00d5, B:43:0x00d5, B:43:0x00d5, B:44:0x00d8, B:44:0x00d8, B:44:0x00d8, B:44:0x00d8, B:46:0x00de, B:46:0x00de, B:46:0x00de, B:46:0x00de, B:47:0x00e1, B:47:0x00e1, B:47:0x00e1, B:47:0x00e1, B:49:0x00e7, B:49:0x00e7, B:49:0x00e7, B:49:0x00e7, B:50:0x00ea, B:50:0x00ea, B:50:0x00ea, B:50:0x00ea, B:52:0x00f0, B:52:0x00f0, B:52:0x00f0, B:52:0x00f0, B:40:0x00c8, B:40:0x00c8, B:40:0x00c8, B:40:0x00c8, B:55:0x00f6, B:55:0x00f6, B:55:0x00f6, B:55:0x00f6), top: B:63:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f0 A[Catch: IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, TryCatch #1 {IllegalStateException | NullPointerException | SecurityException | RuntimeException -> 0x00ff, blocks: (B:3:0x0011, B:4:0x0017, B:6:0x001b, B:8:0x0033, B:10:0x0039, B:11:0x0046, B:13:0x004c, B:15:0x0069, B:16:0x0071, B:18:0x0077, B:53:0x00f2, B:53:0x00f2, B:53:0x00f2, B:53:0x00f2, B:19:0x007b, B:21:0x0082, B:22:0x008b, B:41:0x00cf, B:41:0x00cf, B:41:0x00cf, B:41:0x00cf, B:43:0x00d5, B:43:0x00d5, B:43:0x00d5, B:43:0x00d5, B:44:0x00d8, B:44:0x00d8, B:44:0x00d8, B:44:0x00d8, B:46:0x00de, B:46:0x00de, B:46:0x00de, B:46:0x00de, B:47:0x00e1, B:47:0x00e1, B:47:0x00e1, B:47:0x00e1, B:49:0x00e7, B:49:0x00e7, B:49:0x00e7, B:49:0x00e7, B:50:0x00ea, B:50:0x00ea, B:50:0x00ea, B:50:0x00ea, B:52:0x00f0, B:52:0x00f0, B:52:0x00f0, B:52:0x00f0, B:40:0x00c8, B:40:0x00c8, B:40:0x00c8, B:40:0x00c8, B:55:0x00f6, B:55:0x00f6, B:55:0x00f6, B:55:0x00f6), top: B:63:0x0011 }] */
    public acwe(vyo vyoVar, Context context) {
        this.d = vyoVar;
        context.getClass();
        this.b = context;
        String str = null;
        try {
            boolean z = c(vyoVar).cm;
            String str2 = VersionConstantsBridge.a;
            if (str2 == null) {
                PackageManager packageManager = context.getPackageManager();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com"));
                ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
                String str3 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
                List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                ArrayList arrayList = new ArrayList();
                for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                    Intent intent2 = new Intent();
                    intent2.setAction("android.support.customtabs.action.CustomTabsService");
                    intent2.setPackage(resolveInfo.activityInfo.packageName);
                    if (packageManager.resolveService(intent2, 0) != null) {
                        arrayList.add(resolveInfo.activityInfo.packageName);
                    }
                }
                if (arrayList.isEmpty()) {
                    VersionConstantsBridge.a = null;
                } else if (arrayList.size() == 1) {
                    VersionConstantsBridge.a = (String) arrayList.get(0);
                } else if (!TextUtils.isEmpty(str3)) {
                    try {
                        List<ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                        if (listQueryIntentActivities2 != null && listQueryIntentActivities2.size() != 0) {
                            Iterator<ResolveInfo> it = listQueryIntentActivities2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    ResolveInfo next = it.next();
                                    IntentFilter intentFilter = next.filter;
                                    if (intentFilter == null || intentFilter.countDataAuthorities() == 0 || intentFilter.countDataPaths() == 0 || next.activityInfo == null) {
                                    }
                                } else if (arrayList.contains(str3)) {
                                    VersionConstantsBridge.a = str3;
                                }
                                if (arrayList.contains("com.android.chrome")) {
                                    VersionConstantsBridge.a = "com.android.chrome";
                                } else if (arrayList.contains("com.chrome.beta")) {
                                    VersionConstantsBridge.a = "com.chrome.beta";
                                } else if (arrayList.contains("com.chrome.dev")) {
                                    VersionConstantsBridge.a = "com.chrome.dev";
                                }
                            }
                        } else if (arrayList.contains(str3)) {
                            VersionConstantsBridge.a = str3;
                        } else if (arrayList.contains("com.android.chrome")) {
                            VersionConstantsBridge.a = "com.android.chrome";
                        } else if (arrayList.contains("com.chrome.beta")) {
                            VersionConstantsBridge.a = "com.chrome.beta";
                        } else if (arrayList.contains("com.chrome.dev")) {
                            VersionConstantsBridge.a = "com.chrome.dev";
                        }
                    } catch (RuntimeException unused) {
                        Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
                    }
                } else if (arrayList.contains("com.android.chrome")) {
                    VersionConstantsBridge.a = "com.android.chrome";
                } else if (arrayList.contains("com.chrome.beta")) {
                    VersionConstantsBridge.a = "com.chrome.beta";
                } else if (arrayList.contains("com.chrome.dev")) {
                    VersionConstantsBridge.a = "com.chrome.dev";
                }
                str2 = VersionConstantsBridge.a;
            }
            if (z || !Objects.equals(str2, "com.google.android.apps.chrome")) {
                str = str2;
            }
        } catch (IllegalStateException | NullPointerException | SecurityException | RuntimeException unused2) {
        }
        this.c = str;
    }

    private static aizx c(vyo vyoVar) {
        if (vyoVar == null || vyoVar.b() == null || (vyoVar.b().b & 2097152) == 0) {
            return aizx.a;
        }
        aizx aizxVar = vyoVar.b().o;
        return aizxVar == null ? aizx.a : aizxVar;
    }

    @Override // defpackage.acwd
    public final boolean a(Context context, Uri uri) {
        syf syfVar = sxy.c;
        HashSet hashSet = new HashSet();
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 65536);
        if (listQueryIntentActivities != null) {
            int size = listQueryIntentActivities.size();
            for (int i = 0; i < size; i++) {
                String str = listQueryIntentActivities.get(i).activityInfo.packageName;
                Set set = syfVar.b;
                if (set == null) {
                    syfVar.b = new HashSet();
                    List<ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(syf.a, 65536);
                    int size2 = listQueryIntentActivities2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        syfVar.b.add(listQueryIntentActivities2.get(i2).activityInfo.packageName);
                    }
                    set = syfVar.b;
                }
                if (!set.contains(str)) {
                    hashSet.add(str);
                }
            }
        }
        if (hashSet.isEmpty() || "1".equals(uri.getQueryParameter("noapp"))) {
            return b(context, uri);
        }
        return false;
    }

    @Override // defpackage.acwd
    public final boolean b(Context context, Uri uri) {
        int i;
        OptionalInt optionalIntEmpty;
        String str = this.c;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        aeiv aeivVar = new aeiv((byte[]) null, (byte[]) null);
        acwc acwcVar = new acwc(null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        TypedValue typedValue = new TypedValue();
        vyo vyoVar = this.d;
        if (!c(vyoVar).bQ ? (context.getResources().getConfiguration().uiMode & 48) == 32 : context.getTheme().resolveAttribute(R.attr.ytThemeType, typedValue, true) && typedValue.data == 1) {
            i = context.getTheme().resolveAttribute(R.attr.ytStaticBrandWhite, typedValue, true) ? typedValue.data : -1;
        } else {
            i = context.getTheme().resolveAttribute(R.attr.ytStaticBrandBlack, typedValue, true) ? typedValue.data : -16777216;
        }
        Intent intent = (Intent) aeivVar.b;
        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 0);
        ((yt) aeivVar.a).a = Integer.valueOf(i | (-16777216));
        intent.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", BitmapFactory.decodeResource(context.getResources(), resourceId));
        int i2 = acwcVar.a;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0 || i3 == 1) {
            aeivVar.c = ActivityOptions.makeCustomAnimation(context, true != c(vyoVar).aj ? R.anim.abc_slide_in_bottom : R.anim.customtabs_slide_in_quick, R.anim.abc_fade_out);
            intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", new atc(ActivityOptions.makeCustomAnimation(context, R.anim.abc_fade_in, R.anim.abc_slide_out_bottom)).c());
        }
        eol eolVarA = aeivVar.A();
        Intent intent2 = (Intent) eolVarA.b;
        intent2.setPackage(str);
        sxy.b(context, intent2, uri);
        intent2.putExtra("com.android.browser.application_id", context.getPackageName());
        intent2.putExtra("android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER", c(vyoVar).ah && (uri.toString().contains("www.google.com/aclk") || uri.toString().contains("www.googleadservices.com/pagead/aclk") || uri.toString().contains("googleads.g.doubleclick.net/aclk") || uri.toString().contains("adclick.g.doubleclick.net/aclk")));
        intent2.putExtra("com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", false);
        intent2.putExtra("org.chromium.chrome.browser.customtabs.HIDE_INCOGNITO_ICON", false);
        intent2.putExtra("org.chromium.chrome.browser.customtabs.USE_NORMAL_PROFILE_STYLE", false);
        intent2.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", 2);
        if (c(vyoVar).bR) {
            String str2 = c(vyoVar).bS;
            if (TextUtils.isEmpty(str2)) {
                optionalIntEmpty = OptionalInt.empty();
            } else {
                try {
                    optionalIntEmpty = OptionalInt.of(Color.parseColor(str2));
                } catch (IllegalArgumentException unused) {
                    optionalIntEmpty = OptionalInt.empty();
                }
            }
            if (optionalIntEmpty.isPresent()) {
                ((Intent) eolVarA.b).putExtra("androidx.browser.customtabs.extra.TRANSLUCENT_BACKGROUND", optionalIntEmpty.getAsInt());
            }
        }
        if (c(this.d).l) {
            ((Intent) eolVarA.b).putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
        }
        Intent intent3 = (Intent) eolVarA.b;
        intent3.setData(uri);
        context.startActivity(intent3, (Bundle) eolVarA.a);
        return true;
    }
}
