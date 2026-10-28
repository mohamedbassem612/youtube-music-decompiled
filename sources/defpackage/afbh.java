package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afbh implements afay {
    private final float a;

    public afbh(float f) {
        this.a = f;
    }

    @Override // defpackage.afay
    public final float a(RectF rectF) {
        return this.a * Math.min(rectF.width(), rectF.height());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof afbh) && this.a == ((afbh) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((int) (this.a * 100.0f));
        sb.append('%');
        return sb.toString();
    }
}
