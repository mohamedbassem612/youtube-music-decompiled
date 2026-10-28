package defpackage;

import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adho extends adhn {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/image/BytesToFrameSequenceDrawableResponseConverter");

    @Override // defpackage.adhn
    /* JADX INFO: renamed from: a */
    public final Drawable d(byte[] bArr) {
        int length = bArr.length;
        if ((length >= 21 && bArr[0] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70 && bArr[8] == 87 && bArr[9] == 69 && bArr[10] == 66 && bArr[11] == 80 && bArr[12] == 86 && bArr[13] == 80 && bArr[14] == 56 && bArr[15] == 88 && (bArr[20] & 2) != 0) || (length >= 3 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70)) {
            FrameSequence frameSequenceDecodeByteArray = null;
            try {
                frameSequenceDecodeByteArray = FrameSequence.decodeByteArray(bArr);
            } catch (IllegalArgumentException e) {
                e = e;
                ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/rendering/image/BytesToFrameSequenceDrawableResponseConverter", "convertResponse", '\"', "BytesToFrameSequenceDrawableResponseConverter.java")).t("Error decoding GIF or WebP.");
            } catch (IllegalStateException e2) {
                e = e2;
                ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/rendering/image/BytesToFrameSequenceDrawableResponseConverter", "convertResponse", '\"', "BytesToFrameSequenceDrawableResponseConverter.java")).t("Error decoding GIF or WebP.");
            } catch (UnsatisfiedLinkError e3) {
                ((agrc) ((agrc) ((agrc) a.b()).j(e3)).k("com/google/android/libraries/youtube/rendering/image/BytesToFrameSequenceDrawableResponseConverter", "convertResponse", '$', "BytesToFrameSequenceDrawableResponseConverter.java")).t("Error loading rastermill native library.");
            }
            if (frameSequenceDecodeByteArray != null) {
                FrameSequenceDrawable frameSequenceDrawable = new FrameSequenceDrawable(frameSequenceDecodeByteArray);
                frameSequenceDrawable.setLoopBehavior(2);
                return frameSequenceDrawable;
            }
        }
        return b(bArr);
    }

    @Override // defpackage.adhn, defpackage.zsl
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        return d((byte[]) obj);
    }
}
