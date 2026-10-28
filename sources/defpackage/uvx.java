package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uvx extends uhv implements uvw, ukf {
    public final cc b;
    final avmm c;
    public boolean d;
    public int e;
    private final vhn f;
    private final vge g;
    private final vhi h;
    private final avmb i;
    private final umf j;

    public uvx(cc ccVar, vhn vhnVar, vge vgeVar, vhi vhiVar, umf umfVar, avmb avmbVar) {
        super(ccVar, true);
        Optional.empty();
        this.e = 1;
        this.d = false;
        this.b = ccVar;
        this.f = vhnVar;
        this.g = vgeVar;
        this.h = vhiVar;
        this.j = umfVar;
        this.i = avmbVar;
        this.c = new avmm();
    }

    @Override // defpackage.uhv
    protected final void g() {
        this.j.o(this);
    }

    @Override // defpackage.uhv
    protected final void iW() {
        this.c.dispose();
    }

    @Override // defpackage.uhv
    protected final void iX() {
        this.j.p(this);
    }

    @Override // defpackage.uhv
    protected final void j(View view) {
        View viewFindViewById = view.findViewById(R.id.shorts_editor_sticker_picker_button);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
            viewFindViewById.setOnClickListener(new uit(this, 13));
            View viewFindViewById2 = view.findViewById(R.id.tap_for_more_hint);
            viewFindViewById2.setVisibility(0);
            vhn vhnVar = this.f;
            cc ccVar = this.b;
            Optional optionalOf = Optional.of(view.findViewById(R.id.shorts_edit_player_view_wrapper));
            boolean z = this.d;
            vhnVar.c = ccVar;
            vhnVar.d = (TextView) viewFindViewById2;
            vhnVar.e = optionalOf;
            vhnVar.f = z;
            this.g.b();
            avmm avmmVar = this.c;
            umf umfVar = this.j;
            avmmVar.c(umfVar.e.H().O(this.i).af(new usn(viewFindViewById, 3)));
        }
    }

    @Override // defpackage.uvw
    public final void t(uxi uxiVar) {
        via viaVar;
        String str;
        this.f.b();
        augy augyVar = ((uxk) uxiVar).a;
        int i = augyVar.c;
        vhi vhiVar = this.h;
        if (i == 105) {
            viaVar = vhiVar.e;
            str = "";
        } else {
            if (i != 106) {
                return;
            }
            viaVar = vhiVar.g;
            str = ((augv) augyVar.d).c;
        }
        vhiVar.c.post(new rmx(vhiVar, viaVar, uxiVar, 12, null));
        if (str.isEmpty()) {
            return;
        }
        Context context = vhiVar.b;
        taf.j(ahno.ao(new uqd(new File(new File(context.getFilesDir(), vcb.a), str), str, 4), vhiVar.d), new roc(str, 15));
    }

    @Override // defpackage.uvw
    public final void w(uxi uxiVar) {
        this.f.b();
    }

    @Override // defpackage.uvw
    public final void x() {
        this.f.b();
    }

    @Override // defpackage.uvw
    public final void z(boolean z, boolean z2) {
        if (z) {
            this.f.b();
        }
    }

    @Override // defpackage.uvw
    public final /* synthetic */ void A(augy augyVar) {
    }

    @Override // defpackage.uvw
    public final /* synthetic */ void u(auaj auajVar) {
    }

    @Override // defpackage.uvw
    public final /* synthetic */ void v(auan auanVar) {
    }

    @Override // defpackage.uvw
    public final /* synthetic */ void y(boolean z) {
    }
}
