package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Size;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ezp implements ImageDecoder$OnHeaderDecodedListener {
    private final fax a = fax.a();
    private final int b;
    private final int c;
    private final etg d;
    private final fam e;
    private final boolean f;
    private final etz g;
    private final boolean h;
    private final boolean i;

    public ezp(int i, int i2, ety etyVar, boolean z) {
        this.b = i;
        this.c = i2;
        this.i = z;
        this.d = (etg) etyVar.b(fap.a);
        this.e = (fam) etyVar.b(fam.g);
        etx etxVar = fap.d;
        this.f = etyVar.b(etxVar) != null && ((Boolean) etyVar.b(etxVar)).booleanValue();
        this.g = (etz) etyVar.b(fap.b);
        Boolean bool = (Boolean) etyVar.b(fap.f);
        this.h = bool != null && bool.booleanValue();
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        fax faxVar = this.a;
        int width = this.b;
        int height = this.c;
        if (faxVar.b(width, height, this.f, this.h)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == etg.b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new ezo());
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fA = this.e.a(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fA);
        float height2 = fA * size.getHeight();
        boolean z = this.i;
        int iRound2 = Math.round(height2);
        if (z) {
            iRound = Math.max(1, iRound);
            iRound2 = Math.max(1, iRound2);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        etz etzVar = this.g;
        if (etzVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((etzVar == etz.b && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
