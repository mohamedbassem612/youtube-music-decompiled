package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class adhn implements zsl {
    private final adhm a;
    private final Context b;

    public adhn(Context context) {
        context.getClass();
        this.b = context;
        agrf agrfVar = twm.a;
        int i = context.getResources().getDisplayMetrics().widthPixels;
        if (i > 0) {
            this.a = new adhm(i, Bitmap.Config.ARGB_8888);
        } else {
            this.a = new adhm();
        }
    }

    @Override // defpackage.zsl
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Drawable d(byte[] bArr) {
        return b(bArr);
    }

    protected final Drawable b(byte[] bArr) throws tzn {
        Context context = this.b;
        return new BitmapDrawable(context.getResources(), this.a.d(bArr));
    }
}
