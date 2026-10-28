package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.preference.PreferenceCompatActivity$PreferenceScreenFragmentCompat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class izy extends sxp implements cx, dkv, dkw {
    private dd a;
    public jab b;
    private qr c;

    private final void h(cc ccVar, String str, CharSequence charSequence) {
        jab jabVar = this.b;
        if (str == null) {
            str = "";
        }
        if (charSequence == null) {
            charSequence = "";
        }
        jabVar.b(ccVar, str, charSequence);
    }

    private final void i(String str, CharSequence charSequence, Bundle bundle) {
        cc ccVarInstantiate = null;
        if (str != null && r(str)) {
            ccVarInstantiate = cc.instantiate(this, str, null);
        }
        if (ccVarInstantiate != null && bundle != null) {
            ccVarInstantiate.setArguments(bundle);
        }
        if (ccVarInstantiate != null) {
            h(ccVarInstantiate, str, charSequence);
        }
    }

    @Override // defpackage.cx
    public final void c() {
        int iB = this.a.b();
        if (iB > 0) {
            av avVarAg = this.a.ag(iB - 1);
            if (getSupportActionBar() != null) {
                if (TextUtils.isEmpty(avVarAg.b())) {
                    getSupportActionBar().n(getTitle());
                } else {
                    getSupportActionBar().n(avVarAg.b());
                }
            }
        }
    }

    @Override // defpackage.dkv
    public final void f(Preference preference) {
        i(preference.v, preference.q, preference.s());
    }

    @Override // defpackage.dkw
    public final void g(PreferenceScreen preferenceScreen) {
        h(PreferenceCompatActivity$PreferenceScreenFragmentCompat.newInstance(preferenceScreen), preferenceScreen.t, preferenceScreen.q);
    }

    @Override // defpackage.cf, defpackage.qe, defpackage.ee, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u();
    }

    @Override // defpackage.fx, defpackage.cf, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.a.P(this);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        t();
        return true;
    }

    protected abstract boolean r(String str);

    public final void t() {
        if (this.a.b() <= 1) {
            finish();
            return;
        }
        qr qrVar = this.c;
        qrVar.getClass();
        qrVar.g(false);
        getOnBackPressedDispatcher().d();
        this.c.g(true);
    }

    protected final void u() {
        setContentView(this.b.a());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.getClass();
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().h(true);
            getSupportActionBar().y();
        }
        this.c = new izx(this);
        getOnBackPressedDispatcher().c(this, this.c);
        dd supportFragmentManager = getSupportFragmentManager();
        this.a = supportFragmentManager;
        supportFragmentManager.n(this);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra(":android:show_fragment");
            int intExtra = getIntent().getIntExtra(":android:show_fragment_title", -1);
            i(stringExtra, intExtra != -1 ? getText(intExtra) : null, null);
        }
    }

    @Override // defpackage.cx
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.cx
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.cx
    public final /* synthetic */ void hz() {
    }

    @Override // defpackage.cx
    public final /* synthetic */ void b(cc ccVar, boolean z) {
    }
}
