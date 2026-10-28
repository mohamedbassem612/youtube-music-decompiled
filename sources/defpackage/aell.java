package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.share.endpoint.ShareLoggingBroadcastReceiver;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aell implements vxc {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/share/endpoint/ShareImageCommandResolver");
    private final Activity b;
    private final mbc c;
    private final Context d;
    private final vxz e;
    private final ahub f;

    public aell(Activity activity, mbc mbcVar, Context context, ahub ahubVar, vxz vxzVar) {
        this.b = activity;
        this.c = mbcVar;
        context.getClass();
        this.d = context;
        this.f = ahubVar;
        this.e = vxzVar;
    }

    @Override // defpackage.vxc
    public final void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0114  */
    /* JADX WARN: Code duplicated, block: B:58:0x011a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0156 A[PHI: r0 r14
      0x0156: PHI (r0v8 android.net.Uri) = (r0v5 android.net.Uri), (r0v7 android.net.Uri), (r0v32 android.net.Uri) binds: [B:65:0x0140, B:62:0x0124, B:57:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r14v2 java.lang.String) = (r14v1 java.lang.String), (r14v1 java.lang.String), (r14v10 java.lang.String) binds: [B:65:0x0140, B:62:0x0124, B:57:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.vxc
    public final /* synthetic */ void c(ajwo ajwoVar, Map map) {
        String str;
        Uri uriA;
        String str2;
        PendingIntent pendingIntentA;
        IOException iOException;
        int iAS;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aptg.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aptg aptgVar = (aptg) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        int i = aptgVar.c;
        int i2 = i & 1;
        if (i2 == 0 && (i & 16) == 0) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/share/endpoint/ShareImageCommandResolver", "resolve", 62, "ShareImageCommandResolver.java")).t("Either Image bytes or Image File Name must be supplied.");
            return;
        }
        String str3 = (i & 2) != 0 ? aptgVar.e : null;
        if (i2 != 0) {
            Bitmap bitmapM = nsj.m(aptgVar.d);
            String str4 = "ShareImageCommandResolver.java";
            if (bitmapM == null) {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/share/endpoint/ShareImageCommandResolver", "getImageUriFromImageBytes", 144, "ShareImageCommandResolver.java")).t("Failed to create bitmap from image bytes.");
                str = "image/png";
            } else {
                int iAS2 = a.aS(aptgVar.f);
                if (iAS2 == 0) {
                    iAS2 = 1;
                }
                int i3 = iAS2 - 1;
                String str5 = i3 != 1 ? ".png" : ".jpg";
                Bitmap.CompressFormat compressFormat = i3 != 1 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
                try {
                    File file = new File(this.b.getCacheDir(), "image_share");
                    if (!file.exists()) {
                        try {
                            file.mkdirs();
                        } catch (IOException e) {
                            iOException = e;
                            str4 = "ShareImageCommandResolver.java";
                            str = "image/png";
                            ((agrc) ((agrc) ((agrc) a.b()).j(iOException)).k("com/google/android/libraries/youtube/share/endpoint/ShareImageCommandResolver", "getImageUriFromImageBytes", (char) 159, str4)).t("Failed to cache image share file.");
                            uriA = null;
                        }
                    }
                    str = "image/png";
                    try {
                        try {
                            File file2 = new File(file, "image" + this.c.f().toEpochMilli() + str5);
                            FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
                            bitmapM.compress(compressFormat, 100, fileOutputStream);
                            fileOutputStream.close();
                            Activity activity = this.b;
                            uriA = avh.a(activity, nsj.n(activity), file2);
                        } catch (IOException e2) {
                            e = e2;
                            iOException = e;
                            ((agrc) ((agrc) ((agrc) a.b()).j(iOException)).k("com/google/android/libraries/youtube/share/endpoint/ShareImageCommandResolver", "getImageUriFromImageBytes", (char) 159, str4)).t("Failed to cache image share file.");
                            uriA = null;
                        }
                    } catch (IOException e3) {
                        e = e3;
                    }
                } catch (IOException e4) {
                    e = e4;
                    str = "image/png";
                }
                iAS = a.aS(aptgVar.f);
                if (iAS == 0) {
                    iAS = 1;
                }
                if (iAS - 1 == 1) {
                    str2 = "image/jpeg";
                } else {
                    str2 = str;
                }
            }
            uriA = null;
            iAS = a.aS(aptgVar.f);
            if (iAS == 0) {
                iAS = 1;
            }
            if (iAS - 1 == 1) {
                str2 = "image/jpeg";
            } else {
                str2 = str;
            }
        } else {
            str = "image/png";
            if ((i & 16) != 0) {
                try {
                    File file3 = new File(new File(this.d.getCacheDir(), "image_share"), aptgVar.g);
                    Activity activity2 = this.b;
                    uriA = avh.a(activity2, nsj.n(activity2), file3);
                } catch (IllegalArgumentException e5) {
                    ((agrc) ((agrc) ((agrc) a.b()).j(e5)).k("com/google/android/libraries/youtube/share/endpoint/ShareImageCommandResolver", "getUriForInternalStorageImage", (char) 176, "ShareImageCommandResolver.java")).t("Failed to get URI for image share image.");
                    uriA = null;
                }
                str2 = str;
            } else {
                uriA = null;
                str2 = null;
            }
        }
        if (uriA == null) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/share/endpoint/ShareImageCommandResolver", "resolve", 78, "ShareImageCommandResolver.java")).t("Image Uri is null.");
            return;
        }
        int i4 = aptgVar.c;
        if ((i4 & 32) == 0 && (i4 & SemanticState.Hidden) == 0) {
            pendingIntentA = null;
        } else {
            aihh aihhVar = (aihh) ajwoVar.toBuilder();
            aihl aihlVar = aptg.b;
            aihf builder = aptgVar.toBuilder();
            builder.copyOnWrite();
            aptg aptgVar2 = (aptg) builder.instance;
            aptgVar2.c &= -2;
            aptgVar2.d = aptg.a.d;
            aihhVar.e(aihlVar, (aptg) builder.build());
            aigj aigjVar = ajwoVar.c;
            aihhVar.copyOnWrite();
            ajwo ajwoVar2 = (ajwo) aihhVar.instance;
            aigjVar.getClass();
            ajwoVar2.b |= 1;
            ajwoVar2.c = aigjVar;
            ajwo ajwoVar3 = (ajwo) aihhVar.build();
            Context context = (Context) this.f.a;
            pendingIntentA = qof.a(context, 0, new Intent(context, (Class<?>) ShareLoggingBroadcastReceiver.class).putExtra("YTShare_Logging_Share_Intent_Endpoint_Byte_Array", ajwoVar3.toByteArray()), (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 134217728, 1);
            if (pendingIntentA == null) {
                throw new IllegalStateException("Failed to create pending intent.");
            }
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uriA);
        if (this.e.l(2, 45854523L, false)) {
            intent.addFlags(1);
        }
        intent.setType(str2);
        if (str3 != null) {
            intent.putExtra("android.intent.extra.TEXT", str3);
        }
        if (pendingIntentA == null) {
            afwl.m(this.b, Intent.createChooser(intent, null));
        } else {
            afwl.m(this.b, Intent.createChooser(intent, "", pendingIntentA.getIntentSender()));
        }
    }
}
