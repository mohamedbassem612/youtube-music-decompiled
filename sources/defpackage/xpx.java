package defpackage;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xpx extends xpy {
    public xpw a;

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        xpw xpwVar = this.a;
        RecyclerView recyclerView = (RecyclerView) layoutInflater.inflate(R.layout.mdx_delete_tv_codes_fragment, viewGroup, false);
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(amzf.a, amze.a);
        ajwo ajwoVar = (ajwo) aihhVar.build();
        xgn xgnVar = xpwVar.b;
        xgnVar.b(xhb.a(27857), ajwoVar, null);
        xpwVar.c = new xpv(layoutInflater.getContext(), new xpr(xpwVar, 0), xgnVar);
        recyclerView.ah(new LinearLayoutManager(layoutInflater.getContext()));
        recyclerView.ad(xpwVar.c);
        return recyclerView;
    }
}
