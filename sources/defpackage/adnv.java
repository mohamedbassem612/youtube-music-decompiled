package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class adnv extends ArrayAdapter {
    private final LayoutInflater a;

    public adnv(Context context, akob akobVar) {
        akoa akoaVar;
        super(context, R.layout.legal_report_form_option_selected);
        this.a = LayoutInflater.from(context);
        setDropDownViewResource(R.layout.legal_report_form_option);
        akoa akoaVar2 = akoa.a;
        aihf aihfVarCreateBuilder = akoaVar2.createBuilder();
        alay alayVarD = ackj.d((akobVar.b & 1) != 0 ? akobVar.d : null);
        aihfVarCreateBuilder.copyOnWrite();
        akoa akoaVar3 = (akoa) aihfVarCreateBuilder.instance;
        alayVarD.getClass();
        akoaVar3.e = alayVarD;
        akoaVar3.b |= 1;
        insert((akoa) aihfVarCreateBuilder.build(), 0);
        for (akny aknyVar : akobVar.c) {
            if ((aknyVar.b & 8) != 0) {
                akoaVar = aknyVar.c;
                if (akoaVar == null) {
                    akoaVar = akoaVar2;
                }
            } else {
                akoaVar = null;
            }
            add(akoaVar);
        }
    }

    private final TextView a(int i, View view, ViewGroup viewGroup, int i2) {
        alay alayVar;
        alay alayVar2;
        if (view == null) {
            view = this.a.inflate(i2, viewGroup, false);
        }
        akoa akoaVar = (akoa) super.getItem(i);
        TextView textView = (TextView) view;
        if (isEnabled(i)) {
            if ((akoaVar.b & 1) != 0) {
                alayVar2 = akoaVar.e;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            } else {
                alayVar2 = null;
            }
            textView.setText(ackj.k(null, alayVar2, null, false));
            textView.setHint((CharSequence) null);
        } else {
            if ((akoaVar.b & 1) != 0) {
                alayVar = akoaVar.e;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            textView.setHint(ackj.k(null, alayVar, null, false));
            textView.setText((CharSequence) null);
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.legal_report_form_option);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        if (i != 0) {
            return (akoa) super.getItem(i);
        }
        return null;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.legal_report_form_option_selected);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return i != 0;
    }
}
