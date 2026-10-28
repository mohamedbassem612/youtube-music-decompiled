package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class ixt {
    public ixt() {
    }

    public static ajwo A() {
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = ajfd.a;
        aihf aihfVarCreateBuilder = ajfc.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajfc ajfcVar = (ajfc) aihfVarCreateBuilder.instance;
        ajfcVar.b |= 8;
        ajfcVar.d = "music_settings_offline";
        aihhVar.e(aihlVar, (ajfc) aihfVarCreateBuilder.build());
        aihl aihlVar2 = aoaq.b;
        aihf aihfVarCreateBuilder2 = aoar.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aoar aoarVar = (aoar) aihfVarCreateBuilder2.instance;
        aoarVar.b |= 2;
        aoarVar.d = 21412;
        aihhVar.e(aihlVar2, (aoar) aihfVarCreateBuilder2.build());
        return (ajwo) aihhVar.build();
    }

    public static ajwo B(String str) {
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = ajmu.b;
        aihf aihfVarCreateBuilder = ajmu.a.createBuilder();
        aihf aihfVarCreateBuilder2 = ajmv.a.createBuilder();
        aihf aihfVarCreateBuilder3 = apho.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        apho aphoVar = (apho) aihfVarCreateBuilder3.instance;
        str.getClass();
        aphoVar.c |= 1;
        aphoVar.d = str;
        aihfVarCreateBuilder3.copyOnWrite();
        apho aphoVar2 = (apho) aihfVarCreateBuilder3.instance;
        aphoVar2.c |= 2;
        aphoVar2.e = true;
        aihfVarCreateBuilder2.copyOnWrite();
        ajmv ajmvVar = (ajmv) aihfVarCreateBuilder2.instance;
        apho aphoVar3 = (apho) aihfVarCreateBuilder3.build();
        aphoVar3.getClass();
        ajmvVar.c = aphoVar3;
        ajmvVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        ajmu ajmuVar = (ajmu) aihfVarCreateBuilder.instance;
        ajmv ajmvVar2 = (ajmv) aihfVarCreateBuilder2.build();
        ajmvVar2.getClass();
        ajmuVar.d = ajmvVar2;
        ajmuVar.c |= 1;
        aihhVar.e(aihlVar, (ajmu) aihfVarCreateBuilder.build());
        return (ajwo) aihhVar.build();
    }

    public static ajwo C(ajwo ajwoVar, xgj xgjVar, xgn xgnVar) {
        aihf aihfVarCreateBuilder = aoar.a.createBuilder();
        String strI = xgnVar.i();
        aihfVarCreateBuilder.copyOnWrite();
        aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
        strI.getClass();
        aoarVar.b |= 1;
        aoarVar.c = strI;
        if (ajwoVar.c.E()) {
            argn argnVar = xgjVar.a;
            int i = argnVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            aoar aoarVar2 = (aoar) aihfVarCreateBuilder.instance;
            aoarVar2.b |= 2;
            aoarVar2.d = i;
            int i2 = argnVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            aoar aoarVar3 = (aoar) aihfVarCreateBuilder.instance;
            aoarVar3.b |= 4;
            aoarVar3.e = i2;
        }
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        aihhVar.e(aoaq.b, (aoar) aihfVarCreateBuilder.build());
        return (ajwo) aihhVar.build();
    }

    public static CommandOuterClass$Command D() {
        aihh aihhVar = (aihh) CommandOuterClass$Command.a.createBuilder();
        aihhVar.e(almz.a, vxh.a("FEmusic_library_landing"));
        return (CommandOuterClass$Command) aihhVar.build();
    }

    public static CommandOuterClass$Command E(String str) {
        aihh aihhVar = (aihh) CommandOuterClass$Command.a.createBuilder();
        aihhVar.e(almz.a, B(str));
        return (CommandOuterClass$Command) aihhVar.build();
    }

    public static void F(aihf aihfVar, List list, String str) {
        aihf aihfVarCreateBuilder = ajta.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajta ajtaVar = (ajta) aihfVarCreateBuilder.instance;
        ajtaVar.b |= 32;
        ajtaVar.e = true;
        int i = 7;
        int i2 = 4;
        if (Collection.EL.stream(list).anyMatch(new iui(17))) {
            aihf aihfVarCreateBuilder2 = ajtb.a.createBuilder();
            aihf aihfVarCreateBuilder3 = ajsy.a.createBuilder();
            aihf aihfVarCreateBuilder4 = ajsz.a.createBuilder();
            aihfVarCreateBuilder4.copyOnWrite();
            ajsz ajszVar = (ajsz) aihfVarCreateBuilder4.instance;
            ajszVar.c = 16;
            ajszVar.b |= 1;
            aihfVarCreateBuilder3.copyOnWrite();
            ajsy ajsyVar = (ajsy) aihfVarCreateBuilder3.instance;
            ajsz ajszVar2 = (ajsz) aihfVarCreateBuilder4.build();
            ajszVar2.getClass();
            ajsyVar.e = ajszVar2;
            ajsyVar.b |= 1;
            ajwo ajwoVarB = B(str);
            aihfVarCreateBuilder3.copyOnWrite();
            ajsy ajsyVar2 = (ajsy) aihfVarCreateBuilder3.instance;
            ajwoVarB.getClass();
            ajsyVar2.g = ajwoVarB;
            ajsyVar2.b |= 4;
            aihh aihhVar = (aihh) alja.a.createBuilder();
            aliz alizVar = aliz.CLOSE;
            aihhVar.copyOnWrite();
            alja aljaVar = (alja) aihhVar.instance;
            aljaVar.c = alizVar.yN;
            aljaVar.b |= 1;
            aihfVarCreateBuilder3.copyOnWrite();
            ajsy ajsyVar3 = (ajsy) aihfVarCreateBuilder3.instance;
            alja aljaVar2 = (alja) aihhVar.build();
            aljaVar2.getClass();
            ajsyVar3.d = aljaVar2;
            ajsyVar3.c = 7;
            ajsy ajsyVar4 = (ajsy) aihfVarCreateBuilder3.build();
            aihfVarCreateBuilder2.copyOnWrite();
            ajtb ajtbVar = (ajtb) aihfVarCreateBuilder2.instance;
            ajsyVar4.getClass();
            ajtbVar.c = ajsyVar4;
            ajtbVar.b = 91394224;
            aihfVarCreateBuilder.bn(aihfVarCreateBuilder2);
        }
        Iterable iterable = (Iterable) Collection.EL.stream(list).map(new iuk(str, i2)).collect(Collectors.toCollection(new ieu(i)));
        aihfVarCreateBuilder.copyOnWrite();
        ajta ajtaVar2 = (ajta) aihfVarCreateBuilder.instance;
        ajtaVar2.a();
        aifs.addAll(iterable, ajtaVar2.c);
        aihf aihfVarCreateBuilder5 = apoo.a.createBuilder();
        aihfVarCreateBuilder5.copyOnWrite();
        apoo apooVar = (apoo) aihfVarCreateBuilder5.instance;
        ajta ajtaVar3 = (ajta) aihfVarCreateBuilder.build();
        ajtaVar3.getClass();
        apooVar.c = ajtaVar3;
        apooVar.b = 90823135;
        aihfVar.copyOnWrite();
        apoq apoqVar = (apoq) aihfVar.instance;
        apoo apooVar2 = (apoo) aihfVarCreateBuilder5.build();
        apoq apoqVar2 = apoq.a;
        apooVar2.getClass();
        apoqVar.h = apooVar2;
        apoqVar.c |= 2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0056 A[PHI: r1 r2
      0x0056: PHI (r1v2 int) = (r1v1 int), (r1v3 int), (r1v3 int), (r1v4 int), (r1v4 int) binds: [B:25:0x003e, B:27:0x0044, B:29:0x0049, B:31:0x004f, B:33:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r2v1 int) = (r2v0 int), (r2v0 int), (r2v3 int), (r2v3 int), (r2v4 int) binds: [B:25:0x003e, B:27:0x0044, B:29:0x0049, B:31:0x004f, B:33:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    static jiv G(int i) {
        int i2;
        int i3;
        if (i >= 2880) {
            i2 = SemanticState.Hidden;
            i3 = 13;
        } else {
            int i4 = SemanticState.Focused;
            if (i >= 2560) {
                i3 = 12;
            } else if (i >= 2320) {
                i3 = 11;
            } else if (i >= 1920) {
                i3 = 9;
            } else if (i >= 1600) {
                i2 = 104;
                i3 = 8;
            } else if (i >= 1440) {
                i2 = 96;
                i3 = 7;
            } else {
                i4 = 80;
                if (i >= 1280) {
                    i3 = 6;
                } else {
                    int i5 = 5;
                    if (i < 1024) {
                        i4 = 64;
                        if (i < 960) {
                            i5 = 4;
                            if (i < 840) {
                                i4 = 48;
                                if (i < 720) {
                                    i5 = 3;
                                    if (i >= 600) {
                                        i2 = i4;
                                    } else if (i >= 480) {
                                        i2 = 24;
                                    } else {
                                        i4 = 16;
                                        i3 = i >= 280 ? 2 : 1;
                                    }
                                } else {
                                    i2 = i4;
                                }
                            } else {
                                i2 = i4;
                            }
                        } else {
                            i2 = i4;
                        }
                    } else {
                        i2 = i4;
                    }
                    i3 = i5;
                }
            }
            i2 = i4;
        }
        return new jiv(i3, i2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    public static aihf H(Context context, boolean z) {
        int iH;
        int iF;
        jiv jivVarG;
        jiv jivVarG2;
        jiv jivVarG3;
        jiv jivVarG4;
        agrf agrfVar = twm.a;
        if (yno.H(context)) {
            iH = twm.f(context);
            iF = twm.h(context);
        } else {
            iH = twm.h(context);
            iF = twm.f(context);
        }
        jiv jivVarG5 = G(iH);
        jiv jivVarG6 = G(iF);
        if (z) {
            int iK = twm.k(context);
            if (iK == 1 || iK == 2) {
                jivVarG = G(iH << 1);
                jivVarG2 = G(iF << 1);
            } else if (iK == 3 || iK == 4) {
                jivVarG3 = G(iH / 2);
                jivVarG4 = G(iF / 2);
                jivVarG5 = jivVarG3;
                jivVarG = jivVarG5;
                jivVarG6 = jivVarG4;
                jivVarG2 = jivVarG6;
            } else {
                jivVarG = jivVarG5;
                jivVarG2 = jivVarG6;
            }
        } else {
            int iOrdinal = tym.H(context, false).ordinal();
            if (iOrdinal == 1) {
                jivVarG = G(iH << 1);
                jivVarG2 = G(iF << 1);
            } else if (iOrdinal != 2) {
                jivVarG = jivVarG5;
                jivVarG2 = jivVarG6;
            } else {
                jivVarG3 = G(iH / 2);
                jivVarG4 = G(iF / 2);
                jivVarG5 = jivVarG3;
                jivVarG = jivVarG5;
                jivVarG6 = jivVarG4;
                jivVarG2 = jivVarG6;
            }
        }
        aihf aihfVarCreateBuilder = alfr.a.createBuilder();
        aihf aihfVarCreateBuilder2 = alfp.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        alfp alfpVar = (alfp) aihfVarCreateBuilder2.instance;
        alfpVar.b |= 1;
        alfpVar.c = jivVarG5.a;
        aihfVarCreateBuilder2.copyOnWrite();
        alfp alfpVar2 = (alfp) aihfVarCreateBuilder2.instance;
        alfpVar2.b |= 2;
        alfpVar2.d = jivVarG.a;
        aihfVarCreateBuilder2.copyOnWrite();
        alfp alfpVar3 = (alfp) aihfVarCreateBuilder2.instance;
        alfpVar3.b |= 4;
        alfpVar3.e = jivVarG6.a;
        aihfVarCreateBuilder2.copyOnWrite();
        alfp alfpVar4 = (alfp) aihfVarCreateBuilder2.instance;
        alfpVar4.b |= 8;
        alfpVar4.f = jivVarG2.a;
        aihfVarCreateBuilder.copyOnWrite();
        alfr alfrVar = (alfr) aihfVarCreateBuilder.instance;
        alfp alfpVar5 = (alfp) aihfVarCreateBuilder2.build();
        alfpVar5.getClass();
        alfrVar.f = alfpVar5;
        alfrVar.b |= SemanticState.ReadOnly;
        aihf aihfVarCreateBuilder3 = alfs.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        alfs alfsVar = (alfs) aihfVarCreateBuilder3.instance;
        alfsVar.b |= 1;
        alfsVar.c = jivVarG5.b;
        aihfVarCreateBuilder3.copyOnWrite();
        alfs alfsVar2 = (alfs) aihfVarCreateBuilder3.instance;
        alfsVar2.b |= 2;
        alfsVar2.d = jivVarG.b;
        aihfVarCreateBuilder3.copyOnWrite();
        alfs alfsVar3 = (alfs) aihfVarCreateBuilder3.instance;
        alfsVar3.b |= 4;
        alfsVar3.e = jivVarG6.b;
        aihfVarCreateBuilder3.copyOnWrite();
        alfs alfsVar4 = (alfs) aihfVarCreateBuilder3.instance;
        alfsVar4.b |= 8;
        alfsVar4.f = jivVarG2.b;
        aihfVarCreateBuilder3.copyOnWrite();
        alfs alfsVar5 = (alfs) aihfVarCreateBuilder3.instance;
        alfsVar5.b |= 16;
        alfsVar5.g = 16;
        aihfVarCreateBuilder3.copyOnWrite();
        alfs alfsVar6 = (alfs) aihfVarCreateBuilder3.instance;
        alfsVar6.b |= 32;
        alfsVar6.h = 16;
        aihfVarCreateBuilder3.copyOnWrite();
        alfs alfsVar7 = (alfs) aihfVarCreateBuilder3.instance;
        alfsVar7.b |= 64;
        alfsVar7.i = 16;
        aihfVarCreateBuilder3.copyOnWrite();
        alfs alfsVar8 = (alfs) aihfVarCreateBuilder3.instance;
        alfsVar8.b |= SemanticState.Focused;
        alfsVar8.j = 16;
        aihfVarCreateBuilder.copyOnWrite();
        alfr alfrVar2 = (alfr) aihfVarCreateBuilder.instance;
        alfs alfsVar9 = (alfs) aihfVarCreateBuilder3.build();
        alfsVar9.getClass();
        alfrVar2.g = alfsVar9;
        alfrVar2.b |= SemanticState.Modal;
        return aihfVarCreateBuilder;
    }

    public static Rect I(int i, int i2, Bitmap bitmap) {
        int height = (bitmap.getHeight() * i2) / i;
        int width = (bitmap.getWidth() * i) / i2;
        int iMin = Math.min(height, bitmap.getWidth());
        int iMin2 = Math.min(width, bitmap.getHeight());
        return new Rect((bitmap.getWidth() - iMin) / 2, (bitmap.getHeight() - iMin2) / 2, (bitmap.getWidth() + iMin) / 2, (bitmap.getHeight() + iMin2) / 2);
    }

    public static void J(String str, View view, TextView textView) {
        if (str == null || view == null || textView == null) {
            return;
        }
        K(textView, str, (int) Math.ceil(view.getMeasuredHeight() / textView.getLineHeight()), view.getMeasuredWidth());
    }

    public static void K(TextView textView, String str, int i, int i2) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new jid(i, i2), 0, spannableString.length(), 33);
        textView.setText(spannableString);
    }

    public static lye L(Object obj, long j) {
        return (lye) lzn.f(obj, j);
    }

    public static lxn M(Object obj) {
        return ((lxr) obj).extensions;
    }

    public static void N(Object obj) {
        M(obj).b();
    }

    public static lxa O(lxh lxhVar, byte[] bArr) {
        lxhVar.G();
        return new lwy(bArr);
    }

    public static /* synthetic */ String P(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "OK";
            case 3:
                return "WARNING_DATA_LOSS";
            case 4:
                return "INVALID_ARGUMENT";
            case 5:
                return "NOT_FOUND";
            case 6:
                return "FAILED_PRECONDITION";
            case 7:
                return "ABORTED";
            case 8:
                return "INTERNAL";
            case 9:
                return "OUT_OF_SPACE";
            case 10:
                return "ALREADY_EXISTS";
            default:
                return "UNAVAILABLE";
        }
    }

    public static int Q(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            default:
                return 0;
        }
    }

    public static /* synthetic */ boolean R(int i) {
        return a.aV(i) != 0;
    }

    public static /* synthetic */ boolean S(int i) {
        return a.aU(i) != 0;
    }

    public static void T(Runnable runnable, int i) {
        Thread thread = new Thread(runnable, "PsdCollector");
        thread.setPriority(i);
        thread.start();
    }

    public static void U(List list, GoogleHelp googleHelp) {
        googleHelp.d = ab(list);
    }

    public static File V(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(W(str, file), str2);
    }

    public static File W(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    public static boolean X(File file) {
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        boolean z = true;
        if (fileArrListFiles != null) {
            for (int i = 0; i < fileArrListFiles.length; i++) {
                File file2 = fileArrListFiles[i];
                z = file2 != null && X(file2) && z;
            }
        }
        return file.delete() && z;
    }

    public static boolean Y(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                yno.I(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                yno.I(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                yno.I(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void Z(File file) {
        if (file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static kws aa(Context context, gcw gcwVar, String str, String str2, kwc kwcVar) {
        kws kwsVar;
        kwg kwgVar = new kwg(context, gcwVar, str, str2, kwcVar);
        try {
            kwsVar = (kws) kwgVar.a.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            kwgVar.e(2009, kwgVar.b, e);
            kwsVar = null;
        }
        kwgVar.e(3004, kwgVar.b, null);
        if (kwsVar != null) {
            if (kwsVar.c == 7) {
                kwc.a = 3;
            } else {
                kwc.a = 2;
            }
        }
        return kwsVar == null ? new kws(1, null, 1) : kwsVar;
    }

    public static Bundle ab(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            bundle.putString((String) pair.first, (String) pair.second);
        }
        return bundle;
    }

    @Deprecated
    public static String ac() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jAbs = Math.abs(new SecureRandom().nextLong());
        StringBuilder sb = new StringBuilder();
        sb.append(jCurrentTimeMillis);
        sb.append('-');
        sb.append(jAbs);
        return sb.toString();
    }

    public static void ad(Bundle bundle) {
        if (!((Boolean) kwa.c.a()).booleanValue() || bundle == null) {
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        int iDataSize = parcelObtain.dataSize();
        parcelObtain.recycle();
        ltg ltgVar = kwa.b;
        if (iDataSize > ((Integer) ltgVar.a()).intValue()) {
            throw new IllegalStateException("Max allowed bundle size of " + ltgVar.a().toString() + " exceeded, you are passing in a bundle of " + iDataSize + " size.");
        }
    }

    public static void ae(kvn kvnVar) {
        if (((Boolean) kwa.c.a()).booleanValue()) {
            Parcel parcelObtain = Parcel.obtain();
            kvo.a(kvnVar, parcelObtain, 0);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            ltg ltgVar = kwa.b;
            if (iDataSize > ((Integer) ltgVar.a()).intValue()) {
                throw new IllegalStateException("Max allowed feedback options size of " + ltgVar.a().toString() + " exceeded, you are passing in feedback options of " + iDataSize + " size.");
            }
        }
    }

    public static void af(Runnable runnable) {
        Thread thread = new Thread(runnable, "Feedback");
        thread.setPriority(4);
        thread.start();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kwz] */
    public static synchronized void ag(byte[] bArr, int i, int i2, ahek ahekVar) {
        try {
            if (ahekVar.a) {
                ?? r5 = ahekVar.b;
                r5.h(bArr);
                r5.g(i);
                r5.b(i2);
                r5.j();
                r5.a();
            }
        } catch (RemoteException unused) {
        }
    }

    public static List ah(SwipeLayout swipeLayout, ahgb ahgbVar, anxx anxxVar, vxz vxzVar, Context context, Object obj, jlh jlhVar) {
        Optional optionalEmpty;
        Object obj2;
        Optional optional;
        ArrayList arrayList = new ArrayList();
        if ((anxxVar.b & 4) != 0) {
            int i = anxxVar.e;
            int iAS = a.aS(i);
            if (iAS == 0 || iAS != 2) {
                int iAS2 = a.aS(i);
                optionalEmpty = (iAS2 == 0 || iAS2 != 3) ? Optional.empty() : Optional.of(new ColorDrawable(context.getColor(R.color.yt_black_pure_opacity60)));
            } else {
                optionalEmpty = Optional.of(new ColorDrawable(context.getColor(R.color.yt_black1)));
            }
        } else {
            optionalEmpty = Optional.empty();
        }
        Optional optional2 = optionalEmpty;
        if ((anxxVar.b & 1) != 0) {
            anxy anxyVar = anxxVar.c;
            if (anxyVar == null) {
                anxyVar = anxy.a;
            }
            jfg jfgVarW = ahgbVar.W();
            if (jfgVarW.f(anxyVar)) {
                jfgVarW.h(anxyVar);
                tsv.g(swipeLayout, agke.q(jfgVarW.c));
                swipeLayout.getClass();
                anxy anxyVar2 = anxyVar;
                optional = optional2;
                obj2 = obj;
                swipeLayout.w = aj(swipeLayout, context, vxzVar, jfgVarW, anxyVar2, optional2, obj, new hsk(swipeLayout, 17), jlhVar, true);
                ai(swipeLayout, jfgVarW, anxyVar2, obj2);
            } else {
                obj2 = obj;
                optional = optional2;
            }
            arrayList.add(jfgVarW);
        } else {
            obj2 = obj;
            optional = optional2;
        }
        if ((anxxVar.b & 2) != 0) {
            anxy anxyVar3 = anxxVar.d;
            if (anxyVar3 == null) {
                anxyVar3 = anxy.a;
            }
            anxy anxyVar4 = anxyVar3;
            jfg jfgVarW2 = ahgbVar.W();
            if (jfgVarW2.f(anxyVar4)) {
                jfgVarW2.h(anxyVar4);
                tsv.f(swipeLayout, agke.q(jfgVarW2.c));
                swipeLayout.getClass();
                Optional optional3 = optional;
                optional = optional3;
                swipeLayout.v = aj(swipeLayout, context, vxzVar, jfgVarW2, anxyVar4, optional3, obj2, new hsk(swipeLayout, 18), jlhVar, false);
                ai(swipeLayout, jfgVarW2, anxyVar4, obj2);
                arrayList.add(jfgVarW2);
            }
        }
        swipeLayout.m = 1.0f;
        swipeLayout.n = true;
        swipeLayout.c = true;
        swipeLayout.m((Drawable) optional.get());
        swipeLayout.k((Drawable) optional.get());
        return arrayList;
    }

    private static void ai(View view, final jfg jfgVar, final anxy anxyVar, final Object obj) {
        aiqd aiqdVar;
        if (jfgVar.g(anxyVar)) {
            anxw anxwVar = anxyVar.d;
            if (anxwVar == null) {
                anxwVar = anxw.a;
            }
            aiqe aiqeVar = anxwVar.f;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
            aiqdVar = aiqeVar.c;
            if (aiqdVar == null) {
                aiqdVar = aiqd.a;
            }
        } else {
            anxw anxwVar2 = anxyVar.c;
            if (anxwVar2 == null) {
                anxwVar2 = anxw.a;
            }
            aiqe aiqeVar2 = anxwVar2.f;
            if (aiqeVar2 == null) {
                aiqeVar2 = aiqe.a;
            }
            aiqdVar = aiqeVar2.c;
            if (aiqdVar == null) {
                aiqdVar = aiqd.a;
            }
        }
        bac.a(view, aiqdVar.c, new bcl() { // from class: jfh
            @Override // defpackage.bcl
            public final boolean a(View view2) {
                jfgVar.d(anxyVar, obj);
                return true;
            }
        });
    }

    private static jfk aj(SwipeLayout swipeLayout, Context context, vxz vxzVar, jfg jfgVar, anxy anxyVar, Optional optional, Object obj, Consumer consumer, jlh jlhVar, boolean z) {
        float fB = (float) vxzVar.b(2, 45621167L);
        boolean zL = vxzVar.l(148, 45631027L, false);
        if (z) {
            swipeLayout.o = jfgVar.e(anxyVar);
            swipeLayout.p = fB;
        } else {
            swipeLayout.q = jfgVar.e(anxyVar);
            swipeLayout.r = fB;
        }
        return new jfk(swipeLayout, fB, optional, consumer, jfgVar, anxyVar, zL, jlhVar, context, obj);
    }

    public static boolean c(Throwable th) {
        return ((th instanceof tmg) || (th instanceof tnc)) ? false : true;
    }

    public static byte[] d(float f) {
        aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
        aihhVar.getClass();
        aihl aihlVar = asqs.b;
        aihlVar.getClass();
        aihf aihfVarCreateBuilder = asqs.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        asqs asqsVar = (asqs) aihfVarCreateBuilder.instance;
        asqsVar.c |= 4;
        asqsVar.f = f;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        aihhVar.e(aihlVar, (asqs) aihnVarBuild);
        aihn aihnVarBuild2 = aihhVar.build();
        aihnVarBuild2.getClass();
        return ((SenderStateOuterClass$SenderState) aihnVarBuild2).toByteArray();
    }

    public static byte[] e(float f) {
        if (f == 0.0f) {
            return jah.b;
        }
        return f == 1.0f ? jah.c : d(f);
    }

    public static Optional g(CharSequence charSequence, Resources resources) {
        if (charSequence == null) {
            return Optional.empty();
        }
        List listH = agfm.b((char) 8226).h(charSequence.toString());
        if (listH.isEmpty()) {
            return Optional.empty();
        }
        String strTrim = ((String) aguu.K(listH)).trim();
        if (!Pattern.compile("([1-5]?[0-9]):[0-5][0-9]").matcher(strTrim).matches()) {
            return Optional.empty();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listH.size() - 1; i++) {
            sb.append((String) listH.get(i));
        }
        sb.append(nsj.b(resources, strTrim));
        return Optional.of(sb.toString());
    }

    public static void h(View view, float f, float f2) {
        if (view != null) {
            view.setTranslationX(f);
            view.setAlpha(f2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082 A[LOOP:0: B:37:0x007c->B:39:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static void i(adly adlyVar, View view, anld anldVar, boolean z) {
        int i;
        anlb anlbVar;
        Drawable colorDrawable;
        GradientDrawable gradientDrawable;
        int i2;
        anlc anlcVar;
        aihy aihyVar;
        int[] iArr;
        int i3;
        Optional optionalB;
        hqc hqcVar;
        GradientDrawable.Orientation orientation;
        int i4;
        if (view != null) {
            if (anldVar == null || (i4 = anldVar.b) != 1) {
                if (anldVar != null && (i = anldVar.b) == 2) {
                    if (i == 2) {
                        anlbVar = (anlb) anldVar.c;
                    } else {
                        anlbVar = anlb.a;
                    }
                    if (anlbVar.b.size() > 0) {
                        gradientDrawable = new GradientDrawable();
                        i2 = anldVar.b;
                        if (i2 == 2) {
                            aihyVar = ((anlb) anldVar.c).b;
                            if (z) {
                                orientation = GradientDrawable.Orientation.TR_BL;
                            } else {
                                orientation = GradientDrawable.Orientation.TL_BR;
                            }
                            gradientDrawable.setOrientation(orientation);
                        } else {
                            if (i2 == 1) {
                                anlcVar = (anlc) anldVar.c;
                            } else {
                                anlcVar = anlc.a;
                            }
                            aihyVar = anlcVar.b;
                        }
                        if (aihyVar.size() == 1) {
                            gradientDrawable.setColor(((Long) aihyVar.get(0)).intValue());
                        } else if (aihyVar.size() > 1) {
                            iArr = new int[aihyVar.size()];
                            for (i3 = 0; i3 < aihyVar.size(); i3++) {
                                iArr[i3] = ((Long) aihyVar.get(i3)).intValue();
                            }
                            gradientDrawable.setColors(iArr);
                        }
                        optionalB = adxc.b(adlyVar);
                        hqcVar = new hqc(gradientDrawable, view, 12);
                        colorDrawable = gradientDrawable;
                        if (true == optionalB.isPresent()) {
                            ((GradientDrawable) hqcVar.a).setCornerRadius(((View) hqcVar.b).getResources().getDimension(((Integer) optionalB.get()).intValue()));
                            colorDrawable = gradientDrawable;
                        }
                    }
                }
                if (view.getBackground() != null) {
                    return;
                } else {
                    colorDrawable = new ColorDrawable(view.getContext().getColor(R.color.music_full_transparent));
                }
            } else if ((i4 == 1 ? (anlc) anldVar.c : anlc.a).b.size() <= 0) {
                if (anldVar != null) {
                    if (i == 2) {
                        anlbVar = (anlb) anldVar.c;
                    } else {
                        anlbVar = anlb.a;
                    }
                    if (anlbVar.b.size() > 0) {
                        gradientDrawable = new GradientDrawable();
                        i2 = anldVar.b;
                        if (i2 == 2) {
                            aihyVar = ((anlb) anldVar.c).b;
                            if (z) {
                                orientation = GradientDrawable.Orientation.TR_BL;
                            } else {
                                orientation = GradientDrawable.Orientation.TL_BR;
                            }
                            gradientDrawable.setOrientation(orientation);
                        } else {
                            if (i2 == 1) {
                                anlcVar = (anlc) anldVar.c;
                            } else {
                                anlcVar = anlc.a;
                            }
                            aihyVar = anlcVar.b;
                        }
                        if (aihyVar.size() == 1) {
                            gradientDrawable.setColor(((Long) aihyVar.get(0)).intValue());
                        } else if (aihyVar.size() > 1) {
                            iArr = new int[aihyVar.size()];
                            while (i3 < aihyVar.size()) {
                                iArr[i3] = ((Long) aihyVar.get(i3)).intValue();
                            }
                            gradientDrawable.setColors(iArr);
                        }
                        optionalB = adxc.b(adlyVar);
                        hqcVar = new hqc(gradientDrawable, view, 12);
                        colorDrawable = gradientDrawable;
                        if (true == optionalB.isPresent()) {
                            ((GradientDrawable) hqcVar.a).setCornerRadius(((View) hqcVar.b).getResources().getDimension(((Integer) optionalB.get()).intValue()));
                            colorDrawable = gradientDrawable;
                        }
                    }
                }
                if (view.getBackground() != null) {
                    return;
                } else {
                    colorDrawable = new ColorDrawable(view.getContext().getColor(R.color.music_full_transparent));
                }
            } else {
                gradientDrawable = new GradientDrawable();
                i2 = anldVar.b;
                if (i2 == 2) {
                    aihyVar = ((anlb) anldVar.c).b;
                    if (z) {
                        orientation = GradientDrawable.Orientation.TR_BL;
                    } else {
                        orientation = GradientDrawable.Orientation.TL_BR;
                    }
                    gradientDrawable.setOrientation(orientation);
                } else {
                    if (i2 == 1) {
                        anlcVar = (anlc) anldVar.c;
                    } else {
                        anlcVar = anlc.a;
                    }
                    aihyVar = anlcVar.b;
                }
                if (aihyVar.size() == 1) {
                    gradientDrawable.setColor(((Long) aihyVar.get(0)).intValue());
                } else if (aihyVar.size() > 1) {
                    iArr = new int[aihyVar.size()];
                    while (i3 < aihyVar.size()) {
                        iArr[i3] = ((Long) aihyVar.get(i3)).intValue();
                    }
                    gradientDrawable.setColors(iArr);
                }
                optionalB = adxc.b(adlyVar);
                hqcVar = new hqc(gradientDrawable, view, 12);
                colorDrawable = gradientDrawable;
                if (true == optionalB.isPresent()) {
                    ((GradientDrawable) hqcVar.a).setCornerRadius(((View) hqcVar.b).getResources().getDimension(((Integer) optionalB.get()).intValue()));
                    colorDrawable = gradientDrawable;
                }
            }
            if (!view.isShown()) {
                view.setBackground(colorDrawable);
                return;
            }
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{view.getBackground() != null ? view.getBackground() : new ColorDrawable(view.getContext().getColor(R.color.music_full_transparent)), colorDrawable});
            transitionDrawable.setCrossFadeEnabled(true);
            view.setBackground(transitionDrawable);
            transitionDrawable.startTransition(100);
        }
    }

    public static /* synthetic */ List j(anzi anziVar) {
        if (anziVar == null || (anziVar.b & SemanticState.Hidden) == 0) {
            return Collections.EMPTY_LIST;
        }
        apji apjiVar = anziVar.l;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anxu.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        anxt anxtVar = (anxt) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if (anxtVar.b.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(anxtVar.b.size());
        for (apji apjiVar2 : anxtVar.b) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
            apjiVar2.c(aihlVarCheckIsLite2);
            if (apjiVar2.j.n(aihlVarCheckIsLite2.d)) {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajnp.a);
                apjiVar2.c(aihlVarCheckIsLite3);
                Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite3.d);
                arrayList.add((ajnf) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2)));
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static alay k(View view, List list) {
        int i = bac.a;
        int layoutDirection = view.getLayoutDirection();
        agqs agqsVarC = ((agke) list).listIterator(0);
        if (!agqsVarC.hasNext()) {
            return alay.a;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add((alba) agqsVarC.next());
        while (agqsVarC.hasNext()) {
            if (layoutDirection == 1) {
                arrayList.add(0, (alba) agqsVarC.next());
            } else {
                arrayList.add((alba) agqsVarC.next());
            }
        }
        aihh aihhVar = (aihh) alay.a.createBuilder();
        aihhVar.copyOnWrite();
        alay alayVar = (alay) aihhVar.instance;
        alayVar.d();
        aifs.addAll(arrayList, alayVar.c);
        return (alay) aihhVar.build();
    }

    public static Uri l(String str) {
        return MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.buildUpon().appendPath(str).appendPath("albumart").build();
    }

    public static Uri m(String str) {
        return MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI.buildUpon().appendPath(str).build();
    }

    @Deprecated
    public static Uri n(String str) {
        return MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI.buildUpon().appendPath(str).build();
    }

    @Deprecated
    public static Uri o(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        lastPathSegment.getClass();
        return MediaStore.Audio.Playlists.Members.getContentUri("external", Long.parseLong(lastPathSegment));
    }

    public static Uri p(String str) {
        return MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.buildUpon().appendPath(str).build();
    }

    public static Uri q(String str) {
        return new Uri.Builder().scheme("ytm").authority("music.youtube.com").appendPath("sideloaded").appendPath("internal").appendPath("playlists").appendPath(str).build();
    }

    public static Uri r(Context context, int i) {
        Resources resources = context.getResources();
        return Uri.parse("android.resource://" + resources.getResourcePackageName(i) + '/' + resources.getResourceTypeName(i) + '/' + resources.getResourceEntryName(i));
    }

    public static Uri s(String str) {
        return new Uri.Builder().scheme("https").authority("music.youtube.com").appendPath("playlist").appendQueryParameter("list", str).appendQueryParameter("feature", "share").build();
    }

    public static Uri t() {
        return new Uri.Builder().scheme("ytm").authority("music.youtube.com").appendPath("sideloaded").appendPath("play").appendQueryParameter("list", "PLSL").build();
    }

    public static Uri u(String str) {
        return new Uri.Builder().scheme("https").authority("music.youtube.com").appendPath("watch").appendQueryParameter("v", str).appendQueryParameter("feature", "share").build();
    }

    public static Drawable v(Context context, aqmh aqmhVar) {
        int i = R.drawable.music_thumbnail_default_drawable;
        if (aqmhVar != null && aqmhVar.c.size() > 0) {
            String str = ((aqmg) aqmhVar.c.get(0)).c;
            if (!TextUtils.isEmpty(str) && (str.startsWith("content://") || str.startsWith("file://") || str.startsWith("ytm://"))) {
                try {
                    int iIndexOf = str.indexOf(35);
                    if (iIndexOf != -1) {
                        String strSubstring = str.substring(iIndexOf + 1);
                        if (strSubstring.startsWith("fallback_res_id_")) {
                            i = Integer.parseInt(strSubstring.substring(16));
                        }
                    }
                } catch (RuntimeException unused) {
                }
            }
        }
        aduk adukVar = new aduk(context, i);
        if (aqmhVar != null && (aqmhVar.b & 2) != 0) {
            adukVar.b(aqmhVar.d);
        }
        return adukVar.a();
    }

    public static aqmh w(Context context, Uri uri, int i, boolean z) {
        aqmh aqmhVarN = aawb.N(r(context, i));
        if (uri == null) {
            return aqmhVarN;
        }
        if (z) {
            return aawb.N(uri.buildUpon().fragment(a.bR(i, "fallback_res_id_")).build());
        }
        try {
            InputStream inputStreamB = qol.b(context, uri);
            if (inputStreamB == null) {
                return aqmhVarN;
            }
            inputStreamB.close();
            return aawb.N(uri);
        } catch (Exception unused) {
            return aqmhVarN;
        }
    }

    public static aqmh x(String str, Context context, int i) {
        if (TextUtils.isEmpty(str)) {
            return aawb.N(r(context, i));
        }
        File file = new File(str);
        return file.exists() ? aawb.N(Uri.fromFile(file)) : aawb.N(r(context, i));
    }

    public static aqmh y(Context context, agke agkeVar) {
        aihh aihhVar = (aihh) aqmh.a.createBuilder();
        for (int i = 0; i < ((agpi) agkeVar).d; i++) {
            int iIntValue = ((Integer) agkeVar.get(i)).intValue();
            Drawable drawable = context.getDrawable(iIntValue);
            if (drawable != null) {
                int intrinsicHeight = drawable.getIntrinsicHeight();
                aihhVar.r(aawb.I(r(context, iIntValue).toString(), drawable.getIntrinsicWidth(), intrinsicHeight));
            }
        }
        if (((aqmh) aihhVar.instance).c.size() == 0) {
            return null;
        }
        return (aqmh) aihhVar.build();
    }

    public static boolean z(aqmh aqmhVar) {
        return (aqmhVar == null || aqmhVar.c.size() <= 0 || (((aqmg) aqmhVar.c.get(0)).b & 1) == 0) ? false : true;
    }

    public List a() {
        return null;
    }

    public List b() {
        return null;
    }

    public ixt(byte[] bArr) {
    }

    public void f() {
    }
}
