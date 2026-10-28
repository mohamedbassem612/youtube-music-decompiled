package com.google.android.libraries.youtube.mdx.tvsignin;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.a;
import defpackage.agrc;
import defpackage.agrf;
import defpackage.ahng;
import defpackage.aiik;
import defpackage.ajwo;
import defpackage.cc;
import defpackage.xvg;
import defpackage.xvz;
import defpackage.ydg;
import defpackage.ydj;
import defpackage.ydo;
import defpackage.yno;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class TvSignInActivity extends ydj {
    private static final agrf j = agrf.h("com/google/android/libraries/youtube/mdx/tvsignin/TvSignInActivity");
    public String c;
    public xvz d;
    public String e;
    public int f;
    public xvg g;
    private boolean k;
    public int i = 1;
    public Optional h = Optional.empty();

    @Override // defpackage.xmq
    protected final int a() {
        return this.k ? 1 : 0;
    }

    @Override // defpackage.xmq
    protected final cc b(int i) {
        if (i == 0) {
            return new ydg();
        }
        if (i == 1) {
            return new ydo();
        }
        throw new IllegalArgumentException(a.bR(i, "Unknown current index "));
    }

    @Override // defpackage.xmq
    protected final boolean e(int i, cc ccVar) {
        if (i == 0) {
            return ccVar instanceof ydg;
        }
        if (i != 1) {
            return false;
        }
        return ccVar instanceof ydo;
    }

    @Override // defpackage.xmq
    protected final boolean f(int i) {
        if (i == 0 || this.k) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.libraries.youtube.mdx.tvsignin.keyNotifyProgressApi", true);
        yno.di(this, TvSignInActivity.class, 0, bundle);
        return true;
    }

    @Override // defpackage.ydj, defpackage.xmq, defpackage.cf, defpackage.qe, defpackage.ee, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Optional optionalOf;
        this.c = getIntent().getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyAuthCode");
        this.d = new xvz(getIntent().getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyScreenId"));
        this.f = getIntent().getIntExtra("com.google.android.libraries.youtube.mdx.tvsignin.requestType", -1);
        this.e = getIntent().getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountEmail");
        this.g = new xvg(getIntent().getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyLoungeDeviceId"));
        boolean z = false;
        this.i = a.aV(getIntent().getIntExtra("com.google.android.library.youtube.mdx.tvsignin.signInProtocol", 0));
        String str = this.e;
        if (str != null && !TextUtils.isEmpty(str)) {
            z = true;
        }
        this.k = z;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            try {
                ajwo ajwoVar = ajwo.a;
                ajwo ajwoVar2 = (ajwo) ahng.aA(extras, "com.google.android.libraries.youtube.mdx.tvsignin.keySignInOauthConsentCommand", ajwoVar, ExtensionRegistryLite.getGeneratedRegistry());
                optionalOf = !ajwoVar2.equals(ajwoVar) ? Optional.of(ajwoVar2) : Optional.empty();
            } catch (aiik | NullPointerException e) {
                ((agrc) ((agrc) ((agrc) j.b()).j(e)).k("com/google/android/libraries/youtube/mdx/tvsignin/TvSignInActivity", "getCommandFromExtras", '|', "TvSignInActivity.java")).w("Failed to parse command from extras for key: %s", "com.google.android.libraries.youtube.mdx.tvsignin.keySignInOauthConsentCommand");
            }
            this.h = optionalOf;
        }
        super.onCreate(bundle);
    }
}
