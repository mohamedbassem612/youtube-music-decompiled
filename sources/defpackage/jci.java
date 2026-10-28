package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jci extends admr implements adlv {
    private final Context a;
    private final aduv b;
    private final adlw c;
    private final View d;
    private final ImageView e;
    private final TextView f;

    public jci(Context context, vxe vxeVar, aduv aduvVar) {
        this.a = context;
        this.b = aduvVar;
        View viewInflate = View.inflate(context, R.layout.icon_link_item, null);
        this.d = viewInflate;
        this.c = new adlw(vxeVar, viewInflate);
        this.e = (ImageView) viewInflate.findViewById(R.id.icon_link);
        this.f = (TextView) viewInflate.findViewById(R.id.label);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.d;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.c.b();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        ajwo ajwoVar;
        alay alayVar;
        alix alixVar = (alix) obj;
        xgn xgnVar = adlyVar.b;
        if ((alixVar.b & 8) != 0) {
            ajwoVar = alixVar.e;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else {
            ajwoVar = null;
        }
        this.c.a(xgnVar, ajwoVar, adlyVar.e(), this);
        if ((alixVar.b & 2) != 0) {
            aduv aduvVar = this.b;
            alja aljaVar = alixVar.d;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            aliz alizVarA = aliz.a(aljaVar.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            if (aduvVar.a(alizVarA) != 0) {
                Context context = this.a;
                alja aljaVar2 = alixVar.d;
                if (aljaVar2 == null) {
                    aljaVar2 = alja.a;
                }
                aliz alizVarA2 = aliz.a(aljaVar2.c);
                if (alizVarA2 == null) {
                    alizVarA2 = aliz.UNKNOWN;
                }
                Drawable drawableD = dl.d(context, aduvVar.a(alizVarA2));
                ImageView imageView = this.e;
                alja aljaVar3 = alixVar.d;
                if (aljaVar3 == null) {
                    aljaVar3 = alja.a;
                }
                aliz alizVarA3 = aliz.a(aljaVar3.c);
                if (alizVarA3 == null) {
                    alizVarA3 = aliz.UNKNOWN;
                }
                if (drawableD != null) {
                    drawableD.setAutoMirrored(izf.a.contains(alizVarA3));
                }
                imageView.setImageDrawable(drawableD);
                imageView.setVisibility(0);
                if (aduvVar instanceof izf) {
                    izf izfVar = (izf) aduvVar;
                    alja aljaVar4 = alixVar.d;
                    if (aljaVar4 == null) {
                        aljaVar4 = alja.a;
                    }
                    aliz alizVarA4 = aliz.a(aljaVar4.c);
                    if (alizVarA4 == null) {
                        alizVarA4 = aliz.UNKNOWN;
                    }
                    int iB = izfVar.b(alizVarA4);
                    if (iB != 0) {
                        imageView.setContentDescription(context.getString(iB));
                    }
                }
            } else {
                this.e.setVisibility(8);
            }
        } else {
            this.e.setVisibility(8);
        }
        boolean zJ = adlyVar.j("displayIconLinkLabel");
        TextView textView = this.f;
        if (!zJ) {
            textView.setVisibility(8);
            return;
        }
        if ((alixVar.b & 1) != 0) {
            alayVar = alixVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(textView, ackj.k(null, alayVar, null, false));
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((alix) obj).f.G();
    }

    @Override // defpackage.adlv
    public final void f(Map map) {
        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", alix.class);
    }
}
