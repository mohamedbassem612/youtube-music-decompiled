package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rpo extends admr {
    public final vxe a;
    public final View b;
    public final xgn c;
    public ajwo d;
    public byte[] e;
    private final Context f;
    private final adhv g;
    private final TextView h;
    private final ImageView i;
    private final aduv j;
    private TextView k;
    private final ColorStateList l;

    public rpo(Context context, adhv adhvVar, aduv aduvVar, vxe vxeVar, xgm xgmVar) {
        this.f = context;
        aduvVar.getClass();
        this.j = aduvVar;
        vxeVar.getClass();
        adhvVar.getClass();
        this.g = adhvVar;
        this.a = vxeVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.account_compact_link, (ViewGroup) null);
        this.b = viewInflate;
        this.h = (TextView) viewInflate.findViewById(R.id.title);
        this.i = (ImageView) viewInflate.findViewById(R.id.thumbnail);
        this.l = tzk.k(context, R.attr.ytTextPrimary);
        this.c = xgmVar.hB();
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        ajwo ajwoVar;
        xgn xgnVar;
        akbg akbgVar = (akbg) obj;
        if ((akbgVar.b & SemanticState.Modal) != 0) {
            alayVar = akbgVar.g;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(this.h, ackj.k(null, alayVar, null, false));
        if ((akbgVar.b & SemanticState.Obscured) != 0) {
            alayVar2 = akbgVar.h;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        Spanned spannedK = ackj.k(null, alayVar2, null, false);
        if (!TextUtils.isEmpty(spannedK) && this.k == null) {
            this.k = (TextView) ((ViewStub) this.b.findViewById(R.id.subtitle)).inflate().findViewById(R.id.subtitle);
        }
        TextView textView = this.k;
        if (textView != null) {
            tuk.u(textView, spannedK);
        }
        if ((akbgVar.b & 2) != 0) {
            aduv aduvVar = this.j;
            alja aljaVar = akbgVar.e;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            aliz alizVarA = aliz.a(aljaVar.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            int iA = aduvVar.a(alizVarA);
            adhv adhvVar = this.g;
            ImageView imageView = this.i;
            adhvVar.f(imageView);
            if (iA == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageResource(iA);
                ColorStateList colorStateList = this.l;
                new ttk(this.f);
                imageView.setImageDrawable(ttk.c(imageView.getDrawable(), colorStateList));
                imageView.setVisibility(0);
            }
        } else {
            adhv adhvVar2 = this.g;
            ImageView imageView2 = this.i;
            aqmh aqmhVar = akbgVar.f;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            adhvVar2.h(imageView2, aqmhVar);
            imageView2.setImageTintList(null);
            imageView2.setVisibility((akbgVar.b & 64) == 0 ? 8 : 0);
        }
        this.d = akbgVar.c == 4 ? (ajwo) akbgVar.d : ajwo.a;
        int i = akbgVar.c;
        if (i == 9) {
            ajwoVar = i == 9 ? (ajwo) akbgVar.d : ajwo.a;
        } else {
            ajwoVar = null;
        }
        byte[] bArrG = akbgVar.i.G();
        this.e = bArrG;
        if (bArrG != null && (xgnVar = this.c) != null) {
            xgnVar.w(new xgj(bArrG), null);
        }
        View view = this.b;
        view.setOnClickListener(new rnx(this, 8));
        view.setClickable((this.d == null && ajwoVar == null) ? false : true);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((akbg) obj).i.G();
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
