package defpackage;

import android.view.View;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adok implements View.OnClickListener {
    public final TextView a;
    public final Spinner b;
    public final RadioButton c;
    public final View d;
    final /* synthetic */ adol e;

    public adok(adol adolVar, View view) {
        this.e = adolVar;
        this.c = (RadioButton) view.findViewById(R.id.report_form_top_level_radio);
        this.a = (TextView) view.findViewById(R.id.report_form_top_level_text);
        this.b = (Spinner) view.findViewById(R.id.report_form_top_level_spinner);
        this.d = view.findViewById(R.id.report_form_top_level_separator);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RadioButton radioButton = this.c;
        radioButton.setChecked(!radioButton.isChecked());
        boolean zIsChecked = radioButton.isChecked();
        adol adolVar = this.e;
        if (zIsChecked) {
            adolVar.b((aokc) radioButton.getTag());
        } else {
            adolVar.b(null);
        }
    }
}
