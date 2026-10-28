package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iks implements View.OnClickListener {
    private final /* synthetic */ int $cid;

    public /* synthetic */ iks(int i) {
        this.$cid = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$cid) {
            case 0:
                int i = ikt.a;
                break;
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 2:
                int i2 = iwj.A;
                Context context = view.getContext();
                sxy.f(context, Uri.parse(new tyt(Uri.parse(context.getResources().getString(R.string.uri_privacy_policy))).toString()));
                break;
            case 4:
                tuk.i(view.findFocus());
                break;
            default:
                String str = vjq.h;
                break;
        }
    }
}
