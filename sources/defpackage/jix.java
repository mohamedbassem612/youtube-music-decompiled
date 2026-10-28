package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jix implements jiu {
    private final /* synthetic */ int $cid;
    private final int a;
    private final int b;

    public jix(int i, int i2, int i3) {
        this.$cid = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.jiu
    public final Rect a(int i) {
        if (this.$cid != 0) {
            ahno.F(i == 0);
            return new Rect(0, 0, this.b, this.a);
        }
        ahno.F(i >= 0 && i < 4);
        int i2 = this.b;
        int i3 = this.a;
        Rect rect = new Rect(0, 0, i2, i3);
        if (i == 0) {
            rect.bottom = i3 / 2;
            rect.right = i2 / 2;
        } else if (i == 1) {
            rect.left = i2 / 2;
            rect.bottom = i3 / 2;
        } else if (i == 2) {
            rect.top = i3 / 2;
            rect.right = i2 / 2;
        } else if (i == 3) {
            rect.top = i3 / 2;
            rect.left = i2 / 2;
        }
        return rect;
    }

    @Override // defpackage.jiu
    public final Rect b(Bitmap bitmap) {
        int i = this.$cid;
        int i2 = this.a;
        int i3 = this.b;
        return i != 0 ? ixt.I(i2, i3, bitmap) : ixt.I(i2, i3, bitmap);
    }
}
