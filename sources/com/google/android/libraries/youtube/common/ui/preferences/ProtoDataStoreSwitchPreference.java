package com.google.android.libraries.youtube.common.ui.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.SwitchPreference;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.afxd;
import defpackage.ahng;
import defpackage.ahno;
import defpackage.bog;
import defpackage.rwj;
import defpackage.taf;
import defpackage.ttm;
import defpackage.tvh;
import defpackage.tvi;
import defpackage.tvj;
import defpackage.tvk;
import defpackage.tvl;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ProtoDataStoreSwitchPreference extends SwitchPreference implements tvk {
    public tvl c;
    private tvh d;
    private ttm e;
    private ListenableFuture f;
    private bog g;
    private Object h;

    public ProtoDataStoreSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = ahng.n(null);
        ahno.G(!TextUtils.isEmpty(this.t), "Make sure key attribute is set in the xml file.");
    }

    private final ListenableFuture aj(Boolean bool) {
        return this.d.b(bool);
    }

    @Override // androidx.preference.Preference
    public final boolean U(Object obj) {
        boolean zU = super.U(obj);
        if (zU) {
            bog bogVar = this.g;
            ListenableFuture listenableFutureAj = aj((Boolean) obj);
            ttm ttmVar = this.e;
            ttmVar.getClass();
            taf.k(bogVar, listenableFutureAj, new tvj(ttmVar, 6), new tvj(this, 7));
        }
        return zU;
    }

    @Override // androidx.preference.Preference
    protected final boolean V(boolean z) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }

    public final /* synthetic */ void ae(boolean z) {
        super.k(z);
    }

    @Override // defpackage.tvk
    public final void af(ttm ttmVar) {
        this.e = ttmVar;
    }

    @Override // defpackage.tvk
    public final void ag(bog bogVar) {
        this.g = bogVar;
    }

    @Override // defpackage.tvk
    public final void ah(Map map) {
        tvh tvhVar = (tvh) map.get(this.t);
        tvhVar.getClass();
        this.d = tvhVar;
        ahng.o(taf.a(this.g, afxd.f(tvhVar.a()).b(Exception.class, new rwj(this.h, 9), taf.a), new rwj(this, 10)));
    }

    public final /* synthetic */ void ai(Boolean bool) {
        super.k(bool.booleanValue());
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        Object objF = super.f(typedArray, i);
        this.h = objF;
        return objF;
    }

    @Override // androidx.preference.TwoStatePreference
    public final void k(boolean z) {
        ListenableFuture listenableFutureAj = aj(Boolean.valueOf(z));
        this.f = listenableFutureAj;
        bog bogVar = this.g;
        ttm ttmVar = this.e;
        ttmVar.getClass();
        taf.k(bogVar, listenableFutureAj, new tvj(ttmVar, 6), new tvi(this, z, 2));
    }

    public ProtoDataStoreSwitchPreference(Context context) {
        super(context);
        this.f = ahng.n(null);
    }

    @Override // androidx.preference.Preference
    protected final void aa(boolean z) {
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    protected final void h(Object obj) {
    }
}
