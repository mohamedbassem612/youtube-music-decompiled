package defpackage;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class hzj {
    public final AlertDialog a;
    public final adia b;
    public final adia c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public final ImageView g;
    final /* synthetic */ hzk h;

    public hzj(hzk hzkVar) {
        this.h = hzkVar;
        View viewInflate = LayoutInflater.from(hzkVar.a).inflate(R.layout.music_upsell_dialog_with_header_images, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.background_image);
        this.f = imageView;
        this.b = new adia(hzkVar.b, imageView, false);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.logo);
        this.g = imageView2;
        this.c = new adia(hzkVar.b, imageView2, false);
        this.d = (TextView) viewInflate.findViewById(R.id.dialog_title);
        this.e = (TextView) viewInflate.findViewById(R.id.dialog_message);
        ((TextView) viewInflate.findViewById(R.id.dismiss_button)).setVisibility(8);
        ((TextView) viewInflate.findViewById(R.id.action_button)).setVisibility(8);
        this.a = hzkVar.h.g(hzkVar.a).setView(viewInflate).setNegativeButton(R.string.upsell_audio_cast_dismiss, hzkVar).setPositiveButton(R.string.upsell_audio_cast_action, hzkVar).create();
    }
}
