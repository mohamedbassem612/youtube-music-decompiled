package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import defpackage.av;
import defpackage.azs;
import defpackage.bac;
import defpackage.dd;
import defpackage.fx;
import defpackage.qh;
import defpackage.qoq;
import defpackage.qos;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class LicenseMenuActivity extends fx {
    @Override // defpackage.cf, defpackage.qe, defpackage.ee, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        qh.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity_appcompat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.license_menu_toolbar);
        setSupportActionBar(toolbar);
        CharSequence title = getTitle();
        ArrayList<View> arrayList = new ArrayList<>();
        toolbar.findViewsWithText(arrayList, title, 1);
        if (arrayList.size() == 1) {
            bac.q(arrayList.get(0), true);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().h(true);
        }
        View viewFindViewById = findViewById(R.id.license_menu_activity_root);
        qoq qoqVar = new qoq(toolbar, toolbar.getPaddingLeft(), toolbar.getPaddingTop(), toolbar.getPaddingRight(), toolbar.getPaddingBottom(), 1);
        int i = bac.a;
        azs.c(viewFindViewById, qoqVar);
        dd supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.f(R.id.license_menu_fragment_container) instanceof qos) {
            return;
        }
        qos qosVar = new qos();
        av avVar = new av(supportFragmentManager);
        avVar.g(R.id.license_menu_fragment_container, qosVar, null, 1);
        avVar.e();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
