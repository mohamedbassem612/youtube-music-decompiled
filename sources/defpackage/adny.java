package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.InputFilter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adny extends gr {
    public final amkl a;
    public ImageButton b;
    public TextInputLayout c;
    public EditText d;
    public Spinner e;
    public Spinner f;
    public EditText g;
    public final adnz h;
    private final agev i;

    public adny(Context context, tza tzaVar, amkl amklVar, agev agevVar, adnz adnzVar) {
        super(context, tzaVar.a);
        this.a = amklVar;
        this.i = agevVar;
        this.h = adnzVar;
        setContentView(R.layout.legal_report_form);
    }

    public final void a() {
        String string = this.d.getText().toString();
        akoa akoaVar = (akoa) this.e.getSelectedItem();
        akoa akoaVar2 = (akoa) this.f.getSelectedItem();
        adnz adnzVar = this.h;
        adnzVar.d.d(adnzVar.a, this, string, akoaVar, akoaVar2, false);
    }

    @Override // defpackage.gr, defpackage.qg, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        alay alayVar4;
        super.onCreate(bundle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Drawable drawable = getContext().getDrawable(R.drawable.quantum_ic_close_white_24);
        ttk.a(drawable, tzk.i(getContext(), R.attr.ytBrandIconInactive), PorterDuff.Mode.SRC_IN);
        toolbar.r(drawable);
        toolbar.s(new yde(this, 15));
        amkl amklVar = this.a;
        if ((amklVar.b & 1) != 0) {
            alayVar = amklVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        toolbar.v(ackj.k(null, alayVar, null, false));
        toolbar.o(R.string.cancel);
        ImageButton imageButton = (ImageButton) findViewById(R.id.send_report);
        this.b = imageButton;
        imageButton.setOnClickListener(new yde(this, 16));
        ImageButton imageButton2 = this.b;
        ajng ajngVar = amklVar.n;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        ajnf ajnfVar = ajngVar.c;
        if (ajnfVar == null) {
            ajnfVar = ajnf.a;
        }
        if ((ajnfVar.b & 64) != 0) {
            ajng ajngVar2 = amklVar.n;
            if (ajngVar2 == null) {
                ajngVar2 = ajng.a;
            }
            ajnf ajnfVar2 = ajngVar2.c;
            if (ajnfVar2 == null) {
                ajnfVar2 = ajnf.a;
            }
            alayVar2 = ajnfVar2.m;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        imageButton2.setContentDescription(ackj.k(null, alayVar2, null, false));
        YouTubeTextView youTubeTextView = (YouTubeTextView) findViewById(R.id.description_hint);
        if ((amklVar.b & 32) != 0) {
            alayVar3 = amklVar.g;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
        } else {
            alayVar3 = null;
        }
        youTubeTextView.setText(ackj.k(null, alayVar3, null, false));
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.description_container);
        this.c = textInputLayout;
        textInputLayout.t(false);
        EditText editText = (EditText) findViewById(R.id.description);
        this.d = editText;
        if ((amklVar.b & 32) != 0) {
            alayVar4 = amklVar.g;
            if (alayVar4 == null) {
                alayVar4 = alay.a;
            }
        } else {
            alayVar4 = null;
        }
        editText.setContentDescription(ackj.k(null, alayVar4, null, false));
        this.d.addTextChangedListener(new gxv(this, 12));
        if (amklVar.f > 0) {
            this.c.k(true);
            this.c.l(amklVar.f);
            this.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(amklVar.f)});
        }
        adnw adnwVar = new adnw(this);
        this.e = (Spinner) findViewById(R.id.issue_type);
        if ((amklVar.b & SemanticState.Hidden) != 0) {
            Spinner spinner = this.e;
            Context context = getContext();
            apji apjiVar = amklVar.j;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVar = akog.a;
            spinner.setAdapter((SpinnerAdapter) new adnv(context, (akob) aavv.s(apjiVar, aihlVar)));
            this.e.setOnTouchListener(adnwVar);
            Spinner spinner2 = this.e;
            apji apjiVar2 = amklVar.j;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            spinner2.setOnItemSelectedListener(new adnx(this, spinner2, ((akob) aavv.s(apjiVar2, aihlVar)).d));
            this.e.setVisibility(0);
        }
        this.f = (Spinner) findViewById(R.id.affiliation);
        if ((amklVar.b & SemanticState.LiveRegion) != 0) {
            Spinner spinner3 = this.f;
            Context context2 = getContext();
            apji apjiVar3 = amklVar.k;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aihl aihlVar2 = akog.a;
            spinner3.setAdapter((SpinnerAdapter) new adnv(context2, (akob) aavv.s(apjiVar3, aihlVar2)));
            this.f.setOnTouchListener(adnwVar);
            Spinner spinner4 = this.f;
            apji apjiVar4 = amklVar.k;
            if (apjiVar4 == null) {
                apjiVar4 = apji.a;
            }
            spinner4.setOnItemSelectedListener(new adnx(this, spinner4, ((akob) aavv.s(apjiVar4, aihlVar2)).d));
            this.f.setVisibility(0);
        }
        this.g = (EditText) findViewById(R.id.name);
        if ((amklVar.b & SemanticState.Modal) != 0) {
            EditText editText2 = this.g;
            alay alayVar5 = amklVar.l;
            if (alayVar5 == null) {
                alayVar5 = alay.a;
            }
            editText2.setContentDescription(ackj.k(null, alayVar5, null, false));
            TextInputLayout textInputLayout2 = (TextInputLayout) findViewById(R.id.name_container);
            textInputLayout2.t(true);
            textInputLayout2.r = true;
            alay alayVar6 = amklVar.l;
            if (alayVar6 == null) {
                alayVar6 = alay.a;
            }
            textInputLayout2.s(ackj.k(null, alayVar6, null, false));
            textInputLayout2.setVisibility(0);
        }
        TextView textView = (TextView) findViewById(R.id.name_subtext);
        alay alayVar7 = amklVar.m;
        if (alayVar7 == null) {
            alayVar7 = alay.a;
        }
        tuk.u(textView, ackj.k(null, alayVar7, null, false));
        TextView textView2 = (TextView) findViewById(R.id.required);
        alay alayVar8 = amklVar.i;
        if (alayVar8 == null) {
            alayVar8 = alay.a;
        }
        tuk.u(textView2, ackj.k(null, alayVar8, null, false));
        TextView textView3 = (TextView) findViewById(R.id.footer);
        alay alayVar9 = amklVar.h;
        if (alayVar9 == null) {
            alayVar9 = alay.a;
        }
        tuk.u(textView3, ackj.k(null, alayVar9, null, false));
    }
}
