package com.google.android.libraries.youtube.common.ui.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.SeekBarPreference;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import defpackage.acly;
import defpackage.afkb;
import defpackage.ahno;
import defpackage.bog;
import defpackage.iud;
import defpackage.jco;
import defpackage.sdp;
import defpackage.taf;
import defpackage.ttm;
import defpackage.tvh;
import defpackage.tvj;
import defpackage.tvk;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ProtoDataStoreSeekBarPreference extends SeekBarPreference implements tvk {
    private Object H;
    private afkb I;
    private bog g;
    private ttm h;
    private tvh i;

    public ProtoDataStoreSeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ahno.G(!TextUtils.isEmpty(this.t), "Make sure key attribute is set in the xml file.");
    }

    @Override // androidx.preference.Preference
    public final boolean U(Object obj) {
        boolean zU = super.U(obj);
        if (zU) {
            bog bogVar = this.g;
            ListenableFuture listenableFutureB = this.i.b(obj);
            ttm ttmVar = this.h;
            ttmVar.getClass();
            taf.k(bogVar, listenableFutureB, new tvj(ttmVar, 4), new jco(11));
        }
        return zU;
    }

    @Override // defpackage.tvk
    public final void af(ttm ttmVar) {
        this.h = ttmVar;
    }

    @Override // defpackage.tvk
    public final void ag(bog bogVar) {
        this.g = bogVar;
    }

    @Override // defpackage.tvk
    public final void ah(Map map) {
        tvh tvhVar = (tvh) map.get(this.t);
        tvhVar.getClass();
        this.i = tvhVar;
        int iIntValue = ((Integer) this.H).intValue();
        afkb afkbVar = new afkb(new iud(taf.a(this.g, this.i.a(), new sdp(4)), 12), MoreExecutors.directExecutor());
        this.I = afkbVar;
        taf.k(this.g, afkbVar.a(), new acly(this, iIntValue, 1), new tvj(this, 5));
    }

    @Override // androidx.preference.SeekBarPreference, androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        Object objF = super.f(typedArray, i);
        this.H = objF;
        return objF;
    }

    public final /* synthetic */ void p(int i) {
        super.k(i, true);
    }

    @Override // androidx.preference.Preference
    protected final int q(int i) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }

    @Override // androidx.preference.Preference
    protected final void ab(int i) {
    }

    @Override // androidx.preference.SeekBarPreference, androidx.preference.Preference
    protected final void h(Object obj) {
    }
}
