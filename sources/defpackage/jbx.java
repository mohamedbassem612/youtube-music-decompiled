package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jbx implements adma {
    public ajwo a;
    private final adhv b;
    private final ImageView c;
    private final adhr d;

    public jbx(Context context, adhv adhvVar, vxe vxeVar, ViewGroup viewGroup) {
        this.b = adhvVar;
        ImageView imageView = (ImageView) LayoutInflater.from(context).inflate(R.layout.collaboration_user, viewGroup, false);
        this.c = imageView;
        imageView.setOnClickListener(new gdp(this, vxeVar, 16));
        this.d = adhr.a().a();
    }

    @Override // defpackage.adma
    public final View a() {
        return this.c;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        admhVar.e(this.c);
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        aouy aouyVar = (aouy) obj;
        int i = aouyVar.b & 2;
        adhv adhvVar = this.b;
        if (i != 0) {
            ImageView imageView = this.c;
            aqmh aqmhVar = aouyVar.d;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            adhvVar.j(imageView, aqmhVar, this.d);
        } else {
            adhvVar.f(this.c);
        }
        ImageView imageView2 = this.c;
        Context context = imageView2.getContext();
        alay alayVar = aouyVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        ajwo ajwoVar = null;
        imageView2.setContentDescription(context.getString(R.string.accessibility_channel_for_user, ackj.k(null, alayVar, null, false)));
        if ((aouyVar.b & 8) != 0 && (ajwoVar = aouyVar.e) == null) {
            ajwoVar = ajwo.a;
        }
        this.a = ajwoVar;
    }
}
