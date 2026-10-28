package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ehy extends Paint {
    public ehy(PorterDuff.Mode mode, byte[] bArr) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            int i2 = enh.a;
            super.setAlpha(Math.max(0, Math.min(255, i)));
        } else {
            int color = getColor();
            int i3 = enh.a;
            setColor((Math.max(0, Math.min(255, i)) << 24) | (color & 16777215));
        }
    }

    public ehy(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }
}
