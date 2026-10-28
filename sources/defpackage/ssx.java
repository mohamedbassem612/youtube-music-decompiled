package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ssx implements adme {
    final /* synthetic */ ssz a;

    public ssx(ssz sszVar) {
        this.a = sszVar;
    }

    @Override // defpackage.adme
    public final /* bridge */ /* synthetic */ adma a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) tuk.e(viewGroup, R.id.emoji_picker_stub, R.id.emoji_picker);
        ssz sszVar = this.a;
        return sszVar.M.p(sszVar.n, viewGroup2);
    }
}
