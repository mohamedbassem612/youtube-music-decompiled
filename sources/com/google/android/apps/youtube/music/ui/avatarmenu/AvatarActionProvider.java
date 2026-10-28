package com.google.android.apps.youtube.music.ui.avatarmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import defpackage.adhv;
import defpackage.adia;
import defpackage.agrc;
import defpackage.agrf;
import defpackage.airk;
import defpackage.aqmh;
import defpackage.avmb;
import defpackage.axy;
import defpackage.dd;
import defpackage.hlv;
import defpackage.iwg;
import defpackage.iwh;
import defpackage.jlc;
import defpackage.rmw;
import defpackage.tbt;
import defpackage.tcc;
import defpackage.twn;
import defpackage.tym;
import defpackage.wqe;
import defpackage.zwt;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AvatarActionProvider extends axy implements View.OnClickListener, twn {
    private static final agrf i = agrf.h("com/google/android/apps/youtube/music/ui/avatarmenu/AvatarActionProvider");
    public rmw a;
    public adhv b;
    public tbt e;
    public dd f;
    public hlv g;
    public avmb h;
    private final Context j;
    private ImageView k;
    private adia l;
    private final jlc m;

    public AvatarActionProvider(Context context) {
        super(context);
        context.getClass();
        this.j = context;
        ((iwh) iwh.class.cast(tym.N(tym.K(context)))).bw(this);
        this.e.f(this);
        this.m = new iwg(this, this.h);
    }

    private final void j() {
        wqe wqeVarC;
        ImageView imageView = this.k;
        if (imageView == null) {
            ((agrc) ((agrc) i.b()).k("com/google/android/apps/youtube/music/ui/avatarmenu/AvatarActionProvider", "updateAvatarImage", 95, "AvatarActionProvider.java")).t("AvatarActionProvider hasn't created the action view.");
            return;
        }
        if (this.l == null) {
            this.l = new adia(this.b, imageView, false);
        }
        try {
            wqeVarC = this.g.c();
        } catch (IOException e) {
            ((agrc) ((agrc) ((agrc) i.c()).j(e)).k("com/google/android/apps/youtube/music/ui/avatarmenu/AvatarActionProvider", "updateAvatarImage", 'l', "AvatarActionProvider.java")).t("Failed to load guide response");
            wqeVarC = null;
        }
        airk airkVarA = wqeVarC != null ? wqeVarC.a() : null;
        if (airkVarA != null) {
            adia adiaVar = this.l;
            aqmh aqmhVar = airkVarA.f;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            adiaVar.f(aqmhVar, null);
            return;
        }
        if (this.a.c() != null && this.a.c().g != null) {
            this.l.f(this.a.c().g.l(), null);
            return;
        }
        adia adiaVar2 = this.l;
        adiaVar2.b();
        adiaVar2.a.setImageResource(R.drawable.missing_avatar);
    }

    @Override // defpackage.axy
    public final View a() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.j).inflate(R.layout.avatar_menu_button, (ViewGroup) null);
        this.k = (ImageView) viewGroup.findViewById(R.id.avatar);
        j();
        viewGroup.setOnClickListener(this);
        return viewGroup;
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        j();
    }

    @Override // defpackage.twn
    public final void i() {
        this.e.l(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.m.onClick(view);
    }
}
