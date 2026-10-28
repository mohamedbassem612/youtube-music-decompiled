package com.google.android.libraries.youtube.common.ui.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import defpackage.afkb;
import defpackage.ahng;
import defpackage.ahno;
import defpackage.bog;
import defpackage.iud;
import defpackage.jco;
import defpackage.svm;
import defpackage.taf;
import defpackage.ttm;
import defpackage.tvh;
import defpackage.tvj;
import defpackage.tvk;
import defpackage.tvm;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ProtoDataStoreListPreference extends ListPreference implements tvk {
    private tvh H;
    private ttm I;
    private afkb J;
    private ListenableFuture K;
    private bog L;
    private Object M;

    public ProtoDataStoreListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = ahng.n(null);
        ahno.G(!TextUtils.isEmpty(this.t), "Make sure key attribute is set in the xml file.");
    }

    @Override // androidx.preference.Preference
    public final void J(Object obj) {
        this.M = obj;
        this.y = obj;
    }

    @Override // androidx.preference.Preference
    public final boolean U(Object obj) {
        boolean zU = super.U(obj);
        if (zU) {
            bog bogVar = this.L;
            ListenableFuture listenableFutureAd = ad((String) obj);
            ttm ttmVar = this.I;
            ttmVar.getClass();
            taf.k(bogVar, listenableFutureAd, new tvj(ttmVar, 3), new jco(10));
        }
        return zU;
    }

    protected final ListenableFuture ad(String str) {
        return this.H.b(str);
    }

    public final /* synthetic */ void ae(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            super.o(str);
        } else {
            super.o(str2);
        }
    }

    @Override // defpackage.tvk
    public final void af(ttm ttmVar) {
        ttmVar.getClass();
        this.I = ttmVar;
    }

    @Override // defpackage.tvk
    public final void ag(bog bogVar) {
        this.L = bogVar;
    }

    @Override // defpackage.tvk
    public final void ah(Map map) {
        tvh tvhVar = (tvh) map.get(this.t);
        tvhVar.getClass();
        this.H = tvhVar;
        String str = (String) this.M;
        afkb afkbVar = new afkb(new iud(taf.a(this.L, tvhVar.a(), new tvm(this, str, 1)), 11), MoreExecutors.directExecutor());
        this.J = afkbVar;
        taf.k(this.L, afkbVar.a(), new svm(this, str, 4, null), new svm(this, str, 5, null));
    }

    public final /* synthetic */ void ai(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            super.o(str2);
        } else if (str != null) {
            super.o(str);
        }
    }

    public final /* synthetic */ void aj(String str) {
        super.o(str);
    }

    public final /* synthetic */ void ak(String str) {
        super.o(str);
    }

    @Override // androidx.preference.ListPreference, androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        this.M = string;
        return string;
    }

    @Override // androidx.preference.ListPreference
    public final void o(String str) {
        ListenableFuture listenableFutureAd = ad(str);
        this.K = listenableFutureAd;
        bog bogVar = this.L;
        ttm ttmVar = this.I;
        ttmVar.getClass();
        taf.k(bogVar, listenableFutureAd, new tvj(ttmVar, 3), new svm(this, str, 6, null));
    }

    @Override // androidx.preference.Preference
    protected final String u(String str) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }

    @Override // androidx.preference.Preference
    protected final void ac(String str) {
    }

    @Override // androidx.preference.ListPreference, androidx.preference.Preference
    protected final void h(Object obj) {
    }
}
