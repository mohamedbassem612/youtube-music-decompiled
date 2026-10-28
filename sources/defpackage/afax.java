package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afax implements afay {
    private final float a;

    public afax(float f) {
        this.a = f;
    }

    @Override // defpackage.afay
    public final float a(RectF rectF) {
        return ast.b(this.a, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof afax) && this.a == ((afax) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
