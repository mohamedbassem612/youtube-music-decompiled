package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fx extends cf implements fy {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private ga mDelegate;
    private Resources mResources;

    public fx() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().b(DELEGATE_TAG, new cn(this, 2));
        addOnContextAvailableListener(new fw(this, 0));
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.qe, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().i(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().b(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        fl supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.q()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.ee, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        fl supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.u(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i) {
        return getDelegate().h(i);
    }

    public ga getDelegate() {
        if (this.mDelegate == null) {
            int i = ga.b;
            this.mDelegate = new gp(this, null, this, this);
        }
        return this.mDelegate;
    }

    public fm getDrawerToggleDelegate() {
        return getDelegate().e();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().g();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public fl getSupportActionBar() {
        return getDelegate().d();
    }

    public Intent getSupportParentActivityIntent() {
        return api.d(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().k();
    }

    @Override // defpackage.qe, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().C();
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(avf avfVar) {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = api.d(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(avfVar.b.getPackageManager());
            }
            avfVar.b(component);
            avfVar.a(supportParentActivityIntent);
        }
    }

    @Override // defpackage.cf, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().l();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.cf, defpackage.qe, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        fl supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.a() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // defpackage.qe, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().A();
    }

    @Override // defpackage.cf, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().m();
    }

    @Override // defpackage.cf, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().n();
    }

    @Override // defpackage.cf, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().o();
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            avf avfVar = new avf(this);
            onCreateSupportNavigateUpTaskStack(avfVar);
            onPrepareSupportNavigateUpTaskStack(avfVar);
            ArrayList arrayList = avfVar.a;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            avfVar.b.startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
        }
        return true;
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().w(charSequence);
    }

    @Override // defpackage.fy
    public hv onWindowStartingSupportActionMode(hu huVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        fl supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.v()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // defpackage.qe, android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().q(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().u(toolbar);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().v(i);
    }

    public hv startSupportActionMode(hu huVar) {
        return getDelegate().f(huVar);
    }

    @Override // defpackage.cf
    public void supportInvalidateOptionsMenu() {
        getDelegate().k();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().y(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    public fx(int i) {
        super(i);
        initDelegate();
    }

    @Override // defpackage.qe, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().r(view);
    }

    @Override // defpackage.qe, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().s(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    protected void onLocalesChanged(awq awqVar) {
    }

    protected void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(avf avfVar) {
    }

    @Override // defpackage.fy
    public void onSupportActionModeFinished(hv hvVar) {
    }

    @Override // defpackage.fy
    public void onSupportActionModeStarted(hv hvVar) {
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }
}
