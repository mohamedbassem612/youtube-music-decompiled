package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class xae extends xad {
    private final xgj k;
    private final adia l;
    private final adhv m;
    private final LinearLayout n;

    public xae(Context context, xgm xgmVar, vxe vxeVar, adhv adhvVar, vxz vxzVar) {
        super(context, xgmVar, vxeVar, vxzVar);
        this.k = new xgj(xhb.b(70099));
        this.l = adul.l(adhvVar, this.c);
        this.m = adhvVar;
        this.n = (LinearLayout) this.b.findViewById(R.id.thumbnail_holder);
    }

    @Override // defpackage.xad, defpackage.adma
    public final void b(admh admhVar) {
        super.b(admhVar);
        this.l.a();
        LinearLayout linearLayout = this.n;
        linearLayout.removeAllViews();
        linearLayout.setVisibility(8);
        this.e.setVisibility(0);
    }

    @Override // defpackage.xad
    protected final /* bridge */ /* synthetic */ int d(Object obj) {
        return 0;
    }

    @Override // defpackage.xad
    protected final /* synthetic */ int e(Object obj) {
        return ((amra) obj).e;
    }

    @Override // defpackage.xad
    protected final /* synthetic */ int g(Object obj) {
        return ((amra) obj).d;
    }

    @Override // defpackage.xad
    protected final /* bridge */ /* synthetic */ long h(Object obj) {
        return TimeUnit.SECONDS.toMillis(((amra) obj).f);
    }

    @Override // defpackage.xad, defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        amra amraVar = (amra) obj;
        super.hU(adlyVar, amraVar);
        if (amraVar.j.size() != 0) {
            for (aqmh aqmhVar : amraVar.j) {
                Context context = this.a;
                ImageView imageView = new ImageView(context);
                aiqe aiqeVar = aqmhVar.e;
                if (aiqeVar == null) {
                    aiqeVar = aiqe.a;
                }
                if ((aiqeVar.b & 1) != 0) {
                    aiqd aiqdVar = aiqeVar.c;
                    if (aiqdVar == null) {
                        aiqdVar = aiqd.a;
                    }
                    imageView.setContentDescription(aiqdVar.c);
                }
                int dimension = (int) context.getResources().getDimension(R.dimen.live_chat_ticker_thumbnail_size);
                LinearLayout linearLayout = this.n;
                linearLayout.setVisibility(0);
                linearLayout.addView(imageView, dimension, dimension);
                adul.l(this.m, imageView).f(aqmhVar, null);
            }
            this.e.setVisibility(8);
        }
    }

    @Override // defpackage.xad
    protected final /* bridge */ /* synthetic */ long i(Object obj) {
        return TimeUnit.SECONDS.toMillis(((amra) obj).g);
    }

    @Override // defpackage.xad
    protected final /* bridge */ /* synthetic */ Spanned j(Object obj) {
        return null;
    }

    @Override // defpackage.xad
    protected final /* synthetic */ xgz k() {
        return this.k;
    }

    @Override // defpackage.xad
    protected final /* synthetic */ ajwo l(Object obj) {
        ajwo ajwoVar = ((amra) obj).h;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    @Override // defpackage.xad
    protected final /* bridge */ /* synthetic */ String m(Object obj) {
        return null;
    }

    @Override // defpackage.xad
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        aqmh aqmhVar = ((amra) obj).c;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        this.l.f(aqmhVar, null);
    }
}
