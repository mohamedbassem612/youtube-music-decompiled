package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adoi extends ArrayAdapter implements SpinnerAdapter {
    public int a;
    private LayoutInflater b;

    public adoi(Context context, List list) {
        super(context, R.layout.report_form_suboption, list);
        for (int i = 0; i < list.size(); i++) {
            aokc aokcVar = ((aoka) list.get(i)).c;
            if ((aokcVar == null ? aokc.a : aokcVar).f) {
                this.a = i;
                return;
            }
        }
    }

    public final View a(int i, View view, ViewGroup viewGroup, int i2, int i3) {
        adoh adohVar;
        TextView textView;
        alay alayVar;
        if (view == null) {
            LayoutInflater layoutInflaterFrom = this.b;
            if (layoutInflaterFrom == null) {
                layoutInflaterFrom = LayoutInflater.from(getContext());
                this.b = layoutInflaterFrom;
            }
            view = layoutInflaterFrom.inflate(i2, viewGroup, false);
        }
        aoka aokaVar = (aoka) getItem(i);
        if (view.getTag() instanceof adoh) {
            adohVar = (adoh) view.getTag();
        } else {
            adohVar = new adoh(view, i3);
            view.setTag(adohVar);
        }
        if (aokaVar != null) {
            aokc aokcVar = aokaVar.c;
            if (aokcVar == null) {
                aokcVar = aokc.a;
            }
            boolean zIsEnabled = isEnabled(i);
            if (aokcVar != null && (textView = adohVar.a) != null) {
                if ((aokcVar.b & 1) != 0) {
                    alayVar = aokcVar.c;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                } else {
                    alayVar = null;
                }
                textView.setText(ackj.k(null, alayVar, null, false));
                textView.setEnabled(zIsEnabled);
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final aokc b(int i) {
        aokc aokcVar;
        aoka aokaVar = (aoka) getItem(i);
        if (aokaVar == null) {
            aokcVar = null;
        } else {
            aokcVar = aokaVar.c;
            if (aokcVar == null) {
                aokcVar = aokc.a;
            }
        }
        if (aokcVar == null || aokcVar.f) {
            return null;
        }
        return aokcVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.report_form_suboption, R.id.report_form_sub_option_text);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.report_form_suboption_selected, R.id.report_form_sub_option_selected_text);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return b(i) != null;
    }
}
