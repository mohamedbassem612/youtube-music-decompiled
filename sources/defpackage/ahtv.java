package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahtv {
    public final Object a;
    public final Object b;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public ahtv(ahtv ahtvVar) {
        this.a = new HashMap((Map) ahtvVar.a);
        this.b = new HashMap((Map) ahtvVar.b);
    }

    public static void i(ahtv ahtvVar, aciz acizVar) {
        axlj axljVar = (axlj) ahtvVar.a;
        Object obj = axljVar.c;
        axlj axljVar2 = (axlj) acizVar.a;
        Object obj2 = axljVar2.c;
        long[] jArr = (long[]) acizVar.b;
        long[] jArr2 = (long[]) obj2;
        ahgv.a((long[]) obj, jArr2, jArr);
        Object obj3 = axljVar.b;
        Object obj4 = axljVar2.b;
        long[] jArr3 = (long[]) axljVar2.a;
        long[] jArr4 = (long[]) obj4;
        ahgv.a((long[]) obj3, jArr4, jArr3);
        ahgv.a((long[]) axljVar.a, jArr3, jArr);
        ahgv.a((long[]) ahtvVar.b, jArr2, jArr4);
    }

    final lpa a() {
        return (lpa) ((kjc) this.b).a;
    }

    public final void b() {
        ((kjc) this.b).x(null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final Enum c(Object obj) throws GeneralSecurityException {
        Enum r1 = (Enum) this.b.get(obj);
        if (r1 != null) {
            return r1;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(String.valueOf(obj))));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final Object d(Enum r2) throws GeneralSecurityException {
        Object obj = this.a.get(r2);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(r2.toString()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    public final void e(alou alouVar) {
        if (((vxz) this.b.io()).l(87, 45417051L, false)) {
            ((awlu) this.a).kk(alouVar);
        }
    }

    public final Intent f(String str, String str2, Bitmap bitmap) throws Exception {
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        intent.setPackage("com.instagram.android");
        intent.putExtra("source_application", str2);
        intent.putExtra("content_url", str);
        try {
            Uri uriL = aedi.l((Activity) this.a, aedi.m((Activity) this.a, bitmap, "background.png"));
            if (intent.getType() != null && !Objects.equals(intent.getType(), "image/*")) {
                throw new Exception("Background data and sticker data must share the same media type");
            }
            intent.setDataAndType(uriL, "image/*");
            intent.setFlags(1);
            return intent;
        } catch (IOException e) {
            throw new Exception("Failed to create story background asset.", e);
        }
    }

    public final void g(String str, String str2, Bitmap bitmap, Bitmap bitmap2) throws Exception {
        Intent intentF = f(str, str2, bitmap);
        try {
            File fileM = aedi.m((Activity) this.a, bitmap2, "sticker.png");
            Activity activity = (Activity) this.a;
            Uri uriL = aedi.l(activity, fileM);
            intentF.putExtra("interactive_asset_uri", uriL);
            if (intentF.getType() == null) {
                intentF.setType("image/*");
            } else if (!Objects.equals(intentF.getType(), "image/*")) {
                throw new Exception("Background data and sticker data must share the same media type");
            }
            activity.grantUriPermission("com.instagram.android", uriL, 1);
            h(intentF);
        } catch (IOException e) {
            throw new Exception("Failed to create story sticker asset.", e);
        }
    }

    public final void h(Intent intent) throws Exception {
        Activity activity = (Activity) this.a;
        if (activity.getPackageManager().resolveActivity(intent, 0) == null) {
            throw new Exception("Unable to resolve activity for Instagram story sharing.");
        }
        activity.startActivityForResult(intent, 0);
        Object obj = this.b;
        if (obj != null) {
            ((aerv) obj).e("YTM_SHARE_TO_INSTAGRAM_STORY");
        }
    }

    public ahtv(Class cls, ahhx ahhxVar) {
        this.b = cls;
        this.a = ahhxVar;
    }

    public ahtv(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public ahtv(awmd awmdVar, awmd awmdVar2, byte[] bArr) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
    }

    public ahtv(awmd awmdVar, awmd awmdVar2) {
        this.b = awmdVar2;
        this.a = awlu.av(10);
    }

    public ahtv(char[] cArr) {
        this.b = new Rect();
        this.a = new Rect();
    }

    public ahtv(byte[] bArr) {
        this(new axlj((byte[]) null), new long[10]);
    }

    public ahtv(aciz acizVar) {
        this((byte[]) null);
        i(this, acizVar);
    }

    public ahtv() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public ahtv(Intent intent) {
        this.b = new kjc((byte[]) null, (byte[]) null, (byte[]) null);
        this.a = intent;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public ahtv(ahtv ahtvVar, byte[] bArr) {
        this.a = new HashMap((Map) ahtvVar.a);
        this.b = new HashMap((Map) ahtvVar.b);
    }
}
