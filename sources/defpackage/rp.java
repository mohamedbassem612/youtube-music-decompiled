package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rp extends rj {
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, ro] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, ro] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, ro] */
    @Override // defpackage.rj
    public final /* synthetic */ Intent a(Context context, Object obj) {
        yt ytVar = (yt) obj;
        ytVar.getClass();
        if (rx.d()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(rx.c(ytVar.a));
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            return intent;
        }
        if (rx.b(context) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(rx.c(ytVar.a));
            if (intent2.getType() != null) {
                return intent2;
            }
            intent2.setType("*/*");
            intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            return intent2;
        }
        ResolveInfo resolveInfoB = rx.b(context);
        if (resolveInfoB == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoB.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(rx.c(ytVar.a));
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        return intent3;
    }

    @Override // defpackage.rj
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        List arrayList;
        if (i != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data != null) {
            return data;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data2 = intent.getData();
        if (data2 != null) {
            linkedHashSet.add(data2);
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            if (linkedHashSet.isEmpty()) {
                arrayList = awno.a;
            }
            return (Uri) atqq.Z(arrayList);
        }
        int itemCount = clipData.getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            Uri uri = clipData.getItemAt(i2).getUri();
            if (uri != null) {
                linkedHashSet.add(uri);
            }
        }
        arrayList = new ArrayList(linkedHashSet);
        return (Uri) atqq.Z(arrayList);
    }

    @Override // defpackage.rj
    public final /* synthetic */ zf c(Context context, Object obj) {
        ((yt) obj).getClass();
        return null;
    }
}
