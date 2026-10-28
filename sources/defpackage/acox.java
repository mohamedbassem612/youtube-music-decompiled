package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acox extends acdd {
    View a;
    public boolean b;
    public boolean c;
    private final abvn d;
    private final boolean e;
    private final boolean f;
    private final avmm g;
    private ViewGroup h;
    private final adif i;

    public acox(Context context, vwt vwtVar, abvn abvnVar, adif adifVar, hno hnoVar) {
        super(context);
        avmm avmmVar = new avmm();
        this.g = avmmVar;
        this.b = false;
        this.c = false;
        this.d = abvnVar;
        this.i = adifVar;
        boolean zAZ = hnoVar.aZ();
        this.e = zAZ;
        boolean zL = ((vxz) hnoVar.i).l(323, 45857326L, false);
        this.f = zL;
        if (zAZ) {
            if (zL) {
                vwtVar.D(new acnd(avmmVar, 16));
            } else {
                vwtVar.D(new aalq(this, adifVar, 8));
                vwtVar.D(new aalq(this, abvnVar, 9, null));
            }
        }
    }

    @Override // defpackage.acdg
    public final ViewGroup.LayoutParams b() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void c(ViewGroup viewGroup) {
        if (!this.f) {
            this.h = viewGroup;
            return;
        }
        if (!Objects.equals(this.h, viewGroup)) {
            this.a = null;
        }
        this.h = viewGroup;
        avmm avmmVar = this.g;
        avmmVar.b();
        if (viewGroup == null || !this.e) {
            return;
        }
        adif adifVar = this.i;
        avmmVar.c(((avlr) adifVar.a).af(new acnt(this, 13)));
        avmmVar.c(this.d.H().ak(new acnt(this, 14)));
    }

    public final void d() {
        if (this.h != null) {
            boolean z = false;
            boolean z2 = true;
            if (this.b && this.c) {
                z = true;
            }
            View viewFindViewById = this.a;
            if (viewFindViewById != null) {
                z2 = z;
            } else {
                if (!z) {
                    return;
                }
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
                acfz.I(this.h, true);
                viewFindViewById = layoutInflaterFrom.inflate(R.layout.reel_pip_overlay, this.h, true).findViewById(R.id.ad_attribution);
                this.a = viewFindViewById;
            }
            acfz.I(viewFindViewById, z2);
        }
    }
}
