package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uvy {
    public final ImageView a;
    public final View b;
    public boolean c = false;
    public boolean d = false;
    public Optional e = Optional.empty();
    public final ugo f;
    public final zf g;

    public uvy(roq roqVar, aaok aaokVar, adxj adxjVar, View view) {
        View viewFindViewById = view.findViewById(R.id.trash_container);
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.trash_icon);
        this.a = imageView;
        Context context = view.getContext();
        Drawable drawableD = (!aaokVar.J() || (drawableD = aecm.p(context, arqz.nZ, R.attr.ytOverlayTextPrimary, adxjVar)) == null) ? dl.d(context, R.drawable.quantum_ic_delete_white_24) : drawableD;
        if (drawableD != null) {
            imageView.setImageDrawable(drawableD);
        }
        this.b = viewFindViewById.findViewById(R.id.trash_bg);
        this.g = new zf((Object) viewFindViewById);
        ugo ugoVarK = roqVar.k(xhb.b(39104));
        this.f = ugoVarK;
        ugoVarK.c();
    }
}
