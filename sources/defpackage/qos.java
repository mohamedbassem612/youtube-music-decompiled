package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qos extends cc implements bpx {
    private qor a;
    private LicenseMenuActivity b;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.bpx
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void b(List list) {
        qor qorVar = this.a;
        if (qorVar != null) {
            hj hjVar = qorVar.a;
            int i = hjVar.f + 1;
            hjVar.f = i;
            List list2 = hjVar.d;
            if (list != list2) {
                List list3 = hjVar.e;
                if (list == null) {
                    int size = list2.size();
                    hjVar.d = null;
                    hjVar.e = Collections.EMPTY_LIST;
                    hjVar.a.c(0, size);
                    hjVar.a();
                    return;
                }
                if (list2 != null) {
                    hjVar.g.a.execute(new ikm(hjVar, list2, list, i, 1));
                    return;
                }
                hjVar.d = list;
                hjVar.e = DesugarCollections.unmodifiableList(list);
                hjVar.a.a(0, list.size());
                hjVar.a();
            }
        }
    }

    @Override // defpackage.bpx
    public final bqg a() {
        return new qop(getActivity());
    }

    @Override // defpackage.bpx
    public final void c() {
        b(null);
    }

    @Override // defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        cf activity = getActivity();
        if (activity instanceof LicenseMenuActivity) {
            this.b = (LicenseMenuActivity) activity;
        }
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    @Override // defpackage.cc
    public final void onDestroy() {
        super.onDestroy();
        cf activity = getActivity();
        if (activity != null) {
            bpy supportLoaderManager = activity.getSupportLoaderManager();
            bqb bqbVar = supportLoaderManager.a;
            if (bqbVar.c) {
                throw new IllegalStateException("Called while creating a loader");
            }
            if (Looper.getMainLooper() != Looper.myLooper()) {
                throw new IllegalStateException("destroyLoader must be called on the main thread");
            }
            if (bpy.c(2)) {
                Objects.toString(supportLoaderManager);
            }
            bpz bpzVarA = bqbVar.a(54321);
            if (bpzVarA != null) {
                bpzVarA.k();
                ahc.b(bqbVar.b, 54321);
            }
        }
    }

    @Override // defpackage.cc
    public final void onDestroyView() {
        super.onDestroyView();
        this.a = null;
    }

    @Override // defpackage.cc
    public final void onDetach() {
        super.onDetach();
        this.b = null;
    }

    @Override // defpackage.cc
    public final void onViewCreated(View view, Bundle bundle) {
        cf activity = getActivity();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.license_list);
        this.a = new qor(this.b);
        recyclerView.ah(new LinearLayoutManager(activity));
        recyclerView.ad(this.a);
        recyclerView.aJ(new lv(activity, 1));
        qoq qoqVar = new qoq(recyclerView, recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom(), 0);
        int i = bac.a;
        azs.c(recyclerView, qoqVar);
        activity.getSupportLoaderManager().d(54321, this);
    }
}
