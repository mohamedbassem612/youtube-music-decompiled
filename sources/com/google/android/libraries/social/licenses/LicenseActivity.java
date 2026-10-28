package com.google.android.libraries.social.licenses;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.ayx;
import defpackage.azs;
import defpackage.bac;
import defpackage.fl;
import defpackage.fx;
import defpackage.nqv;
import defpackage.qd;
import defpackage.qh;
import defpackage.qon;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class LicenseActivity extends fx {
    @Override // defpackage.cf, defpackage.qe, defpackage.ee, android.app.Activity
    public final void onCreate(Bundle bundle) {
        qh.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_activity_appcompat);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.license_toolbar);
        setSupportActionBar(toolbar);
        qon qonVar = (qon) getIntent().getParcelableExtra("license");
        if (getSupportActionBar() != null) {
            fl supportActionBar = getSupportActionBar();
            String str = qonVar.a;
            supportActionBar.n(str);
            ArrayList<View> arrayList = new ArrayList<>();
            toolbar.findViewsWithText(arrayList, str, 1);
            if (arrayList.size() == 1) {
                bac.q(arrayList.get(0), true);
            }
            getSupportActionBar().i(true);
            getSupportActionBar().h(true);
            getSupportActionBar().z();
        }
        View viewFindViewById = findViewById(R.id.license_activity_root);
        final ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        final int paddingLeft = toolbar.getPaddingLeft();
        final int paddingTop = toolbar.getPaddingTop();
        final int paddingRight = toolbar.getPaddingRight();
        final int paddingBottom = toolbar.getPaddingBottom();
        final int paddingLeft2 = scrollView.getPaddingLeft();
        final int paddingTop2 = scrollView.getPaddingTop();
        final int paddingRight2 = scrollView.getPaddingRight();
        final int paddingBottom2 = scrollView.getPaddingBottom();
        ayx ayxVar = new ayx() { // from class: qoo
            @Override // defpackage.ayx
            public final bbn a(View view, bbn bbnVar) {
                bbb bavVar;
                avw avwVarF = bbnVar.f(519);
                int i = avwVarF.b;
                int i2 = avwVarF.c;
                int i3 = avwVarF.d;
                int i4 = paddingRight;
                toolbar.setPadding(paddingLeft + i, paddingTop + i2, i4 + i3, paddingBottom);
                int i5 = avwVarF.e;
                int i6 = paddingBottom2;
                int i7 = paddingRight2;
                scrollView.setPadding(paddingLeft2 + i, paddingTop2, i7 + i3, i6 + i5);
                if (Build.VERSION.SDK_INT >= 36) {
                    bavVar = new bba(bbnVar);
                } else if (Build.VERSION.SDK_INT >= 35) {
                    bavVar = new baz(bbnVar);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    bavVar = new bay(bbnVar);
                } else if (Build.VERSION.SDK_INT >= 31) {
                    bavVar = new bax(bbnVar);
                } else if (Build.VERSION.SDK_INT >= 30) {
                    bavVar = new baw(bbnVar);
                } else {
                    bavVar = Build.VERSION.SDK_INT >= 29 ? new bav(bbnVar) : new bau(bbnVar);
                }
                bavVar.g(519, avw.d(i, 0, i3, i5));
                return bavVar.a();
            }
        };
        int i = bac.a;
        azs.c(viewFindViewById, ayxVar);
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        String strJ = nqv.j(this, "third_party_licenses", qonVar.b, qonVar.c);
        if (strJ == null) {
            finish();
        } else {
            textView.setText(strJ);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new qd(this, i, scrollView, 11));
        }
    }

    @Override // defpackage.qe, defpackage.ee, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        Layout layout = ((TextView) findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}
