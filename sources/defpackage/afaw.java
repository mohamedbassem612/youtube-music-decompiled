package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afaw implements afay {
    private final afay a;
    private final float b;

    public afaw(float f, afay afayVar) {
        while (afayVar instanceof afaw) {
            afayVar = ((afaw) afayVar).a;
            f += ((afaw) afayVar).b;
        }
        this.a = afayVar;
        this.b = f;
    }

    @Override // defpackage.afay
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof afaw) {
            afaw afawVar = (afaw) obj;
            if (this.a.equals(afawVar.a) && this.b == afawVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
