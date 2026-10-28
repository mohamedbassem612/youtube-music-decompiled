package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class wzx implements adma {
    protected final aduv a;
    public final vxe b;
    protected final View c;
    protected final TextView d;
    protected final TextView e;
    protected final ImageView f;
    protected final ViewGroup g;

    public wzx(Context context, vxe vxeVar, aduv aduvVar) {
        this.b = vxeVar;
        this.a = aduvVar;
        View viewInflate = View.inflate(context, d(), null);
        this.c = viewInflate;
        this.d = j();
        this.e = i();
        this.f = h();
        this.g = g();
        Resources resources = viewInflate.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(e());
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_metadata_horizontal_margin);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(f(), -2);
        marginLayoutParams.topMargin = dimensionPixelOffset;
        marginLayoutParams.bottomMargin = dimensionPixelOffset;
        marginLayoutParams.leftMargin = dimensionPixelOffset2;
        marginLayoutParams.rightMargin = dimensionPixelOffset2;
        viewInflate.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.c;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    protected abstract int d();

    protected abstract int e();

    protected abstract int f();

    protected abstract ViewGroup g();

    protected abstract ImageView h();

    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        amoz amozVar = (amoz) obj;
        if ((amozVar.b & 16) != 0) {
            alayVar = amozVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        TextView textView = this.d;
        vxe vxeVar = this.b;
        tuk.u(textView, vxl.a(null, alayVar, vxeVar, false));
        TextView textView2 = this.e;
        if ((amozVar.b & 32) != 0) {
            alayVar2 = amozVar.f;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        tuk.u(textView2, vxl.a(null, alayVar2, vxeVar, false));
        if ((amozVar.b & 8) == 0) {
            this.f.setVisibility(8);
        } else {
            alja aljaVar = amozVar.d;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            aliz alizVarA = aliz.a(aljaVar.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            aliz alizVar = aliz.UNKNOWN;
            if (alizVarA != alizVar) {
                aduv aduvVar = this.a;
                alja aljaVar2 = amozVar.d;
                if (aljaVar2 == null) {
                    aljaVar2 = alja.a;
                }
                aliz alizVarA2 = aliz.a(aljaVar2.c);
                if (alizVarA2 == null) {
                    alizVarA2 = alizVar;
                }
                if (aduvVar.a(alizVarA2) != 0) {
                    ImageView imageView = this.f;
                    imageView.setVisibility(0);
                    alja aljaVar3 = amozVar.d;
                    if (aljaVar3 == null) {
                        aljaVar3 = alja.a;
                    }
                    aliz alizVarA3 = aliz.a(aljaVar3.c);
                    if (alizVarA3 != null) {
                        alizVar = alizVarA3;
                    }
                    imageView.setImageResource(aduvVar.a(alizVar));
                } else {
                    this.f.setVisibility(8);
                }
            } else {
                this.f.setVisibility(8);
            }
        }
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            if (amozVar.g.size() == 0) {
                viewGroup.setVisibility(8);
                return;
            }
            viewGroup.setVisibility(0);
            for (int i = 0; i < amozVar.g.size(); i++) {
                if ((((ajng) amozVar.g.get(i)).b & 1) != 0) {
                    ajnf ajnfVar = ((ajng) amozVar.g.get(i)).c;
                    if (ajnfVar == null) {
                        ajnfVar = ajnf.a;
                    }
                    Button button = (Button) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.live_chat_metadata_button, viewGroup, false);
                    alay alayVar3 = ajnfVar.m;
                    if (alayVar3 == null) {
                        alayVar3 = alay.a;
                    }
                    button.setText(ackj.k(null, alayVar3, null, false));
                    if (vxeVar != null && (ajnfVar.b & SemanticState.Obscured) != 0) {
                        button.setOnClickListener(new vqd(this, ajnfVar, 5));
                    }
                    viewGroup.addView(button);
                }
            }
        }
    }

    protected abstract TextView i();

    protected abstract TextView j();
}
