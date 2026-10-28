package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class azn extends azp {
    public azn(Class cls) {
        super(R.id.tag_accessibility_heading, cls, 0, 28);
    }

    @Override // defpackage.azp
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(azw.e(view));
    }

    @Override // defpackage.azp
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        azw.b(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.azp
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !f((Boolean) obj, (Boolean) obj2);
    }
}
