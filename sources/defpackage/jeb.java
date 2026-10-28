package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jeb implements adma {
    public final vxe a;
    private final Context b;
    private final admh c;
    private final DisplayMetrics d;
    private final ViewGroup e;
    private final TextView f;
    private final YouTubeTextView g;
    private final ViewGroup h;

    public jeb(Context context, admh admhVar, vxe vxeVar, View view) {
        this.b = context;
        this.c = admhVar;
        this.a = vxeVar;
        this.d = context.getResources().getDisplayMetrics();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.header_anchor);
        this.e = viewGroup;
        if (view.findViewById(R.id.migration_header_container) == null) {
            LayoutInflater.from(context).inflate(R.layout.music_migration_header, viewGroup);
        }
        this.f = (TextView) view.findViewById(R.id.migration_header_title);
        this.g = (YouTubeTextView) view.findViewById(R.id.migration_header_byline);
        this.h = (ViewGroup) view.findViewById(R.id.migration_header_thumbnails);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.e;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        kro.X(this.h, admhVar);
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        ViewGroup viewGroup = this.h;
        anrs anrsVar = (anrs) obj;
        viewGroup.removeAllViews();
        List listI = kro.I(anrsVar.c, anyj.a);
        if (listI.isEmpty()) {
            tuk.l(viewGroup, false);
        } else {
            Context context = this.b;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.item_extra_small_spacing);
            int integer = context.getResources().getInteger(R.integer.migration_transfer_page_num_thumbnails);
            int iMin = Math.min((twm.i(context) - ((integer + 1) * dimensionPixelSize)) / integer, twm.c(this.d, 180));
            for (int i = 0; i < integer && i < ((agpi) listI).d; i++) {
                View viewP = kro.P((anyi) listI.get(i), viewGroup, this.c, adlyVar);
                if (viewP != null) {
                    new jgf(iMin, iMin).b(viewP);
                    if (i != 0) {
                        viewP.setPaddingRelative(dimensionPixelSize, 0, 0, 0);
                    }
                }
            }
        }
        TextView textView = this.f;
        if ((anrsVar.b & 1) != 0) {
            alayVar = anrsVar.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(textView, ackj.k(null, alayVar, null, false));
        YouTubeTextView youTubeTextView = this.g;
        youTubeTextView.d();
        if ((anrsVar.b & 2) != 0) {
            alayVar2 = anrsVar.e;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        tuk.u(youTubeTextView, ackj.k(null, alayVar2, new jdc(this, 3), false));
    }
}
