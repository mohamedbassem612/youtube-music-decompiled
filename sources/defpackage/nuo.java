package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.View;
import android.webkit.MimeTypeMap;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class nuo {
    public nuo(byte[] bArr) {
    }

    public static /* synthetic */ void a(Object obj) throws Exception {
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (obj instanceof ExecutorService) {
            a.ar((ExecutorService) obj);
            return;
        }
        if (obj instanceof TypedArray) {
            ((TypedArray) obj).recycle();
            return;
        }
        if (obj instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) obj).release();
            return;
        }
        if (obj instanceof MediaDrm) {
            ((MediaDrm) obj).release();
        } else if (obj instanceof DrmManagerClient) {
            ((DrmManagerClient) obj).release();
        } else {
            if (!(obj instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) obj).release();
        }
    }

    public static int b(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? 0 : 3;
        }
        return 2;
    }

    public static long c(int i) {
        return i - 1000;
    }

    public static int d(long j) {
        return ((int) j) + 1000;
    }

    public static aqmr e(aigu aiguVar) {
        aihf aihfVarCreateBuilder = aqmr.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aikw.f(aiguVar);
        long jD = a.d(aext.w(aiguVar.b, 1000000000L), aiguVar.c);
        aihfVarCreateBuilder.copyOnWrite();
        aqmr aqmrVar = (aqmr) aihfVarCreateBuilder.instance;
        aqmrVar.b |= 1;
        aqmrVar.c = jD;
        aihfVarCreateBuilder.copyOnWrite();
        aqmr aqmrVar2 = (aqmr) aihfVarCreateBuilder.instance;
        aqmrVar2.b |= 2;
        aqmrVar2.d = 1000000000L;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        return (aqmr) aihnVarBuild;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    public static aqkh f(aqkh aqkhVar) {
        int iAV;
        boolean z;
        aihf builder = aqkhVar.toBuilder();
        builder.getClass();
        int i = aqkhVar.b;
        if ((i & 1) == 0 || (iAV = a.aV(aqkhVar.c)) == 0) {
            iAV = 2;
        }
        if (iAV == 2) {
            builder.copyOnWrite();
            aqkh aqkhVar2 = (aqkh) builder.instance;
            aqkhVar2.e = null;
            aqkhVar2.b &= -5;
            builder.copyOnWrite();
            aqkh aqkhVar3 = (aqkh) builder.instance;
            aqkhVar3.b &= -9;
            aqkhVar3.f = 0.0f;
        } else {
            boolean z2 = false;
            if ((i & 4) == 0) {
                z = false;
            } else {
                ajwe ajweVar = aqkhVar.e;
                if (ajweVar == null) {
                    ajweVar = ajwe.a;
                }
                if (ajweVar.f == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if ((aqkhVar.b & 8) != 0 && aqkhVar.f == 0.0f) {
                z2 = true;
            }
            if ((z || z2) && iAV == 4) {
                builder.copyOnWrite();
                aqkh aqkhVar4 = (aqkh) builder.instance;
                aqkhVar4.c = 1;
                aqkhVar4.b |= 1;
                builder.copyOnWrite();
                aqkh aqkhVar5 = (aqkh) builder.instance;
                aqkhVar5.e = null;
                aqkhVar5.b &= -5;
                builder.copyOnWrite();
                aqkh aqkhVar6 = (aqkh) builder.instance;
                aqkhVar6.b &= -9;
                aqkhVar6.f = 0.0f;
            }
        }
        aihn aihnVarBuild = builder.build();
        aihnVarBuild.getClass();
        return (aqkh) aihnVarBuild;
    }

    public static ajwe g(int i) {
        aihf aihfVarCreateBuilder = ajwe.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        ajwe ajweVar = (ajwe) aihfVarCreateBuilder.instance;
        ajweVar.b |= 8;
        ajweVar.f = ((i >> 24) & 255) / 255.0f;
        aihfVarCreateBuilder.copyOnWrite();
        ajwe ajweVar2 = (ajwe) aihfVarCreateBuilder.instance;
        ajweVar2.b |= 1;
        ajweVar2.c = ((i >> 16) & 255) / 255.0f;
        aihfVarCreateBuilder.copyOnWrite();
        ajwe ajweVar3 = (ajwe) aihfVarCreateBuilder.instance;
        ajweVar3.b |= 2;
        ajweVar3.d = ((i >> 8) & 255) / 255.0f;
        aihfVarCreateBuilder.copyOnWrite();
        ajwe ajweVar4 = (ajwe) aihfVarCreateBuilder.instance;
        ajweVar4.b |= 4;
        ajweVar4.e = (i & 255) / 255.0f;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        return (ajwe) aihnVarBuild;
    }

    public static boolean h(cc ccVar) {
        if (ccVar.getActivity() == null || ccVar.getActivity().isDestroyed() || ccVar.getActivity().isFinishing() || ccVar.isDetached() || ccVar.isRemoving() || !ccVar.isAdded()) {
            return false;
        }
        return ccVar.isResumed() || ccVar.getActivity().isInMultiWindowMode();
    }

    public static boolean i(Context context) {
        return ((float) twm.g(context)) / ((float) twm.i(context)) > 1.9f;
    }

    public static agkj j(Map map, Object obj, Object obj2) {
        agkh agkhVarF = agkj.f(((agpn) map).d + 1);
        agkhVarF.i(map);
        agkhVarF.e(obj, obj2);
        return agkhVarF.d(false);
    }

    public static String k(Context context, Uri uri) {
        if (context != null) {
            String type = context.getContentResolver().getType(uri);
            if (type != null) {
                return type;
            }
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
            if (fileExtensionFromUrl != null) {
                return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase(Locale.ROOT));
            }
        }
        return null;
    }

    public static boolean l(String str) {
        return "image/gif".equals(str) || "image/webp".equals(str);
    }

    public static boolean m(Context context, Uri uri) {
        return l(k(context, uri));
    }

    public static void n(File file, File file2) throws Throwable {
        Throwable th;
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary;
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        FileChannel fileChannel = null;
        try {
            FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary2 = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
            try {
                fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel());
                try {
                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.transferFrom(fileChannelConvertMaybeLegacyFileChannelFromLibrary2, 0L, fileChannelConvertMaybeLegacyFileChannelFromLibrary2.size());
                    if (fileChannelConvertMaybeLegacyFileChannelFromLibrary2 != null) {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary2.close();
                    }
                    if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = fileChannelConvertMaybeLegacyFileChannelFromLibrary2;
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (fileChannelConvertMaybeLegacyFileChannelFromLibrary == null) {
                        throw th;
                    }
                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileChannelConvertMaybeLegacyFileChannelFromLibrary = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileChannelConvertMaybeLegacyFileChannelFromLibrary = null;
        }
    }

    public static double o(PointF pointF, PointF pointF2) {
        ujr ujrVarA = ujr.a(pointF, pointF2);
        float f = ujrVarA.a;
        float f2 = ujrVarA.b;
        if (f == 0.0f) {
            return f2 > 0.0f ? 1.5707963267948966d : 4.71238898038469d;
        }
        double dAtan = Math.atan(f2 / f);
        return f <= 0.0f ? dAtan + 3.141592653589793d : dAtan;
    }

    public static float p(PointF pointF, PointF pointF2) {
        return (float) Math.hypot(pointF2.x - pointF.x, pointF2.y - pointF.y);
    }

    public static PointF q(PointF pointF, PointF pointF2) {
        return new PointF((pointF.x + pointF2.x) / 2.0f, (pointF.y + pointF2.y) / 2.0f);
    }

    public static Bitmap r(Context context, Uri uri) {
        return adhx.c(MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri), context.getContentResolver(), uri);
    }

    public static void s(View... viewArr) {
        for (View view : viewArr) {
            if (view != null && (view.getVisibility() != 0 || view.getAlpha() != 1.0f)) {
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(1.0f).setDuration(100L).start();
            }
        }
    }

    public static void t(int i, View... viewArr) {
        int i2 = 4;
        if (i != 4) {
            if (i != 8) {
                return;
            } else {
                i = 8;
            }
        }
        for (View view : viewArr) {
            if (view != null && view.getVisibility() != i) {
                view.animate().cancel();
                view.animate().alpha(0.0f).setDuration(100L).withEndAction(new rir(view, i, i2)).start();
            }
        }
    }

    public static void u(avju avjuVar, uhz uhzVar, uhz uhzVar2, float f) {
        if (uhzVar2.a() < 0.001f || uhzVar2.a() >= uhzVar.a()) {
            return;
        }
        float f2 = uhzVar2.b;
        float f3 = uhzVar2.c;
        float f4 = uhzVar.b;
        int i = ((f2 - f4) > f ? 1 : ((f2 - f4) == f ? 0 : -1));
        if (i < 0) {
            f2 = f4;
        }
        int i2 = i >>> 31;
        float f5 = uhzVar.c;
        int i3 = ((f5 - f3) > f ? 1 : ((f5 - f3) == f ? 0 : -1));
        int i4 = (i3 ^ (-1)) >>> 31;
        if (i3 < 0) {
            f3 = f5;
        }
        if (((i4 ^ 1) | i2) != 0) {
            PriorityQueue priorityQueue = (PriorityQueue) avjuVar.a;
            priorityQueue.remove(uhzVar2);
            uhzVar2.b = f2;
            uhzVar2.c = f3;
            priorityQueue.add(uhzVar2);
        }
    }
}
