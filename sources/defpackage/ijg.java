package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ijg implements adma {
    public final vxe a;
    public final tbt b;
    public final Executor c;
    public final iiw d;
    public aosu e;
    private final Context f;
    private final View g;
    private final TextView h;
    private final ImageView i;
    private final aduv j;

    public ijg(tbt tbtVar, Executor executor, aduv aduvVar, Context context, vxe vxeVar, iiw iiwVar) {
        this.f = context;
        this.a = vxeVar;
        this.b = tbtVar;
        this.c = executor;
        this.j = aduvVar;
        this.d = iiwVar;
        View viewInflate = View.inflate(context, R.layout.playlist_add_to_entry, null);
        this.g = viewInflate;
        this.h = (TextView) viewInflate.findViewById(R.id.title);
        this.i = (ImageView) viewInflate.findViewById(R.id.privacy_badge);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.g;
    }

    public final fv d(aosu aosuVar, int i) {
        fu fuVar = new fu(this.f);
        fuVar.i(R.string.are_you_sure);
        fuVar.d(i);
        fuVar.setPositiveButton(R.string.save_to_playlist, new ijf((Object) this, (aihn) aosuVar, 0));
        fuVar.setNegativeButton(android.R.string.cancel, new dkh(this, 5, null));
        fuVar.g(new gxt(this, 5));
        return fuVar.create();
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        aosu aosuVar = (aosu) obj;
        this.e = aosuVar;
        alay alayVar = aosuVar.d;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        tuk.u(this.h, ackj.k(null, alayVar, null, false));
        ImageView imageView = this.i;
        aduv aduvVar = this.j;
        int iAS = a.aS(aosuVar.e);
        if (iAS == 0) {
            iAS = 1;
        }
        imageView.setImageResource(aduvVar.a(ikh.d(iAS).d));
        int iAS2 = a.aS(aosuVar.e);
        imageView.setContentDescription(ikh.d(iAS2 != 0 ? iAS2 : 1).c(this.f));
        this.g.setOnClickListener(new hdf(this, 9));
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
