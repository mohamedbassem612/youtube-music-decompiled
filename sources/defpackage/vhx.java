package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vhx implements TextWatcher {
    public final Context a;
    public final vhw b;
    public final vhz c;
    public final EditText d;
    private final ImageButton e;
    private final ImageButton f;
    private final RecyclerView g;
    private final TextView h;

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [awmd, java.lang.Object] */
    public vhx(Context context, aehs aehsVar, ViewGroup viewGroup, vhw vhwVar, xgn xgnVar, ajwo ajwoVar) {
        this.a = context;
        this.b = vhwVar;
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(R.id.back_to_basic_settings_button);
        this.e = imageButton;
        EditText editText = (EditText) viewGroup.findViewById(R.id.autocomplete_text);
        this.d = editText;
        ImageButton imageButton2 = (ImageButton) viewGroup.findViewById(R.id.reset_autocomplete_button);
        this.f = imageButton2;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.autocomplete_results);
        this.g = recyclerView;
        this.h = (TextView) viewGroup.findViewById(R.id.autocomplete_no_results_text);
        imageButton.setOnClickListener(new vhv(this, 0));
        editText.addTextChangedListener(this);
        imageButton2.setOnClickListener(new vhv(this, 2));
        Context context2 = (Context) aehsVar.e.io();
        context2.getClass();
        ahek ahekVar = (ahek) aehsVar.d.io();
        advb advbVar = (advb) aehsVar.g.io();
        advbVar.getClass();
        vxe vxeVar = (vxe) aehsVar.a.io();
        vxeVar.getClass();
        xeu xeuVar = (xeu) aehsVar.b.io();
        xeuVar.getClass();
        dov dovVar = (dov) aehsVar.h.io();
        dovVar.getClass();
        vxz vxzVar = (vxz) aehsVar.f.io();
        vxzVar.getClass();
        Handler handler = (Handler) aehsVar.c.io();
        handler.getClass();
        vxz vxzVar2 = (vxz) aehsVar.i.io();
        recyclerView.getClass();
        this.c = new vhz(context2, ahekVar, advbVar, vxeVar, xeuVar, dovVar, vxzVar, handler, vxzVar2, this, recyclerView, ajwoVar, xgnVar);
    }

    public final void a(boolean z) {
        if (!z) {
            this.g.setVisibility(0);
            this.h.setVisibility(8);
        } else {
            int length = this.d.getText().length();
            Context context = this.a;
            b(length > 0 ? context.getString(R.string.user_mention_search_view_no_results_message) : context.getString(R.string.user_mention_search_view_results_box_hint));
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        ImageButton imageButton = this.f;
        if (length == 0) {
            imageButton.setVisibility(8);
        } else {
            imageButton.setVisibility(0);
        }
        vhz vhzVar = this.c;
        String string = editable.toString();
        if (string.equals(vhzVar.g)) {
            return;
        }
        vhzVar.a();
        if (vhzVar.g == null && string.trim().isEmpty() && !vhzVar.j.m(5, 45617552L)) {
            return;
        }
        Handler handler = vhzVar.e;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new uqd(vhzVar, string, 5), 200L);
        vhzVar.b(6);
    }

    public final void b(CharSequence charSequence) {
        TextView textView = this.h;
        textView.setText(charSequence);
        this.g.setVisibility(8);
        textView.setVisibility(0);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
