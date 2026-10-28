package com.google.android.libraries.youtube.common.ui.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.EditTextPreference;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import defpackage.afkb;
import defpackage.ahno;
import defpackage.bog;
import defpackage.iud;
import defpackage.jco;
import defpackage.rwj;
import defpackage.svm;
import defpackage.taf;
import defpackage.ttm;
import defpackage.tvh;
import defpackage.tvj;
import defpackage.tvk;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ProtoDataStoreEditTextPreference extends EditTextPreference implements tvk {
    private tvh H;
    private afkb I;
    private Object J;
    private ttm h;
    private bog i;

    public ProtoDataStoreEditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ahno.G(!TextUtils.isEmpty(this.t), "Make sure key attribute is set in the xml file.");
    }

    @Override // androidx.preference.Preference
    public final boolean U(Object obj) {
        boolean zU = super.U(obj);
        if (zU) {
            bog bogVar = this.i;
            ListenableFuture listenableFutureB = this.H.b(obj);
            ttm ttmVar = this.h;
            ttmVar.getClass();
            taf.k(bogVar, listenableFutureB, new tvj(ttmVar, 0), new jco(9));
        }
        return zU;
    }

    @Override // defpackage.tvk
    public final void af(ttm ttmVar) {
        ttmVar.getClass();
        this.h = ttmVar;
    }

    @Override // defpackage.tvk
    public final void ag(bog bogVar) {
        this.i = bogVar;
    }

    @Override // defpackage.tvk
    public final void ah(Map map) {
        tvh tvhVar = (tvh) map.get(this.t);
        tvhVar.getClass();
        this.H = tvhVar;
        Object obj = this.J;
        afkb afkbVar = new afkb(new iud(taf.a(this.i, tvhVar.a(), new rwj(this, 8)), 10), MoreExecutors.directExecutor());
        this.I = afkbVar;
        taf.k(this.i, afkbVar.a(), new svm(this, obj, 3, null), new tvj(this, 2));
    }

    @Override // androidx.preference.EditTextPreference, androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        this.J = string;
        return string;
    }

    public final /* synthetic */ void k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.i(str);
    }

    @Override // androidx.preference.Preference
    protected final String u(String str) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }

    @Override // androidx.preference.Preference
    protected final void ac(String str) {
    }

    @Override // androidx.preference.EditTextPreference, androidx.preference.Preference
    protected final void h(Object obj) {
    }
}
