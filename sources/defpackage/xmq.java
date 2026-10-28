package defpackage;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xmq extends fx {
    public int a;
    private boolean b = true;
    private Bundle c;

    protected abstract int a();

    protected abstract cc b(int i);

    final void c() {
        if (this.b) {
            dd supportFragmentManager = getSupportFragmentManager();
            cc ccVarF = supportFragmentManager.f(R.id.content);
            int i = this.a;
            if (e(i, ccVarF)) {
                return;
            }
            cc ccVarB = b(i);
            Bundle arguments = ccVarB.getArguments();
            Bundle bundle = this.c;
            if (arguments != null) {
                if (bundle != null) {
                    arguments.putAll(bundle);
                }
                ccVarB.setArguments(arguments);
            } else {
                ccVarB.setArguments(bundle);
            }
            av avVar = new av(supportFragmentManager);
            avVar.q(R.id.content, ccVarB, null);
            avVar.a(false, true);
            d(this.a, this);
        }
    }

    protected abstract boolean e(int i, cc ccVar);

    protected abstract boolean f(int i);

    @Override // defpackage.cf, defpackage.qe, defpackage.ee, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("currentIndex");
            this.c = bundle.getBundle("currentData");
        } else {
            this.a = a();
            this.c = null;
        }
        getOnBackPressedDispatcher().c(this, new xmp(this));
        c();
    }

    @Override // defpackage.qe, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.a = intent.getIntExtra("com.google.android.libraries.youtube.mdx.common.newIndex", -1);
        this.c = (Bundle) intent.getParcelableExtra("com.google.android.libraries.youtube.mdx.common.data");
        c();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getOnBackPressedDispatcher().d();
        return true;
    }

    @Override // defpackage.qe, defpackage.ee, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("currentIndex", this.a);
        bundle.putBundle("currentData", this.c);
    }

    @Override // defpackage.fx, defpackage.cf, android.app.Activity
    protected final void onStart() {
        super.onStart();
        this.b = true;
        c();
    }

    @Override // defpackage.fx, defpackage.cf, android.app.Activity
    protected final void onStop() {
        super.onStop();
        this.b = false;
    }

    protected void d(int i, Activity activity) {
    }
}
