package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class esl implements ffm {
    final /* synthetic */ erj a;
    final /* synthetic */ List b;
    final /* synthetic */ fdn c;
    private boolean d;

    public esl(erj erjVar, List list, fdn fdnVar) {
        this.a = erjVar;
        this.b = list;
        this.c = fdnVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00e9  */
    @Override // defpackage.ffm
    public final /* synthetic */ Object a() throws Throwable {
        esl eslVar;
        boolean z;
        Context context;
        List list;
        ewv ewvVar;
        fbe fbeVar;
        fbi fbiVar;
        eua fbiVar2;
        eua fbeVar2;
        fbl fblVar;
        fbl fblVar2;
        if (this.d) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        this.d = true;
        try {
            erj erjVar = this.a;
            List list2 = this.b;
            fdn fdnVar = this.c;
            ewn ewnVar = erjVar.a;
            ewv ewvVar2 = erjVar.h;
            esc escVar = erjVar.b;
            Context applicationContext = escVar.getApplicationContext();
            dov dovVar = escVar.f;
            jqs jqsVar = new jqs();
            jqsVar.k(new fae());
            if (Build.VERSION.SDK_INT >= 27) {
                jqsVar.k(new fat());
            }
            Resources resources = applicationContext.getResources();
            List listC = jqsVar.c();
            fcc fccVar = new fcc(applicationContext, listC, ewnVar, ewvVar2);
            try {
                fbr fbrVar = new fbr(ewnVar, new fbo(2));
                fap fapVar = new fap(jqsVar.c(), resources.getDisplayMetrics(), ewnVar, ewvVar2, dovVar);
                fbl fblVar3 = null;
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        if (dovVar.m(erp.class)) {
                            context = applicationContext;
                            fbc fbcVar = new fbc(listC, dovVar.m(erz.class), ewvVar2, dovVar.m(erx.class), dovVar.m(erw.class));
                            list = listC;
                            ewvVar = ewvVar2;
                            fbl fblVar4 = new fbl(list, ewvVar, dovVar.m(erw.class), 1);
                            if (Build.VERSION.SDK_INT >= 35 && dovVar.m(ers.class)) {
                                fblVar3 = new fbl(context, 0);
                            }
                            fbeVar = new fbe(fapVar, 1);
                            fbiVar = new fbi(fapVar, ewvVar, 0);
                            fbiVar2 = fbcVar;
                            fbeVar2 = fblVar4;
                            fblVar = fblVar3;
                        } else {
                            context = applicationContext;
                            ewvVar = ewvVar2;
                            list = listC;
                            fbeVar2 = new fbe(fapVar, 1);
                            fbiVar2 = new fbi(fapVar, ewvVar, 0);
                            fblVar = null;
                            fbiVar = null;
                            fbeVar = null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        eslVar = this;
                        eslVar.d = z;
                        throw th;
                    }
                } else {
                    context = applicationContext;
                    ewvVar = ewvVar2;
                    list = listC;
                    fbeVar2 = new fbe(fapVar, 1);
                    fbiVar2 = new fbi(fapVar, ewvVar, 0);
                    fblVar = null;
                    fbiVar = null;
                    fbeVar = null;
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    jqsVar.h("Animation", InputStream.class, Drawable.class, new fbe(new pj(list, ewvVar), 3));
                    jqsVar.h("Animation", ByteBuffer.class, Drawable.class, new fbe(new pj(list, ewvVar), 2));
                }
                fca fcaVar = new fca(context);
                ezu ezuVar = new ezu(ewvVar);
                Context context2 = context;
                fcm fcmVar = new fcm(1);
                fcp fcpVar = new fcp(1);
                ContentResolver contentResolver = context2.getContentResolver();
                jqsVar.e(ByteBuffer.class, new exz());
                jqsVar.e(InputStream.class, new ezc(ewvVar));
                jqsVar.h("Bitmap", ByteBuffer.class, Bitmap.class, fbeVar2);
                if (fbeVar != null) {
                    jqsVar.h("Bitmap", ByteBuffer.class, Bitmap.class, fbeVar);
                }
                jqsVar.h("Bitmap", InputStream.class, Bitmap.class, fbiVar2);
                if (fbiVar != null) {
                    jqsVar.h("Bitmap", InputStream.class, Bitmap.class, fbiVar);
                }
                if (fblVar != 0) {
                    fblVar2 = fblVar;
                    jqsVar.j("legacy_prepend_all", Uri.class, Bitmap.class, fblVar2);
                    jqsVar.i(Uri.class, Uri.class, ezi.a);
                } else {
                    fblVar2 = fblVar;
                }
                if (euv.d()) {
                    jqsVar.h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new fbe(fapVar, 0));
                }
                List list3 = list;
                jqsVar.h("Bitmap", AssetFileDescriptor.class, Bitmap.class, new fbr(ewnVar, new fbo(1)));
                jqsVar.h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, fbrVar);
                ezi eziVar = ezi.a;
                jqsVar.g(Bitmap.class, Bitmap.class, eziVar);
                jqsVar.h("Bitmap", Bitmap.class, Bitmap.class, new fcb(1));
                jqsVar.f(Bitmap.class, ezuVar);
                jqsVar.h("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new ezs(resources, fbeVar2));
                jqsVar.h("BitmapDrawable", InputStream.class, BitmapDrawable.class, new ezs(resources, fbiVar2));
                jqsVar.h("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new ezs(resources, fbrVar));
                if (fblVar2 != null) {
                    jqsVar.j("legacy_prepend_all", Uri.class, BitmapDrawable.class, new ezs(resources, fblVar2));
                }
                jqsVar.f(BitmapDrawable.class, new ezt(ewnVar, ezuVar));
                ewv ewvVar3 = ewvVar;
                jqsVar.h("Animation", InputStream.class, fce.class, new fcl(list3, fccVar, ewvVar3));
                jqsVar.h("Animation", ByteBuffer.class, fce.class, fccVar);
                jqsVar.f(fce.class, new fcf());
                jqsVar.g(eta.class, eta.class, eziVar);
                jqsVar.h("Bitmap", eta.class, Bitmap.class, new fbe(ewnVar, 4));
                jqsVar.h("legacy_append", Uri.class, Drawable.class, fcaVar);
                jqsVar.h("legacy_append", Uri.class, Bitmap.class, new fbi(fcaVar, ewnVar, 1));
                jqsVar.l(new fbs());
                jqsVar.g(File.class, ByteBuffer.class, new exy(2));
                jqsVar.g(File.class, InputStream.class, new eyh(new eyk(0), 0));
                jqsVar.h("legacy_append", File.class, File.class, new fcb(2));
                jqsVar.g(File.class, ParcelFileDescriptor.class, new eyh(new eyk(1), 0));
                jqsVar.g(File.class, File.class, eziVar);
                jqsVar.l(new eur(ewvVar3));
                if (euv.d()) {
                    jqsVar.l(new euu());
                }
                eyd eydVar = new eyd(context2, 2);
                eyd eydVar2 = new eyd(context2, 1);
                eyd eydVar3 = new eyd(context2, 0);
                jqsVar.g(Integer.TYPE, InputStream.class, eydVar);
                jqsVar.g(Integer.class, InputStream.class, eydVar);
                jqsVar.g(Integer.TYPE, AssetFileDescriptor.class, eydVar2);
                jqsVar.g(Integer.class, AssetFileDescriptor.class, eydVar2);
                jqsVar.g(Integer.TYPE, Drawable.class, eydVar3);
                jqsVar.g(Integer.class, Drawable.class, eydVar3);
                jqsVar.g(Uri.class, InputStream.class, new eyh(context2, 3));
                jqsVar.g(Uri.class, AssetFileDescriptor.class, new eyh(context2, 2));
                ezb ezbVar = new ezb(resources, 3);
                ezb ezbVar2 = new ezb(resources, 0);
                ezb ezbVar3 = new ezb(resources, 2);
                jqsVar.g(Integer.class, Uri.class, ezbVar);
                jqsVar.g(Integer.TYPE, Uri.class, ezbVar);
                jqsVar.g(Integer.class, AssetFileDescriptor.class, ezbVar2);
                jqsVar.g(Integer.TYPE, AssetFileDescriptor.class, ezbVar2);
                jqsVar.g(Integer.class, InputStream.class, ezbVar3);
                jqsVar.g(Integer.TYPE, InputStream.class, ezbVar3);
                jqsVar.g(String.class, InputStream.class, new eyh(1));
                jqsVar.g(Uri.class, InputStream.class, new eyh(1));
                jqsVar.g(String.class, InputStream.class, new exy(5));
                jqsVar.g(String.class, ParcelFileDescriptor.class, new exy(4));
                jqsVar.g(String.class, AssetFileDescriptor.class, new exy(3));
                jqsVar.g(Uri.class, InputStream.class, new exu(context2.getAssets(), 0));
                jqsVar.g(Uri.class, AssetFileDescriptor.class, new exu(context2.getAssets(), 1));
                jqsVar.g(Uri.class, InputStream.class, new ezb(context2, 5));
                jqsVar.g(Uri.class, InputStream.class, new ezb(context2, 6));
                if (Build.VERSION.SDK_INT >= 29) {
                    jqsVar.g(Uri.class, InputStream.class, new ezl(context2, InputStream.class));
                    jqsVar.g(Uri.class, ParcelFileDescriptor.class, new ezl(context2, ParcelFileDescriptor.class));
                }
                boolean zM = dovVar.m(esa.class);
                jqsVar.g(Uri.class, InputStream.class, new ezf(contentResolver, zM, 2));
                jqsVar.g(Uri.class, ParcelFileDescriptor.class, new ezf(contentResolver, zM, 0));
                jqsVar.g(Uri.class, AssetFileDescriptor.class, new ezf(contentResolver, zM, 1));
                jqsVar.g(Uri.class, InputStream.class, new ezi(0));
                jqsVar.g(URL.class, InputStream.class, new ezi(2));
                jqsVar.g(Uri.class, File.class, new ezb(context2, 1));
                jqsVar.g(eyl.class, InputStream.class, new ezb(4));
                jqsVar.g(byte[].class, ByteBuffer.class, new exy(1));
                jqsVar.g(byte[].class, InputStream.class, new exy(0));
                jqsVar.g(Uri.class, Uri.class, eziVar);
                jqsVar.g(Drawable.class, Drawable.class, eziVar);
                jqsVar.h("legacy_append", Drawable.class, Drawable.class, new fcb(0));
                jqsVar.m(Bitmap.class, BitmapDrawable.class, new fcm(resources, 0));
                jqsVar.m(Bitmap.class, byte[].class, fcmVar);
                jqsVar.m(Drawable.class, byte[].class, new fcn(ewnVar, fcmVar, fcpVar));
                jqsVar.m(fce.class, byte[].class, fcpVar);
                fbr fbrVar2 = new fbr(ewnVar, new fbo(0));
                jqsVar.h("legacy_append", ByteBuffer.class, Bitmap.class, fbrVar2);
                jqsVar.h("legacy_append", ByteBuffer.class, BitmapDrawable.class, new ezs(resources, fbrVar2));
                ept.i(context2, erjVar, jqsVar, list2, fdnVar);
                this.d = false;
                return jqsVar;
            } catch (Throwable th2) {
                th = th2;
                eslVar = this;
                z = false;
                eslVar.d = z;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            eslVar = this;
        }
    }
}
