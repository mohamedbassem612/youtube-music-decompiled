package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.support.rastermill.FrameSequenceDrawable;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nqj extends fek {
    public final fkw c;
    private final nci d;
    private final boolean e;
    private final int f;
    private final nuv g;
    private final ncl h;
    private final nci i;
    private final nci j;
    private final nxs k;
    private final nuc l;
    private final nry m;
    private final CommandOuterClass$Command n;
    private final CommandOuterClass$Command o;
    private final nqo p;
    private final nsl q;
    private boolean r;
    private final nub s;
    private final int t;
    private final hed u;

    public nqj(fkw fkwVar, ImageView imageView, nci nciVar, boolean z, int i, nuv nuvVar, ncl nclVar, nci nciVar2, nci nciVar3, nxs nxsVar, nuc nucVar, hed hedVar, nry nryVar, CommandOuterClass$Command commandOuterClass$Command, CommandOuterClass$Command commandOuterClass$Command2, int i2, nsl nslVar, nub nubVar, nqo nqoVar) {
        super(imageView);
        this.r = false;
        this.c = fkwVar;
        this.d = nciVar;
        this.e = z;
        this.f = i;
        this.g = nuvVar;
        this.h = nclVar;
        this.i = nciVar2;
        this.j = nciVar3;
        this.k = nxsVar;
        this.l = nucVar;
        this.u = hedVar;
        this.m = nryVar;
        this.n = commandOuterClass$Command;
        this.o = commandOuterClass$Command2;
        this.t = i2;
        this.q = nslVar;
        this.s = nubVar;
        this.p = nqoVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x010e  */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, met, nck] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, nuc] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, nuc] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, nuc] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.Map] */
    private final Drawable r(Drawable drawable, nci nciVar, nub nubVar) {
        agev agfaVar;
        agev agfaVar2;
        Drawable mfjVar;
        hed hedVar;
        if (nubVar != null && nubVar.i) {
            if (nciVar.m()) {
                nck nckVarH = nciVar.h();
                nckVarH.getClass();
                agfaVar2 = new agfa(nckVarH);
            } else {
                agfaVar2 = agdf.a;
            }
            int iO = nciVar.o();
            agfa agfaVar3 = new agfa(nubVar);
            ImageView.ScaleType scaleTypeW = w(iO, agfaVar3);
            if (!agfaVar2.g() || (hedVar = this.u) == null) {
                mfjVar = null;
            } else {
                ?? C = agfaVar2.c();
                nsl nslVar = this.q;
                int[] iArrAG = ksy.aG(C);
                if (iArrAG.length != 0) {
                    int i = iArrAG[0];
                    agkz agkzVar = mer.a;
                    Integer numValueOf = Integer.valueOf(i);
                    if (agkzVar.contains(numValueOf)) {
                        hed hedVar2 = (hed) hedVar.b.get(numValueOf);
                        if (hedVar2 == null) {
                            aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                            aslh aslhVar = aslh.LOG_TYPE_UNKNOWN_EXTENSION;
                            aihfVarCreateBuilder.copyOnWrite();
                            asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                            asncVar.d = aslhVar.I;
                            asncVar.b |= 2;
                            aihfVarCreateBuilder.cC(i);
                            hedVar.a.d((asnc) aihfVarCreateBuilder.build(), nslVar, "Unknown Flatbuffer extension in ImageProcessorExtensionResolver.", new Object[0]);
                            mfjVar = null;
                        } else {
                            myh myhVar = (myh) C.d(myh.D);
                            if (drawable instanceof BitmapDrawable) {
                                mfjVar = hedVar2.h(myhVar, ((BitmapDrawable) drawable).getBitmap(), scaleTypeW, nslVar);
                            } else {
                                if (drawable instanceof VectorDrawable) {
                                    VectorDrawable vectorDrawable = (VectorDrawable) drawable;
                                    if (myhVar.t()) {
                                        qnl.bF(vectorDrawable, myhVar.m());
                                    }
                                } else if (drawable instanceof FrameSequenceDrawable) {
                                    FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) drawable;
                                    if (myhVar.q()) {
                                        frameSequenceDrawable.setCornerRadius((int) TypedValue.applyDimension(1, myhVar.h(), (DisplayMetrics) hedVar2.a));
                                    }
                                }
                                mfjVar = drawable;
                            }
                        }
                    } else {
                        agke agkeVarAF = ksy.aF(C, i);
                        Pair pair = (Pair) hedVar.c.get(numValueOf);
                        if (pair == null) {
                            aihf aihfVarCreateBuilder2 = asnc.a.createBuilder();
                            aslh aslhVar2 = aslh.LOG_TYPE_UNKNOWN_EXTENSION;
                            aihfVarCreateBuilder2.copyOnWrite();
                            asnc asncVar2 = (asnc) aihfVarCreateBuilder2.instance;
                            asncVar2.d = aslhVar2.I;
                            asncVar2.b |= 2;
                            aihfVarCreateBuilder2.cC(i);
                            hedVar.a.d((asnc) aihfVarCreateBuilder2.build(), nslVar, "ImageProcessorExtensionResolver: Unknown PB image processor extension.", new Object[0]);
                        } else {
                            try {
                                mfjVar = ((nuw) pair.first).b(qnl.bt(agkeVarAF, (aiix) pair.second, ExtensionRegistryLite.getGeneratedRegistry()), drawable, scaleTypeW, nslVar);
                            } catch (aiik unused) {
                                aihf aihfVarCreateBuilder3 = asnc.a.createBuilder();
                                aslh aslhVar3 = aslh.LOG_TYPE_UNKNOWN_EXTENSION;
                                aihfVarCreateBuilder3.copyOnWrite();
                                asnc asncVar3 = (asnc) aihfVarCreateBuilder3.instance;
                                asncVar3.d = aslhVar3.I;
                                asncVar3.b |= 2;
                                aihfVarCreateBuilder3.cC(i);
                                hedVar.a.d((asnc) aihfVarCreateBuilder3.build(), nslVar, "Failed to parse PB Image Processor Extension in ImageProcessorExtensionResolver.", new Object[0]);
                                mfjVar = null;
                            }
                        }
                        mfjVar = null;
                    }
                } else {
                    mfjVar = null;
                }
            }
            if (mfjVar != null) {
                u(mfjVar);
            } else if (drawable instanceof BitmapDrawable) {
                mfjVar = new mfj(((BitmapDrawable) drawable).getBitmap(), scaleTypeW, this.l, agfaVar3);
                u(mfjVar);
            } else {
                u(drawable);
            }
            drawable = mfjVar;
        } else if (drawable instanceof BitmapDrawable) {
            if (nciVar.m()) {
                nck nckVarH2 = nciVar.h();
                nckVarH2.getClass();
                agfaVar = new agfa(nckVarH2);
            } else {
                agfaVar = agdf.a;
            }
            drawable = v(agfaVar, nciVar.o(), ((BitmapDrawable) drawable).getBitmap(), agev.h(nubVar));
        } else if (drawable instanceof FrameSequenceDrawable) {
            FrameSequenceDrawable frameSequenceDrawable2 = (FrameSequenceDrawable) drawable;
            myh myhVarBD = qnl.bD(nciVar);
            if (myhVarBD != null) {
                frameSequenceDrawable2.setCornerRadius((int) TypedValue.applyDimension(1, myhVarBD.h(), ((ImageView) this.a).getContext().getResources().getDisplayMetrics()));
            }
        } else if (nubVar != null && nubVar.h && (drawable instanceof VectorDrawable)) {
            VectorDrawable vectorDrawable2 = (VectorDrawable) drawable;
            myh myhVarBD2 = qnl.bD(nciVar);
            if (myhVarBD2 != null && myhVarBD2.t()) {
                qnl.bF(vectorDrawable2, myhVarBD2.m());
            }
        }
        if (!(drawable instanceof mfj)) {
            boolean z = nubVar != null && nubVar.e;
            boolean z2 = nubVar != null && nubVar.f;
            int i2 = -1;
            if (nubVar != null && z2) {
                i2 = nubVar.g;
            }
            ((ImageView) this.a).setScaleType(qnl.bI(nciVar.o(), z, z2, i2));
        }
        drawable.setAutoMirrored(nciVar.k());
        if (this.f <= 0 || !nciVar.equals(this.d)) {
            qnl.bH(drawable, nciVar);
        } else {
            drawable.setColorFilter(null);
        }
        return drawable;
    }

    private final Drawable s(Drawable drawable, nci nciVar) {
        nub nubVar = this.s;
        if (nubVar == null || !nubVar.j || drawable != null || nciVar == null || nciVar.g() != 0 || !nciVar.m()) {
            return drawable;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
        nck nckVarH = nciVar.h();
        nckVarH.getClass();
        return v(new agfa(nckVarH), nciVar.o(), bitmapCreateBitmap, new agfa(nubVar));
    }

    private static void t(AnimatedImageDrawable animatedImageDrawable) {
        animatedImageDrawable.setRepeatCount(-1);
        animatedImageDrawable.start();
    }

    private final void u(Drawable drawable) {
        nqo nqoVar = this.p;
        if (nqoVar != null) {
            if (drawable instanceof mfj) {
                ((mfj) drawable).p = nqoVar.a();
            }
            if (drawable instanceof mng) {
                ((mng) drawable).q = nqoVar.a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nuc] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, nuc] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, nuc] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, met, nck] */
    private final Drawable v(agev agevVar, int i, Bitmap bitmap, agev agevVar2) {
        hed hedVar;
        boolean zG = agevVar.g();
        ImageView.ScaleType scaleTypeW = w(i, agevVar2);
        Drawable mfjVar = null;
        if (zG && (hedVar = this.u) != null) {
            ?? C = agevVar.c();
            nsl nslVar = this.q;
            int[] iArrAG = ksy.aG(C);
            if (iArrAG.length != 0) {
                int i2 = iArrAG[0];
                if (mer.a(i2)) {
                    hed hedVar2 = (hed) hedVar.b.get(Integer.valueOf(i2));
                    if (hedVar2 == null) {
                        aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                        aslh aslhVar = aslh.LOG_TYPE_UNKNOWN_EXTENSION;
                        aihfVarCreateBuilder.copyOnWrite();
                        asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                        asncVar.d = aslhVar.I;
                        asncVar.b |= 2;
                        aihfVarCreateBuilder.cC(i2);
                        hedVar.a.d((asnc) aihfVarCreateBuilder.build(), nslVar, "Unknown Flatbuffer extension in ImageProcessorExtensionResolver.", new Object[0]);
                    } else {
                        mfjVar = hedVar2.h((myh) C.d(myh.D), bitmap, scaleTypeW, nslVar);
                    }
                } else {
                    agke agkeVarAF = ksy.aF(C, i2);
                    Pair pair = (Pair) hedVar.c.get(Integer.valueOf(i2));
                    if (pair == null) {
                        aihf aihfVarCreateBuilder2 = asnc.a.createBuilder();
                        aslh aslhVar2 = aslh.LOG_TYPE_UNKNOWN_EXTENSION;
                        aihfVarCreateBuilder2.copyOnWrite();
                        asnc asncVar2 = (asnc) aihfVarCreateBuilder2.instance;
                        asncVar2.d = aslhVar2.I;
                        asncVar2.b |= 2;
                        aihfVarCreateBuilder2.cC(i2);
                        hedVar.a.d((asnc) aihfVarCreateBuilder2.build(), nslVar, "ImageProcessorExtensionResolver: Unknown PB image processor extension.", new Object[0]);
                    } else {
                        try {
                            mfjVar = ((nuw) pair.first).a(qnl.bt(agkeVarAF, (aiix) pair.second, ExtensionRegistryLite.getGeneratedRegistry()), bitmap, scaleTypeW, nslVar);
                        } catch (aiik unused) {
                            aihf aihfVarCreateBuilder3 = asnc.a.createBuilder();
                            aslh aslhVar3 = aslh.LOG_TYPE_UNKNOWN_EXTENSION;
                            aihfVarCreateBuilder3.copyOnWrite();
                            asnc asncVar3 = (asnc) aihfVarCreateBuilder3.instance;
                            asncVar3.d = aslhVar3.I;
                            asncVar3.b |= 2;
                            aihfVarCreateBuilder3.cC(i2);
                            hedVar.a.d((asnc) aihfVarCreateBuilder3.build(), nslVar, "Failed to parse PB Image Processor Extension in ImageProcessorExtensionResolver.", new Object[0]);
                        }
                    }
                }
            }
        }
        if (mfjVar == null) {
            mfjVar = new mfj(bitmap, scaleTypeW, this.l, agevVar2);
        }
        u(mfjVar);
        return mfjVar;
    }

    private static final ImageView.ScaleType w(int i, agev agevVar) {
        boolean z = agevVar.g() && ((nub) agevVar.c()).e;
        boolean z2 = agevVar.g() && ((nub) agevVar.c()).f;
        int i2 = -1;
        if (z2 && agevVar.g()) {
            i2 = ((nub) agevVar.c()).g;
        }
        ImageView.ScaleType scaleTypeBI = qnl.bI(i, z, z2, i2);
        return (z || scaleTypeBI != ImageView.ScaleType.CENTER_INSIDE) ? scaleTypeBI : ImageView.ScaleType.FIT_CENTER;
    }

    @Override // defpackage.fek, defpackage.fef, defpackage.fem
    public final void a(Drawable drawable) {
        nuv nuvVar;
        q();
        if (!this.e && (nuvVar = this.g) != null) {
            View view = this.a;
            fkw fkwVar = this.c;
            int iHashCode = view.hashCode();
            new Size(fkwVar.a, fkwVar.b);
            nuvVar.c(iHashCode);
        }
        nci nciVar = this.j;
        Drawable drawableS = s(drawable, nciVar);
        if (drawableS != null && nciVar != null) {
            drawableS = r(drawableS, nciVar, this.s);
            if (Build.VERSION.SDK_INT >= 28 && pj$$ExternalSyntheticApiModelOutline0.m916m((Object) drawableS)) {
                t(pj$$ExternalSyntheticApiModelOutline0.m((Object) drawableS));
            }
        }
        CommandOuterClass$Command commandOuterClass$Command = this.o;
        if (commandOuterClass$Command != null) {
            this.m.a(commandOuterClass$Command, nrv.d().a()).D();
        }
        super.a(drawableS);
    }

    @Override // defpackage.fek, defpackage.fem
    public final /* bridge */ /* synthetic */ void b(Object obj, fev fevVar) {
        nuv nuvVar;
        nuv nuvVar2;
        Drawable drawableR = (Drawable) obj;
        q();
        boolean z = this.e;
        if (!z && (nuvVar2 = this.g) != null) {
            nuvVar2.f(this.a.hashCode(), 0);
        }
        AtomicBoolean atomicBoolean = (AtomicBoolean) ((ImageView) this.a).getTag(R.id.elements_image_ready);
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        nci nciVar = this.d;
        if (nciVar != null) {
            drawableR = r(drawableR, nciVar, this.s);
        }
        CommandOuterClass$Command commandOuterClass$Command = this.n;
        if (commandOuterClass$Command != null) {
            this.m.a(commandOuterClass$Command, nrv.d().a()).D();
        }
        super.b(drawableR, fevVar);
        nxs nxsVar = this.k;
        Bitmap bitmap = null;
        if (nxsVar != null) {
            if (drawableR instanceof FrameSequenceDrawable) {
                nxsVar.c((FrameSequenceDrawable) drawableR);
            } else if (drawableR instanceof fce) {
                nxsVar.d((fce) drawableR);
            }
            int i = this.t;
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            if (i2 == 0 || i2 == 1) {
                nxsVar.e();
            } else if (i2 == 2) {
                nxsVar.f();
            }
        }
        if (!z || (nuvVar = this.g) == null) {
            return;
        }
        View view = this.a;
        fkw fkwVar = this.c;
        int iHashCode = view.hashCode();
        Size size = new Size(fkwVar.a, fkwVar.b);
        if (drawableR instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawableR).getBitmap();
        } else if (drawableR instanceof mfj) {
            bitmap = ((mfj) drawableR).m;
        }
        if (bitmap != null) {
            new Size(bitmap.getWidth(), bitmap.getHeight());
        }
        nuvVar.g(iHashCode, nciVar, size, this.q.e("null"));
    }

    @Override // defpackage.fek, defpackage.fef, defpackage.fem
    public final void e(Drawable drawable) {
        q();
        nci nciVar = this.i;
        Drawable drawableS = s(drawable, nciVar);
        if (drawableS != null && nciVar != null) {
            drawableS = r(drawableS, nciVar, this.s);
            if (Build.VERSION.SDK_INT >= 28 && pj$$ExternalSyntheticApiModelOutline0.m916m((Object) drawableS)) {
                t(pj$$ExternalSyntheticApiModelOutline0.m((Object) drawableS));
            }
        }
        super.e(drawableS);
    }

    @Override // defpackage.feo, defpackage.fem
    public final void g(fed fedVar) {
        fkw fkwVar = this.c;
        fedVar.d(fkwVar.a, fkwVar.b);
    }

    @Override // defpackage.fek, defpackage.fef, defpackage.fem
    public final void gG(Drawable drawable) {
        nuv nuvVar = this.g;
        if (nuvVar != null) {
            nuvVar.d(this.a.hashCode());
        }
        nci nciVar = this.i;
        Drawable drawableS = s(drawable, nciVar);
        if (drawableS != null && nciVar != null) {
            drawableS = r(drawableS, nciVar, this.s);
        }
        super.gG(drawableS);
    }

    @Override // defpackage.fek
    protected final /* bridge */ /* synthetic */ void i(Object obj) {
        ((ImageView) this.a).setImageDrawable((Drawable) obj);
    }

    final void q() {
        if (this.r) {
            return;
        }
        this.r = true;
        nuv nuvVar = this.g;
        if (nuvVar != null) {
            View view = this.a;
            ncl nclVar = this.h;
            nsl nslVar = this.q;
            int iHashCode = view.hashCode();
            agfr agfrVar = nqm.a;
            adfx adfxVarI = nslVar.i();
            nuvVar.e(iHashCode, nclVar, adfxVarI == null ? null : adfxVarI.a.i());
        }
    }
}
