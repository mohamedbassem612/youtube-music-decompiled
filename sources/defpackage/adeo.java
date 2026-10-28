package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Optional;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adeo implements sxu {
    public final String a;
    public final zsl b;
    public final nry c;
    public final nsl d;
    public final Optional e;
    public final Optional f;
    public final Executor g;
    public final AtomicBoolean h = new AtomicBoolean(false);
    private final ImageView i;
    private final nxs j;
    private final mbc k;
    private final nuc l;
    private final Executor m;
    private final boolean n;
    private final sxu o;
    private final ci p;

    public adeo(Uri uri, ImageView imageView, nxs nxsVar, zsl zslVar, ci ciVar, mbc mbcVar, sxu sxuVar, nry nryVar, nsl nslVar, Optional optional, nuc nucVar, Optional optional2, Executor executor, Executor executor2, boolean z) {
        this.i = imageView;
        this.a = uri.toString();
        this.j = nxsVar;
        this.b = zslVar;
        this.p = ciVar;
        this.k = mbcVar;
        this.o = sxuVar;
        this.c = nryVar;
        this.d = nslVar;
        this.e = optional;
        this.l = nucVar;
        this.f = optional2;
        this.m = executor;
        this.g = executor2;
        this.n = z;
    }

    public static Uri c(Uri uri) {
        return uri.buildUpon().appendQueryParameter("bitmap", "true").build();
    }

    public static void d(AtomicBoolean atomicBoolean, Bitmap bitmap, String str, ImageView imageView, Optional optional) {
        if (atomicBoolean.get()) {
            return;
        }
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
        addb addbVar = new addb(str, 3);
        if (true == optional.isPresent()) {
            ((xje) optional.get()).b((String) addbVar.a, "img_lf");
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, nry] */
    public static void e(nsl nslVar, nry nryVar, Optional optional) {
        acog acogVar = new acog(nryVar, nslVar, 4);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            ?? r3 = acogVar.a;
            Object obj2 = acogVar.b;
            nrt nrtVarD = nrv.d();
            nrtVarD.b((nsl) obj2);
            r3.a((CommandOuterClass$Command) obj, nrtVarD.a()).D();
        }
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, syp] */
    public static void f(Drawable drawable, Uri uri, String str, ImageView imageView, nxs nxsVar, ci ciVar, mbc mbcVar, nry nryVar, nsl nslVar, Optional optional, nuc nucVar, Optional optional2, AtomicBoolean atomicBoolean) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            ciVar.a.c(uri, new zrr(bitmapDrawable.getBitmap(), mbcVar.f().toEpochMilli()));
            d(atomicBoolean, bitmapDrawable.getBitmap(), str, imageView, optional2);
            return;
        }
        if (g(drawable) || (drawable instanceof fce)) {
            if (atomicBoolean.get()) {
                return;
            }
            imageView.setImageDrawable(drawable);
            if (g(drawable)) {
                nxsVar.c((FrameSequenceDrawable) drawable);
            } else {
                nxsVar.d((fce) drawable);
            }
            nxsVar.e();
            addb addbVar = new addb(str, 4);
            if (true == optional2.isPresent()) {
                ((xje) optional2.get()).b((String) addbVar.a, "img_lf");
                return;
            }
            return;
        }
        aihf aihfVarCreateBuilder = asnc.a.createBuilder();
        aslh aslhVar = aslh.LOG_TYPE_INVALID_FIELD;
        aihfVarCreateBuilder.copyOnWrite();
        asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
        asncVar.d = aslhVar.I;
        asncVar.b |= 2;
        String name = drawable == null ? "null" : drawable.getClass().getName();
        aihfVarCreateBuilder.copyOnWrite();
        asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
        name.getClass();
        asncVar2.b |= SemanticState.Modal;
        asncVar2.o = name;
        nucVar.d((asnc) aihfVarCreateBuilder.build(), nslVar, "Failed to decode Animated Drawable in ByteImageLoadListener. Expected one of FrameSequenceDrawable, GifDrawable, BitmapDrawable.", new Object[0]);
        addb addbVar2 = new addb(str, 5);
        if (true == optional2.isPresent()) {
            ((xje) optional2.get()).b((String) addbVar2.a, "img_lerr");
        }
        e(nslVar, nryVar, optional);
    }

    private static boolean g(Drawable drawable) {
        return drawable instanceof FrameSequenceDrawable;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.sxu
    public final /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        byte[] bArr = (byte[]) obj2;
        this.o.b(uri, bArr);
        Uri uriC = c(uri);
        if (this.n) {
            taf.n(ape.f(new dzx(this, bArr, 7)), this.m, new aden(uriC, this.a, this.i, this.j, this.p, this.k, this.c, this.d, this.e, this.l, this.f, this.h));
            return;
        }
        try {
            f((Drawable) this.b.d(bArr), uriC, this.a, this.i, this.j, this.p, this.k, this.c, this.d, this.e, this.l, this.f, this.h);
        } catch (IOException | tzn unused) {
            Optional optional = this.f;
            addb addbVar = new addb(this, 2);
            if (true == optional.isPresent()) {
                ((xje) optional.get()).b(((adeo) addbVar.a).a, "img_lerr");
            }
            e(this.d, this.c, this.e);
        }
    }

    @Override // defpackage.sxu
    public final /* synthetic */ void iT(Object obj, Exception exc) {
        this.o.iT((Uri) obj, exc);
        addb addbVar = new addb(this, 6);
        Optional optional = this.f;
        if (true == optional.isPresent()) {
            ((xje) optional.get()).b(((adeo) addbVar.a).a, "img_lerr");
        }
        e(this.d, this.c, this.e);
    }
}
