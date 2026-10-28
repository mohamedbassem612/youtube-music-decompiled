package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adol extends ArrayAdapter implements ListAdapter {
    private LayoutInflater a;
    private aokc b;
    private final Map c;
    private final aedj d;

    public adol(Context context, aedj aedjVar) {
        super(context, R.layout.report_form_item);
        this.c = new HashMap();
        this.d = aedjVar;
    }

    public final aokc a() {
        adoi adoiVar;
        aokc aokcVar = this.b;
        return (aokcVar == null || (adoiVar = (adoi) this.c.get(aokcVar)) == null) ? this.b : adoiVar.b(adoiVar.a);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return true;
    }

    public final void b(aokc aokcVar) {
        aokc aokcVar2 = this.b;
        if (aokcVar == null) {
            if (aokcVar2 == null) {
                return;
            }
        } else if (aokcVar.equals(aokcVar2)) {
            return;
        }
        this.b = aokcVar;
        notifyDataSetChanged();
    }

    @Override // android.widget.ArrayAdapter
    public final void clear() {
        super.clear();
        this.b = null;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        adok adokVar;
        TextView textView;
        RadioButton radioButton;
        Spinner spinner;
        alay alayVar;
        if (view == null) {
            LayoutInflater layoutInflaterFrom = this.a;
            if (layoutInflaterFrom == null) {
                layoutInflaterFrom = LayoutInflater.from(getContext());
                this.a = layoutInflaterFrom;
            }
            view = layoutInflaterFrom.inflate(R.layout.report_form_item, viewGroup, false);
        }
        aoka aokaVar = (aoka) getItem(i);
        if (view.getTag() instanceof adok) {
            adokVar = (adok) view.getTag();
        } else {
            adokVar = new adok(this, view);
            view.setTag(adokVar);
            view.setOnClickListener(adokVar);
        }
        if (aokaVar != null) {
            aokc aokcVar = aokaVar.c;
            if (aokcVar == null) {
                aokcVar = aokc.a;
            }
            Map map = this.c;
            adoi adoiVar = (adoi) map.get(aokcVar);
            if (adoiVar == null && !map.containsKey(aokcVar)) {
                if (aokcVar.d.size() > 0) {
                    Spinner spinner2 = adokVar.b;
                    adoiVar = new adoi(spinner2 == null ? null : spinner2.getContext(), aokcVar.d);
                }
                map.put(aokcVar, adoiVar);
            }
            boolean zEquals = aokcVar.equals(this.b);
            if (aokcVar != null && (textView = adokVar.a) != null && (radioButton = adokVar.c) != null && (spinner = adokVar.b) != null) {
                if ((aokcVar.b & 1) != 0) {
                    alayVar = aokcVar.c;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                } else {
                    alayVar = null;
                }
                textView.setText(ackj.k(null, alayVar, null, false));
                radioButton.setTag(aokcVar);
                radioButton.setChecked(zEquals);
                boolean z = zEquals && adoiVar != null;
                spinner.setAdapter((SpinnerAdapter) adoiVar);
                int i2 = true != z ? 8 : 0;
                spinner.setVisibility(i2);
                adokVar.d.setVisibility(i2);
                if (z) {
                    spinner.setSelection(adoiVar.a);
                    spinner.setOnItemSelectedListener(new adoj(adokVar, adoiVar));
                }
            }
        }
        boolean z2 = this.d.a;
        if (z2) {
            RadioButton radioButton2 = (RadioButton) view.findViewById(R.id.report_form_top_level_radio);
            YouTubeTextView youTubeTextView = (YouTubeTextView) view.findViewById(R.id.report_form_top_level_text);
            if (z2) {
                radioButton2.getClass();
                radioButton2.setButtonDrawable(tzk.q(radioButton2.getContext()));
                youTubeTextView.getClass();
                youTubeTextView.setTextColor(tzk.i(youTubeTextView.getContext(), R.attr.ytTextPrimary));
            }
            int dimension = (int) getContext().getResources().getDimension(R.dimen.report_form_item_spacing_vertical);
            tym.h(radioButton2, new tye(new tyj(dimension, 2), new tyi(dimension, 1)), ViewGroup.MarginLayoutParams.class);
        }
        return view;
    }
}
