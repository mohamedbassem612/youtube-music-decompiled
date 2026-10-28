package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ikt extends ArrayAdapter {
    public static final /* synthetic */ int a = 0;
    private final Context b;
    private final aduv c;
    private final float d;

    public ikt(Context context, Context context2, ikr[] ikrVarArr, aduv aduvVar) {
        super(context, R.layout.playlist_voting_item, ikrVarArr);
        this.b = context2;
        this.c = aduvVar;
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
        this.d = typedValue.getFloat();
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.b).inflate(R.layout.playlist_voting_dropdown_item, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(R.id.voting_title);
        ikr ikrVar = (ikr) getItem(i);
        if (ikrVar != null) {
            textView.setText(ikrVar.b(getContext()));
            ((TextView) view.findViewById(R.id.voting_detail)).setText(ikrVar.a(getContext()));
            if (ikrVar.c()) {
                view.setAlpha(this.d);
                view.setOnClickListener(new iks(0));
            }
        }
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.playlist_voting_item, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(R.id.voting_title);
        ikr ikrVar = (ikr) getItem(i);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(this.c.a(aliz.OUTLINE_ARROW_SOLID_UP), 0, 0, 0);
        if (ikrVar != null) {
            textView.setText(ikrVar.b(getContext()));
        }
        return view;
    }
}
