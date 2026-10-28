package com.google.android.libraries.parenttools.youtube;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.apps.youtube.music.R;
import defpackage.av;
import defpackage.nrb;
import defpackage.nrc;
import defpackage.qbu;
import defpackage.qbw;
import defpackage.qbx;
import defpackage.qby;
import defpackage.qcf;
import defpackage.qta;
import defpackage.qtf;
import defpackage.zf;
import j$.util.Objects;
import java.io.Serializable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ParentToolsActivity extends qbu {
    public byte[] c;
    public boolean d;
    public qbx e;
    public String f;
    public boolean b = false;
    private final ScheduledExecutorService i = new ScheduledThreadPoolExecutor(1);
    public int h = 1;
    public qby g = qby.a;
    private boolean j = false;

    public static qbw b(Context context) {
        qbw qbwVar = new qbw();
        qbwVar.a = context;
        return qbwVar;
    }

    public final void c(int i, String str) {
        Log.e("ParentToolsActivity", "ParentTools error: " + nrb.b(i) + ", httpCode: " + str);
        if (this.d) {
            qbx qbxVar = this.e;
            String strB = nrb.b(i);
            int i2 = this.h;
            String strC = nrc.c(i2);
            if (i2 == 0) {
                throw null;
            }
            ((qtf) qbxVar.e.io()).b(1L, strB, str, strC, this.f, this.g.name());
        }
    }

    public final void d(int i, int i2) {
        String str;
        String str2;
        if (this.d) {
            qbx qbxVar = this.e;
            if (i != 1) {
                str = i != 2 ? "REDIRECT_TO_NATIVE" : "NOT_ONBOARDED";
            } else {
                str = "ONBOARDED";
            }
            if (i2 != 1) {
                str2 = i2 != 2 ? "CLOSED_BY_ERROR" : "CLOSED_BY_USER";
            } else {
                str2 = "CLOSED_BY_WEB_APP";
            }
            int i3 = this.h;
            String strC = nrc.c(i3);
            if (i3 == 0) {
                throw null;
            }
            ((qtf) qbxVar.d.io()).b(1L, str, str2, strC, this.f, this.g.name());
            this.j = true;
        }
    }

    @Override // defpackage.qe, android.app.Activity
    public final void onBackPressed() {
        if (this.b) {
            finishAffinity();
        }
        super.onBackPressed();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:81:0x014d  */
    /* JADX WARN: Code duplicated, block: B:82:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0151  */
    /* JADX WARN: Code duplicated, block: B:84:0x0153  */
    /* JADX WARN: Code duplicated, block: B:85:0x0155  */
    /* JADX WARN: Code duplicated, block: B:88:0x016a  */
    /* JADX WARN: Code duplicated, block: B:91:0x017a  */
    /* JADX WARN: Code duplicated, block: B:93:0x018b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0191  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.qbu, defpackage.cf, defpackage.qe, defpackage.ee, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        Serializable serializable;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        boolean zEquals = Objects.equals(extras.getString("theme"), "dark");
        setTheme(zEquals ? R.style.ParentToolsTheme_Dark : R.style.ParentToolsTheme);
        super.onCreate(bundle);
        this.b = extras.getBoolean("is_blocking_modular_onboarding_flow", false);
        this.c = extras.getByteArray("host_client_data");
        String string = extras.getString("client_name");
        int i3 = 4;
        switch (string.hashCode()) {
            case -2142676268:
                if (string.equals("HOST_CLIENT_NAME_ANDROID_KIDS")) {
                    i = 2;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar = new zf(getWindow(), getWindow().getDecorView());
                    boolean z = !zEquals;
                    zfVar.d(z);
                    zfVar.c(z);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar = new qcf();
                    qcfVar.setArguments(extras);
                    av avVar = new av(getSupportFragmentManager());
                    avVar.g(R.id.content_fragment, qcfVar, null, 1);
                    avVar.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case -1844611154:
                if (string.equals("HOST_CLIENT_NAME_FAMILY_LINK_ANDROID")) {
                    i = 7;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar2 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z2 = !zEquals;
                    zfVar2.d(z2);
                    zfVar2.c(z2);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar2 = new qcf();
                    qcfVar2.setArguments(extras);
                    av avVar2 = new av(getSupportFragmentManager());
                    avVar2.g(R.id.content_fragment, qcfVar2, null, 1);
                    avVar2.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case -1653741425:
                if (string.equals("HOST_CLIENT_NAME_WEB_KIDS")) {
                    i = 9;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar3 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z3 = !zEquals;
                    zfVar3.d(z3);
                    zfVar3.c(z3);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar3 = new qcf();
                    qcfVar3.setArguments(extras);
                    av avVar3 = new av(getSupportFragmentManager());
                    avVar3.g(R.id.content_fragment, qcfVar3, null, 1);
                    avVar3.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case -1634669761:
                if (string.equals("HOST_CLIENT_NAME_GOOGLE_ASSISTANT_ANDROID")) {
                    i = 20;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar4 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z4 = !zEquals;
                    zfVar4.d(z4);
                    zfVar4.c(z4);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar4 = new qcf();
                    qcfVar4.setArguments(extras);
                    av avVar4 = new av(getSupportFragmentManager());
                    avVar4.g(R.id.content_fragment, qcfVar4, null, 1);
                    avVar4.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case -1479166400:
                if (string.equals("HOST_CLIENT_NAME_MAIN_ANDROID")) {
                    i = 4;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar5 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z5 = !zEquals;
                    zfVar5.d(z5);
                    zfVar5.c(z5);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar5 = new qcf();
                    qcfVar5.setArguments(extras);
                    av avVar5 = new av(getSupportFragmentManager());
                    avVar5.g(R.id.content_fragment, qcfVar5, null, 1);
                    avVar5.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case -1285787309:
                if (string.equals("HOST_CLIENT_NAME_UNKNOWN")) {
                    i = 1;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar6 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z6 = !zEquals;
                    zfVar6.d(z6);
                    zfVar6.c(z6);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar6 = new qcf();
                    qcfVar6.setArguments(extras);
                    av avVar6 = new av(getSupportFragmentManager());
                    avVar6.g(R.id.content_fragment, qcfVar6, null, 1);
                    avVar6.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case -971722658:
                if (string.equals("HOST_CLIENT_NAME_MAIN_IOS")) {
                    i = 5;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar7 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z7 = !zEquals;
                    zfVar7.d(z7);
                    zfVar7.c(z7);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar7 = new qcf();
                    qcfVar7.setArguments(extras);
                    av avVar7 = new av(getSupportFragmentManager());
                    avVar7.g(R.id.content_fragment, qcfVar7, null, 1);
                    avVar7.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case -971709531:
                if (string.equals("HOST_CLIENT_NAME_MAIN_WEB")) {
                    i = 3;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar8 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z8 = !zEquals;
                    zfVar8.d(z8);
                    zfVar8.c(z8);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar8 = new qcf();
                    qcfVar8.setArguments(extras);
                    av avVar8 = new av(getSupportFragmentManager());
                    avVar8.g(R.id.content_fragment, qcfVar8, null, 1);
                    avVar8.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case -632325618:
                if (string.equals("HOST_CLIENT_NAME_LIVING_ROOM_KIDS_SECONDARY_DEVICE")) {
                    i = 18;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar9 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z9 = !zEquals;
                    zfVar9.d(z9);
                    zfVar9.c(z9);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar9 = new qcf();
                    qcfVar9.setArguments(extras);
                    av avVar9 = new av(getSupportFragmentManager());
                    avVar9.g(R.id.content_fragment, qcfVar9, null, 1);
                    avVar9.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case -361218851:
                if (string.equals("HOST_CLIENT_NAME_GOOGLE_ASSISTANT_IOS")) {
                    i = 21;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar10 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z10 = !zEquals;
                    zfVar10.d(z10);
                    zfVar10.c(z10);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar10 = new qcf();
                    qcfVar10.setArguments(extras);
                    av avVar10 = new av(getSupportFragmentManager());
                    avVar10.g(R.id.content_fragment, qcfVar10, null, 1);
                    avVar10.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case -361205724:
                if (string.equals("HOST_CLIENT_NAME_GOOGLE_ASSISTANT_WEB")) {
                    i = 19;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar11 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z11 = !zEquals;
                    zfVar11.d(z11);
                    zfVar11.c(z11);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar11 = new qcf();
                    qcfVar11.setArguments(extras);
                    av avVar11 = new av(getSupportFragmentManager());
                    avVar11.g(R.id.content_fragment, qcfVar11, null, 1);
                    avVar11.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case 488515446:
                if (string.equals("HOST_CLIENT_NAME_IOS_KIDS")) {
                    i = 17;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar12 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z12 = !zEquals;
                    zfVar12.d(z12);
                    zfVar12.c(z12);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar12 = new qcf();
                    qcfVar12.setArguments(extras);
                    av avVar12 = new av(getSupportFragmentManager());
                    avVar12.g(R.id.content_fragment, qcfVar12, null, 1);
                    avVar12.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case 554584476:
                if (string.equals("HOST_CLIENT_NAME_MUSIC_IOS")) {
                    i = 12;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar13 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z13 = !zEquals;
                    zfVar13.d(z13);
                    zfVar13.c(z13);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar13 = new qcf();
                    qcfVar13.setArguments(extras);
                    av avVar13 = new av(getSupportFragmentManager());
                    avVar13.g(R.id.content_fragment, qcfVar13, null, 1);
                    avVar13.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case 554597603:
                if (string.equals("HOST_CLIENT_NAME_MUSIC_WEB")) {
                    i = 10;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar14 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z14 = !zEquals;
                    zfVar14.d(z14);
                    zfVar14.c(z14);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar14 = new qcf();
                    qcfVar14.setArguments(extras);
                    av avVar14 = new av(getSupportFragmentManager());
                    avVar14.g(R.id.content_fragment, qcfVar14, null, 1);
                    avVar14.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case 599811261:
                if (string.equals("HOST_CLIENT_NAME_GOOGLE_HOME_ELVIS_WEB")) {
                    i = 16;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar15 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z15 = !zEquals;
                    zfVar15.d(z15);
                    zfVar15.c(z15);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar15 = new qcf();
                    qcfVar15.setArguments(extras);
                    av avVar15 = new av(getSupportFragmentManager());
                    avVar15.g(R.id.content_fragment, qcfVar15, null, 1);
                    avVar15.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case 967545909:
                if (string.equals("HOST_CLIENT_NAME_ANDROID_DEVICE_SETUP_WEBVIEW")) {
                    i = 22;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar16 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z16 = !zEquals;
                    zfVar16.d(z16);
                    zfVar16.c(z16);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar16 = new qcf();
                    qcfVar16.setArguments(extras);
                    av avVar16 = new av(getSupportFragmentManager());
                    avVar16.g(R.id.content_fragment, qcfVar16, null, 1);
                    avVar16.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case 1228932830:
                if (string.equals("HOST_CLIENT_NAME_GOOGLE_HOME_ANDROID")) {
                    i = 14;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar17 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z17 = !zEquals;
                    zfVar17.d(z17);
                    zfVar17.c(z17);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar17 = new qcf();
                    qcfVar17.setArguments(extras);
                    av avVar17 = new av(getSupportFragmentManager());
                    avVar17.g(R.id.content_fragment, qcfVar17, null, 1);
                    avVar17.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case 1304723582:
                if (string.equals("HOST_CLIENT_NAME_MUSIC_ANDROID")) {
                    i = 11;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar18 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z18 = !zEquals;
                    zfVar18.d(z18);
                    zfVar18.c(z18);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar18 = new qcf();
                    qcfVar18.setArguments(extras);
                    av avVar18 = new av(getSupportFragmentManager());
                    avVar18.g(R.id.content_fragment, qcfVar18, null, 1);
                    avVar18.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case 1364351180:
                if (string.equals("HOST_CLIENT_NAME_FAMILY_LINK_IOS")) {
                    i = 8;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar19 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z19 = !zEquals;
                    zfVar19.d(z19);
                    zfVar19.c(z19);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar19 = new qcf();
                    qcfVar19.setArguments(extras);
                    av avVar19 = new av(getSupportFragmentManager());
                    avVar19.g(R.id.content_fragment, qcfVar19, null, 1);
                    avVar19.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case 1364364307:
                if (string.equals("HOST_CLIENT_NAME_FAMILY_LINK_WEB")) {
                    i = 6;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar110 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z110 = !zEquals;
                    zfVar110.d(z110);
                    zfVar110.c(z110);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar110 = new qcf();
                    qcfVar110.setArguments(extras);
                    av avVar110 = new av(getSupportFragmentManager());
                    avVar110.g(R.id.content_fragment, qcfVar110, null, 1);
                    avVar110.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case 1493958652:
                if (string.equals("HOST_CLIENT_NAME_GOOGLE_HOME_IOS")) {
                    i = 15;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar111 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z111 = !zEquals;
                    zfVar111.d(z111);
                    zfVar111.c(z111);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar111 = new qcf();
                    qcfVar111.setArguments(extras);
                    av avVar111 = new av(getSupportFragmentManager());
                    avVar111.g(R.id.content_fragment, qcfVar111, null, 1);
                    avVar111.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            case 1493971779:
                if (string.equals("HOST_CLIENT_NAME_GOOGLE_HOME_WEB")) {
                    i = 13;
                    i2 = i - 1;
                    if (i2 != 1) {
                        i3 = 3;
                    } else if (i2 != 3) {
                        if (i2 != 6) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.h = i3;
                    this.f = extras.getString("client_version");
                    serializable = extras.getSerializable("parent_tools_use_case");
                    if (serializable instanceof qby) {
                        this.g = (qby) serializable;
                    }
                    this.d = extras.getBoolean("is_logging_enabled", false);
                    if (this.h != 3) {
                        setRequestedOrientation((getApplicationContext().getResources().getBoolean(R.bool.is_tablet) || Build.VERSION.SDK_INT < 31) ? 1 : 10);
                    }
                    setContentView(R.layout.parent_tools_activity);
                    zf zfVar112 = new zf(getWindow(), getWindow().getDecorView());
                    boolean z112 = !zEquals;
                    zfVar112.d(z112);
                    zfVar112.c(z112);
                    this.e = new qbx(this.i, new qta(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
                    overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
                    qcf qcfVar112 = new qcf();
                    qcfVar112.setArguments(extras);
                    av avVar112 = new av(getSupportFragmentManager());
                    avVar112.g(R.id.content_fragment, qcfVar112, null, 1);
                    avVar112.a(false, true);
                    return;
                }
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // defpackage.cf, android.app.Activity
    protected final void onPause() {
        if (!this.j) {
            d(2, 2);
        }
        super.onPause();
    }

    @Override // defpackage.cf, android.app.Activity
    protected final void onResume() {
        this.j = false;
        if (this.d) {
            qbx qbxVar = this.e;
            int i = this.h;
            String strC = nrc.c(i);
            if (i == 0) {
                throw null;
            }
            ((qtf) qbxVar.b.io()).b(1L, strC, this.f, this.g.name());
        }
        super.onResume();
    }
}
