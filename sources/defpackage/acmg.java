package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acmg implements acnj {
    public final xgm a;
    public final aduv b;
    public final vxe c;
    public final acnk d;
    public final avmm e = new avmm();
    public View f;
    public acmf g;
    public apev h;
    public final hno i;

    public acmg(aduv aduvVar, vxe vxeVar, xgm xgmVar, acnk acnkVar, hno hnoVar) {
        this.b = aduvVar;
        this.c = vxeVar;
        this.a = xgmVar;
        this.d = acnkVar;
        this.i = hnoVar;
    }

    public final void a(View view, acmf acmfVar) {
        View viewFindViewById = view.findViewById(R.id.reel_static_header_group);
        this.f = viewFindViewById;
        if (viewFindViewById != null) {
            this.g = acmfVar;
            if (this.i.ac()) {
                this.e.c(this.d.b().B(new yqz(13)).ag(new acjp(this, 9), new abxq(8)));
            } else {
                this.d.c(this);
            }
        }
    }

    public final void b() {
        acfz.I(this.f, false);
    }

    @Override // defpackage.acnj
    public final void g() {
        b();
    }
}
