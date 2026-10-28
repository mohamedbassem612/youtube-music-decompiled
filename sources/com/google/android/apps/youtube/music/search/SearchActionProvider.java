package com.google.android.apps.youtube.music.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.android.apps.youtube.music.R;
import defpackage.adxj;
import defpackage.agkj;
import defpackage.ajwo;
import defpackage.arqz;
import defpackage.axfd;
import defpackage.axy;
import defpackage.fhz;
import defpackage.hdt;
import defpackage.hhb;
import defpackage.inl;
import defpackage.inm;
import defpackage.tfq;
import defpackage.tym;
import defpackage.vxe;
import defpackage.xgm;
import defpackage.zwb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SearchActionProvider extends axy implements View.OnClickListener {
    public vxe a;
    public xgm b;
    public zwb e;
    public inl f;
    public adxj g;
    public tfq h;
    public axfd i;
    private final boolean j;

    public SearchActionProvider(Context context) {
        super(context);
        ((inm) inm.class.cast(tym.N(tym.K(context)))).bv(this);
        if (!this.e.u()) {
            this.j = false;
            return;
        }
        this.j = !this.i.au() || this.f.b(this.c);
        hhb hhbVar = this.d;
        if (hhbVar == null || !g()) {
            return;
        }
        hhbVar.G();
    }

    @Override // defpackage.axy
    public final View a() {
        View viewInflate = LayoutInflater.from(this.c).inflate(R.layout.search_button, (ViewGroup) null);
        ((ImageButton) viewInflate.findViewById(R.id.action_search_button)).setImageResource(this.g.b(arqz.mg));
        viewInflate.setOnClickListener(this);
        return viewInflate;
    }

    @Override // defpackage.axy
    public final boolean e() {
        return this.j;
    }

    @Override // defpackage.axy
    public final boolean g() {
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hdt hdtVar;
        ajwo ajwoVarV = fhz.V("", this.b.hB().i(), 10349);
        vxe vxeVar = this.a;
        if (this.h.i()) {
            hdtVar = hdt.MUSIC_SEARCH_CATALOG;
        } else if (this.f.a()) {
            hdtVar = hdt.MUSIC_SEARCH_DOWNLOADS;
        } else {
            hdtVar = this.f.b(this.c) ? hdt.MUSIC_SEARCH_SIDELOADED : hdt.MUSIC_SEARCH_CATALOG;
        }
        vxeVar.c(ajwoVarV, agkj.j("default_search_tab_id", hdtVar));
    }
}
