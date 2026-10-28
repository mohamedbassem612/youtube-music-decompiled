package com.google.android.libraries.youtube.common.ui.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.CheckBoxPreference;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ahng;
import defpackage.ahno;
import defpackage.bog;
import defpackage.jco;
import defpackage.jlz;
import defpackage.svm;
import defpackage.taf;
import defpackage.ttm;
import defpackage.tvh;
import defpackage.tvi;
import defpackage.tvj;
import defpackage.tvk;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ProtoDataStoreCheckBoxPreference extends CheckBoxPreference implements tvk {
    private tvh c;
    private ttm d;
    private ListenableFuture e;
    private bog f;
    private Object g;

    public ProtoDataStoreCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = ahng.n(null);
        this.g = Boolean.FALSE;
        ahno.G(!TextUtils.isEmpty(this.t), "Make sure key attribute is set in the xml file.");
    }

    private final ListenableFuture ak(Boolean bool) {
        return this.c.b(bool);
    }

    @Override // androidx.preference.Preference
    public final boolean U(Object obj) {
        boolean zU = super.U(obj);
        if (zU) {
            bog bogVar = this.f;
            ListenableFuture listenableFutureAk = ak((Boolean) obj);
            ttm ttmVar = this.d;
            ttmVar.getClass();
            taf.k(bogVar, listenableFutureAk, new tvj(ttmVar, 1), new jco(8));
        }
        return zU;
    }

    @Override // androidx.preference.Preference
    protected final boolean V(boolean z) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }

    public final /* synthetic */ void ae(Boolean bool) {
        super.k(bool.booleanValue());
    }

    @Override // defpackage.tvk
    public final void af(ttm ttmVar) {
        this.d = ttmVar;
    }

    @Override // defpackage.tvk
    public final void ag(bog bogVar) {
        this.f = bogVar;
    }

    @Override // defpackage.tvk
    public final void ah(Map map) {
        tvh tvhVar = (tvh) map.get(this.t);
        tvhVar.getClass();
        this.c = tvhVar;
        taf.k(this.f, tvhVar.a(), new svm(this, this.g, 2, null), new jlz(this, 20));
    }

    public final /* synthetic */ void ai(boolean z) {
        super.k(z);
    }

    public final /* synthetic */ void aj(Boolean bool) {
        super.k(bool.booleanValue());
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        Object objF = super.f(typedArray, i);
        this.g = objF;
        return objF;
    }

    @Override // androidx.preference.TwoStatePreference
    public final void k(boolean z) {
        ListenableFuture listenableFutureAk = ak(Boolean.valueOf(z));
        this.e = listenableFutureAk;
        bog bogVar = this.f;
        ttm ttmVar = this.d;
        ttmVar.getClass();
        taf.k(bogVar, listenableFutureAk, new tvj(ttmVar, 1), new tvi(this, z, 0));
    }

    @Override // androidx.preference.Preference
    protected final void aa(boolean z) {
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    protected final void h(Object obj) {
    }
}
