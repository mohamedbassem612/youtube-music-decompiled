package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adnx implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ adny a;
    private final Spinner b;
    private final String c;

    public adnx(adny adnyVar, Spinner spinner, String str) {
        this.a = adnyVar;
        this.b = spinner;
        this.c = str;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.a.a();
        Spinner spinner = this.b;
        akoa akoaVar = (akoa) spinner.getSelectedItem();
        String str = this.c;
        if (str == null || akoaVar == null || (akoaVar.b & SemanticState.Focused) == 0) {
            return;
        }
        aiqd aiqdVar = akoaVar.h;
        if (aiqdVar == null) {
            aiqdVar = aiqd.a;
        }
        spinner.setContentDescription(str + ' ' + aiqdVar.c);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        this.a.a();
    }
}
