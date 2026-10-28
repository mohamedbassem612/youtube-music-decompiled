package com.google.android.libraries.youtube.creation.geo;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.qcb;
import defpackage.tuk;
import defpackage.uit;
import defpackage.vce;
import defpackage.vcf;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class LocationSearchView extends LinearLayout implements TextWatcher {
    public final EditText a;
    public final RecyclerView b;
    public final TextView c;
    public final vcf d;
    public vce e;
    private final ImageButton f;
    private final ImageButton g;

    public LocationSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflaterFrom.inflate(R.layout.metadataeditor_location_search_view, this);
        ImageButton imageButton = (ImageButton) findViewById(R.id.back_to_basic_settings_button);
        this.f = imageButton;
        EditText editText = (EditText) findViewById(R.id.autocomplete_text);
        this.a = editText;
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.reset_autocomplete_button);
        this.g = imageButton2;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.autocomplete_results);
        this.b = recyclerView;
        this.c = (TextView) findViewById(R.id.autocomplete_no_results_text);
        vcf vcfVar = new vcf(layoutInflaterFrom, new qcb(this, null));
        this.d = vcfVar;
        recyclerView.ad(vcfVar);
        recyclerView.ah(new LinearLayoutManager(context));
        imageButton.setOnClickListener(new uit(this, 15));
        editText.addTextChangedListener(this);
        imageButton2.setOnClickListener(new uit(this, 16));
    }

    public final void a(boolean z) {
        EditText editText = this.a;
        if (editText != null) {
            boolean z2 = !z;
            editText.setCursorVisible(z2);
            editText.setFocusable(z2);
            editText.setFocusableInTouchMode(z2);
            if (z) {
                tuk.i(editText);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        vce vceVar = this.e;
        if (vceVar != null) {
            vceVar.d.filter(editable);
        }
        int length = editable.length();
        ImageButton imageButton = this.g;
        if (length == 0) {
            imageButton.setVisibility(8);
        } else {
            imageButton.setVisibility(0);
        }
    }

    public final void b(List list) {
        vcf vcfVar = this.d;
        vcfVar.a = list;
        vcfVar.jW();
        this.b.setVisibility(0);
        this.c.setVisibility(8);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
