package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.ImageView;
import com.google.android.libraries.elements.adl.UpbArena;
import com.google.android.libraries.jni.UnsafeMemory;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import java.util.NoSuchElementException;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hbl implements opd {
    private static final agrf b = agrf.h("com/google/android/apps/youtube/music/elements/imageprocessors/MusicThumbnailImageProcessorHandler");
    public final wbz a;
    private final awut c;
    private final Context d;
    private final oui e;
    private final nuc f;
    private final awmd g;
    private final awmi h;
    private final vxz i;

    public hbl(awut awutVar, Context context, oui ouiVar, nuc nucVar, awmd awmdVar, wbz wbzVar, vxz vxzVar) {
        awutVar.getClass();
        context.getClass();
        ouiVar.getClass();
        nucVar.getClass();
        awmdVar.getClass();
        wbzVar.getClass();
        vxzVar.getClass();
        this.c = awutVar;
        this.d = context;
        this.e = ouiVar;
        this.f = nucVar;
        this.g = awmdVar;
        this.a = wbzVar;
        this.i = vxzVar;
        this.h = new awmp(new ebk(this, 8));
    }

    private final wby e() {
        return (wby) this.h.a();
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0105  */
    @Override // defpackage.opd
    public final /* synthetic */ Drawable a(met metVar, Bitmap bitmap, ImageView.ScaleType scaleType, ElementsServices elementsServices) {
        long j;
        float f;
        nhp nhpVarAT;
        boolean z;
        boolean z2;
        arzo arzoVar = (arzo) metVar;
        arzoVar.getClass();
        bitmap.getClass();
        scaleType.getClass();
        String strAR = arzoVar.aR();
        strAR.getClass();
        if (strAR.length() != 0) {
            awro.t(this.c, null, 0, new gme(this, arzoVar, bitmap, (awoq) null, 2), 3);
        }
        if (!arzoVar.aS() && !arzoVar.aT()) {
            return new otm(bitmap, scaleType, this.e);
        }
        Context context = this.d;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float fIntBitsToFloat = 0.0f;
        if (arzoVar.aS()) {
            if (arzoVar.f == null && (Memory.peekByte(arzoVar.c + 8) & 1) != 0) {
                arzoVar.f = new aszv(arzoVar.cp(true != arzq.a ? 12 : 32, aszw.a));
            }
            aszv aszvVar = arzoVar.f == null ? aszs.a : arzoVar.f;
            boolean z3 = aszx.a;
            j = 8;
            long j2 = true != z3 ? 44 : 24;
            long j3 = aszvVar.c + j2;
            byte bPeekByte = Memory.peekByte(j3);
            byte bPeekByte2 = Memory.peekByte(j3 + 1);
            boolean z4 = UnsafeMemory.a;
            byte b2 = true != z4 ? bPeekByte2 : bPeekByte;
            if (true == z4) {
                bPeekByte = bPeekByte2;
            }
            if (((short) ((b2 << 8) | (bPeekByte & 255))) == 3) {
                fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(aszvVar.c + (true != z3 ? 48L : 28L), false));
            }
            float fApplyDimension = TypedValue.applyDimension(1, fIntBitsToFloat, displayMetrics);
            long j4 = aszvVar.c + j2;
            byte bPeekByte3 = Memory.peekByte(j4);
            byte bPeekByte4 = Memory.peekByte(j4 + 1);
            byte b3 = true != z4 ? bPeekByte4 : bPeekByte3;
            if (true == z4) {
                bPeekByte3 = bPeekByte4;
            }
            if (((short) ((b3 << 8) | (bPeekByte3 & 255))) == 4) {
                if (Memory.peekByte(aszvVar.c + ((long) (true != z3 ? 48 : 28))) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (aszvVar.aT()) {
                nhpVarAT = nhp.aT(aszvVar.aV().f(), new UpbArena());
                z = z2;
                f = fApplyDimension;
            } else {
                z = z2;
                f = fApplyDimension;
                nhpVarAT = null;
            }
        } else {
            j = 8;
            f = 0.0f;
            nhpVarAT = null;
            z = false;
        }
        hbj hbjVar = new hbj(bitmap, scaleType, f, z, context, displayMetrics, this.f);
        if (nhpVarAT != null) {
            hbjVar.c(nhpVarAT, displayMetrics, nsl.a);
        }
        if (arzoVar.aT()) {
            try {
                if (arzoVar.h == null && (Memory.peekByte(arzoVar.c + j) & 2) != 0) {
                    arzoVar.h = new arzk(arzoVar.cp(true != arzq.a ? 16 : 40, arzj.a), 0);
                }
                hbjVar.a((anyg) aihn.parseFrom(anyg.a, (arzoVar.h == null ? arzi.a : arzoVar.h).f()), this.i);
            } catch (aiik e) {
                ((agrc) ((agrc) b.c()).j(e).k("com/google/android/apps/youtube/music/elements/imageprocessors/MusicThumbnailImageProcessorHandler", "apply", 121, "MusicThumbnailImageProcessorHandler.kt")).t("Error converting MusicThumbnailImageOverlay from UPB to Message Lite");
            }
        }
        return hbjVar;
    }

    @Override // defpackage.opd
    public final /* synthetic */ Drawable b(met metVar, Drawable drawable, ImageView.ScaleType scaleType, ElementsServices elementsServices) {
        return drawable instanceof BitmapDrawable ? a(metVar, ((BitmapDrawable) drawable).getBitmap(), scaleType, elementsServices) : drawable;
    }

    @Override // defpackage.opd
    public final mep c() {
        mep mepVar = arzo.d;
        mepVar.getClass();
        return mepVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v9 */
    public final Object d(arzo arzoVar, Bitmap bitmap, awoq awoqVar) throws Throwable {
        hbk hbkVar;
        Exception e;
        Object obj;
        if (awoqVar instanceof hbk) {
            hbkVar = (hbk) awoqVar;
            int i = hbkVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hbkVar.d = i - Integer.MIN_VALUE;
            } else {
                hbkVar = new hbk(this, awoqVar);
            }
        } else {
            hbkVar = new hbk(this, awoqVar);
        }
        Object objK = hbkVar.b;
        awox awoxVar = awox.a;
        int i2 = hbkVar.d;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    String str = hbkVar.e;
                    bitmap = (Bitmap) hbkVar.a;
                    atqp.j(objK);
                    arzoVar = str;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = (String) hbkVar.a;
                    try {
                        atqp.j(objK);
                    } catch (Exception e2) {
                        e = e2;
                        ((agrc) ((agrc) b.c()).j(e).k("com/google/android/apps/youtube/music/elements/imageprocessors/MusicThumbnailImageProcessorHandler", "maybeUpdateColorPaletteSetEntity", 154, "MusicThumbnailImageProcessorHandler.kt")).w("Error committing color palette entity for key: %s", obj);
                    }
                }
                return awmy.a;
            }
            atqp.j(objK);
            String strAR = arzoVar.aR();
            avlm avlmVarG = e().g(strAR);
            hbkVar.a = bitmap;
            hbkVar.e = strAR;
            hbkVar.d = 1;
            objK = avkz.k(avlmVarG, hbkVar);
            arzoVar = strAR;
            if (objK == awoxVar) {
                return awoxVar;
            }
        } catch (NoSuchElementException unused) {
            iwl iwlVarA = ((iwm) this.g.io()).a(bitmap);
            try {
                wer werVarE = e().e();
                anme anmeVarE = anmg.e(arzoVar);
                anmeVarE.am(kro.aN(iwlVarA.f));
                anmeVarE.an(kro.aN(iwlVarA.e));
                werVarE.m(anmeVarE);
                avlb avlbVarB = werVarE.b();
                hbkVar.a = arzoVar;
                hbkVar.e = null;
                hbkVar.d = 2;
                if (avkz.j(avlbVarB, hbkVar) == awoxVar) {
                    return awoxVar;
                }
            } catch (Exception e3) {
                Object obj2 = arzoVar;
                e = e3;
                obj = obj2;
                ((agrc) ((agrc) b.c()).j(e).k("com/google/android/apps/youtube/music/elements/imageprocessors/MusicThumbnailImageProcessorHandler", "maybeUpdateColorPaletteSetEntity", 154, "MusicThumbnailImageProcessorHandler.kt")).w("Error committing color palette entity for key: %s", obj);
            }
        } catch (Throwable th) {
            ((agrc) ((agrc) b.c()).j(th).k("com/google/android/apps/youtube/music/elements/imageprocessors/MusicThumbnailImageProcessorHandler", "maybeUpdateColorPaletteSetEntity", 161, "MusicThumbnailImageProcessorHandler.kt")).w("Error retrieving MusicColorSamplePaletteSetEntity from store for key: %s", arzoVar);
        }
        return awmy.a;
    }
}
