package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class qny implements qnx {
    public final String d;
    public ColorStateList e = null;
    public Drawable f = null;
    public Drawable g = null;

    public qny(String str) {
        this.d = str;
    }

    @Override // defpackage.qnx
    public int b() {
        return R.layout.bottom_sheet_list_item;
    }

    @Override // defpackage.qnx
    public boolean c() {
        return true;
    }

    public final void d(int i) {
        this.e = ColorStateList.valueOf(i);
    }
}
