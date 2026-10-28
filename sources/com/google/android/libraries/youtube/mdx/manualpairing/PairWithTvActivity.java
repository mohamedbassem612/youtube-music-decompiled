package com.google.android.libraries.youtube.mdx.manualpairing;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.youtube.music.R;
import defpackage.a;
import defpackage.aeda;
import defpackage.afip;
import defpackage.ajet;
import defpackage.cc;
import defpackage.fl;
import defpackage.tza;
import defpackage.vxz;
import defpackage.xpx;
import defpackage.xpz;
import defpackage.xqf;
import defpackage.xqj;
import defpackage.yno;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class PairWithTvActivity extends xpz {
    public aeda c;
    public vxz d;
    public afip e;
    private int f;

    @Override // defpackage.xmq
    protected final int a() {
        return this.f;
    }

    @Override // defpackage.xmq
    protected final cc b(int i) {
        if (i == 0) {
            return new xqf();
        }
        if (i == 1) {
            return new xqj();
        }
        if (i == 2) {
            return new xpx();
        }
        throw new IllegalArgumentException(a.bR(i, "Unknown current index "));
    }

    @Override // defpackage.xmq
    protected final void d(int i, Activity activity) {
        if (i == 0) {
            activity.setTitle(R.string.mdx_pair_with_tv_prefs_title);
        } else if (i == 1) {
            activity.setTitle(true != this.d.l(208, 45757733L, false) ? R.string.mdx_pref_use_tv_code_title : R.string.mdx_pref_add_a_device_title);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(a.bR(i, "Unknown current index "));
            }
            activity.setTitle(R.string.mdx_pref_delete_tv_codes_code_title);
        }
    }

    @Override // defpackage.xmq
    protected final boolean e(int i, cc ccVar) {
        if (i == 0) {
            return ccVar instanceof xqf;
        }
        if (i == 1) {
            return ccVar instanceof xqj;
        }
        if (i != 2) {
            return false;
        }
        return ccVar instanceof xpx;
    }

    @Override // defpackage.xmq
    protected final boolean f(int i) {
        int i2 = this.f;
        if (i == i2) {
            return false;
        }
        yno.di(this, PairWithTvActivity.class, i2, null);
        return true;
    }

    public final void h(boolean z) {
        setResult(true != z ? -1 : 2);
        finish();
    }

    @Override // defpackage.xpz, defpackage.xmq, defpackage.cf, defpackage.qe, defpackage.ee, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        if (getIntent().getExtras() == null || getIntent().getExtras().getInt("useTvCode") != 1) {
            this.f = 0;
        } else {
            this.f = 1;
        }
        super.onCreate(bundle);
        if (this.c.i()) {
            afip afipVar = this.e;
            setTheme(((tza) afipVar.a).a);
            afipVar.c(this, (ajet) afipVar.d);
        } else {
            boolean booleanExtra = getIntent().getBooleanExtra("com.google.android.libraries.youtube.mdx.manualpairing.darkTheme", false);
            if (getIntent().getBooleanExtra("com.google.android.libraries.youtube.mdx.manualpairing.darkerColorPalette", false)) {
                setTheme(true != booleanExtra ? R.style.Mdx_Theme_Settings_DarkerPalette : R.style.Mdx_Theme_Settings_Dark_DarkerPalette);
            } else {
                setTheme(true != booleanExtra ? R.style.Mdx_Theme_Settings : R.style.Mdx_Theme_Settings_Dark);
            }
        }
        fl supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.h(true);
        }
    }
}
