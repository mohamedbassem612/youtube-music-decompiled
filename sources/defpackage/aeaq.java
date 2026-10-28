package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeaq extends nh {
    public List a;
    public ajwo e;
    private final xgn g;
    private final adhv h;
    private final vxe i;
    private View k;
    private final aeiv l;
    public aean f = null;
    private final aean j = new xbc(this, 2);

    public aeaq(xgv xgvVar, adhv adhvVar, aeiv aeivVar, vxe vxeVar) {
        this.g = xgvVar;
        this.l = aeivVar;
        this.h = adhvVar;
        this.i = vxeVar;
    }

    private static final xgj A(int i) {
        aihh aihhVar = (aihh) amud.b.createBuilder();
        aihh aihhVar2 = (aihh) ajuz.a.createBuilder();
        aihhVar2.copyOnWrite();
        ajuz ajuzVar = (ajuz) aihhVar2.instance;
        ajuzVar.b |= 1;
        ajuzVar.c = 62072;
        aihhVar2.copyOnWrite();
        ajuz ajuzVar2 = (ajuz) aihhVar2.instance;
        ajuzVar2.b |= 4;
        ajuzVar2.e = i;
        aihhVar.copyOnWrite();
        amud amudVar = (amud) aihhVar.instance;
        ajuz ajuzVar3 = (ajuz) aihhVar2.build();
        ajuzVar3.getClass();
        amudVar.h = ajuzVar3;
        amudVar.c |= 8;
        aihf aihfVarCreateBuilder = argh.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        argh arghVar = (argh) aihfVarCreateBuilder.instance;
        arghVar.b |= 1;
        arghVar.c = 1L;
        aihhVar.copyOnWrite();
        amud amudVar2 = (amud) aihhVar.instance;
        argh arghVar2 = (argh) aihfVarCreateBuilder.build();
        arghVar2.getClass();
        amudVar2.e = arghVar2;
        amudVar2.c |= 2;
        return new xgj((amud) aihhVar.build());
    }

    @Override // defpackage.nh
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ oh e(ViewGroup viewGroup, int i) {
        this.k = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.emoji_upsell_holder, viewGroup, false);
        return new aeap(new aeao(this.j, A(i), this.g), this.k, this.l);
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ void o(oh ohVar, int i) {
        aeap aeapVar = (aeap) ohVar;
        if (this.a.size() > i) {
            int i2 = aeap.u;
            View view = aeapVar.s;
            ImageView imageView = (ImageView) view;
            this.h.h(imageView, this.l.e((String) this.a.get(i)));
            imageView.setContentDescription(((aeiv) aeapVar.t).f((String) this.a.get(i)));
        }
        this.g.l(A(i));
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ void s(oh ohVar) {
        int i = aeap.u;
        View view = ((aeap) ohVar).s;
        if (view != null) {
            this.h.f((ImageView) view);
        }
    }

    public final void z() {
        ajwo ajwoVar = this.e;
        if (ajwoVar != null) {
            this.i.a(ajwoVar);
        }
    }
}
