package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.parenttools.youtube.ParentToolsActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qbw {
    public Context a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public byte[] h;
    public boolean i;
    public qby j = qby.a;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;

    public final Intent a() {
        ahno.P(this.a != null, "Can't create an intent from a null context!");
        ahno.P(!TextUtils.isEmpty(this.b), "Client name is required");
        ahno.P(!TextUtils.isEmpty(this.c), "Client version is required");
        ahno.P(!TextUtils.isEmpty(this.d), "Parent account name is required");
        Intent intent = new Intent(this.a, (Class<?>) ParentToolsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.b);
        bundle.putString("client_version", this.c);
        bundle.putString("parent_account_name", this.d);
        bundle.putBoolean("is_blocking_modular_onboarding_flow", this.i);
        bundle.putString("tool_bar_title", null);
        bundle.putSerializable("parent_tools_use_case", this.j);
        bundle.putBoolean("is_logging_enabled", this.k);
        bundle.putBoolean("is_enhanced_web_view_loading_enabled", this.l);
        bundle.putBoolean("disable_webview_text_zoom", this.m);
        bundle.putBoolean("is_family_center_theme_support_enabled", this.n);
        if (!TextUtils.isEmpty(this.e)) {
            bundle.putString("theme", this.e);
        }
        if (!TextUtils.isEmpty(this.f)) {
            bundle.putString("parent_tools_url", this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            bundle.putString("end_url", this.g);
        }
        byte[] bArr = this.h;
        if (bArr != null) {
            bundle.putByteArray("host_client_data", bArr);
        }
        intent.putExtras(bundle);
        return intent;
    }
}
