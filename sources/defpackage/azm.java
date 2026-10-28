package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class azm extends azp {
    public azm(Class cls) {
        super(R.id.tag_state_description, cls, 64, 30);
    }

    @Override // defpackage.azp
    public final /* synthetic */ Object a(View view) {
        return azy.b(view);
    }

    @Override // defpackage.azp
    public final /* synthetic */ void b(View view, Object obj) {
        azy.c(view, (CharSequence) obj);
    }

    @Override // defpackage.azp
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
