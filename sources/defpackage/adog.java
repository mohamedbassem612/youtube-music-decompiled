package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adog extends LinearLayout {
    public final TextView a;
    public final ListView b;
    public final TextView c;
    public final View d;
    public final CompoundButton e;
    public final TextView f;

    public adog(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflaterFrom.inflate(R.layout.report_form, this);
        this.a = (TextView) findViewById(R.id.title);
        ListView listView = (ListView) findViewById(R.id.content);
        this.b = listView;
        View viewInflate = layoutInflaterFrom.inflate(R.layout.report_form_legal_section, (ViewGroup) listView, false);
        this.c = (TextView) viewInflate.findViewById(R.id.footer);
        this.d = viewInflate.findViewById(R.id.legal_checkbox_separator);
        this.e = (CompoundButton) viewInflate.findViewById(R.id.legal_checkbox);
        TextView textView = (TextView) viewInflate.findViewById(R.id.legal_description);
        this.f = textView;
        listView.addFooterView(viewInflate, null, false);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
