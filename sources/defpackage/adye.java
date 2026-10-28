package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class adye extends qny {
    public boolean b;
    protected final Context c;

    public adye(Context context, String str) {
        super(str);
        this.c = context;
        d(context.getColor(R.color.ytm_text_color_primary));
    }

    @Override // defpackage.qny, defpackage.qnx
    public final int b() {
        return R.layout.bottom_sheet_list_checkmark_item;
    }

    public final void e(boolean z) {
        this.b = z;
        this.f = z ? this.c.getResources().getDrawable(R.drawable.quantum_ic_check_grey600_24) : null;
    }
}
