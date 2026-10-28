package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vfb extends vft {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/projectstate/ImageProjectState");
    public auij b;
    public qtt c;
    public vex d;
    public vey e;
    public final boolean f;
    public final float g;
    public final Context h;
    Bitmap.CompressFormat i;
    public Bitmap j;
    public Optional k;
    public boolean l;
    public vez m;
    public vfa n;
    public final vxz o;
    private final String r;
    private final boolean s;
    private String t;
    private String u;
    private final zvl v;

    public vfb(Context context, String str, Uri uri, boolean z, vet vetVar, float f, boolean z2, zvl zvlVar, vxz vxzVar, Duration duration) {
        qtt qttVar;
        super(vetVar);
        this.c = null;
        this.t = "";
        this.u = "";
        this.i = Bitmap.CompressFormat.PNG;
        this.j = null;
        this.k = Optional.empty();
        this.m = null;
        this.n = null;
        this.r = str;
        this.g = f;
        this.s = z2;
        this.l = z;
        this.v = zvlVar;
        this.o = vxzVar;
        if (duration == null) {
            Duration duration2 = Duration.ZERO;
        }
        this.h = context;
        r(context, uri, true, null);
        this.f = nuo.l(nuo.k(context, uri));
        s(uri);
        if (!z() && !z()) {
            if (y()) {
                qtt qttVar2 = this.c;
                if (qttVar2 != null) {
                    qty qtyVar = qttVar2.b;
                    ukh ukhVarFo = yno.fo(qtyVar.b, qtyVar.c, f);
                    qttVar2.e(ukhVarFo.a, ukhVarFo.c);
                    qttVar2.f(ukhVarFo.b, ukhVarFo.d);
                }
            } else {
                Bitmap bitmap = this.j;
                if (bitmap != null && (qttVar = this.c) != null) {
                    ukh ukhVarFo2 = yno.fo(bitmap.getWidth(), bitmap.getHeight(), f);
                    qttVar.e(ukhVarFo2.a, ukhVarFo2.c);
                    qttVar.f(ukhVarFo2.b, ukhVarFo2.d);
                }
            }
        }
        tym.r(new File(new File(vetVar.a(), "image_project"), str), null);
    }

    public static final boolean B(File file) {
        return file != null && file.exists() && file.isFile() && file.length() > 0;
    }

    public static final auax C(File file) {
        if (!B(file)) {
            return null;
        }
        try {
            return (auax) aihn.parseFrom(auax.a, agyo.e(file), ExtensionRegistryLite.getGeneratedRegistry());
        } catch (IOException unused) {
            return null;
        }
    }

    public final Uri a(Uri uri) {
        vex vexVar;
        if (f() == null) {
            return uri;
        }
        vxz vxzVar = this.o;
        return ((vxzVar.l(63, 45750808L, false) || vxzVar.l(65, 45751669L, false)) && (vexVar = this.d) != null) ? vexVar.a : tyu.a(i().getAbsolutePath());
    }

    public final qty b(Context context, Uri uri, boolean z) {
        if (!y()) {
            Bitmap bitmapR = nuo.r(context, uri);
            if (z) {
                this.j = bitmapR;
            }
            int width = bitmapR.getWidth();
            int height = bitmapR.getHeight();
            qtw qtwVar = new qtw();
            qtwVar.b();
            qtwVar.a = uri;
            qtwVar.b = width;
            qtwVar.c = height;
            qtwVar.d = new long[]{0};
            return qtwVar.a();
        }
        Pair pairD = adhx.d(context.getContentResolver(), uri);
        Integer num = (Integer) pairD.first;
        num.getClass();
        int iIntValue = num.intValue();
        Integer num2 = (Integer) pairD.second;
        num2.getClass();
        int iIntValue2 = num2.intValue();
        qtw qtwVar2 = new qtw();
        qtwVar2.b();
        qtwVar2.a = uri;
        qtwVar2.b = iIntValue;
        qtwVar2.c = iIntValue2;
        qtwVar2.d = new long[]{0};
        return qtwVar2.a();
    }

    public final ukh c() {
        vfa vfaVar = this.n;
        if (vfaVar != null) {
            return vfaVar.b;
        }
        return null;
    }

    @Override // defpackage.vft
    public final ListenableFuture d() {
        if (this.c == null) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/projectstate/ImageProjectState", "getEditableComposition", 1162, "ImageProjectState.java")).t("ImageProjectState: editableVideo is null, so using empty media composition.");
            return ahng.n(auhs.a);
        }
        auhq auhqVar = (auhq) auhs.a.createBuilder();
        auhqVar.copyOnWrite();
        auhs auhsVar = (auhs) auhqVar.instance;
        auhsVar.b |= 8;
        auhsVar.j = true;
        jrr jrrVar = (jrr) augy.a.createBuilder();
        jrrVar.copyOnWrite();
        augy augyVar = (augy) jrrVar.instance;
        augyVar.b |= 1;
        augyVar.e = 1L;
        aigu aiguVar = aikw.a;
        jrrVar.copyOnWrite();
        augy augyVar2 = (augy) jrrVar.instance;
        aiguVar.getClass();
        augyVar2.i = aiguVar;
        augyVar2.b |= 16;
        aigu aiguVarC = aikw.c(1L);
        jrrVar.copyOnWrite();
        augy augyVar3 = (augy) jrrVar.instance;
        aiguVarC.getClass();
        augyVar3.j = aiguVarC;
        augyVar3.b |= 32;
        aihf aihfVarCreateBuilder = augz.a.createBuilder();
        aihf aihfVarCreateBuilder2 = auhk.a.createBuilder();
        boolean z = this.l;
        aihfVarCreateBuilder2.copyOnWrite();
        auhk auhkVar = (auhk) aihfVarCreateBuilder2.instance;
        auhkVar.b |= 2;
        auhkVar.d = z;
        qtt qttVar = this.c;
        qttVar.getClass();
        String string = qttVar.b.a.toString();
        aihfVarCreateBuilder2.copyOnWrite();
        auhk auhkVar2 = (auhk) aihfVarCreateBuilder2.instance;
        string.getClass();
        auhkVar2.b |= 1;
        auhkVar2.c = string;
        aihfVarCreateBuilder.copyOnWrite();
        augz augzVar = (augz) aihfVarCreateBuilder.instance;
        auhk auhkVar3 = (auhk) aihfVarCreateBuilder2.build();
        auhkVar3.getClass();
        augzVar.c = auhkVar3;
        augzVar.b = 1;
        jrrVar.copyOnWrite();
        augy augyVar4 = (augy) jrrVar.instance;
        augz augzVar2 = (augz) aihfVarCreateBuilder.build();
        augzVar2.getClass();
        augyVar4.d = augzVar2;
        augyVar4.c = 109;
        auhqVar.copyOnWrite();
        auhs auhsVar2 = (auhs) auhqVar.instance;
        augy augyVar5 = (augy) jrrVar.build();
        augyVar5.getClass();
        auhsVar2.d();
        auhsVar2.d.add(augyVar5);
        aihh aihhVar = (aihh) aufs.a.createBuilder();
        aihl aihlVar = aufx.b;
        aihf aihfVarCreateBuilder3 = aufx.a.createBuilder();
        aihf aihfVarCreateBuilder4 = aufw.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        aufw aufwVar = (aufw) aihfVarCreateBuilder4.instance;
        aufwVar.b |= 1;
        aufwVar.c = 1L;
        aufw aufwVar2 = (aufw) aihfVarCreateBuilder4.build();
        aihfVarCreateBuilder3.copyOnWrite();
        aufx aufxVar = (aufx) aihfVarCreateBuilder3.instance;
        aufwVar2.getClass();
        aufxVar.a();
        aufxVar.c.add(aufwVar2);
        aihhVar.e(aihlVar, (aufx) aihfVarCreateBuilder3.build());
        auhqVar.e((aufs) aihhVar.build());
        return ahng.n((auhs) auhqVar.build());
    }

    public final ListenableFuture e(final Bitmap bitmap, ahey aheyVar, final File file) {
        return ahng.r(afwl.j(new Callable() { // from class: veu
            /*  JADX ERROR: Type inference failed
                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18761. Try increasing type updates limit count.
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instruction units count: 1876
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.veu.call():java.lang.Object");
            }
        }), aheyVar);
    }

    public final aigj f() {
        vex vexVar = this.d;
        if (vexVar == null) {
            return null;
        }
        return vexVar.b;
    }

    @Override // defpackage.vft
    public final Optional g() {
        qtt qttVar = this.c;
        if (qttVar == null) {
            return Optional.empty();
        }
        qty qtyVar = qttVar.b;
        Uri uri = qtyVar.a;
        if (uri == null) {
            throw new NullPointerException("Null path");
        }
        return Optional.of(new ugp(uri, qtyVar.b, qtyVar.c, 0L, 30.0f, 0));
    }

    @Override // defpackage.vft
    public final Optional h() {
        return Optional.ofNullable(this.b);
    }

    public final File i() {
        return new File(j(), this.u);
    }

    @Override // defpackage.vft
    public final File j() {
        File file = new File(new File(this.q.a(), "image_project"), this.r);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File k() {
        return new File(j(), "snapshot_state");
    }

    public final File l() {
        if (this.n != null) {
            return m();
        }
        return null;
    }

    public final File m() {
        return new File(j(), this.t);
    }

    @Override // defpackage.vft
    public final String n() {
        return this.r;
    }

    @Override // defpackage.vft
    public final void o(auij auijVar) {
        this.b = auijVar;
    }

    public final void p(ajtv ajtvVar, String str, Throwable th) {
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtvVar);
        zvjVarA.j = 70;
        zvjVarA.i = 278;
        zvjVarA.d(str);
        if (th != null) {
            zvjVarA.f(th);
        }
        this.v.a(zvjVarA.a());
    }

    public final void r(Context context, Uri uri, boolean z, qtt qttVar) {
        qtu qtuVar;
        try {
            qty qtyVarB = b(context, uri, z);
            this.c = (qttVar == null || (qtuVar = qttVar.a) == null) ? new qtt(qtyVarB) : new qtt(qtuVar, qtyVarB);
        } catch (Exception e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/creation/projectstate/ImageProjectState", "updateEditableVideo", (char) 179, "ImageProjectState.java")).t("Error in getting metadata of the image");
        }
    }

    public final void s(Uri uri) {
        boolean zEquals = "image/png".equals(nuo.k(this.h, uri));
        this.i = zEquals ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        String str = true != zEquals ? "output_image.jpg" : "output_image.png";
        this.u = str;
        this.t = String.format("staging_%s", str);
    }

    public final boolean t() {
        auij auijVar = this.b;
        if (auijVar == null || (auijVar.b & 2) == 0) {
            return false;
        }
        auhs auhsVar = auijVar.d;
        if (auhsVar == null) {
            auhsVar = auhs.a;
        }
        return auhsVar.d.size() > 1 || auhsVar.g.size() > 0;
    }

    public final boolean u() {
        return this.d != null;
    }

    public final boolean v() {
        return this.m != null || k().exists();
    }

    public final boolean w(auij auijVar) {
        auij auijVar2 = this.b;
        String str = auijVar2 == null ? "" : auijVar2.f;
        String str2 = auijVar != null ? auijVar.f : "";
        return (yno.fn(str) || yno.fn(str2)) && !str.equals(str2);
    }

    public final boolean x(auij auijVar) {
        auhs auhsVar;
        auij auijVar2 = this.b;
        auhs auhsVar2 = null;
        if (auijVar2 == null || (auijVar2.b & 2) == 0) {
            auhsVar = null;
        } else {
            auhsVar = auijVar2.d;
            if (auhsVar == null) {
                auhsVar = auhs.a;
            }
        }
        if (auijVar != null && (auijVar.b & 2) != 0 && (auhsVar2 = auijVar.d) == null) {
            auhsVar2 = auhs.a;
        }
        if (this.o.l(77, 45835557L, false) && auhsVar2 == null && !t()) {
            return true;
        }
        return Objects.equals(auhsVar, auhsVar2);
    }

    public final boolean y() {
        vxz vxzVar = this.o;
        return vxzVar != null && vxzVar.l(81, 45842332L, false);
    }

    public final boolean z() {
        return this.s && y();
    }

    @Override // defpackage.vft
    public final void A() {
    }

    @Override // defpackage.vft
    public final void q() {
    }
}
