package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.MediaStore;
import app.rive.semantics.SemanticState;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.util.Optional;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gxa extends gut {
    private static final agrf b = agrf.h("com/google/android/apps/youtube/music/command/SaveImageToDeviceEndpointCommandResolver");
    public final vxe a;
    private final Context c;
    private final Handler d;
    private final jkx e;
    private final xgm f;
    private final awmd g;
    private final vxz h;

    public gxa(Context context, vxe vxeVar, Handler handler, jkx jkxVar, xgm xgmVar, vxz vxzVar, awmd awmdVar) {
        context.getClass();
        this.c = context;
        vxeVar.getClass();
        this.a = vxeVar;
        this.d = handler;
        jkxVar.getClass();
        this.e = jkxVar;
        xgmVar.getClass();
        this.f = xgmVar;
        this.h = vxzVar;
        this.g = awmdVar;
    }

    private final Bitmap f(apmb apmbVar) throws Throwable {
        Throwable e;
        Bitmap bitmap;
        Throwable th;
        Bitmap bitmapDecodeStream;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                URL url = new URI(apmbVar.c == 1 ? (String) apmbVar.d : "").toURL();
                if (this.h.m(14, 45627566L)) {
                    TrafficStats.setThreadStatsTag(tok.SAVE_IMAGE_TO_DEVICE.az);
                }
                httpURLConnection = (HttpURLConnection) ((CronetEngine) this.g.io()).openConnection(url);
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStream);
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                    httpURLConnection2 = httpURLConnection;
                    bitmap = null;
                    ((agrc) ((agrc) b.b().i(agso.a, "SaveImageToDeviceCmdRes")).k("com/google/android/apps/youtube/music/command/SaveImageToDeviceEndpointCommandResolver", "downloadImage", 239, "SaveImageToDeviceEndpointCommandResolver.java")).t("Failed to download image.");
                    zvp.b(zvn.a, zvm.a, "SaveImageToDeviceCommandResolver: Unable to download the image", e);
                    HttpURLConnection httpURLConnection3 = httpURLConnection2;
                    bitmapDecodeStream = bitmap;
                    httpURLConnection = httpURLConnection3;
                } catch (URISyntaxException e3) {
                    e = e3;
                    httpURLConnection2 = httpURLConnection;
                    bitmap = null;
                    ((agrc) ((agrc) b.b().i(agso.a, "SaveImageToDeviceCmdRes")).k("com/google/android/apps/youtube/music/command/SaveImageToDeviceEndpointCommandResolver", "downloadImage", 239, "SaveImageToDeviceEndpointCommandResolver.java")).t("Failed to download image.");
                    zvp.b(zvn.a, zvm.a, "SaveImageToDeviceCommandResolver: Unable to download the image", e);
                    HttpURLConnection httpURLConnection4 = httpURLConnection2;
                    bitmapDecodeStream = bitmap;
                    httpURLConnection = httpURLConnection4;
                } catch (Throwable th4) {
                    th = th4;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (IOException | URISyntaxException e4) {
            e = e4;
            bitmap = null;
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return bitmapDecodeStream;
    }

    private final Uri g(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", str);
        contentValues.put("description", str2);
        return this.c.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
    }

    private static final Bitmap.CompressFormat h(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 3 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apmc.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        apmb apmbVar = (apmb) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        this.f.hB().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(ajwoVar.c, (amud) null), null);
        if (avg.c(this.c, jkx.b()) == 0 || Build.VERSION.SDK_INT >= 29) {
            e(apmbVar, map);
        } else {
            this.e.e(Optional.of(new gwz(this, apmbVar, map)));
        }
    }

    public final void d(boolean z, ajwo ajwoVar, Map map) {
        if (z) {
            this.d.post(new gwb((Object) this, (Object) ajwoVar, (Object) map, 2, (byte[]) null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:155:0x02ba  */
    public final void e(apmb apmbVar, Map map) {
        Bitmap bitmapF;
        String str;
        SecurityException securityException;
        boolean z;
        ajwo ajwoVar;
        int iAS;
        int i = apmbVar.c;
        if (i == 9) {
            String str2 = (String) apmbVar.d;
            Context context = this.c;
            File file = new File(new File(context.getCacheDir(), "image_share"), str2);
            if (!file.exists()) {
                ((agrc) ((agrc) b.b().i(agso.a, "SaveImageToDeviceCmdRes")).k("com/google/android/apps/youtube/music/command/SaveImageToDeviceEndpointCommandResolver", "maybeMoveImageToExternalStorage", 262, "SaveImageToDeviceEndpointCommandResolver.java")).t("Failed to find image from app internal storage.");
                z = (apmbVar.b & SemanticState.Focused) != 0;
                ajwo ajwoVar2 = apmbVar.l;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                d(z, ajwoVar2, map);
                return;
            }
            Uri uriG = g(str2, "Image for lyrics share.");
            if (uriG == null) {
                z = (apmbVar.b & SemanticState.Focused) != 0;
                ajwo ajwoVar3 = apmbVar.l;
                if (ajwoVar3 == null) {
                    ajwoVar3 = ajwo.a;
                }
                d(z, ajwoVar3, map);
                return;
            }
            try {
                OutputStream outputStreamD = qol.d(context, uriG, "w", qok.a);
                try {
                    Files.copy(FileRetargetClass.toPath(file), outputStreamD);
                    if (outputStreamD != null) {
                        outputStreamD.close();
                    }
                    z = (apmbVar.b & 64) != 0;
                    ajwo ajwoVar4 = apmbVar.k;
                    if (ajwoVar4 == null) {
                        ajwoVar4 = ajwo.a;
                    }
                    d(z, ajwoVar4, map);
                    return;
                } catch (Throwable th) {
                    if (outputStreamD == null) {
                        throw th;
                    }
                    try {
                        outputStreamD.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException unused) {
                agrf agrfVar = b;
                agru agruVarB = agrfVar.b();
                agrx agrxVar = agso.a;
                ((agrc) ((agrc) agruVarB.i(agrxVar, "SaveImageToDeviceCmdRes")).k("com/google/android/apps/youtube/music/command/SaveImageToDeviceEndpointCommandResolver", "moveImageToExternalStorage", 287, "SaveImageToDeviceEndpointCommandResolver.java")).t("Failed to move image to external storage.");
                ((agrc) ((agrc) agrfVar.b().i(agrxVar, "SaveImageToDeviceCmdRes")).k("com/google/android/apps/youtube/music/command/SaveImageToDeviceEndpointCommandResolver", "maybeMoveImageToExternalStorage", 274, "SaveImageToDeviceEndpointCommandResolver.java")).t("Failed to copy image to external storage.");
                z = (apmbVar.b & SemanticState.Focused) != 0;
                ajwo ajwoVar5 = apmbVar.l;
                if (ajwoVar5 == null) {
                    ajwoVar5 = ajwo.a;
                }
                d(z, ajwoVar5, map);
                return;
            }
        }
        if (i != 8) {
            ((agrc) ((agrc) b.b().i(agso.a, "SaveImageToDeviceCmdRes")).k("com/google/android/apps/youtube/music/command/SaveImageToDeviceEndpointCommandResolver", "runSaveImageToDevice", 153, "SaveImageToDeviceEndpointCommandResolver.java")).t("Image bytes must be supplied.");
        }
        int i2 = apmbVar.c;
        if (i2 == 8) {
            bitmapF = nsj.m(i2 == 8 ? (aigj) apmbVar.d : aigj.d);
        } else {
            bitmapF = f(apmbVar);
        }
        if (bitmapF == null) {
            ((agrc) ((agrc) b.b().i(agso.a, "SaveImageToDeviceCmdRes")).k("com/google/android/apps/youtube/music/command/SaveImageToDeviceEndpointCommandResolver", "runSaveImageToDevice", 158, "SaveImageToDeviceEndpointCommandResolver.java")).t("Failed to create image bitmap");
            z = (apmbVar.b & SemanticState.Focused) != 0;
            ajwo ajwoVar6 = apmbVar.l;
            if (ajwoVar6 == null) {
                ajwoVar6 = ajwo.a;
            }
            d(z, ajwoVar6, map);
            return;
        }
        int i3 = apmbVar.b;
        if ((i3 & 1) == 0 || (iAS = a.aS(apmbVar.e)) == 0 || iAS != 3) {
            if ((i3 & 2) != 0) {
                try {
                    str = apmbVar.f;
                } catch (SecurityException e) {
                    securityException = e;
                    ((agrc) ((agrc) ((agrc) b.b().i(agso.a, "SaveImageToDeviceCmdRes")).j(securityException)).k("com/google/android/apps/youtube/music/command/SaveImageToDeviceEndpointCommandResolver", "runSaveImageToDevice", (char) 190, "SaveImageToDeviceEndpointCommandResolver.java")).t("Unable to add image to Media Store.");
                    z = (apmbVar.b & SemanticState.Focused) != 0;
                    ajwoVar = apmbVar.l;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    d(z, ajwoVar, map);
                    return;
                }
            } else {
                str = null;
            }
            try {
                Uri uriG2 = g(str, (i3 & 4) != 0 ? apmbVar.g : null);
                if (uriG2 == null) {
                    ((agrc) ((agrc) b.b().i(agso.a, "SaveImageToDeviceCmdRes")).k("com/google/android/apps/youtube/music/command/SaveImageToDeviceEndpointCommandResolver", "runSaveImageToDevice", 185, "SaveImageToDeviceEndpointCommandResolver.java")).t("Unable to add image to Media Store.");
                    boolean z2 = (apmbVar.b & SemanticState.Focused) != 0;
                    ajwo ajwoVar7 = apmbVar.l;
                    if (ajwoVar7 == null) {
                        ajwoVar7 = ajwo.a;
                    }
                    d(z2, ajwoVar7, map);
                    return;
                }
                try {
                    int iAV = a.aV(apmbVar.i);
                    if (iAV == 0) {
                        iAV = 1;
                    }
                    int i4 = (apmbVar.b & 32) != 0 ? apmbVar.j : 100;
                    OutputStream outputStreamD2 = qol.d(this.c, uriG2, "wt", qok.a);
                    outputStreamD2.getClass();
                    if (!bitmapF.compress(h(iAV), i4, outputStreamD2)) {
                        throw new Exception();
                    }
                } catch (Exception e2) {
                    ((agrc) ((agrc) ((agrc) b.b().i(agso.a, "SaveImageToDeviceCmdRes")).j(e2)).k("com/google/android/apps/youtube/music/command/SaveImageToDeviceEndpointCommandResolver", "runSaveImageToDevice", (char) 201, "SaveImageToDeviceEndpointCommandResolver.java")).t("Unable to write image to storage.");
                    this.c.getContentResolver().delete(uriG2, null, null);
                    z = (apmbVar.b & SemanticState.Focused) != 0;
                    ajwo ajwoVar8 = apmbVar.l;
                    if (ajwoVar8 == null) {
                        ajwoVar8 = ajwo.a;
                    }
                    d(z, ajwoVar8, map);
                    return;
                }
            } catch (SecurityException e3) {
                securityException = e3;
                ((agrc) ((agrc) ((agrc) b.b().i(agso.a, "SaveImageToDeviceCmdRes")).j(securityException)).k("com/google/android/apps/youtube/music/command/SaveImageToDeviceEndpointCommandResolver", "runSaveImageToDevice", (char) 190, "SaveImageToDeviceEndpointCommandResolver.java")).t("Unable to add image to Media Store.");
                if ((apmbVar.b & SemanticState.Focused) != 0) {
                }
                ajwoVar = apmbVar.l;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                d(z, ajwoVar, map);
                return;
            }
        } else {
            File file2 = new File(this.c.getCacheDir(), "image_share");
            file2.mkdirs();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(file2, apmbVar.h));
                try {
                    int iAV2 = a.aV(apmbVar.i);
                    if (iAV2 == 0) {
                        iAV2 = 1;
                    }
                    bitmapF.compress(h(iAV2), 100, fileOutputStream);
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    try {
                        fileOutputStream.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (IOException e4) {
                ((agrc) ((agrc) ((agrc) b.b().i(agso.a, "SaveImageToDeviceCmdRes")).j(e4)).k("com/google/android/apps/youtube/music/command/SaveImageToDeviceEndpointCommandResolver", "runSaveImageToDevice", (char) 174, "SaveImageToDeviceEndpointCommandResolver.java")).t("Unable to save image to share directory.");
                z = (apmbVar.b & SemanticState.Focused) != 0;
                ajwo ajwoVar9 = apmbVar.l;
                if (ajwoVar9 == null) {
                    ajwoVar9 = ajwo.a;
                }
                d(z, ajwoVar9, map);
                return;
            }
        }
        z = (apmbVar.b & 64) != 0;
        ajwo ajwoVar10 = apmbVar.k;
        if (ajwoVar10 == null) {
            ajwoVar10 = ajwo.a;
        }
        d(z, ajwoVar10, map);
    }
}
