package defpackage;

import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class unf implements Parcelable {
    public final boolean a;
    public final float b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final ufs h;
    public final audb i;
    public final boolean j;
    public final uqc k;

    public unf(boolean z, float f, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ufs ufsVar, audb audbVar, boolean z7, uqc uqcVar) {
        this.a = z;
        this.b = f;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        if (ufsVar == null) {
            throw new NullPointerException("Null creationFlow");
        }
        this.h = ufsVar;
        this.i = audbVar;
        this.j = z7;
        this.k = uqcVar;
    }

    public final boolean equals(Object obj) {
        audb audbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof unf) {
            unf unfVar = (unf) obj;
            if (this.a == unfVar.a) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(unfVar.b) && this.c == unfVar.c && this.d == unfVar.d && this.e == unfVar.e && this.f == unfVar.f && this.g == unfVar.g && this.h.equals(unfVar.h) && ((audbVar = this.i) != null ? audbVar.equals(unfVar.i) : unfVar.i == null) && this.j == unfVar.j) {
                    uqc uqcVar = this.k;
                    if (uqcVar == null) {
                        if (unfVar.k == null) {
                            return true;
                        }
                    } else if (uqcVar.equals(unfVar.k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ this.h.hashCode();
        audb audbVar = this.i;
        int iHashCode = ((((iFloatToIntBits * 1000003) ^ (audbVar == null ? 0 : audbVar.hashCode())) * 1000003) ^ (true == this.j ? 1231 : 1237)) * 1000003;
        uqc uqcVar = this.k;
        return iHashCode ^ (uqcVar != null ? uqcVar.hashCode() : 0);
    }

    public final String toString() {
        uqc uqcVar = this.k;
        audb audbVar = this.i;
        return "ImageEditorConfig{isProductAvailable=" + this.a + ", previewAspectRatio=" + this.b + ", shouldCropImage=" + this.c + ", allowEditingAnimatedImageAsStaticImage=" + this.d + ", showThumbnailList=" + this.e + ", useIconForDoneButton=" + this.f + ", isAiEditingEnabled=" + this.g + ", creationFlow=" + this.h.toString() + ", mediaEngineClient=" + String.valueOf(audbVar) + ", isFullscreenImage=" + this.j + ", manualCropToolConfig=" + String.valueOf(uqcVar) + '}';
    }

    public unf() {
        throw null;
    }
}
