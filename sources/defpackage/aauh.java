package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class aauh extends ArrayAdapter {
    public aauh(Context context) {
        super(context, 0);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        aame aameVar = (aame) getItem(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (view == null) {
            view = layoutInflaterFrom.inflate(R.layout.offline_stream_quality_option, viewGroup, false);
        }
        aazo aazoVar = (aazo) view.getTag();
        if (aazoVar == null) {
            aazoVar = new aazo(view);
            view.setTag(aazoVar);
        }
        if (aameVar == null) {
            ((TextView) aazoVar.a).setVisibility(8);
        } else {
            ((TextView) aazoVar.b).setText(aameVar.b);
            Spanned spanned = aameVar.c;
            if (spanned != null) {
                TextView textView = (TextView) aazoVar.a;
                textView.setText(spanned);
                textView.setVisibility(0);
            } else {
                ((TextView) aazoVar.a).setVisibility(8);
            }
        }
        return view;
    }
}
