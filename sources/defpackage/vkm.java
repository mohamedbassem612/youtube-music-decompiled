package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vkm extends AsyncTask {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/creation/videoeffects/stickers/text/FetchFontsTask");
    public final CancellationSignal a = new CancellationSignal();
    private int c;
    private final vko d;
    private final zs e;
    private final zs f;

    protected vkm(zs zsVar, zs zsVar2, vko vkoVar) {
        this.f = zsVar;
        this.e = zsVar2;
        this.d = vkoVar;
    }

    private static final void a(Throwable th, String str) {
        agrf agrfVar = b;
        if (th == null) {
            ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/creation/videoeffects/stickers/text/FetchFontsTask", "logErrorToEcatcherAndLogcat", 139, "FetchFontsTask.java")).w("%s", str);
            zvp.a(zvn.b, zvm.M, "[ShortsCreation][Android][Edit] ".concat(str));
        } else {
            ((agrc) ((agrc) ((agrc) agrfVar.b()).j(th)).k("com/google/android/libraries/youtube/creation/videoeffects/stickers/text/FetchFontsTask", "logErrorToEcatcherAndLogcat", (char) 142, "FetchFontsTask.java")).w("%s", str);
            zvp.b(zvn.b, zvm.M, "[ShortsCreation][Android][Edit] ".concat(str), th);
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        Context context = ((Context[]) objArr)[0];
        zs zsVar = this.f;
        Iterator it = zsVar.G().iterator();
        while (it.hasNext()) {
            vkq vkqVarF = zsVar.F((auir) it.next());
            if (!vkqVarF.a().isPresent()) {
                Optional optional = vkqVarF.h;
                if (optional.isEmpty()) {
                    continue;
                } else {
                    try {
                        aami aamiVarD = aaq.d(context, this.a, new awy((String) optional.get(), R.array.com_google_android_gms_fonts_certs_yt));
                        if (isCancelled()) {
                            break;
                        }
                        axd[] axdVarArrD = aamiVarD.d();
                        if (axdVarArrD == null || axdVarArrD.length == 0) {
                            ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/creation/videoeffects/stickers/text/FetchFontsTask", "doInBackground", 95, "FetchFontsTask.java")).t("fetchFonts failed (empty result)");
                        } else {
                            axd axdVar = axdVarArrD[0];
                            int i = axdVar.e;
                            if (i == 0) {
                                Typeface typefaceB = aaq.b(context, this.a, axdVarArrD);
                                if (isCancelled()) {
                                    break;
                                }
                                if (typefaceB == null) {
                                    ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/creation/videoeffects/stickers/text/FetchFontsTask", "doInBackground", 110, "FetchFontsTask.java")).t("Failed to create Typeface.");
                                } else {
                                    Object obj = vkqVarF.m;
                                    Optional optionalOf = Optional.of(typefaceB);
                                    synchronized (obj) {
                                        vkqVarF.n = optionalOf;
                                    }
                                    vkqVarF.o = (Uri) axdVar.f;
                                    this.c++;
                                }
                            } else {
                                ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/creation/videoeffects/stickers/text/FetchFontsTask", "doInBackground", 100, "FetchFontsTask.java")).u("fetchFonts result is not OK. (%d)", i);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
        }
        try {
            vko vkoVar = this.d;
            agkz<vkq> agkzVarN = agkz.n(((EnumMap) this.f.a).values());
            File file = vkoVar.c;
            if (file.exists()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.isFile()) {
                            file2.delete();
                        }
                    }
                }
            } else {
                file.mkdirs();
            }
            for (vkq vkqVar : agkzVarN) {
                Uri uri = vkqVar.o;
                if (uri != null) {
                    File file3 = new File(file, String.valueOf(vkqVar.e.name()).concat(".font"));
                    try {
                        Context context2 = vkoVar.b;
                        qok qokVar = qok.a;
                        vbq vbqVar = new vbq();
                        vbqVar.f();
                        vbqVar.a = true;
                        vbqVar.e(new qoi());
                        InputStream inputStreamC = qol.c(context2, uri, vbqVar.d());
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                            try {
                                agyi.a(inputStreamC, fileOutputStream);
                                fileOutputStream.close();
                                if (inputStreamC != null) {
                                    inputStreamC.close();
                                }
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            if (inputStreamC == null) {
                                throw th3;
                            }
                            try {
                                inputStreamC.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException e) {
                        ((agrc) ((agrc) ((agrc) vko.a.b()).j(e)).k("com/google/android/libraries/youtube/creation/videoeffects/stickers/text/FontCachesController", "saveFontsInCaches", '`', "FontCachesController.java")).w("%s", "Write font files failed");
                        throw new IOException("Write font files failed", e);
                    }
                }
            }
            if (this.c < ((agpi) vkn.e).d - 1) {
                a(null, "Not all fonts were loaded: " + this.c);
            }
            if (this.c > 0) {
                publishProgress(new Void[0]);
            }
        } catch (IOException e2) {
            a(e2, "Failed to save fonts in cache.");
        }
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object[] objArr) {
        aqi aqiVar = (aqi) ((AtomicReference) this.e.a).get();
        if (aqiVar != null) {
            aqiVar.b(Boolean.TRUE);
        }
    }
}
