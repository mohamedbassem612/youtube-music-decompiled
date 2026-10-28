package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jed extends admr {
    public final vxe a;
    public final ImageView b;
    public final Class c = anop.class;
    private final Context d;
    private final Executor e;
    private final aduv f;
    private final View g;
    private final TextView h;
    private avmn i;
    private final hcb j;

    public jed(Context context, vxe vxeVar, aduv aduvVar, Executor executor, hcb hcbVar, aciz acizVar) {
        context.getClass();
        this.d = context;
        vxeVar.getClass();
        this.a = vxeVar;
        aduvVar.getClass();
        this.f = aduvVar;
        this.e = executor;
        this.j = hcbVar;
        View viewInflate = View.inflate(context, R.layout.music_menu_item, null);
        this.g = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(R.id.text);
        this.h = textView;
        this.b = (ImageView) viewInflate.findViewById(R.id.icon);
        aedu aeduVarA = aedv.a();
        aeduVarA.a = 3;
        aeduVarA.b = 4;
        aeduVarA.c = 1;
        aeduVarA.d = 1;
        acizVar.B(aeduVarA.a(), context, (YouTubeAppCompatTextView) textView);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.g;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        avnr.b((AtomicReference) this.i);
    }

    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        anrv anrvVar = (anrv) obj;
        alay alayVar = anrvVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        this.h.setText(ackj.k(null, alayVar, null, false));
        hcb hcbVar = this.j;
        anop anopVar = (anop) hcbVar.b(anrvVar.f, this.c);
        boolean z = anopVar != null && anopVar.getSelected().booleanValue();
        aduv aduvVar = this.f;
        alja aljaVar = anrvVar.d;
        if (aljaVar == null) {
            aljaVar = alja.a;
        }
        aliz alizVarA = aliz.a(aljaVar.c);
        if (alizVarA == null) {
            alizVarA = aliz.UNKNOWN;
        }
        int iA = aduvVar.a(alizVarA);
        alja aljaVar2 = anrvVar.e;
        if (aljaVar2 == null) {
            aljaVar2 = alja.a;
        }
        aliz alizVarA2 = aliz.a(aljaVar2.c);
        if (alizVarA2 == null) {
            alizVarA2 = aliz.UNKNOWN;
        }
        int iA2 = aduvVar.a(alizVarA2);
        Drawable drawableD = iA > 0 ? dl.d(this.d, iA) : null;
        Drawable drawableD2 = iA2 > 0 ? dl.d(this.d, iA2) : null;
        this.b.setImageDrawable(true != z ? drawableD2 : drawableD);
        ajwo ajwoVar = anrvVar.g;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        ajwo ajwoVar2 = ajwoVar;
        ajwo ajwoVar3 = anrvVar.h;
        if (ajwoVar3 == null) {
            ajwoVar3 = ajwo.a;
        }
        jec jecVar = new jec(this, z, drawableD, drawableD2, ajwoVar2, ajwoVar3, adlyVar);
        this.g.setOnClickListener(jecVar);
        this.i = hcbVar.d(anrvVar.f, jecVar, this.e);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((anrv) obj).k.G();
    }
}
