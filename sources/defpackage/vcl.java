package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import internal.org.jni_zero.JniZero;
import j$.net.URLDecoder;
import j$.util.Optional;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vcl {
    public final asct a;
    public final Context b;
    public final vxe c;
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    public final Map f = new HashMap();
    public final Map g = new HashMap();
    public final Map h = new HashMap();
    public final Map i = new HashMap();
    public ListenableFuture j = ahng.l();
    public ListenableFuture k = ahng.l();
    public final vcp l;
    public final tfq m;
    public final xte n;
    public final roq o;
    public final zf p;
    private final Executor q;
    private final zvl r;
    private final xit s;
    private xir t;
    private final xsc u;
    private final aend v;

    public vcl(asct asctVar, aend aendVar, Executor executor, zvl zvlVar, xsc xscVar, Context context, vxe vxeVar, tfq tfqVar, roq roqVar, xit xitVar, zf zfVar, xte xteVar, vcp vcpVar) {
        this.q = executor;
        this.v = aendVar;
        this.r = zvlVar;
        this.a = asctVar;
        this.u = xscVar;
        this.b = context;
        this.c = vxeVar;
        this.m = tfqVar;
        this.o = roqVar;
        this.s = xitVar;
        this.p = zfVar;
        this.n = xteVar;
        this.l = vcpVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [awut, java.lang.Object] */
    public final ListenableFuture a(ascu ascuVar) {
        ascuVar.getClass();
        if (!this.m.i()) {
            return c(true);
        }
        Map map = this.f;
        String str = ascuVar.c;
        if (map.containsKey(str)) {
            return ahng.n((ascv) map.get(str));
        }
        xsc xscVar = this.u;
        String str2 = ascuVar.c;
        int iB = afyd.B(ascuVar.d);
        int i = iB == 0 ? 1 : iB;
        str2.getClass();
        ListenableFuture listenableFutureAg = awrc.ag(xscVar.c, awov.a, new adug(str2, i, xscVar, (awoq) null, 1));
        this.k = listenableFutureAg;
        taf.h(listenableFutureAg, MoreExecutors.directExecutor(), new gou(this, ascuVar, 19));
        return ahcs.e(this.k, afwl.a(new tvm(this, str, 5)), MoreExecutors.directExecutor());
    }

    public final ListenableFuture b(asda asdaVar) {
        asdaVar.getClass();
        if (!this.m.i()) {
            return c(true);
        }
        i(asdaVar.d);
        aihf aihfVarCreateBuilder = akoy.a.createBuilder();
        apgv apgvVar = asdaVar.c;
        if (apgvVar == null) {
            apgvVar = apgv.a;
        }
        aihfVarCreateBuilder.copyOnWrite();
        akoy akoyVar = (akoy) aihfVarCreateBuilder.instance;
        apgvVar.getClass();
        akoyVar.c = apgvVar;
        akoyVar.b = 16;
        return ahno.as(d((akoy) aihfVarCreateBuilder.build(), asdaVar.d), new uzh(this, 4), MoreExecutors.directExecutor());
    }

    public final ListenableFuture c(boolean z) {
        Context context = this.b;
        int i = R.string.media_generation_network_error;
        String string = context.getString(R.string.media_generation_network_error);
        IllegalStateException illegalStateException = new IllegalStateException(string);
        if (true != z) {
            i = 0;
        }
        f(illegalStateException, string, i);
        return ahng.m(illegalStateException);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zwh] */
    public final ListenableFuture d(akoy akoyVar, String str) {
        aend aendVar = this.v;
        zwa zwaVarHw = aendVar.c.hw();
        Object obj = aendVar.d;
        aend aendVar2 = (aend) obj;
        abxv abxvVar = aendVar2.b;
        Optional optionalEmpty = Optional.empty();
        Optional optionalEmpty2 = Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional optionalEmpty3 = Optional.empty();
        if (zwaVarHw == null) {
            throw new NullPointerException("Null identity");
        }
        Optional optionalOfNullable = Optional.ofNullable(str);
        aigj aigjVar = aigj.d;
        if (aigjVar == null) {
            throw new NullPointerException("Null clickTrackingParams");
        }
        ukb ukbVar = new ukb(abxvVar, zwaVarHw, optionalEmpty, optionalEmpty2, Optional.ofNullable(akoyVar), optionalOfNullable, optionalEmpty3);
        ukbVar.n(aigjVar);
        Executor executor = this.q;
        afxd afxdVarC = afxd.f(((wnh) aendVar2.c).b(ukbVar, executor, null)).c(toe.class, new qmu(obj, 17), executor);
        taf.h(afxdVarC, executor, new roc(this, 11));
        return afxdVarC;
    }

    public final ListenableFuture e(final asdk asdkVar) {
        asdkVar.getClass();
        if (!this.m.i()) {
            return c(true);
        }
        ListenableFuture listenableFutureR = ahng.r(afwl.j(new Callable() { // from class: vck
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v0, types: [xte] */
            /* JADX WARN: Type inference failed for: r14v0, types: [int] */
            /* JADX WARN: Type inference failed for: r14v1 */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r14v3 */
            /* JADX WARN: Type inference failed for: r14v4 */
            /* JADX WARN: Type inference failed for: r14v5 */
            /* JADX WARN: Type inference failed for: r14v6, types: [android.net.Uri] */
            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, zvl] */
            /* JADX WARN: Type inference failed for: r1v16, types: [atzc] */
            /* JADX WARN: Type inference failed for: r3v24, types: [ssr] */
            /* JADX WARN: Type inference failed for: r7v0, types: [android.net.Uri, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v1 */
            /* JADX WARN: Type inference failed for: r7v10 */
            /* JADX WARN: Type inference failed for: r7v11 */
            /* JADX WARN: Type inference failed for: r7v12 */
            /* JADX WARN: Type inference failed for: r7v13 */
            /* JADX WARN: Type inference failed for: r7v14 */
            /* JADX WARN: Type inference failed for: r7v15 */
            /* JADX WARN: Type inference failed for: r7v2 */
            /* JADX WARN: Type inference failed for: r7v3 */
            /* JADX WARN: Type inference failed for: r7v4 */
            /* JADX WARN: Type inference failed for: r7v5 */
            /* JADX WARN: Type inference failed for: r7v6 */
            /* JADX WARN: Type inference failed for: r7v7 */
            /* JADX WARN: Type inference failed for: r7v8 */
            /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.StringBuilder] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.concurrent.Callable
            public final Object call() throws ssq, FileNotFoundException {
                Bitmap bitmapCreateBitmap;
                aigj aigjVarI;
                ?? r7;
                ?? r8;
                vcl vclVar = this.a;
                asdk asdkVar2 = asdkVar;
                int i = asdkVar2.c;
                int i2 = 2;
                if (i == 7) {
                    xte xteVar = vclVar.n;
                    aigj aigjVar = i == 7 ? (aigj) asdkVar2.d : aigj.d;
                    String str = asdkVar2.e;
                    vcj vcjVar = new vcj(vclVar, asdkVar2, 0);
                    aigjVar.getClass();
                    str.getClass();
                    String strJ = ((vxz) xteVar.b).j(2, 45698591L);
                    strJ.getClass();
                    atzc atzcVar = new atzc();
                    atzcVar.d("X-YouTube-FeatureId", str);
                    try {
                        String strA = ((ssr) xteVar.c).a(strJ, atzcVar, aigjVar.h());
                        aihf aihfVarCreateBuilder = asdl.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        asdl asdlVar = (asdl) aihfVarCreateBuilder.instance;
                        strA.getClass();
                        asdlVar.b |= 1;
                        asdlVar.c = strA;
                        aihn aihnVarBuild = aihfVarCreateBuilder.build();
                        aihnVarBuild.getClass();
                        return (asdl) aihnVarBuild;
                    } catch (ssq e) {
                        vcjVar.invoke(e, "Failed to upload image.");
                        throw e;
                    }
                }
                String str2 = i == 1 ? (String) asdkVar2.d : "";
                if (vclVar.e.containsKey(str2)) {
                    return (asdl) vclVar.e.get(str2);
                }
                int i3 = asdkVar2.i;
                if (i3 <= 0 || i3 > 100) {
                    i3 = 90;
                }
                ?? r13 = vclVar.n;
                String str3 = asdkVar2.e;
                ?? r14 = asdkVar2.f;
                int i4 = asdkVar2.g;
                int i5 = i3;
                float f = ahbd.c((double) asdkVar2.h, 0.0d, 1.0E-4d) ? 0.5625f : asdkVar2.h;
                vcj vcjVar2 = new vcj(vclVar, asdkVar2, i2);
                str2.getClass();
                str3.getClass();
                String strJ2 = ((vxz) r13.b).j(2, 45698591L);
                strJ2.getClass();
                ?? r9 = Uri.parse(str2);
                r9.getClass();
                try {
                    InputStream inputStreamB = r13.b(r9);
                    try {
                        aigj aigjVarI2 = aigj.I(inputStreamB);
                        JniZero.l(inputStreamB, null);
                        String str4 = str2;
                        if (((vxz) ((aaok) r13.a).b).l(496, 45765168L, false)) {
                            r8 = str3;
                            aigjVarI = aigjVarI2;
                        } else {
                            try {
                                InputStream inputStreamB2 = r13.b(r9);
                                try {
                                    int iJ = new bmu(inputStreamB2).j();
                                    Matrix matrix = new Matrix();
                                    if (iJ == 3) {
                                        matrix.postRotate(180.0f);
                                    } else if (iJ == 6) {
                                        matrix.postRotate(90.0f);
                                    } else if (iJ == 8) {
                                        matrix.postRotate(270.0f);
                                    }
                                    JniZero.l(inputStreamB2, null);
                                    aigjVarI2.getClass();
                                    if (aigjVarI2.E()) {
                                        throw new IllegalArgumentException("Original image bytes cannot be null or empty.");
                                    }
                                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(aigjVarI2.G(), 0, aigjVarI2.d());
                                    if (bitmapDecodeByteArray == null) {
                                        throw new IllegalArgumentException("Failed to decode image bytes into a Bitmap.");
                                    }
                                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
                                    bitmapCreateBitmap2.getClass();
                                    int width = bitmapCreateBitmap2.getWidth();
                                    float f2 = width;
                                    int height = bitmapCreateBitmap2.getHeight();
                                    float f3 = height;
                                    float f4 = f2 / f3;
                                    if (f4 > f) {
                                        int i6 = (int) (f3 * f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap2, (width - i6) / 2, 0, i6, height);
                                    } else if (f4 < f) {
                                        int i7 = (int) (f2 / f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap2, 0, (height - i7) / 2, width, i7);
                                    } else {
                                        bitmapCreateBitmap = bitmapCreateBitmap2;
                                    }
                                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, r14, i4, true);
                                    if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                                        bitmapCreateBitmap.recycle();
                                    }
                                    bitmapCreateScaledBitmap.getClass();
                                    aigi aigiVar = new aigi(SemanticState.Focused);
                                    bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, i5, aigiVar);
                                    bitmapDecodeByteArray.recycle();
                                    bitmapCreateBitmap2.recycle();
                                    if (!bitmapCreateScaledBitmap.isRecycled()) {
                                        bitmapCreateScaledBitmap.recycle();
                                    }
                                    aigj aigjVarB = aigiVar.b();
                                    aigjVarB.getClass();
                                    if (((vxz) ((aaok) r13.a).b).l(618, 45857048L, false)) {
                                        awrm awrmVar = new awrm();
                                        try {
                                            awrmVar.a = File.createTempFile("c2pa_resized_", ".jpg", ((Context) r13.f).getCacheDir());
                                            FileOutputStream fileOutputStream = new FileOutputStream((File) awrmVar.a);
                                            try {
                                                try {
                                                    aigjVarB.m(fileOutputStream);
                                                    JniZero.l(fileOutputStream, null);
                                                    try {
                                                        r14 = r9;
                                                        r9 = str3;
                                                        File file = (File) awqx.l(awov.a, new gme((xte) r13, (Uri) r14, awrmVar, (awoq) null, 13));
                                                        if (!file.exists() || file.length() <= 0) {
                                                            aigjVarI = aigjVarB;
                                                        } else {
                                                            FileInputStream fileInputStream = new FileInputStream(file);
                                                            try {
                                                                aigjVarI = aigj.I(fileInputStream);
                                                                JniZero.l(fileInputStream, null);
                                                            } catch (Throwable th) {
                                                                try {
                                                                    throw th;
                                                                } catch (Throwable th2) {
                                                                    JniZero.l(fileInputStream, th);
                                                                    throw th2;
                                                                }
                                                            }
                                                        }
                                                        aigjVarI.getClass();
                                                        File file2 = (File) awrmVar.a;
                                                        r8 = r9;
                                                        if (file2 != null) {
                                                            file2.delete();
                                                            r8 = r9;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        r14 = r9;
                                                        r9 = str3;
                                                        try {
                                                            Log.w("ImageUpload", "Failed to propagate C2PA provenance for " + r14, th);
                                                            ?? r1 = r13.e;
                                                            zvj zvjVarA = zvk.a();
                                                            zvjVarA.d("Shorts Reference C2PA provenance propagation failed in ImageUpload");
                                                            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                                                            zvjVarA.j = 40;
                                                            zvjVarA.f(th);
                                                            r1.a(zvjVarA.a());
                                                            File file3 = (File) awrmVar.a;
                                                            r7 = r9;
                                                            if (file3 != null) {
                                                                file3.delete();
                                                                r7 = r9;
                                                            }
                                                            aigjVarI = aigjVarB;
                                                            r8 = r7;
                                                        } catch (Throwable th4) {
                                                            File file4 = (File) awrmVar.a;
                                                            if (file4 != null) {
                                                                file4.delete();
                                                            }
                                                            throw th4;
                                                        }
                                                    }
                                                } catch (Throwable th5) {
                                                    r14 = r9;
                                                    r9 = str3;
                                                    try {
                                                        throw th5;
                                                    } catch (Throwable th6) {
                                                        JniZero.l(fileOutputStream, th5);
                                                        throw th6;
                                                    }
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            r14 = r9;
                                            r9 = str3;
                                        }
                                    } else {
                                        r7 = str3;
                                    }
                                    aigjVarI = aigjVarB;
                                    r8 = r7;
                                } catch (Throwable th9) {
                                    try {
                                        throw th9;
                                    } catch (Throwable th10) {
                                        JniZero.l(inputStreamB2, th9);
                                        throw th10;
                                    }
                                }
                            } catch (FileNotFoundException e2) {
                                vcjVar2.invoke(e2, "Failed to upload image: Error in getting rotation matrix.");
                                throw e2;
                            }
                        }
                        ?? atzcVar2 = new atzc();
                        atzcVar2.d("X-YouTube-FeatureId", r8);
                        try {
                            String strA2 = ((ssr) r13.c).a(strJ2, atzcVar2, aigjVarI.h());
                            aihf aihfVarCreateBuilder2 = asdl.a.createBuilder();
                            aihfVarCreateBuilder2.copyOnWrite();
                            asdl asdlVar2 = (asdl) aihfVarCreateBuilder2.instance;
                            strA2.getClass();
                            asdlVar2.b |= 1;
                            asdlVar2.c = strA2;
                            aihn aihnVarBuild2 = aihfVarCreateBuilder2.build();
                            aihnVarBuild2.getClass();
                            asdl asdlVar3 = (asdl) aihnVarBuild2;
                            vclVar.e.put(str4, asdlVar3);
                            return asdlVar3;
                        } catch (ssq e3) {
                            vcjVar2.invoke(e3, "Failed to upload image.");
                            throw e3;
                        }
                    } catch (Throwable th11) {
                        try {
                            throw th11;
                        } catch (Throwable th12) {
                            JniZero.l(inputStreamB, th11);
                            throw th12;
                        }
                    }
                } catch (FileNotFoundException e4) {
                    vcjVar2.invoke(e4, "Failed to upload image: Error in opening image uri.");
                    throw e4;
                }
            }
        }), this.q);
        this.j = listenableFutureR;
        return listenableFutureR;
    }

    public final void f(Throwable th, String str, int i) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        if (i != 0) {
            k(j(this.b.getString(i)));
        }
        g("[MediaGeneration][Android] ".concat(String.valueOf(str)));
    }

    public final void g(String str) {
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
        zvjVarA.j = 69;
        zvjVarA.i = 20;
        zvjVarA.d(str);
        this.r.a(zvjVarA.a());
    }

    public final void h(String str) {
        xir xirVar = this.t;
        if (xirVar != null) {
            xirVar.n(str);
        }
    }

    public final void i(String str) {
        this.t = this.s.n(324);
        try {
            aneu aneuVar = ((akoz) aihn.parseFrom(akoz.a, Base64.decode(URLDecoder.decode(str, StandardCharsets.UTF_8), 8), ExtensionRegistryLite.getGeneratedRegistry())).b;
            if (aneuVar == null) {
                aneuVar = aneu.a;
            }
            aihf aihfVarCreateBuilder = amiu.a.createBuilder();
            aigj byteString = aneuVar.toByteString();
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
            amiuVar.e |= 67108864;
            amiuVar.aa = byteString;
            amiu amiuVar2 = (amiu) aihfVarCreateBuilder.build();
            xir xirVar = this.t;
            if (xirVar != null) {
                xirVar.h(amiuVar2);
            }
        } catch (Exception unused) {
            g("[MediaGeneration][Android] Failed to log GDCA latency.");
            h("aa");
        }
    }

    public final aihf j(String str) {
        aihf aihfVarCreateBuilder = aixa.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aocd.a.createBuilder();
        alay alayVarC = ackj.c(str);
        aihfVarCreateBuilder2.copyOnWrite();
        aocd aocdVar = (aocd) aihfVarCreateBuilder2.instance;
        alayVarC.getClass();
        aocdVar.c = alayVarC;
        aocdVar.b |= 1;
        aihf aihfVarCreateBuilder3 = ajng.a.createBuilder();
        aihh aihhVar = (aihh) ajnf.a.createBuilder();
        alay alayVarC2 = ackj.c(this.b.getString(R.string.ok));
        aihhVar.copyOnWrite();
        ajnf ajnfVar = (ajnf) aihhVar.instance;
        alayVarC2.getClass();
        ajnfVar.m = alayVarC2;
        ajnfVar.b |= 64;
        ajnf ajnfVar2 = (ajnf) aihhVar.build();
        aihfVarCreateBuilder3.copyOnWrite();
        ajng ajngVar = (ajng) aihfVarCreateBuilder3.instance;
        ajnfVar2.getClass();
        ajngVar.c = ajnfVar2;
        ajngVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        aocd aocdVar2 = (aocd) aihfVarCreateBuilder2.instance;
        ajng ajngVar2 = (ajng) aihfVarCreateBuilder3.build();
        ajngVar2.getClass();
        aocdVar2.d = ajngVar2;
        aocdVar2.b |= 4;
        aocd aocdVar3 = (aocd) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        aixa aixaVar = (aixa) aihfVarCreateBuilder.instance;
        aocdVar3.getClass();
        aixaVar.d = aocdVar3;
        aixaVar.b |= 2;
        return aihfVarCreateBuilder;
    }

    public final void k(aihf aihfVar) {
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = aiwz.b;
        aihf aihfVarCreateBuilder = aiwz.a.createBuilder();
        aixa aixaVar = (aixa) aihfVar.build();
        aihfVarCreateBuilder.copyOnWrite();
        aiwz aiwzVar = (aiwz) aihfVarCreateBuilder.instance;
        aixaVar.getClass();
        aiwzVar.d = aixaVar;
        aiwzVar.c |= 1;
        aihhVar.e(aihlVar, (aiwz) aihfVarCreateBuilder.build());
        this.c.a((ajwo) aihhVar.build());
    }
}
