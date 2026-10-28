package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xsf extends xth {
    public adxl k;

    @Override // defpackage.adyw
    protected final Optional n() {
        cf cfVarRequireActivity = requireActivity();
        View viewInflate = View.inflate(cfVarRequireActivity, R.layout.mdx_device_picker_main, null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.device_picker_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(cfVarRequireActivity);
        recyclerView.ad(this.w);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        recyclerView.ah(linearLayoutManager);
        return Optional.of(viewInflate);
    }

    @Override // defpackage.adyw
    protected final Optional o() {
        return Optional.of(this.k);
    }

    @Override // defpackage.xth, defpackage.xsn, defpackage.bp, defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(new ContextThemeWrapper(context, R.style.Theme_MediaRouter));
    }

    @Override // defpackage.adyw
    protected final Optional p() {
        return Optional.empty();
    }

    @Override // defpackage.adyw
    protected final Optional q() {
        return Optional.empty();
    }
}
