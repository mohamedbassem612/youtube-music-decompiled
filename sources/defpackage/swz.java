package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class swz extends admr implements View.OnClickListener {
    public final aunn a;
    public final View b;
    public final TextView c;
    public final vxe d;
    public final lqa e;
    private final ImageView f;
    private final ColorStateList g;
    private final Context h;
    private final aduv i;
    private final wbz j;
    private aliu k;
    private avmn l;
    private boolean m;
    private final vxz n;

    public swz(vxe vxeVar, aduv aduvVar, wbz wbzVar, lqa lqaVar, aunn aunnVar, vxz vxzVar, ViewStub viewStub) {
        this.d = vxeVar;
        this.i = aduvVar;
        this.j = wbzVar;
        this.e = lqaVar;
        this.n = vxzVar;
        this.a = aunnVar;
        viewStub.setLayoutResource(R.layout.icon_badge);
        Context context = viewStub.getContext();
        this.h = context;
        View viewInflate = viewStub.inflate();
        this.b = viewInflate;
        viewInflate.setVisibility(8);
        this.c = (TextView) viewInflate.findViewById(R.id.badge_text);
        this.f = (ImageView) viewInflate.findViewById(R.id.badge_icon);
        this.g = tzk.k(context, R.attr.ytTextPrimary);
        this.m = false;
    }

    private final void i() {
        avmn avmnVar = this.l;
        if (avmnVar != null && !avmnVar.f()) {
            avnr.b((AtomicReference) this.l);
        }
        this.l = null;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        aliu aliuVar = this.k;
        if (aliuVar != null && (aliuVar.b & SemanticState.Hidden) != 0) {
            ((abxv) this.a.io()).L(this.k.k);
        }
        this.k = null;
        this.b.setVisibility(8);
        i();
    }

    @Override // defpackage.admr
    protected final /* synthetic */ void d(adly adlyVar, Object obj) {
        aliu aliuVar = (aliu) obj;
        aliuVar.getClass();
        this.k = aliuVar;
        alja aljaVar = aliuVar.e;
        if (aljaVar == null) {
            aljaVar = alja.a;
        }
        aliz alizVarA = aliz.a(aljaVar.c);
        if (alizVarA == null) {
            alizVarA = aliz.UNKNOWN;
        }
        int iA = this.i.a(alizVarA);
        if (iA == 0) {
            this.f.setVisibility(8);
        } else {
            new ttk(this.h);
            ImageView imageView = this.f;
            imageView.setImageResource(iA);
            imageView.setImageDrawable(ttk.c(imageView.getDrawable(), this.g));
            imageView.setVisibility(0);
        }
        if ((aliuVar.b & 8) != 0) {
            h(aliuVar.f);
        } else {
            this.c.setVisibility(8);
        }
        if ((aliuVar.b & 32) != 0) {
            int iAV = a.aV(aliuVar.h);
            if (iAV == 0) {
                iAV = 1;
            }
            int i = iAV - 1;
            if (i != 1) {
                TextView textView = this.c;
                if (i != 2) {
                    textView.setBackgroundResource(R.drawable.icon_badge_blue_background);
                } else {
                    textView.setBackgroundResource(R.drawable.icon_badge_blue_background);
                }
            } else {
                this.c.setBackgroundResource(R.drawable.icon_badge_red_background);
            }
        }
        if ((aliuVar.b & SemanticState.Focused) != 0) {
            View view = this.b;
            aiqd aiqdVar = aliuVar.j;
            if (aiqdVar == null) {
                aiqdVar = aiqd.a;
            }
            view.setContentDescription(aiqdVar.c);
        }
        if (this.n.m(5, 45382039L) || !this.m) {
            this.k = aliuVar;
            if ((aliuVar.b & 1) != 0) {
                i();
                this.l = this.j.c().j(aliuVar.c, true).B(new sqj(2)).K(new rtq(13)).h(alis.class).O(avmh.a()).af(new mnt(this, aliuVar, 3));
                this.m = true;
            }
        }
        if ((aliuVar.b & 64) != 0) {
            this.b.setOnClickListener(this);
        }
        boolean z = aliuVar.g;
        View view2 = this.b;
        if (z) {
            view2.setVisibility(0);
        } else {
            view2.setVisibility(8);
        }
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aliu) obj).l.G();
    }

    public final void g() {
        this.b.setVisibility(8);
    }

    public final void h(String str) {
        TextView textView = this.c;
        textView.setText(str);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (TextUtils.getTrimmedLength(str) == 0) {
            if (layoutParams != null) {
                int dimensionPixelSize = this.h.getResources().getDimensionPixelSize(R.dimen.yt_sys_measurement_size_condensed);
                layoutParams.width = dimensionPixelSize;
                layoutParams.height = dimensionPixelSize;
                textView.setLayoutParams(layoutParams);
            }
            textView.setMinWidth(0);
            textView.setPaddingRelative(0, 0, 0, 0);
        } else {
            Context context = this.h;
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.yt_sys_measurement_icon_size_cozy);
            int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.yt_sys_measurement_size_tiny);
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = dimensionPixelSize2;
                textView.setLayoutParams(layoutParams);
            }
            textView.setMinWidth(dimensionPixelSize2);
            textView.setPaddingRelative(dimensionPixelSize3, 0, dimensionPixelSize3, 0);
        }
        textView.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aliu aliuVar = this.k;
        if (aliuVar == null || (aliuVar.b & 64) == 0) {
            return;
        }
        vxe vxeVar = this.d;
        ajwo ajwoVar = aliuVar.i;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        vxeVar.a(ajwoVar);
    }
}
