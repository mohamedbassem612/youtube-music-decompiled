package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class azl extends azp {
    public azl(Class cls) {
        super(R.id.tag_accessibility_pane_title, cls, 8, 28);
    }

    @Override // defpackage.azp
    public final /* synthetic */ Object a(View view) {
        return azw.a(view);
    }

    @Override // defpackage.azp
    public final /* synthetic */ void b(View view, Object obj) {
        azw.c(view, (CharSequence) obj);
    }

    @Override // defpackage.azp
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
