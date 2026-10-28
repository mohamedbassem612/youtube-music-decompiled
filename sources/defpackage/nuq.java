package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;
import com.google.android.libraries.jni.UnsafeMemory;
import com.google.android.libraries.multiplatform.elements.ElementsException;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import j$.util.Optional;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nuq {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, met] */
    /* JADX WARN: Type inference failed for: r0v18, types: [otm] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, met] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.support.rastermill.FrameSequenceDrawable] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r10v9 */
    public static Drawable a(Drawable drawable, atiq atiqVar, ElementsServices elementsServices) {
        float fIntBitsToFloat;
        ?? otmVar;
        Drawable drawableB;
        Optional optionalOf = atiqVar.aU() ? Optional.of(atiqVar.aW()) : Optional.empty();
        int iAX = atiqVar.aX();
        if (Memory.peekByte(FlagServices.b().c + 22) != 0) {
            if (optionalOf.isPresent()) {
                ImageView.ScaleType scaleTypeB = oty.b(iAX);
                try {
                    ?? r0 = optionalOf.get();
                    int iAD = ksy.aD(r0);
                    opd opdVar = (opd) elementsServices.f().a(iAD);
                    if (opdVar == null) {
                        throw new oot(a.bR(iAD, "Unknown ImageProcessor extension: "));
                    }
                    drawableB = opdVar.b(((mew) r0).d(opdVar.c()), drawable, scaleTypeB, elementsServices);
                } catch (ElementsException e) {
                    elementsServices.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "Error applying image processor.", e);
                    otmVar = drawable;
                }
            } else {
                otmVar = drawable;
            }
            if (otmVar == drawable && (drawable instanceof BitmapDrawable)) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                ImageView.ScaleType scaleTypeB2 = oty.b(iAX);
                if (scaleTypeB2 == ImageView.ScaleType.CENTER_INSIDE) {
                    otmVar = drawableB;
                    scaleTypeB2 = ImageView.ScaleType.FIT_CENTER;
                }
                otmVar = drawableB;
                drawable = new otm(bitmapDrawable.getBitmap(), scaleTypeB2, elementsServices.n());
            } else {
                otmVar = drawableB;
                otmVar = drawableB;
                drawable = otmVar;
            }
        } else {
            drawableA = null;
            Drawable drawableA = null;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) drawable;
                ImageView.ScaleType scaleTypeB3 = oty.b(iAX);
                if (optionalOf.isPresent()) {
                    try {
                        ?? r1 = optionalOf.get();
                        Bitmap bitmap = bitmapDrawable2.getBitmap();
                        int iAD2 = ksy.aD(r1);
                        opd opdVar2 = (opd) elementsServices.f().a(iAD2);
                        if (opdVar2 == null) {
                            throw new oot(a.bR(iAD2, "Unknown ImageProcessor extension: "));
                        }
                        drawableA = opdVar2.a(((mew) r1).d(opdVar2.c()), bitmap, scaleTypeB3, elementsServices);
                    } catch (ElementsException e2) {
                        elementsServices.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "Error applying image processor.", e2);
                    }
                }
                if (drawableA == null) {
                    otmVar = new otm(bitmapDrawable2.getBitmap(), scaleTypeB3, elementsServices.n());
                    otmVar = drawableB;
                    otmVar = drawableB;
                    drawable = otmVar;
                } else {
                    drawable = drawableA;
                }
            } else if (drawable instanceof FrameSequenceDrawable) {
                drawable = (FrameSequenceDrawable) drawable;
                if (optionalOf.isPresent()) {
                    Object obj = optionalOf.get();
                    mep mepVar = aszv.d;
                    mew mewVar = (mew) obj;
                    aszv aszvVar = mewVar.e(mepVar) ? (aszv) mewVar.d(mepVar) : null;
                    if (aszvVar != null) {
                        boolean z = aszx.a;
                        long j = aszvVar.c + ((long) (true != z ? 44 : 24));
                        byte bPeekByte = Memory.peekByte(j);
                        byte bPeekByte2 = Memory.peekByte(1 + j);
                        boolean z2 = UnsafeMemory.a;
                        byte b = true != z2 ? bPeekByte2 : bPeekByte;
                        if (true == z2) {
                            bPeekByte = bPeekByte2;
                        }
                        if (((short) ((b << 8) | (bPeekByte & 255))) == 3) {
                            fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(aszvVar.c + (true != z ? 48L : 28L), false));
                        } else {
                            fIntBitsToFloat = 0.0f;
                        }
                        drawable.setCornerRadius((int) (fIntBitsToFloat * elementsServices.a()));
                    }
                }
            }
        }
        drawable.setAutoMirrored(Memory.peekByte(atiqVar.c + 9) != 0);
        oty.c(drawable, atiqVar);
        return drawable;
    }

    public static ImageView.ScaleType b(Drawable drawable, atiq atiqVar) {
        return !(drawable instanceof otm) ? oty.b(atiqVar.aX()) : ImageView.ScaleType.FIT_XY;
    }
}
